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
    comments = "Source: api/v0alpha/compliance.proto")
public final class ComplianceGrpc {

  private ComplianceGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.Compliance";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq,
      com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes> getRuleAutoCompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RuleAutoComplete",
      requestType = com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq,
      com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes> getRuleAutoCompleteMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq, com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes> getRuleAutoCompleteMethod;
    if ((getRuleAutoCompleteMethod = ComplianceGrpc.getRuleAutoCompleteMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getRuleAutoCompleteMethod = ComplianceGrpc.getRuleAutoCompleteMethod) == null) {
          ComplianceGrpc.getRuleAutoCompleteMethod = getRuleAutoCompleteMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq, com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "RuleAutoComplete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("RuleAutoComplete"))
                  .build();
          }
        }
     }
     return getRuleAutoCompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes> getCheckRuleSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckRuleSet",
      requestType = com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes> getCheckRuleSetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq, com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes> getCheckRuleSetMethod;
    if ((getCheckRuleSetMethod = ComplianceGrpc.getCheckRuleSetMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getCheckRuleSetMethod = ComplianceGrpc.getCheckRuleSetMethod) == null) {
          ComplianceGrpc.getCheckRuleSetMethod = getCheckRuleSetMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq, com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "CheckRuleSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("CheckRuleSet"))
                  .build();
          }
        }
     }
     return getCheckRuleSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes> getAssignRuleSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRuleSet",
      requestType = com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes> getAssignRuleSetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq, com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes> getAssignRuleSetMethod;
    if ((getAssignRuleSetMethod = ComplianceGrpc.getAssignRuleSetMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getAssignRuleSetMethod = ComplianceGrpc.getAssignRuleSetMethod) == null) {
          ComplianceGrpc.getAssignRuleSetMethod = getAssignRuleSetMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq, com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "AssignRuleSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("AssignRuleSet"))
                  .build();
          }
        }
     }
     return getAssignRuleSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq,
      com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes> getListRuleSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRuleSets",
      requestType = com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq,
      com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes> getListRuleSetsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq, com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes> getListRuleSetsMethod;
    if ((getListRuleSetsMethod = ComplianceGrpc.getListRuleSetsMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getListRuleSetsMethod = ComplianceGrpc.getListRuleSetsMethod) == null) {
          ComplianceGrpc.getListRuleSetsMethod = getListRuleSetsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq, com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ListRuleSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ListRuleSets"))
                  .build();
          }
        }
     }
     return getListRuleSetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.RuleSet> getGetRuleSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRuleSet",
      requestType = com.tcn.cloud.api.api.v0alpha.GetRuleSetReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RuleSet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.RuleSet> getGetRuleSetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRuleSetReq, com.tcn.cloud.api.api.v0alpha.RuleSet> getGetRuleSetMethod;
    if ((getGetRuleSetMethod = ComplianceGrpc.getGetRuleSetMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetRuleSetMethod = ComplianceGrpc.getGetRuleSetMethod) == null) {
          ComplianceGrpc.getGetRuleSetMethod = getGetRuleSetMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetRuleSetReq, com.tcn.cloud.api.api.v0alpha.RuleSet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetRuleSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetRuleSetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RuleSet.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetRuleSet"))
                  .build();
          }
        }
     }
     return getGetRuleSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq,
      com.tcn.cloud.api.api.v0alpha.RuleSet> getGetRuleSetByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRuleSetByName",
      requestType = com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RuleSet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq,
      com.tcn.cloud.api.api.v0alpha.RuleSet> getGetRuleSetByNameMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq, com.tcn.cloud.api.api.v0alpha.RuleSet> getGetRuleSetByNameMethod;
    if ((getGetRuleSetByNameMethod = ComplianceGrpc.getGetRuleSetByNameMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetRuleSetByNameMethod = ComplianceGrpc.getGetRuleSetByNameMethod) == null) {
          ComplianceGrpc.getGetRuleSetByNameMethod = getGetRuleSetByNameMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq, com.tcn.cloud.api.api.v0alpha.RuleSet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetRuleSetByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RuleSet.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetRuleSetByName"))
                  .build();
          }
        }
     }
     return getGetRuleSetByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.RuleSet> getCreateRuleSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRuleSet",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RuleSet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.RuleSet> getCreateRuleSetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq, com.tcn.cloud.api.api.v0alpha.RuleSet> getCreateRuleSetMethod;
    if ((getCreateRuleSetMethod = ComplianceGrpc.getCreateRuleSetMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getCreateRuleSetMethod = ComplianceGrpc.getCreateRuleSetMethod) == null) {
          ComplianceGrpc.getCreateRuleSetMethod = getCreateRuleSetMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq, com.tcn.cloud.api.api.v0alpha.RuleSet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "CreateRuleSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RuleSet.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("CreateRuleSet"))
                  .build();
          }
        }
     }
     return getCreateRuleSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes> getRenameRuleSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameRuleSet",
      requestType = com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes> getRenameRuleSetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq, com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes> getRenameRuleSetMethod;
    if ((getRenameRuleSetMethod = ComplianceGrpc.getRenameRuleSetMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getRenameRuleSetMethod = ComplianceGrpc.getRenameRuleSetMethod) == null) {
          ComplianceGrpc.getRenameRuleSetMethod = getRenameRuleSetMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq, com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "RenameRuleSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("RenameRuleSet"))
                  .build();
          }
        }
     }
     return getRenameRuleSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes> getEnableRuleSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableRuleSet",
      requestType = com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes> getEnableRuleSetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq, com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes> getEnableRuleSetMethod;
    if ((getEnableRuleSetMethod = ComplianceGrpc.getEnableRuleSetMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getEnableRuleSetMethod = ComplianceGrpc.getEnableRuleSetMethod) == null) {
          ComplianceGrpc.getEnableRuleSetMethod = getEnableRuleSetMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq, com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "EnableRuleSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("EnableRuleSet"))
                  .build();
          }
        }
     }
     return getEnableRuleSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes> getDisableRuleSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableRuleSet",
      requestType = com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq,
      com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes> getDisableRuleSetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq, com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes> getDisableRuleSetMethod;
    if ((getDisableRuleSetMethod = ComplianceGrpc.getDisableRuleSetMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getDisableRuleSetMethod = ComplianceGrpc.getDisableRuleSetMethod) == null) {
          ComplianceGrpc.getDisableRuleSetMethod = getDisableRuleSetMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq, com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "DisableRuleSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("DisableRuleSet"))
                  .build();
          }
        }
     }
     return getDisableRuleSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getCreateScrubListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateScrubList",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateScrubListReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScrubListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getCreateScrubListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateScrubListReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes> getCreateScrubListMethod;
    if ((getCreateScrubListMethod = ComplianceGrpc.getCreateScrubListMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getCreateScrubListMethod = ComplianceGrpc.getCreateScrubListMethod) == null) {
          ComplianceGrpc.getCreateScrubListMethod = getCreateScrubListMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateScrubListReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "CreateScrubList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateScrubListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScrubListRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("CreateScrubList"))
                  .build();
          }
        }
     }
     return getCreateScrubListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getAddScrubListEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddScrubListEntries",
      requestType = com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScrubListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getAddScrubListEntriesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes> getAddScrubListEntriesMethod;
    if ((getAddScrubListEntriesMethod = ComplianceGrpc.getAddScrubListEntriesMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getAddScrubListEntriesMethod = ComplianceGrpc.getAddScrubListEntriesMethod) == null) {
          ComplianceGrpc.getAddScrubListEntriesMethod = getAddScrubListEntriesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "AddScrubListEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScrubListRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("AddScrubListEntries"))
                  .build();
          }
        }
     }
     return getAddScrubListEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes> getUpdateScrubEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScrubEntry",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes> getUpdateScrubEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq, com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes> getUpdateScrubEntryMethod;
    if ((getUpdateScrubEntryMethod = ComplianceGrpc.getUpdateScrubEntryMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getUpdateScrubEntryMethod = ComplianceGrpc.getUpdateScrubEntryMethod) == null) {
          ComplianceGrpc.getUpdateScrubEntryMethod = getUpdateScrubEntryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq, com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "UpdateScrubEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("UpdateScrubEntry"))
                  .build();
          }
        }
     }
     return getUpdateScrubEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getDeleteScrubListEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScrubListEntries",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScrubListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getDeleteScrubListEntriesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes> getDeleteScrubListEntriesMethod;
    if ((getDeleteScrubListEntriesMethod = ComplianceGrpc.getDeleteScrubListEntriesMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getDeleteScrubListEntriesMethod = ComplianceGrpc.getDeleteScrubListEntriesMethod) == null) {
          ComplianceGrpc.getDeleteScrubListEntriesMethod = getDeleteScrubListEntriesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "DeleteScrubListEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScrubListRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("DeleteScrubListEntries"))
                  .build();
          }
        }
     }
     return getDeleteScrubListEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getGetScrubListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScrubList",
      requestType = com.tcn.cloud.api.api.v0alpha.GetScrubListReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScrubListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getGetScrubListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScrubListReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes> getGetScrubListMethod;
    if ((getGetScrubListMethod = ComplianceGrpc.getGetScrubListMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetScrubListMethod = ComplianceGrpc.getGetScrubListMethod) == null) {
          ComplianceGrpc.getGetScrubListMethod = getGetScrubListMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetScrubListReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetScrubList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScrubListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScrubListRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetScrubList"))
                  .build();
          }
        }
     }
     return getGetScrubListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getDeleteScrubListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScrubList",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScrubListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListRes> getDeleteScrubListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes> getDeleteScrubListMethod;
    if ((getDeleteScrubListMethod = ComplianceGrpc.getDeleteScrubListMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getDeleteScrubListMethod = ComplianceGrpc.getDeleteScrubListMethod) == null) {
          ComplianceGrpc.getDeleteScrubListMethod = getDeleteScrubListMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq, com.tcn.cloud.api.api.v0alpha.ScrubListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "DeleteScrubList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScrubListRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("DeleteScrubList"))
                  .build();
          }
        }
     }
     return getDeleteScrubListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq,
      com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes> getGetDefaultRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefaultRules",
      requestType = com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq,
      com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes> getGetDefaultRulesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq, com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes> getGetDefaultRulesMethod;
    if ((getGetDefaultRulesMethod = ComplianceGrpc.getGetDefaultRulesMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetDefaultRulesMethod = ComplianceGrpc.getGetDefaultRulesMethod) == null) {
          ComplianceGrpc.getGetDefaultRulesMethod = getGetDefaultRulesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq, com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetDefaultRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetDefaultRules"))
                  .build();
          }
        }
     }
     return getGetDefaultRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScrubListsReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListsRes> getGetScrubListsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScrubLists",
      requestType = com.tcn.cloud.api.api.v0alpha.GetScrubListsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScrubListsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScrubListsReq,
      com.tcn.cloud.api.api.v0alpha.ScrubListsRes> getGetScrubListsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScrubListsReq, com.tcn.cloud.api.api.v0alpha.ScrubListsRes> getGetScrubListsMethod;
    if ((getGetScrubListsMethod = ComplianceGrpc.getGetScrubListsMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetScrubListsMethod = ComplianceGrpc.getGetScrubListsMethod) == null) {
          ComplianceGrpc.getGetScrubListsMethod = getGetScrubListsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetScrubListsReq, com.tcn.cloud.api.api.v0alpha.ScrubListsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetScrubLists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScrubListsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScrubListsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetScrubLists"))
                  .build();
          }
        }
     }
     return getGetScrubListsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ScrubList> getSearchScrubListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchScrubList",
      requestType = com.tcn.cloud.api.api.v0alpha.SearchScrubListReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScrubList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ScrubList> getSearchScrubListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchScrubListReq, com.tcn.cloud.api.api.v0alpha.ScrubList> getSearchScrubListMethod;
    if ((getSearchScrubListMethod = ComplianceGrpc.getSearchScrubListMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getSearchScrubListMethod = ComplianceGrpc.getSearchScrubListMethod) == null) {
          ComplianceGrpc.getSearchScrubListMethod = getSearchScrubListMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SearchScrubListReq, com.tcn.cloud.api.api.v0alpha.ScrubList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "SearchScrubList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SearchScrubListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScrubList.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("SearchScrubList"))
                  .build();
          }
        }
     }
     return getSearchScrubListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq,
      com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes> getGetScrubListUploadUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScrubListUploadUrl",
      requestType = com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq,
      com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes> getGetScrubListUploadUrlMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq, com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes> getGetScrubListUploadUrlMethod;
    if ((getGetScrubListUploadUrlMethod = ComplianceGrpc.getGetScrubListUploadUrlMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetScrubListUploadUrlMethod = ComplianceGrpc.getGetScrubListUploadUrlMethod) == null) {
          ComplianceGrpc.getGetScrubListUploadUrlMethod = getGetScrubListUploadUrlMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq, com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetScrubListUploadUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetScrubListUploadUrl"))
                  .build();
          }
        }
     }
     return getGetScrubListUploadUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq,
      com.google.longrunning.Operation> getProcessScrubListUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessScrubListUpload",
      requestType = com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq,
      com.google.longrunning.Operation> getProcessScrubListUploadMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq, com.google.longrunning.Operation> getProcessScrubListUploadMethod;
    if ((getProcessScrubListUploadMethod = ComplianceGrpc.getProcessScrubListUploadMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getProcessScrubListUploadMethod = ComplianceGrpc.getProcessScrubListUploadMethod) == null) {
          ComplianceGrpc.getProcessScrubListUploadMethod = getProcessScrubListUploadMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ProcessScrubListUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ProcessScrubListUpload"))
                  .build();
          }
        }
     }
     return getProcessScrubListUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq,
      com.google.longrunning.Operation> getProcessScrubListDeleteUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessScrubListDeleteUpload",
      requestType = com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq,
      com.google.longrunning.Operation> getProcessScrubListDeleteUploadMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq, com.google.longrunning.Operation> getProcessScrubListDeleteUploadMethod;
    if ((getProcessScrubListDeleteUploadMethod = ComplianceGrpc.getProcessScrubListDeleteUploadMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getProcessScrubListDeleteUploadMethod = ComplianceGrpc.getProcessScrubListDeleteUploadMethod) == null) {
          ComplianceGrpc.getProcessScrubListDeleteUploadMethod = getProcessScrubListDeleteUploadMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ProcessScrubListDeleteUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ProcessScrubListDeleteUpload"))
                  .build();
          }
        }
     }
     return getProcessScrubListDeleteUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExportScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ExportScrubListRes> getExportScrubListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportScrubList",
      requestType = com.tcn.cloud.api.api.v0alpha.ExportScrubListReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ExportScrubListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExportScrubListReq,
      com.tcn.cloud.api.api.v0alpha.ExportScrubListRes> getExportScrubListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExportScrubListReq, com.tcn.cloud.api.api.v0alpha.ExportScrubListRes> getExportScrubListMethod;
    if ((getExportScrubListMethod = ComplianceGrpc.getExportScrubListMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getExportScrubListMethod = ComplianceGrpc.getExportScrubListMethod) == null) {
          ComplianceGrpc.getExportScrubListMethod = getExportScrubListMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ExportScrubListReq, com.tcn.cloud.api.api.v0alpha.ExportScrubListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ExportScrubList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ExportScrubListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ExportScrubListRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ExportScrubList"))
                  .build();
          }
        }
     }
     return getExportScrubListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq,
      com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes> getPurgeScrubListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PurgeScrubList",
      requestType = com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq,
      com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes> getPurgeScrubListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq, com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes> getPurgeScrubListMethod;
    if ((getPurgeScrubListMethod = ComplianceGrpc.getPurgeScrubListMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getPurgeScrubListMethod = ComplianceGrpc.getPurgeScrubListMethod) == null) {
          ComplianceGrpc.getPurgeScrubListMethod = getPurgeScrubListMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq, com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "PurgeScrubList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("PurgeScrubList"))
                  .build();
          }
        }
     }
     return getPurgeScrubListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateScenarioReq,
      com.tcn.cloud.api.api.v0alpha.CreateScenarioRes> getCreateScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateScenario",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateScenarioReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateScenarioRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateScenarioReq,
      com.tcn.cloud.api.api.v0alpha.CreateScenarioRes> getCreateScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateScenarioReq, com.tcn.cloud.api.api.v0alpha.CreateScenarioRes> getCreateScenarioMethod;
    if ((getCreateScenarioMethod = ComplianceGrpc.getCreateScenarioMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getCreateScenarioMethod = ComplianceGrpc.getCreateScenarioMethod) == null) {
          ComplianceGrpc.getCreateScenarioMethod = getCreateScenarioMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateScenarioReq, com.tcn.cloud.api.api.v0alpha.CreateScenarioRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "CreateScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateScenarioRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("CreateScenario"))
                  .build();
          }
        }
     }
     return getCreateScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScenarioReq,
      com.tcn.cloud.api.api.v0alpha.GetScenarioRes> getGetScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScenario",
      requestType = com.tcn.cloud.api.api.v0alpha.GetScenarioReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetScenarioRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScenarioReq,
      com.tcn.cloud.api.api.v0alpha.GetScenarioRes> getGetScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScenarioReq, com.tcn.cloud.api.api.v0alpha.GetScenarioRes> getGetScenarioMethod;
    if ((getGetScenarioMethod = ComplianceGrpc.getGetScenarioMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetScenarioMethod = ComplianceGrpc.getGetScenarioMethod) == null) {
          ComplianceGrpc.getGetScenarioMethod = getGetScenarioMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetScenarioReq, com.tcn.cloud.api.api.v0alpha.GetScenarioRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScenarioRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetScenario"))
                  .build();
          }
        }
     }
     return getGetScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes> getUpdateScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScenario",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq,
      com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes> getUpdateScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq, com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes> getUpdateScenarioMethod;
    if ((getUpdateScenarioMethod = ComplianceGrpc.getUpdateScenarioMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getUpdateScenarioMethod = ComplianceGrpc.getUpdateScenarioMethod) == null) {
          ComplianceGrpc.getUpdateScenarioMethod = getUpdateScenarioMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq, com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "UpdateScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("UpdateScenario"))
                  .build();
          }
        }
     }
     return getUpdateScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq,
      com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes> getDeleteScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScenario",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq,
      com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes> getDeleteScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq, com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes> getDeleteScenarioMethod;
    if ((getDeleteScenarioMethod = ComplianceGrpc.getDeleteScenarioMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getDeleteScenarioMethod = ComplianceGrpc.getDeleteScenarioMethod) == null) {
          ComplianceGrpc.getDeleteScenarioMethod = getDeleteScenarioMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq, com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "DeleteScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("DeleteScenario"))
                  .build();
          }
        }
     }
     return getDeleteScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq,
      com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes> getRunAssignedScenariosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunAssignedScenarios",
      requestType = com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq,
      com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes> getRunAssignedScenariosMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq, com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes> getRunAssignedScenariosMethod;
    if ((getRunAssignedScenariosMethod = ComplianceGrpc.getRunAssignedScenariosMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getRunAssignedScenariosMethod = ComplianceGrpc.getRunAssignedScenariosMethod) == null) {
          ComplianceGrpc.getRunAssignedScenariosMethod = getRunAssignedScenariosMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq, com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "RunAssignedScenarios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("RunAssignedScenarios"))
                  .build();
          }
        }
     }
     return getRunAssignedScenariosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq,
      com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes> getListAllScenariosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllScenarios",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq,
      com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes> getListAllScenariosMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq, com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes> getListAllScenariosMethod;
    if ((getListAllScenariosMethod = ComplianceGrpc.getListAllScenariosMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getListAllScenariosMethod = ComplianceGrpc.getListAllScenariosMethod) == null) {
          ComplianceGrpc.getListAllScenariosMethod = getListAllScenariosMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq, com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ListAllScenarios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ListAllScenarios"))
                  .build();
          }
        }
     }
     return getListAllScenariosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq,
      com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes> getListUnassignedScenariosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUnassignedScenarios",
      requestType = com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq,
      com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes> getListUnassignedScenariosMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq, com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes> getListUnassignedScenariosMethod;
    if ((getListUnassignedScenariosMethod = ComplianceGrpc.getListUnassignedScenariosMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getListUnassignedScenariosMethod = ComplianceGrpc.getListUnassignedScenariosMethod) == null) {
          ComplianceGrpc.getListUnassignedScenariosMethod = getListUnassignedScenariosMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq, com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ListUnassignedScenarios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ListUnassignedScenarios"))
                  .build();
          }
        }
     }
     return getListUnassignedScenariosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq,
      com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes> getListAssignedRuleSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAssignedRuleSets",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq,
      com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes> getListAssignedRuleSetsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq, com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes> getListAssignedRuleSetsMethod;
    if ((getListAssignedRuleSetsMethod = ComplianceGrpc.getListAssignedRuleSetsMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getListAssignedRuleSetsMethod = ComplianceGrpc.getListAssignedRuleSetsMethod) == null) {
          ComplianceGrpc.getListAssignedRuleSetsMethod = getListAssignedRuleSetsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq, com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ListAssignedRuleSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ListAssignedRuleSets"))
                  .build();
          }
        }
     }
     return getListAssignedRuleSetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq,
      com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes> getListAssignedScenariosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAssignedScenarios",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq,
      com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes> getListAssignedScenariosMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq, com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes> getListAssignedScenariosMethod;
    if ((getListAssignedScenariosMethod = ComplianceGrpc.getListAssignedScenariosMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getListAssignedScenariosMethod = ComplianceGrpc.getListAssignedScenariosMethod) == null) {
          ComplianceGrpc.getListAssignedScenariosMethod = getListAssignedScenariosMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq, com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ListAssignedScenarios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ListAssignedScenarios"))
                  .build();
          }
        }
     }
     return getListAssignedScenariosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignScenarioReq,
      com.google.protobuf.Empty> getAssignScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignScenario",
      requestType = com.tcn.cloud.api.api.v0alpha.AssignScenarioReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignScenarioReq,
      com.google.protobuf.Empty> getAssignScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignScenarioReq, com.google.protobuf.Empty> getAssignScenarioMethod;
    if ((getAssignScenarioMethod = ComplianceGrpc.getAssignScenarioMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getAssignScenarioMethod = ComplianceGrpc.getAssignScenarioMethod) == null) {
          ComplianceGrpc.getAssignScenarioMethod = getAssignScenarioMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AssignScenarioReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "AssignScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("AssignScenario"))
                  .build();
          }
        }
     }
     return getAssignScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq,
      com.google.protobuf.Empty> getUnassignScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignScenario",
      requestType = com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq,
      com.google.protobuf.Empty> getUnassignScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq, com.google.protobuf.Empty> getUnassignScenarioMethod;
    if ((getUnassignScenarioMethod = ComplianceGrpc.getUnassignScenarioMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getUnassignScenarioMethod = ComplianceGrpc.getUnassignScenarioMethod) == null) {
          ComplianceGrpc.getUnassignScenarioMethod = getUnassignScenarioMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "UnassignScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("UnassignScenario"))
                  .build();
          }
        }
     }
     return getUnassignScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnableScenarioReq,
      com.google.protobuf.Empty> getEnableScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableScenario",
      requestType = com.tcn.cloud.api.api.v0alpha.EnableScenarioReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnableScenarioReq,
      com.google.protobuf.Empty> getEnableScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnableScenarioReq, com.google.protobuf.Empty> getEnableScenarioMethod;
    if ((getEnableScenarioMethod = ComplianceGrpc.getEnableScenarioMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getEnableScenarioMethod = ComplianceGrpc.getEnableScenarioMethod) == null) {
          ComplianceGrpc.getEnableScenarioMethod = getEnableScenarioMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EnableScenarioReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "EnableScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnableScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("EnableScenario"))
                  .build();
          }
        }
     }
     return getEnableScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DisableScenarioReq,
      com.google.protobuf.Empty> getDisableScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableScenario",
      requestType = com.tcn.cloud.api.api.v0alpha.DisableScenarioReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DisableScenarioReq,
      com.google.protobuf.Empty> getDisableScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DisableScenarioReq, com.google.protobuf.Empty> getDisableScenarioMethod;
    if ((getDisableScenarioMethod = ComplianceGrpc.getDisableScenarioMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getDisableScenarioMethod = ComplianceGrpc.getDisableScenarioMethod) == null) {
          ComplianceGrpc.getDisableScenarioMethod = getDisableScenarioMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DisableScenarioReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "DisableScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DisableScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("DisableScenario"))
                  .build();
          }
        }
     }
     return getDisableScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq,
      com.tcn.cloud.api.api.v0alpha.FieldNames> getGetFieldNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFieldNames",
      requestType = com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.FieldNames.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq,
      com.tcn.cloud.api.api.v0alpha.FieldNames> getGetFieldNamesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq, com.tcn.cloud.api.api.v0alpha.FieldNames> getGetFieldNamesMethod;
    if ((getGetFieldNamesMethod = ComplianceGrpc.getGetFieldNamesMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetFieldNamesMethod = ComplianceGrpc.getGetFieldNamesMethod) == null) {
          ComplianceGrpc.getGetFieldNamesMethod = getGetFieldNamesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq, com.tcn.cloud.api.api.v0alpha.FieldNames>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetFieldNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FieldNames.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetFieldNames"))
                  .build();
          }
        }
     }
     return getGetFieldNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq,
      com.tcn.cloud.api.api.v0alpha.FieldNames> getGetResultDescriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResultDescriptions",
      requestType = com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.FieldNames.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq,
      com.tcn.cloud.api.api.v0alpha.FieldNames> getGetResultDescriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq, com.tcn.cloud.api.api.v0alpha.FieldNames> getGetResultDescriptionsMethod;
    if ((getGetResultDescriptionsMethod = ComplianceGrpc.getGetResultDescriptionsMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetResultDescriptionsMethod = ComplianceGrpc.getGetResultDescriptionsMethod) == null) {
          ComplianceGrpc.getGetResultDescriptionsMethod = getGetResultDescriptionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq, com.tcn.cloud.api.api.v0alpha.FieldNames>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetResultDescriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FieldNames.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetResultDescriptions"))
                  .build();
          }
        }
     }
     return getGetResultDescriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq,
      com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes> getCreateConsentProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConsentProfile",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq,
      com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes> getCreateConsentProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq, com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes> getCreateConsentProfileMethod;
    if ((getCreateConsentProfileMethod = ComplianceGrpc.getCreateConsentProfileMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getCreateConsentProfileMethod = ComplianceGrpc.getCreateConsentProfileMethod) == null) {
          ComplianceGrpc.getCreateConsentProfileMethod = getCreateConsentProfileMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq, com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "CreateConsentProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("CreateConsentProfile"))
                  .build();
          }
        }
     }
     return getCreateConsentProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateConsentReq,
      com.tcn.cloud.api.api.v0alpha.CreateConsentRes> getCreateConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConsent",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateConsentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateConsentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateConsentReq,
      com.tcn.cloud.api.api.v0alpha.CreateConsentRes> getCreateConsentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateConsentReq, com.tcn.cloud.api.api.v0alpha.CreateConsentRes> getCreateConsentMethod;
    if ((getCreateConsentMethod = ComplianceGrpc.getCreateConsentMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getCreateConsentMethod = ComplianceGrpc.getCreateConsentMethod) == null) {
          ComplianceGrpc.getCreateConsentMethod = getCreateConsentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateConsentReq, com.tcn.cloud.api.api.v0alpha.CreateConsentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "CreateConsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateConsentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateConsentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("CreateConsent"))
                  .build();
          }
        }
     }
     return getCreateConsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq,
      com.tcn.cloud.api.api.v0alpha.ConsentProfile> getGetConsentProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConsentProfile",
      requestType = com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ConsentProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq,
      com.tcn.cloud.api.api.v0alpha.ConsentProfile> getGetConsentProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq, com.tcn.cloud.api.api.v0alpha.ConsentProfile> getGetConsentProfileMethod;
    if ((getGetConsentProfileMethod = ComplianceGrpc.getGetConsentProfileMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetConsentProfileMethod = ComplianceGrpc.getGetConsentProfileMethod) == null) {
          ComplianceGrpc.getGetConsentProfileMethod = getGetConsentProfileMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq, com.tcn.cloud.api.api.v0alpha.ConsentProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetConsentProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ConsentProfile.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetConsentProfile"))
                  .build();
          }
        }
     }
     return getGetConsentProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentReq,
      com.tcn.cloud.api.api.v0alpha.Consent> getGetConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConsent",
      requestType = com.tcn.cloud.api.api.v0alpha.GetConsentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Consent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentReq,
      com.tcn.cloud.api.api.v0alpha.Consent> getGetConsentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentReq, com.tcn.cloud.api.api.v0alpha.Consent> getGetConsentMethod;
    if ((getGetConsentMethod = ComplianceGrpc.getGetConsentMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetConsentMethod = ComplianceGrpc.getGetConsentMethod) == null) {
          ComplianceGrpc.getGetConsentMethod = getGetConsentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetConsentReq, com.tcn.cloud.api.api.v0alpha.Consent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetConsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConsentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Consent.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetConsent"))
                  .build();
          }
        }
     }
     return getGetConsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq,
      com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes> getGetConsentByProfileAndContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConsentByProfileAndContent",
      requestType = com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq,
      com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes> getGetConsentByProfileAndContentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq, com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes> getGetConsentByProfileAndContentMethod;
    if ((getGetConsentByProfileAndContentMethod = ComplianceGrpc.getGetConsentByProfileAndContentMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetConsentByProfileAndContentMethod = ComplianceGrpc.getGetConsentByProfileAndContentMethod) == null) {
          ComplianceGrpc.getGetConsentByProfileAndContentMethod = getGetConsentByProfileAndContentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq, com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetConsentByProfileAndContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetConsentByProfileAndContent"))
                  .build();
          }
        }
     }
     return getGetConsentByProfileAndContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq,
      com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes> getGetConsentByContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConsentByContent",
      requestType = com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq,
      com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes> getGetConsentByContentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq, com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes> getGetConsentByContentMethod;
    if ((getGetConsentByContentMethod = ComplianceGrpc.getGetConsentByContentMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetConsentByContentMethod = ComplianceGrpc.getGetConsentByContentMethod) == null) {
          ComplianceGrpc.getGetConsentByContentMethod = getGetConsentByContentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq, com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetConsentByContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetConsentByContent"))
                  .build();
          }
        }
     }
     return getGetConsentByContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq,
      com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes> getSearchConsentByContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchConsentByContent",
      requestType = com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq,
      com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes> getSearchConsentByContentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq, com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes> getSearchConsentByContentMethod;
    if ((getSearchConsentByContentMethod = ComplianceGrpc.getSearchConsentByContentMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getSearchConsentByContentMethod = ComplianceGrpc.getSearchConsentByContentMethod) == null) {
          ComplianceGrpc.getSearchConsentByContentMethod = getSearchConsentByContentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq, com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "SearchConsentByContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("SearchConsentByContent"))
                  .build();
          }
        }
     }
     return getSearchConsentByContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateConsentReq,
      com.google.protobuf.Empty> getUpdateConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConsent",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateConsentReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateConsentReq,
      com.google.protobuf.Empty> getUpdateConsentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateConsentReq, com.google.protobuf.Empty> getUpdateConsentMethod;
    if ((getUpdateConsentMethod = ComplianceGrpc.getUpdateConsentMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getUpdateConsentMethod = ComplianceGrpc.getUpdateConsentMethod) == null) {
          ComplianceGrpc.getUpdateConsentMethod = getUpdateConsentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateConsentReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "UpdateConsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateConsentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("UpdateConsent"))
                  .build();
          }
        }
     }
     return getUpdateConsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExpireConsentReq,
      com.google.protobuf.Empty> getExpireConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExpireConsent",
      requestType = com.tcn.cloud.api.api.v0alpha.ExpireConsentReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExpireConsentReq,
      com.google.protobuf.Empty> getExpireConsentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExpireConsentReq, com.google.protobuf.Empty> getExpireConsentMethod;
    if ((getExpireConsentMethod = ComplianceGrpc.getExpireConsentMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getExpireConsentMethod = ComplianceGrpc.getExpireConsentMethod) == null) {
          ComplianceGrpc.getExpireConsentMethod = getExpireConsentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ExpireConsentReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ExpireConsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ExpireConsentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ExpireConsent"))
                  .build();
          }
        }
     }
     return getExpireConsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeConsentReq,
      com.google.protobuf.Empty> getRevokeConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeConsent",
      requestType = com.tcn.cloud.api.api.v0alpha.RevokeConsentReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeConsentReq,
      com.google.protobuf.Empty> getRevokeConsentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeConsentReq, com.google.protobuf.Empty> getRevokeConsentMethod;
    if ((getRevokeConsentMethod = ComplianceGrpc.getRevokeConsentMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getRevokeConsentMethod = ComplianceGrpc.getRevokeConsentMethod) == null) {
          ComplianceGrpc.getRevokeConsentMethod = getRevokeConsentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RevokeConsentReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "RevokeConsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokeConsentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("RevokeConsent"))
                  .build();
          }
        }
     }
     return getRevokeConsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteConsentReq,
      com.google.protobuf.Empty> getDeleteConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConsent",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteConsentReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteConsentReq,
      com.google.protobuf.Empty> getDeleteConsentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteConsentReq, com.google.protobuf.Empty> getDeleteConsentMethod;
    if ((getDeleteConsentMethod = ComplianceGrpc.getDeleteConsentMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getDeleteConsentMethod = ComplianceGrpc.getDeleteConsentMethod) == null) {
          ComplianceGrpc.getDeleteConsentMethod = getDeleteConsentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteConsentReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "DeleteConsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteConsentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("DeleteConsent"))
                  .build();
          }
        }
     }
     return getDeleteConsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq,
      com.google.longrunning.Operation> getProcessConsentListDeleteUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessConsentListDeleteUpload",
      requestType = com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq,
      com.google.longrunning.Operation> getProcessConsentListDeleteUploadMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq, com.google.longrunning.Operation> getProcessConsentListDeleteUploadMethod;
    if ((getProcessConsentListDeleteUploadMethod = ComplianceGrpc.getProcessConsentListDeleteUploadMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getProcessConsentListDeleteUploadMethod = ComplianceGrpc.getProcessConsentListDeleteUploadMethod) == null) {
          ComplianceGrpc.getProcessConsentListDeleteUploadMethod = getProcessConsentListDeleteUploadMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ProcessConsentListDeleteUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ProcessConsentListDeleteUpload"))
                  .build();
          }
        }
     }
     return getProcessConsentListDeleteUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq,
      com.google.protobuf.Empty> getEnableConsentProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableConsentProfile",
      requestType = com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq,
      com.google.protobuf.Empty> getEnableConsentProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq, com.google.protobuf.Empty> getEnableConsentProfileMethod;
    if ((getEnableConsentProfileMethod = ComplianceGrpc.getEnableConsentProfileMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getEnableConsentProfileMethod = ComplianceGrpc.getEnableConsentProfileMethod) == null) {
          ComplianceGrpc.getEnableConsentProfileMethod = getEnableConsentProfileMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "EnableConsentProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("EnableConsentProfile"))
                  .build();
          }
        }
     }
     return getEnableConsentProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq,
      com.google.protobuf.Empty> getDisableConsentProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableConsentProfile",
      requestType = com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq,
      com.google.protobuf.Empty> getDisableConsentProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq, com.google.protobuf.Empty> getDisableConsentProfileMethod;
    if ((getDisableConsentProfileMethod = ComplianceGrpc.getDisableConsentProfileMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getDisableConsentProfileMethod = ComplianceGrpc.getDisableConsentProfileMethod) == null) {
          ComplianceGrpc.getDisableConsentProfileMethod = getDisableConsentProfileMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "DisableConsentProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("DisableConsentProfile"))
                  .build();
          }
        }
     }
     return getDisableConsentProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq,
      com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes> getListConsentProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConsentProfiles",
      requestType = com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq,
      com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes> getListConsentProfilesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq, com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes> getListConsentProfilesMethod;
    if ((getListConsentProfilesMethod = ComplianceGrpc.getListConsentProfilesMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getListConsentProfilesMethod = ComplianceGrpc.getListConsentProfilesMethod) == null) {
          ComplianceGrpc.getListConsentProfilesMethod = getListConsentProfilesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq, com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ListConsentProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ListConsentProfiles"))
                  .build();
          }
        }
     }
     return getListConsentProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq,
      com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes> getGetConsentUploadUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConsentUploadUrl",
      requestType = com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq,
      com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes> getGetConsentUploadUrlMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq, com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes> getGetConsentUploadUrlMethod;
    if ((getGetConsentUploadUrlMethod = ComplianceGrpc.getGetConsentUploadUrlMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetConsentUploadUrlMethod = ComplianceGrpc.getGetConsentUploadUrlMethod) == null) {
          ComplianceGrpc.getGetConsentUploadUrlMethod = getGetConsentUploadUrlMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq, com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetConsentUploadUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetConsentUploadUrl"))
                  .build();
          }
        }
     }
     return getGetConsentUploadUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq,
      com.google.longrunning.Operation> getProcessConsentUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessConsentUpload",
      requestType = com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq,
      com.google.longrunning.Operation> getProcessConsentUploadMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq, com.google.longrunning.Operation> getProcessConsentUploadMethod;
    if ((getProcessConsentUploadMethod = ComplianceGrpc.getProcessConsentUploadMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getProcessConsentUploadMethod = ComplianceGrpc.getProcessConsentUploadMethod) == null) {
          ComplianceGrpc.getProcessConsentUploadMethod = getProcessConsentUploadMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ProcessConsentUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ProcessConsentUpload"))
                  .build();
          }
        }
     }
     return getProcessConsentUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq,
      com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes> getListConsentTopicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConsentTopics",
      requestType = com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq,
      com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes> getListConsentTopicsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq, com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes> getListConsentTopicsMethod;
    if ((getListConsentTopicsMethod = ComplianceGrpc.getListConsentTopicsMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getListConsentTopicsMethod = ComplianceGrpc.getListConsentTopicsMethod) == null) {
          ComplianceGrpc.getListConsentTopicsMethod = getListConsentTopicsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq, com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ListConsentTopics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ListConsentTopics"))
                  .build();
          }
        }
     }
     return getListConsentTopicsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq,
      com.tcn.cloud.api.api.v0alpha.ConsentTopic> getGetConsentTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConsentTopic",
      requestType = com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ConsentTopic.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq,
      com.tcn.cloud.api.api.v0alpha.ConsentTopic> getGetConsentTopicMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq, com.tcn.cloud.api.api.v0alpha.ConsentTopic> getGetConsentTopicMethod;
    if ((getGetConsentTopicMethod = ComplianceGrpc.getGetConsentTopicMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getGetConsentTopicMethod = ComplianceGrpc.getGetConsentTopicMethod) == null) {
          ComplianceGrpc.getGetConsentTopicMethod = getGetConsentTopicMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq, com.tcn.cloud.api.api.v0alpha.ConsentTopic>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "GetConsentTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ConsentTopic.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("GetConsentTopic"))
                  .build();
          }
        }
     }
     return getGetConsentTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ConsentTopic,
      com.tcn.cloud.api.api.v0alpha.Empty> getCreateConsentTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConsentTopic",
      requestType = com.tcn.cloud.api.api.v0alpha.ConsentTopic.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ConsentTopic,
      com.tcn.cloud.api.api.v0alpha.Empty> getCreateConsentTopicMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ConsentTopic, com.tcn.cloud.api.api.v0alpha.Empty> getCreateConsentTopicMethod;
    if ((getCreateConsentTopicMethod = ComplianceGrpc.getCreateConsentTopicMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getCreateConsentTopicMethod = ComplianceGrpc.getCreateConsentTopicMethod) == null) {
          ComplianceGrpc.getCreateConsentTopicMethod = getCreateConsentTopicMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ConsentTopic, com.tcn.cloud.api.api.v0alpha.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "CreateConsentTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ConsentTopic.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("CreateConsentTopic"))
                  .build();
          }
        }
     }
     return getCreateConsentTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ConsentTopic,
      com.tcn.cloud.api.api.v0alpha.Empty> getDeleteConsentTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConsentTopic",
      requestType = com.tcn.cloud.api.api.v0alpha.ConsentTopic.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ConsentTopic,
      com.tcn.cloud.api.api.v0alpha.Empty> getDeleteConsentTopicMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ConsentTopic, com.tcn.cloud.api.api.v0alpha.Empty> getDeleteConsentTopicMethod;
    if ((getDeleteConsentTopicMethod = ComplianceGrpc.getDeleteConsentTopicMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getDeleteConsentTopicMethod = ComplianceGrpc.getDeleteConsentTopicMethod) == null) {
          ComplianceGrpc.getDeleteConsentTopicMethod = getDeleteConsentTopicMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ConsentTopic, com.tcn.cloud.api.api.v0alpha.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "DeleteConsentTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ConsentTopic.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("DeleteConsentTopic"))
                  .build();
          }
        }
     }
     return getDeleteConsentTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq,
      com.tcn.cloud.api.api.v0alpha.Empty> getUpdateConsentTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConsentTopic",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq,
      com.tcn.cloud.api.api.v0alpha.Empty> getUpdateConsentTopicMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq, com.tcn.cloud.api.api.v0alpha.Empty> getUpdateConsentTopicMethod;
    if ((getUpdateConsentTopicMethod = ComplianceGrpc.getUpdateConsentTopicMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getUpdateConsentTopicMethod = ComplianceGrpc.getUpdateConsentTopicMethod) == null) {
          ComplianceGrpc.getUpdateConsentTopicMethod = getUpdateConsentTopicMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq, com.tcn.cloud.api.api.v0alpha.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "UpdateConsentTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("UpdateConsentTopic"))
                  .build();
          }
        }
     }
     return getUpdateConsentTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq,
      com.tcn.cloud.api.api.v0alpha.ProcessRes> getProcessOutboundCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessOutboundCall",
      requestType = com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ProcessRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq,
      com.tcn.cloud.api.api.v0alpha.ProcessRes> getProcessOutboundCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq, com.tcn.cloud.api.api.v0alpha.ProcessRes> getProcessOutboundCallMethod;
    if ((getProcessOutboundCallMethod = ComplianceGrpc.getProcessOutboundCallMethod) == null) {
      synchronized (ComplianceGrpc.class) {
        if ((getProcessOutboundCallMethod = ComplianceGrpc.getProcessOutboundCallMethod) == null) {
          ComplianceGrpc.getProcessOutboundCallMethod = getProcessOutboundCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq, com.tcn.cloud.api.api.v0alpha.ProcessRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Compliance", "ProcessOutboundCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ComplianceMethodDescriptorSupplier("ProcessOutboundCall"))
                  .build();
          }
        }
     }
     return getProcessOutboundCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComplianceStub newStub(io.grpc.Channel channel) {
    return new ComplianceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComplianceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ComplianceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComplianceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ComplianceFutureStub(channel);
  }

  /**
   */
  public static abstract class ComplianceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ruleAutoComplete(com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes> responseObserver) {
      asyncUnimplementedUnaryCall(getRuleAutoCompleteMethod(), responseObserver);
    }

    /**
     */
    public void checkRuleSet(com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckRuleSetMethod(), responseObserver);
    }

    /**
     */
    public void assignRuleSet(com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignRuleSetMethod(), responseObserver);
    }

    /**
     */
    public void listRuleSets(com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListRuleSetsMethod(), responseObserver);
    }

    /**
     */
    public void getRuleSet(com.tcn.cloud.api.api.v0alpha.GetRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleSet> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRuleSetMethod(), responseObserver);
    }

    /**
     */
    public void getRuleSetByName(com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleSet> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRuleSetByNameMethod(), responseObserver);
    }

    /**
     */
    public void createRuleSet(com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleSet> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRuleSetMethod(), responseObserver);
    }

    /**
     */
    public void renameRuleSet(com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes> responseObserver) {
      asyncUnimplementedUnaryCall(getRenameRuleSetMethod(), responseObserver);
    }

    /**
     */
    public void enableRuleSet(com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableRuleSetMethod(), responseObserver);
    }

    /**
     */
    public void disableRuleSet(com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDisableRuleSetMethod(), responseObserver);
    }

    /**
     */
    public void createScrubList(com.tcn.cloud.api.api.v0alpha.CreateScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateScrubListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add entries to an existing scrub list defined by AddScrubListEntriesReq message.
     * The method will return a ScrubListRes message that will
     * contain the results.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void addScrubListEntries(com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getAddScrubListEntriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update scrub list entry defined by UpdateScrubEntryReq message.
     * The method will update a scrub list entry with the specified fields
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void updateScrubEntry(com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateScrubEntryMethod(), responseObserver);
    }

    /**
     */
    public void deleteScrubListEntries(com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteScrubListEntriesMethod(), responseObserver);
    }

    /**
     */
    public void getScrubList(com.tcn.cloud.api.api.v0alpha.GetScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScrubListMethod(), responseObserver);
    }

    /**
     */
    public void deleteScrubList(com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteScrubListMethod(), responseObserver);
    }

    /**
     */
    public void getDefaultRules(com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDefaultRulesMethod(), responseObserver);
    }

    /**
     */
    public void getScrubLists(com.tcn.cloud.api.api.v0alpha.GetScrubListsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScrubListsMethod(), responseObserver);
    }

    /**
     */
    public void searchScrubList(com.tcn.cloud.api.api.v0alpha.SearchScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubList> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchScrubListMethod(), responseObserver);
    }

    /**
     */
    public void getScrubListUploadUrl(com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScrubListUploadUrlMethod(), responseObserver);
    }

    /**
     */
    public void processScrubListUpload(com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessScrubListUploadMethod(), responseObserver);
    }

    /**
     */
    public void processScrubListDeleteUpload(com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessScrubListDeleteUploadMethod(), responseObserver);
    }

    /**
     */
    public void exportScrubList(com.tcn.cloud.api.api.v0alpha.ExportScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExportScrubListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getExportScrubListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Purge entries from a scrub list defined by PurgeScrubListReq message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void purgeScrubList(com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPurgeScrubListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new Scenario
     * </pre>
     */
    public void createScenario(com.tcn.cloud.api.api.v0alpha.CreateScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateScenarioRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets one Scenario
     * </pre>
     */
    public void getScenario(com.tcn.cloud.api.api.v0alpha.GetScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScenarioRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a Scenario
     * </pre>
     */
    public void updateScenario(com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a Scenario
     * </pre>
     */
    public void deleteScenario(com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Run scenarios against ruleset
     * </pre>
     */
    public void runAssignedScenarios(com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes> responseObserver) {
      asyncUnimplementedUnaryCall(getRunAssignedScenariosMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all scenarios
     * </pre>
     */
    public void listAllScenarios(com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAllScenariosMethod(), responseObserver);
    }

    /**
     * <pre>
     * List currently unassigned scenarios available to be assigned to a given ruleset
     * </pre>
     */
    public void listUnassignedScenarios(com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListUnassignedScenariosMethod(), responseObserver);
    }

    /**
     * <pre>
     * List rule sets currently assigned to a given scenario
     * </pre>
     */
    public void listAssignedRuleSets(com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAssignedRuleSetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List scenarios currently assigned to a given ruleset
     * </pre>
     */
    public void listAssignedScenarios(com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAssignedScenariosMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign a scenario to a given ruleset
     * </pre>
     */
    public void assignScenario(com.tcn.cloud.api.api.v0alpha.AssignScenarioReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unassign a scenario from a given ruleset
     * </pre>
     */
    public void unassignScenario(com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnassignScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enable an scenario
     * </pre>
     */
    public void enableScenario(com.tcn.cloud.api.api.v0alpha.EnableScenarioReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disable an scenario
     * </pre>
     */
    public void disableScenario(com.tcn.cloud.api.api.v0alpha.DisableScenarioReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDisableScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Frequency data calls
     * This will get all available Meta Fields
     * </pre>
     */
    public void getFieldNames(com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FieldNames> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFieldNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * This will get all possible results (Answered, Answered Machine, Busy, etc.)
     * </pre>
     */
    public void getResultDescriptions(com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FieldNames> responseObserver) {
      asyncUnimplementedUnaryCall(getGetResultDescriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a consent profile defined by CreateConsentProfileReq
     * message.  The method will return a CreateConsentProfileRes message
     * that will contain the newly created consent_profile_id.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void createConsentProfile(com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateConsentProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a consent defined by CreateConsentReq message.
     * The method will return a CreateConsentRes message that will
     * contain the newly created consent_id.
     * Required permissions:
     *      none
     * </pre>
     */
    public void createConsent(com.tcn.cloud.api.api.v0alpha.CreateConsentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateConsentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateConsentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a consent profile defined by GetConsentProfileReq message
     * for the specified consent_profile_id and org_id.
     * The method will return a ConsentProfile message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void getConsentProfile(com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ConsentProfile> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConsentProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentReq message
     * for the specified consent_id and org_id.
     * The method will return a Consent entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void getConsent(com.tcn.cloud.api.api.v0alpha.GetConsentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Consent> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConsentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentByProfileAndContentReq message
     * for the specified consent_profile_id and content.
     * The method will return a GetConsentByProfileAndContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void getConsentByProfileAndContent(com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConsentByProfileAndContentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentByContentReq message
     * for the specified consent_profile_id and content and channel_type.
     * The method will return a GetConsentByContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void getConsentByContent(com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConsentByContentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Searches for a consent defined by SearchConsentByContentReq message
     * for the specified content.
     * The method will return a SearchConsentByContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void searchConsentByContent(com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchConsentByContentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a consent defined by UpdateConsentReq message for
     * the specified consent_id, and will update the following
     * consent fields:
     *    Content
     *    Recorded
     *    Revoked
     *    Expire
     *    ReferringUrl
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void updateConsent(com.tcn.cloud.api.api.v0alpha.UpdateConsentReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateConsentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Expire a consent defined by ExpireConsentReq message.
     * Set the expiration date for the specified consent_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void expireConsent(com.tcn.cloud.api.api.v0alpha.ExpireConsentReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getExpireConsentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revoke a consent defined by RevokeConsentReq message.
     * Set the revoked date for the specified consent_id and
     * consent_profile_id fields.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      none
     * </pre>
     */
    public void revokeConsent(com.tcn.cloud.api.api.v0alpha.RevokeConsentReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeConsentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a consent defined by DeleteConsentReq message
     * The method will return a google.protobuf.Empty message
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void deleteConsent(com.tcn.cloud.api.api.v0alpha.DeleteConsentReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteConsentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Process a consent delete list defined by DeleteConsentReq message
     * The method will return a google.protobuf.Empty message
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void processConsentListDeleteUpload(com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessConsentListDeleteUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enable a consent profile defined by EnableConsentProfileReq message.
     * Set the disabled field to false for the specified
     * consent_profile_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void enableConsentProfile(com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableConsentProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disable a consent profile defined by DisableConsentProfileReq message.
     * Set the disabled field to true for the specified
     * consent_profile_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void disableConsentProfile(com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDisableConsentProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * List consent profiles defined by ListConsentProfilesReq message.
     * Gets all of the unique consent profiles.
     * The method will return a ListConsentProfilesRes message
     * containing consent_profile_id, profile_name, the number of consents
     * belonging to the profile, and disabled.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void listConsentProfiles(com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListConsentProfilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get consent upload url defined by GetConsentUploadUrlReq message.
     * The method will return a GetConsentUploadUrlRes messages
     * containing a url with which to upload an import file.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void getConsentUploadUrl(com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConsentUploadUrlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Process consent upload defined by ProcessConsentUploadReq message.
     * The method will process an uploaded consent file.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void processConsentUpload(com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessConsentUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * List consent topics defined by ListConsentTopicsReq message.
     * Gets all of the unique consent topics.
     * The method will return a ListConsentTopicsRes message
     * containing topic, org_id, and deleted.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void listConsentTopics(com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListConsentTopicsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a consent topic defined by GetConsentTopicReq message
     * for the specified topic and org_id.
     * The method will return a ConsentTopic message/entity.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void getConsentTopic(com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ConsentTopic> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConsentTopicMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a consent topic defined by ConsentTopic
     * message.  The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void createConsentTopic(com.tcn.cloud.api.api.v0alpha.ConsentTopic request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateConsentTopicMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a consent topic defined by ConsentTopic message.
     * The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void deleteConsentTopic(com.tcn.cloud.api.api.v0alpha.ConsentTopic request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteConsentTopicMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a consent topic defined by UpdateConsentTopicReq message.
     * The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void updateConsentTopic(com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateConsentTopicMethod(), responseObserver);
    }

    /**
     * <pre>
     * Process and Outbound Phone Number against a rule set.
     * The method will return a response indicating
     * if the call would be permited or not and the list
     * of rules checked against.
     * Required permissions:
     *      AGENT
     * </pre>
     */
    public void processOutboundCall(com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessRes> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessOutboundCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRuleAutoCompleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq,
                com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes>(
                  this, METHODID_RULE_AUTO_COMPLETE)))
          .addMethod(
            getCheckRuleSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq,
                com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes>(
                  this, METHODID_CHECK_RULE_SET)))
          .addMethod(
            getAssignRuleSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq,
                com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes>(
                  this, METHODID_ASSIGN_RULE_SET)))
          .addMethod(
            getListRuleSetsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq,
                com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes>(
                  this, METHODID_LIST_RULE_SETS)))
          .addMethod(
            getGetRuleSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetRuleSetReq,
                com.tcn.cloud.api.api.v0alpha.RuleSet>(
                  this, METHODID_GET_RULE_SET)))
          .addMethod(
            getGetRuleSetByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq,
                com.tcn.cloud.api.api.v0alpha.RuleSet>(
                  this, METHODID_GET_RULE_SET_BY_NAME)))
          .addMethod(
            getCreateRuleSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq,
                com.tcn.cloud.api.api.v0alpha.RuleSet>(
                  this, METHODID_CREATE_RULE_SET)))
          .addMethod(
            getRenameRuleSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq,
                com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes>(
                  this, METHODID_RENAME_RULE_SET)))
          .addMethod(
            getEnableRuleSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq,
                com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes>(
                  this, METHODID_ENABLE_RULE_SET)))
          .addMethod(
            getDisableRuleSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq,
                com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes>(
                  this, METHODID_DISABLE_RULE_SET)))
          .addMethod(
            getCreateScrubListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateScrubListReq,
                com.tcn.cloud.api.api.v0alpha.ScrubListRes>(
                  this, METHODID_CREATE_SCRUB_LIST)))
          .addMethod(
            getAddScrubListEntriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq,
                com.tcn.cloud.api.api.v0alpha.ScrubListRes>(
                  this, METHODID_ADD_SCRUB_LIST_ENTRIES)))
          .addMethod(
            getUpdateScrubEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq,
                com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes>(
                  this, METHODID_UPDATE_SCRUB_ENTRY)))
          .addMethod(
            getDeleteScrubListEntriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq,
                com.tcn.cloud.api.api.v0alpha.ScrubListRes>(
                  this, METHODID_DELETE_SCRUB_LIST_ENTRIES)))
          .addMethod(
            getGetScrubListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetScrubListReq,
                com.tcn.cloud.api.api.v0alpha.ScrubListRes>(
                  this, METHODID_GET_SCRUB_LIST)))
          .addMethod(
            getDeleteScrubListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq,
                com.tcn.cloud.api.api.v0alpha.ScrubListRes>(
                  this, METHODID_DELETE_SCRUB_LIST)))
          .addMethod(
            getGetDefaultRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq,
                com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes>(
                  this, METHODID_GET_DEFAULT_RULES)))
          .addMethod(
            getGetScrubListsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetScrubListsReq,
                com.tcn.cloud.api.api.v0alpha.ScrubListsRes>(
                  this, METHODID_GET_SCRUB_LISTS)))
          .addMethod(
            getSearchScrubListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SearchScrubListReq,
                com.tcn.cloud.api.api.v0alpha.ScrubList>(
                  this, METHODID_SEARCH_SCRUB_LIST)))
          .addMethod(
            getGetScrubListUploadUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq,
                com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes>(
                  this, METHODID_GET_SCRUB_LIST_UPLOAD_URL)))
          .addMethod(
            getProcessScrubListUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq,
                com.google.longrunning.Operation>(
                  this, METHODID_PROCESS_SCRUB_LIST_UPLOAD)))
          .addMethod(
            getProcessScrubListDeleteUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq,
                com.google.longrunning.Operation>(
                  this, METHODID_PROCESS_SCRUB_LIST_DELETE_UPLOAD)))
          .addMethod(
            getExportScrubListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ExportScrubListReq,
                com.tcn.cloud.api.api.v0alpha.ExportScrubListRes>(
                  this, METHODID_EXPORT_SCRUB_LIST)))
          .addMethod(
            getPurgeScrubListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq,
                com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes>(
                  this, METHODID_PURGE_SCRUB_LIST)))
          .addMethod(
            getCreateScenarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateScenarioReq,
                com.tcn.cloud.api.api.v0alpha.CreateScenarioRes>(
                  this, METHODID_CREATE_SCENARIO)))
          .addMethod(
            getGetScenarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetScenarioReq,
                com.tcn.cloud.api.api.v0alpha.GetScenarioRes>(
                  this, METHODID_GET_SCENARIO)))
          .addMethod(
            getUpdateScenarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq,
                com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes>(
                  this, METHODID_UPDATE_SCENARIO)))
          .addMethod(
            getDeleteScenarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq,
                com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes>(
                  this, METHODID_DELETE_SCENARIO)))
          .addMethod(
            getRunAssignedScenariosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq,
                com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes>(
                  this, METHODID_RUN_ASSIGNED_SCENARIOS)))
          .addMethod(
            getListAllScenariosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq,
                com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes>(
                  this, METHODID_LIST_ALL_SCENARIOS)))
          .addMethod(
            getListUnassignedScenariosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq,
                com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes>(
                  this, METHODID_LIST_UNASSIGNED_SCENARIOS)))
          .addMethod(
            getListAssignedRuleSetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq,
                com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes>(
                  this, METHODID_LIST_ASSIGNED_RULE_SETS)))
          .addMethod(
            getListAssignedScenariosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq,
                com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes>(
                  this, METHODID_LIST_ASSIGNED_SCENARIOS)))
          .addMethod(
            getAssignScenarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.AssignScenarioReq,
                com.google.protobuf.Empty>(
                  this, METHODID_ASSIGN_SCENARIO)))
          .addMethod(
            getUnassignScenarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq,
                com.google.protobuf.Empty>(
                  this, METHODID_UNASSIGN_SCENARIO)))
          .addMethod(
            getEnableScenarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EnableScenarioReq,
                com.google.protobuf.Empty>(
                  this, METHODID_ENABLE_SCENARIO)))
          .addMethod(
            getDisableScenarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DisableScenarioReq,
                com.google.protobuf.Empty>(
                  this, METHODID_DISABLE_SCENARIO)))
          .addMethod(
            getGetFieldNamesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq,
                com.tcn.cloud.api.api.v0alpha.FieldNames>(
                  this, METHODID_GET_FIELD_NAMES)))
          .addMethod(
            getGetResultDescriptionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq,
                com.tcn.cloud.api.api.v0alpha.FieldNames>(
                  this, METHODID_GET_RESULT_DESCRIPTIONS)))
          .addMethod(
            getCreateConsentProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq,
                com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes>(
                  this, METHODID_CREATE_CONSENT_PROFILE)))
          .addMethod(
            getCreateConsentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateConsentReq,
                com.tcn.cloud.api.api.v0alpha.CreateConsentRes>(
                  this, METHODID_CREATE_CONSENT)))
          .addMethod(
            getGetConsentProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq,
                com.tcn.cloud.api.api.v0alpha.ConsentProfile>(
                  this, METHODID_GET_CONSENT_PROFILE)))
          .addMethod(
            getGetConsentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetConsentReq,
                com.tcn.cloud.api.api.v0alpha.Consent>(
                  this, METHODID_GET_CONSENT)))
          .addMethod(
            getGetConsentByProfileAndContentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq,
                com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes>(
                  this, METHODID_GET_CONSENT_BY_PROFILE_AND_CONTENT)))
          .addMethod(
            getGetConsentByContentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq,
                com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes>(
                  this, METHODID_GET_CONSENT_BY_CONTENT)))
          .addMethod(
            getSearchConsentByContentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq,
                com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes>(
                  this, METHODID_SEARCH_CONSENT_BY_CONTENT)))
          .addMethod(
            getUpdateConsentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateConsentReq,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_CONSENT)))
          .addMethod(
            getExpireConsentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ExpireConsentReq,
                com.google.protobuf.Empty>(
                  this, METHODID_EXPIRE_CONSENT)))
          .addMethod(
            getRevokeConsentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.RevokeConsentReq,
                com.google.protobuf.Empty>(
                  this, METHODID_REVOKE_CONSENT)))
          .addMethod(
            getDeleteConsentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteConsentReq,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CONSENT)))
          .addMethod(
            getProcessConsentListDeleteUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq,
                com.google.longrunning.Operation>(
                  this, METHODID_PROCESS_CONSENT_LIST_DELETE_UPLOAD)))
          .addMethod(
            getEnableConsentProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq,
                com.google.protobuf.Empty>(
                  this, METHODID_ENABLE_CONSENT_PROFILE)))
          .addMethod(
            getDisableConsentProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq,
                com.google.protobuf.Empty>(
                  this, METHODID_DISABLE_CONSENT_PROFILE)))
          .addMethod(
            getListConsentProfilesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq,
                com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes>(
                  this, METHODID_LIST_CONSENT_PROFILES)))
          .addMethod(
            getGetConsentUploadUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq,
                com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes>(
                  this, METHODID_GET_CONSENT_UPLOAD_URL)))
          .addMethod(
            getProcessConsentUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq,
                com.google.longrunning.Operation>(
                  this, METHODID_PROCESS_CONSENT_UPLOAD)))
          .addMethod(
            getListConsentTopicsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq,
                com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes>(
                  this, METHODID_LIST_CONSENT_TOPICS)))
          .addMethod(
            getGetConsentTopicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq,
                com.tcn.cloud.api.api.v0alpha.ConsentTopic>(
                  this, METHODID_GET_CONSENT_TOPIC)))
          .addMethod(
            getCreateConsentTopicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ConsentTopic,
                com.tcn.cloud.api.api.v0alpha.Empty>(
                  this, METHODID_CREATE_CONSENT_TOPIC)))
          .addMethod(
            getDeleteConsentTopicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ConsentTopic,
                com.tcn.cloud.api.api.v0alpha.Empty>(
                  this, METHODID_DELETE_CONSENT_TOPIC)))
          .addMethod(
            getUpdateConsentTopicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq,
                com.tcn.cloud.api.api.v0alpha.Empty>(
                  this, METHODID_UPDATE_CONSENT_TOPIC)))
          .addMethod(
            getProcessOutboundCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq,
                com.tcn.cloud.api.api.v0alpha.ProcessRes>(
                  this, METHODID_PROCESS_OUTBOUND_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class ComplianceStub extends io.grpc.stub.AbstractStub<ComplianceStub> {
    private ComplianceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceStub(channel, callOptions);
    }

    /**
     */
    public void ruleAutoComplete(com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRuleAutoCompleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkRuleSet(com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckRuleSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignRuleSet(com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignRuleSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRuleSets(com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListRuleSetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRuleSet(com.tcn.cloud.api.api.v0alpha.GetRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRuleSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRuleSetByName(com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRuleSetByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRuleSet(com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRuleSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renameRuleSet(com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRenameRuleSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableRuleSet(com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableRuleSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableRuleSet(com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisableRuleSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createScrubList(com.tcn.cloud.api.api.v0alpha.CreateScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateScrubListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add entries to an existing scrub list defined by AddScrubListEntriesReq message.
     * The method will return a ScrubListRes message that will
     * contain the results.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void addScrubListEntries(com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddScrubListEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update scrub list entry defined by UpdateScrubEntryReq message.
     * The method will update a scrub list entry with the specified fields
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void updateScrubEntry(com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateScrubEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteScrubListEntries(com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteScrubListEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getScrubList(com.tcn.cloud.api.api.v0alpha.GetScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScrubListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteScrubList(com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteScrubListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDefaultRules(com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDefaultRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getScrubLists(com.tcn.cloud.api.api.v0alpha.GetScrubListsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScrubListsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchScrubList(com.tcn.cloud.api.api.v0alpha.SearchScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchScrubListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getScrubListUploadUrl(com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScrubListUploadUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void processScrubListUpload(com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessScrubListUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void processScrubListDeleteUpload(com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessScrubListDeleteUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exportScrubList(com.tcn.cloud.api.api.v0alpha.ExportScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExportScrubListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportScrubListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Purge entries from a scrub list defined by PurgeScrubListReq message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void purgeScrubList(com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPurgeScrubListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Scenario
     * </pre>
     */
    public void createScenario(com.tcn.cloud.api.api.v0alpha.CreateScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateScenarioRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets one Scenario
     * </pre>
     */
    public void getScenario(com.tcn.cloud.api.api.v0alpha.GetScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScenarioRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a Scenario
     * </pre>
     */
    public void updateScenario(com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a Scenario
     * </pre>
     */
    public void deleteScenario(com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run scenarios against ruleset
     * </pre>
     */
    public void runAssignedScenarios(com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunAssignedScenariosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all scenarios
     * </pre>
     */
    public void listAllScenarios(com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAllScenariosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List currently unassigned scenarios available to be assigned to a given ruleset
     * </pre>
     */
    public void listUnassignedScenarios(com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUnassignedScenariosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List rule sets currently assigned to a given scenario
     * </pre>
     */
    public void listAssignedRuleSets(com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAssignedRuleSetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List scenarios currently assigned to a given ruleset
     * </pre>
     */
    public void listAssignedScenarios(com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAssignedScenariosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign a scenario to a given ruleset
     * </pre>
     */
    public void assignScenario(com.tcn.cloud.api.api.v0alpha.AssignScenarioReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unassign a scenario from a given ruleset
     * </pre>
     */
    public void unassignScenario(com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnassignScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enable an scenario
     * </pre>
     */
    public void enableScenario(com.tcn.cloud.api.api.v0alpha.EnableScenarioReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disable an scenario
     * </pre>
     */
    public void disableScenario(com.tcn.cloud.api.api.v0alpha.DisableScenarioReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisableScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Frequency data calls
     * This will get all available Meta Fields
     * </pre>
     */
    public void getFieldNames(com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FieldNames> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFieldNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * This will get all possible results (Answered, Answered Machine, Busy, etc.)
     * </pre>
     */
    public void getResultDescriptions(com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FieldNames> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetResultDescriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a consent profile defined by CreateConsentProfileReq
     * message.  The method will return a CreateConsentProfileRes message
     * that will contain the newly created consent_profile_id.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void createConsentProfile(com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateConsentProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a consent defined by CreateConsentReq message.
     * The method will return a CreateConsentRes message that will
     * contain the newly created consent_id.
     * Required permissions:
     *      none
     * </pre>
     */
    public void createConsent(com.tcn.cloud.api.api.v0alpha.CreateConsentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateConsentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateConsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a consent profile defined by GetConsentProfileReq message
     * for the specified consent_profile_id and org_id.
     * The method will return a ConsentProfile message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void getConsentProfile(com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ConsentProfile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConsentProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentReq message
     * for the specified consent_id and org_id.
     * The method will return a Consent entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void getConsent(com.tcn.cloud.api.api.v0alpha.GetConsentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Consent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentByProfileAndContentReq message
     * for the specified consent_profile_id and content.
     * The method will return a GetConsentByProfileAndContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void getConsentByProfileAndContent(com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConsentByProfileAndContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentByContentReq message
     * for the specified consent_profile_id and content and channel_type.
     * The method will return a GetConsentByContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void getConsentByContent(com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConsentByContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Searches for a consent defined by SearchConsentByContentReq message
     * for the specified content.
     * The method will return a SearchConsentByContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void searchConsentByContent(com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchConsentByContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a consent defined by UpdateConsentReq message for
     * the specified consent_id, and will update the following
     * consent fields:
     *    Content
     *    Recorded
     *    Revoked
     *    Expire
     *    ReferringUrl
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void updateConsent(com.tcn.cloud.api.api.v0alpha.UpdateConsentReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateConsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Expire a consent defined by ExpireConsentReq message.
     * Set the expiration date for the specified consent_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void expireConsent(com.tcn.cloud.api.api.v0alpha.ExpireConsentReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExpireConsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revoke a consent defined by RevokeConsentReq message.
     * Set the revoked date for the specified consent_id and
     * consent_profile_id fields.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      none
     * </pre>
     */
    public void revokeConsent(com.tcn.cloud.api.api.v0alpha.RevokeConsentReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeConsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a consent defined by DeleteConsentReq message
     * The method will return a google.protobuf.Empty message
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public void deleteConsent(com.tcn.cloud.api.api.v0alpha.DeleteConsentReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteConsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Process a consent delete list defined by DeleteConsentReq message
     * The method will return a google.protobuf.Empty message
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void processConsentListDeleteUpload(com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessConsentListDeleteUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enable a consent profile defined by EnableConsentProfileReq message.
     * Set the disabled field to false for the specified
     * consent_profile_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void enableConsentProfile(com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableConsentProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disable a consent profile defined by DisableConsentProfileReq message.
     * Set the disabled field to true for the specified
     * consent_profile_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void disableConsentProfile(com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisableConsentProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List consent profiles defined by ListConsentProfilesReq message.
     * Gets all of the unique consent profiles.
     * The method will return a ListConsentProfilesRes message
     * containing consent_profile_id, profile_name, the number of consents
     * belonging to the profile, and disabled.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void listConsentProfiles(com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListConsentProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get consent upload url defined by GetConsentUploadUrlReq message.
     * The method will return a GetConsentUploadUrlRes messages
     * containing a url with which to upload an import file.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void getConsentUploadUrl(com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConsentUploadUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Process consent upload defined by ProcessConsentUploadReq message.
     * The method will process an uploaded consent file.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void processConsentUpload(com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessConsentUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List consent topics defined by ListConsentTopicsReq message.
     * Gets all of the unique consent topics.
     * The method will return a ListConsentTopicsRes message
     * containing topic, org_id, and deleted.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void listConsentTopics(com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListConsentTopicsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a consent topic defined by GetConsentTopicReq message
     * for the specified topic and org_id.
     * The method will return a ConsentTopic message/entity.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void getConsentTopic(com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ConsentTopic> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConsentTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a consent topic defined by ConsentTopic
     * message.  The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void createConsentTopic(com.tcn.cloud.api.api.v0alpha.ConsentTopic request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateConsentTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a consent topic defined by ConsentTopic message.
     * The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void deleteConsentTopic(com.tcn.cloud.api.api.v0alpha.ConsentTopic request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteConsentTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a consent topic defined by UpdateConsentTopicReq message.
     * The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public void updateConsentTopic(com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateConsentTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Process and Outbound Phone Number against a rule set.
     * The method will return a response indicating
     * if the call would be permited or not and the list
     * of rules checked against.
     * Required permissions:
     *      AGENT
     * </pre>
     */
    public void processOutboundCall(com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessOutboundCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ComplianceBlockingStub extends io.grpc.stub.AbstractStub<ComplianceBlockingStub> {
    private ComplianceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes ruleAutoComplete(com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq request) {
      return blockingUnaryCall(
          getChannel(), getRuleAutoCompleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes checkRuleSet(com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq request) {
      return blockingUnaryCall(
          getChannel(), getCheckRuleSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes assignRuleSet(com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq request) {
      return blockingUnaryCall(
          getChannel(), getAssignRuleSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes> listRuleSets(
        com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq request) {
      return blockingServerStreamingCall(
          getChannel(), getListRuleSetsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.RuleSet getRuleSet(com.tcn.cloud.api.api.v0alpha.GetRuleSetReq request) {
      return blockingUnaryCall(
          getChannel(), getGetRuleSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.RuleSet getRuleSetByName(com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq request) {
      return blockingUnaryCall(
          getChannel(), getGetRuleSetByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.RuleSet createRuleSet(com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateRuleSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes renameRuleSet(com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq request) {
      return blockingUnaryCall(
          getChannel(), getRenameRuleSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes enableRuleSet(com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq request) {
      return blockingUnaryCall(
          getChannel(), getEnableRuleSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes disableRuleSet(com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq request) {
      return blockingUnaryCall(
          getChannel(), getDisableRuleSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ScrubListRes createScrubList(com.tcn.cloud.api.api.v0alpha.CreateScrubListReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateScrubListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add entries to an existing scrub list defined by AddScrubListEntriesReq message.
     * The method will return a ScrubListRes message that will
     * contain the results.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ScrubListRes addScrubListEntries(com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq request) {
      return blockingUnaryCall(
          getChannel(), getAddScrubListEntriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update scrub list entry defined by UpdateScrubEntryReq message.
     * The method will update a scrub list entry with the specified fields
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes updateScrubEntry(com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateScrubEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ScrubListRes deleteScrubListEntries(com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteScrubListEntriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ScrubListRes getScrubList(com.tcn.cloud.api.api.v0alpha.GetScrubListReq request) {
      return blockingUnaryCall(
          getChannel(), getGetScrubListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ScrubListRes deleteScrubList(com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteScrubListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes getDefaultRules(com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetDefaultRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ScrubListsRes getScrubLists(com.tcn.cloud.api.api.v0alpha.GetScrubListsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetScrubListsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ScrubList searchScrubList(com.tcn.cloud.api.api.v0alpha.SearchScrubListReq request) {
      return blockingUnaryCall(
          getChannel(), getSearchScrubListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes getScrubListUploadUrl(com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq request) {
      return blockingUnaryCall(
          getChannel(), getGetScrubListUploadUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation processScrubListUpload(com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq request) {
      return blockingUnaryCall(
          getChannel(), getProcessScrubListUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.longrunning.Operation processScrubListDeleteUpload(com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq request) {
      return blockingUnaryCall(
          getChannel(), getProcessScrubListDeleteUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ExportScrubListRes exportScrubList(com.tcn.cloud.api.api.v0alpha.ExportScrubListReq request) {
      return blockingUnaryCall(
          getChannel(), getExportScrubListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Purge entries from a scrub list defined by PurgeScrubListReq message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes purgeScrubList(com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq request) {
      return blockingUnaryCall(
          getChannel(), getPurgeScrubListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new Scenario
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateScenarioRes createScenario(com.tcn.cloud.api.api.v0alpha.CreateScenarioReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets one Scenario
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetScenarioRes getScenario(com.tcn.cloud.api.api.v0alpha.GetScenarioReq request) {
      return blockingUnaryCall(
          getChannel(), getGetScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a Scenario
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes updateScenario(com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a Scenario
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes deleteScenario(com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run scenarios against ruleset
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes runAssignedScenarios(com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq request) {
      return blockingUnaryCall(
          getChannel(), getRunAssignedScenariosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all scenarios
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes listAllScenarios(com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq request) {
      return blockingUnaryCall(
          getChannel(), getListAllScenariosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List currently unassigned scenarios available to be assigned to a given ruleset
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes listUnassignedScenarios(com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq request) {
      return blockingUnaryCall(
          getChannel(), getListUnassignedScenariosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List rule sets currently assigned to a given scenario
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes listAssignedRuleSets(com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq request) {
      return blockingUnaryCall(
          getChannel(), getListAssignedRuleSetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List scenarios currently assigned to a given ruleset
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes listAssignedScenarios(com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq request) {
      return blockingUnaryCall(
          getChannel(), getListAssignedScenariosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign a scenario to a given ruleset
     * </pre>
     */
    public com.google.protobuf.Empty assignScenario(com.tcn.cloud.api.api.v0alpha.AssignScenarioReq request) {
      return blockingUnaryCall(
          getChannel(), getAssignScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unassign a scenario from a given ruleset
     * </pre>
     */
    public com.google.protobuf.Empty unassignScenario(com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq request) {
      return blockingUnaryCall(
          getChannel(), getUnassignScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enable an scenario
     * </pre>
     */
    public com.google.protobuf.Empty enableScenario(com.tcn.cloud.api.api.v0alpha.EnableScenarioReq request) {
      return blockingUnaryCall(
          getChannel(), getEnableScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disable an scenario
     * </pre>
     */
    public com.google.protobuf.Empty disableScenario(com.tcn.cloud.api.api.v0alpha.DisableScenarioReq request) {
      return blockingUnaryCall(
          getChannel(), getDisableScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Frequency data calls
     * This will get all available Meta Fields
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldNames getFieldNames(com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetFieldNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * This will get all possible results (Answered, Answered Machine, Busy, etc.)
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldNames getResultDescriptions(com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetResultDescriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a consent profile defined by CreateConsentProfileReq
     * message.  The method will return a CreateConsentProfileRes message
     * that will contain the newly created consent_profile_id.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes createConsentProfile(com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateConsentProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a consent defined by CreateConsentReq message.
     * The method will return a CreateConsentRes message that will
     * contain the newly created consent_id.
     * Required permissions:
     *      none
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateConsentRes createConsent(com.tcn.cloud.api.api.v0alpha.CreateConsentReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateConsentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a consent profile defined by GetConsentProfileReq message
     * for the specified consent_profile_id and org_id.
     * The method will return a ConsentProfile message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ConsentProfile getConsentProfile(com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq request) {
      return blockingUnaryCall(
          getChannel(), getGetConsentProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentReq message
     * for the specified consent_id and org_id.
     * The method will return a Consent entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.Consent getConsent(com.tcn.cloud.api.api.v0alpha.GetConsentReq request) {
      return blockingUnaryCall(
          getChannel(), getGetConsentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentByProfileAndContentReq message
     * for the specified consent_profile_id and content.
     * The method will return a GetConsentByProfileAndContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes getConsentByProfileAndContent(com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq request) {
      return blockingUnaryCall(
          getChannel(), getGetConsentByProfileAndContentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentByContentReq message
     * for the specified consent_profile_id and content and channel_type.
     * The method will return a GetConsentByContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes getConsentByContent(com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq request) {
      return blockingUnaryCall(
          getChannel(), getGetConsentByContentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for a consent defined by SearchConsentByContentReq message
     * for the specified content.
     * The method will return a SearchConsentByContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes searchConsentByContent(com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq request) {
      return blockingUnaryCall(
          getChannel(), getSearchConsentByContentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a consent defined by UpdateConsentReq message for
     * the specified consent_id, and will update the following
     * consent fields:
     *    Content
     *    Recorded
     *    Revoked
     *    Expire
     *    ReferringUrl
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.protobuf.Empty updateConsent(com.tcn.cloud.api.api.v0alpha.UpdateConsentReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateConsentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Expire a consent defined by ExpireConsentReq message.
     * Set the expiration date for the specified consent_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.protobuf.Empty expireConsent(com.tcn.cloud.api.api.v0alpha.ExpireConsentReq request) {
      return blockingUnaryCall(
          getChannel(), getExpireConsentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revoke a consent defined by RevokeConsentReq message.
     * Set the revoked date for the specified consent_id and
     * consent_profile_id fields.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      none
     * </pre>
     */
    public com.google.protobuf.Empty revokeConsent(com.tcn.cloud.api.api.v0alpha.RevokeConsentReq request) {
      return blockingUnaryCall(
          getChannel(), getRevokeConsentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a consent defined by DeleteConsentReq message
     * The method will return a google.protobuf.Empty message
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.protobuf.Empty deleteConsent(com.tcn.cloud.api.api.v0alpha.DeleteConsentReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteConsentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Process a consent delete list defined by DeleteConsentReq message
     * The method will return a google.protobuf.Empty message
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.longrunning.Operation processConsentListDeleteUpload(com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq request) {
      return blockingUnaryCall(
          getChannel(), getProcessConsentListDeleteUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enable a consent profile defined by EnableConsentProfileReq message.
     * Set the disabled field to false for the specified
     * consent_profile_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.protobuf.Empty enableConsentProfile(com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq request) {
      return blockingUnaryCall(
          getChannel(), getEnableConsentProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disable a consent profile defined by DisableConsentProfileReq message.
     * Set the disabled field to true for the specified
     * consent_profile_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.protobuf.Empty disableConsentProfile(com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq request) {
      return blockingUnaryCall(
          getChannel(), getDisableConsentProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List consent profiles defined by ListConsentProfilesReq message.
     * Gets all of the unique consent profiles.
     * The method will return a ListConsentProfilesRes message
     * containing consent_profile_id, profile_name, the number of consents
     * belonging to the profile, and disabled.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes listConsentProfiles(com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq request) {
      return blockingUnaryCall(
          getChannel(), getListConsentProfilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get consent upload url defined by GetConsentUploadUrlReq message.
     * The method will return a GetConsentUploadUrlRes messages
     * containing a url with which to upload an import file.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes getConsentUploadUrl(com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq request) {
      return blockingUnaryCall(
          getChannel(), getGetConsentUploadUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Process consent upload defined by ProcessConsentUploadReq message.
     * The method will process an uploaded consent file.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.longrunning.Operation processConsentUpload(com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq request) {
      return blockingUnaryCall(
          getChannel(), getProcessConsentUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List consent topics defined by ListConsentTopicsReq message.
     * Gets all of the unique consent topics.
     * The method will return a ListConsentTopicsRes message
     * containing topic, org_id, and deleted.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes listConsentTopics(com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq request) {
      return blockingUnaryCall(
          getChannel(), getListConsentTopicsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a consent topic defined by GetConsentTopicReq message
     * for the specified topic and org_id.
     * The method will return a ConsentTopic message/entity.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ConsentTopic getConsentTopic(com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq request) {
      return blockingUnaryCall(
          getChannel(), getGetConsentTopicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a consent topic defined by ConsentTopic
     * message.  The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.Empty createConsentTopic(com.tcn.cloud.api.api.v0alpha.ConsentTopic request) {
      return blockingUnaryCall(
          getChannel(), getCreateConsentTopicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a consent topic defined by ConsentTopic message.
     * The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.Empty deleteConsentTopic(com.tcn.cloud.api.api.v0alpha.ConsentTopic request) {
      return blockingUnaryCall(
          getChannel(), getDeleteConsentTopicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a consent topic defined by UpdateConsentTopicReq message.
     * The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.Empty updateConsentTopic(com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateConsentTopicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Process and Outbound Phone Number against a rule set.
     * The method will return a response indicating
     * if the call would be permited or not and the list
     * of rules checked against.
     * Required permissions:
     *      AGENT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ProcessRes processOutboundCall(com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq request) {
      return blockingUnaryCall(
          getChannel(), getProcessOutboundCallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ComplianceFutureStub extends io.grpc.stub.AbstractStub<ComplianceFutureStub> {
    private ComplianceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComplianceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComplianceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComplianceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes> ruleAutoComplete(
        com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRuleAutoCompleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes> checkRuleSet(
        com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckRuleSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes> assignRuleSet(
        com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignRuleSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RuleSet> getRuleSet(
        com.tcn.cloud.api.api.v0alpha.GetRuleSetReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRuleSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RuleSet> getRuleSetByName(
        com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRuleSetByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RuleSet> createRuleSet(
        com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRuleSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes> renameRuleSet(
        com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRenameRuleSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes> enableRuleSet(
        com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableRuleSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes> disableRuleSet(
        com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDisableRuleSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScrubListRes> createScrubList(
        com.tcn.cloud.api.api.v0alpha.CreateScrubListReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateScrubListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add entries to an existing scrub list defined by AddScrubListEntriesReq message.
     * The method will return a ScrubListRes message that will
     * contain the results.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScrubListRes> addScrubListEntries(
        com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAddScrubListEntriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update scrub list entry defined by UpdateScrubEntryReq message.
     * The method will update a scrub list entry with the specified fields
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes> updateScrubEntry(
        com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateScrubEntryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScrubListRes> deleteScrubListEntries(
        com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteScrubListEntriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScrubListRes> getScrubList(
        com.tcn.cloud.api.api.v0alpha.GetScrubListReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScrubListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScrubListRes> deleteScrubList(
        com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteScrubListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes> getDefaultRules(
        com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDefaultRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScrubListsRes> getScrubLists(
        com.tcn.cloud.api.api.v0alpha.GetScrubListsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScrubListsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScrubList> searchScrubList(
        com.tcn.cloud.api.api.v0alpha.SearchScrubListReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchScrubListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes> getScrubListUploadUrl(
        com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScrubListUploadUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> processScrubListUpload(
        com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessScrubListUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> processScrubListDeleteUpload(
        com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessScrubListDeleteUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ExportScrubListRes> exportScrubList(
        com.tcn.cloud.api.api.v0alpha.ExportScrubListReq request) {
      return futureUnaryCall(
          getChannel().newCall(getExportScrubListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Purge entries from a scrub list defined by PurgeScrubListReq message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes> purgeScrubList(
        com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPurgeScrubListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new Scenario
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateScenarioRes> createScenario(
        com.tcn.cloud.api.api.v0alpha.CreateScenarioReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets one Scenario
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetScenarioRes> getScenario(
        com.tcn.cloud.api.api.v0alpha.GetScenarioReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a Scenario
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes> updateScenario(
        com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a Scenario
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes> deleteScenario(
        com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Run scenarios against ruleset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes> runAssignedScenarios(
        com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRunAssignedScenariosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all scenarios
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes> listAllScenarios(
        com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAllScenariosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List currently unassigned scenarios available to be assigned to a given ruleset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes> listUnassignedScenarios(
        com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListUnassignedScenariosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List rule sets currently assigned to a given scenario
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes> listAssignedRuleSets(
        com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAssignedRuleSetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List scenarios currently assigned to a given ruleset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes> listAssignedScenarios(
        com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAssignedScenariosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign a scenario to a given ruleset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> assignScenario(
        com.tcn.cloud.api.api.v0alpha.AssignScenarioReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unassign a scenario from a given ruleset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unassignScenario(
        com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUnassignScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enable an scenario
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> enableScenario(
        com.tcn.cloud.api.api.v0alpha.EnableScenarioReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disable an scenario
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableScenario(
        com.tcn.cloud.api.api.v0alpha.DisableScenarioReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDisableScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Frequency data calls
     * This will get all available Meta Fields
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.FieldNames> getFieldNames(
        com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFieldNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * This will get all possible results (Answered, Answered Machine, Busy, etc.)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.FieldNames> getResultDescriptions(
        com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetResultDescriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a consent profile defined by CreateConsentProfileReq
     * message.  The method will return a CreateConsentProfileRes message
     * that will contain the newly created consent_profile_id.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes> createConsentProfile(
        com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateConsentProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a consent defined by CreateConsentReq message.
     * The method will return a CreateConsentRes message that will
     * contain the newly created consent_id.
     * Required permissions:
     *      none
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateConsentRes> createConsent(
        com.tcn.cloud.api.api.v0alpha.CreateConsentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateConsentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a consent profile defined by GetConsentProfileReq message
     * for the specified consent_profile_id and org_id.
     * The method will return a ConsentProfile message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ConsentProfile> getConsentProfile(
        com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConsentProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentReq message
     * for the specified consent_id and org_id.
     * The method will return a Consent entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Consent> getConsent(
        com.tcn.cloud.api.api.v0alpha.GetConsentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConsentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentByProfileAndContentReq message
     * for the specified consent_profile_id and content.
     * The method will return a GetConsentByProfileAndContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes> getConsentByProfileAndContent(
        com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConsentByProfileAndContentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a consent defined by GetConsentByContentReq message
     * for the specified consent_profile_id and content and channel_type.
     * The method will return a GetConsentByContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes> getConsentByContent(
        com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConsentByContentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Searches for a consent defined by SearchConsentByContentReq message
     * for the specified content.
     * The method will return a SearchConsentByContentRes message/entity.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes> searchConsentByContent(
        com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchConsentByContentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a consent defined by UpdateConsentReq message for
     * the specified consent_id, and will update the following
     * consent fields:
     *    Content
     *    Recorded
     *    Revoked
     *    Expire
     *    ReferringUrl
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateConsent(
        com.tcn.cloud.api.api.v0alpha.UpdateConsentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateConsentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Expire a consent defined by ExpireConsentReq message.
     * Set the expiration date for the specified consent_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> expireConsent(
        com.tcn.cloud.api.api.v0alpha.ExpireConsentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getExpireConsentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revoke a consent defined by RevokeConsentReq message.
     * Set the revoked date for the specified consent_id and
     * consent_profile_id fields.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      none
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> revokeConsent(
        com.tcn.cloud.api.api.v0alpha.RevokeConsentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeConsentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a consent defined by DeleteConsentReq message
     * The method will return a google.protobuf.Empty message
     * Required permissions:
     *      PERMISSION_COMPLIANCE_CONSENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteConsent(
        com.tcn.cloud.api.api.v0alpha.DeleteConsentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteConsentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Process a consent delete list defined by DeleteConsentReq message
     * The method will return a google.protobuf.Empty message
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> processConsentListDeleteUpload(
        com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessConsentListDeleteUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enable a consent profile defined by EnableConsentProfileReq message.
     * Set the disabled field to false for the specified
     * consent_profile_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> enableConsentProfile(
        com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableConsentProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disable a consent profile defined by DisableConsentProfileReq message.
     * Set the disabled field to true for the specified
     * consent_profile_id field.
     * The method will return a google.protobuf.Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableConsentProfile(
        com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDisableConsentProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List consent profiles defined by ListConsentProfilesReq message.
     * Gets all of the unique consent profiles.
     * The method will return a ListConsentProfilesRes message
     * containing consent_profile_id, profile_name, the number of consents
     * belonging to the profile, and disabled.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes> listConsentProfiles(
        com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListConsentProfilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get consent upload url defined by GetConsentUploadUrlReq message.
     * The method will return a GetConsentUploadUrlRes messages
     * containing a url with which to upload an import file.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes> getConsentUploadUrl(
        com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConsentUploadUrlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Process consent upload defined by ProcessConsentUploadReq message.
     * The method will process an uploaded consent file.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> processConsentUpload(
        com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessConsentUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List consent topics defined by ListConsentTopicsReq message.
     * Gets all of the unique consent topics.
     * The method will return a ListConsentTopicsRes message
     * containing topic, org_id, and deleted.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes> listConsentTopics(
        com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListConsentTopicsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a consent topic defined by GetConsentTopicReq message
     * for the specified topic and org_id.
     * The method will return a ConsentTopic message/entity.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ConsentTopic> getConsentTopic(
        com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConsentTopicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a consent topic defined by ConsentTopic
     * message.  The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Empty> createConsentTopic(
        com.tcn.cloud.api.api.v0alpha.ConsentTopic request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateConsentTopicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a consent topic defined by ConsentTopic message.
     * The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Empty> deleteConsentTopic(
        com.tcn.cloud.api.api.v0alpha.ConsentTopic request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteConsentTopicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a consent topic defined by UpdateConsentTopicReq message.
     * The method will return an Empty message.
     * Required permissions:
     *      EXECUTE_DO_NOT_CALL_LIST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Empty> updateConsentTopic(
        com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateConsentTopicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Process and Outbound Phone Number against a rule set.
     * The method will return a response indicating
     * if the call would be permited or not and the list
     * of rules checked against.
     * Required permissions:
     *      AGENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ProcessRes> processOutboundCall(
        com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessOutboundCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RULE_AUTO_COMPLETE = 0;
  private static final int METHODID_CHECK_RULE_SET = 1;
  private static final int METHODID_ASSIGN_RULE_SET = 2;
  private static final int METHODID_LIST_RULE_SETS = 3;
  private static final int METHODID_GET_RULE_SET = 4;
  private static final int METHODID_GET_RULE_SET_BY_NAME = 5;
  private static final int METHODID_CREATE_RULE_SET = 6;
  private static final int METHODID_RENAME_RULE_SET = 7;
  private static final int METHODID_ENABLE_RULE_SET = 8;
  private static final int METHODID_DISABLE_RULE_SET = 9;
  private static final int METHODID_CREATE_SCRUB_LIST = 10;
  private static final int METHODID_ADD_SCRUB_LIST_ENTRIES = 11;
  private static final int METHODID_UPDATE_SCRUB_ENTRY = 12;
  private static final int METHODID_DELETE_SCRUB_LIST_ENTRIES = 13;
  private static final int METHODID_GET_SCRUB_LIST = 14;
  private static final int METHODID_DELETE_SCRUB_LIST = 15;
  private static final int METHODID_GET_DEFAULT_RULES = 16;
  private static final int METHODID_GET_SCRUB_LISTS = 17;
  private static final int METHODID_SEARCH_SCRUB_LIST = 18;
  private static final int METHODID_GET_SCRUB_LIST_UPLOAD_URL = 19;
  private static final int METHODID_PROCESS_SCRUB_LIST_UPLOAD = 20;
  private static final int METHODID_PROCESS_SCRUB_LIST_DELETE_UPLOAD = 21;
  private static final int METHODID_EXPORT_SCRUB_LIST = 22;
  private static final int METHODID_PURGE_SCRUB_LIST = 23;
  private static final int METHODID_CREATE_SCENARIO = 24;
  private static final int METHODID_GET_SCENARIO = 25;
  private static final int METHODID_UPDATE_SCENARIO = 26;
  private static final int METHODID_DELETE_SCENARIO = 27;
  private static final int METHODID_RUN_ASSIGNED_SCENARIOS = 28;
  private static final int METHODID_LIST_ALL_SCENARIOS = 29;
  private static final int METHODID_LIST_UNASSIGNED_SCENARIOS = 30;
  private static final int METHODID_LIST_ASSIGNED_RULE_SETS = 31;
  private static final int METHODID_LIST_ASSIGNED_SCENARIOS = 32;
  private static final int METHODID_ASSIGN_SCENARIO = 33;
  private static final int METHODID_UNASSIGN_SCENARIO = 34;
  private static final int METHODID_ENABLE_SCENARIO = 35;
  private static final int METHODID_DISABLE_SCENARIO = 36;
  private static final int METHODID_GET_FIELD_NAMES = 37;
  private static final int METHODID_GET_RESULT_DESCRIPTIONS = 38;
  private static final int METHODID_CREATE_CONSENT_PROFILE = 39;
  private static final int METHODID_CREATE_CONSENT = 40;
  private static final int METHODID_GET_CONSENT_PROFILE = 41;
  private static final int METHODID_GET_CONSENT = 42;
  private static final int METHODID_GET_CONSENT_BY_PROFILE_AND_CONTENT = 43;
  private static final int METHODID_GET_CONSENT_BY_CONTENT = 44;
  private static final int METHODID_SEARCH_CONSENT_BY_CONTENT = 45;
  private static final int METHODID_UPDATE_CONSENT = 46;
  private static final int METHODID_EXPIRE_CONSENT = 47;
  private static final int METHODID_REVOKE_CONSENT = 48;
  private static final int METHODID_DELETE_CONSENT = 49;
  private static final int METHODID_PROCESS_CONSENT_LIST_DELETE_UPLOAD = 50;
  private static final int METHODID_ENABLE_CONSENT_PROFILE = 51;
  private static final int METHODID_DISABLE_CONSENT_PROFILE = 52;
  private static final int METHODID_LIST_CONSENT_PROFILES = 53;
  private static final int METHODID_GET_CONSENT_UPLOAD_URL = 54;
  private static final int METHODID_PROCESS_CONSENT_UPLOAD = 55;
  private static final int METHODID_LIST_CONSENT_TOPICS = 56;
  private static final int METHODID_GET_CONSENT_TOPIC = 57;
  private static final int METHODID_CREATE_CONSENT_TOPIC = 58;
  private static final int METHODID_DELETE_CONSENT_TOPIC = 59;
  private static final int METHODID_UPDATE_CONSENT_TOPIC = 60;
  private static final int METHODID_PROCESS_OUTBOUND_CALL = 61;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComplianceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComplianceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RULE_AUTO_COMPLETE:
          serviceImpl.ruleAutoComplete((com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleAutoCompleteRes>) responseObserver);
          break;
        case METHODID_CHECK_RULE_SET:
          serviceImpl.checkRuleSet((com.tcn.cloud.api.api.v0alpha.CheckRuleSetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CheckRuleSetRes>) responseObserver);
          break;
        case METHODID_ASSIGN_RULE_SET:
          serviceImpl.assignRuleSet((com.tcn.cloud.api.api.v0alpha.AssignRuleSetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignRuleSetRes>) responseObserver);
          break;
        case METHODID_LIST_RULE_SETS:
          serviceImpl.listRuleSets((com.tcn.cloud.api.api.v0alpha.ListRuleSetsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListRuleSetsRes>) responseObserver);
          break;
        case METHODID_GET_RULE_SET:
          serviceImpl.getRuleSet((com.tcn.cloud.api.api.v0alpha.GetRuleSetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleSet>) responseObserver);
          break;
        case METHODID_GET_RULE_SET_BY_NAME:
          serviceImpl.getRuleSetByName((com.tcn.cloud.api.api.v0alpha.GetRuleSetByNameReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleSet>) responseObserver);
          break;
        case METHODID_CREATE_RULE_SET:
          serviceImpl.createRuleSet((com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RuleSet>) responseObserver);
          break;
        case METHODID_RENAME_RULE_SET:
          serviceImpl.renameRuleSet((com.tcn.cloud.api.api.v0alpha.RenameRuleSetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RenameRuleSetRes>) responseObserver);
          break;
        case METHODID_ENABLE_RULE_SET:
          serviceImpl.enableRuleSet((com.tcn.cloud.api.api.v0alpha.EnableRuleSetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EnableRuleSetRes>) responseObserver);
          break;
        case METHODID_DISABLE_RULE_SET:
          serviceImpl.disableRuleSet((com.tcn.cloud.api.api.v0alpha.DisableRuleSetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DisableRuleSetRes>) responseObserver);
          break;
        case METHODID_CREATE_SCRUB_LIST:
          serviceImpl.createScrubList((com.tcn.cloud.api.api.v0alpha.CreateScrubListReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes>) responseObserver);
          break;
        case METHODID_ADD_SCRUB_LIST_ENTRIES:
          serviceImpl.addScrubListEntries((com.tcn.cloud.api.api.v0alpha.AddScrubListEntriesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes>) responseObserver);
          break;
        case METHODID_UPDATE_SCRUB_ENTRY:
          serviceImpl.updateScrubEntry((com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScrubEntryRes>) responseObserver);
          break;
        case METHODID_DELETE_SCRUB_LIST_ENTRIES:
          serviceImpl.deleteScrubListEntries((com.tcn.cloud.api.api.v0alpha.DeleteScrubListEntriesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes>) responseObserver);
          break;
        case METHODID_GET_SCRUB_LIST:
          serviceImpl.getScrubList((com.tcn.cloud.api.api.v0alpha.GetScrubListReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes>) responseObserver);
          break;
        case METHODID_DELETE_SCRUB_LIST:
          serviceImpl.deleteScrubList((com.tcn.cloud.api.api.v0alpha.DeleteScrubListReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListRes>) responseObserver);
          break;
        case METHODID_GET_DEFAULT_RULES:
          serviceImpl.getDefaultRules((com.tcn.cloud.api.api.v0alpha.GetDefaultRulesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDefaultRulesRes>) responseObserver);
          break;
        case METHODID_GET_SCRUB_LISTS:
          serviceImpl.getScrubLists((com.tcn.cloud.api.api.v0alpha.GetScrubListsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubListsRes>) responseObserver);
          break;
        case METHODID_SEARCH_SCRUB_LIST:
          serviceImpl.searchScrubList((com.tcn.cloud.api.api.v0alpha.SearchScrubListReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScrubList>) responseObserver);
          break;
        case METHODID_GET_SCRUB_LIST_UPLOAD_URL:
          serviceImpl.getScrubListUploadUrl((com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScrubListUploadUrlRes>) responseObserver);
          break;
        case METHODID_PROCESS_SCRUB_LIST_UPLOAD:
          serviceImpl.processScrubListUpload((com.tcn.cloud.api.api.v0alpha.ProcessScrubListUploadReq) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_PROCESS_SCRUB_LIST_DELETE_UPLOAD:
          serviceImpl.processScrubListDeleteUpload((com.tcn.cloud.api.api.v0alpha.ProcessScrubListDeleteUploadReq) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_SCRUB_LIST:
          serviceImpl.exportScrubList((com.tcn.cloud.api.api.v0alpha.ExportScrubListReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExportScrubListRes>) responseObserver);
          break;
        case METHODID_PURGE_SCRUB_LIST:
          serviceImpl.purgeScrubList((com.tcn.cloud.api.api.v0alpha.PurgeScrubListReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PurgeScrubListRes>) responseObserver);
          break;
        case METHODID_CREATE_SCENARIO:
          serviceImpl.createScenario((com.tcn.cloud.api.api.v0alpha.CreateScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateScenarioRes>) responseObserver);
          break;
        case METHODID_GET_SCENARIO:
          serviceImpl.getScenario((com.tcn.cloud.api.api.v0alpha.GetScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScenarioRes>) responseObserver);
          break;
        case METHODID_UPDATE_SCENARIO:
          serviceImpl.updateScenario((com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScenarioRes>) responseObserver);
          break;
        case METHODID_DELETE_SCENARIO:
          serviceImpl.deleteScenario((com.tcn.cloud.api.api.v0alpha.DeleteScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteScenarioRes>) responseObserver);
          break;
        case METHODID_RUN_ASSIGNED_SCENARIOS:
          serviceImpl.runAssignedScenarios((com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes>) responseObserver);
          break;
        case METHODID_LIST_ALL_SCENARIOS:
          serviceImpl.listAllScenarios((com.tcn.cloud.api.api.v0alpha.ListAllScenariosReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes>) responseObserver);
          break;
        case METHODID_LIST_UNASSIGNED_SCENARIOS:
          serviceImpl.listUnassignedScenarios((com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUnassignedScenariosRes>) responseObserver);
          break;
        case METHODID_LIST_ASSIGNED_RULE_SETS:
          serviceImpl.listAssignedRuleSets((com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes>) responseObserver);
          break;
        case METHODID_LIST_ASSIGNED_SCENARIOS:
          serviceImpl.listAssignedScenarios((com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAssignedScenariosRes>) responseObserver);
          break;
        case METHODID_ASSIGN_SCENARIO:
          serviceImpl.assignScenario((com.tcn.cloud.api.api.v0alpha.AssignScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNASSIGN_SCENARIO:
          serviceImpl.unassignScenario((com.tcn.cloud.api.api.v0alpha.UnassignScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ENABLE_SCENARIO:
          serviceImpl.enableScenario((com.tcn.cloud.api.api.v0alpha.EnableScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DISABLE_SCENARIO:
          serviceImpl.disableScenario((com.tcn.cloud.api.api.v0alpha.DisableScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_FIELD_NAMES:
          serviceImpl.getFieldNames((com.tcn.cloud.api.api.v0alpha.GetFieldNamesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FieldNames>) responseObserver);
          break;
        case METHODID_GET_RESULT_DESCRIPTIONS:
          serviceImpl.getResultDescriptions((com.tcn.cloud.api.api.v0alpha.GetResultDescriptionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FieldNames>) responseObserver);
          break;
        case METHODID_CREATE_CONSENT_PROFILE:
          serviceImpl.createConsentProfile((com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateConsentProfileRes>) responseObserver);
          break;
        case METHODID_CREATE_CONSENT:
          serviceImpl.createConsent((com.tcn.cloud.api.api.v0alpha.CreateConsentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateConsentRes>) responseObserver);
          break;
        case METHODID_GET_CONSENT_PROFILE:
          serviceImpl.getConsentProfile((com.tcn.cloud.api.api.v0alpha.GetConsentProfileReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ConsentProfile>) responseObserver);
          break;
        case METHODID_GET_CONSENT:
          serviceImpl.getConsent((com.tcn.cloud.api.api.v0alpha.GetConsentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Consent>) responseObserver);
          break;
        case METHODID_GET_CONSENT_BY_PROFILE_AND_CONTENT:
          serviceImpl.getConsentByProfileAndContent((com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConsentByProfileAndContentRes>) responseObserver);
          break;
        case METHODID_GET_CONSENT_BY_CONTENT:
          serviceImpl.getConsentByContent((com.tcn.cloud.api.api.v0alpha.GetConsentByContentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConsentByContentRes>) responseObserver);
          break;
        case METHODID_SEARCH_CONSENT_BY_CONTENT:
          serviceImpl.searchConsentByContent((com.tcn.cloud.api.api.v0alpha.SearchConsentByContentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchConsentByContentRes>) responseObserver);
          break;
        case METHODID_UPDATE_CONSENT:
          serviceImpl.updateConsent((com.tcn.cloud.api.api.v0alpha.UpdateConsentReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EXPIRE_CONSENT:
          serviceImpl.expireConsent((com.tcn.cloud.api.api.v0alpha.ExpireConsentReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REVOKE_CONSENT:
          serviceImpl.revokeConsent((com.tcn.cloud.api.api.v0alpha.RevokeConsentReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CONSENT:
          serviceImpl.deleteConsent((com.tcn.cloud.api.api.v0alpha.DeleteConsentReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PROCESS_CONSENT_LIST_DELETE_UPLOAD:
          serviceImpl.processConsentListDeleteUpload((com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_ENABLE_CONSENT_PROFILE:
          serviceImpl.enableConsentProfile((com.tcn.cloud.api.api.v0alpha.EnableConsentProfileReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DISABLE_CONSENT_PROFILE:
          serviceImpl.disableConsentProfile((com.tcn.cloud.api.api.v0alpha.DisableConsentProfileReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_CONSENT_PROFILES:
          serviceImpl.listConsentProfiles((com.tcn.cloud.api.api.v0alpha.ListConsentProfilesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConsentProfilesRes>) responseObserver);
          break;
        case METHODID_GET_CONSENT_UPLOAD_URL:
          serviceImpl.getConsentUploadUrl((com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConsentUploadUrlRes>) responseObserver);
          break;
        case METHODID_PROCESS_CONSENT_UPLOAD:
          serviceImpl.processConsentUpload((com.tcn.cloud.api.api.v0alpha.ProcessConsentUploadReq) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_CONSENT_TOPICS:
          serviceImpl.listConsentTopics((com.tcn.cloud.api.api.v0alpha.ListConsentTopicsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConsentTopicsRes>) responseObserver);
          break;
        case METHODID_GET_CONSENT_TOPIC:
          serviceImpl.getConsentTopic((com.tcn.cloud.api.api.v0alpha.GetConsentTopicReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ConsentTopic>) responseObserver);
          break;
        case METHODID_CREATE_CONSENT_TOPIC:
          serviceImpl.createConsentTopic((com.tcn.cloud.api.api.v0alpha.ConsentTopic) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CONSENT_TOPIC:
          serviceImpl.deleteConsentTopic((com.tcn.cloud.api.api.v0alpha.ConsentTopic) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_CONSENT_TOPIC:
          serviceImpl.updateConsentTopic((com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Empty>) responseObserver);
          break;
        case METHODID_PROCESS_OUTBOUND_CALL:
          serviceImpl.processOutboundCall((com.tcn.cloud.api.api.v0alpha.ProcessOutboundCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessRes>) responseObserver);
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

  private static abstract class ComplianceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComplianceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Compliance");
    }
  }

  private static final class ComplianceFileDescriptorSupplier
      extends ComplianceBaseDescriptorSupplier {
    ComplianceFileDescriptorSupplier() {}
  }

  private static final class ComplianceMethodDescriptorSupplier
      extends ComplianceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComplianceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ComplianceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComplianceFileDescriptorSupplier())
              .addMethod(getRuleAutoCompleteMethod())
              .addMethod(getCheckRuleSetMethod())
              .addMethod(getAssignRuleSetMethod())
              .addMethod(getListRuleSetsMethod())
              .addMethod(getGetRuleSetMethod())
              .addMethod(getGetRuleSetByNameMethod())
              .addMethod(getCreateRuleSetMethod())
              .addMethod(getRenameRuleSetMethod())
              .addMethod(getEnableRuleSetMethod())
              .addMethod(getDisableRuleSetMethod())
              .addMethod(getCreateScrubListMethod())
              .addMethod(getAddScrubListEntriesMethod())
              .addMethod(getUpdateScrubEntryMethod())
              .addMethod(getDeleteScrubListEntriesMethod())
              .addMethod(getGetScrubListMethod())
              .addMethod(getDeleteScrubListMethod())
              .addMethod(getGetDefaultRulesMethod())
              .addMethod(getGetScrubListsMethod())
              .addMethod(getSearchScrubListMethod())
              .addMethod(getGetScrubListUploadUrlMethod())
              .addMethod(getProcessScrubListUploadMethod())
              .addMethod(getProcessScrubListDeleteUploadMethod())
              .addMethod(getExportScrubListMethod())
              .addMethod(getPurgeScrubListMethod())
              .addMethod(getCreateScenarioMethod())
              .addMethod(getGetScenarioMethod())
              .addMethod(getUpdateScenarioMethod())
              .addMethod(getDeleteScenarioMethod())
              .addMethod(getRunAssignedScenariosMethod())
              .addMethod(getListAllScenariosMethod())
              .addMethod(getListUnassignedScenariosMethod())
              .addMethod(getListAssignedRuleSetsMethod())
              .addMethod(getListAssignedScenariosMethod())
              .addMethod(getAssignScenarioMethod())
              .addMethod(getUnassignScenarioMethod())
              .addMethod(getEnableScenarioMethod())
              .addMethod(getDisableScenarioMethod())
              .addMethod(getGetFieldNamesMethod())
              .addMethod(getGetResultDescriptionsMethod())
              .addMethod(getCreateConsentProfileMethod())
              .addMethod(getCreateConsentMethod())
              .addMethod(getGetConsentProfileMethod())
              .addMethod(getGetConsentMethod())
              .addMethod(getGetConsentByProfileAndContentMethod())
              .addMethod(getGetConsentByContentMethod())
              .addMethod(getSearchConsentByContentMethod())
              .addMethod(getUpdateConsentMethod())
              .addMethod(getExpireConsentMethod())
              .addMethod(getRevokeConsentMethod())
              .addMethod(getDeleteConsentMethod())
              .addMethod(getProcessConsentListDeleteUploadMethod())
              .addMethod(getEnableConsentProfileMethod())
              .addMethod(getDisableConsentProfileMethod())
              .addMethod(getListConsentProfilesMethod())
              .addMethod(getGetConsentUploadUrlMethod())
              .addMethod(getProcessConsentUploadMethod())
              .addMethod(getListConsentTopicsMethod())
              .addMethod(getGetConsentTopicMethod())
              .addMethod(getCreateConsentTopicMethod())
              .addMethod(getDeleteConsentTopicMethod())
              .addMethod(getUpdateConsentTopicMethod())
              .addMethod(getProcessOutboundCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
