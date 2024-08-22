package com.tcn.cloud.api.tcnapi.omni.campaigns.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Campaigns service is the public api for the omni/campaigns service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: tcnapi/omni/campaigns/v1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignsGrpc {

  private CampaignsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "tcnapi.omni.campaigns.v1.Campaigns";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest,
      com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse> getListCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCampaigns",
      requestType = com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest.class,
      responseType = com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest,
      com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse> getListCampaignsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest, com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse> getListCampaignsMethod;
    if ((getListCampaignsMethod = CampaignsGrpc.getListCampaignsMethod) == null) {
      synchronized (CampaignsGrpc.class) {
        if ((getListCampaignsMethod = CampaignsGrpc.getListCampaignsMethod) == null) {
          CampaignsGrpc.getListCampaignsMethod = getListCampaignsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest, com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignsMethodDescriptorSupplier("ListCampaigns"))
              .build();
        }
      }
    }
    return getListCampaignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest,
      com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign> getGetCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaign",
      requestType = com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest.class,
      responseType = com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest,
      com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign> getGetCampaignMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest, com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign> getGetCampaignMethod;
    if ((getGetCampaignMethod = CampaignsGrpc.getGetCampaignMethod) == null) {
      synchronized (CampaignsGrpc.class) {
        if ((getGetCampaignMethod = CampaignsGrpc.getGetCampaignMethod) == null) {
          CampaignsGrpc.getGetCampaignMethod = getGetCampaignMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest, com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignsMethodDescriptorSupplier("GetCampaign"))
              .build();
        }
      }
    }
    return getGetCampaignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignsStub>() {
        @java.lang.Override
        public CampaignsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignsStub(channel, callOptions);
        }
      };
    return CampaignsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignsBlockingStub>() {
        @java.lang.Override
        public CampaignsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignsBlockingStub(channel, callOptions);
        }
      };
    return CampaignsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignsFutureStub>() {
        @java.lang.Override
        public CampaignsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignsFutureStub(channel, callOptions);
        }
      };
    return CampaignsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Campaigns service is the public api for the omni/campaigns service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Method to list campaigns
     * </pre>
     */
    default void listCampaigns(com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCampaignsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Method to get campaign
     * </pre>
     */
    default void getCampaign(com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Campaigns.
   * <pre>
   * Campaigns service is the public api for the omni/campaigns service.
   * </pre>
   */
  public static abstract class CampaignsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Campaigns.
   * <pre>
   * Campaigns service is the public api for the omni/campaigns service.
   * </pre>
   */
  public static final class CampaignsStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignsStub> {
    private CampaignsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method to list campaigns
     * </pre>
     */
    public void listCampaigns(com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Method to get campaign
     * </pre>
     */
    public void getCampaign(com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Campaigns.
   * <pre>
   * Campaigns service is the public api for the omni/campaigns service.
   * </pre>
   */
  public static final class CampaignsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignsBlockingStub> {
    private CampaignsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method to list campaigns
     * </pre>
     */
    public com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse listCampaigns(com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCampaignsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Method to get campaign
     * </pre>
     */
    public com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign getCampaign(com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Campaigns.
   * <pre>
   * Campaigns service is the public api for the omni/campaigns service.
   * </pre>
   */
  public static final class CampaignsFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignsFutureStub> {
    private CampaignsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method to list campaigns
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse> listCampaigns(
        com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCampaignsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Method to get campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign> getCampaign(
        com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CAMPAIGNS = 0;
  private static final int METHODID_GET_CAMPAIGN = 1;

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
        case METHODID_LIST_CAMPAIGNS:
          serviceImpl.listCampaigns((com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse>) responseObserver);
          break;
        case METHODID_GET_CAMPAIGN:
          serviceImpl.getCampaign((com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign>) responseObserver);
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
          getListCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsRequest,
              com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ListCampaignsResponse>(
                service, METHODID_LIST_CAMPAIGNS)))
        .addMethod(
          getGetCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.tcnapi.omni.campaigns.v1.GetCampaignRequest,
              com.tcn.cloud.api.tcnapi.omni.campaigns.v1.Campaign>(
                service, METHODID_GET_CAMPAIGN)))
        .build();
  }

  private static abstract class CampaignsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.tcnapi.omni.campaigns.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Campaigns");
    }
  }

  private static final class CampaignsFileDescriptorSupplier
      extends CampaignsBaseDescriptorSupplier {
    CampaignsFileDescriptorSupplier() {}
  }

  private static final class CampaignsMethodDescriptorSupplier
      extends CampaignsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CampaignsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CampaignsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignsFileDescriptorSupplier())
              .addMethod(getListCampaignsMethod())
              .addMethod(getGetCampaignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
