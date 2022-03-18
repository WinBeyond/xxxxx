package com.skemaloop.test;

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
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: XXXX.proto")
public final class XXXXGrpc {

  private XXXXGrpc() {}

  public static final String SERVICE_NAME = "XXXX.XXXAA.XXXX";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skemaloop.test.XXXXOuterClass.HelloRequest,
      com.skemaloop.test.XXXXOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.skemaloop.test.XXXXOuterClass.HelloRequest.class,
      responseType = com.skemaloop.test.XXXXOuterClass.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skemaloop.test.XXXXOuterClass.HelloRequest,
      com.skemaloop.test.XXXXOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.skemaloop.test.XXXXOuterClass.HelloRequest, com.skemaloop.test.XXXXOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = XXXXGrpc.getSayHelloMethod) == null) {
      synchronized (XXXXGrpc.class) {
        if ((getSayHelloMethod = XXXXGrpc.getSayHelloMethod) == null) {
          XXXXGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.skemaloop.test.XXXXOuterClass.HelloRequest, com.skemaloop.test.XXXXOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.XXXXOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.XXXXOuterClass.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new XXXXMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static XXXXStub newStub(io.grpc.Channel channel) {
    return new XXXXStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static XXXXBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new XXXXBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static XXXXFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new XXXXFutureStub(channel);
  }

  /**
   */
  public static abstract class XXXXImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.skemaloop.test.XXXXOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.XXXXOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skemaloop.test.XXXXOuterClass.HelloRequest,
                com.skemaloop.test.XXXXOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class XXXXStub extends io.grpc.stub.AbstractStub<XXXXStub> {
    private XXXXStub(io.grpc.Channel channel) {
      super(channel);
    }

    private XXXXStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XXXXStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new XXXXStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.skemaloop.test.XXXXOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.XXXXOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class XXXXBlockingStub extends io.grpc.stub.AbstractStub<XXXXBlockingStub> {
    private XXXXBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private XXXXBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XXXXBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new XXXXBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skemaloop.test.XXXXOuterClass.HelloReply sayHello(com.skemaloop.test.XXXXOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class XXXXFutureStub extends io.grpc.stub.AbstractStub<XXXXFutureStub> {
    private XXXXFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private XXXXFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XXXXFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new XXXXFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skemaloop.test.XXXXOuterClass.HelloReply> sayHello(
        com.skemaloop.test.XXXXOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final XXXXImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(XXXXImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.skemaloop.test.XXXXOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.skemaloop.test.XXXXOuterClass.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class XXXXBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    XXXXBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skemaloop.test.XXXXOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("XXXX");
    }
  }

  private static final class XXXXFileDescriptorSupplier
      extends XXXXBaseDescriptorSupplier {
    XXXXFileDescriptorSupplier() {}
  }

  private static final class XXXXMethodDescriptorSupplier
      extends XXXXBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    XXXXMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (XXXXGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new XXXXFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
