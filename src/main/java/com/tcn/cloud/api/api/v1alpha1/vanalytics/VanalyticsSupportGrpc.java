package com.tcn.cloud.api.api.v1alpha1.vanalytics;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/vanalytics/support_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VanalyticsSupportGrpc {

  private VanalyticsSupportGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.vanalytics.VanalyticsSupport";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse> getDeleteFlagTranscriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlagTranscript",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse> getDeleteFlagTranscriptMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse> getDeleteFlagTranscriptMethod;
    if ((getDeleteFlagTranscriptMethod = VanalyticsSupportGrpc.getDeleteFlagTranscriptMethod) == null) {
      synchronized (VanalyticsSupportGrpc.class) {
        if ((getDeleteFlagTranscriptMethod = VanalyticsSupportGrpc.getDeleteFlagTranscriptMethod) == null) {
          VanalyticsSupportGrpc.getDeleteFlagTranscriptMethod = getDeleteFlagTranscriptMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlagTranscript"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsSupportMethodDescriptorSupplier("DeleteFlagTranscript"))
              .build();
        }
      }
    }
    return getDeleteFlagTranscriptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> getSearchByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> getSearchByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> getSearchByOrgIdMethod;
    if ((getSearchByOrgIdMethod = VanalyticsSupportGrpc.getSearchByOrgIdMethod) == null) {
      synchronized (VanalyticsSupportGrpc.class) {
        if ((getSearchByOrgIdMethod = VanalyticsSupportGrpc.getSearchByOrgIdMethod) == null) {
          VanalyticsSupportGrpc.getSearchByOrgIdMethod = getSearchByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsSupportMethodDescriptorSupplier("SearchByOrgId"))
              .build();
        }
      }
    }
    return getSearchByOrgIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VanalyticsSupportStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VanalyticsSupportStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VanalyticsSupportStub>() {
        @java.lang.Override
        public VanalyticsSupportStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VanalyticsSupportStub(channel, callOptions);
        }
      };
    return VanalyticsSupportStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VanalyticsSupportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VanalyticsSupportBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VanalyticsSupportBlockingStub>() {
        @java.lang.Override
        public VanalyticsSupportBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VanalyticsSupportBlockingStub(channel, callOptions);
        }
      };
    return VanalyticsSupportBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VanalyticsSupportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VanalyticsSupportFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VanalyticsSupportFutureStub>() {
        @java.lang.Override
        public VanalyticsSupportFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VanalyticsSupportFutureStub(channel, callOptions);
        }
      };
    return VanalyticsSupportFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * DeleteFlagTranscript deletes a flag transcript.
     * </pre>
     */
    default void deleteFlagTranscript(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlagTranscriptMethod(), responseObserver);
    }

    /**
     * <pre>
     * SearchByOrgId searches flag transcripts.
     * </pre>
     */
    default void searchByOrgId(com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchByOrgIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VanalyticsSupport.
   */
  public static abstract class VanalyticsSupportImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VanalyticsSupportGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VanalyticsSupport.
   */
  public static final class VanalyticsSupportStub
      extends io.grpc.stub.AbstractAsyncStub<VanalyticsSupportStub> {
    private VanalyticsSupportStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsSupportStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VanalyticsSupportStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteFlagTranscript deletes a flag transcript.
     * </pre>
     */
    public void deleteFlagTranscript(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlagTranscriptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SearchByOrgId searches flag transcripts.
     * </pre>
     */
    public void searchByOrgId(com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VanalyticsSupport.
   */
  public static final class VanalyticsSupportBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VanalyticsSupportBlockingStub> {
    private VanalyticsSupportBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsSupportBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VanalyticsSupportBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteFlagTranscript deletes a flag transcript.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse deleteFlagTranscript(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlagTranscriptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SearchByOrgId searches flag transcripts.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse searchByOrgId(com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchByOrgIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VanalyticsSupport.
   */
  public static final class VanalyticsSupportFutureStub
      extends io.grpc.stub.AbstractFutureStub<VanalyticsSupportFutureStub> {
    private VanalyticsSupportFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsSupportFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VanalyticsSupportFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteFlagTranscript deletes a flag transcript.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse> deleteFlagTranscript(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlagTranscriptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SearchByOrgId searches flag transcripts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> searchByOrgId(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchByOrgIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_FLAG_TRANSCRIPT = 0;
  private static final int METHODID_SEARCH_BY_ORG_ID = 1;

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
        case METHODID_DELETE_FLAG_TRANSCRIPT:
          serviceImpl.deleteFlagTranscript((com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_ORG_ID:
          serviceImpl.searchByOrgId((com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse>) responseObserver);
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
          getDeleteFlagTranscriptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptRequest,
              com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagTranscriptResponse>(
                service, METHODID_DELETE_FLAG_TRANSCRIPT)))
        .addMethod(
          getSearchByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse>(
                service, METHODID_SEARCH_BY_ORG_ID)))
        .build();
  }

  private static abstract class VanalyticsSupportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VanalyticsSupportBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.SupportServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VanalyticsSupport");
    }
  }

  private static final class VanalyticsSupportFileDescriptorSupplier
      extends VanalyticsSupportBaseDescriptorSupplier {
    VanalyticsSupportFileDescriptorSupplier() {}
  }

  private static final class VanalyticsSupportMethodDescriptorSupplier
      extends VanalyticsSupportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VanalyticsSupportMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VanalyticsSupportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VanalyticsSupportFileDescriptorSupplier())
              .addMethod(getDeleteFlagTranscriptMethod())
              .addMethod(getSearchByOrgIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
