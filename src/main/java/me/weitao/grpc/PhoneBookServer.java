package me.weitao.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class PhoneBookServer {

    private static final Logger logger = Logger.getLogger(PhoneBookServer.class.getName());

    private Server server;

    private void start() throws IOException {
        int port = 50051;
        server = ServerBuilder
                .forPort(port)
                .addService(new PhoneServiceImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                PhoneBookServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final PhoneBookServer server = new PhoneBookServer();
        server.start();
        server.blockUntilShutdown();
    }
}
