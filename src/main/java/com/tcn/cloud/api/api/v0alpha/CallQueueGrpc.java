package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v0alpha/callqueue.proto")
public final class CallQueueGrpc {

  private CallQueueGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.CallQueue";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq,
      com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes> getDequeuePreviewRecordOrCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DequeuePreviewRecordOrCall",
      requestType = com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq,
      com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes> getDequeuePreviewRecordOrCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq, com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes> getDequeuePreviewRecordOrCallMethod;
    if ((getDequeuePreviewRecordOrCallMethod = CallQueueGrpc.getDequeuePreviewRecordOrCallMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getDequeuePreviewRecordOrCallMethod = CallQueueGrpc.getDequeuePreviewRecordOrCallMethod) == null) {
          CallQueueGrpc.getDequeuePreviewRecordOrCallMethod = getDequeuePreviewRecordOrCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq, com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "DequeuePreviewRecordOrCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("DequeuePreviewRecordOrCall"))
                  .build();
          }
        }
     }
     return getDequeuePreviewRecordOrCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq,
      com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes> getEnqueuePreviewRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnqueuePreviewRecord",
      requestType = com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq,
      com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes> getEnqueuePreviewRecordMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq, com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes> getEnqueuePreviewRecordMethod;
    if ((getEnqueuePreviewRecordMethod = CallQueueGrpc.getEnqueuePreviewRecordMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getEnqueuePreviewRecordMethod = CallQueueGrpc.getEnqueuePreviewRecordMethod) == null) {
          CallQueueGrpc.getEnqueuePreviewRecordMethod = getEnqueuePreviewRecordMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq, com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "EnqueuePreviewRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("EnqueuePreviewRecord"))
                  .build();
          }
        }
     }
     return getEnqueuePreviewRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq,
      com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes> getDequeueScrubbedCallForPreviewRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DequeueScrubbedCallForPreviewRecord",
      requestType = com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq,
      com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes> getDequeueScrubbedCallForPreviewRecordMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq, com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes> getDequeueScrubbedCallForPreviewRecordMethod;
    if ((getDequeueScrubbedCallForPreviewRecordMethod = CallQueueGrpc.getDequeueScrubbedCallForPreviewRecordMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getDequeueScrubbedCallForPreviewRecordMethod = CallQueueGrpc.getDequeueScrubbedCallForPreviewRecordMethod) == null) {
          CallQueueGrpc.getDequeueScrubbedCallForPreviewRecordMethod = getDequeueScrubbedCallForPreviewRecordMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq, com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "DequeueScrubbedCallForPreviewRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("DequeueScrubbedCallForPreviewRecord"))
                  .build();
          }
        }
     }
     return getDequeueScrubbedCallForPreviewRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq,
      com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes> getClearPreviewRecordReturnQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearPreviewRecordReturnQueue",
      requestType = com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq,
      com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes> getClearPreviewRecordReturnQueueMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq, com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes> getClearPreviewRecordReturnQueueMethod;
    if ((getClearPreviewRecordReturnQueueMethod = CallQueueGrpc.getClearPreviewRecordReturnQueueMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getClearPreviewRecordReturnQueueMethod = CallQueueGrpc.getClearPreviewRecordReturnQueueMethod) == null) {
          CallQueueGrpc.getClearPreviewRecordReturnQueueMethod = getClearPreviewRecordReturnQueueMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq, com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "ClearPreviewRecordReturnQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("ClearPreviewRecordReturnQueue"))
                  .build();
          }
        }
     }
     return getClearPreviewRecordReturnQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq,
      com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes> getEnqueuePreviewDialCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnqueuePreviewDialCall",
      requestType = com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq,
      com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes> getEnqueuePreviewDialCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq, com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes> getEnqueuePreviewDialCallMethod;
    if ((getEnqueuePreviewDialCallMethod = CallQueueGrpc.getEnqueuePreviewDialCallMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getEnqueuePreviewDialCallMethod = CallQueueGrpc.getEnqueuePreviewDialCallMethod) == null) {
          CallQueueGrpc.getEnqueuePreviewDialCallMethod = getEnqueuePreviewDialCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq, com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "EnqueuePreviewDialCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("EnqueuePreviewDialCall"))
                  .build();
          }
        }
     }
     return getEnqueuePreviewDialCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq,
      com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes> getClearManualDialQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearManualDialQueue",
      requestType = com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq,
      com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes> getClearManualDialQueueMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq, com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes> getClearManualDialQueueMethod;
    if ((getClearManualDialQueueMethod = CallQueueGrpc.getClearManualDialQueueMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getClearManualDialQueueMethod = CallQueueGrpc.getClearManualDialQueueMethod) == null) {
          CallQueueGrpc.getClearManualDialQueueMethod = getClearManualDialQueueMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq, com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "ClearManualDialQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("ClearManualDialQueue"))
                  .build();
          }
        }
     }
     return getClearManualDialQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq,
      com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes> getProcessManualDialCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessManualDialCall",
      requestType = com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq,
      com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes> getProcessManualDialCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq, com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes> getProcessManualDialCallMethod;
    if ((getProcessManualDialCallMethod = CallQueueGrpc.getProcessManualDialCallMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getProcessManualDialCallMethod = CallQueueGrpc.getProcessManualDialCallMethod) == null) {
          CallQueueGrpc.getProcessManualDialCallMethod = getProcessManualDialCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq, com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "ProcessManualDialCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("ProcessManualDialCall"))
                  .build();
          }
        }
     }
     return getProcessManualDialCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq,
      com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes> getDequeueCallForManualApprovalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DequeueCallForManualApproval",
      requestType = com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq,
      com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes> getDequeueCallForManualApprovalMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq, com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes> getDequeueCallForManualApprovalMethod;
    if ((getDequeueCallForManualApprovalMethod = CallQueueGrpc.getDequeueCallForManualApprovalMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getDequeueCallForManualApprovalMethod = CallQueueGrpc.getDequeueCallForManualApprovalMethod) == null) {
          CallQueueGrpc.getDequeueCallForManualApprovalMethod = getDequeueCallForManualApprovalMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq, com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "DequeueCallForManualApproval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("DequeueCallForManualApproval"))
                  .build();
          }
        }
     }
     return getDequeueCallForManualApprovalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq,
      com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes> getEnqueueManuallyApprovedCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnqueueManuallyApprovedCall",
      requestType = com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq,
      com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes> getEnqueueManuallyApprovedCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq, com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes> getEnqueueManuallyApprovedCallMethod;
    if ((getEnqueueManuallyApprovedCallMethod = CallQueueGrpc.getEnqueueManuallyApprovedCallMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getEnqueueManuallyApprovedCallMethod = CallQueueGrpc.getEnqueueManuallyApprovedCallMethod) == null) {
          CallQueueGrpc.getEnqueueManuallyApprovedCallMethod = getEnqueueManuallyApprovedCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq, com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "EnqueueManuallyApprovedCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("EnqueueManuallyApprovedCall"))
                  .build();
          }
        }
     }
     return getEnqueueManuallyApprovedCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq,
      com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes> getEnqueueManuallyRejectedCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnqueueManuallyRejectedCall",
      requestType = com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq,
      com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes> getEnqueueManuallyRejectedCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq, com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes> getEnqueueManuallyRejectedCallMethod;
    if ((getEnqueueManuallyRejectedCallMethod = CallQueueGrpc.getEnqueueManuallyRejectedCallMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getEnqueueManuallyRejectedCallMethod = CallQueueGrpc.getEnqueueManuallyRejectedCallMethod) == null) {
          CallQueueGrpc.getEnqueueManuallyRejectedCallMethod = getEnqueueManuallyRejectedCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq, com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "EnqueueManuallyRejectedCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("EnqueueManuallyRejectedCall"))
                  .build();
          }
        }
     }
     return getEnqueueManuallyRejectedCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq,
      com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes> getRequeueManuallyApprovedCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequeueManuallyApprovedCall",
      requestType = com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq,
      com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes> getRequeueManuallyApprovedCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq, com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes> getRequeueManuallyApprovedCallMethod;
    if ((getRequeueManuallyApprovedCallMethod = CallQueueGrpc.getRequeueManuallyApprovedCallMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getRequeueManuallyApprovedCallMethod = CallQueueGrpc.getRequeueManuallyApprovedCallMethod) == null) {
          CallQueueGrpc.getRequeueManuallyApprovedCallMethod = getRequeueManuallyApprovedCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq, com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "RequeueManuallyApprovedCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("RequeueManuallyApprovedCall"))
                  .build();
          }
        }
     }
     return getRequeueManuallyApprovedCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq,
      com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes> getEnqueueManuallyApprovedSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnqueueManuallyApprovedSms",
      requestType = com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq,
      com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes> getEnqueueManuallyApprovedSmsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq, com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes> getEnqueueManuallyApprovedSmsMethod;
    if ((getEnqueueManuallyApprovedSmsMethod = CallQueueGrpc.getEnqueueManuallyApprovedSmsMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getEnqueueManuallyApprovedSmsMethod = CallQueueGrpc.getEnqueueManuallyApprovedSmsMethod) == null) {
          CallQueueGrpc.getEnqueueManuallyApprovedSmsMethod = getEnqueueManuallyApprovedSmsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq, com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "EnqueueManuallyApprovedSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("EnqueueManuallyApprovedSms"))
                  .build();
          }
        }
     }
     return getEnqueueManuallyApprovedSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq,
      com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes> getEnqueueManuallyRejectedSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnqueueManuallyRejectedSms",
      requestType = com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq,
      com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes> getEnqueueManuallyRejectedSmsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq, com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes> getEnqueueManuallyRejectedSmsMethod;
    if ((getEnqueueManuallyRejectedSmsMethod = CallQueueGrpc.getEnqueueManuallyRejectedSmsMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getEnqueueManuallyRejectedSmsMethod = CallQueueGrpc.getEnqueueManuallyRejectedSmsMethod) == null) {
          CallQueueGrpc.getEnqueueManuallyRejectedSmsMethod = getEnqueueManuallyRejectedSmsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq, com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "EnqueueManuallyRejectedSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("EnqueueManuallyRejectedSms"))
                  .build();
          }
        }
     }
     return getEnqueueManuallyRejectedSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq,
      com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes> getRequeueManuallyApprovedSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequeueManuallyApprovedSms",
      requestType = com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq,
      com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes> getRequeueManuallyApprovedSmsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq, com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes> getRequeueManuallyApprovedSmsMethod;
    if ((getRequeueManuallyApprovedSmsMethod = CallQueueGrpc.getRequeueManuallyApprovedSmsMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getRequeueManuallyApprovedSmsMethod = CallQueueGrpc.getRequeueManuallyApprovedSmsMethod) == null) {
          CallQueueGrpc.getRequeueManuallyApprovedSmsMethod = getRequeueManuallyApprovedSmsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq, com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "RequeueManuallyApprovedSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("RequeueManuallyApprovedSms"))
                  .build();
          }
        }
     }
     return getRequeueManuallyApprovedSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq,
      com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes> getDequeueSmsMamForManualApprovalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DequeueSmsMamForManualApproval",
      requestType = com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq,
      com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes> getDequeueSmsMamForManualApprovalMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq, com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes> getDequeueSmsMamForManualApprovalMethod;
    if ((getDequeueSmsMamForManualApprovalMethod = CallQueueGrpc.getDequeueSmsMamForManualApprovalMethod) == null) {
      synchronized (CallQueueGrpc.class) {
        if ((getDequeueSmsMamForManualApprovalMethod = CallQueueGrpc.getDequeueSmsMamForManualApprovalMethod) == null) {
          CallQueueGrpc.getDequeueSmsMamForManualApprovalMethod = getDequeueSmsMamForManualApprovalMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq, com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.CallQueue", "DequeueSmsMamForManualApproval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CallQueueMethodDescriptorSupplier("DequeueSmsMamForManualApproval"))
                  .build();
          }
        }
     }
     return getDequeueSmsMamForManualApprovalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CallQueueStub newStub(io.grpc.Channel channel) {
    return new CallQueueStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CallQueueBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CallQueueBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CallQueueFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CallQueueFutureStub(channel);
  }

  /**
   */
  public static abstract class CallQueueImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns either a preview record or preview call from one of multiple queues,
     * it also returns a field for the queue name so record/call can be enqueued back to the same queue.
     * It checks for a record first, if no record is dequeued, then the preview call queues will be checked.
     * </pre>
     */
    public void dequeuePreviewRecordOrCall(com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDequeuePreviewRecordOrCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enqueues the given preview record into the specified queue.
     * </pre>
     */
    public void enqueuePreviewRecord(com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEnqueuePreviewRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the scrubbed simple call data for the given preview record.
     * </pre>
     */
    public void dequeueScrubbedCallForPreviewRecord(com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDequeueScrubbedCallForPreviewRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clears the preview record return queue for the requesting agent.
     * </pre>
     */
    public void clearPreviewRecordReturnQueue(com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes> responseObserver) {
      asyncUnimplementedUnaryCall(getClearPreviewRecordReturnQueueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enqueues the given preview dial call into the specified queue.
     * </pre>
     */
    public void enqueuePreviewDialCall(com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEnqueuePreviewDialCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clears the manual dial return queue of the requesting agent.
     * </pre>
     */
    public void clearManualDialQueue(com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes> responseObserver) {
      asyncUnimplementedUnaryCall(getClearManualDialQueueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enqueues the call to the manual dial receive queue for scrubbing.
     * The call will then be added to the manual dial return queue of the requesting agent.
     * The scrubbed call is then dequeued from that agent's manual dial return queue and returned.
     * </pre>
     */
    public void processManualDialCall(com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessManualDialCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Dequeues a call for manual approval from the requesting agent's hunt group queues or a client queue,
     * it also returns a field for the queue name so call can be enqueued back to the same queue.
     * </pre>
     */
    public void dequeueCallForManualApproval(com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDequeueCallForManualApprovalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enqueues a call in the MAC approval queue.
     * </pre>
     */
    public void enqueueManuallyApprovedCall(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEnqueueManuallyApprovedCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enqueues a call in the MAC rejection queue.
     * </pre>
     */
    public void enqueueManuallyRejectedCall(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEnqueueManuallyRejectedCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Requeues a call requiring manual approval to the specified queue.
     * </pre>
     */
    public void requeueManuallyApprovedCall(com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes> responseObserver) {
      asyncUnimplementedUnaryCall(getRequeueManuallyApprovedCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enqueues sms msg in the MAM approval queue.
     * </pre>
     */
    public void enqueueManuallyApprovedSms(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEnqueueManuallyApprovedSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enqueues sms msg in the MAM rejection queue.
     * </pre>
     */
    public void enqueueManuallyRejectedSms(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEnqueueManuallyRejectedSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Requeues sms msg requiring manual approval to the specified queue.
     * </pre>
     */
    public void requeueManuallyApprovedSms(com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getRequeueManuallyApprovedSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Dequeues a sms mam msg for manual approval from the requesting agent's hunt group queues or a client queue,
     * it also returns a field for the queue name so sms mam msg can be enqueued back to the same queue.
     * </pre>
     */
    public void dequeueSmsMamForManualApproval(com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDequeueSmsMamForManualApprovalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDequeuePreviewRecordOrCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq,
                com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes>(
                  this, METHODID_DEQUEUE_PREVIEW_RECORD_OR_CALL)))
          .addMethod(
            getEnqueuePreviewRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq,
                com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes>(
                  this, METHODID_ENQUEUE_PREVIEW_RECORD)))
          .addMethod(
            getDequeueScrubbedCallForPreviewRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq,
                com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes>(
                  this, METHODID_DEQUEUE_SCRUBBED_CALL_FOR_PREVIEW_RECORD)))
          .addMethod(
            getClearPreviewRecordReturnQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq,
                com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes>(
                  this, METHODID_CLEAR_PREVIEW_RECORD_RETURN_QUEUE)))
          .addMethod(
            getEnqueuePreviewDialCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq,
                com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes>(
                  this, METHODID_ENQUEUE_PREVIEW_DIAL_CALL)))
          .addMethod(
            getClearManualDialQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq,
                com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes>(
                  this, METHODID_CLEAR_MANUAL_DIAL_QUEUE)))
          .addMethod(
            getProcessManualDialCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq,
                com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes>(
                  this, METHODID_PROCESS_MANUAL_DIAL_CALL)))
          .addMethod(
            getDequeueCallForManualApprovalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq,
                com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes>(
                  this, METHODID_DEQUEUE_CALL_FOR_MANUAL_APPROVAL)))
          .addMethod(
            getEnqueueManuallyApprovedCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq,
                com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes>(
                  this, METHODID_ENQUEUE_MANUALLY_APPROVED_CALL)))
          .addMethod(
            getEnqueueManuallyRejectedCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq,
                com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes>(
                  this, METHODID_ENQUEUE_MANUALLY_REJECTED_CALL)))
          .addMethod(
            getRequeueManuallyApprovedCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq,
                com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes>(
                  this, METHODID_REQUEUE_MANUALLY_APPROVED_CALL)))
          .addMethod(
            getEnqueueManuallyApprovedSmsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq,
                com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes>(
                  this, METHODID_ENQUEUE_MANUALLY_APPROVED_SMS)))
          .addMethod(
            getEnqueueManuallyRejectedSmsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq,
                com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes>(
                  this, METHODID_ENQUEUE_MANUALLY_REJECTED_SMS)))
          .addMethod(
            getRequeueManuallyApprovedSmsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq,
                com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes>(
                  this, METHODID_REQUEUE_MANUALLY_APPROVED_SMS)))
          .addMethod(
            getDequeueSmsMamForManualApprovalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq,
                com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes>(
                  this, METHODID_DEQUEUE_SMS_MAM_FOR_MANUAL_APPROVAL)))
          .build();
    }
  }

  /**
   */
  public static final class CallQueueStub extends io.grpc.stub.AbstractStub<CallQueueStub> {
    private CallQueueStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CallQueueStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallQueueStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CallQueueStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns either a preview record or preview call from one of multiple queues,
     * it also returns a field for the queue name so record/call can be enqueued back to the same queue.
     * It checks for a record first, if no record is dequeued, then the preview call queues will be checked.
     * </pre>
     */
    public void dequeuePreviewRecordOrCall(com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDequeuePreviewRecordOrCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enqueues the given preview record into the specified queue.
     * </pre>
     */
    public void enqueuePreviewRecord(com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnqueuePreviewRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the scrubbed simple call data for the given preview record.
     * </pre>
     */
    public void dequeueScrubbedCallForPreviewRecord(com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDequeueScrubbedCallForPreviewRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clears the preview record return queue for the requesting agent.
     * </pre>
     */
    public void clearPreviewRecordReturnQueue(com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearPreviewRecordReturnQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enqueues the given preview dial call into the specified queue.
     * </pre>
     */
    public void enqueuePreviewDialCall(com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnqueuePreviewDialCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clears the manual dial return queue of the requesting agent.
     * </pre>
     */
    public void clearManualDialQueue(com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearManualDialQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enqueues the call to the manual dial receive queue for scrubbing.
     * The call will then be added to the manual dial return queue of the requesting agent.
     * The scrubbed call is then dequeued from that agent's manual dial return queue and returned.
     * </pre>
     */
    public void processManualDialCall(com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessManualDialCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Dequeues a call for manual approval from the requesting agent's hunt group queues or a client queue,
     * it also returns a field for the queue name so call can be enqueued back to the same queue.
     * </pre>
     */
    public void dequeueCallForManualApproval(com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDequeueCallForManualApprovalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enqueues a call in the MAC approval queue.
     * </pre>
     */
    public void enqueueManuallyApprovedCall(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnqueueManuallyApprovedCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enqueues a call in the MAC rejection queue.
     * </pre>
     */
    public void enqueueManuallyRejectedCall(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnqueueManuallyRejectedCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Requeues a call requiring manual approval to the specified queue.
     * </pre>
     */
    public void requeueManuallyApprovedCall(com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequeueManuallyApprovedCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enqueues sms msg in the MAM approval queue.
     * </pre>
     */
    public void enqueueManuallyApprovedSms(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnqueueManuallyApprovedSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enqueues sms msg in the MAM rejection queue.
     * </pre>
     */
    public void enqueueManuallyRejectedSms(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnqueueManuallyRejectedSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Requeues sms msg requiring manual approval to the specified queue.
     * </pre>
     */
    public void requeueManuallyApprovedSms(com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequeueManuallyApprovedSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Dequeues a sms mam msg for manual approval from the requesting agent's hunt group queues or a client queue,
     * it also returns a field for the queue name so sms mam msg can be enqueued back to the same queue.
     * </pre>
     */
    public void dequeueSmsMamForManualApproval(com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDequeueSmsMamForManualApprovalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CallQueueBlockingStub extends io.grpc.stub.AbstractStub<CallQueueBlockingStub> {
    private CallQueueBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CallQueueBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallQueueBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CallQueueBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns either a preview record or preview call from one of multiple queues,
     * it also returns a field for the queue name so record/call can be enqueued back to the same queue.
     * It checks for a record first, if no record is dequeued, then the preview call queues will be checked.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes dequeuePreviewRecordOrCall(com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq request) {
      return blockingUnaryCall(
          getChannel(), getDequeuePreviewRecordOrCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enqueues the given preview record into the specified queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes enqueuePreviewRecord(com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq request) {
      return blockingUnaryCall(
          getChannel(), getEnqueuePreviewRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the scrubbed simple call data for the given preview record.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes dequeueScrubbedCallForPreviewRecord(com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq request) {
      return blockingUnaryCall(
          getChannel(), getDequeueScrubbedCallForPreviewRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clears the preview record return queue for the requesting agent.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes clearPreviewRecordReturnQueue(com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq request) {
      return blockingUnaryCall(
          getChannel(), getClearPreviewRecordReturnQueueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enqueues the given preview dial call into the specified queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes enqueuePreviewDialCall(com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq request) {
      return blockingUnaryCall(
          getChannel(), getEnqueuePreviewDialCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clears the manual dial return queue of the requesting agent.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes clearManualDialQueue(com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq request) {
      return blockingUnaryCall(
          getChannel(), getClearManualDialQueueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enqueues the call to the manual dial receive queue for scrubbing.
     * The call will then be added to the manual dial return queue of the requesting agent.
     * The scrubbed call is then dequeued from that agent's manual dial return queue and returned.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes processManualDialCall(com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq request) {
      return blockingUnaryCall(
          getChannel(), getProcessManualDialCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Dequeues a call for manual approval from the requesting agent's hunt group queues or a client queue,
     * it also returns a field for the queue name so call can be enqueued back to the same queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes dequeueCallForManualApproval(com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq request) {
      return blockingUnaryCall(
          getChannel(), getDequeueCallForManualApprovalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enqueues a call in the MAC approval queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes enqueueManuallyApprovedCall(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq request) {
      return blockingUnaryCall(
          getChannel(), getEnqueueManuallyApprovedCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enqueues a call in the MAC rejection queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes enqueueManuallyRejectedCall(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq request) {
      return blockingUnaryCall(
          getChannel(), getEnqueueManuallyRejectedCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Requeues a call requiring manual approval to the specified queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes requeueManuallyApprovedCall(com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq request) {
      return blockingUnaryCall(
          getChannel(), getRequeueManuallyApprovedCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enqueues sms msg in the MAM approval queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes enqueueManuallyApprovedSms(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq request) {
      return blockingUnaryCall(
          getChannel(), getEnqueueManuallyApprovedSmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enqueues sms msg in the MAM rejection queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes enqueueManuallyRejectedSms(com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq request) {
      return blockingUnaryCall(
          getChannel(), getEnqueueManuallyRejectedSmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Requeues sms msg requiring manual approval to the specified queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes requeueManuallyApprovedSms(com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq request) {
      return blockingUnaryCall(
          getChannel(), getRequeueManuallyApprovedSmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Dequeues a sms mam msg for manual approval from the requesting agent's hunt group queues or a client queue,
     * it also returns a field for the queue name so sms mam msg can be enqueued back to the same queue.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes dequeueSmsMamForManualApproval(com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq request) {
      return blockingUnaryCall(
          getChannel(), getDequeueSmsMamForManualApprovalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CallQueueFutureStub extends io.grpc.stub.AbstractStub<CallQueueFutureStub> {
    private CallQueueFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CallQueueFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallQueueFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CallQueueFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns either a preview record or preview call from one of multiple queues,
     * it also returns a field for the queue name so record/call can be enqueued back to the same queue.
     * It checks for a record first, if no record is dequeued, then the preview call queues will be checked.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes> dequeuePreviewRecordOrCall(
        com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDequeuePreviewRecordOrCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enqueues the given preview record into the specified queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes> enqueuePreviewRecord(
        com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnqueuePreviewRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the scrubbed simple call data for the given preview record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes> dequeueScrubbedCallForPreviewRecord(
        com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDequeueScrubbedCallForPreviewRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clears the preview record return queue for the requesting agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes> clearPreviewRecordReturnQueue(
        com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq request) {
      return futureUnaryCall(
          getChannel().newCall(getClearPreviewRecordReturnQueueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enqueues the given preview dial call into the specified queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes> enqueuePreviewDialCall(
        com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnqueuePreviewDialCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clears the manual dial return queue of the requesting agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes> clearManualDialQueue(
        com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq request) {
      return futureUnaryCall(
          getChannel().newCall(getClearManualDialQueueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enqueues the call to the manual dial receive queue for scrubbing.
     * The call will then be added to the manual dial return queue of the requesting agent.
     * The scrubbed call is then dequeued from that agent's manual dial return queue and returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes> processManualDialCall(
        com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessManualDialCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Dequeues a call for manual approval from the requesting agent's hunt group queues or a client queue,
     * it also returns a field for the queue name so call can be enqueued back to the same queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes> dequeueCallForManualApproval(
        com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDequeueCallForManualApprovalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enqueues a call in the MAC approval queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes> enqueueManuallyApprovedCall(
        com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnqueueManuallyApprovedCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enqueues a call in the MAC rejection queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes> enqueueManuallyRejectedCall(
        com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnqueueManuallyRejectedCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Requeues a call requiring manual approval to the specified queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes> requeueManuallyApprovedCall(
        com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRequeueManuallyApprovedCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enqueues sms msg in the MAM approval queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes> enqueueManuallyApprovedSms(
        com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnqueueManuallyApprovedSmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enqueues sms msg in the MAM rejection queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes> enqueueManuallyRejectedSms(
        com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnqueueManuallyRejectedSmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Requeues sms msg requiring manual approval to the specified queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes> requeueManuallyApprovedSms(
        com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRequeueManuallyApprovedSmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Dequeues a sms mam msg for manual approval from the requesting agent's hunt group queues or a client queue,
     * it also returns a field for the queue name so sms mam msg can be enqueued back to the same queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes> dequeueSmsMamForManualApproval(
        com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDequeueSmsMamForManualApprovalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEQUEUE_PREVIEW_RECORD_OR_CALL = 0;
  private static final int METHODID_ENQUEUE_PREVIEW_RECORD = 1;
  private static final int METHODID_DEQUEUE_SCRUBBED_CALL_FOR_PREVIEW_RECORD = 2;
  private static final int METHODID_CLEAR_PREVIEW_RECORD_RETURN_QUEUE = 3;
  private static final int METHODID_ENQUEUE_PREVIEW_DIAL_CALL = 4;
  private static final int METHODID_CLEAR_MANUAL_DIAL_QUEUE = 5;
  private static final int METHODID_PROCESS_MANUAL_DIAL_CALL = 6;
  private static final int METHODID_DEQUEUE_CALL_FOR_MANUAL_APPROVAL = 7;
  private static final int METHODID_ENQUEUE_MANUALLY_APPROVED_CALL = 8;
  private static final int METHODID_ENQUEUE_MANUALLY_REJECTED_CALL = 9;
  private static final int METHODID_REQUEUE_MANUALLY_APPROVED_CALL = 10;
  private static final int METHODID_ENQUEUE_MANUALLY_APPROVED_SMS = 11;
  private static final int METHODID_ENQUEUE_MANUALLY_REJECTED_SMS = 12;
  private static final int METHODID_REQUEUE_MANUALLY_APPROVED_SMS = 13;
  private static final int METHODID_DEQUEUE_SMS_MAM_FOR_MANUAL_APPROVAL = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CallQueueImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CallQueueImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEQUEUE_PREVIEW_RECORD_OR_CALL:
          serviceImpl.dequeuePreviewRecordOrCall((com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeuePreviewRecordOrCallRes>) responseObserver);
          break;
        case METHODID_ENQUEUE_PREVIEW_RECORD:
          serviceImpl.enqueuePreviewRecord((com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordRes>) responseObserver);
          break;
        case METHODID_DEQUEUE_SCRUBBED_CALL_FOR_PREVIEW_RECORD:
          serviceImpl.dequeueScrubbedCallForPreviewRecord((com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeueScrubbedCallForPreviewRecordRes>) responseObserver);
          break;
        case METHODID_CLEAR_PREVIEW_RECORD_RETURN_QUEUE:
          serviceImpl.clearPreviewRecordReturnQueue((com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ClearPreviewRecordReturnQueueRes>) responseObserver);
          break;
        case METHODID_ENQUEUE_PREVIEW_DIAL_CALL:
          serviceImpl.enqueuePreviewDialCall((com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueuePreviewDialCallRes>) responseObserver);
          break;
        case METHODID_CLEAR_MANUAL_DIAL_QUEUE:
          serviceImpl.clearManualDialQueue((com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ClearManualDialQueueRes>) responseObserver);
          break;
        case METHODID_PROCESS_MANUAL_DIAL_CALL:
          serviceImpl.processManualDialCall((com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessManualDialCallRes>) responseObserver);
          break;
        case METHODID_DEQUEUE_CALL_FOR_MANUAL_APPROVAL:
          serviceImpl.dequeueCallForManualApproval((com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeueCallForManualApprovalRes>) responseObserver);
          break;
        case METHODID_ENQUEUE_MANUALLY_APPROVED_CALL:
          serviceImpl.enqueueManuallyApprovedCall((com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedCallRes>) responseObserver);
          break;
        case METHODID_ENQUEUE_MANUALLY_REJECTED_CALL:
          serviceImpl.enqueueManuallyRejectedCall((com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedCallRes>) responseObserver);
          break;
        case METHODID_REQUEUE_MANUALLY_APPROVED_CALL:
          serviceImpl.requeueManuallyApprovedCall((com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedCallRes>) responseObserver);
          break;
        case METHODID_ENQUEUE_MANUALLY_APPROVED_SMS:
          serviceImpl.enqueueManuallyApprovedSms((com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyApprovedSmsRes>) responseObserver);
          break;
        case METHODID_ENQUEUE_MANUALLY_REJECTED_SMS:
          serviceImpl.enqueueManuallyRejectedSms((com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnqueueManuallyRejectedSmsRes>) responseObserver);
          break;
        case METHODID_REQUEUE_MANUALLY_APPROVED_SMS:
          serviceImpl.requeueManuallyApprovedSms((com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RequeueManuallyApprovedSmsRes>) responseObserver);
          break;
        case METHODID_DEQUEUE_SMS_MAM_FOR_MANUAL_APPROVAL:
          serviceImpl.dequeueSmsMamForManualApproval((com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DequeueSmsMamForManualApprovalRes>) responseObserver);
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

  private static abstract class CallQueueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CallQueueBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.CallqueueProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CallQueue");
    }
  }

  private static final class CallQueueFileDescriptorSupplier
      extends CallQueueBaseDescriptorSupplier {
    CallQueueFileDescriptorSupplier() {}
  }

  private static final class CallQueueMethodDescriptorSupplier
      extends CallQueueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CallQueueMethodDescriptorSupplier(String methodName) {
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
      synchronized (CallQueueGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CallQueueFileDescriptorSupplier())
              .addMethod(getDequeuePreviewRecordOrCallMethod())
              .addMethod(getEnqueuePreviewRecordMethod())
              .addMethod(getDequeueScrubbedCallForPreviewRecordMethod())
              .addMethod(getClearPreviewRecordReturnQueueMethod())
              .addMethod(getEnqueuePreviewDialCallMethod())
              .addMethod(getClearManualDialQueueMethod())
              .addMethod(getProcessManualDialCallMethod())
              .addMethod(getDequeueCallForManualApprovalMethod())
              .addMethod(getEnqueueManuallyApprovedCallMethod())
              .addMethod(getEnqueueManuallyRejectedCallMethod())
              .addMethod(getRequeueManuallyApprovedCallMethod())
              .addMethod(getEnqueueManuallyApprovedSmsMethod())
              .addMethod(getEnqueueManuallyRejectedSmsMethod())
              .addMethod(getRequeueManuallyApprovedSmsMethod())
              .addMethod(getDequeueSmsMamForManualApprovalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
