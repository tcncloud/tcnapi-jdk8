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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse> getCreatePublishedArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePublishedArticle",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse> getCreatePublishedArticleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse> getCreatePublishedArticleMethod;
    if ((getCreatePublishedArticleMethod = NewsroomAPIGrpc.getCreatePublishedArticleMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getCreatePublishedArticleMethod = NewsroomAPIGrpc.getCreatePublishedArticleMethod) == null) {
          NewsroomAPIGrpc.getCreatePublishedArticleMethod = getCreatePublishedArticleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePublishedArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("CreatePublishedArticle"))
              .build();
        }
      }
    }
    return getCreatePublishedArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse> getListPublishedArticlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPublishedArticles",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse> getListPublishedArticlesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse> getListPublishedArticlesMethod;
    if ((getListPublishedArticlesMethod = NewsroomAPIGrpc.getListPublishedArticlesMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getListPublishedArticlesMethod = NewsroomAPIGrpc.getListPublishedArticlesMethod) == null) {
          NewsroomAPIGrpc.getListPublishedArticlesMethod = getListPublishedArticlesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPublishedArticles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("ListPublishedArticles"))
              .build();
        }
      }
    }
    return getListPublishedArticlesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse> getGetPublishedArticleByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublishedArticleById",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse> getGetPublishedArticleByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse> getGetPublishedArticleByIdMethod;
    if ((getGetPublishedArticleByIdMethod = NewsroomAPIGrpc.getGetPublishedArticleByIdMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getGetPublishedArticleByIdMethod = NewsroomAPIGrpc.getGetPublishedArticleByIdMethod) == null) {
          NewsroomAPIGrpc.getGetPublishedArticleByIdMethod = getGetPublishedArticleByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublishedArticleById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("GetPublishedArticleById"))
              .build();
        }
      }
    }
    return getGetPublishedArticleByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse> getUserActivityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserActivity",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse> getUserActivityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse> getUserActivityMethod;
    if ((getUserActivityMethod = NewsroomAPIGrpc.getUserActivityMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getUserActivityMethod = NewsroomAPIGrpc.getUserActivityMethod) == null) {
          NewsroomAPIGrpc.getUserActivityMethod = getUserActivityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserActivity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("UserActivity"))
              .build();
        }
      }
    }
    return getUserActivityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse> getGetNewsForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNewsForUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse> getGetNewsForUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse> getGetNewsForUserMethod;
    if ((getGetNewsForUserMethod = NewsroomAPIGrpc.getGetNewsForUserMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getGetNewsForUserMethod = NewsroomAPIGrpc.getGetNewsForUserMethod) == null) {
          NewsroomAPIGrpc.getGetNewsForUserMethod = getGetNewsForUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNewsForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("GetNewsForUser"))
              .build();
        }
      }
    }
    return getGetNewsForUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse> getStoreNewsArticleImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreNewsArticleImage",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse> getStoreNewsArticleImageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse> getStoreNewsArticleImageMethod;
    if ((getStoreNewsArticleImageMethod = NewsroomAPIGrpc.getStoreNewsArticleImageMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getStoreNewsArticleImageMethod = NewsroomAPIGrpc.getStoreNewsArticleImageMethod) == null) {
          NewsroomAPIGrpc.getStoreNewsArticleImageMethod = getStoreNewsArticleImageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreNewsArticleImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("StoreNewsArticleImage"))
              .build();
        }
      }
    }
    return getStoreNewsArticleImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse> getListImagesForNewsArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListImagesForNewsArticle",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse> getListImagesForNewsArticleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse> getListImagesForNewsArticleMethod;
    if ((getListImagesForNewsArticleMethod = NewsroomAPIGrpc.getListImagesForNewsArticleMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getListImagesForNewsArticleMethod = NewsroomAPIGrpc.getListImagesForNewsArticleMethod) == null) {
          NewsroomAPIGrpc.getListImagesForNewsArticleMethod = getListImagesForNewsArticleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListImagesForNewsArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("ListImagesForNewsArticle"))
              .build();
        }
      }
    }
    return getListImagesForNewsArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse> getUploadNewsArticleImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadNewsArticleImage",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse> getUploadNewsArticleImageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse> getUploadNewsArticleImageMethod;
    if ((getUploadNewsArticleImageMethod = NewsroomAPIGrpc.getUploadNewsArticleImageMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getUploadNewsArticleImageMethod = NewsroomAPIGrpc.getUploadNewsArticleImageMethod) == null) {
          NewsroomAPIGrpc.getUploadNewsArticleImageMethod = getUploadNewsArticleImageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadNewsArticleImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("UploadNewsArticleImage"))
              .build();
        }
      }
    }
    return getUploadNewsArticleImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse> getCreateClientArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClientArticle",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse> getCreateClientArticleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse> getCreateClientArticleMethod;
    if ((getCreateClientArticleMethod = NewsroomAPIGrpc.getCreateClientArticleMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getCreateClientArticleMethod = NewsroomAPIGrpc.getCreateClientArticleMethod) == null) {
          NewsroomAPIGrpc.getCreateClientArticleMethod = getCreateClientArticleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClientArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("CreateClientArticle"))
              .build();
        }
      }
    }
    return getCreateClientArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse> getUpdateClientArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClientArticle",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse> getUpdateClientArticleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse> getUpdateClientArticleMethod;
    if ((getUpdateClientArticleMethod = NewsroomAPIGrpc.getUpdateClientArticleMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getUpdateClientArticleMethod = NewsroomAPIGrpc.getUpdateClientArticleMethod) == null) {
          NewsroomAPIGrpc.getUpdateClientArticleMethod = getUpdateClientArticleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClientArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("UpdateClientArticle"))
              .build();
        }
      }
    }
    return getUpdateClientArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse> getListClientArticlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListClientArticles",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse> getListClientArticlesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse> getListClientArticlesMethod;
    if ((getListClientArticlesMethod = NewsroomAPIGrpc.getListClientArticlesMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getListClientArticlesMethod = NewsroomAPIGrpc.getListClientArticlesMethod) == null) {
          NewsroomAPIGrpc.getListClientArticlesMethod = getListClientArticlesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListClientArticles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("ListClientArticles"))
              .build();
        }
      }
    }
    return getListClientArticlesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse> getCreatePublishedClientArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePublishedClientArticle",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse> getCreatePublishedClientArticleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse> getCreatePublishedClientArticleMethod;
    if ((getCreatePublishedClientArticleMethod = NewsroomAPIGrpc.getCreatePublishedClientArticleMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getCreatePublishedClientArticleMethod = NewsroomAPIGrpc.getCreatePublishedClientArticleMethod) == null) {
          NewsroomAPIGrpc.getCreatePublishedClientArticleMethod = getCreatePublishedClientArticleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePublishedClientArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("CreatePublishedClientArticle"))
              .build();
        }
      }
    }
    return getCreatePublishedClientArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse> getGetPublishedClientArticleByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublishedClientArticleById",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse> getGetPublishedClientArticleByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse> getGetPublishedClientArticleByIdMethod;
    if ((getGetPublishedClientArticleByIdMethod = NewsroomAPIGrpc.getGetPublishedClientArticleByIdMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getGetPublishedClientArticleByIdMethod = NewsroomAPIGrpc.getGetPublishedClientArticleByIdMethod) == null) {
          NewsroomAPIGrpc.getGetPublishedClientArticleByIdMethod = getGetPublishedClientArticleByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublishedClientArticleById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("GetPublishedClientArticleById"))
              .build();
        }
      }
    }
    return getGetPublishedClientArticleByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse> getStoreClientArticleImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreClientArticleImage",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse> getStoreClientArticleImageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse> getStoreClientArticleImageMethod;
    if ((getStoreClientArticleImageMethod = NewsroomAPIGrpc.getStoreClientArticleImageMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getStoreClientArticleImageMethod = NewsroomAPIGrpc.getStoreClientArticleImageMethod) == null) {
          NewsroomAPIGrpc.getStoreClientArticleImageMethod = getStoreClientArticleImageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreClientArticleImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("StoreClientArticleImage"))
              .build();
        }
      }
    }
    return getStoreClientArticleImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse> getListImagesForClientArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListImagesForClientArticle",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse> getListImagesForClientArticleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse> getListImagesForClientArticleMethod;
    if ((getListImagesForClientArticleMethod = NewsroomAPIGrpc.getListImagesForClientArticleMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getListImagesForClientArticleMethod = NewsroomAPIGrpc.getListImagesForClientArticleMethod) == null) {
          NewsroomAPIGrpc.getListImagesForClientArticleMethod = getListImagesForClientArticleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListImagesForClientArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("ListImagesForClientArticle"))
              .build();
        }
      }
    }
    return getListImagesForClientArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse> getUploadClientArticleImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadClientArticleImage",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse> getUploadClientArticleImageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse> getUploadClientArticleImageMethod;
    if ((getUploadClientArticleImageMethod = NewsroomAPIGrpc.getUploadClientArticleImageMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getUploadClientArticleImageMethod = NewsroomAPIGrpc.getUploadClientArticleImageMethod) == null) {
          NewsroomAPIGrpc.getUploadClientArticleImageMethod = getUploadClientArticleImageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadClientArticleImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("UploadClientArticleImage"))
              .build();
        }
      }
    }
    return getUploadClientArticleImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse> getListPublishedClientArticlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPublishedClientArticles",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse> getListPublishedClientArticlesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse> getListPublishedClientArticlesMethod;
    if ((getListPublishedClientArticlesMethod = NewsroomAPIGrpc.getListPublishedClientArticlesMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getListPublishedClientArticlesMethod = NewsroomAPIGrpc.getListPublishedClientArticlesMethod) == null) {
          NewsroomAPIGrpc.getListPublishedClientArticlesMethod = getListPublishedClientArticlesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPublishedClientArticles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("ListPublishedClientArticles"))
              .build();
        }
      }
    }
    return getListPublishedClientArticlesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse> getGetClientArticleByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientArticleById",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse> getGetClientArticleByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse> getGetClientArticleByIdMethod;
    if ((getGetClientArticleByIdMethod = NewsroomAPIGrpc.getGetClientArticleByIdMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getGetClientArticleByIdMethod = NewsroomAPIGrpc.getGetClientArticleByIdMethod) == null) {
          NewsroomAPIGrpc.getGetClientArticleByIdMethod = getGetClientArticleByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest, com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClientArticleById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("GetClientArticleById"))
              .build();
        }
      }
    }
    return getGetClientArticleByIdMethod;
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

    /**
     * <pre>
     * create published article
     * </pre>
     */
    default void createPublishedArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePublishedArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     * list published articles
     * </pre>
     */
    default void listPublishedArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPublishedArticlesMethod(), responseObserver);
    }

    /**
     * <pre>
     * get published article details by the id
     * </pre>
     */
    default void getPublishedArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPublishedArticleByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * user activity updates
     * </pre>
     */
    default void userActivity(com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserActivityMethod(), responseObserver);
    }

    /**
     * <pre>
     * fetch the unseen articles for the user
     * </pre>
     */
    default void getNewsForUser(com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNewsForUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * upload newsroom image for the news article
     * </pre>
     */
    default void storeNewsArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreNewsArticleImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * list newsroom images
     * </pre>
     */
    default void listImagesForNewsArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListImagesForNewsArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     * upload newsroom image for the news article
     * </pre>
     */
    default void uploadNewsArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadNewsArticleImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * create a client managed news article
     * </pre>
     */
    default void createClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClientArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     * update a client managed news article
     * </pre>
     */
    default void updateClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     * list client managed news articles
     * </pre>
     */
    default void listClientArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListClientArticlesMethod(), responseObserver);
    }

    /**
     * <pre>
     * create published client article
     * </pre>
     */
    default void createPublishedClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePublishedClientArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     * get published client article details by the id
     * </pre>
     */
    default void getPublishedClientArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPublishedClientArticleByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * upload newsroom image for the client news article
     * </pre>
     */
    default void storeClientArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreClientArticleImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * list newsroom client images
     * </pre>
     */
    default void listImagesForClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListImagesForClientArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     * upload newsroom image for the client article
     * </pre>
     */
    default void uploadClientArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadClientArticleImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * list published client articles
     * </pre>
     */
    default void listPublishedClientArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPublishedClientArticlesMethod(), responseObserver);
    }

    /**
     * <pre>
     * get client article details by the id
     * </pre>
     */
    default void getClientArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientArticleByIdMethod(), responseObserver);
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

    /**
     * <pre>
     * create published article
     * </pre>
     */
    public void createPublishedArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePublishedArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list published articles
     * </pre>
     */
    public void listPublishedArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPublishedArticlesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get published article details by the id
     * </pre>
     */
    public void getPublishedArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPublishedArticleByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * user activity updates
     * </pre>
     */
    public void userActivity(com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserActivityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * fetch the unseen articles for the user
     * </pre>
     */
    public void getNewsForUser(com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNewsForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * upload newsroom image for the news article
     * </pre>
     */
    public void storeNewsArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreNewsArticleImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list newsroom images
     * </pre>
     */
    public void listImagesForNewsArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListImagesForNewsArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * upload newsroom image for the news article
     * </pre>
     */
    public void uploadNewsArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadNewsArticleImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * create a client managed news article
     * </pre>
     */
    public void createClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClientArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update a client managed news article
     * </pre>
     */
    public void updateClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list client managed news articles
     * </pre>
     */
    public void listClientArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListClientArticlesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * create published client article
     * </pre>
     */
    public void createPublishedClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePublishedClientArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get published client article details by the id
     * </pre>
     */
    public void getPublishedClientArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPublishedClientArticleByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * upload newsroom image for the client news article
     * </pre>
     */
    public void storeClientArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreClientArticleImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list newsroom client images
     * </pre>
     */
    public void listImagesForClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListImagesForClientArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * upload newsroom image for the client article
     * </pre>
     */
    public void uploadClientArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadClientArticleImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list published client articles
     * </pre>
     */
    public void listPublishedClientArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPublishedClientArticlesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get client article details by the id
     * </pre>
     */
    public void getClientArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientArticleByIdMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * create published article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse createPublishedArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePublishedArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list published articles
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse listPublishedArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPublishedArticlesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get published article details by the id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse getPublishedArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPublishedArticleByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * user activity updates
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse userActivity(com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserActivityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * fetch the unseen articles for the user
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse getNewsForUser(com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNewsForUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * upload newsroom image for the news article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse storeNewsArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreNewsArticleImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list newsroom images
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse listImagesForNewsArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListImagesForNewsArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * upload newsroom image for the news article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse uploadNewsArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadNewsArticleImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * create a client managed news article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse createClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClientArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update a client managed news article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse updateClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list client managed news articles
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse listClientArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListClientArticlesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * create published client article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse createPublishedClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePublishedClientArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get published client article details by the id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse getPublishedClientArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPublishedClientArticleByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * upload newsroom image for the client news article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse storeClientArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreClientArticleImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list newsroom client images
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse listImagesForClientArticle(com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListImagesForClientArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * upload newsroom image for the client article
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse uploadClientArticleImage(com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadClientArticleImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list published client articles
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse listPublishedClientArticles(com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPublishedClientArticlesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get client article details by the id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse getClientArticleById(com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientArticleByIdMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * create published article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse> createPublishedArticle(
        com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePublishedArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list published articles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse> listPublishedArticles(
        com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPublishedArticlesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get published article details by the id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse> getPublishedArticleById(
        com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPublishedArticleByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * user activity updates
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse> userActivity(
        com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserActivityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * fetch the unseen articles for the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse> getNewsForUser(
        com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNewsForUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * upload newsroom image for the news article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse> storeNewsArticleImage(
        com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreNewsArticleImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list newsroom images
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse> listImagesForNewsArticle(
        com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListImagesForNewsArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * upload newsroom image for the news article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse> uploadNewsArticleImage(
        com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadNewsArticleImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * create a client managed news article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse> createClientArticle(
        com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClientArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update a client managed news article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse> updateClientArticle(
        com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list client managed news articles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse> listClientArticles(
        com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListClientArticlesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * create published client article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse> createPublishedClientArticle(
        com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePublishedClientArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get published client article details by the id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse> getPublishedClientArticleById(
        com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPublishedClientArticleByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * upload newsroom image for the client news article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse> storeClientArticleImage(
        com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreClientArticleImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list newsroom client images
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse> listImagesForClientArticle(
        com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListImagesForClientArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * upload newsroom image for the client article
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse> uploadClientArticleImage(
        com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadClientArticleImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list published client articles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse> listPublishedClientArticles(
        com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPublishedClientArticlesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get client article details by the id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse> getClientArticleById(
        com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientArticleByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NEWS_ARTICLE = 0;
  private static final int METHODID_LIST_NEWS_ARTICLES = 1;
  private static final int METHODID_GET_NEWS_ARTICLE_BY_ID = 2;
  private static final int METHODID_UPDATE_NEWS_ARTICLE = 3;
  private static final int METHODID_CREATE_PUBLISHED_ARTICLE = 4;
  private static final int METHODID_LIST_PUBLISHED_ARTICLES = 5;
  private static final int METHODID_GET_PUBLISHED_ARTICLE_BY_ID = 6;
  private static final int METHODID_USER_ACTIVITY = 7;
  private static final int METHODID_GET_NEWS_FOR_USER = 8;
  private static final int METHODID_STORE_NEWS_ARTICLE_IMAGE = 9;
  private static final int METHODID_LIST_IMAGES_FOR_NEWS_ARTICLE = 10;
  private static final int METHODID_UPLOAD_NEWS_ARTICLE_IMAGE = 11;
  private static final int METHODID_CREATE_CLIENT_ARTICLE = 12;
  private static final int METHODID_UPDATE_CLIENT_ARTICLE = 13;
  private static final int METHODID_LIST_CLIENT_ARTICLES = 14;
  private static final int METHODID_CREATE_PUBLISHED_CLIENT_ARTICLE = 15;
  private static final int METHODID_GET_PUBLISHED_CLIENT_ARTICLE_BY_ID = 16;
  private static final int METHODID_STORE_CLIENT_ARTICLE_IMAGE = 17;
  private static final int METHODID_LIST_IMAGES_FOR_CLIENT_ARTICLE = 18;
  private static final int METHODID_UPLOAD_CLIENT_ARTICLE_IMAGE = 19;
  private static final int METHODID_LIST_PUBLISHED_CLIENT_ARTICLES = 20;
  private static final int METHODID_GET_CLIENT_ARTICLE_BY_ID = 21;

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
        case METHODID_CREATE_PUBLISHED_ARTICLE:
          serviceImpl.createPublishedArticle((com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse>) responseObserver);
          break;
        case METHODID_LIST_PUBLISHED_ARTICLES:
          serviceImpl.listPublishedArticles((com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse>) responseObserver);
          break;
        case METHODID_GET_PUBLISHED_ARTICLE_BY_ID:
          serviceImpl.getPublishedArticleById((com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse>) responseObserver);
          break;
        case METHODID_USER_ACTIVITY:
          serviceImpl.userActivity((com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse>) responseObserver);
          break;
        case METHODID_GET_NEWS_FOR_USER:
          serviceImpl.getNewsForUser((com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse>) responseObserver);
          break;
        case METHODID_STORE_NEWS_ARTICLE_IMAGE:
          serviceImpl.storeNewsArticleImage((com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse>) responseObserver);
          break;
        case METHODID_LIST_IMAGES_FOR_NEWS_ARTICLE:
          serviceImpl.listImagesForNewsArticle((com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_NEWS_ARTICLE_IMAGE:
          serviceImpl.uploadNewsArticleImage((com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLIENT_ARTICLE:
          serviceImpl.createClientArticle((com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT_ARTICLE:
          serviceImpl.updateClientArticle((com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse>) responseObserver);
          break;
        case METHODID_LIST_CLIENT_ARTICLES:
          serviceImpl.listClientArticles((com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse>) responseObserver);
          break;
        case METHODID_CREATE_PUBLISHED_CLIENT_ARTICLE:
          serviceImpl.createPublishedClientArticle((com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse>) responseObserver);
          break;
        case METHODID_GET_PUBLISHED_CLIENT_ARTICLE_BY_ID:
          serviceImpl.getPublishedClientArticleById((com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse>) responseObserver);
          break;
        case METHODID_STORE_CLIENT_ARTICLE_IMAGE:
          serviceImpl.storeClientArticleImage((com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse>) responseObserver);
          break;
        case METHODID_LIST_IMAGES_FOR_CLIENT_ARTICLE:
          serviceImpl.listImagesForClientArticle((com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_CLIENT_ARTICLE_IMAGE:
          serviceImpl.uploadClientArticleImage((com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse>) responseObserver);
          break;
        case METHODID_LIST_PUBLISHED_CLIENT_ARTICLES:
          serviceImpl.listPublishedClientArticles((com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT_ARTICLE_BY_ID:
          serviceImpl.getClientArticleById((com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse>) responseObserver);
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
        .addMethod(
          getCreatePublishedArticleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedArticleResponse>(
                service, METHODID_CREATE_PUBLISHED_ARTICLE)))
        .addMethod(
          getListPublishedArticlesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedArticlesResponse>(
                service, METHODID_LIST_PUBLISHED_ARTICLES)))
        .addMethod(
          getGetPublishedArticleByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdResponse>(
                service, METHODID_GET_PUBLISHED_ARTICLE_BY_ID)))
        .addMethod(
          getUserActivityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.UserActivityResponse>(
                service, METHODID_USER_ACTIVITY)))
        .addMethod(
          getGetNewsForUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetNewsForUserResponse>(
                service, METHODID_GET_NEWS_FOR_USER)))
        .addMethod(
          getStoreNewsArticleImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.StoreNewsArticleImageResponse>(
                service, METHODID_STORE_NEWS_ARTICLE_IMAGE)))
        .addMethod(
          getListImagesForNewsArticleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForNewsArticleResponse>(
                service, METHODID_LIST_IMAGES_FOR_NEWS_ARTICLE)))
        .addMethod(
          getUploadNewsArticleImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.UploadNewsArticleImageResponse>(
                service, METHODID_UPLOAD_NEWS_ARTICLE_IMAGE)))
        .addMethod(
          getCreateClientArticleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.CreateClientArticleResponse>(
                service, METHODID_CREATE_CLIENT_ARTICLE)))
        .addMethod(
          getUpdateClientArticleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.UpdateClientArticleResponse>(
                service, METHODID_UPDATE_CLIENT_ARTICLE)))
        .addMethod(
          getListClientArticlesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListClientArticlesResponse>(
                service, METHODID_LIST_CLIENT_ARTICLES)))
        .addMethod(
          getCreatePublishedClientArticleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.CreatePublishedClientArticleResponse>(
                service, METHODID_CREATE_PUBLISHED_CLIENT_ARTICLE)))
        .addMethod(
          getGetPublishedClientArticleByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedClientArticleByIdResponse>(
                service, METHODID_GET_PUBLISHED_CLIENT_ARTICLE_BY_ID)))
        .addMethod(
          getStoreClientArticleImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.StoreClientArticleImageResponse>(
                service, METHODID_STORE_CLIENT_ARTICLE_IMAGE)))
        .addMethod(
          getListImagesForClientArticleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListImagesForClientArticleResponse>(
                service, METHODID_LIST_IMAGES_FOR_CLIENT_ARTICLE)))
        .addMethod(
          getUploadClientArticleImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.UploadClientArticleImageResponse>(
                service, METHODID_UPLOAD_CLIENT_ARTICLE_IMAGE)))
        .addMethod(
          getListPublishedClientArticlesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.ListPublishedClientArticlesResponse>(
                service, METHODID_LIST_PUBLISHED_CLIENT_ARTICLES)))
        .addMethod(
          getGetClientArticleByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdRequest,
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetClientArticleByIdResponse>(
                service, METHODID_GET_CLIENT_ARTICLE_BY_ID)))
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
              .addMethod(getCreatePublishedArticleMethod())
              .addMethod(getListPublishedArticlesMethod())
              .addMethod(getGetPublishedArticleByIdMethod())
              .addMethod(getUserActivityMethod())
              .addMethod(getGetNewsForUserMethod())
              .addMethod(getStoreNewsArticleImageMethod())
              .addMethod(getListImagesForNewsArticleMethod())
              .addMethod(getUploadNewsArticleImageMethod())
              .addMethod(getCreateClientArticleMethod())
              .addMethod(getUpdateClientArticleMethod())
              .addMethod(getListClientArticlesMethod())
              .addMethod(getCreatePublishedClientArticleMethod())
              .addMethod(getGetPublishedClientArticleByIdMethod())
              .addMethod(getStoreClientArticleImageMethod())
              .addMethod(getListImagesForClientArticleMethod())
              .addMethod(getUploadClientArticleImageMethod())
              .addMethod(getListPublishedClientArticlesMethod())
              .addMethod(getGetClientArticleByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
