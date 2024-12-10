package com.tcn.cloud.api.api.v1alpha1.explorer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ExplorerService is the service for the explorer API.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/explorer/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExplorerServiceGrpc {

  private ExplorerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.explorer.ExplorerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse> getListDatasourceSchemasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasourceSchemas",
      requestType = com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse> getListDatasourceSchemasMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest, com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse> getListDatasourceSchemasMethod;
    if ((getListDatasourceSchemasMethod = ExplorerServiceGrpc.getListDatasourceSchemasMethod) == null) {
      synchronized (ExplorerServiceGrpc.class) {
        if ((getListDatasourceSchemasMethod = ExplorerServiceGrpc.getListDatasourceSchemasMethod) == null) {
          ExplorerServiceGrpc.getListDatasourceSchemasMethod = getListDatasourceSchemasMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest, com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasourceSchemas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExplorerServiceMethodDescriptorSupplier("ListDatasourceSchemas"))
              .build();
        }
      }
    }
    return getListDatasourceSchemasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest, com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse> getQueryMethod;
    if ((getQueryMethod = ExplorerServiceGrpc.getQueryMethod) == null) {
      synchronized (ExplorerServiceGrpc.class) {
        if ((getQueryMethod = ExplorerServiceGrpc.getQueryMethod) == null) {
          ExplorerServiceGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest, com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExplorerServiceMethodDescriptorSupplier("Query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse> getGetSupportQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSupportQuery",
      requestType = com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse> getGetSupportQueryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest, com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse> getGetSupportQueryMethod;
    if ((getGetSupportQueryMethod = ExplorerServiceGrpc.getGetSupportQueryMethod) == null) {
      synchronized (ExplorerServiceGrpc.class) {
        if ((getGetSupportQueryMethod = ExplorerServiceGrpc.getGetSupportQueryMethod) == null) {
          ExplorerServiceGrpc.getGetSupportQueryMethod = getGetSupportQueryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest, com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSupportQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExplorerServiceMethodDescriptorSupplier("GetSupportQuery"))
              .build();
        }
      }
    }
    return getGetSupportQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse> getGetQueryExplainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryExplain",
      requestType = com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse> getGetQueryExplainMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest, com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse> getGetQueryExplainMethod;
    if ((getGetQueryExplainMethod = ExplorerServiceGrpc.getGetQueryExplainMethod) == null) {
      synchronized (ExplorerServiceGrpc.class) {
        if ((getGetQueryExplainMethod = ExplorerServiceGrpc.getGetQueryExplainMethod) == null) {
          ExplorerServiceGrpc.getGetQueryExplainMethod = getGetQueryExplainMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest, com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueryExplain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExplorerServiceMethodDescriptorSupplier("GetQueryExplain"))
              .build();
        }
      }
    }
    return getGetQueryExplainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse> getGetWeeksOfDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWeeksOfData",
      requestType = com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest,
      com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse> getGetWeeksOfDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest, com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse> getGetWeeksOfDataMethod;
    if ((getGetWeeksOfDataMethod = ExplorerServiceGrpc.getGetWeeksOfDataMethod) == null) {
      synchronized (ExplorerServiceGrpc.class) {
        if ((getGetWeeksOfDataMethod = ExplorerServiceGrpc.getGetWeeksOfDataMethod) == null) {
          ExplorerServiceGrpc.getGetWeeksOfDataMethod = getGetWeeksOfDataMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest, com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWeeksOfData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExplorerServiceMethodDescriptorSupplier("GetWeeksOfData"))
              .build();
        }
      }
    }
    return getGetWeeksOfDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExplorerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExplorerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExplorerServiceStub>() {
        @java.lang.Override
        public ExplorerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExplorerServiceStub(channel, callOptions);
        }
      };
    return ExplorerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExplorerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExplorerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExplorerServiceBlockingStub>() {
        @java.lang.Override
        public ExplorerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExplorerServiceBlockingStub(channel, callOptions);
        }
      };
    return ExplorerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExplorerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExplorerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExplorerServiceFutureStub>() {
        @java.lang.Override
        public ExplorerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExplorerServiceFutureStub(channel, callOptions);
        }
      };
    return ExplorerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ExplorerService is the service for the explorer API.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListDatasourceSchemas lists all accessible datasources and their schemas.
     * </pre>
     */
    default void listDatasourceSchemas(com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatasourceSchemasMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query queries a datasource.
     * </pre>
     */
    default void query(com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     */
    default void getSupportQuery(com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSupportQueryMethod(), responseObserver);
    }

    /**
     */
    default void getQueryExplain(com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryExplainMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetWeeksOfData returns the number of weeks of data an org is limited to and the cutoff date.
     * </pre>
     */
    default void getWeeksOfData(com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWeeksOfDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExplorerService.
   * <pre>
   * ExplorerService is the service for the explorer API.
   * </pre>
   */
  public static abstract class ExplorerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExplorerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExplorerService.
   * <pre>
   * ExplorerService is the service for the explorer API.
   * </pre>
   */
  public static final class ExplorerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExplorerServiceStub> {
    private ExplorerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExplorerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExplorerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListDatasourceSchemas lists all accessible datasources and their schemas.
     * </pre>
     */
    public void listDatasourceSchemas(com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasourceSchemasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query queries a datasource.
     * </pre>
     */
    public void query(com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSupportQuery(com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSupportQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQueryExplain(com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryExplainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetWeeksOfData returns the number of weeks of data an org is limited to and the cutoff date.
     * </pre>
     */
    public void getWeeksOfData(com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWeeksOfDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExplorerService.
   * <pre>
   * ExplorerService is the service for the explorer API.
   * </pre>
   */
  public static final class ExplorerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExplorerServiceBlockingStub> {
    private ExplorerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExplorerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExplorerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListDatasourceSchemas lists all accessible datasources and their schemas.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse listDatasourceSchemas(com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasourceSchemasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query queries a datasource.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse query(com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse getSupportQuery(com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSupportQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse getQueryExplain(com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryExplainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetWeeksOfData returns the number of weeks of data an org is limited to and the cutoff date.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse getWeeksOfData(com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWeeksOfDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExplorerService.
   * <pre>
   * ExplorerService is the service for the explorer API.
   * </pre>
   */
  public static final class ExplorerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExplorerServiceFutureStub> {
    private ExplorerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExplorerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExplorerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListDatasourceSchemas lists all accessible datasources and their schemas.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse> listDatasourceSchemas(
        com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasourceSchemasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query queries a datasource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse> query(
        com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse> getSupportQuery(
        com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSupportQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse> getQueryExplain(
        com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryExplainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetWeeksOfData returns the number of weeks of data an org is limited to and the cutoff date.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse> getWeeksOfData(
        com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWeeksOfDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DATASOURCE_SCHEMAS = 0;
  private static final int METHODID_QUERY = 1;
  private static final int METHODID_GET_SUPPORT_QUERY = 2;
  private static final int METHODID_GET_QUERY_EXPLAIN = 3;
  private static final int METHODID_GET_WEEKS_OF_DATA = 4;

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
        case METHODID_LIST_DATASOURCE_SCHEMAS:
          serviceImpl.listDatasourceSchemas((com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse>) responseObserver);
          break;
        case METHODID_GET_SUPPORT_QUERY:
          serviceImpl.getSupportQuery((com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse>) responseObserver);
          break;
        case METHODID_GET_QUERY_EXPLAIN:
          serviceImpl.getQueryExplain((com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse>) responseObserver);
          break;
        case METHODID_GET_WEEKS_OF_DATA:
          serviceImpl.getWeeksOfData((com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse>) responseObserver);
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
          getListDatasourceSchemasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest,
              com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasResponse>(
                service, METHODID_LIST_DATASOURCE_SCHEMAS)))
        .addMethod(
          getQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest,
              com.tcn.cloud.api.api.v1alpha1.explorer.QueryResponse>(
                service, METHODID_QUERY)))
        .addMethod(
          getGetSupportQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryRequest,
              com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse>(
                service, METHODID_GET_SUPPORT_QUERY)))
        .addMethod(
          getGetQueryExplainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainRequest,
              com.tcn.cloud.api.api.v1alpha1.explorer.QueryExplainResponse>(
                service, METHODID_GET_QUERY_EXPLAIN)))
        .addMethod(
          getGetWeeksOfDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataRequest,
              com.tcn.cloud.api.api.v1alpha1.explorer.GetWeeksOfDataResponse>(
                service, METHODID_GET_WEEKS_OF_DATA)))
        .build();
  }

  private static abstract class ExplorerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExplorerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExplorerService");
    }
  }

  private static final class ExplorerServiceFileDescriptorSupplier
      extends ExplorerServiceBaseDescriptorSupplier {
    ExplorerServiceFileDescriptorSupplier() {}
  }

  private static final class ExplorerServiceMethodDescriptorSupplier
      extends ExplorerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExplorerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExplorerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExplorerServiceFileDescriptorSupplier())
              .addMethod(getListDatasourceSchemasMethod())
              .addMethod(getQueryMethod())
              .addMethod(getGetSupportQueryMethod())
              .addMethod(getGetQueryExplainMethod())
              .addMethod(getGetWeeksOfDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
