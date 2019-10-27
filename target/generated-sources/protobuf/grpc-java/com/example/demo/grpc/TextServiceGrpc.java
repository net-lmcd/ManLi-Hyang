package com.example.demo.grpc;

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
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: prototest.proto")
public final class TextServiceGrpc {

  private TextServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.grpc.TextService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.TextRequest,
      com.example.demo.grpc.TextResponse> getProtoTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "protoTest",
      requestType = com.example.demo.grpc.TextRequest.class,
      responseType = com.example.demo.grpc.TextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.TextRequest,
      com.example.demo.grpc.TextResponse> getProtoTestMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.TextRequest, com.example.demo.grpc.TextResponse> getProtoTestMethod;
    if ((getProtoTestMethod = TextServiceGrpc.getProtoTestMethod) == null) {
      synchronized (TextServiceGrpc.class) {
        if ((getProtoTestMethod = TextServiceGrpc.getProtoTestMethod) == null) {
          TextServiceGrpc.getProtoTestMethod = getProtoTestMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.grpc.TextRequest, com.example.demo.grpc.TextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.grpc.TextService", "protoTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.TextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.TextResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TextServiceMethodDescriptorSupplier("protoTest"))
                  .build();
          }
        }
     }
     return getProtoTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextServiceStub newStub(io.grpc.Channel channel) {
    return new TextServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TextServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TextServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TextServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void protoTest(com.example.demo.grpc.TextRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.TextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProtoTestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProtoTestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.grpc.TextRequest,
                com.example.demo.grpc.TextResponse>(
                  this, METHODID_PROTO_TEST)))
          .build();
    }
  }

  /**
   */
  public static final class TextServiceStub extends io.grpc.stub.AbstractStub<TextServiceStub> {
    private TextServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TextServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TextServiceStub(channel, callOptions);
    }

    /**
     */
    public void protoTest(com.example.demo.grpc.TextRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.TextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProtoTestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TextServiceBlockingStub extends io.grpc.stub.AbstractStub<TextServiceBlockingStub> {
    private TextServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TextServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TextServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.grpc.TextResponse protoTest(com.example.demo.grpc.TextRequest request) {
      return blockingUnaryCall(
          getChannel(), getProtoTestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TextServiceFutureStub extends io.grpc.stub.AbstractStub<TextServiceFutureStub> {
    private TextServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TextServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TextServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.TextResponse> protoTest(
        com.example.demo.grpc.TextRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProtoTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROTO_TEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROTO_TEST:
          serviceImpl.protoTest((com.example.demo.grpc.TextRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.TextResponse>) responseObserver);
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

  private static abstract class TextServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.grpc.Prototest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextService");
    }
  }

  private static final class TextServiceFileDescriptorSupplier
      extends TextServiceBaseDescriptorSupplier {
    TextServiceFileDescriptorSupplier() {}
  }

  private static final class TextServiceMethodDescriptorSupplier
      extends TextServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextServiceFileDescriptorSupplier())
              .addMethod(getProtoTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
