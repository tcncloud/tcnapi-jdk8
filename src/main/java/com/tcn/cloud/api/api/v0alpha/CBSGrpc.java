package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.0)",
    comments = "Source: api/v0alpha/cbs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CBSGrpc {

  private CBSGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v0alpha.CBS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq,
      com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes> getCreateServiceIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceId",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq,
      com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes> getCreateServiceIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq, com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes> getCreateServiceIdMethod;
    if ((getCreateServiceIdMethod = CBSGrpc.getCreateServiceIdMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getCreateServiceIdMethod = CBSGrpc.getCreateServiceIdMethod) == null) {
          CBSGrpc.getCreateServiceIdMethod = getCreateServiceIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq, com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("CreateServiceId"))
              .build();
        }
      }
    }
    return getCreateServiceIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq,
      com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes> getCreateCallbackWithDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCallbackWithDetails",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq,
      com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes> getCreateCallbackWithDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq, com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes> getCreateCallbackWithDetailsMethod;
    if ((getCreateCallbackWithDetailsMethod = CBSGrpc.getCreateCallbackWithDetailsMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getCreateCallbackWithDetailsMethod = CBSGrpc.getCreateCallbackWithDetailsMethod) == null) {
          CBSGrpc.getCreateCallbackWithDetailsMethod = getCreateCallbackWithDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq, com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCallbackWithDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("CreateCallbackWithDetails"))
              .build();
        }
      }
    }
    return getCreateCallbackWithDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes> getUpdateScheduledCallbackToReadyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScheduledCallbackToReady",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes> getUpdateScheduledCallbackToReadyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes> getUpdateScheduledCallbackToReadyMethod;
    if ((getUpdateScheduledCallbackToReadyMethod = CBSGrpc.getUpdateScheduledCallbackToReadyMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getUpdateScheduledCallbackToReadyMethod = CBSGrpc.getUpdateScheduledCallbackToReadyMethod) == null) {
          CBSGrpc.getUpdateScheduledCallbackToReadyMethod = getUpdateScheduledCallbackToReadyMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScheduledCallbackToReady"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("UpdateScheduledCallbackToReady"))
              .build();
        }
      }
    }
    return getUpdateScheduledCallbackToReadyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes> getUpdateScheduledCallbackToCanceledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScheduledCallbackToCanceled",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes> getUpdateScheduledCallbackToCanceledMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes> getUpdateScheduledCallbackToCanceledMethod;
    if ((getUpdateScheduledCallbackToCanceledMethod = CBSGrpc.getUpdateScheduledCallbackToCanceledMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getUpdateScheduledCallbackToCanceledMethod = CBSGrpc.getUpdateScheduledCallbackToCanceledMethod) == null) {
          CBSGrpc.getUpdateScheduledCallbackToCanceledMethod = getUpdateScheduledCallbackToCanceledMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScheduledCallbackToCanceled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("UpdateScheduledCallbackToCanceled"))
              .build();
        }
      }
    }
    return getUpdateScheduledCallbackToCanceledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq,
      com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes> getGetNextScheduledCallbackWithDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextScheduledCallbackWithDetails",
      requestType = com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq,
      com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes> getGetNextScheduledCallbackWithDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq, com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes> getGetNextScheduledCallbackWithDetailsMethod;
    if ((getGetNextScheduledCallbackWithDetailsMethod = CBSGrpc.getGetNextScheduledCallbackWithDetailsMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getGetNextScheduledCallbackWithDetailsMethod = CBSGrpc.getGetNextScheduledCallbackWithDetailsMethod) == null) {
          CBSGrpc.getGetNextScheduledCallbackWithDetailsMethod = getGetNextScheduledCallbackWithDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq, com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextScheduledCallbackWithDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("GetNextScheduledCallbackWithDetails"))
              .build();
        }
      }
    }
    return getGetNextScheduledCallbackWithDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes> getUpdateScheduledCallbackToClosedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScheduledCallbackToClosed",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes> getUpdateScheduledCallbackToClosedMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes> getUpdateScheduledCallbackToClosedMethod;
    if ((getUpdateScheduledCallbackToClosedMethod = CBSGrpc.getUpdateScheduledCallbackToClosedMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getUpdateScheduledCallbackToClosedMethod = CBSGrpc.getUpdateScheduledCallbackToClosedMethod) == null) {
          CBSGrpc.getUpdateScheduledCallbackToClosedMethod = getUpdateScheduledCallbackToClosedMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScheduledCallbackToClosed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("UpdateScheduledCallbackToClosed"))
              .build();
        }
      }
    }
    return getUpdateScheduledCallbackToClosedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes> getUpdateScheduledCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScheduledCallback",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes> getUpdateScheduledCallbackMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes> getUpdateScheduledCallbackMethod;
    if ((getUpdateScheduledCallbackMethod = CBSGrpc.getUpdateScheduledCallbackMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getUpdateScheduledCallbackMethod = CBSGrpc.getUpdateScheduledCallbackMethod) == null) {
          CBSGrpc.getUpdateScheduledCallbackMethod = getUpdateScheduledCallbackMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScheduledCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("UpdateScheduledCallback"))
              .build();
        }
      }
    }
    return getUpdateScheduledCallbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq,
      com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes> getGetScheduledCallbackWithDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScheduledCallbackWithDetails",
      requestType = com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq,
      com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes> getGetScheduledCallbackWithDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq, com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes> getGetScheduledCallbackWithDetailsMethod;
    if ((getGetScheduledCallbackWithDetailsMethod = CBSGrpc.getGetScheduledCallbackWithDetailsMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getGetScheduledCallbackWithDetailsMethod = CBSGrpc.getGetScheduledCallbackWithDetailsMethod) == null) {
          CBSGrpc.getGetScheduledCallbackWithDetailsMethod = getGetScheduledCallbackWithDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq, com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScheduledCallbackWithDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("GetScheduledCallbackWithDetails"))
              .build();
        }
      }
    }
    return getGetScheduledCallbackWithDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq,
      com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> getListScheduledCallbacksWithDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScheduledCallbacksWithDetails",
      requestType = com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq,
      com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> getListScheduledCallbacksWithDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq, com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> getListScheduledCallbacksWithDetailsMethod;
    if ((getListScheduledCallbacksWithDetailsMethod = CBSGrpc.getListScheduledCallbacksWithDetailsMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getListScheduledCallbacksWithDetailsMethod = CBSGrpc.getListScheduledCallbacksWithDetailsMethod) == null) {
          CBSGrpc.getListScheduledCallbacksWithDetailsMethod = getListScheduledCallbacksWithDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq, com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScheduledCallbacksWithDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("ListScheduledCallbacksWithDetails"))
              .build();
        }
      }
    }
    return getListScheduledCallbacksWithDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq,
      com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> getListScheduledCallbacksWithDetailsBySkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScheduledCallbacksWithDetailsBySkills",
      requestType = com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq,
      com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> getListScheduledCallbacksWithDetailsBySkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq, com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> getListScheduledCallbacksWithDetailsBySkillsMethod;
    if ((getListScheduledCallbacksWithDetailsBySkillsMethod = CBSGrpc.getListScheduledCallbacksWithDetailsBySkillsMethod) == null) {
      synchronized (CBSGrpc.class) {
        if ((getListScheduledCallbacksWithDetailsBySkillsMethod = CBSGrpc.getListScheduledCallbacksWithDetailsBySkillsMethod) == null) {
          CBSGrpc.getListScheduledCallbacksWithDetailsBySkillsMethod = getListScheduledCallbacksWithDetailsBySkillsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq, com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScheduledCallbacksWithDetailsBySkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes.getDefaultInstance()))
              .setSchemaDescriptor(new CBSMethodDescriptorSupplier("ListScheduledCallbacksWithDetailsBySkills"))
              .build();
        }
      }
    }
    return getListScheduledCallbacksWithDetailsBySkillsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CBSStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CBSStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CBSStub>() {
        @java.lang.Override
        public CBSStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CBSStub(channel, callOptions);
        }
      };
    return CBSStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CBSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CBSBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CBSBlockingStub>() {
        @java.lang.Override
        public CBSBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CBSBlockingStub(channel, callOptions);
        }
      };
    return CBSBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CBSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CBSFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CBSFutureStub>() {
        @java.lang.Override
        public CBSFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CBSFutureStub(channel, callOptions);
        }
      };
    return CBSFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createServiceId(com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceIdMethod(), responseObserver);
    }

    /**
     */
    default void createCallbackWithDetails(com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCallbackWithDetailsMethod(), responseObserver);
    }

    /**
     */
    default void updateScheduledCallbackToReady(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScheduledCallbackToReadyMethod(), responseObserver);
    }

    /**
     */
    default void updateScheduledCallbackToCanceled(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScheduledCallbackToCanceledMethod(), responseObserver);
    }

    /**
     * <pre>
     * Skills that are a matching subset of the ones provided in the request.
     * If a callback is found the status of the callback is set to OPEN.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the service_id provided in the request is invalid.
     *   - grpc.NotFound: no matching service_id is found.
     *                    callback is not found after updating the status of it to OPEN (shouldn't happen).
     * </pre>
     */
    default void getNextScheduledCallbackWithDetails(com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNextScheduledCallbackWithDetailsMethod(), responseObserver);
    }

    /**
     */
    default void updateScheduledCallbackToClosed(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScheduledCallbackToClosedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a callback with the provided info, and replaces the details with the ones provided.
     * </pre>
     */
    default void updateScheduledCallback(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScheduledCallbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a scheduled callback's info and it's details for the given scheduled_callback_id.
     * </pre>
     */
    default void getScheduledCallbackWithDetails(com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScheduledCallbackWithDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists callbacks by phone number, caller id, or time range
     * </pre>
     */
    default void listScheduledCallbacksWithDetails(com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListScheduledCallbacksWithDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List callbacks by skills
     * </pre>
     */
    default void listScheduledCallbacksWithDetailsBySkills(com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListScheduledCallbacksWithDetailsBySkillsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CBS.
   */
  public static abstract class CBSImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CBSGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CBS.
   */
  public static final class CBSStub
      extends io.grpc.stub.AbstractAsyncStub<CBSStub> {
    private CBSStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CBSStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CBSStub(channel, callOptions);
    }

    /**
     */
    public void createServiceId(com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCallbackWithDetails(com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCallbackWithDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateScheduledCallbackToReady(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScheduledCallbackToReadyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateScheduledCallbackToCanceled(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScheduledCallbackToCanceledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Skills that are a matching subset of the ones provided in the request.
     * If a callback is found the status of the callback is set to OPEN.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the service_id provided in the request is invalid.
     *   - grpc.NotFound: no matching service_id is found.
     *                    callback is not found after updating the status of it to OPEN (shouldn't happen).
     * </pre>
     */
    public void getNextScheduledCallbackWithDetails(com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNextScheduledCallbackWithDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateScheduledCallbackToClosed(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScheduledCallbackToClosedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a callback with the provided info, and replaces the details with the ones provided.
     * </pre>
     */
    public void updateScheduledCallback(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScheduledCallbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a scheduled callback's info and it's details for the given scheduled_callback_id.
     * </pre>
     */
    public void getScheduledCallbackWithDetails(com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScheduledCallbackWithDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists callbacks by phone number, caller id, or time range
     * </pre>
     */
    public void listScheduledCallbacksWithDetails(com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListScheduledCallbacksWithDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List callbacks by skills
     * </pre>
     */
    public void listScheduledCallbacksWithDetailsBySkills(com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListScheduledCallbacksWithDetailsBySkillsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CBS.
   */
  public static final class CBSBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CBSBlockingStub> {
    private CBSBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CBSBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CBSBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes createServiceId(com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes createCallbackWithDetails(com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCallbackWithDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes updateScheduledCallbackToReady(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScheduledCallbackToReadyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes updateScheduledCallbackToCanceled(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScheduledCallbackToCanceledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Skills that are a matching subset of the ones provided in the request.
     * If a callback is found the status of the callback is set to OPEN.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the service_id provided in the request is invalid.
     *   - grpc.NotFound: no matching service_id is found.
     *                    callback is not found after updating the status of it to OPEN (shouldn't happen).
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes getNextScheduledCallbackWithDetails(com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNextScheduledCallbackWithDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes updateScheduledCallbackToClosed(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScheduledCallbackToClosedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a callback with the provided info, and replaces the details with the ones provided.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes updateScheduledCallback(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScheduledCallbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a scheduled callback's info and it's details for the given scheduled_callback_id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes getScheduledCallbackWithDetails(com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScheduledCallbackWithDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists callbacks by phone number, caller id, or time range
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> listScheduledCallbacksWithDetails(
        com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListScheduledCallbacksWithDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List callbacks by skills
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes listScheduledCallbacksWithDetailsBySkills(com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListScheduledCallbacksWithDetailsBySkillsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CBS.
   */
  public static final class CBSFutureStub
      extends io.grpc.stub.AbstractFutureStub<CBSFutureStub> {
    private CBSFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CBSFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CBSFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes> createServiceId(
        com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes> createCallbackWithDetails(
        com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCallbackWithDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes> updateScheduledCallbackToReady(
        com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScheduledCallbackToReadyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes> updateScheduledCallbackToCanceled(
        com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScheduledCallbackToCanceledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Skills that are a matching subset of the ones provided in the request.
     * If a callback is found the status of the callback is set to OPEN.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the service_id provided in the request is invalid.
     *   - grpc.NotFound: no matching service_id is found.
     *                    callback is not found after updating the status of it to OPEN (shouldn't happen).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes> getNextScheduledCallbackWithDetails(
        com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNextScheduledCallbackWithDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes> updateScheduledCallbackToClosed(
        com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScheduledCallbackToClosedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a callback with the provided info, and replaces the details with the ones provided.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes> updateScheduledCallback(
        com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScheduledCallbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a scheduled callback's info and it's details for the given scheduled_callback_id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes> getScheduledCallbackWithDetails(
        com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScheduledCallbackWithDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List callbacks by skills
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes> listScheduledCallbacksWithDetailsBySkills(
        com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListScheduledCallbacksWithDetailsBySkillsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SERVICE_ID = 0;
  private static final int METHODID_CREATE_CALLBACK_WITH_DETAILS = 1;
  private static final int METHODID_UPDATE_SCHEDULED_CALLBACK_TO_READY = 2;
  private static final int METHODID_UPDATE_SCHEDULED_CALLBACK_TO_CANCELED = 3;
  private static final int METHODID_GET_NEXT_SCHEDULED_CALLBACK_WITH_DETAILS = 4;
  private static final int METHODID_UPDATE_SCHEDULED_CALLBACK_TO_CLOSED = 5;
  private static final int METHODID_UPDATE_SCHEDULED_CALLBACK = 6;
  private static final int METHODID_GET_SCHEDULED_CALLBACK_WITH_DETAILS = 7;
  private static final int METHODID_LIST_SCHEDULED_CALLBACKS_WITH_DETAILS = 8;
  private static final int METHODID_LIST_SCHEDULED_CALLBACKS_WITH_DETAILS_BY_SKILLS = 9;

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
        case METHODID_CREATE_SERVICE_ID:
          serviceImpl.createServiceId((com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes>) responseObserver);
          break;
        case METHODID_CREATE_CALLBACK_WITH_DETAILS:
          serviceImpl.createCallbackWithDetails((com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULED_CALLBACK_TO_READY:
          serviceImpl.updateScheduledCallbackToReady((com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULED_CALLBACK_TO_CANCELED:
          serviceImpl.updateScheduledCallbackToCanceled((com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes>) responseObserver);
          break;
        case METHODID_GET_NEXT_SCHEDULED_CALLBACK_WITH_DETAILS:
          serviceImpl.getNextScheduledCallbackWithDetails((com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULED_CALLBACK_TO_CLOSED:
          serviceImpl.updateScheduledCallbackToClosed((com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULED_CALLBACK:
          serviceImpl.updateScheduledCallback((com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes>) responseObserver);
          break;
        case METHODID_GET_SCHEDULED_CALLBACK_WITH_DETAILS:
          serviceImpl.getScheduledCallbackWithDetails((com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes>) responseObserver);
          break;
        case METHODID_LIST_SCHEDULED_CALLBACKS_WITH_DETAILS:
          serviceImpl.listScheduledCallbacksWithDetails((com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes>) responseObserver);
          break;
        case METHODID_LIST_SCHEDULED_CALLBACKS_WITH_DETAILS_BY_SKILLS:
          serviceImpl.listScheduledCallbacksWithDetailsBySkills((com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes>) responseObserver);
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
          getCreateServiceIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateServiceIdReq,
              com.tcn.cloud.api.api.v0alpha.CreateServiceIdRes>(
                service, METHODID_CREATE_SERVICE_ID)))
        .addMethod(
          getCreateCallbackWithDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsReq,
              com.tcn.cloud.api.api.v0alpha.CreateCallbackWithDetailsRes>(
                service, METHODID_CREATE_CALLBACK_WITH_DETAILS)))
        .addMethod(
          getUpdateScheduledCallbackToReadyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq,
              com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyRes>(
                service, METHODID_UPDATE_SCHEDULED_CALLBACK_TO_READY)))
        .addMethod(
          getUpdateScheduledCallbackToCanceledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledReq,
              com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToCanceledRes>(
                service, METHODID_UPDATE_SCHEDULED_CALLBACK_TO_CANCELED)))
        .addMethod(
          getGetNextScheduledCallbackWithDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsReq,
              com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes>(
                service, METHODID_GET_NEXT_SCHEDULED_CALLBACK_WITH_DETAILS)))
        .addMethod(
          getUpdateScheduledCallbackToClosedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedReq,
              com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToClosedRes>(
                service, METHODID_UPDATE_SCHEDULED_CALLBACK_TO_CLOSED)))
        .addMethod(
          getUpdateScheduledCallbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackReq,
              com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackRes>(
                service, METHODID_UPDATE_SCHEDULED_CALLBACK)))
        .addMethod(
          getGetScheduledCallbackWithDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsReq,
              com.tcn.cloud.api.api.v0alpha.GetScheduledCallbackWithDetailsRes>(
                service, METHODID_GET_SCHEDULED_CALLBACK_WITH_DETAILS)))
        .addMethod(
          getListScheduledCallbacksWithDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsReq,
              com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes>(
                service, METHODID_LIST_SCHEDULED_CALLBACKS_WITH_DETAILS)))
        .addMethod(
          getListScheduledCallbacksWithDetailsBySkillsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsBySkillsReq,
              com.tcn.cloud.api.api.v0alpha.ListScheduledCallbacksWithDetailsRes>(
                service, METHODID_LIST_SCHEDULED_CALLBACKS_WITH_DETAILS_BY_SKILLS)))
        .build();
  }

  private static abstract class CBSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CBSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.CbsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CBS");
    }
  }

  private static final class CBSFileDescriptorSupplier
      extends CBSBaseDescriptorSupplier {
    CBSFileDescriptorSupplier() {}
  }

  private static final class CBSMethodDescriptorSupplier
      extends CBSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CBSMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CBSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CBSFileDescriptorSupplier())
              .addMethod(getCreateServiceIdMethod())
              .addMethod(getCreateCallbackWithDetailsMethod())
              .addMethod(getUpdateScheduledCallbackToReadyMethod())
              .addMethod(getUpdateScheduledCallbackToCanceledMethod())
              .addMethod(getGetNextScheduledCallbackWithDetailsMethod())
              .addMethod(getUpdateScheduledCallbackToClosedMethod())
              .addMethod(getUpdateScheduledCallbackMethod())
              .addMethod(getGetScheduledCallbackWithDetailsMethod())
              .addMethod(getListScheduledCallbacksWithDetailsMethod())
              .addMethod(getListScheduledCallbacksWithDetailsBySkillsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
