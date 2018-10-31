package me.weitao.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class PhoneBookClient {

    private static final Logger logger = Logger.getLogger(PhoneBookClient.class.getName());

    private final ManagedChannel channel;
    private final PhoneServiceGrpc.PhoneServiceBlockingStub blockingStub;

    public PhoneBookClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build());
    }

    PhoneBookClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = PhoneServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void addPhoneToUser(int userId, PhoneType phoneType, String phoneNubmer) {
        logger.info("Will try to add phone to user " + userId);
        AddPhoneToUserRequest request = AddPhoneToUserRequest.newBuilder().setUserId(userId).setPhoneType(phoneType)
                .setPhoneNumber(phoneNubmer).build();
        AddPhoneToUserResponse response;
        try {
            response = blockingStub.addPhoneToUser(request);
        } catch (StatusRuntimeException e) {
            //logger.info("RPC failed: {0} --> " + e.getLocalizedMessage(), e.getStatus());
            e.printStackTrace();
            return;
        }
        logger.info("Result: " + response.getResult());
    }

    public static void main(String[] args) throws Exception {
        PhoneBookClient client = new PhoneBookClient("localhost", 50051);
        try {
            client.addPhoneToUser(1, PhoneType.WORK, "13888888888");
        } finally {
            client.shutdown();
        }
    }
}
