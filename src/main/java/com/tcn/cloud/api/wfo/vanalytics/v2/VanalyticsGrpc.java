package com.tcn.cloud.api.wfo.vanalytics.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: wfo/vanalytics/v2/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VanalyticsGrpc {

  private VanalyticsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "wfo.vanalytics.v2.Vanalytics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> getSearchTranscriptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchTranscripts",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> getSearchTranscriptsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> getSearchTranscriptsMethod;
    if ((getSearchTranscriptsMethod = VanalyticsGrpc.getSearchTranscriptsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getSearchTranscriptsMethod = VanalyticsGrpc.getSearchTranscriptsMethod) == null) {
          VanalyticsGrpc.getSearchTranscriptsMethod = getSearchTranscriptsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchTranscripts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("SearchTranscripts"))
              .build();
        }
      }
    }
    return getSearchTranscriptsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VanalyticsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VanalyticsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VanalyticsStub>() {
        @java.lang.Override
        public VanalyticsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VanalyticsStub(channel, callOptions);
        }
      };
    return VanalyticsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VanalyticsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VanalyticsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VanalyticsBlockingStub>() {
        @java.lang.Override
        public VanalyticsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VanalyticsBlockingStub(channel, callOptions);
        }
      };
    return VanalyticsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VanalyticsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VanalyticsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VanalyticsFutureStub>() {
        @java.lang.Override
        public VanalyticsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VanalyticsFutureStub(channel, callOptions);
        }
      };
    return VanalyticsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * SearchTranscripts searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved by making use of the given page token.
     * </pre>
     */
    default void searchTranscripts(com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchTranscriptsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Vanalytics.
   */
  public static abstract class VanalyticsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VanalyticsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Vanalytics.
   */
  public static final class VanalyticsStub
      extends io.grpc.stub.AbstractAsyncStub<VanalyticsStub> {
    private VanalyticsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VanalyticsStub(channel, callOptions);
    }

    /**
     * <pre>
     * SearchTranscripts searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved by making use of the given page token.
     * </pre>
     */
    public void searchTranscripts(com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchTranscriptsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Vanalytics.
   */
  public static final class VanalyticsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VanalyticsBlockingStub> {
    private VanalyticsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VanalyticsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SearchTranscripts searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved by making use of the given page token.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse searchTranscripts(com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchTranscriptsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Vanalytics.
   */
  public static final class VanalyticsFutureStub
      extends io.grpc.stub.AbstractFutureStub<VanalyticsFutureStub> {
    private VanalyticsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VanalyticsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SearchTranscripts searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved by making use of the given page token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> searchTranscripts(
        com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchTranscriptsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_TRANSCRIPTS = 0;

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
        case METHODID_SEARCH_TRANSCRIPTS:
          serviceImpl.searchTranscripts((com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse>) responseObserver);
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
          getSearchTranscriptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse>(
                service, METHODID_SEARCH_TRANSCRIPTS)))
        .build();
  }

  private static abstract class VanalyticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VanalyticsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Vanalytics");
    }
  }

  private static final class VanalyticsFileDescriptorSupplier
      extends VanalyticsBaseDescriptorSupplier {
    VanalyticsFileDescriptorSupplier() {}
  }

  private static final class VanalyticsMethodDescriptorSupplier
      extends VanalyticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VanalyticsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VanalyticsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VanalyticsFileDescriptorSupplier())
              .addMethod(getSearchTranscriptsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
