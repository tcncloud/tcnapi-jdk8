package com.tcn.cloud.api.api.v1alpha1.insights;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.0)",
    comments = "Source: api/v1alpha1/insights/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InsightsGrpc {

  private InsightsGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.insights.Insights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateInsightMethod;
    if ((getCreateInsightMethod = InsightsGrpc.getCreateInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getCreateInsightMethod = InsightsGrpc.getCreateInsightMethod) == null) {
          InsightsGrpc.getCreateInsightMethod = getCreateInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("CreateInsight"))
              .build();
        }
      }
    }
    return getCreateInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> getListInsightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInsights",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> getListInsightsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> getListInsightsMethod;
    if ((getListInsightsMethod = InsightsGrpc.getListInsightsMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getListInsightsMethod = InsightsGrpc.getListInsightsMethod) == null) {
          InsightsGrpc.getListInsightsMethod = getListInsightsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInsights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("ListInsights"))
              .build();
        }
      }
    }
    return getListInsightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateInsightMethod;
    if ((getUpdateInsightMethod = InsightsGrpc.getUpdateInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getUpdateInsightMethod = InsightsGrpc.getUpdateInsightMethod) == null) {
          InsightsGrpc.getUpdateInsightMethod = getUpdateInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("UpdateInsight"))
              .build();
        }
      }
    }
    return getUpdateInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteInsightMethod;
    if ((getDeleteInsightMethod = InsightsGrpc.getDeleteInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getDeleteInsightMethod = InsightsGrpc.getDeleteInsightMethod) == null) {
          InsightsGrpc.getDeleteInsightMethod = getDeleteInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("DeleteInsight"))
              .build();
        }
      }
    }
    return getDeleteInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> getGetInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> getGetInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> getGetInsightMethod;
    if ((getGetInsightMethod = InsightsGrpc.getGetInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getGetInsightMethod = InsightsGrpc.getGetInsightMethod) == null) {
          InsightsGrpc.getGetInsightMethod = getGetInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("GetInsight"))
              .build();
        }
      }
    }
    return getGetInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateCommonsInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCommonsInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateCommonsInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateCommonsInsightMethod;
    if ((getCreateCommonsInsightMethod = InsightsGrpc.getCreateCommonsInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getCreateCommonsInsightMethod = InsightsGrpc.getCreateCommonsInsightMethod) == null) {
          InsightsGrpc.getCreateCommonsInsightMethod = getCreateCommonsInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCommonsInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("CreateCommonsInsight"))
              .build();
        }
      }
    }
    return getCreateCommonsInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateCommonsInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCommonsInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateCommonsInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateCommonsInsightMethod;
    if ((getUpdateCommonsInsightMethod = InsightsGrpc.getUpdateCommonsInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getUpdateCommonsInsightMethod = InsightsGrpc.getUpdateCommonsInsightMethod) == null) {
          InsightsGrpc.getUpdateCommonsInsightMethod = getUpdateCommonsInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCommonsInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("UpdateCommonsInsight"))
              .build();
        }
      }
    }
    return getUpdateCommonsInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteCommonsInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCommonsInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteCommonsInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteCommonsInsightMethod;
    if ((getDeleteCommonsInsightMethod = InsightsGrpc.getDeleteCommonsInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getDeleteCommonsInsightMethod = InsightsGrpc.getDeleteCommonsInsightMethod) == null) {
          InsightsGrpc.getDeleteCommonsInsightMethod = getDeleteCommonsInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCommonsInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("DeleteCommonsInsight"))
              .build();
        }
      }
    }
    return getDeleteCommonsInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> getGetVfsSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVfsSchema",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> getGetVfsSchemaMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> getGetVfsSchemaMethod;
    if ((getGetVfsSchemaMethod = InsightsGrpc.getGetVfsSchemaMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getGetVfsSchemaMethod = InsightsGrpc.getGetVfsSchemaMethod) == null) {
          InsightsGrpc.getGetVfsSchemaMethod = getGetVfsSchemaMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVfsSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("GetVfsSchema"))
              .build();
        }
      }
    }
    return getGetVfsSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> getListVfsesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVfses",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> getListVfsesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> getListVfsesMethod;
    if ((getListVfsesMethod = InsightsGrpc.getListVfsesMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getListVfsesMethod = InsightsGrpc.getListVfsesMethod) == null) {
          InsightsGrpc.getListVfsesMethod = getListVfsesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVfses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("ListVfses"))
              .build();
        }
      }
    }
    return getListVfsesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InsightsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InsightsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InsightsStub>() {
        @java.lang.Override
        public InsightsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InsightsStub(channel, callOptions);
        }
      };
    return InsightsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InsightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InsightsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InsightsBlockingStub>() {
        @java.lang.Override
        public InsightsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InsightsBlockingStub(channel, callOptions);
        }
      };
    return InsightsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InsightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InsightsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InsightsFutureStub>() {
        @java.lang.Override
        public InsightsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InsightsFutureStub(channel, callOptions);
        }
      };
    return InsightsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InsightsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateInsight creates a new insight
     * </pre>
     */
    public void createInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListInsights lists insights
     * </pre>
     */
    public void listInsights(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInsightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateInsight updates an existing insight
     * </pre>
     */
    public void updateInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteInsight deletes a insight
     * </pre>
     */
    public void deleteInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetInsight gets a insight by id
     * </pre>
     */
    public void getInsight(com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateCommonsInsight creates a common library insight
     * </pre>
     */
    public void createCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommonsInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCommonsInsight updates a common library insight
     * </pre>
     */
    public void updateCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCommonsInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCommonsInsight deletes a common library insight
     * </pre>
     */
    public void deleteCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommonsInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetVfsSchema gets schema for a vfs
     * </pre>
     */
    public void getVfsSchema(com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVfsSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public void listVfses(com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVfsesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateInsightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>(
                  this, METHODID_CREATE_INSIGHT)))
          .addMethod(
            getListInsightsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse>(
                  this, METHODID_LIST_INSIGHTS)))
          .addMethod(
            getUpdateInsightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>(
                  this, METHODID_UPDATE_INSIGHT)))
          .addMethod(
            getDeleteInsightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>(
                  this, METHODID_DELETE_INSIGHT)))
          .addMethod(
            getGetInsightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse>(
                  this, METHODID_GET_INSIGHT)))
          .addMethod(
            getCreateCommonsInsightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>(
                  this, METHODID_CREATE_COMMONS_INSIGHT)))
          .addMethod(
            getUpdateCommonsInsightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>(
                  this, METHODID_UPDATE_COMMONS_INSIGHT)))
          .addMethod(
            getDeleteCommonsInsightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>(
                  this, METHODID_DELETE_COMMONS_INSIGHT)))
          .addMethod(
            getGetVfsSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse>(
                  this, METHODID_GET_VFS_SCHEMA)))
          .addMethod(
            getListVfsesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest,
                com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse>(
                  this, METHODID_LIST_VFSES)))
          .build();
    }
  }

  /**
   */
  public static final class InsightsStub extends io.grpc.stub.AbstractAsyncStub<InsightsStub> {
    private InsightsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InsightsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InsightsStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateInsight creates a new insight
     * </pre>
     */
    public void createInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListInsights lists insights
     * </pre>
     */
    public void listInsights(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInsightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateInsight updates an existing insight
     * </pre>
     */
    public void updateInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteInsight deletes a insight
     * </pre>
     */
    public void deleteInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetInsight gets a insight by id
     * </pre>
     */
    public void getInsight(com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateCommonsInsight creates a common library insight
     * </pre>
     */
    public void createCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommonsInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCommonsInsight updates a common library insight
     * </pre>
     */
    public void updateCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCommonsInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCommonsInsight deletes a common library insight
     * </pre>
     */
    public void deleteCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommonsInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetVfsSchema gets schema for a vfs
     * </pre>
     */
    public void getVfsSchema(com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVfsSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public void listVfses(com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVfsesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InsightsBlockingStub extends io.grpc.stub.AbstractBlockingStub<InsightsBlockingStub> {
    private InsightsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InsightsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InsightsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateInsight creates a new insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse createInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListInsights lists insights
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse listInsights(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateInsight updates an existing insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse updateInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteInsight deletes a insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse deleteInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetInsight gets a insight by id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse getInsight(com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateCommonsInsight creates a common library insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse createCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommonsInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCommonsInsight updates a common library insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse updateCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCommonsInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCommonsInsight deletes a common library insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse deleteCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommonsInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetVfsSchema gets schema for a vfs
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse getVfsSchema(com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVfsSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse listVfses(com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVfsesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InsightsFutureStub extends io.grpc.stub.AbstractFutureStub<InsightsFutureStub> {
    private InsightsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InsightsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InsightsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateInsight creates a new insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> createInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListInsights lists insights
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> listInsights(
        com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInsightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateInsight updates an existing insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> updateInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteInsight deletes a insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> deleteInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetInsight gets a insight by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> getInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateCommonsInsight creates a common library insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> createCommonsInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommonsInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCommonsInsight updates a common library insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> updateCommonsInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCommonsInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCommonsInsight deletes a common library insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> deleteCommonsInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommonsInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetVfsSchema gets schema for a vfs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> getVfsSchema(
        com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVfsSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> listVfses(
        com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVfsesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INSIGHT = 0;
  private static final int METHODID_LIST_INSIGHTS = 1;
  private static final int METHODID_UPDATE_INSIGHT = 2;
  private static final int METHODID_DELETE_INSIGHT = 3;
  private static final int METHODID_GET_INSIGHT = 4;
  private static final int METHODID_CREATE_COMMONS_INSIGHT = 5;
  private static final int METHODID_UPDATE_COMMONS_INSIGHT = 6;
  private static final int METHODID_DELETE_COMMONS_INSIGHT = 7;
  private static final int METHODID_GET_VFS_SCHEMA = 8;
  private static final int METHODID_LIST_VFSES = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InsightsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InsightsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_INSIGHT:
          serviceImpl.createInsight((com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>) responseObserver);
          break;
        case METHODID_LIST_INSIGHTS:
          serviceImpl.listInsights((com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INSIGHT:
          serviceImpl.updateInsight((com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>) responseObserver);
          break;
        case METHODID_DELETE_INSIGHT:
          serviceImpl.deleteInsight((com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>) responseObserver);
          break;
        case METHODID_GET_INSIGHT:
          serviceImpl.getInsight((com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse>) responseObserver);
          break;
        case METHODID_CREATE_COMMONS_INSIGHT:
          serviceImpl.createCommonsInsight((com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMMONS_INSIGHT:
          serviceImpl.updateCommonsInsight((com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMMONS_INSIGHT:
          serviceImpl.deleteCommonsInsight((com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>) responseObserver);
          break;
        case METHODID_GET_VFS_SCHEMA:
          serviceImpl.getVfsSchema((com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse>) responseObserver);
          break;
        case METHODID_LIST_VFSES:
          serviceImpl.listVfses((com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse>) responseObserver);
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

  private static abstract class InsightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InsightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Insights");
    }
  }

  private static final class InsightsFileDescriptorSupplier
      extends InsightsBaseDescriptorSupplier {
    InsightsFileDescriptorSupplier() {}
  }

  private static final class InsightsMethodDescriptorSupplier
      extends InsightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InsightsMethodDescriptorSupplier(String methodName) {
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
      synchronized (InsightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InsightsFileDescriptorSupplier())
              .addMethod(getCreateInsightMethod())
              .addMethod(getListInsightsMethod())
              .addMethod(getUpdateInsightMethod())
              .addMethod(getDeleteInsightMethod())
              .addMethod(getGetInsightMethod())
              .addMethod(getCreateCommonsInsightMethod())
              .addMethod(getUpdateCommonsInsightMethod())
              .addMethod(getDeleteCommonsInsightMethod())
              .addMethod(getGetVfsSchemaMethod())
              .addMethod(getListVfsesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
