package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for interacting with TCN's Agent Call Distribution system.
 * Accessing all of the methods require an authenticated user with the correct
 * permissions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: api/v0alpha/acd.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AcdGrpc {

  private AcdGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.Acd";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> getAgentGetStatusStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentGetStatusStream",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> getAgentGetStatusStreamMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest, com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> getAgentGetStatusStreamMethod;
    if ((getAgentGetStatusStreamMethod = AcdGrpc.getAgentGetStatusStreamMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentGetStatusStreamMethod = AcdGrpc.getAgentGetStatusStreamMethod) == null) {
          AcdGrpc.getAgentGetStatusStreamMethod = getAgentGetStatusStreamMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest, com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentGetStatusStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentGetStatusStream"))
              .build();
        }
      }
    }
    return getAgentGetStatusStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> getAgentGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentGetStatus",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> getAgentGetStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest, com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> getAgentGetStatusMethod;
    if ((getAgentGetStatusMethod = AcdGrpc.getAgentGetStatusMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentGetStatusMethod = AcdGrpc.getAgentGetStatusMethod) == null) {
          AcdGrpc.getAgentGetStatusMethod = getAgentGetStatusMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest, com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentGetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentGetStatus"))
              .build();
        }
      }
    }
    return getAgentGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply> getAgentGetConnectedPartyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentGetConnectedParty",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply> getAgentGetConnectedPartyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest, com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply> getAgentGetConnectedPartyMethod;
    if ((getAgentGetConnectedPartyMethod = AcdGrpc.getAgentGetConnectedPartyMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentGetConnectedPartyMethod = AcdGrpc.getAgentGetConnectedPartyMethod) == null) {
          AcdGrpc.getAgentGetConnectedPartyMethod = getAgentGetConnectedPartyMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest, com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentGetConnectedParty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentGetConnectedParty"))
              .build();
        }
      }
    }
    return getAgentGetConnectedPartyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest,
      com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply> getManagerAgentGetConnectedPartyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManagerAgentGetConnectedParty",
      requestType = com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest,
      com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply> getManagerAgentGetConnectedPartyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest, com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply> getManagerAgentGetConnectedPartyMethod;
    if ((getManagerAgentGetConnectedPartyMethod = AcdGrpc.getManagerAgentGetConnectedPartyMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getManagerAgentGetConnectedPartyMethod = AcdGrpc.getManagerAgentGetConnectedPartyMethod) == null) {
          AcdGrpc.getManagerAgentGetConnectedPartyMethod = getManagerAgentGetConnectedPartyMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest, com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManagerAgentGetConnectedParty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("ManagerAgentGetConnectedParty"))
              .build();
        }
      }
    }
    return getManagerAgentGetConnectedPartyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest,
      com.tcn.cloud.api.api.v0alpha.AgentIntercomReply> getAgentIntercomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentIntercom",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentIntercomReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest,
      com.tcn.cloud.api.api.v0alpha.AgentIntercomReply> getAgentIntercomMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest, com.tcn.cloud.api.api.v0alpha.AgentIntercomReply> getAgentIntercomMethod;
    if ((getAgentIntercomMethod = AcdGrpc.getAgentIntercomMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentIntercomMethod = AcdGrpc.getAgentIntercomMethod) == null) {
          AcdGrpc.getAgentIntercomMethod = getAgentIntercomMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest, com.tcn.cloud.api.api.v0alpha.AgentIntercomReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentIntercom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentIntercomReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentIntercom"))
              .build();
        }
      }
    }
    return getAgentIntercomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest,
      com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply> getAgentIntercomAcceptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentIntercomAccept",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest,
      com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply> getAgentIntercomAcceptMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest, com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply> getAgentIntercomAcceptMethod;
    if ((getAgentIntercomAcceptMethod = AcdGrpc.getAgentIntercomAcceptMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentIntercomAcceptMethod = AcdGrpc.getAgentIntercomAcceptMethod) == null) {
          AcdGrpc.getAgentIntercomAcceptMethod = getAgentIntercomAcceptMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest, com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentIntercomAccept"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentIntercomAccept"))
              .build();
        }
      }
    }
    return getAgentIntercomAcceptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest,
      com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply> getAgentIntercomRejectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentIntercomReject",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest,
      com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply> getAgentIntercomRejectMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest, com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply> getAgentIntercomRejectMethod;
    if ((getAgentIntercomRejectMethod = AcdGrpc.getAgentIntercomRejectMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentIntercomRejectMethod = AcdGrpc.getAgentIntercomRejectMethod) == null) {
          AcdGrpc.getAgentIntercomRejectMethod = getAgentIntercomRejectMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest, com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentIntercomReject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentIntercomReject"))
              .build();
        }
      }
    }
    return getAgentIntercomRejectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest,
      com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply> getAgentIntercomCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentIntercomCancel",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest,
      com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply> getAgentIntercomCancelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest, com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply> getAgentIntercomCancelMethod;
    if ((getAgentIntercomCancelMethod = AcdGrpc.getAgentIntercomCancelMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentIntercomCancelMethod = AcdGrpc.getAgentIntercomCancelMethod) == null) {
          AcdGrpc.getAgentIntercomCancelMethod = getAgentIntercomCancelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest, com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentIntercomCancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentIntercomCancel"))
              .build();
        }
      }
    }
    return getAgentIntercomCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest,
      com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply> getDialManualPrepareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DialManualPrepare",
      requestType = com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest,
      com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply> getDialManualPrepareMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest, com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply> getDialManualPrepareMethod;
    if ((getDialManualPrepareMethod = AcdGrpc.getDialManualPrepareMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getDialManualPrepareMethod = AcdGrpc.getDialManualPrepareMethod) == null) {
          AcdGrpc.getDialManualPrepareMethod = getDialManualPrepareMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest, com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DialManualPrepare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("DialManualPrepare"))
              .build();
        }
      }
    }
    return getDialManualPrepareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest,
      com.tcn.cloud.api.api.v0alpha.DialManualCancelReply> getDialManualCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DialManualCancel",
      requestType = com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DialManualCancelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest,
      com.tcn.cloud.api.api.v0alpha.DialManualCancelReply> getDialManualCancelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest, com.tcn.cloud.api.api.v0alpha.DialManualCancelReply> getDialManualCancelMethod;
    if ((getDialManualCancelMethod = AcdGrpc.getDialManualCancelMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getDialManualCancelMethod = AcdGrpc.getDialManualCancelMethod) == null) {
          AcdGrpc.getDialManualCancelMethod = getDialManualCancelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest, com.tcn.cloud.api.api.v0alpha.DialManualCancelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DialManualCancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DialManualCancelReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("DialManualCancel"))
              .build();
        }
      }
    }
    return getDialManualCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest,
      com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply> getDialPreviewPrepareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DialPreviewPrepare",
      requestType = com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest,
      com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply> getDialPreviewPrepareMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest, com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply> getDialPreviewPrepareMethod;
    if ((getDialPreviewPrepareMethod = AcdGrpc.getDialPreviewPrepareMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getDialPreviewPrepareMethod = AcdGrpc.getDialPreviewPrepareMethod) == null) {
          AcdGrpc.getDialPreviewPrepareMethod = getDialPreviewPrepareMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest, com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DialPreviewPrepare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("DialPreviewPrepare"))
              .build();
        }
      }
    }
    return getDialPreviewPrepareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPauseRequest,
      com.tcn.cloud.api.api.v0alpha.AgentPauseReply> getAgentPauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentPause",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentPauseRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentPauseReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPauseRequest,
      com.tcn.cloud.api.api.v0alpha.AgentPauseReply> getAgentPauseMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPauseRequest, com.tcn.cloud.api.api.v0alpha.AgentPauseReply> getAgentPauseMethod;
    if ((getAgentPauseMethod = AcdGrpc.getAgentPauseMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentPauseMethod = AcdGrpc.getAgentPauseMethod) == null) {
          AcdGrpc.getAgentPauseMethod = getAgentPauseMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentPauseRequest, com.tcn.cloud.api.api.v0alpha.AgentPauseReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentPause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentPauseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentPauseReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentPause"))
              .build();
        }
      }
    }
    return getAgentPauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest,
      com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply> getAgentSetReadyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentSetReady",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest,
      com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply> getAgentSetReadyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest, com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply> getAgentSetReadyMethod;
    if ((getAgentSetReadyMethod = AcdGrpc.getAgentSetReadyMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentSetReadyMethod = AcdGrpc.getAgentSetReadyMethod) == null) {
          AcdGrpc.getAgentSetReadyMethod = getAgentSetReadyMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest, com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentSetReady"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentSetReady"))
              .build();
        }
      }
    }
    return getAgentSetReadyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply> getAgentGUIBusyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentGUIBusy",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply> getAgentGUIBusyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest, com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply> getAgentGUIBusyMethod;
    if ((getAgentGUIBusyMethod = AcdGrpc.getAgentGUIBusyMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentGUIBusyMethod = AcdGrpc.getAgentGUIBusyMethod) == null) {
          AcdGrpc.getAgentGUIBusyMethod = getAgentGUIBusyMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest, com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentGUIBusy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentGUIBusy"))
              .build();
        }
      }
    }
    return getAgentGUIBusyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq,
      com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes> getReportAgentSessionEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportAgentSessionEvent",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq,
      com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes> getReportAgentSessionEventMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq, com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes> getReportAgentSessionEventMethod;
    if ((getReportAgentSessionEventMethod = AcdGrpc.getReportAgentSessionEventMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getReportAgentSessionEventMethod = AcdGrpc.getReportAgentSessionEventMethod) == null) {
          AcdGrpc.getReportAgentSessionEventMethod = getReportAgentSessionEventMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq, com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportAgentSessionEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("ReportAgentSessionEvent"))
              .build();
        }
      }
    }
    return getReportAgentSessionEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest,
      com.tcn.cloud.api.api.v0alpha.CallerRequeueReply> getCallerRequeueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallerRequeue",
      requestType = com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CallerRequeueReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest,
      com.tcn.cloud.api.api.v0alpha.CallerRequeueReply> getCallerRequeueMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest, com.tcn.cloud.api.api.v0alpha.CallerRequeueReply> getCallerRequeueMethod;
    if ((getCallerRequeueMethod = AcdGrpc.getCallerRequeueMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getCallerRequeueMethod = AcdGrpc.getCallerRequeueMethod) == null) {
          AcdGrpc.getCallerRequeueMethod = getCallerRequeueMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest, com.tcn.cloud.api.api.v0alpha.CallerRequeueReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallerRequeue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CallerRequeueReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("CallerRequeue"))
              .build();
        }
      }
    }
    return getCallerRequeueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest,
      com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply> getAgentDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentDisconnect",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest,
      com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply> getAgentDisconnectMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest, com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply> getAgentDisconnectMethod;
    if ((getAgentDisconnectMethod = AcdGrpc.getAgentDisconnectMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentDisconnectMethod = AcdGrpc.getAgentDisconnectMethod) == null) {
          AcdGrpc.getAgentDisconnectMethod = getAgentDisconnectMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest, com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentDisconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentDisconnect"))
              .build();
        }
      }
    }
    return getAgentDisconnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply> getTransferWarmToOutboundCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferWarmToOutboundCancel",
      requestType = com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply> getTransferWarmToOutboundCancelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply> getTransferWarmToOutboundCancelMethod;
    if ((getTransferWarmToOutboundCancelMethod = AcdGrpc.getTransferWarmToOutboundCancelMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getTransferWarmToOutboundCancelMethod = AcdGrpc.getTransferWarmToOutboundCancelMethod) == null) {
          AcdGrpc.getTransferWarmToOutboundCancelMethod = getTransferWarmToOutboundCancelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferWarmToOutboundCancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("TransferWarmToOutboundCancel"))
              .build();
        }
      }
    }
    return getTransferWarmToOutboundCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply> getTransferWarmToAgentCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferWarmToAgentCancel",
      requestType = com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply> getTransferWarmToAgentCancelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply> getTransferWarmToAgentCancelMethod;
    if ((getTransferWarmToAgentCancelMethod = AcdGrpc.getTransferWarmToAgentCancelMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getTransferWarmToAgentCancelMethod = AcdGrpc.getTransferWarmToAgentCancelMethod) == null) {
          AcdGrpc.getTransferWarmToAgentCancelMethod = getTransferWarmToAgentCancelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferWarmToAgentCancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("TransferWarmToAgentCancel"))
              .build();
        }
      }
    }
    return getTransferWarmToAgentCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply> getTransferWarmToOutboundApproveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferWarmToOutboundApprove",
      requestType = com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply> getTransferWarmToOutboundApproveMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply> getTransferWarmToOutboundApproveMethod;
    if ((getTransferWarmToOutboundApproveMethod = AcdGrpc.getTransferWarmToOutboundApproveMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getTransferWarmToOutboundApproveMethod = AcdGrpc.getTransferWarmToOutboundApproveMethod) == null) {
          AcdGrpc.getTransferWarmToOutboundApproveMethod = getTransferWarmToOutboundApproveMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferWarmToOutboundApprove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("TransferWarmToOutboundApprove"))
              .build();
        }
      }
    }
    return getTransferWarmToOutboundApproveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply> getTransferWarmToAgentApproveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferWarmToAgentApprove",
      requestType = com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply> getTransferWarmToAgentApproveMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply> getTransferWarmToAgentApproveMethod;
    if ((getTransferWarmToAgentApproveMethod = AcdGrpc.getTransferWarmToAgentApproveMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getTransferWarmToAgentApproveMethod = AcdGrpc.getTransferWarmToAgentApproveMethod) == null) {
          AcdGrpc.getTransferWarmToAgentApproveMethod = getTransferWarmToAgentApproveMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferWarmToAgentApprove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("TransferWarmToAgentApprove"))
              .build();
        }
      }
    }
    return getTransferWarmToAgentApproveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest,
      com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply> getCallerSendToVoicemailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallerSendToVoicemail",
      requestType = com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest,
      com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply> getCallerSendToVoicemailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest, com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply> getCallerSendToVoicemailMethod;
    if ((getCallerSendToVoicemailMethod = AcdGrpc.getCallerSendToVoicemailMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getCallerSendToVoicemailMethod = AcdGrpc.getCallerSendToVoicemailMethod) == null) {
          AcdGrpc.getCallerSendToVoicemailMethod = getCallerSendToVoicemailMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest, com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallerSendToVoicemail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("CallerSendToVoicemail"))
              .build();
        }
      }
    }
    return getCallerSendToVoicemailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest,
      com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply> getAgentInviteTransferCallerToConferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentInviteTransferCallerToConference",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest,
      com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply> getAgentInviteTransferCallerToConferenceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest, com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply> getAgentInviteTransferCallerToConferenceMethod;
    if ((getAgentInviteTransferCallerToConferenceMethod = AcdGrpc.getAgentInviteTransferCallerToConferenceMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentInviteTransferCallerToConferenceMethod = AcdGrpc.getAgentInviteTransferCallerToConferenceMethod) == null) {
          AcdGrpc.getAgentInviteTransferCallerToConferenceMethod = getAgentInviteTransferCallerToConferenceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest, com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentInviteTransferCallerToConference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentInviteTransferCallerToConference"))
              .build();
        }
      }
    }
    return getAgentInviteTransferCallerToConferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest,
      com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply> getAgentMonitorCallsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentMonitorCalls",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest,
      com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply> getAgentMonitorCallsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest, com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply> getAgentMonitorCallsMethod;
    if ((getAgentMonitorCallsMethod = AcdGrpc.getAgentMonitorCallsMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentMonitorCallsMethod = AcdGrpc.getAgentMonitorCallsMethod) == null) {
          AcdGrpc.getAgentMonitorCallsMethod = getAgentMonitorCallsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest, com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentMonitorCalls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentMonitorCalls"))
              .build();
        }
      }
    }
    return getAgentMonitorCallsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest,
      com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply> getTransferColdToOutboundMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferColdToOutbound",
      requestType = com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest,
      com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply> getTransferColdToOutboundMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest, com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply> getTransferColdToOutboundMethod;
    if ((getTransferColdToOutboundMethod = AcdGrpc.getTransferColdToOutboundMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getTransferColdToOutboundMethod = AcdGrpc.getTransferColdToOutboundMethod) == null) {
          AcdGrpc.getTransferColdToOutboundMethod = getTransferColdToOutboundMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest, com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferColdToOutbound"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("TransferColdToOutbound"))
              .build();
        }
      }
    }
    return getTransferColdToOutboundMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest,
      com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply> getTransferColdToAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferColdToAgent",
      requestType = com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest,
      com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply> getTransferColdToAgentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest, com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply> getTransferColdToAgentMethod;
    if ((getTransferColdToAgentMethod = AcdGrpc.getTransferColdToAgentMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getTransferColdToAgentMethod = AcdGrpc.getTransferColdToAgentMethod) == null) {
          AcdGrpc.getTransferColdToAgentMethod = getTransferColdToAgentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest, com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferColdToAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("TransferColdToAgent"))
              .build();
        }
      }
    }
    return getTransferColdToAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply> getTransferWarmToOutboundStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferWarmToOutboundStart",
      requestType = com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply> getTransferWarmToOutboundStartMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply> getTransferWarmToOutboundStartMethod;
    if ((getTransferWarmToOutboundStartMethod = AcdGrpc.getTransferWarmToOutboundStartMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getTransferWarmToOutboundStartMethod = AcdGrpc.getTransferWarmToOutboundStartMethod) == null) {
          AcdGrpc.getTransferWarmToOutboundStartMethod = getTransferWarmToOutboundStartMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferWarmToOutboundStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("TransferWarmToOutboundStart"))
              .build();
        }
      }
    }
    return getTransferWarmToOutboundStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest,
      com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply> getCreateWarmOutboundTransferMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWarmOutboundTransferMember",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest,
      com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply> getCreateWarmOutboundTransferMemberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest, com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply> getCreateWarmOutboundTransferMemberMethod;
    if ((getCreateWarmOutboundTransferMemberMethod = AcdGrpc.getCreateWarmOutboundTransferMemberMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getCreateWarmOutboundTransferMemberMethod = AcdGrpc.getCreateWarmOutboundTransferMemberMethod) == null) {
          AcdGrpc.getCreateWarmOutboundTransferMemberMethod = getCreateWarmOutboundTransferMemberMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest, com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWarmOutboundTransferMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("CreateWarmOutboundTransferMember"))
              .build();
        }
      }
    }
    return getCreateWarmOutboundTransferMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply> getRemoveTransferMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTransferMember",
      requestType = com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply> getRemoveTransferMemberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest, com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply> getRemoveTransferMemberMethod;
    if ((getRemoveTransferMemberMethod = AcdGrpc.getRemoveTransferMemberMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getRemoveTransferMemberMethod = AcdGrpc.getRemoveTransferMemberMethod) == null) {
          AcdGrpc.getRemoveTransferMemberMethod = getRemoveTransferMemberMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest, com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTransferMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("RemoveTransferMember"))
              .build();
        }
      }
    }
    return getRemoveTransferMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply> getTransferWarmToAgentStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferWarmToAgentStart",
      requestType = com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest,
      com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply> getTransferWarmToAgentStartMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply> getTransferWarmToAgentStartMethod;
    if ((getTransferWarmToAgentStartMethod = AcdGrpc.getTransferWarmToAgentStartMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getTransferWarmToAgentStartMethod = AcdGrpc.getTransferWarmToAgentStartMethod) == null) {
          AcdGrpc.getTransferWarmToAgentStartMethod = getTransferWarmToAgentStartMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest, com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferWarmToAgentStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("TransferWarmToAgentStart"))
              .build();
        }
      }
    }
    return getTransferWarmToAgentStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply> getAgentGetCallFromHoldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentGetCallFromHold",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply> getAgentGetCallFromHoldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest, com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply> getAgentGetCallFromHoldMethod;
    if ((getAgentGetCallFromHoldMethod = AcdGrpc.getAgentGetCallFromHoldMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentGetCallFromHoldMethod = AcdGrpc.getAgentGetCallFromHoldMethod) == null) {
          AcdGrpc.getAgentGetCallFromHoldMethod = getAgentGetCallFromHoldMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest, com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentGetCallFromHold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentGetCallFromHold"))
              .build();
        }
      }
    }
    return getAgentGetCallFromHoldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply> getAgentGetSpecificCallFromHoldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentGetSpecificCallFromHold",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest,
      com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply> getAgentGetSpecificCallFromHoldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest, com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply> getAgentGetSpecificCallFromHoldMethod;
    if ((getAgentGetSpecificCallFromHoldMethod = AcdGrpc.getAgentGetSpecificCallFromHoldMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentGetSpecificCallFromHoldMethod = AcdGrpc.getAgentGetSpecificCallFromHoldMethod) == null) {
          AcdGrpc.getAgentGetSpecificCallFromHoldMethod = getAgentGetSpecificCallFromHoldMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest, com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentGetSpecificCallFromHold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentGetSpecificCallFromHold"))
              .build();
        }
      }
    }
    return getAgentGetSpecificCallFromHoldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest,
      com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply> getACDGetAllAgentsStatusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ACDGetAllAgentsStatuses",
      requestType = com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest,
      com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply> getACDGetAllAgentsStatusesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest, com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply> getACDGetAllAgentsStatusesMethod;
    if ((getACDGetAllAgentsStatusesMethod = AcdGrpc.getACDGetAllAgentsStatusesMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getACDGetAllAgentsStatusesMethod = AcdGrpc.getACDGetAllAgentsStatusesMethod) == null) {
          AcdGrpc.getACDGetAllAgentsStatusesMethod = getACDGetAllAgentsStatusesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest, com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ACDGetAllAgentsStatuses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("ACDGetAllAgentsStatuses"))
              .build();
        }
      }
    }
    return getACDGetAllAgentsStatusesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest,
      com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply> getAgentPutCallOnHoldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentPutCallOnHold",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest,
      com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply> getAgentPutCallOnHoldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest, com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply> getAgentPutCallOnHoldMethod;
    if ((getAgentPutCallOnHoldMethod = AcdGrpc.getAgentPutCallOnHoldMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentPutCallOnHoldMethod = AcdGrpc.getAgentPutCallOnHoldMethod) == null) {
          AcdGrpc.getAgentPutCallOnHoldMethod = getAgentPutCallOnHoldMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest, com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentPutCallOnHold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentPutCallOnHold"))
              .build();
        }
      }
    }
    return getAgentPutCallOnHoldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest,
      com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply> getAgentReceiveMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentReceiveMessage",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest,
      com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply> getAgentReceiveMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest, com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply> getAgentReceiveMessageMethod;
    if ((getAgentReceiveMessageMethod = AcdGrpc.getAgentReceiveMessageMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentReceiveMessageMethod = AcdGrpc.getAgentReceiveMessageMethod) == null) {
          AcdGrpc.getAgentReceiveMessageMethod = getAgentReceiveMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest, com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentReceiveMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentReceiveMessage"))
              .build();
        }
      }
    }
    return getAgentReceiveMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest,
      com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply> getAgentPBXApproveCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentPBXApproveCall",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest,
      com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply> getAgentPBXApproveCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest, com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply> getAgentPBXApproveCallMethod;
    if ((getAgentPBXApproveCallMethod = AcdGrpc.getAgentPBXApproveCallMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentPBXApproveCallMethod = AcdGrpc.getAgentPBXApproveCallMethod) == null) {
          AcdGrpc.getAgentPBXApproveCallMethod = getAgentPBXApproveCallMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest, com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentPBXApproveCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentPBXApproveCall"))
              .build();
        }
      }
    }
    return getAgentPBXApproveCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest,
      com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply> getAgentPBXRejectCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentPBXRejectCall",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest,
      com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply> getAgentPBXRejectCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest, com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply> getAgentPBXRejectCallMethod;
    if ((getAgentPBXRejectCallMethod = AcdGrpc.getAgentPBXRejectCallMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentPBXRejectCallMethod = AcdGrpc.getAgentPBXRejectCallMethod) == null) {
          AcdGrpc.getAgentPBXRejectCallMethod = getAgentPBXRejectCallMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest, com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentPBXRejectCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentPBXRejectCall"))
              .build();
        }
      }
    }
    return getAgentPBXRejectCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest,
      com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply> getGetCallerLostPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCallerLostPeer",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest,
      com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply> getGetCallerLostPeerMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest, com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply> getGetCallerLostPeerMethod;
    if ((getGetCallerLostPeerMethod = AcdGrpc.getGetCallerLostPeerMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getGetCallerLostPeerMethod = AcdGrpc.getGetCallerLostPeerMethod) == null) {
          AcdGrpc.getGetCallerLostPeerMethod = getGetCallerLostPeerMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest, com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCallerLostPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("GetCallerLostPeer"))
              .build();
        }
      }
    }
    return getGetCallerLostPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest,
      com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply> getCallerGetRawEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallerGetRawEvent",
      requestType = com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest,
      com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply> getCallerGetRawEventMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest, com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply> getCallerGetRawEventMethod;
    if ((getCallerGetRawEventMethod = AcdGrpc.getCallerGetRawEventMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getCallerGetRawEventMethod = AcdGrpc.getCallerGetRawEventMethod) == null) {
          AcdGrpc.getCallerGetRawEventMethod = getCallerGetRawEventMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest, com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallerGetRawEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("CallerGetRawEvent"))
              .build();
        }
      }
    }
    return getCallerGetRawEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest,
      com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply> getPeerAgentWithCallerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PeerAgentWithCaller",
      requestType = com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest,
      com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply> getPeerAgentWithCallerMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest, com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply> getPeerAgentWithCallerMethod;
    if ((getPeerAgentWithCallerMethod = AcdGrpc.getPeerAgentWithCallerMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getPeerAgentWithCallerMethod = AcdGrpc.getPeerAgentWithCallerMethod) == null) {
          AcdGrpc.getPeerAgentWithCallerMethod = getPeerAgentWithCallerMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest, com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PeerAgentWithCaller"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("PeerAgentWithCaller"))
              .build();
        }
      }
    }
    return getPeerAgentWithCallerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq,
      com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes> getHoldTransferMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HoldTransferMember",
      requestType = com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq,
      com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes> getHoldTransferMemberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq, com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes> getHoldTransferMemberMethod;
    if ((getHoldTransferMemberMethod = AcdGrpc.getHoldTransferMemberMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getHoldTransferMemberMethod = AcdGrpc.getHoldTransferMemberMethod) == null) {
          AcdGrpc.getHoldTransferMemberMethod = getHoldTransferMemberMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq, com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HoldTransferMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("HoldTransferMember"))
              .build();
        }
      }
    }
    return getHoldTransferMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq,
      com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes> getUnholdTransferMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnholdTransferMember",
      requestType = com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq,
      com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes> getUnholdTransferMemberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq, com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes> getUnholdTransferMemberMethod;
    if ((getUnholdTransferMemberMethod = AcdGrpc.getUnholdTransferMemberMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getUnholdTransferMemberMethod = AcdGrpc.getUnholdTransferMemberMethod) == null) {
          AcdGrpc.getUnholdTransferMemberMethod = getUnholdTransferMemberMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq, com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnholdTransferMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("UnholdTransferMember"))
              .build();
        }
      }
    }
    return getUnholdTransferMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq,
      com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes> getGetAgentCallCountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentCallCounts",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq,
      com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes> getGetAgentCallCountsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq, com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes> getGetAgentCallCountsMethod;
    if ((getGetAgentCallCountsMethod = AcdGrpc.getGetAgentCallCountsMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getGetAgentCallCountsMethod = AcdGrpc.getGetAgentCallCountsMethod) == null) {
          AcdGrpc.getGetAgentCallCountsMethod = getGetAgentCallCountsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq, com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentCallCounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("GetAgentCallCounts"))
              .build();
        }
      }
    }
    return getGetAgentCallCountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq,
      com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes> getWarmCallerTransferStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WarmCallerTransferStart",
      requestType = com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq,
      com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes> getWarmCallerTransferStartMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq, com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes> getWarmCallerTransferStartMethod;
    if ((getWarmCallerTransferStartMethod = AcdGrpc.getWarmCallerTransferStartMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getWarmCallerTransferStartMethod = AcdGrpc.getWarmCallerTransferStartMethod) == null) {
          AcdGrpc.getWarmCallerTransferStartMethod = getWarmCallerTransferStartMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq, com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WarmCallerTransferStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("WarmCallerTransferStart"))
              .build();
        }
      }
    }
    return getWarmCallerTransferStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq,
      com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes> getWarmCallerTransferCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WarmCallerTransferCancel",
      requestType = com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq,
      com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes> getWarmCallerTransferCancelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq, com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes> getWarmCallerTransferCancelMethod;
    if ((getWarmCallerTransferCancelMethod = AcdGrpc.getWarmCallerTransferCancelMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getWarmCallerTransferCancelMethod = AcdGrpc.getWarmCallerTransferCancelMethod) == null) {
          AcdGrpc.getWarmCallerTransferCancelMethod = getWarmCallerTransferCancelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq, com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WarmCallerTransferCancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("WarmCallerTransferCancel"))
              .build();
        }
      }
    }
    return getWarmCallerTransferCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq,
      com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes> getWarmCallerTransferApproveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WarmCallerTransferApprove",
      requestType = com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq,
      com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes> getWarmCallerTransferApproveMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq, com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes> getWarmCallerTransferApproveMethod;
    if ((getWarmCallerTransferApproveMethod = AcdGrpc.getWarmCallerTransferApproveMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getWarmCallerTransferApproveMethod = AcdGrpc.getWarmCallerTransferApproveMethod) == null) {
          AcdGrpc.getWarmCallerTransferApproveMethod = getWarmCallerTransferApproveMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq, com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WarmCallerTransferApprove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("WarmCallerTransferApprove"))
              .build();
        }
      }
    }
    return getWarmCallerTransferApproveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq,
      com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes> getPlaySoundboardEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaySoundboardEntity",
      requestType = com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq,
      com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes> getPlaySoundboardEntityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq, com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes> getPlaySoundboardEntityMethod;
    if ((getPlaySoundboardEntityMethod = AcdGrpc.getPlaySoundboardEntityMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getPlaySoundboardEntityMethod = AcdGrpc.getPlaySoundboardEntityMethod) == null) {
          AcdGrpc.getPlaySoundboardEntityMethod = getPlaySoundboardEntityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq, com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaySoundboardEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("PlaySoundboardEntity"))
              .build();
        }
      }
    }
    return getPlaySoundboardEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq,
      com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes> getStopSoundboardEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopSoundboardEntity",
      requestType = com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq,
      com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes> getStopSoundboardEntityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq, com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes> getStopSoundboardEntityMethod;
    if ((getStopSoundboardEntityMethod = AcdGrpc.getStopSoundboardEntityMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getStopSoundboardEntityMethod = AcdGrpc.getStopSoundboardEntityMethod) == null) {
          AcdGrpc.getStopSoundboardEntityMethod = getStopSoundboardEntityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq, com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopSoundboardEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("StopSoundboardEntity"))
              .build();
        }
      }
    }
    return getStopSoundboardEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply> getUpdateAgentSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentSkills",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply> getUpdateAgentSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply> getUpdateAgentSkillsMethod;
    if ((getUpdateAgentSkillsMethod = AcdGrpc.getUpdateAgentSkillsMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getUpdateAgentSkillsMethod = AcdGrpc.getUpdateAgentSkillsMethod) == null) {
          AcdGrpc.getUpdateAgentSkillsMethod = getUpdateAgentSkillsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("UpdateAgentSkills"))
              .build();
        }
      }
    }
    return getUpdateAgentSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest,
      com.tcn.cloud.api.api.v0alpha.PlayDTMFReply> getPlayDTMFMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayDTMF",
      requestType = com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PlayDTMFReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest,
      com.tcn.cloud.api.api.v0alpha.PlayDTMFReply> getPlayDTMFMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest, com.tcn.cloud.api.api.v0alpha.PlayDTMFReply> getPlayDTMFMethod;
    if ((getPlayDTMFMethod = AcdGrpc.getPlayDTMFMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getPlayDTMFMethod = AcdGrpc.getPlayDTMFMethod) == null) {
          AcdGrpc.getPlayDTMFMethod = getPlayDTMFMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest, com.tcn.cloud.api.api.v0alpha.PlayDTMFReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayDTMF"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PlayDTMFReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("PlayDTMF"))
              .build();
        }
      }
    }
    return getPlayDTMFMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentMuteRequest,
      com.tcn.cloud.api.api.v0alpha.AgentMuteReply> getAgentMuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentMute",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentMuteRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentMuteReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentMuteRequest,
      com.tcn.cloud.api.api.v0alpha.AgentMuteReply> getAgentMuteMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentMuteRequest, com.tcn.cloud.api.api.v0alpha.AgentMuteReply> getAgentMuteMethod;
    if ((getAgentMuteMethod = AcdGrpc.getAgentMuteMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentMuteMethod = AcdGrpc.getAgentMuteMethod) == null) {
          AcdGrpc.getAgentMuteMethod = getAgentMuteMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentMuteRequest, com.tcn.cloud.api.api.v0alpha.AgentMuteReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentMute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentMuteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentMuteReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentMute"))
              .build();
        }
      }
    }
    return getAgentMuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest,
      com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply> getAgentUnmuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgentUnmute",
      requestType = com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest,
      com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply> getAgentUnmuteMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest, com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply> getAgentUnmuteMethod;
    if ((getAgentUnmuteMethod = AcdGrpc.getAgentUnmuteMethod) == null) {
      synchronized (AcdGrpc.class) {
        if ((getAgentUnmuteMethod = AcdGrpc.getAgentUnmuteMethod) == null) {
          AcdGrpc.getAgentUnmuteMethod = getAgentUnmuteMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest, com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgentUnmute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply.getDefaultInstance()))
              .setSchemaDescriptor(new AcdMethodDescriptorSupplier("AgentUnmute"))
              .build();
        }
      }
    }
    return getAgentUnmuteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcdStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcdStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcdStub>() {
        @java.lang.Override
        public AcdStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcdStub(channel, callOptions);
        }
      };
    return AcdStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcdBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcdBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcdBlockingStub>() {
        @java.lang.Override
        public AcdBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcdBlockingStub(channel, callOptions);
        }
      };
    return AcdBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AcdFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcdFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcdFutureStub>() {
        @java.lang.Override
        public AcdFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcdFutureStub(channel, callOptions);
        }
      };
    return AcdFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for interacting with TCN's Agent Call Distribution system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void agentGetStatusStream(com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentGetStatusStreamMethod(), responseObserver);
    }

    /**
     */
    default void agentGetStatus(com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentGetStatusMethod(), responseObserver);
    }

    /**
     */
    default void agentGetConnectedParty(com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentGetConnectedPartyMethod(), responseObserver);
    }

    /**
     */
    default void managerAgentGetConnectedParty(com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getManagerAgentGetConnectedPartyMethod(), responseObserver);
    }

    /**
     */
    default void agentIntercom(com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentIntercomMethod(), responseObserver);
    }

    /**
     */
    default void agentIntercomAccept(com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentIntercomAcceptMethod(), responseObserver);
    }

    /**
     */
    default void agentIntercomReject(com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentIntercomRejectMethod(), responseObserver);
    }

    /**
     */
    default void agentIntercomCancel(com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentIntercomCancelMethod(), responseObserver);
    }

    /**
     */
    default void dialManualPrepare(com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDialManualPrepareMethod(), responseObserver);
    }

    /**
     */
    default void dialManualCancel(com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DialManualCancelReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDialManualCancelMethod(), responseObserver);
    }

    /**
     */
    default void dialPreviewPrepare(com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDialPreviewPrepareMethod(), responseObserver);
    }

    /**
     */
    default void agentPause(com.tcn.cloud.api.api.v0alpha.AgentPauseRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPauseReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentPauseMethod(), responseObserver);
    }

    /**
     */
    default void agentSetReady(com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentSetReadyMethod(), responseObserver);
    }

    /**
     */
    default void agentGUIBusy(com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentGUIBusyMethod(), responseObserver);
    }

    /**
     */
    default void reportAgentSessionEvent(com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportAgentSessionEventMethod(), responseObserver);
    }

    /**
     */
    default void callerRequeue(com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallerRequeueReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallerRequeueMethod(), responseObserver);
    }

    /**
     */
    default void agentDisconnect(com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentDisconnectMethod(), responseObserver);
    }

    /**
     */
    default void transferWarmToOutboundCancel(com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferWarmToOutboundCancelMethod(), responseObserver);
    }

    /**
     */
    default void transferWarmToAgentCancel(com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferWarmToAgentCancelMethod(), responseObserver);
    }

    /**
     */
    default void transferWarmToOutboundApprove(com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferWarmToOutboundApproveMethod(), responseObserver);
    }

    /**
     */
    default void transferWarmToAgentApprove(com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferWarmToAgentApproveMethod(), responseObserver);
    }

    /**
     */
    default void callerSendToVoicemail(com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallerSendToVoicemailMethod(), responseObserver);
    }

    /**
     */
    default void agentInviteTransferCallerToConference(com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentInviteTransferCallerToConferenceMethod(), responseObserver);
    }

    /**
     */
    default void agentMonitorCalls(com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentMonitorCallsMethod(), responseObserver);
    }

    /**
     */
    default void transferColdToOutbound(com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferColdToOutboundMethod(), responseObserver);
    }

    /**
     */
    default void transferColdToAgent(com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferColdToAgentMethod(), responseObserver);
    }

    /**
     */
    default void transferWarmToOutboundStart(com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferWarmToOutboundStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * creates a new outbound transfer member using the given src/dst numbers
     * </pre>
     */
    default void createWarmOutboundTransferMember(com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWarmOutboundTransferMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * hangups a transfer member using the given member identifier
     * </pre>
     */
    default void removeTransferMember(com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTransferMemberMethod(), responseObserver);
    }

    /**
     */
    default void transferWarmToAgentStart(com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferWarmToAgentStartMethod(), responseObserver);
    }

    /**
     */
    default void agentGetCallFromHold(com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentGetCallFromHoldMethod(), responseObserver);
    }

    /**
     */
    default void agentGetSpecificCallFromHold(com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentGetSpecificCallFromHoldMethod(), responseObserver);
    }

    /**
     */
    default void aCDGetAllAgentsStatuses(com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getACDGetAllAgentsStatusesMethod(), responseObserver);
    }

    /**
     */
    default void agentPutCallOnHold(com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentPutCallOnHoldMethod(), responseObserver);
    }

    /**
     */
    default void agentReceiveMessage(com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentReceiveMessageMethod(), responseObserver);
    }

    /**
     */
    default void agentPBXApproveCall(com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentPBXApproveCallMethod(), responseObserver);
    }

    /**
     */
    default void agentPBXRejectCall(com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentPBXRejectCallMethod(), responseObserver);
    }

    /**
     */
    default void getCallerLostPeer(com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCallerLostPeerMethod(), responseObserver);
    }

    /**
     */
    default void callerGetRawEvent(com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallerGetRawEventMethod(), responseObserver);
    }

    /**
     */
    default void peerAgentWithCaller(com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPeerAgentWithCallerMethod(), responseObserver);
    }

    /**
     */
    default void holdTransferMember(com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHoldTransferMemberMethod(), responseObserver);
    }

    /**
     */
    default void unholdTransferMember(com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnholdTransferMemberMethod(), responseObserver);
    }

    /**
     */
    default void getAgentCallCounts(com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentCallCountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * endpoint used to start a warm caller transfer
     * </pre>
     */
    default void warmCallerTransferStart(com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWarmCallerTransferStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * endpoint used to cancel a warm caller transfer
     * </pre>
     */
    default void warmCallerTransferCancel(com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWarmCallerTransferCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * endpoint used to approve a warm caller transfer
     * </pre>
     */
    default void warmCallerTransferApprove(com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWarmCallerTransferApproveMethod(), responseObserver);
    }

    /**
     * <pre>
     * endpoint used to play a soundboard file for a customer
     * </pre>
     */
    default void playSoundboardEntity(com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaySoundboardEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * endpoint used to stop a soundboard file for a customer
     * </pre>
     */
    default void stopSoundboardEntity(com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopSoundboardEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * endpoint used to update an agent's skills
     * </pre>
     */
    default void updateAgentSkills(com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentSkillsMethod(), responseObserver);
    }

    /**
     * <pre>
     * endpoint used to play a dtmf tone to all members of a the agent's conference
     * </pre>
     */
    default void playDTMF(com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PlayDTMFReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayDTMFMethod(), responseObserver);
    }

    /**
     * <pre>
     * endpoint used to mute and agent's mic
     * </pre>
     */
    default void agentMute(com.tcn.cloud.api.api.v0alpha.AgentMuteRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentMuteReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentMuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * endpoint used to unmute and agent's mic
     * </pre>
     */
    default void agentUnmute(com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentUnmuteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Acd.
   * <pre>
   * Service for interacting with TCN's Agent Call Distribution system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static abstract class AcdImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AcdGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Acd.
   * <pre>
   * Service for interacting with TCN's Agent Call Distribution system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class AcdStub
      extends io.grpc.stub.AbstractAsyncStub<AcdStub> {
    private AcdStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcdStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcdStub(channel, callOptions);
    }

    /**
     */
    public void agentGetStatusStream(com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getAgentGetStatusStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentGetStatus(com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentGetConnectedParty(com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentGetConnectedPartyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void managerAgentGetConnectedParty(com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getManagerAgentGetConnectedPartyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentIntercom(com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentIntercomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentIntercomAccept(com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentIntercomAcceptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentIntercomReject(com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentIntercomRejectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentIntercomCancel(com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentIntercomCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dialManualPrepare(com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDialManualPrepareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dialManualCancel(com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DialManualCancelReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDialManualCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dialPreviewPrepare(com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDialPreviewPrepareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentPause(com.tcn.cloud.api.api.v0alpha.AgentPauseRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPauseReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentPauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentSetReady(com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentSetReadyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentGUIBusy(com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentGUIBusyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reportAgentSessionEvent(com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportAgentSessionEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callerRequeue(com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallerRequeueReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallerRequeueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentDisconnect(com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentDisconnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferWarmToOutboundCancel(com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferWarmToOutboundCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferWarmToAgentCancel(com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferWarmToAgentCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferWarmToOutboundApprove(com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferWarmToOutboundApproveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferWarmToAgentApprove(com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferWarmToAgentApproveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callerSendToVoicemail(com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallerSendToVoicemailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentInviteTransferCallerToConference(com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentInviteTransferCallerToConferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentMonitorCalls(com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentMonitorCallsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferColdToOutbound(com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferColdToOutboundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferColdToAgent(com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferColdToAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferWarmToOutboundStart(com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferWarmToOutboundStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * creates a new outbound transfer member using the given src/dst numbers
     * </pre>
     */
    public void createWarmOutboundTransferMember(com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWarmOutboundTransferMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * hangups a transfer member using the given member identifier
     * </pre>
     */
    public void removeTransferMember(com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTransferMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferWarmToAgentStart(com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferWarmToAgentStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentGetCallFromHold(com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentGetCallFromHoldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentGetSpecificCallFromHold(com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentGetSpecificCallFromHoldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void aCDGetAllAgentsStatuses(com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getACDGetAllAgentsStatusesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentPutCallOnHold(com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentPutCallOnHoldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentReceiveMessage(com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentReceiveMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentPBXApproveCall(com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentPBXApproveCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agentPBXRejectCall(com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentPBXRejectCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCallerLostPeer(com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCallerLostPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callerGetRawEvent(com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallerGetRawEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void peerAgentWithCaller(com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPeerAgentWithCallerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void holdTransferMember(com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHoldTransferMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unholdTransferMember(com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnholdTransferMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAgentCallCounts(com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentCallCountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * endpoint used to start a warm caller transfer
     * </pre>
     */
    public void warmCallerTransferStart(com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWarmCallerTransferStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * endpoint used to cancel a warm caller transfer
     * </pre>
     */
    public void warmCallerTransferCancel(com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWarmCallerTransferCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * endpoint used to approve a warm caller transfer
     * </pre>
     */
    public void warmCallerTransferApprove(com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWarmCallerTransferApproveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * endpoint used to play a soundboard file for a customer
     * </pre>
     */
    public void playSoundboardEntity(com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaySoundboardEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * endpoint used to stop a soundboard file for a customer
     * </pre>
     */
    public void stopSoundboardEntity(com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopSoundboardEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * endpoint used to update an agent's skills
     * </pre>
     */
    public void updateAgentSkills(com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * endpoint used to play a dtmf tone to all members of a the agent's conference
     * </pre>
     */
    public void playDTMF(com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PlayDTMFReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayDTMFMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * endpoint used to mute and agent's mic
     * </pre>
     */
    public void agentMute(com.tcn.cloud.api.api.v0alpha.AgentMuteRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentMuteReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentMuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * endpoint used to unmute and agent's mic
     * </pre>
     */
    public void agentUnmute(com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentUnmuteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Acd.
   * <pre>
   * Service for interacting with TCN's Agent Call Distribution system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class AcdBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AcdBlockingStub> {
    private AcdBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcdBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcdBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> agentGetStatusStream(
        com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getAgentGetStatusStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply agentGetStatus(com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentGetStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply agentGetConnectedParty(com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentGetConnectedPartyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply managerAgentGetConnectedParty(com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getManagerAgentGetConnectedPartyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentIntercomReply agentIntercom(com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentIntercomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply agentIntercomAccept(com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentIntercomAcceptMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply agentIntercomReject(com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentIntercomRejectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply agentIntercomCancel(com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentIntercomCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply dialManualPrepare(com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDialManualPrepareMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DialManualCancelReply dialManualCancel(com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDialManualCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply dialPreviewPrepare(com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDialPreviewPrepareMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentPauseReply agentPause(com.tcn.cloud.api.api.v0alpha.AgentPauseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentPauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply agentSetReady(com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentSetReadyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply agentGUIBusy(com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentGUIBusyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes reportAgentSessionEvent(com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportAgentSessionEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CallerRequeueReply callerRequeue(com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallerRequeueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply agentDisconnect(com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentDisconnectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply transferWarmToOutboundCancel(com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferWarmToOutboundCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply transferWarmToAgentCancel(com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferWarmToAgentCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply transferWarmToOutboundApprove(com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferWarmToOutboundApproveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply transferWarmToAgentApprove(com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferWarmToAgentApproveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply callerSendToVoicemail(com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallerSendToVoicemailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply agentInviteTransferCallerToConference(com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentInviteTransferCallerToConferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply agentMonitorCalls(com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentMonitorCallsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply transferColdToOutbound(com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferColdToOutboundMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply transferColdToAgent(com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferColdToAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply transferWarmToOutboundStart(com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferWarmToOutboundStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * creates a new outbound transfer member using the given src/dst numbers
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply createWarmOutboundTransferMember(com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWarmOutboundTransferMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * hangups a transfer member using the given member identifier
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply removeTransferMember(com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTransferMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply transferWarmToAgentStart(com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferWarmToAgentStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply agentGetCallFromHold(com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentGetCallFromHoldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply agentGetSpecificCallFromHold(com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentGetSpecificCallFromHoldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply aCDGetAllAgentsStatuses(com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getACDGetAllAgentsStatusesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply agentPutCallOnHold(com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentPutCallOnHoldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply agentReceiveMessage(com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentReceiveMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply agentPBXApproveCall(com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentPBXApproveCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply agentPBXRejectCall(com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentPBXRejectCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply getCallerLostPeer(com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCallerLostPeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply callerGetRawEvent(com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallerGetRawEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply peerAgentWithCaller(com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPeerAgentWithCallerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes holdTransferMember(com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHoldTransferMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes unholdTransferMember(com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnholdTransferMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes getAgentCallCounts(com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentCallCountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * endpoint used to start a warm caller transfer
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes warmCallerTransferStart(com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWarmCallerTransferStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * endpoint used to cancel a warm caller transfer
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes warmCallerTransferCancel(com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWarmCallerTransferCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * endpoint used to approve a warm caller transfer
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes warmCallerTransferApprove(com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWarmCallerTransferApproveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * endpoint used to play a soundboard file for a customer
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes playSoundboardEntity(com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaySoundboardEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * endpoint used to stop a soundboard file for a customer
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes stopSoundboardEntity(com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopSoundboardEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * endpoint used to update an agent's skills
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply updateAgentSkills(com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentSkillsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * endpoint used to play a dtmf tone to all members of a the agent's conference
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.PlayDTMFReply playDTMF(com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayDTMFMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * endpoint used to mute and agent's mic
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentMuteReply agentMute(com.tcn.cloud.api.api.v0alpha.AgentMuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentMuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * endpoint used to unmute and agent's mic
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply agentUnmute(com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentUnmuteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Acd.
   * <pre>
   * Service for interacting with TCN's Agent Call Distribution system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class AcdFutureStub
      extends io.grpc.stub.AbstractFutureStub<AcdFutureStub> {
    private AcdFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcdFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcdFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply> agentGetStatus(
        com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentGetStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply> agentGetConnectedParty(
        com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentGetConnectedPartyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply> managerAgentGetConnectedParty(
        com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getManagerAgentGetConnectedPartyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentIntercomReply> agentIntercom(
        com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentIntercomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply> agentIntercomAccept(
        com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentIntercomAcceptMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply> agentIntercomReject(
        com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentIntercomRejectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply> agentIntercomCancel(
        com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentIntercomCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply> dialManualPrepare(
        com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDialManualPrepareMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DialManualCancelReply> dialManualCancel(
        com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDialManualCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply> dialPreviewPrepare(
        com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDialPreviewPrepareMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentPauseReply> agentPause(
        com.tcn.cloud.api.api.v0alpha.AgentPauseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentPauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply> agentSetReady(
        com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentSetReadyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply> agentGUIBusy(
        com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentGUIBusyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes> reportAgentSessionEvent(
        com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportAgentSessionEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CallerRequeueReply> callerRequeue(
        com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallerRequeueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply> agentDisconnect(
        com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentDisconnectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply> transferWarmToOutboundCancel(
        com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferWarmToOutboundCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply> transferWarmToAgentCancel(
        com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferWarmToAgentCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply> transferWarmToOutboundApprove(
        com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferWarmToOutboundApproveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply> transferWarmToAgentApprove(
        com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferWarmToAgentApproveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply> callerSendToVoicemail(
        com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallerSendToVoicemailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply> agentInviteTransferCallerToConference(
        com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentInviteTransferCallerToConferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply> agentMonitorCalls(
        com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentMonitorCallsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply> transferColdToOutbound(
        com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferColdToOutboundMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply> transferColdToAgent(
        com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferColdToAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply> transferWarmToOutboundStart(
        com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferWarmToOutboundStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * creates a new outbound transfer member using the given src/dst numbers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply> createWarmOutboundTransferMember(
        com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWarmOutboundTransferMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * hangups a transfer member using the given member identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply> removeTransferMember(
        com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTransferMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply> transferWarmToAgentStart(
        com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferWarmToAgentStartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply> agentGetCallFromHold(
        com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentGetCallFromHoldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply> agentGetSpecificCallFromHold(
        com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentGetSpecificCallFromHoldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply> aCDGetAllAgentsStatuses(
        com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getACDGetAllAgentsStatusesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply> agentPutCallOnHold(
        com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentPutCallOnHoldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply> agentReceiveMessage(
        com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentReceiveMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply> agentPBXApproveCall(
        com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentPBXApproveCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply> agentPBXRejectCall(
        com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentPBXRejectCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply> getCallerLostPeer(
        com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCallerLostPeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply> callerGetRawEvent(
        com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallerGetRawEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply> peerAgentWithCaller(
        com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPeerAgentWithCallerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes> holdTransferMember(
        com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHoldTransferMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes> unholdTransferMember(
        com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnholdTransferMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes> getAgentCallCounts(
        com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentCallCountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * endpoint used to start a warm caller transfer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes> warmCallerTransferStart(
        com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWarmCallerTransferStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * endpoint used to cancel a warm caller transfer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes> warmCallerTransferCancel(
        com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWarmCallerTransferCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * endpoint used to approve a warm caller transfer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes> warmCallerTransferApprove(
        com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWarmCallerTransferApproveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * endpoint used to play a soundboard file for a customer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes> playSoundboardEntity(
        com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaySoundboardEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * endpoint used to stop a soundboard file for a customer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes> stopSoundboardEntity(
        com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopSoundboardEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * endpoint used to update an agent's skills
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply> updateAgentSkills(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentSkillsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * endpoint used to play a dtmf tone to all members of a the agent's conference
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PlayDTMFReply> playDTMF(
        com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayDTMFMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * endpoint used to mute and agent's mic
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentMuteReply> agentMute(
        com.tcn.cloud.api.api.v0alpha.AgentMuteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentMuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * endpoint used to unmute and agent's mic
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply> agentUnmute(
        com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentUnmuteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AGENT_GET_STATUS_STREAM = 0;
  private static final int METHODID_AGENT_GET_STATUS = 1;
  private static final int METHODID_AGENT_GET_CONNECTED_PARTY = 2;
  private static final int METHODID_MANAGER_AGENT_GET_CONNECTED_PARTY = 3;
  private static final int METHODID_AGENT_INTERCOM = 4;
  private static final int METHODID_AGENT_INTERCOM_ACCEPT = 5;
  private static final int METHODID_AGENT_INTERCOM_REJECT = 6;
  private static final int METHODID_AGENT_INTERCOM_CANCEL = 7;
  private static final int METHODID_DIAL_MANUAL_PREPARE = 8;
  private static final int METHODID_DIAL_MANUAL_CANCEL = 9;
  private static final int METHODID_DIAL_PREVIEW_PREPARE = 10;
  private static final int METHODID_AGENT_PAUSE = 11;
  private static final int METHODID_AGENT_SET_READY = 12;
  private static final int METHODID_AGENT_GUIBUSY = 13;
  private static final int METHODID_REPORT_AGENT_SESSION_EVENT = 14;
  private static final int METHODID_CALLER_REQUEUE = 15;
  private static final int METHODID_AGENT_DISCONNECT = 16;
  private static final int METHODID_TRANSFER_WARM_TO_OUTBOUND_CANCEL = 17;
  private static final int METHODID_TRANSFER_WARM_TO_AGENT_CANCEL = 18;
  private static final int METHODID_TRANSFER_WARM_TO_OUTBOUND_APPROVE = 19;
  private static final int METHODID_TRANSFER_WARM_TO_AGENT_APPROVE = 20;
  private static final int METHODID_CALLER_SEND_TO_VOICEMAIL = 21;
  private static final int METHODID_AGENT_INVITE_TRANSFER_CALLER_TO_CONFERENCE = 22;
  private static final int METHODID_AGENT_MONITOR_CALLS = 23;
  private static final int METHODID_TRANSFER_COLD_TO_OUTBOUND = 24;
  private static final int METHODID_TRANSFER_COLD_TO_AGENT = 25;
  private static final int METHODID_TRANSFER_WARM_TO_OUTBOUND_START = 26;
  private static final int METHODID_CREATE_WARM_OUTBOUND_TRANSFER_MEMBER = 27;
  private static final int METHODID_REMOVE_TRANSFER_MEMBER = 28;
  private static final int METHODID_TRANSFER_WARM_TO_AGENT_START = 29;
  private static final int METHODID_AGENT_GET_CALL_FROM_HOLD = 30;
  private static final int METHODID_AGENT_GET_SPECIFIC_CALL_FROM_HOLD = 31;
  private static final int METHODID_ACDGET_ALL_AGENTS_STATUSES = 32;
  private static final int METHODID_AGENT_PUT_CALL_ON_HOLD = 33;
  private static final int METHODID_AGENT_RECEIVE_MESSAGE = 34;
  private static final int METHODID_AGENT_PBXAPPROVE_CALL = 35;
  private static final int METHODID_AGENT_PBXREJECT_CALL = 36;
  private static final int METHODID_GET_CALLER_LOST_PEER = 37;
  private static final int METHODID_CALLER_GET_RAW_EVENT = 38;
  private static final int METHODID_PEER_AGENT_WITH_CALLER = 39;
  private static final int METHODID_HOLD_TRANSFER_MEMBER = 40;
  private static final int METHODID_UNHOLD_TRANSFER_MEMBER = 41;
  private static final int METHODID_GET_AGENT_CALL_COUNTS = 42;
  private static final int METHODID_WARM_CALLER_TRANSFER_START = 43;
  private static final int METHODID_WARM_CALLER_TRANSFER_CANCEL = 44;
  private static final int METHODID_WARM_CALLER_TRANSFER_APPROVE = 45;
  private static final int METHODID_PLAY_SOUNDBOARD_ENTITY = 46;
  private static final int METHODID_STOP_SOUNDBOARD_ENTITY = 47;
  private static final int METHODID_UPDATE_AGENT_SKILLS = 48;
  private static final int METHODID_PLAY_DTMF = 49;
  private static final int METHODID_AGENT_MUTE = 50;
  private static final int METHODID_AGENT_UNMUTE = 51;

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
        case METHODID_AGENT_GET_STATUS_STREAM:
          serviceImpl.agentGetStatusStream((com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply>) responseObserver);
          break;
        case METHODID_AGENT_GET_STATUS:
          serviceImpl.agentGetStatus((com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply>) responseObserver);
          break;
        case METHODID_AGENT_GET_CONNECTED_PARTY:
          serviceImpl.agentGetConnectedParty((com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply>) responseObserver);
          break;
        case METHODID_MANAGER_AGENT_GET_CONNECTED_PARTY:
          serviceImpl.managerAgentGetConnectedParty((com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply>) responseObserver);
          break;
        case METHODID_AGENT_INTERCOM:
          serviceImpl.agentIntercom((com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomReply>) responseObserver);
          break;
        case METHODID_AGENT_INTERCOM_ACCEPT:
          serviceImpl.agentIntercomAccept((com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply>) responseObserver);
          break;
        case METHODID_AGENT_INTERCOM_REJECT:
          serviceImpl.agentIntercomReject((com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply>) responseObserver);
          break;
        case METHODID_AGENT_INTERCOM_CANCEL:
          serviceImpl.agentIntercomCancel((com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply>) responseObserver);
          break;
        case METHODID_DIAL_MANUAL_PREPARE:
          serviceImpl.dialManualPrepare((com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply>) responseObserver);
          break;
        case METHODID_DIAL_MANUAL_CANCEL:
          serviceImpl.dialManualCancel((com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DialManualCancelReply>) responseObserver);
          break;
        case METHODID_DIAL_PREVIEW_PREPARE:
          serviceImpl.dialPreviewPrepare((com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply>) responseObserver);
          break;
        case METHODID_AGENT_PAUSE:
          serviceImpl.agentPause((com.tcn.cloud.api.api.v0alpha.AgentPauseRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPauseReply>) responseObserver);
          break;
        case METHODID_AGENT_SET_READY:
          serviceImpl.agentSetReady((com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply>) responseObserver);
          break;
        case METHODID_AGENT_GUIBUSY:
          serviceImpl.agentGUIBusy((com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply>) responseObserver);
          break;
        case METHODID_REPORT_AGENT_SESSION_EVENT:
          serviceImpl.reportAgentSessionEvent((com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes>) responseObserver);
          break;
        case METHODID_CALLER_REQUEUE:
          serviceImpl.callerRequeue((com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallerRequeueReply>) responseObserver);
          break;
        case METHODID_AGENT_DISCONNECT:
          serviceImpl.agentDisconnect((com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply>) responseObserver);
          break;
        case METHODID_TRANSFER_WARM_TO_OUTBOUND_CANCEL:
          serviceImpl.transferWarmToOutboundCancel((com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply>) responseObserver);
          break;
        case METHODID_TRANSFER_WARM_TO_AGENT_CANCEL:
          serviceImpl.transferWarmToAgentCancel((com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply>) responseObserver);
          break;
        case METHODID_TRANSFER_WARM_TO_OUTBOUND_APPROVE:
          serviceImpl.transferWarmToOutboundApprove((com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply>) responseObserver);
          break;
        case METHODID_TRANSFER_WARM_TO_AGENT_APPROVE:
          serviceImpl.transferWarmToAgentApprove((com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply>) responseObserver);
          break;
        case METHODID_CALLER_SEND_TO_VOICEMAIL:
          serviceImpl.callerSendToVoicemail((com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply>) responseObserver);
          break;
        case METHODID_AGENT_INVITE_TRANSFER_CALLER_TO_CONFERENCE:
          serviceImpl.agentInviteTransferCallerToConference((com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply>) responseObserver);
          break;
        case METHODID_AGENT_MONITOR_CALLS:
          serviceImpl.agentMonitorCalls((com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply>) responseObserver);
          break;
        case METHODID_TRANSFER_COLD_TO_OUTBOUND:
          serviceImpl.transferColdToOutbound((com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply>) responseObserver);
          break;
        case METHODID_TRANSFER_COLD_TO_AGENT:
          serviceImpl.transferColdToAgent((com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply>) responseObserver);
          break;
        case METHODID_TRANSFER_WARM_TO_OUTBOUND_START:
          serviceImpl.transferWarmToOutboundStart((com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply>) responseObserver);
          break;
        case METHODID_CREATE_WARM_OUTBOUND_TRANSFER_MEMBER:
          serviceImpl.createWarmOutboundTransferMember((com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply>) responseObserver);
          break;
        case METHODID_REMOVE_TRANSFER_MEMBER:
          serviceImpl.removeTransferMember((com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply>) responseObserver);
          break;
        case METHODID_TRANSFER_WARM_TO_AGENT_START:
          serviceImpl.transferWarmToAgentStart((com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply>) responseObserver);
          break;
        case METHODID_AGENT_GET_CALL_FROM_HOLD:
          serviceImpl.agentGetCallFromHold((com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply>) responseObserver);
          break;
        case METHODID_AGENT_GET_SPECIFIC_CALL_FROM_HOLD:
          serviceImpl.agentGetSpecificCallFromHold((com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply>) responseObserver);
          break;
        case METHODID_ACDGET_ALL_AGENTS_STATUSES:
          serviceImpl.aCDGetAllAgentsStatuses((com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply>) responseObserver);
          break;
        case METHODID_AGENT_PUT_CALL_ON_HOLD:
          serviceImpl.agentPutCallOnHold((com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply>) responseObserver);
          break;
        case METHODID_AGENT_RECEIVE_MESSAGE:
          serviceImpl.agentReceiveMessage((com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply>) responseObserver);
          break;
        case METHODID_AGENT_PBXAPPROVE_CALL:
          serviceImpl.agentPBXApproveCall((com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply>) responseObserver);
          break;
        case METHODID_AGENT_PBXREJECT_CALL:
          serviceImpl.agentPBXRejectCall((com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply>) responseObserver);
          break;
        case METHODID_GET_CALLER_LOST_PEER:
          serviceImpl.getCallerLostPeer((com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply>) responseObserver);
          break;
        case METHODID_CALLER_GET_RAW_EVENT:
          serviceImpl.callerGetRawEvent((com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply>) responseObserver);
          break;
        case METHODID_PEER_AGENT_WITH_CALLER:
          serviceImpl.peerAgentWithCaller((com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply>) responseObserver);
          break;
        case METHODID_HOLD_TRANSFER_MEMBER:
          serviceImpl.holdTransferMember((com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes>) responseObserver);
          break;
        case METHODID_UNHOLD_TRANSFER_MEMBER:
          serviceImpl.unholdTransferMember((com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes>) responseObserver);
          break;
        case METHODID_GET_AGENT_CALL_COUNTS:
          serviceImpl.getAgentCallCounts((com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes>) responseObserver);
          break;
        case METHODID_WARM_CALLER_TRANSFER_START:
          serviceImpl.warmCallerTransferStart((com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes>) responseObserver);
          break;
        case METHODID_WARM_CALLER_TRANSFER_CANCEL:
          serviceImpl.warmCallerTransferCancel((com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes>) responseObserver);
          break;
        case METHODID_WARM_CALLER_TRANSFER_APPROVE:
          serviceImpl.warmCallerTransferApprove((com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes>) responseObserver);
          break;
        case METHODID_PLAY_SOUNDBOARD_ENTITY:
          serviceImpl.playSoundboardEntity((com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes>) responseObserver);
          break;
        case METHODID_STOP_SOUNDBOARD_ENTITY:
          serviceImpl.stopSoundboardEntity((com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_SKILLS:
          serviceImpl.updateAgentSkills((com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply>) responseObserver);
          break;
        case METHODID_PLAY_DTMF:
          serviceImpl.playDTMF((com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PlayDTMFReply>) responseObserver);
          break;
        case METHODID_AGENT_MUTE:
          serviceImpl.agentMute((com.tcn.cloud.api.api.v0alpha.AgentMuteRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentMuteReply>) responseObserver);
          break;
        case METHODID_AGENT_UNMUTE:
          serviceImpl.agentUnmute((com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply>) responseObserver);
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
          getAgentGetStatusStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest,
              com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply>(
                service, METHODID_AGENT_GET_STATUS_STREAM)))
        .addMethod(
          getAgentGetStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentGetStatusRequest,
              com.tcn.cloud.api.api.v0alpha.AgentGetStatusReply>(
                service, METHODID_AGENT_GET_STATUS)))
        .addMethod(
          getAgentGetConnectedPartyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyRequest,
              com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply>(
                service, METHODID_AGENT_GET_CONNECTED_PARTY)))
        .addMethod(
          getManagerAgentGetConnectedPartyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyRequest,
              com.tcn.cloud.api.api.v0alpha.ManagerAgentGetConnectedPartyReply>(
                service, METHODID_MANAGER_AGENT_GET_CONNECTED_PARTY)))
        .addMethod(
          getAgentIntercomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentIntercomRequest,
              com.tcn.cloud.api.api.v0alpha.AgentIntercomReply>(
                service, METHODID_AGENT_INTERCOM)))
        .addMethod(
          getAgentIntercomAcceptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptRequest,
              com.tcn.cloud.api.api.v0alpha.AgentIntercomAcceptReply>(
                service, METHODID_AGENT_INTERCOM_ACCEPT)))
        .addMethod(
          getAgentIntercomRejectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectRequest,
              com.tcn.cloud.api.api.v0alpha.AgentIntercomRejectReply>(
                service, METHODID_AGENT_INTERCOM_REJECT)))
        .addMethod(
          getAgentIntercomCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelRequest,
              com.tcn.cloud.api.api.v0alpha.AgentIntercomCancelReply>(
                service, METHODID_AGENT_INTERCOM_CANCEL)))
        .addMethod(
          getDialManualPrepareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DialManualPrepareRequest,
              com.tcn.cloud.api.api.v0alpha.DialManualPrepareReply>(
                service, METHODID_DIAL_MANUAL_PREPARE)))
        .addMethod(
          getDialManualCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DialManualCancelRequest,
              com.tcn.cloud.api.api.v0alpha.DialManualCancelReply>(
                service, METHODID_DIAL_MANUAL_CANCEL)))
        .addMethod(
          getDialPreviewPrepareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareRequest,
              com.tcn.cloud.api.api.v0alpha.DialPreviewPrepareReply>(
                service, METHODID_DIAL_PREVIEW_PREPARE)))
        .addMethod(
          getAgentPauseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentPauseRequest,
              com.tcn.cloud.api.api.v0alpha.AgentPauseReply>(
                service, METHODID_AGENT_PAUSE)))
        .addMethod(
          getAgentSetReadyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentSetReadyRequest,
              com.tcn.cloud.api.api.v0alpha.AgentSetReadyReply>(
                service, METHODID_AGENT_SET_READY)))
        .addMethod(
          getAgentGUIBusyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentGUIBusyRequest,
              com.tcn.cloud.api.api.v0alpha.AgentGUIBusyReply>(
                service, METHODID_AGENT_GUIBUSY)))
        .addMethod(
          getReportAgentSessionEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentSessionEventReq,
              com.tcn.cloud.api.api.v0alpha.AgentSessionEventRes>(
                service, METHODID_REPORT_AGENT_SESSION_EVENT)))
        .addMethod(
          getCallerRequeueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CallerRequeueRequest,
              com.tcn.cloud.api.api.v0alpha.CallerRequeueReply>(
                service, METHODID_CALLER_REQUEUE)))
        .addMethod(
          getAgentDisconnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentDisconnectRequest,
              com.tcn.cloud.api.api.v0alpha.AgentDisconnectReply>(
                service, METHODID_AGENT_DISCONNECT)))
        .addMethod(
          getTransferWarmToOutboundCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelRequest,
              com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundCancelReply>(
                service, METHODID_TRANSFER_WARM_TO_OUTBOUND_CANCEL)))
        .addMethod(
          getTransferWarmToAgentCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelRequest,
              com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentCancelReply>(
                service, METHODID_TRANSFER_WARM_TO_AGENT_CANCEL)))
        .addMethod(
          getTransferWarmToOutboundApproveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveRequest,
              com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundApproveReply>(
                service, METHODID_TRANSFER_WARM_TO_OUTBOUND_APPROVE)))
        .addMethod(
          getTransferWarmToAgentApproveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveRequest,
              com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentApproveReply>(
                service, METHODID_TRANSFER_WARM_TO_AGENT_APPROVE)))
        .addMethod(
          getCallerSendToVoicemailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailRequest,
              com.tcn.cloud.api.api.v0alpha.CallerSendToVoicemailReply>(
                service, METHODID_CALLER_SEND_TO_VOICEMAIL)))
        .addMethod(
          getAgentInviteTransferCallerToConferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceRequest,
              com.tcn.cloud.api.api.v0alpha.AgentInviteTransferCallerToConferenceReply>(
                service, METHODID_AGENT_INVITE_TRANSFER_CALLER_TO_CONFERENCE)))
        .addMethod(
          getAgentMonitorCallsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsRequest,
              com.tcn.cloud.api.api.v0alpha.AgentMonitorCallsReply>(
                service, METHODID_AGENT_MONITOR_CALLS)))
        .addMethod(
          getTransferColdToOutboundMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundRequest,
              com.tcn.cloud.api.api.v0alpha.TransferColdToOutboundReply>(
                service, METHODID_TRANSFER_COLD_TO_OUTBOUND)))
        .addMethod(
          getTransferColdToAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest,
              com.tcn.cloud.api.api.v0alpha.TransferColdToAgentReply>(
                service, METHODID_TRANSFER_COLD_TO_AGENT)))
        .addMethod(
          getTransferWarmToOutboundStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartRequest,
              com.tcn.cloud.api.api.v0alpha.TransferWarmToOutboundStartReply>(
                service, METHODID_TRANSFER_WARM_TO_OUTBOUND_START)))
        .addMethod(
          getCreateWarmOutboundTransferMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberRequest,
              com.tcn.cloud.api.api.v0alpha.CreateWarmOutboundTransferMemberReply>(
                service, METHODID_CREATE_WARM_OUTBOUND_TRANSFER_MEMBER)))
        .addMethod(
          getRemoveTransferMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberRequest,
              com.tcn.cloud.api.api.v0alpha.RemoveTransferMemberReply>(
                service, METHODID_REMOVE_TRANSFER_MEMBER)))
        .addMethod(
          getTransferWarmToAgentStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartRequest,
              com.tcn.cloud.api.api.v0alpha.TransferWarmToAgentStartReply>(
                service, METHODID_TRANSFER_WARM_TO_AGENT_START)))
        .addMethod(
          getAgentGetCallFromHoldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldRequest,
              com.tcn.cloud.api.api.v0alpha.AgentGetCallFromHoldReply>(
                service, METHODID_AGENT_GET_CALL_FROM_HOLD)))
        .addMethod(
          getAgentGetSpecificCallFromHoldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldRequest,
              com.tcn.cloud.api.api.v0alpha.AgentGetSpecificCallFromHoldReply>(
                service, METHODID_AGENT_GET_SPECIFIC_CALL_FROM_HOLD)))
        .addMethod(
          getACDGetAllAgentsStatusesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesRequest,
              com.tcn.cloud.api.api.v0alpha.ACDGetAllAgentsStatusesReply>(
                service, METHODID_ACDGET_ALL_AGENTS_STATUSES)))
        .addMethod(
          getAgentPutCallOnHoldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest,
              com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldReply>(
                service, METHODID_AGENT_PUT_CALL_ON_HOLD)))
        .addMethod(
          getAgentReceiveMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageRequest,
              com.tcn.cloud.api.api.v0alpha.AgentReceiveMessageReply>(
                service, METHODID_AGENT_RECEIVE_MESSAGE)))
        .addMethod(
          getAgentPBXApproveCallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallRequest,
              com.tcn.cloud.api.api.v0alpha.AgentPBXApproveCallReply>(
                service, METHODID_AGENT_PBXAPPROVE_CALL)))
        .addMethod(
          getAgentPBXRejectCallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallRequest,
              com.tcn.cloud.api.api.v0alpha.AgentPBXRejectCallReply>(
                service, METHODID_AGENT_PBXREJECT_CALL)))
        .addMethod(
          getGetCallerLostPeerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerRequest,
              com.tcn.cloud.api.api.v0alpha.GetCallerLostPeerReply>(
                service, METHODID_GET_CALLER_LOST_PEER)))
        .addMethod(
          getCallerGetRawEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CallerGetRawEventRequest,
              com.tcn.cloud.api.api.v0alpha.CallerGetRawEventReply>(
                service, METHODID_CALLER_GET_RAW_EVENT)))
        .addMethod(
          getPeerAgentWithCallerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerRequest,
              com.tcn.cloud.api.api.v0alpha.PeerAgentWithCallerReply>(
                service, METHODID_PEER_AGENT_WITH_CALLER)))
        .addMethod(
          getHoldTransferMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq,
              com.tcn.cloud.api.api.v0alpha.HoldTransferMemberRes>(
                service, METHODID_HOLD_TRANSFER_MEMBER)))
        .addMethod(
          getUnholdTransferMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberReq,
              com.tcn.cloud.api.api.v0alpha.UnholdTransferMemberRes>(
                service, METHODID_UNHOLD_TRANSFER_MEMBER)))
        .addMethod(
          getGetAgentCallCountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsReq,
              com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes>(
                service, METHODID_GET_AGENT_CALL_COUNTS)))
        .addMethod(
          getWarmCallerTransferStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartReq,
              com.tcn.cloud.api.api.v0alpha.WarmCallerTransferStartRes>(
                service, METHODID_WARM_CALLER_TRANSFER_START)))
        .addMethod(
          getWarmCallerTransferCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelReq,
              com.tcn.cloud.api.api.v0alpha.WarmCallerTransferCancelRes>(
                service, METHODID_WARM_CALLER_TRANSFER_CANCEL)))
        .addMethod(
          getWarmCallerTransferApproveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveReq,
              com.tcn.cloud.api.api.v0alpha.WarmCallerTransferApproveRes>(
                service, METHODID_WARM_CALLER_TRANSFER_APPROVE)))
        .addMethod(
          getPlaySoundboardEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityReq,
              com.tcn.cloud.api.api.v0alpha.PlaySoundboardEntityRes>(
                service, METHODID_PLAY_SOUNDBOARD_ENTITY)))
        .addMethod(
          getStopSoundboardEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityReq,
              com.tcn.cloud.api.api.v0alpha.StopSoundboardEntityRes>(
                service, METHODID_STOP_SOUNDBOARD_ENTITY)))
        .addMethod(
          getUpdateAgentSkillsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReply>(
                service, METHODID_UPDATE_AGENT_SKILLS)))
        .addMethod(
          getPlayDTMFMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest,
              com.tcn.cloud.api.api.v0alpha.PlayDTMFReply>(
                service, METHODID_PLAY_DTMF)))
        .addMethod(
          getAgentMuteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentMuteRequest,
              com.tcn.cloud.api.api.v0alpha.AgentMuteReply>(
                service, METHODID_AGENT_MUTE)))
        .addMethod(
          getAgentUnmuteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AgentUnmuteRequest,
              com.tcn.cloud.api.api.v0alpha.AgentUnmuteReply>(
                service, METHODID_AGENT_UNMUTE)))
        .build();
  }

  private static abstract class AcdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AcdBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Acd");
    }
  }

  private static final class AcdFileDescriptorSupplier
      extends AcdBaseDescriptorSupplier {
    AcdFileDescriptorSupplier() {}
  }

  private static final class AcdMethodDescriptorSupplier
      extends AcdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AcdMethodDescriptorSupplier(String methodName) {
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
      synchronized (AcdGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AcdFileDescriptorSupplier())
              .addMethod(getAgentGetStatusStreamMethod())
              .addMethod(getAgentGetStatusMethod())
              .addMethod(getAgentGetConnectedPartyMethod())
              .addMethod(getManagerAgentGetConnectedPartyMethod())
              .addMethod(getAgentIntercomMethod())
              .addMethod(getAgentIntercomAcceptMethod())
              .addMethod(getAgentIntercomRejectMethod())
              .addMethod(getAgentIntercomCancelMethod())
              .addMethod(getDialManualPrepareMethod())
              .addMethod(getDialManualCancelMethod())
              .addMethod(getDialPreviewPrepareMethod())
              .addMethod(getAgentPauseMethod())
              .addMethod(getAgentSetReadyMethod())
              .addMethod(getAgentGUIBusyMethod())
              .addMethod(getReportAgentSessionEventMethod())
              .addMethod(getCallerRequeueMethod())
              .addMethod(getAgentDisconnectMethod())
              .addMethod(getTransferWarmToOutboundCancelMethod())
              .addMethod(getTransferWarmToAgentCancelMethod())
              .addMethod(getTransferWarmToOutboundApproveMethod())
              .addMethod(getTransferWarmToAgentApproveMethod())
              .addMethod(getCallerSendToVoicemailMethod())
              .addMethod(getAgentInviteTransferCallerToConferenceMethod())
              .addMethod(getAgentMonitorCallsMethod())
              .addMethod(getTransferColdToOutboundMethod())
              .addMethod(getTransferColdToAgentMethod())
              .addMethod(getTransferWarmToOutboundStartMethod())
              .addMethod(getCreateWarmOutboundTransferMemberMethod())
              .addMethod(getRemoveTransferMemberMethod())
              .addMethod(getTransferWarmToAgentStartMethod())
              .addMethod(getAgentGetCallFromHoldMethod())
              .addMethod(getAgentGetSpecificCallFromHoldMethod())
              .addMethod(getACDGetAllAgentsStatusesMethod())
              .addMethod(getAgentPutCallOnHoldMethod())
              .addMethod(getAgentReceiveMessageMethod())
              .addMethod(getAgentPBXApproveCallMethod())
              .addMethod(getAgentPBXRejectCallMethod())
              .addMethod(getGetCallerLostPeerMethod())
              .addMethod(getCallerGetRawEventMethod())
              .addMethod(getPeerAgentWithCallerMethod())
              .addMethod(getHoldTransferMemberMethod())
              .addMethod(getUnholdTransferMemberMethod())
              .addMethod(getGetAgentCallCountsMethod())
              .addMethod(getWarmCallerTransferStartMethod())
              .addMethod(getWarmCallerTransferCancelMethod())
              .addMethod(getWarmCallerTransferApproveMethod())
              .addMethod(getPlaySoundboardEntityMethod())
              .addMethod(getStopSoundboardEntityMethod())
              .addMethod(getUpdateAgentSkillsMethod())
              .addMethod(getPlayDTMFMethod())
              .addMethod(getAgentMuteMethod())
              .addMethod(getAgentUnmuteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
