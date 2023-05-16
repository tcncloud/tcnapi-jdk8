package com.tcn.cloud.api.api.v1alpha1.billing;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Billing service for handling billing requests.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: api/v1alpha1/billing/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingGrpc {

  private BillingGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.billing.Billing";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq,
      com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes> getCreateBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBillingPlan",
      requestType = com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq,
      com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes> getCreateBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq, com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes> getCreateBillingPlanMethod;
    if ((getCreateBillingPlanMethod = BillingGrpc.getCreateBillingPlanMethod) == null) {
      synchronized (BillingGrpc.class) {
        if ((getCreateBillingPlanMethod = BillingGrpc.getCreateBillingPlanMethod) == null) {
          BillingGrpc.getCreateBillingPlanMethod = getCreateBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq, com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes.getDefaultInstance()))
              .setSchemaDescriptor(new BillingMethodDescriptorSupplier("CreateBillingPlan"))
              .build();
        }
      }
    }
    return getCreateBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq,
      com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes> getGetBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingPlan",
      requestType = com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq,
      com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes> getGetBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq, com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes> getGetBillingPlanMethod;
    if ((getGetBillingPlanMethod = BillingGrpc.getGetBillingPlanMethod) == null) {
      synchronized (BillingGrpc.class) {
        if ((getGetBillingPlanMethod = BillingGrpc.getGetBillingPlanMethod) == null) {
          BillingGrpc.getGetBillingPlanMethod = getGetBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq, com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes.getDefaultInstance()))
              .setSchemaDescriptor(new BillingMethodDescriptorSupplier("GetBillingPlan"))
              .build();
        }
      }
    }
    return getGetBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq,
      com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes> getUpdateBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBillingPlan",
      requestType = com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq,
      com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes> getUpdateBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq, com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes> getUpdateBillingPlanMethod;
    if ((getUpdateBillingPlanMethod = BillingGrpc.getUpdateBillingPlanMethod) == null) {
      synchronized (BillingGrpc.class) {
        if ((getUpdateBillingPlanMethod = BillingGrpc.getUpdateBillingPlanMethod) == null) {
          BillingGrpc.getUpdateBillingPlanMethod = getUpdateBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq, com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes.getDefaultInstance()))
              .setSchemaDescriptor(new BillingMethodDescriptorSupplier("UpdateBillingPlan"))
              .build();
        }
      }
    }
    return getUpdateBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq,
      com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes> getDeleteBillingDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBillingDetails",
      requestType = com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq,
      com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes> getDeleteBillingDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq, com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes> getDeleteBillingDetailsMethod;
    if ((getDeleteBillingDetailsMethod = BillingGrpc.getDeleteBillingDetailsMethod) == null) {
      synchronized (BillingGrpc.class) {
        if ((getDeleteBillingDetailsMethod = BillingGrpc.getDeleteBillingDetailsMethod) == null) {
          BillingGrpc.getDeleteBillingDetailsMethod = getDeleteBillingDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq, com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBillingDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes.getDefaultInstance()))
              .setSchemaDescriptor(new BillingMethodDescriptorSupplier("DeleteBillingDetails"))
              .build();
        }
      }
    }
    return getDeleteBillingDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq,
      com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes> getGetInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInvoice",
      requestType = com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq,
      com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes> getGetInvoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq, com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes> getGetInvoiceMethod;
    if ((getGetInvoiceMethod = BillingGrpc.getGetInvoiceMethod) == null) {
      synchronized (BillingGrpc.class) {
        if ((getGetInvoiceMethod = BillingGrpc.getGetInvoiceMethod) == null) {
          BillingGrpc.getGetInvoiceMethod = getGetInvoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq, com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes.getDefaultInstance()))
              .setSchemaDescriptor(new BillingMethodDescriptorSupplier("GetInvoice"))
              .build();
        }
      }
    }
    return getGetInvoiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingStub>() {
        @java.lang.Override
        public BillingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingStub(channel, callOptions);
        }
      };
    return BillingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingBlockingStub>() {
        @java.lang.Override
        public BillingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingBlockingStub(channel, callOptions);
        }
      };
    return BillingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingFutureStub>() {
        @java.lang.Override
        public BillingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingFutureStub(channel, callOptions);
        }
      };
    return BillingFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Billing service for handling billing requests.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateBillingPlan - saves the provided billing plan, and returns the saved
     * plan. However, in an organization's Billing Plan there can only ever be
     * one billing detail with a specific config type and event type.
     * </pre>
     */
    default void createBillingPlan(com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBillingPlan - returns the billing plan for the provided organization.
     * </pre>
     */
    default void getBillingPlan(com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBillingPlan - updates the provided billing plan and it's details.
     * If some details are not provided, they will be left as is. However, if
     * deletion is desired, the DeleteBillingDetails method should be used. The
     * billing plan still follows the constraint of only having one billing detail
     * with a specific config type and event type, and so if the request contains
     * more than one billing detail with a config type and event type, the request
     * is malformed and will result in potentially unexpected behavior.
     * </pre>
     */
    default void updateBillingPlan(com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteBillingDetails - deletes the provided billing details. If the billing
     * details do not exist, this won't do anything.
     * </pre>
     */
    default void deleteBillingDetails(com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBillingDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetInvoice - returns the invoice for the organization. If a date is
     * provided, this will return the invoice for the organization that
     * corresponds to the billing cycle that contains the provided date. If
     * no date is provided, this will return the invoice as it currently
     * stands for the current billing cycle.
     * </pre>
     */
    default void getInvoice(com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInvoiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Billing.
   * <pre>
   * Billing service for handling billing requests.
   * </pre>
   */
  public static abstract class BillingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BillingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Billing.
   * <pre>
   * Billing service for handling billing requests.
   * </pre>
   */
  public static final class BillingStub
      extends io.grpc.stub.AbstractAsyncStub<BillingStub> {
    private BillingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateBillingPlan - saves the provided billing plan, and returns the saved
     * plan. However, in an organization's Billing Plan there can only ever be
     * one billing detail with a specific config type and event type.
     * </pre>
     */
    public void createBillingPlan(com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBillingPlan - returns the billing plan for the provided organization.
     * </pre>
     */
    public void getBillingPlan(com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBillingPlan - updates the provided billing plan and it's details.
     * If some details are not provided, they will be left as is. However, if
     * deletion is desired, the DeleteBillingDetails method should be used. The
     * billing plan still follows the constraint of only having one billing detail
     * with a specific config type and event type, and so if the request contains
     * more than one billing detail with a config type and event type, the request
     * is malformed and will result in potentially unexpected behavior.
     * </pre>
     */
    public void updateBillingPlan(com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteBillingDetails - deletes the provided billing details. If the billing
     * details do not exist, this won't do anything.
     * </pre>
     */
    public void deleteBillingDetails(com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBillingDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetInvoice - returns the invoice for the organization. If a date is
     * provided, this will return the invoice for the organization that
     * corresponds to the billing cycle that contains the provided date. If
     * no date is provided, this will return the invoice as it currently
     * stands for the current billing cycle.
     * </pre>
     */
    public void getInvoice(com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Billing.
   * <pre>
   * Billing service for handling billing requests.
   * </pre>
   */
  public static final class BillingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BillingBlockingStub> {
    private BillingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateBillingPlan - saves the provided billing plan, and returns the saved
     * plan. However, in an organization's Billing Plan there can only ever be
     * one billing detail with a specific config type and event type.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes createBillingPlan(com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBillingPlan - returns the billing plan for the provided organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes getBillingPlan(com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBillingPlan - updates the provided billing plan and it's details.
     * If some details are not provided, they will be left as is. However, if
     * deletion is desired, the DeleteBillingDetails method should be used. The
     * billing plan still follows the constraint of only having one billing detail
     * with a specific config type and event type, and so if the request contains
     * more than one billing detail with a config type and event type, the request
     * is malformed and will result in potentially unexpected behavior.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes updateBillingPlan(com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteBillingDetails - deletes the provided billing details. If the billing
     * details do not exist, this won't do anything.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes deleteBillingDetails(com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBillingDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetInvoice - returns the invoice for the organization. If a date is
     * provided, this will return the invoice for the organization that
     * corresponds to the billing cycle that contains the provided date. If
     * no date is provided, this will return the invoice as it currently
     * stands for the current billing cycle.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes getInvoice(com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInvoiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Billing.
   * <pre>
   * Billing service for handling billing requests.
   * </pre>
   */
  public static final class BillingFutureStub
      extends io.grpc.stub.AbstractFutureStub<BillingFutureStub> {
    private BillingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateBillingPlan - saves the provided billing plan, and returns the saved
     * plan. However, in an organization's Billing Plan there can only ever be
     * one billing detail with a specific config type and event type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes> createBillingPlan(
        com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBillingPlan - returns the billing plan for the provided organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes> getBillingPlan(
        com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBillingPlan - updates the provided billing plan and it's details.
     * If some details are not provided, they will be left as is. However, if
     * deletion is desired, the DeleteBillingDetails method should be used. The
     * billing plan still follows the constraint of only having one billing detail
     * with a specific config type and event type, and so if the request contains
     * more than one billing detail with a config type and event type, the request
     * is malformed and will result in potentially unexpected behavior.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes> updateBillingPlan(
        com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteBillingDetails - deletes the provided billing details. If the billing
     * details do not exist, this won't do anything.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes> deleteBillingDetails(
        com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBillingDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetInvoice - returns the invoice for the organization. If a date is
     * provided, this will return the invoice for the organization that
     * corresponds to the billing cycle that contains the provided date. If
     * no date is provided, this will return the invoice as it currently
     * stands for the current billing cycle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes> getInvoice(
        com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BILLING_PLAN = 0;
  private static final int METHODID_GET_BILLING_PLAN = 1;
  private static final int METHODID_UPDATE_BILLING_PLAN = 2;
  private static final int METHODID_DELETE_BILLING_DETAILS = 3;
  private static final int METHODID_GET_INVOICE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BILLING_PLAN:
          serviceImpl.createBillingPlan((com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes>) responseObserver);
          break;
        case METHODID_GET_BILLING_PLAN:
          serviceImpl.getBillingPlan((com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes>) responseObserver);
          break;
        case METHODID_UPDATE_BILLING_PLAN:
          serviceImpl.updateBillingPlan((com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes>) responseObserver);
          break;
        case METHODID_DELETE_BILLING_DETAILS:
          serviceImpl.deleteBillingDetails((com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes>) responseObserver);
          break;
        case METHODID_GET_INVOICE:
          serviceImpl.getInvoice((com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanReq,
              com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes>(
                service, METHODID_CREATE_BILLING_PLAN)))
        .addMethod(
          getGetBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanReq,
              com.tcn.cloud.api.api.v1alpha1.billing.GetBillingPlanRes>(
                service, METHODID_GET_BILLING_PLAN)))
        .addMethod(
          getUpdateBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanReq,
              com.tcn.cloud.api.api.v1alpha1.billing.UpdateBillingPlanRes>(
                service, METHODID_UPDATE_BILLING_PLAN)))
        .addMethod(
          getDeleteBillingDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsReq,
              com.tcn.cloud.api.api.v1alpha1.billing.DeleteBillingDetailsRes>(
                service, METHODID_DELETE_BILLING_DETAILS)))
        .addMethod(
          getGetInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceReq,
              com.tcn.cloud.api.api.v1alpha1.billing.GetInvoiceRes>(
                service, METHODID_GET_INVOICE)))
        .build();
  }

  private static abstract class BillingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.billing.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Billing");
    }
  }

  private static final class BillingFileDescriptorSupplier
      extends BillingBaseDescriptorSupplier {
    BillingFileDescriptorSupplier() {}
  }

  private static final class BillingMethodDescriptorSupplier
      extends BillingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BillingMethodDescriptorSupplier(String methodName) {
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
      synchronized (BillingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillingFileDescriptorSupplier())
              .addMethod(getCreateBillingPlanMethod())
              .addMethod(getGetBillingPlanMethod())
              .addMethod(getUpdateBillingPlanMethod())
              .addMethod(getDeleteBillingDetailsMethod())
              .addMethod(getGetInvoiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
