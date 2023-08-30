package com.tcn.cloud.api.api.v1alpha1.newsroom;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for interacting with TCN's Newsroom API system.
 * Accessing all of the methods Requestuire an authenticated user with the correct
 * permissions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/newsroom/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NewsroomAPIGrpc {

  private NewsroomAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.newsroom.NewsroomAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse> getCreateNewsArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNewsArticle",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse> getCreateNewsArticleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse> getCreateNewsArticleMethod;
    if ((getCreateNewsArticleMethod = NewsroomAPIGrpc.getCreateNewsArticleMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getCreateNewsArticleMethod = NewsroomAPIGrpc.getCreateNewsArticleMethod) == null) {
          NewsroomAPIGrpc.getCreateNewsArticleMethod = getCreateNewsArticleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNewsArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("CreateNewsArticle"))
              .build();
        }
      }
    }
    return getCreateNewsArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse> getListNewsArticlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNewsArticles",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse> getListNewsArticlesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse> getListNewsArticlesMethod;
    if ((getListNewsArticlesMethod = NewsroomAPIGrpc.getListNewsArticlesMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getListNewsArticlesMethod = NewsroomAPIGrpc.getListNewsArticlesMethod) == null) {
          NewsroomAPIGrpc.getListNewsArticlesMethod = getListNewsArticlesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNewsArticles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("ListNewsArticles"))
              .build();
        }
      }
    }
    return getListNewsArticlesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse> getGetNewsArticleByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNewsArticleById",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse> getGetNewsArticleByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse> getGetNewsArticleByIdMethod;
    if ((getGetNewsArticleByIdMethod = NewsroomAPIGrpc.getGetNewsArticleByIdMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getGetNewsArticleByIdMethod = NewsroomAPIGrpc.getGetNewsArticleByIdMethod) == null) {
          NewsroomAPIGrpc.getGetNewsArticleByIdMethod = getGetNewsArticleByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNewsArticleById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("GetNewsArticleById"))
              .build();
        }
      }
    }
    return getGetNewsArticleByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse> getUpdateNewsArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNewsArticle",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse> getUpdateNewsArticleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse> getUpdateNewsArticleMethod;
    if ((getUpdateNewsArticleMethod = NewsroomAPIGrpc.getUpdateNewsArticleMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getUpdateNewsArticleMethod = NewsroomAPIGrpc.getUpdateNewsArticleMethod) == null) {
          NewsroomAPIGrpc.getUpdateNewsArticleMethod = getUpdateNewsArticleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNewsArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("UpdateNewsArticle"))
              .build();
        }
      }
    }
    return getUpdateNewsArticleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NewsroomAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIStub>() {
        @java.lang.Override
        public NewsroomAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsroomAPIStub(channel, callOptions);
        }
      };
    return NewsroomAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NewsroomAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIBlockingStub>() {
        @java.lang.Override
        public NewsroomAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsroomAPIBlockingStub(channel, callOptions);
        }
      };
    return NewsroomAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NewsroomAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIFutureStub>() {
        @java.lang.Override
        public NewsroomAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsroomAPIFutureStub(channel, callOptions);
        }
      };
    return NewsroomAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for interacting with TCN's Newsroom API system.
   * Accessing all of the methods Requestuire an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * create news article
     * </pre>
     */
    default void createNewsArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewsArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     * list news articles
     * </pre>
     */
    default void listNewsArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNewsArticlesMethod(), responseObserver);
    }

    /**
     * <pre>
     * get news article details by the id
     * </pre>
     */
    default void getNewsArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNewsArticleByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * update news article
     * </pre>
     */
    default void updateNewsArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNewsArticleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NewsroomAPI.
   * <pre>
   * Service for interacting with TCN's Newsroom API system.
   * Accessing all of the methods Requestuire an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static abstract class NewsroomAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NewsroomAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NewsroomAPI.
   * <pre>
   * Service for interacting with TCN's Newsroom API system.
   * Accessing all of the methods Requestuire an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class NewsroomAPIStub
      extends io.grpc.stub.AbstractAsyncStub<NewsroomAPIStub> {
    private NewsroomAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsroomAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsroomAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * create news article
     * </pre>
     */
    public void createNewsArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewsArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list news articles
     * </pre>
     */
    public void listNewsArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNewsArticlesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get news article details by the id
     * </pre>
     */
    public void getNewsArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNewsArticleByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update news article
     * </pre>
     */
    public void updateNewsArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNewsArticleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NewsroomAPI.
   * <pre>
   * Service for interacting with TCN's Newsroom API system.
   * Accessing all of the methods Requestuire an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class NewsroomAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NewsroomAPIBlockingStub> {
    private NewsroomAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsroomAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsroomAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * create news article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse createNewsArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewsArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list news articles
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse listNewsArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNewsArticlesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get news article details by the id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse getNewsArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNewsArticleByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update news article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse updateNewsArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNewsArticleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NewsroomAPI.
   * <pre>
   * Service for interacting with TCN's Newsroom API system.
   * Accessing all of the methods Requestuire an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class NewsroomAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<NewsroomAPIFutureStub> {
    private NewsroomAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsroomAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsroomAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * create news article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse> createNewsArticle(
        com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewsArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list news articles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse> listNewsArticles(
        com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNewsArticlesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get news article details by the id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse> getNewsArticleById(
        com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNewsArticleByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update news article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse> updateNewsArticle(
        com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNewsArticleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NEWS_ARTICLE = 0;
  private static final int METHODID_LIST_NEWS_ARTICLES = 1;
  private static final int METHODID_GET_NEWS_ARTICLE_BY_ID = 2;
  private static final int METHODID_UPDATE_NEWS_ARTICLE = 3;

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
        case METHODID_CREATE_NEWS_ARTICLE:
          serviceImpl.createNewsArticle((com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse>) responseObserver);
          break;
        case METHODID_LIST_NEWS_ARTICLES:
          serviceImpl.listNewsArticles((com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse>) responseObserver);
          break;
        case METHODID_GET_NEWS_ARTICLE_BY_ID:
          serviceImpl.getNewsArticleById((com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NEWS_ARTICLE:
          serviceImpl.updateNewsArticle((com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse>) responseObserver);
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
          getCreateNewsArticleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.CreateNewsArticleResponse>(
                service, METHODID_CREATE_NEWS_ARTICLE)))
        .addMethod(
          getListNewsArticlesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListNewsArticlesResponse>(
                service, METHODID_LIST_NEWS_ARTICLES)))
        .addMethod(
          getGetNewsArticleByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsArticleByIdResponse>(
                service, METHODID_GET_NEWS_ARTICLE_BY_ID)))
        .addMethod(
          getUpdateNewsArticleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateNewsArticleResponse>(
                service, METHODID_UPDATE_NEWS_ARTICLE)))
        .build();
  }

  private static abstract class NewsroomAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NewsroomAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NewsroomAPI");
    }
  }

  private static final class NewsroomAPIFileDescriptorSupplier
      extends NewsroomAPIBaseDescriptorSupplier {
    NewsroomAPIFileDescriptorSupplier() {}
  }

  private static final class NewsroomAPIMethodDescriptorSupplier
      extends NewsroomAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NewsroomAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NewsroomAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NewsroomAPIFileDescriptorSupplier())
              .addMethod(getCreateNewsArticleMethod())
              .addMethod(getListNewsArticlesMethod())
              .addMethod(getGetNewsArticleByIdMethod())
              .addMethod(getUpdateNewsArticleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
