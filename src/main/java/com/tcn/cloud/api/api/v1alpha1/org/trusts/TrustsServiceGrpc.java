package com.tcn.cloud.api.api.v1alpha1.org.trusts;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/trusts/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrustsServiceGrpc {

  private TrustsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.trusts.TrustsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse> getCreateTrustMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTrust",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse> getCreateTrustMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse> getCreateTrustMethod;
    if ((getCreateTrustMethod = TrustsServiceGrpc.getCreateTrustMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getCreateTrustMethod = TrustsServiceGrpc.getCreateTrustMethod) == null) {
          TrustsServiceGrpc.getCreateTrustMethod = getCreateTrustMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("CreateTrust"))
              .build();
        }
      }
    }
    return getCreateTrustMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse> getAcceptTrustMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptTrust",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse> getAcceptTrustMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse> getAcceptTrustMethod;
    if ((getAcceptTrustMethod = TrustsServiceGrpc.getAcceptTrustMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getAcceptTrustMethod = TrustsServiceGrpc.getAcceptTrustMethod) == null) {
          TrustsServiceGrpc.getAcceptTrustMethod = getAcceptTrustMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("AcceptTrust"))
              .build();
        }
      }
    }
    return getAcceptTrustMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse> getRejectTrustMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RejectTrust",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse> getRejectTrustMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse> getRejectTrustMethod;
    if ((getRejectTrustMethod = TrustsServiceGrpc.getRejectTrustMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getRejectTrustMethod = TrustsServiceGrpc.getRejectTrustMethod) == null) {
          TrustsServiceGrpc.getRejectTrustMethod = getRejectTrustMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RejectTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("RejectTrust"))
              .build();
        }
      }
    }
    return getRejectTrustMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse> getGetTrustMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrust",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse> getGetTrustMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse> getGetTrustMethod;
    if ((getGetTrustMethod = TrustsServiceGrpc.getGetTrustMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getGetTrustMethod = TrustsServiceGrpc.getGetTrustMethod) == null) {
          TrustsServiceGrpc.getGetTrustMethod = getGetTrustMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("GetTrust"))
              .build();
        }
      }
    }
    return getGetTrustMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse> getListIncomingTrustsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIncomingTrusts",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse> getListIncomingTrustsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse> getListIncomingTrustsMethod;
    if ((getListIncomingTrustsMethod = TrustsServiceGrpc.getListIncomingTrustsMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getListIncomingTrustsMethod = TrustsServiceGrpc.getListIncomingTrustsMethod) == null) {
          TrustsServiceGrpc.getListIncomingTrustsMethod = getListIncomingTrustsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIncomingTrusts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("ListIncomingTrusts"))
              .build();
        }
      }
    }
    return getListIncomingTrustsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse> getListGivenTrustsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGivenTrusts",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse> getListGivenTrustsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse> getListGivenTrustsMethod;
    if ((getListGivenTrustsMethod = TrustsServiceGrpc.getListGivenTrustsMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getListGivenTrustsMethod = TrustsServiceGrpc.getListGivenTrustsMethod) == null) {
          TrustsServiceGrpc.getListGivenTrustsMethod = getListGivenTrustsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGivenTrusts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("ListGivenTrusts"))
              .build();
        }
      }
    }
    return getListGivenTrustsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse> getListAssignableTrustsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAssignableTrusts",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse> getListAssignableTrustsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse> getListAssignableTrustsMethod;
    if ((getListAssignableTrustsMethod = TrustsServiceGrpc.getListAssignableTrustsMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getListAssignableTrustsMethod = TrustsServiceGrpc.getListAssignableTrustsMethod) == null) {
          TrustsServiceGrpc.getListAssignableTrustsMethod = getListAssignableTrustsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAssignableTrusts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("ListAssignableTrusts"))
              .build();
        }
      }
    }
    return getListAssignableTrustsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse> getDeleteTrustMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTrust",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse> getDeleteTrustMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse> getDeleteTrustMethod;
    if ((getDeleteTrustMethod = TrustsServiceGrpc.getDeleteTrustMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getDeleteTrustMethod = TrustsServiceGrpc.getDeleteTrustMethod) == null) {
          TrustsServiceGrpc.getDeleteTrustMethod = getDeleteTrustMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("DeleteTrust"))
              .build();
        }
      }
    }
    return getDeleteTrustMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse> getAssignTrustMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignTrust",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse> getAssignTrustMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse> getAssignTrustMethod;
    if ((getAssignTrustMethod = TrustsServiceGrpc.getAssignTrustMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getAssignTrustMethod = TrustsServiceGrpc.getAssignTrustMethod) == null) {
          TrustsServiceGrpc.getAssignTrustMethod = getAssignTrustMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("AssignTrust"))
              .build();
        }
      }
    }
    return getAssignTrustMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse> getUnassignTrustMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignTrust",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse> getUnassignTrustMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse> getUnassignTrustMethod;
    if ((getUnassignTrustMethod = TrustsServiceGrpc.getUnassignTrustMethod) == null) {
      synchronized (TrustsServiceGrpc.class) {
        if ((getUnassignTrustMethod = TrustsServiceGrpc.getUnassignTrustMethod) == null) {
          TrustsServiceGrpc.getUnassignTrustMethod = getUnassignTrustMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnassignTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrustsServiceMethodDescriptorSupplier("UnassignTrust"))
              .build();
        }
      }
    }
    return getUnassignTrustMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrustsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrustsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrustsServiceStub>() {
        @java.lang.Override
        public TrustsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrustsServiceStub(channel, callOptions);
        }
      };
    return TrustsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrustsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrustsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrustsServiceBlockingStub>() {
        @java.lang.Override
        public TrustsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrustsServiceBlockingStub(channel, callOptions);
        }
      };
    return TrustsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrustsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrustsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrustsServiceFutureStub>() {
        @java.lang.Override
        public TrustsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrustsServiceFutureStub(channel, callOptions);
        }
      };
    return TrustsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateTrust creates a new trust.
     * </pre>
     */
    default void createTrust(com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcceptTrust accepts an incoming trust.
     * </pre>
     */
    default void acceptTrust(com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcceptTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * RejectTrust rejects an incoming trust.
     * </pre>
     */
    default void rejectTrust(com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRejectTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTrust returns a single trust by trust id.
     * </pre>
     */
    default void getTrust(com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListIncomingTrusts returns all pending trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    default void listIncomingTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIncomingTrustsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListGivenTrusts returns all trusts that have been given out for
     * the currently logged in user's org. The returned list will contain
     * accepted, pending, and rejected trusts.
     * </pre>
     */
    default void listGivenTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGivenTrustsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAssignableTrusts returns all accepted trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    default void listAssignableTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAssignableTrustsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteTrust deletes a trust by trust id. Only trusts where the current
     * org is the grantor can be deleted by this endpoint.
     * </pre>
     */
    default void deleteTrust(com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignTrust assigns a trust to the given user ids.
     * </pre>
     */
    default void assignTrust(com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnassignTrust unassigns a trust from the given user id.
     * </pre>
     */
    default void unassignTrust(com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnassignTrustMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TrustsService.
   */
  public static abstract class TrustsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TrustsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TrustsService.
   */
  public static final class TrustsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TrustsServiceStub> {
    private TrustsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrustsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrustsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateTrust creates a new trust.
     * </pre>
     */
    public void createTrust(com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AcceptTrust accepts an incoming trust.
     * </pre>
     */
    public void acceptTrust(com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcceptTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RejectTrust rejects an incoming trust.
     * </pre>
     */
    public void rejectTrust(com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRejectTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTrust returns a single trust by trust id.
     * </pre>
     */
    public void getTrust(com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListIncomingTrusts returns all pending trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public void listIncomingTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIncomingTrustsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListGivenTrusts returns all trusts that have been given out for
     * the currently logged in user's org. The returned list will contain
     * accepted, pending, and rejected trusts.
     * </pre>
     */
    public void listGivenTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGivenTrustsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAssignableTrusts returns all accepted trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public void listAssignableTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAssignableTrustsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteTrust deletes a trust by trust id. Only trusts where the current
     * org is the grantor can be deleted by this endpoint.
     * </pre>
     */
    public void deleteTrust(com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignTrust assigns a trust to the given user ids.
     * </pre>
     */
    public void assignTrust(com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnassignTrust unassigns a trust from the given user id.
     * </pre>
     */
    public void unassignTrust(com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnassignTrustMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TrustsService.
   */
  public static final class TrustsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TrustsServiceBlockingStub> {
    private TrustsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrustsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrustsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateTrust creates a new trust.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse createTrust(com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AcceptTrust accepts an incoming trust.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse acceptTrust(com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RejectTrust rejects an incoming trust.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse rejectTrust(com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRejectTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTrust returns a single trust by trust id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse getTrust(com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListIncomingTrusts returns all pending trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse listIncomingTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIncomingTrustsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListGivenTrusts returns all trusts that have been given out for
     * the currently logged in user's org. The returned list will contain
     * accepted, pending, and rejected trusts.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse listGivenTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGivenTrustsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAssignableTrusts returns all accepted trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse listAssignableTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAssignableTrustsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteTrust deletes a trust by trust id. Only trusts where the current
     * org is the grantor can be deleted by this endpoint.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse deleteTrust(com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignTrust assigns a trust to the given user ids.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse assignTrust(com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnassignTrust unassigns a trust from the given user id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse unassignTrust(com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnassignTrustMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TrustsService.
   */
  public static final class TrustsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TrustsServiceFutureStub> {
    private TrustsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrustsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrustsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateTrust creates a new trust.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse> createTrust(
        com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AcceptTrust accepts an incoming trust.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse> acceptTrust(
        com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcceptTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RejectTrust rejects an incoming trust.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse> rejectTrust(
        com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRejectTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTrust returns a single trust by trust id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse> getTrust(
        com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListIncomingTrusts returns all pending trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse> listIncomingTrusts(
        com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIncomingTrustsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListGivenTrusts returns all trusts that have been given out for
     * the currently logged in user's org. The returned list will contain
     * accepted, pending, and rejected trusts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse> listGivenTrusts(
        com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGivenTrustsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAssignableTrusts returns all accepted trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse> listAssignableTrusts(
        com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAssignableTrustsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteTrust deletes a trust by trust id. Only trusts where the current
     * org is the grantor can be deleted by this endpoint.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse> deleteTrust(
        com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignTrust assigns a trust to the given user ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse> assignTrust(
        com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnassignTrust unassigns a trust from the given user id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse> unassignTrust(
        com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnassignTrustMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TRUST = 0;
  private static final int METHODID_ACCEPT_TRUST = 1;
  private static final int METHODID_REJECT_TRUST = 2;
  private static final int METHODID_GET_TRUST = 3;
  private static final int METHODID_LIST_INCOMING_TRUSTS = 4;
  private static final int METHODID_LIST_GIVEN_TRUSTS = 5;
  private static final int METHODID_LIST_ASSIGNABLE_TRUSTS = 6;
  private static final int METHODID_DELETE_TRUST = 7;
  private static final int METHODID_ASSIGN_TRUST = 8;
  private static final int METHODID_UNASSIGN_TRUST = 9;

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
        case METHODID_CREATE_TRUST:
          serviceImpl.createTrust((com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_TRUST:
          serviceImpl.acceptTrust((com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse>) responseObserver);
          break;
        case METHODID_REJECT_TRUST:
          serviceImpl.rejectTrust((com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse>) responseObserver);
          break;
        case METHODID_GET_TRUST:
          serviceImpl.getTrust((com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse>) responseObserver);
          break;
        case METHODID_LIST_INCOMING_TRUSTS:
          serviceImpl.listIncomingTrusts((com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse>) responseObserver);
          break;
        case METHODID_LIST_GIVEN_TRUSTS:
          serviceImpl.listGivenTrusts((com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse>) responseObserver);
          break;
        case METHODID_LIST_ASSIGNABLE_TRUSTS:
          serviceImpl.listAssignableTrusts((com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse>) responseObserver);
          break;
        case METHODID_DELETE_TRUST:
          serviceImpl.deleteTrust((com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_TRUST:
          serviceImpl.assignTrust((com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_TRUST:
          serviceImpl.unassignTrust((com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse>) responseObserver);
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
          getCreateTrustMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest,
              com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse>(
                service, METHODID_CREATE_TRUST)))
        .addMethod(
          getAcceptTrustMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest,
              com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse>(
                service, METHODID_ACCEPT_TRUST)))
        .addMethod(
          getRejectTrustMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest,
              com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse>(
                service, METHODID_REJECT_TRUST)))
        .addMethod(
          getGetTrustMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse>(
                service, METHODID_GET_TRUST)))
        .addMethod(
          getListIncomingTrustsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse>(
                service, METHODID_LIST_INCOMING_TRUSTS)))
        .addMethod(
          getListGivenTrustsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse>(
                service, METHODID_LIST_GIVEN_TRUSTS)))
        .addMethod(
          getListAssignableTrustsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse>(
                service, METHODID_LIST_ASSIGNABLE_TRUSTS)))
        .addMethod(
          getDeleteTrustMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest,
              com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse>(
                service, METHODID_DELETE_TRUST)))
        .addMethod(
          getAssignTrustMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest,
              com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse>(
                service, METHODID_ASSIGN_TRUST)))
        .addMethod(
          getUnassignTrustMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse>(
                service, METHODID_UNASSIGN_TRUST)))
        .build();
  }

  private static abstract class TrustsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrustsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.trusts.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrustsService");
    }
  }

  private static final class TrustsServiceFileDescriptorSupplier
      extends TrustsServiceBaseDescriptorSupplier {
    TrustsServiceFileDescriptorSupplier() {}
  }

  private static final class TrustsServiceMethodDescriptorSupplier
      extends TrustsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TrustsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TrustsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrustsServiceFileDescriptorSupplier())
              .addMethod(getCreateTrustMethod())
              .addMethod(getAcceptTrustMethod())
              .addMethod(getRejectTrustMethod())
              .addMethod(getGetTrustMethod())
              .addMethod(getListIncomingTrustsMethod())
              .addMethod(getListGivenTrustsMethod())
              .addMethod(getListAssignableTrustsMethod())
              .addMethod(getDeleteTrustMethod())
              .addMethod(getAssignTrustMethod())
              .addMethod(getUnassignTrustMethod())
              .build();
        }
      }
    }
    return result;
  }
}
