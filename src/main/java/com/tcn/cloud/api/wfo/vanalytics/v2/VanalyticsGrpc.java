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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getCreateFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFilter",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.Filter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getCreateFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getCreateFilterMethod;
    if ((getCreateFilterMethod = VanalyticsGrpc.getCreateFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateFilterMethod = VanalyticsGrpc.getCreateFilterMethod) == null) {
          VanalyticsGrpc.getCreateFilterMethod = getCreateFilterMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Filter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.Filter.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateFilter"))
              .build();
        }
      }
    }
    return getCreateFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse> getListFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFilters",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse> getListFiltersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse> getListFiltersMethod;
    if ((getListFiltersMethod = VanalyticsGrpc.getListFiltersMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFiltersMethod = VanalyticsGrpc.getListFiltersMethod) == null) {
          VanalyticsGrpc.getListFiltersMethod = getListFiltersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFilters"))
              .build();
        }
      }
    }
    return getListFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getUpdateFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFilter",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.Filter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getUpdateFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getUpdateFilterMethod;
    if ((getUpdateFilterMethod = VanalyticsGrpc.getUpdateFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getUpdateFilterMethod = VanalyticsGrpc.getUpdateFilterMethod) == null) {
          VanalyticsGrpc.getUpdateFilterMethod = getUpdateFilterMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Filter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.Filter.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("UpdateFilter"))
              .build();
        }
      }
    }
    return getUpdateFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse> getDeleteFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFilter",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse> getDeleteFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest, com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse> getDeleteFilterMethod;
    if ((getDeleteFilterMethod = VanalyticsGrpc.getDeleteFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getDeleteFilterMethod = VanalyticsGrpc.getDeleteFilterMethod) == null) {
          VanalyticsGrpc.getDeleteFilterMethod = getDeleteFilterMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest, com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("DeleteFilter"))
              .build();
        }
      }
    }
    return getDeleteFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getGetFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFilter",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.Filter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getGetFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getGetFilterMethod;
    if ((getGetFilterMethod = VanalyticsGrpc.getGetFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getGetFilterMethod = VanalyticsGrpc.getGetFilterMethod) == null) {
          VanalyticsGrpc.getGetFilterMethod = getGetFilterMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Filter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.Filter.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("GetFilter"))
              .build();
        }
      }
    }
    return getGetFilterMethod;
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

    /**
     * <pre>
     * CreateFilter creates a new filter. The filter contains a transcript query
     * to filter transcripts.
     * </pre>
     */
    default void createFilter(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFilters lists filters.
     * </pre>
     */
    default void listFilters(com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFilter updates a filter transcript query and/or name.
     * </pre>
     */
    default void updateFilter(com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteFilter deletes filter given a filter_sid.
     * </pre>
     */
    default void deleteFilter(com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetFilter gets filter given a filter_sid or name.
     * </pre>
     */
    default void getFilter(com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFilterMethod(), responseObserver);
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

    /**
     * <pre>
     * CreateFilter creates a new filter. The filter contains a transcript query
     * to filter transcripts.
     * </pre>
     */
    public void createFilter(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFilters lists filters.
     * </pre>
     */
    public void listFilters(com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFilter updates a filter transcript query and/or name.
     * </pre>
     */
    public void updateFilter(com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteFilter deletes filter given a filter_sid.
     * </pre>
     */
    public void deleteFilter(com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetFilter gets filter given a filter_sid or name.
     * </pre>
     */
    public void getFilter(com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFilterMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * CreateFilter creates a new filter. The filter contains a transcript query
     * to filter transcripts.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.Filter createFilter(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFilters lists filters.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse listFilters(com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFilter updates a filter transcript query and/or name.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.Filter updateFilter(com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteFilter deletes filter given a filter_sid.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse deleteFilter(com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetFilter gets filter given a filter_sid or name.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.Filter getFilter(com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFilterMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * CreateFilter creates a new filter. The filter contains a transcript query
     * to filter transcripts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> createFilter(
        com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFilters lists filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse> listFilters(
        com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFilter updates a filter transcript query and/or name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> updateFilter(
        com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteFilter deletes filter given a filter_sid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse> deleteFilter(
        com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetFilter gets filter given a filter_sid or name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.Filter> getFilter(
        com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFilterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_TRANSCRIPTS = 0;
  private static final int METHODID_CREATE_FILTER = 1;
  private static final int METHODID_LIST_FILTERS = 2;
  private static final int METHODID_UPDATE_FILTER = 3;
  private static final int METHODID_DELETE_FILTER = 4;
  private static final int METHODID_GET_FILTER = 5;

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
        case METHODID_CREATE_FILTER:
          serviceImpl.createFilter((com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Filter>) responseObserver);
          break;
        case METHODID_LIST_FILTERS:
          serviceImpl.listFilters((com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FILTER:
          serviceImpl.updateFilter((com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Filter>) responseObserver);
          break;
        case METHODID_DELETE_FILTER:
          serviceImpl.deleteFilter((com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse>) responseObserver);
          break;
        case METHODID_GET_FILTER:
          serviceImpl.getFilter((com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Filter>) responseObserver);
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
        .addMethod(
          getCreateFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.Filter>(
                service, METHODID_CREATE_FILTER)))
        .addMethod(
          getListFiltersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFiltersResponse>(
                service, METHODID_LIST_FILTERS)))
        .addMethod(
          getUpdateFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFilterRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.Filter>(
                service, METHODID_UPDATE_FILTER)))
        .addMethod(
          getDeleteFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFilterResponse>(
                service, METHODID_DELETE_FILTER)))
        .addMethod(
          getGetFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.GetFilterRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.Filter>(
                service, METHODID_GET_FILTER)))
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
              .addMethod(getCreateFilterMethod())
              .addMethod(getListFiltersMethod())
              .addMethod(getUpdateFilterMethod())
              .addMethod(getDeleteFilterMethod())
              .addMethod(getGetFilterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
