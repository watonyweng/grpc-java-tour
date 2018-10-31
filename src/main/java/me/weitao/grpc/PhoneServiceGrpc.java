package me.weitao.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.16.1)",
        comments = "Source: phonebook.proto")
public final class PhoneServiceGrpc {

    private PhoneServiceGrpc() {
    }

    public static final String SERVICE_NAME = "PhoneService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<me.weitao.grpc.AddPhoneToUserRequest,
            me.weitao.grpc.AddPhoneToUserResponse> getAddPhoneToUserMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "addPhoneToUser",
            requestType = me.weitao.grpc.AddPhoneToUserRequest.class,
            responseType = me.weitao.grpc.AddPhoneToUserResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<me.weitao.grpc.AddPhoneToUserRequest,
            me.weitao.grpc.AddPhoneToUserResponse> getAddPhoneToUserMethod() {
        io.grpc.MethodDescriptor<me.weitao.grpc.AddPhoneToUserRequest, me.weitao.grpc.AddPhoneToUserResponse> getAddPhoneToUserMethod;
        if ((getAddPhoneToUserMethod = PhoneServiceGrpc.getAddPhoneToUserMethod) == null) {
            synchronized (PhoneServiceGrpc.class) {
                if ((getAddPhoneToUserMethod = PhoneServiceGrpc.getAddPhoneToUserMethod) == null) {
                    PhoneServiceGrpc.getAddPhoneToUserMethod = getAddPhoneToUserMethod =
                            io.grpc.MethodDescriptor.<me.weitao.grpc.AddPhoneToUserRequest, me.weitao.grpc.AddPhoneToUserResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "PhoneService", "addPhoneToUser"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            me.weitao.grpc.AddPhoneToUserRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            me.weitao.grpc.AddPhoneToUserResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("addPhoneToUser"))
                                    .build();
                }
            }
        }
        return getAddPhoneToUserMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static PhoneServiceStub newStub(io.grpc.Channel channel) {
        return new PhoneServiceStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static PhoneServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new PhoneServiceBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static PhoneServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new PhoneServiceFutureStub(channel);
    }

    /**
     */
    public static abstract class PhoneServiceImplBase implements io.grpc.BindableService {

        /**
         */
        public void addPhoneToUser(me.weitao.grpc.AddPhoneToUserRequest request,
                                   io.grpc.stub.StreamObserver<me.weitao.grpc.AddPhoneToUserResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getAddPhoneToUserMethod(), responseObserver);
        }

        @Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getAddPhoneToUserMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            me.weitao.grpc.AddPhoneToUserRequest,
                                            me.weitao.grpc.AddPhoneToUserResponse>(
                                            this, METHODID_ADD_PHONE_TO_USER)))
                    .build();
        }
    }

    /**
     */
    public static final class PhoneServiceStub extends io.grpc.stub.AbstractStub<PhoneServiceStub> {
        private PhoneServiceStub(io.grpc.Channel channel) {
            super(channel);
        }

        private PhoneServiceStub(io.grpc.Channel channel,
                                 io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected PhoneServiceStub build(io.grpc.Channel channel,
                                         io.grpc.CallOptions callOptions) {
            return new PhoneServiceStub(channel, callOptions);
        }

        /**
         */
        public void addPhoneToUser(me.weitao.grpc.AddPhoneToUserRequest request,
                                   io.grpc.stub.StreamObserver<me.weitao.grpc.AddPhoneToUserResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddPhoneToUserMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     */
    public static final class PhoneServiceBlockingStub extends io.grpc.stub.AbstractStub<PhoneServiceBlockingStub> {
        private PhoneServiceBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private PhoneServiceBlockingStub(io.grpc.Channel channel,
                                         io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected PhoneServiceBlockingStub build(io.grpc.Channel channel,
                                                 io.grpc.CallOptions callOptions) {
            return new PhoneServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public me.weitao.grpc.AddPhoneToUserResponse addPhoneToUser(me.weitao.grpc.AddPhoneToUserRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddPhoneToUserMethod(), getCallOptions(), request);
        }
    }

    /**
     */
    public static final class PhoneServiceFutureStub extends io.grpc.stub.AbstractStub<PhoneServiceFutureStub> {
        private PhoneServiceFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private PhoneServiceFutureStub(io.grpc.Channel channel,
                                       io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected PhoneServiceFutureStub build(io.grpc.Channel channel,
                                               io.grpc.CallOptions callOptions) {
            return new PhoneServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<me.weitao.grpc.AddPhoneToUserResponse> addPhoneToUser(
                me.weitao.grpc.AddPhoneToUserRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddPhoneToUserMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_ADD_PHONE_TO_USER = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final PhoneServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(PhoneServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_ADD_PHONE_TO_USER:
                    serviceImpl.addPhoneToUser((me.weitao.grpc.AddPhoneToUserRequest) request,
                            (io.grpc.stub.StreamObserver<me.weitao.grpc.AddPhoneToUserResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @Override
        @SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class PhoneServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        PhoneServiceBaseDescriptorSupplier() {
        }

        @Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return me.weitao.grpc.PhoneBookProto.getDescriptor();
        }

        @Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("PhoneService");
        }
    }

    private static final class PhoneServiceFileDescriptorSupplier
            extends PhoneServiceBaseDescriptorSupplier {
        PhoneServiceFileDescriptorSupplier() {
        }
    }

    private static final class PhoneServiceMethodDescriptorSupplier
            extends PhoneServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        PhoneServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (PhoneServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new PhoneServiceFileDescriptorSupplier())
                            .addMethod(getAddPhoneToUserMethod())
                            .build();
                }
            }
        }
        return result;
    }
}
