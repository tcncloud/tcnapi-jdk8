package com.tcn.cloud.api.api.v1alpha1.integrationspublic;

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
    comments = "Source: api/v1alpha1/integrationspublic/service.proto")
public final class IntegrationsPublicGrpc {

  private IntegrationsPublicGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.integrationspublic.IntegrationsPublic";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes> getGetLinkDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLinkData",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes> getGetLinkDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes> getGetLinkDataMethod;
    if ((getGetLinkDataMethod = IntegrationsPublicGrpc.getGetLinkDataMethod) == null) {
      synchronized (IntegrationsPublicGrpc.class) {
        if ((getGetLinkDataMethod = IntegrationsPublicGrpc.getGetLinkDataMethod) == null) {
          IntegrationsPublicGrpc.getGetLinkDataMethod = getGetLinkDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrationspublic.IntegrationsPublic", "GetLinkData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new IntegrationsPublicMethodDescriptorSupplier("GetLinkData"))
                  .build();
          }
        }
     }
     return getGetLinkDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes> getSubmitVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitVerification",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes> getSubmitVerificationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes> getSubmitVerificationMethod;
    if ((getSubmitVerificationMethod = IntegrationsPublicGrpc.getSubmitVerificationMethod) == null) {
      synchronized (IntegrationsPublicGrpc.class) {
        if ((getSubmitVerificationMethod = IntegrationsPublicGrpc.getSubmitVerificationMethod) == null) {
          IntegrationsPublicGrpc.getSubmitVerificationMethod = getSubmitVerificationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrationspublic.IntegrationsPublic", "SubmitVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes.getDefaultInstance()))
                  .setSchemaDescriptor(new IntegrationsPublicMethodDescriptorSupplier("SubmitVerification"))
                  .build();
          }
        }
     }
     return getSubmitVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes> getSessionKeepAliveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionKeepAlive",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes> getSessionKeepAliveMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes> getSessionKeepAliveMethod;
    if ((getSessionKeepAliveMethod = IntegrationsPublicGrpc.getSessionKeepAliveMethod) == null) {
      synchronized (IntegrationsPublicGrpc.class) {
        if ((getSessionKeepAliveMethod = IntegrationsPublicGrpc.getSessionKeepAliveMethod) == null) {
          IntegrationsPublicGrpc.getSessionKeepAliveMethod = getSessionKeepAliveMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrationspublic.IntegrationsPublic", "SessionKeepAlive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes.getDefaultInstance()))
                  .setSchemaDescriptor(new IntegrationsPublicMethodDescriptorSupplier("SessionKeepAlive"))
                  .build();
          }
        }
     }
     return getSessionKeepAliveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes> getGetInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInvoice",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes> getGetInvoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes> getGetInvoiceMethod;
    if ((getGetInvoiceMethod = IntegrationsPublicGrpc.getGetInvoiceMethod) == null) {
      synchronized (IntegrationsPublicGrpc.class) {
        if ((getGetInvoiceMethod = IntegrationsPublicGrpc.getGetInvoiceMethod) == null) {
          IntegrationsPublicGrpc.getGetInvoiceMethod = getGetInvoiceMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrationspublic.IntegrationsPublic", "GetInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes.getDefaultInstance()))
                  .setSchemaDescriptor(new IntegrationsPublicMethodDescriptorSupplier("GetInvoice"))
                  .build();
          }
        }
     }
     return getGetInvoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes> getSubmitPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitPayment",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes> getSubmitPaymentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes> getSubmitPaymentMethod;
    if ((getSubmitPaymentMethod = IntegrationsPublicGrpc.getSubmitPaymentMethod) == null) {
      synchronized (IntegrationsPublicGrpc.class) {
        if ((getSubmitPaymentMethod = IntegrationsPublicGrpc.getSubmitPaymentMethod) == null) {
          IntegrationsPublicGrpc.getSubmitPaymentMethod = getSubmitPaymentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrationspublic.IntegrationsPublic", "SubmitPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new IntegrationsPublicMethodDescriptorSupplier("SubmitPayment"))
                  .build();
          }
        }
     }
     return getSubmitPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes> getGetReceiptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReceipt",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq,
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes> getGetReceiptMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes> getGetReceiptMethod;
    if ((getGetReceiptMethod = IntegrationsPublicGrpc.getGetReceiptMethod) == null) {
      synchronized (IntegrationsPublicGrpc.class) {
        if ((getGetReceiptMethod = IntegrationsPublicGrpc.getGetReceiptMethod) == null) {
          IntegrationsPublicGrpc.getGetReceiptMethod = getGetReceiptMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq, com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrationspublic.IntegrationsPublic", "GetReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes.getDefaultInstance()))
                  .setSchemaDescriptor(new IntegrationsPublicMethodDescriptorSupplier("GetReceipt"))
                  .build();
          }
        }
     }
     return getGetReceiptMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntegrationsPublicStub newStub(io.grpc.Channel channel) {
    return new IntegrationsPublicStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntegrationsPublicBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IntegrationsPublicBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntegrationsPublicFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IntegrationsPublicFutureStub(channel);
  }

  /**
   */
  public static abstract class IntegrationsPublicImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLinkData(com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLinkDataMethod(), responseObserver);
    }

    /**
     */
    public void submitVerification(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitVerificationMethod(), responseObserver);
    }

    /**
     */
    public void sessionKeepAlive(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSessionKeepAliveMethod(), responseObserver);
    }

    /**
     */
    public void getInvoice(com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInvoiceMethod(), responseObserver);
    }

    /**
     */
    public void submitPayment(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitPaymentMethod(), responseObserver);
    }

    /**
     */
    public void getReceipt(com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReceiptMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLinkDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq,
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes>(
                  this, METHODID_GET_LINK_DATA)))
          .addMethod(
            getSubmitVerificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq,
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes>(
                  this, METHODID_SUBMIT_VERIFICATION)))
          .addMethod(
            getSessionKeepAliveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq,
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes>(
                  this, METHODID_SESSION_KEEP_ALIVE)))
          .addMethod(
            getGetInvoiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq,
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes>(
                  this, METHODID_GET_INVOICE)))
          .addMethod(
            getSubmitPaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq,
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes>(
                  this, METHODID_SUBMIT_PAYMENT)))
          .addMethod(
            getGetReceiptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq,
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes>(
                  this, METHODID_GET_RECEIPT)))
          .build();
    }
  }

  /**
   */
  public static final class IntegrationsPublicStub extends io.grpc.stub.AbstractStub<IntegrationsPublicStub> {
    private IntegrationsPublicStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationsPublicStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsPublicStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationsPublicStub(channel, callOptions);
    }

    /**
     */
    public void getLinkData(com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLinkDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitVerification(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sessionKeepAlive(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSessionKeepAliveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInvoice(com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitPayment(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReceipt(com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReceiptMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IntegrationsPublicBlockingStub extends io.grpc.stub.AbstractStub<IntegrationsPublicBlockingStub> {
    private IntegrationsPublicBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationsPublicBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsPublicBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationsPublicBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes getLinkData(com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq request) {
      return blockingUnaryCall(
          getChannel(), getGetLinkDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes submitVerification(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq request) {
      return blockingUnaryCall(
          getChannel(), getSubmitVerificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes sessionKeepAlive(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq request) {
      return blockingUnaryCall(
          getChannel(), getSessionKeepAliveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes getInvoice(com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq request) {
      return blockingUnaryCall(
          getChannel(), getGetInvoiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes submitPayment(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq request) {
      return blockingUnaryCall(
          getChannel(), getSubmitPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes getReceipt(com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq request) {
      return blockingUnaryCall(
          getChannel(), getGetReceiptMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IntegrationsPublicFutureStub extends io.grpc.stub.AbstractStub<IntegrationsPublicFutureStub> {
    private IntegrationsPublicFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationsPublicFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsPublicFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationsPublicFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes> getLinkData(
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLinkDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes> submitVerification(
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitVerificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes> sessionKeepAlive(
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSessionKeepAliveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes> getInvoice(
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes> submitPayment(
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitPaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes> getReceipt(
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReceiptMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LINK_DATA = 0;
  private static final int METHODID_SUBMIT_VERIFICATION = 1;
  private static final int METHODID_SESSION_KEEP_ALIVE = 2;
  private static final int METHODID_GET_INVOICE = 3;
  private static final int METHODID_SUBMIT_PAYMENT = 4;
  private static final int METHODID_GET_RECEIPT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntegrationsPublicImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntegrationsPublicImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LINK_DATA:
          serviceImpl.getLinkData((com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetLinkDataRes>) responseObserver);
          break;
        case METHODID_SUBMIT_VERIFICATION:
          serviceImpl.submitVerification((com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitVerificationRes>) responseObserver);
          break;
        case METHODID_SESSION_KEEP_ALIVE:
          serviceImpl.sessionKeepAlive((com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveRes>) responseObserver);
          break;
        case METHODID_GET_INVOICE:
          serviceImpl.getInvoice((com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetInvoiceRes>) responseObserver);
          break;
        case METHODID_SUBMIT_PAYMENT:
          serviceImpl.submitPayment((com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes>) responseObserver);
          break;
        case METHODID_GET_RECEIPT:
          serviceImpl.getReceipt((com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrationspublic.GetReceiptRes>) responseObserver);
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

  private static abstract class IntegrationsPublicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntegrationsPublicBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntegrationsPublic");
    }
  }

  private static final class IntegrationsPublicFileDescriptorSupplier
      extends IntegrationsPublicBaseDescriptorSupplier {
    IntegrationsPublicFileDescriptorSupplier() {}
  }

  private static final class IntegrationsPublicMethodDescriptorSupplier
      extends IntegrationsPublicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IntegrationsPublicMethodDescriptorSupplier(String methodName) {
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
      synchronized (IntegrationsPublicGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntegrationsPublicFileDescriptorSupplier())
              .addMethod(getGetLinkDataMethod())
              .addMethod(getSubmitVerificationMethod())
              .addMethod(getSessionKeepAliveMethod())
              .addMethod(getGetInvoiceMethod())
              .addMethod(getSubmitPaymentMethod())
              .addMethod(getGetReceiptMethod())
              .build();
        }
      }
    }
    return result;
  }
}
