package com.tcn.cloud.api.api.v1alpha1.org;

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
 * <pre>
 * ORGANIZATION
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v1alpha1/org/service.proto")
public final class OrgGrpc {

  private OrgGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.org.Org";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = OrgGrpc.getCreateOrganizationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateOrganizationMethod = OrgGrpc.getCreateOrganizationMethod) == null) {
          OrgGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateOrganization"))
                  .build();
          }
        }
     }
     return getCreateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = OrgGrpc.getGetOrganizationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetOrganizationMethod = OrgGrpc.getGetOrganizationMethod) == null) {
          OrgGrpc.getGetOrganizationMethod = getGetOrganizationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetOrganization"))
                  .build();
          }
        }
     }
     return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse> getGetOrganizationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationById",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse> getGetOrganizationByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse> getGetOrganizationByIdMethod;
    if ((getGetOrganizationByIdMethod = OrgGrpc.getGetOrganizationByIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetOrganizationByIdMethod = OrgGrpc.getGetOrganizationByIdMethod) == null) {
          OrgGrpc.getGetOrganizationByIdMethod = getGetOrganizationByIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetOrganizationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetOrganizationById"))
                  .build();
          }
        }
     }
     return getGetOrganizationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = OrgGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateOrganizationMethod = OrgGrpc.getUpdateOrganizationMethod) == null) {
          OrgGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateOrganization"))
                  .build();
          }
        }
     }
     return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse> getArchiveOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArchiveOrganization",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse> getArchiveOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse> getArchiveOrganizationMethod;
    if ((getArchiveOrganizationMethod = OrgGrpc.getArchiveOrganizationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getArchiveOrganizationMethod = OrgGrpc.getArchiveOrganizationMethod) == null) {
          OrgGrpc.getArchiveOrganizationMethod = getArchiveOrganizationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ArchiveOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ArchiveOrganization"))
                  .build();
          }
        }
     }
     return getArchiveOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse> getUnArchiveOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnArchiveOrganization",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse> getUnArchiveOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse> getUnArchiveOrganizationMethod;
    if ((getUnArchiveOrganizationMethod = OrgGrpc.getUnArchiveOrganizationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUnArchiveOrganizationMethod = OrgGrpc.getUnArchiveOrganizationMethod) == null) {
          OrgGrpc.getUnArchiveOrganizationMethod = getUnArchiveOrganizationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UnArchiveOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UnArchiveOrganization"))
                  .build();
          }
        }
     }
     return getUnArchiveOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse> getListAllOrganizationsGloballyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllOrganizationsGlobally",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse> getListAllOrganizationsGloballyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse> getListAllOrganizationsGloballyMethod;
    if ((getListAllOrganizationsGloballyMethod = OrgGrpc.getListAllOrganizationsGloballyMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAllOrganizationsGloballyMethod = OrgGrpc.getListAllOrganizationsGloballyMethod) == null) {
          OrgGrpc.getListAllOrganizationsGloballyMethod = getListAllOrganizationsGloballyMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListAllOrganizationsGlobally"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAllOrganizationsGlobally"))
                  .build();
          }
        }
     }
     return getListAllOrganizationsGloballyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse> getListOrganizationsByRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationsByRegion",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse> getListOrganizationsByRegionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest, com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse> getListOrganizationsByRegionMethod;
    if ((getListOrganizationsByRegionMethod = OrgGrpc.getListOrganizationsByRegionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListOrganizationsByRegionMethod = OrgGrpc.getListOrganizationsByRegionMethod) == null) {
          OrgGrpc.getListOrganizationsByRegionMethod = getListOrganizationsByRegionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest, com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListOrganizationsByRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListOrganizationsByRegion"))
                  .build();
          }
        }
     }
     return getListOrganizationsByRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse> getListArchivedOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListArchivedOrganizations",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse> getListArchivedOrganizationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse> getListArchivedOrganizationsMethod;
    if ((getListArchivedOrganizationsMethod = OrgGrpc.getListArchivedOrganizationsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListArchivedOrganizationsMethod = OrgGrpc.getListArchivedOrganizationsMethod) == null) {
          OrgGrpc.getListArchivedOrganizationsMethod = getListArchivedOrganizationsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListArchivedOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListArchivedOrganizations"))
                  .build();
          }
        }
     }
     return getListArchivedOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse> getConvertOrgToManualMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConvertOrgToManual",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse> getConvertOrgToManualMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest, com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse> getConvertOrgToManualMethod;
    if ((getConvertOrgToManualMethod = OrgGrpc.getConvertOrgToManualMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getConvertOrgToManualMethod = OrgGrpc.getConvertOrgToManualMethod) == null) {
          OrgGrpc.getConvertOrgToManualMethod = getConvertOrgToManualMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest, com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ConvertOrgToManual"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ConvertOrgToManual"))
                  .build();
          }
        }
     }
     return getConvertOrgToManualMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse> getListOwnedOrgsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOwnedOrgs",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse> getListOwnedOrgsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse> getListOwnedOrgsMethod;
    if ((getListOwnedOrgsMethod = OrgGrpc.getListOwnedOrgsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListOwnedOrgsMethod = OrgGrpc.getListOwnedOrgsMethod) == null) {
          OrgGrpc.getListOwnedOrgsMethod = getListOwnedOrgsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListOwnedOrgs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListOwnedOrgs"))
                  .build();
          }
        }
     }
     return getListOwnedOrgsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse> getGetOrganizationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse> getGetOrganizationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse> getGetOrganizationPreferencesMethod;
    if ((getGetOrganizationPreferencesMethod = OrgGrpc.getGetOrganizationPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetOrganizationPreferencesMethod = OrgGrpc.getGetOrganizationPreferencesMethod) == null) {
          OrgGrpc.getGetOrganizationPreferencesMethod = getGetOrganizationPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetOrganizationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetOrganizationPreferences"))
                  .build();
          }
        }
     }
     return getGetOrganizationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse> getUpdateOrganizationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse> getUpdateOrganizationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse> getUpdateOrganizationPreferencesMethod;
    if ((getUpdateOrganizationPreferencesMethod = OrgGrpc.getUpdateOrganizationPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateOrganizationPreferencesMethod = OrgGrpc.getUpdateOrganizationPreferencesMethod) == null) {
          OrgGrpc.getUpdateOrganizationPreferencesMethod = getUpdateOrganizationPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateOrganizationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateOrganizationPreferences"))
                  .build();
          }
        }
     }
     return getUpdateOrganizationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse> getGetAgentPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse> getGetAgentPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse> getGetAgentPreferencesMethod;
    if ((getGetAgentPreferencesMethod = OrgGrpc.getGetAgentPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAgentPreferencesMethod = OrgGrpc.getGetAgentPreferencesMethod) == null) {
          OrgGrpc.getGetAgentPreferencesMethod = getGetAgentPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetAgentPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAgentPreferences"))
                  .build();
          }
        }
     }
     return getGetAgentPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse> getUpdateAgentPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse> getUpdateAgentPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse> getUpdateAgentPreferencesMethod;
    if ((getUpdateAgentPreferencesMethod = OrgGrpc.getUpdateAgentPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAgentPreferencesMethod = OrgGrpc.getUpdateAgentPreferencesMethod) == null) {
          OrgGrpc.getUpdateAgentPreferencesMethod = getUpdateAgentPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateAgentPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAgentPreferences"))
                  .build();
          }
        }
     }
     return getUpdateAgentPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse> getGetContactPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContactPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse> getGetContactPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse> getGetContactPreferencesMethod;
    if ((getGetContactPreferencesMethod = OrgGrpc.getGetContactPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetContactPreferencesMethod = OrgGrpc.getGetContactPreferencesMethod) == null) {
          OrgGrpc.getGetContactPreferencesMethod = getGetContactPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetContactPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetContactPreferences"))
                  .build();
          }
        }
     }
     return getGetContactPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse> getUpdateContactPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateContactPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse> getUpdateContactPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse> getUpdateContactPreferencesMethod;
    if ((getUpdateContactPreferencesMethod = OrgGrpc.getUpdateContactPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateContactPreferencesMethod = OrgGrpc.getUpdateContactPreferencesMethod) == null) {
          OrgGrpc.getUpdateContactPreferencesMethod = getUpdateContactPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateContactPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateContactPreferences"))
                  .build();
          }
        }
     }
     return getUpdateContactPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse> getGetAuthenticationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthenticationPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse> getGetAuthenticationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse> getGetAuthenticationPreferencesMethod;
    if ((getGetAuthenticationPreferencesMethod = OrgGrpc.getGetAuthenticationPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAuthenticationPreferencesMethod = OrgGrpc.getGetAuthenticationPreferencesMethod) == null) {
          OrgGrpc.getGetAuthenticationPreferencesMethod = getGetAuthenticationPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetAuthenticationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAuthenticationPreferences"))
                  .build();
          }
        }
     }
     return getGetAuthenticationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse> getUpdateAuthenticationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthenticationPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse> getUpdateAuthenticationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse> getUpdateAuthenticationPreferencesMethod;
    if ((getUpdateAuthenticationPreferencesMethod = OrgGrpc.getUpdateAuthenticationPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAuthenticationPreferencesMethod = OrgGrpc.getUpdateAuthenticationPreferencesMethod) == null) {
          OrgGrpc.getUpdateAuthenticationPreferencesMethod = getUpdateAuthenticationPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateAuthenticationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAuthenticationPreferences"))
                  .build();
          }
        }
     }
     return getUpdateAuthenticationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse> getGetWebhookPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWebhookPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse> getGetWebhookPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse> getGetWebhookPreferencesMethod;
    if ((getGetWebhookPreferencesMethod = OrgGrpc.getGetWebhookPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetWebhookPreferencesMethod = OrgGrpc.getGetWebhookPreferencesMethod) == null) {
          OrgGrpc.getGetWebhookPreferencesMethod = getGetWebhookPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetWebhookPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetWebhookPreferences"))
                  .build();
          }
        }
     }
     return getGetWebhookPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse> getUpdateWebhookPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWebhookPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse> getUpdateWebhookPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse> getUpdateWebhookPreferencesMethod;
    if ((getUpdateWebhookPreferencesMethod = OrgGrpc.getUpdateWebhookPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateWebhookPreferencesMethod = OrgGrpc.getUpdateWebhookPreferencesMethod) == null) {
          OrgGrpc.getUpdateWebhookPreferencesMethod = getUpdateWebhookPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateWebhookPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateWebhookPreferences"))
                  .build();
          }
        }
     }
     return getUpdateWebhookPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse> getGetDashboardGeneralPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDashboardGeneralPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse> getGetDashboardGeneralPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse> getGetDashboardGeneralPreferencesMethod;
    if ((getGetDashboardGeneralPreferencesMethod = OrgGrpc.getGetDashboardGeneralPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetDashboardGeneralPreferencesMethod = OrgGrpc.getGetDashboardGeneralPreferencesMethod) == null) {
          OrgGrpc.getGetDashboardGeneralPreferencesMethod = getGetDashboardGeneralPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetDashboardGeneralPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetDashboardGeneralPreferences"))
                  .build();
          }
        }
     }
     return getGetDashboardGeneralPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse> getUpdateDashboardGeneralPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboardGeneralPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse> getUpdateDashboardGeneralPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse> getUpdateDashboardGeneralPreferencesMethod;
    if ((getUpdateDashboardGeneralPreferencesMethod = OrgGrpc.getUpdateDashboardGeneralPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateDashboardGeneralPreferencesMethod = OrgGrpc.getUpdateDashboardGeneralPreferencesMethod) == null) {
          OrgGrpc.getUpdateDashboardGeneralPreferencesMethod = getUpdateDashboardGeneralPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateDashboardGeneralPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateDashboardGeneralPreferences"))
                  .build();
          }
        }
     }
     return getUpdateDashboardGeneralPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse> getGetDashboardQueuePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDashboardQueuePreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse> getGetDashboardQueuePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse> getGetDashboardQueuePreferencesMethod;
    if ((getGetDashboardQueuePreferencesMethod = OrgGrpc.getGetDashboardQueuePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetDashboardQueuePreferencesMethod = OrgGrpc.getGetDashboardQueuePreferencesMethod) == null) {
          OrgGrpc.getGetDashboardQueuePreferencesMethod = getGetDashboardQueuePreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetDashboardQueuePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetDashboardQueuePreferences"))
                  .build();
          }
        }
     }
     return getGetDashboardQueuePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse> getUpdateDashboardQueuePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboardQueuePreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse> getUpdateDashboardQueuePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse> getUpdateDashboardQueuePreferencesMethod;
    if ((getUpdateDashboardQueuePreferencesMethod = OrgGrpc.getUpdateDashboardQueuePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateDashboardQueuePreferencesMethod = OrgGrpc.getUpdateDashboardQueuePreferencesMethod) == null) {
          OrgGrpc.getUpdateDashboardQueuePreferencesMethod = getUpdateDashboardQueuePreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateDashboardQueuePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateDashboardQueuePreferences"))
                  .build();
          }
        }
     }
     return getUpdateDashboardQueuePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse> getGetPhonePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPhonePreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse> getGetPhonePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse> getGetPhonePreferencesMethod;
    if ((getGetPhonePreferencesMethod = OrgGrpc.getGetPhonePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetPhonePreferencesMethod = OrgGrpc.getGetPhonePreferencesMethod) == null) {
          OrgGrpc.getGetPhonePreferencesMethod = getGetPhonePreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetPhonePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetPhonePreferences"))
                  .build();
          }
        }
     }
     return getGetPhonePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse> getUpdatePhonePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePhonePreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse> getUpdatePhonePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse> getUpdatePhonePreferencesMethod;
    if ((getUpdatePhonePreferencesMethod = OrgGrpc.getUpdatePhonePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdatePhonePreferencesMethod = OrgGrpc.getUpdatePhonePreferencesMethod) == null) {
          OrgGrpc.getUpdatePhonePreferencesMethod = getUpdatePhonePreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdatePhonePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdatePhonePreferences"))
                  .build();
          }
        }
     }
     return getUpdatePhonePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse> getGetCompliancePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCompliancePreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse> getGetCompliancePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse> getGetCompliancePreferencesMethod;
    if ((getGetCompliancePreferencesMethod = OrgGrpc.getGetCompliancePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetCompliancePreferencesMethod = OrgGrpc.getGetCompliancePreferencesMethod) == null) {
          OrgGrpc.getGetCompliancePreferencesMethod = getGetCompliancePreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetCompliancePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetCompliancePreferences"))
                  .build();
          }
        }
     }
     return getGetCompliancePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse> getUpdateCompliancePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCompliancePreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse> getUpdateCompliancePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse> getUpdateCompliancePreferencesMethod;
    if ((getUpdateCompliancePreferencesMethod = OrgGrpc.getUpdateCompliancePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateCompliancePreferencesMethod = OrgGrpc.getUpdateCompliancePreferencesMethod) == null) {
          OrgGrpc.getUpdateCompliancePreferencesMethod = getUpdateCompliancePreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateCompliancePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateCompliancePreferences"))
                  .build();
          }
        }
     }
     return getUpdateCompliancePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse> getGetBroadcastPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBroadcastPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse> getGetBroadcastPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse> getGetBroadcastPreferencesMethod;
    if ((getGetBroadcastPreferencesMethod = OrgGrpc.getGetBroadcastPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetBroadcastPreferencesMethod = OrgGrpc.getGetBroadcastPreferencesMethod) == null) {
          OrgGrpc.getGetBroadcastPreferencesMethod = getGetBroadcastPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetBroadcastPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetBroadcastPreferences"))
                  .build();
          }
        }
     }
     return getGetBroadcastPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse> getUpdateBroadcastPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBroadcastPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse> getUpdateBroadcastPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse> getUpdateBroadcastPreferencesMethod;
    if ((getUpdateBroadcastPreferencesMethod = OrgGrpc.getUpdateBroadcastPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateBroadcastPreferencesMethod = OrgGrpc.getUpdateBroadcastPreferencesMethod) == null) {
          OrgGrpc.getUpdateBroadcastPreferencesMethod = getUpdateBroadcastPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateBroadcastPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateBroadcastPreferences"))
                  .build();
          }
        }
     }
     return getUpdateBroadcastPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse> getGetSchedulePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSchedulePreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse> getGetSchedulePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse> getGetSchedulePreferencesMethod;
    if ((getGetSchedulePreferencesMethod = OrgGrpc.getGetSchedulePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetSchedulePreferencesMethod = OrgGrpc.getGetSchedulePreferencesMethod) == null) {
          OrgGrpc.getGetSchedulePreferencesMethod = getGetSchedulePreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetSchedulePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetSchedulePreferences"))
                  .build();
          }
        }
     }
     return getGetSchedulePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse> getUpdateSchedulePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSchedulePreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse> getUpdateSchedulePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse> getUpdateSchedulePreferencesMethod;
    if ((getUpdateSchedulePreferencesMethod = OrgGrpc.getUpdateSchedulePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateSchedulePreferencesMethod = OrgGrpc.getUpdateSchedulePreferencesMethod) == null) {
          OrgGrpc.getUpdateSchedulePreferencesMethod = getUpdateSchedulePreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateSchedulePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateSchedulePreferences"))
                  .build();
          }
        }
     }
     return getUpdateSchedulePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse> getGetEmailSmsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailSmsPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse> getGetEmailSmsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse> getGetEmailSmsPreferencesMethod;
    if ((getGetEmailSmsPreferencesMethod = OrgGrpc.getGetEmailSmsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetEmailSmsPreferencesMethod = OrgGrpc.getGetEmailSmsPreferencesMethod) == null) {
          OrgGrpc.getGetEmailSmsPreferencesMethod = getGetEmailSmsPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetEmailSmsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetEmailSmsPreferences"))
                  .build();
          }
        }
     }
     return getGetEmailSmsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse> getUpdateEmailSmsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmailSmsPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse> getUpdateEmailSmsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse> getUpdateEmailSmsPreferencesMethod;
    if ((getUpdateEmailSmsPreferencesMethod = OrgGrpc.getUpdateEmailSmsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateEmailSmsPreferencesMethod = OrgGrpc.getUpdateEmailSmsPreferencesMethod) == null) {
          OrgGrpc.getUpdateEmailSmsPreferencesMethod = getUpdateEmailSmsPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateEmailSmsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateEmailSmsPreferences"))
                  .build();
          }
        }
     }
     return getUpdateEmailSmsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse> getGetBusinessPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBusinessPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse> getGetBusinessPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse> getGetBusinessPreferencesMethod;
    if ((getGetBusinessPreferencesMethod = OrgGrpc.getGetBusinessPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetBusinessPreferencesMethod = OrgGrpc.getGetBusinessPreferencesMethod) == null) {
          OrgGrpc.getGetBusinessPreferencesMethod = getGetBusinessPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetBusinessPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetBusinessPreferences"))
                  .build();
          }
        }
     }
     return getGetBusinessPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse> getUpdateBusinessPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBusinessPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse> getUpdateBusinessPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse> getUpdateBusinessPreferencesMethod;
    if ((getUpdateBusinessPreferencesMethod = OrgGrpc.getUpdateBusinessPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateBusinessPreferencesMethod = OrgGrpc.getUpdateBusinessPreferencesMethod) == null) {
          OrgGrpc.getUpdateBusinessPreferencesMethod = getUpdateBusinessPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateBusinessPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateBusinessPreferences"))
                  .build();
          }
        }
     }
     return getUpdateBusinessPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse> getGetScorecardsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScorecardsPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse> getGetScorecardsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse> getGetScorecardsPreferencesMethod;
    if ((getGetScorecardsPreferencesMethod = OrgGrpc.getGetScorecardsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetScorecardsPreferencesMethod = OrgGrpc.getGetScorecardsPreferencesMethod) == null) {
          OrgGrpc.getGetScorecardsPreferencesMethod = getGetScorecardsPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetScorecardsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetScorecardsPreferences"))
                  .build();
          }
        }
     }
     return getGetScorecardsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse> getUpdateScorecardsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScorecardsPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse> getUpdateScorecardsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse> getUpdateScorecardsPreferencesMethod;
    if ((getUpdateScorecardsPreferencesMethod = OrgGrpc.getUpdateScorecardsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateScorecardsPreferencesMethod = OrgGrpc.getUpdateScorecardsPreferencesMethod) == null) {
          OrgGrpc.getUpdateScorecardsPreferencesMethod = getUpdateScorecardsPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateScorecardsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateScorecardsPreferences"))
                  .build();
          }
        }
     }
     return getUpdateScorecardsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse> getGetVoiceAnalyticsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVoiceAnalyticsPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse> getGetVoiceAnalyticsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse> getGetVoiceAnalyticsPreferencesMethod;
    if ((getGetVoiceAnalyticsPreferencesMethod = OrgGrpc.getGetVoiceAnalyticsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetVoiceAnalyticsPreferencesMethod = OrgGrpc.getGetVoiceAnalyticsPreferencesMethod) == null) {
          OrgGrpc.getGetVoiceAnalyticsPreferencesMethod = getGetVoiceAnalyticsPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetVoiceAnalyticsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetVoiceAnalyticsPreferences"))
                  .build();
          }
        }
     }
     return getGetVoiceAnalyticsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse> getListVoiceAnalyticsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVoiceAnalyticsPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse> getListVoiceAnalyticsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse> getListVoiceAnalyticsPreferencesMethod;
    if ((getListVoiceAnalyticsPreferencesMethod = OrgGrpc.getListVoiceAnalyticsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListVoiceAnalyticsPreferencesMethod = OrgGrpc.getListVoiceAnalyticsPreferencesMethod) == null) {
          OrgGrpc.getListVoiceAnalyticsPreferencesMethod = getListVoiceAnalyticsPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListVoiceAnalyticsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListVoiceAnalyticsPreferences"))
                  .build();
          }
        }
     }
     return getListVoiceAnalyticsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse> getUpdateVoiceAnalyticsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVoiceAnalyticsPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse> getUpdateVoiceAnalyticsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse> getUpdateVoiceAnalyticsPreferencesMethod;
    if ((getUpdateVoiceAnalyticsPreferencesMethod = OrgGrpc.getUpdateVoiceAnalyticsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateVoiceAnalyticsPreferencesMethod = OrgGrpc.getUpdateVoiceAnalyticsPreferencesMethod) == null) {
          OrgGrpc.getUpdateVoiceAnalyticsPreferencesMethod = getUpdateVoiceAnalyticsPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateVoiceAnalyticsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateVoiceAnalyticsPreferences"))
                  .build();
          }
        }
     }
     return getUpdateVoiceAnalyticsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse> getGetEndOfDayPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEndOfDayPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse> getGetEndOfDayPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse> getGetEndOfDayPreferencesMethod;
    if ((getGetEndOfDayPreferencesMethod = OrgGrpc.getGetEndOfDayPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetEndOfDayPreferencesMethod = OrgGrpc.getGetEndOfDayPreferencesMethod) == null) {
          OrgGrpc.getGetEndOfDayPreferencesMethod = getGetEndOfDayPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetEndOfDayPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetEndOfDayPreferences"))
                  .build();
          }
        }
     }
     return getGetEndOfDayPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse> getUpdateEndOfDayPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEndOfDayPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse> getUpdateEndOfDayPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse> getUpdateEndOfDayPreferencesMethod;
    if ((getUpdateEndOfDayPreferencesMethod = OrgGrpc.getUpdateEndOfDayPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateEndOfDayPreferencesMethod = OrgGrpc.getUpdateEndOfDayPreferencesMethod) == null) {
          OrgGrpc.getUpdateEndOfDayPreferencesMethod = getUpdateEndOfDayPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateEndOfDayPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateEndOfDayPreferences"))
                  .build();
          }
        }
     }
     return getUpdateEndOfDayPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse> getGetReportFilterPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReportFilterPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse> getGetReportFilterPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse> getGetReportFilterPreferencesMethod;
    if ((getGetReportFilterPreferencesMethod = OrgGrpc.getGetReportFilterPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetReportFilterPreferencesMethod = OrgGrpc.getGetReportFilterPreferencesMethod) == null) {
          OrgGrpc.getGetReportFilterPreferencesMethod = getGetReportFilterPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetReportFilterPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetReportFilterPreferences"))
                  .build();
          }
        }
     }
     return getGetReportFilterPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse> getUpdateReportFilterPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReportFilterPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse> getUpdateReportFilterPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse> getUpdateReportFilterPreferencesMethod;
    if ((getUpdateReportFilterPreferencesMethod = OrgGrpc.getUpdateReportFilterPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateReportFilterPreferencesMethod = OrgGrpc.getUpdateReportFilterPreferencesMethod) == null) {
          OrgGrpc.getUpdateReportFilterPreferencesMethod = getUpdateReportFilterPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateReportFilterPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateReportFilterPreferences"))
                  .build();
          }
        }
     }
     return getUpdateReportFilterPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse> getGetRecordingPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecordingPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse> getGetRecordingPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse> getGetRecordingPreferencesMethod;
    if ((getGetRecordingPreferencesMethod = OrgGrpc.getGetRecordingPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetRecordingPreferencesMethod = OrgGrpc.getGetRecordingPreferencesMethod) == null) {
          OrgGrpc.getGetRecordingPreferencesMethod = getGetRecordingPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetRecordingPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetRecordingPreferences"))
                  .build();
          }
        }
     }
     return getGetRecordingPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse> getUpdateRecordingPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRecordingPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse> getUpdateRecordingPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse> getUpdateRecordingPreferencesMethod;
    if ((getUpdateRecordingPreferencesMethod = OrgGrpc.getUpdateRecordingPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateRecordingPreferencesMethod = OrgGrpc.getUpdateRecordingPreferencesMethod) == null) {
          OrgGrpc.getUpdateRecordingPreferencesMethod = getUpdateRecordingPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateRecordingPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateRecordingPreferences"))
                  .build();
          }
        }
     }
     return getUpdateRecordingPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse> getGetAdminClientPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdminClientPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse> getGetAdminClientPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse> getGetAdminClientPreferencesMethod;
    if ((getGetAdminClientPreferencesMethod = OrgGrpc.getGetAdminClientPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAdminClientPreferencesMethod = OrgGrpc.getGetAdminClientPreferencesMethod) == null) {
          OrgGrpc.getGetAdminClientPreferencesMethod = getGetAdminClientPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetAdminClientPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAdminClientPreferences"))
                  .build();
          }
        }
     }
     return getGetAdminClientPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse> getUpdateAdminClientPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAdminClientPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse> getUpdateAdminClientPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse> getUpdateAdminClientPreferencesMethod;
    if ((getUpdateAdminClientPreferencesMethod = OrgGrpc.getUpdateAdminClientPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAdminClientPreferencesMethod = OrgGrpc.getUpdateAdminClientPreferencesMethod) == null) {
          OrgGrpc.getUpdateAdminClientPreferencesMethod = getUpdateAdminClientPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateAdminClientPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAdminClientPreferences"))
                  .build();
          }
        }
     }
     return getUpdateAdminClientPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse> getAcceptLinkbackRecordingTermsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptLinkbackRecordingTerms",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse> getAcceptLinkbackRecordingTermsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest, com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse> getAcceptLinkbackRecordingTermsMethod;
    if ((getAcceptLinkbackRecordingTermsMethod = OrgGrpc.getAcceptLinkbackRecordingTermsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAcceptLinkbackRecordingTermsMethod = OrgGrpc.getAcceptLinkbackRecordingTermsMethod) == null) {
          OrgGrpc.getAcceptLinkbackRecordingTermsMethod = getAcceptLinkbackRecordingTermsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest, com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AcceptLinkbackRecordingTerms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AcceptLinkbackRecordingTerms"))
                  .build();
          }
        }
     }
     return getAcceptLinkbackRecordingTermsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse> getLinkbackUpdateBroadcastTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkbackUpdateBroadcastTemplates",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse> getLinkbackUpdateBroadcastTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest, com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse> getLinkbackUpdateBroadcastTemplatesMethod;
    if ((getLinkbackUpdateBroadcastTemplatesMethod = OrgGrpc.getLinkbackUpdateBroadcastTemplatesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getLinkbackUpdateBroadcastTemplatesMethod = OrgGrpc.getLinkbackUpdateBroadcastTemplatesMethod) == null) {
          OrgGrpc.getLinkbackUpdateBroadcastTemplatesMethod = getLinkbackUpdateBroadcastTemplatesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest, com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "LinkbackUpdateBroadcastTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("LinkbackUpdateBroadcastTemplates"))
                  .build();
          }
        }
     }
     return getLinkbackUpdateBroadcastTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse> getRecordEmailUnsubscribeAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordEmailUnsubscribeAcknowledgement",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse> getRecordEmailUnsubscribeAcknowledgementMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse> getRecordEmailUnsubscribeAcknowledgementMethod;
    if ((getRecordEmailUnsubscribeAcknowledgementMethod = OrgGrpc.getRecordEmailUnsubscribeAcknowledgementMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRecordEmailUnsubscribeAcknowledgementMethod = OrgGrpc.getRecordEmailUnsubscribeAcknowledgementMethod) == null) {
          OrgGrpc.getRecordEmailUnsubscribeAcknowledgementMethod = getRecordEmailUnsubscribeAcknowledgementMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "RecordEmailUnsubscribeAcknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RecordEmailUnsubscribeAcknowledgement"))
                  .build();
          }
        }
     }
     return getRecordEmailUnsubscribeAcknowledgementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse> getClearEmailUnsubscribeAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearEmailUnsubscribeAcknowledgement",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse> getClearEmailUnsubscribeAcknowledgementMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse> getClearEmailUnsubscribeAcknowledgementMethod;
    if ((getClearEmailUnsubscribeAcknowledgementMethod = OrgGrpc.getClearEmailUnsubscribeAcknowledgementMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getClearEmailUnsubscribeAcknowledgementMethod = OrgGrpc.getClearEmailUnsubscribeAcknowledgementMethod) == null) {
          OrgGrpc.getClearEmailUnsubscribeAcknowledgementMethod = getClearEmailUnsubscribeAcknowledgementMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ClearEmailUnsubscribeAcknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ClearEmailUnsubscribeAcknowledgement"))
                  .build();
          }
        }
     }
     return getClearEmailUnsubscribeAcknowledgementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = OrgGrpc.getCreateUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateUserMethod = OrgGrpc.getCreateUserMethod) == null) {
          OrgGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse> getCreateDelegatedUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDelegatedUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse> getCreateDelegatedUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse> getCreateDelegatedUserMethod;
    if ((getCreateDelegatedUserMethod = OrgGrpc.getCreateDelegatedUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateDelegatedUserMethod = OrgGrpc.getCreateDelegatedUserMethod) == null) {
          OrgGrpc.getCreateDelegatedUserMethod = getCreateDelegatedUserMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreateDelegatedUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateDelegatedUser"))
                  .build();
          }
        }
     }
     return getCreateDelegatedUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse> getGetMyUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse> getGetMyUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest, com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse> getGetMyUserMethod;
    if ((getGetMyUserMethod = OrgGrpc.getGetMyUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetMyUserMethod = OrgGrpc.getGetMyUserMethod) == null) {
          OrgGrpc.getGetMyUserMethod = getGetMyUserMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest, com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetMyUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetMyUser"))
                  .build();
          }
        }
     }
     return getGetMyUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = OrgGrpc.getGetUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserMethod = OrgGrpc.getGetUserMethod) == null) {
          OrgGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse> getGetUserByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse> getGetUserByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse> getGetUserByOrgIdMethod;
    if ((getGetUserByOrgIdMethod = OrgGrpc.getGetUserByOrgIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserByOrgIdMethod = OrgGrpc.getGetUserByOrgIdMethod) == null) {
          OrgGrpc.getGetUserByOrgIdMethod = getGetUserByOrgIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserByOrgId"))
                  .build();
          }
        }
     }
     return getGetUserByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse> getListAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgents",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse> getListAgentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse> getListAgentsMethod;
    if ((getListAgentsMethod = OrgGrpc.getListAgentsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAgentsMethod = OrgGrpc.getListAgentsMethod) == null) {
          OrgGrpc.getListAgentsMethod = getListAgentsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAgents"))
                  .build();
          }
        }
     }
     return getListAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = OrgGrpc.getListUsersMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListUsersMethod = OrgGrpc.getListUsersMethod) == null) {
          OrgGrpc.getListUsersMethod = getListUsersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListUsers"))
                  .build();
          }
        }
     }
     return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse> getListUsersByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsersByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse> getListUsersByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse> getListUsersByOrgIdMethod;
    if ((getListUsersByOrgIdMethod = OrgGrpc.getListUsersByOrgIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListUsersByOrgIdMethod = OrgGrpc.getListUsersByOrgIdMethod) == null) {
          OrgGrpc.getListUsersByOrgIdMethod = getListUsersByOrgIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListUsersByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListUsersByOrgId"))
                  .build();
          }
        }
     }
     return getListUsersByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse> getListUsersByRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsersByRegion",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse> getListUsersByRegionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse> getListUsersByRegionMethod;
    if ((getListUsersByRegionMethod = OrgGrpc.getListUsersByRegionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListUsersByRegionMethod = OrgGrpc.getListUsersByRegionMethod) == null) {
          OrgGrpc.getListUsersByRegionMethod = getListUsersByRegionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListUsersByRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListUsersByRegion"))
                  .build();
          }
        }
     }
     return getListUsersByRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse> getUpdateMyUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMyUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse> getUpdateMyUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse> getUpdateMyUserMethod;
    if ((getUpdateMyUserMethod = OrgGrpc.getUpdateMyUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateMyUserMethod = OrgGrpc.getUpdateMyUserMethod) == null) {
          OrgGrpc.getUpdateMyUserMethod = getUpdateMyUserMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateMyUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateMyUser"))
                  .build();
          }
        }
     }
     return getUpdateMyUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = OrgGrpc.getUpdateUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserMethod = OrgGrpc.getUpdateUserMethod) == null) {
          OrgGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse> getUpdateUserLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserLabels",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse> getUpdateUserLabelsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse> getUpdateUserLabelsMethod;
    if ((getUpdateUserLabelsMethod = OrgGrpc.getUpdateUserLabelsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserLabelsMethod = OrgGrpc.getUpdateUserLabelsMethod) == null) {
          OrgGrpc.getUpdateUserLabelsMethod = getUpdateUserLabelsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateUserLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserLabels"))
                  .build();
          }
        }
     }
     return getUpdateUserLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse> getUpdateUserCallerIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserCallerId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse> getUpdateUserCallerIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse> getUpdateUserCallerIdMethod;
    if ((getUpdateUserCallerIdMethod = OrgGrpc.getUpdateUserCallerIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserCallerIdMethod = OrgGrpc.getUpdateUserCallerIdMethod) == null) {
          OrgGrpc.getUpdateUserCallerIdMethod = getUpdateUserCallerIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateUserCallerId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserCallerId"))
                  .build();
          }
        }
     }
     return getUpdateUserCallerIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse> getUpdateUserDisabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserDisabled",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse> getUpdateUserDisabledMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse> getUpdateUserDisabledMethod;
    if ((getUpdateUserDisabledMethod = OrgGrpc.getUpdateUserDisabledMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserDisabledMethod = OrgGrpc.getUpdateUserDisabledMethod) == null) {
          OrgGrpc.getUpdateUserDisabledMethod = getUpdateUserDisabledMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateUserDisabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserDisabled"))
                  .build();
          }
        }
     }
     return getUpdateUserDisabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse> getUpdateUserDisabledByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserDisabledByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse> getUpdateUserDisabledByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse> getUpdateUserDisabledByOrgIdMethod;
    if ((getUpdateUserDisabledByOrgIdMethod = OrgGrpc.getUpdateUserDisabledByOrgIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserDisabledByOrgIdMethod = OrgGrpc.getUpdateUserDisabledByOrgIdMethod) == null) {
          OrgGrpc.getUpdateUserDisabledByOrgIdMethod = getUpdateUserDisabledByOrgIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateUserDisabledByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserDisabledByOrgId"))
                  .build();
          }
        }
     }
     return getUpdateUserDisabledByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse> getGetMyUserPasswordResetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyUserPasswordResetLink",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse> getGetMyUserPasswordResetLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse> getGetMyUserPasswordResetLinkMethod;
    if ((getGetMyUserPasswordResetLinkMethod = OrgGrpc.getGetMyUserPasswordResetLinkMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetMyUserPasswordResetLinkMethod = OrgGrpc.getGetMyUserPasswordResetLinkMethod) == null) {
          OrgGrpc.getGetMyUserPasswordResetLinkMethod = getGetMyUserPasswordResetLinkMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetMyUserPasswordResetLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetMyUserPasswordResetLink"))
                  .build();
          }
        }
     }
     return getGetMyUserPasswordResetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse> getGetUserPasswordResetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPasswordResetLink",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse> getGetUserPasswordResetLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse> getGetUserPasswordResetLinkMethod;
    if ((getGetUserPasswordResetLinkMethod = OrgGrpc.getGetUserPasswordResetLinkMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserPasswordResetLinkMethod = OrgGrpc.getGetUserPasswordResetLinkMethod) == null) {
          OrgGrpc.getGetUserPasswordResetLinkMethod = getGetUserPasswordResetLinkMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserPasswordResetLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserPasswordResetLink"))
                  .build();
          }
        }
     }
     return getGetUserPasswordResetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse> getGetUserPasswordResetLinkByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPasswordResetLinkByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse> getGetUserPasswordResetLinkByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse> getGetUserPasswordResetLinkByOrgIdMethod;
    if ((getGetUserPasswordResetLinkByOrgIdMethod = OrgGrpc.getGetUserPasswordResetLinkByOrgIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserPasswordResetLinkByOrgIdMethod = OrgGrpc.getGetUserPasswordResetLinkByOrgIdMethod) == null) {
          OrgGrpc.getGetUserPasswordResetLinkByOrgIdMethod = getGetUserPasswordResetLinkByOrgIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserPasswordResetLinkByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserPasswordResetLinkByOrgId"))
                  .build();
          }
        }
     }
     return getGetUserPasswordResetLinkByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse> getGetUserLoginInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLoginInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse> getGetUserLoginInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse> getGetUserLoginInfoMethod;
    if ((getGetUserLoginInfoMethod = OrgGrpc.getGetUserLoginInfoMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserLoginInfoMethod = OrgGrpc.getGetUserLoginInfoMethod) == null) {
          OrgGrpc.getGetUserLoginInfoMethod = getGetUserLoginInfoMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserLoginInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserLoginInfo"))
                  .build();
          }
        }
     }
     return getGetUserLoginInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse> getGetUserEmailVerifiedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserEmailVerified",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse> getGetUserEmailVerifiedMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse> getGetUserEmailVerifiedMethod;
    if ((getGetUserEmailVerifiedMethod = OrgGrpc.getGetUserEmailVerifiedMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserEmailVerifiedMethod = OrgGrpc.getGetUserEmailVerifiedMethod) == null) {
          OrgGrpc.getGetUserEmailVerifiedMethod = getGetUserEmailVerifiedMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserEmailVerified"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserEmailVerified"))
                  .build();
          }
        }
     }
     return getGetUserEmailVerifiedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse> getGetUserEmailVerifiedByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserEmailVerifiedByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse> getGetUserEmailVerifiedByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse> getGetUserEmailVerifiedByOrgIdMethod;
    if ((getGetUserEmailVerifiedByOrgIdMethod = OrgGrpc.getGetUserEmailVerifiedByOrgIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserEmailVerifiedByOrgIdMethod = OrgGrpc.getGetUserEmailVerifiedByOrgIdMethod) == null) {
          OrgGrpc.getGetUserEmailVerifiedByOrgIdMethod = getGetUserEmailVerifiedByOrgIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserEmailVerifiedByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserEmailVerifiedByOrgId"))
                  .build();
          }
        }
     }
     return getGetUserEmailVerifiedByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse> getSendUserEmailVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendUserEmailVerification",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse> getSendUserEmailVerificationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest, com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse> getSendUserEmailVerificationMethod;
    if ((getSendUserEmailVerificationMethod = OrgGrpc.getSendUserEmailVerificationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getSendUserEmailVerificationMethod = OrgGrpc.getSendUserEmailVerificationMethod) == null) {
          OrgGrpc.getSendUserEmailVerificationMethod = getSendUserEmailVerificationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest, com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "SendUserEmailVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("SendUserEmailVerification"))
                  .build();
          }
        }
     }
     return getSendUserEmailVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse> getSendUserEmailVerificationByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendUserEmailVerificationByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse> getSendUserEmailVerificationByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse> getSendUserEmailVerificationByOrgIdMethod;
    if ((getSendUserEmailVerificationByOrgIdMethod = OrgGrpc.getSendUserEmailVerificationByOrgIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getSendUserEmailVerificationByOrgIdMethod = OrgGrpc.getSendUserEmailVerificationByOrgIdMethod) == null) {
          OrgGrpc.getSendUserEmailVerificationByOrgIdMethod = getSendUserEmailVerificationByOrgIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "SendUserEmailVerificationByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("SendUserEmailVerificationByOrgId"))
                  .build();
          }
        }
     }
     return getSendUserEmailVerificationByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse> getGetUserSessionDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSessionData",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse> getGetUserSessionDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse> getGetUserSessionDataMethod;
    if ((getGetUserSessionDataMethod = OrgGrpc.getGetUserSessionDataMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserSessionDataMethod = OrgGrpc.getGetUserSessionDataMethod) == null) {
          OrgGrpc.getGetUserSessionDataMethod = getGetUserSessionDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserSessionData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserSessionData"))
                  .build();
          }
        }
     }
     return getGetUserSessionDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse> getGetAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse> getGetAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse> getGetAgentProfileGroupMethod;
    if ((getGetAgentProfileGroupMethod = OrgGrpc.getGetAgentProfileGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAgentProfileGroupMethod = OrgGrpc.getGetAgentProfileGroupMethod) == null) {
          OrgGrpc.getGetAgentProfileGroupMethod = getGetAgentProfileGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAgentProfileGroup"))
                  .build();
          }
        }
     }
     return getGetAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse> getListAgentProfileGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentProfileGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse> getListAgentProfileGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse> getListAgentProfileGroupsMethod;
    if ((getListAgentProfileGroupsMethod = OrgGrpc.getListAgentProfileGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAgentProfileGroupsMethod = OrgGrpc.getListAgentProfileGroupsMethod) == null) {
          OrgGrpc.getListAgentProfileGroupsMethod = getListAgentProfileGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListAgentProfileGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAgentProfileGroups"))
                  .build();
          }
        }
     }
     return getListAgentProfileGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse> getUpdateAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse> getUpdateAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse> getUpdateAgentProfileGroupMethod;
    if ((getUpdateAgentProfileGroupMethod = OrgGrpc.getUpdateAgentProfileGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAgentProfileGroupMethod = OrgGrpc.getUpdateAgentProfileGroupMethod) == null) {
          OrgGrpc.getUpdateAgentProfileGroupMethod = getUpdateAgentProfileGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAgentProfileGroup"))
                  .build();
          }
        }
     }
     return getUpdateAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse> getCreateAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse> getCreateAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse> getCreateAgentProfileGroupMethod;
    if ((getCreateAgentProfileGroupMethod = OrgGrpc.getCreateAgentProfileGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateAgentProfileGroupMethod = OrgGrpc.getCreateAgentProfileGroupMethod) == null) {
          OrgGrpc.getCreateAgentProfileGroupMethod = getCreateAgentProfileGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreateAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateAgentProfileGroup"))
                  .build();
          }
        }
     }
     return getCreateAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse> getDeleteAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse> getDeleteAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse> getDeleteAgentProfileGroupMethod;
    if ((getDeleteAgentProfileGroupMethod = OrgGrpc.getDeleteAgentProfileGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteAgentProfileGroupMethod = OrgGrpc.getDeleteAgentProfileGroupMethod) == null) {
          OrgGrpc.getDeleteAgentProfileGroupMethod = getDeleteAgentProfileGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "DeleteAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteAgentProfileGroup"))
                  .build();
          }
        }
     }
     return getDeleteAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse> getAssignAgentProfileGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignAgentProfileGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse> getAssignAgentProfileGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse> getAssignAgentProfileGroupsMethod;
    if ((getAssignAgentProfileGroupsMethod = OrgGrpc.getAssignAgentProfileGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignAgentProfileGroupsMethod = OrgGrpc.getAssignAgentProfileGroupsMethod) == null) {
          OrgGrpc.getAssignAgentProfileGroupsMethod = getAssignAgentProfileGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AssignAgentProfileGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignAgentProfileGroups"))
                  .build();
          }
        }
     }
     return getAssignAgentProfileGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse> getAddUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserSubscription",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse> getAddUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse> getAddUserSubscriptionMethod;
    if ((getAddUserSubscriptionMethod = OrgGrpc.getAddUserSubscriptionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAddUserSubscriptionMethod = OrgGrpc.getAddUserSubscriptionMethod) == null) {
          OrgGrpc.getAddUserSubscriptionMethod = getAddUserSubscriptionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AddUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AddUserSubscription"))
                  .build();
          }
        }
     }
     return getAddUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse> getAddUserSubscriptionByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserSubscriptionByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse> getAddUserSubscriptionByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse> getAddUserSubscriptionByUserIdMethod;
    if ((getAddUserSubscriptionByUserIdMethod = OrgGrpc.getAddUserSubscriptionByUserIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAddUserSubscriptionByUserIdMethod = OrgGrpc.getAddUserSubscriptionByUserIdMethod) == null) {
          OrgGrpc.getAddUserSubscriptionByUserIdMethod = getAddUserSubscriptionByUserIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AddUserSubscriptionByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AddUserSubscriptionByUserId"))
                  .build();
          }
        }
     }
     return getAddUserSubscriptionByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse> getGetUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSubscription",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse> getGetUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse> getGetUserSubscriptionMethod;
    if ((getGetUserSubscriptionMethod = OrgGrpc.getGetUserSubscriptionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserSubscriptionMethod = OrgGrpc.getGetUserSubscriptionMethod) == null) {
          OrgGrpc.getGetUserSubscriptionMethod = getGetUserSubscriptionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserSubscription"))
                  .build();
          }
        }
     }
     return getGetUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse> getGetUserSubscriptionByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSubscriptionByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse> getGetUserSubscriptionByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse> getGetUserSubscriptionByUserIdMethod;
    if ((getGetUserSubscriptionByUserIdMethod = OrgGrpc.getGetUserSubscriptionByUserIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserSubscriptionByUserIdMethod = OrgGrpc.getGetUserSubscriptionByUserIdMethod) == null) {
          OrgGrpc.getGetUserSubscriptionByUserIdMethod = getGetUserSubscriptionByUserIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserSubscriptionByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserSubscriptionByUserId"))
                  .build();
          }
        }
     }
     return getGetUserSubscriptionByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse> getUpdateUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserSubscription",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse> getUpdateUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse> getUpdateUserSubscriptionMethod;
    if ((getUpdateUserSubscriptionMethod = OrgGrpc.getUpdateUserSubscriptionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserSubscriptionMethod = OrgGrpc.getUpdateUserSubscriptionMethod) == null) {
          OrgGrpc.getUpdateUserSubscriptionMethod = getUpdateUserSubscriptionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserSubscription"))
                  .build();
          }
        }
     }
     return getUpdateUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse> getUpdateUserSubscriptionByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserSubscriptionByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse> getUpdateUserSubscriptionByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse> getUpdateUserSubscriptionByUserIdMethod;
    if ((getUpdateUserSubscriptionByUserIdMethod = OrgGrpc.getUpdateUserSubscriptionByUserIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserSubscriptionByUserIdMethod = OrgGrpc.getUpdateUserSubscriptionByUserIdMethod) == null) {
          OrgGrpc.getUpdateUserSubscriptionByUserIdMethod = getUpdateUserSubscriptionByUserIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateUserSubscriptionByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserSubscriptionByUserId"))
                  .build();
          }
        }
     }
     return getUpdateUserSubscriptionByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserSubscription",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod;
    if ((getRemoveUserSubscriptionMethod = OrgGrpc.getRemoveUserSubscriptionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRemoveUserSubscriptionMethod = OrgGrpc.getRemoveUserSubscriptionMethod) == null) {
          OrgGrpc.getRemoveUserSubscriptionMethod = getRemoveUserSubscriptionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "RemoveUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RemoveUserSubscription"))
                  .build();
          }
        }
     }
     return getRemoveUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse> getRemoveUserSubscriptionByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserSubscriptionByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse> getRemoveUserSubscriptionByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse> getRemoveUserSubscriptionByUserIdMethod;
    if ((getRemoveUserSubscriptionByUserIdMethod = OrgGrpc.getRemoveUserSubscriptionByUserIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRemoveUserSubscriptionByUserIdMethod = OrgGrpc.getRemoveUserSubscriptionByUserIdMethod) == null) {
          OrgGrpc.getRemoveUserSubscriptionByUserIdMethod = getRemoveUserSubscriptionByUserIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "RemoveUserSubscriptionByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RemoveUserSubscriptionByUserId"))
                  .build();
          }
        }
     }
     return getRemoveUserSubscriptionByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserSubscriptions",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod;
    if ((getListUserSubscriptionsMethod = OrgGrpc.getListUserSubscriptionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListUserSubscriptionsMethod = OrgGrpc.getListUserSubscriptionsMethod) == null) {
          OrgGrpc.getListUserSubscriptionsMethod = getListUserSubscriptionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListUserSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListUserSubscriptions"))
                  .build();
          }
        }
     }
     return getListUserSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse> getListUserSubscriptionsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserSubscriptionsByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse> getListUserSubscriptionsByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse> getListUserSubscriptionsByUserIdMethod;
    if ((getListUserSubscriptionsByUserIdMethod = OrgGrpc.getListUserSubscriptionsByUserIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListUserSubscriptionsByUserIdMethod = OrgGrpc.getListUserSubscriptionsByUserIdMethod) == null) {
          OrgGrpc.getListUserSubscriptionsByUserIdMethod = getListUserSubscriptionsByUserIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListUserSubscriptionsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListUserSubscriptionsByUserId"))
                  .build();
          }
        }
     }
     return getListUserSubscriptionsByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse> getListOrgSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrgSubscriptions",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse> getListOrgSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse> getListOrgSubscriptionsMethod;
    if ((getListOrgSubscriptionsMethod = OrgGrpc.getListOrgSubscriptionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListOrgSubscriptionsMethod = OrgGrpc.getListOrgSubscriptionsMethod) == null) {
          OrgGrpc.getListOrgSubscriptionsMethod = getListOrgSubscriptionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListOrgSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListOrgSubscriptions"))
                  .build();
          }
        }
     }
     return getListOrgSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse> getGetHuntGroupSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHuntGroupSettings",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse> getGetHuntGroupSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse> getGetHuntGroupSettingsMethod;
    if ((getGetHuntGroupSettingsMethod = OrgGrpc.getGetHuntGroupSettingsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetHuntGroupSettingsMethod = OrgGrpc.getGetHuntGroupSettingsMethod) == null) {
          OrgGrpc.getGetHuntGroupSettingsMethod = getGetHuntGroupSettingsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetHuntGroupSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetHuntGroupSettings"))
                  .build();
          }
        }
     }
     return getGetHuntGroupSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse> getUpdateHuntGroupSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHuntGroupSettings",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse> getUpdateHuntGroupSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse> getUpdateHuntGroupSettingsMethod;
    if ((getUpdateHuntGroupSettingsMethod = OrgGrpc.getUpdateHuntGroupSettingsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateHuntGroupSettingsMethod = OrgGrpc.getUpdateHuntGroupSettingsMethod) == null) {
          OrgGrpc.getUpdateHuntGroupSettingsMethod = getUpdateHuntGroupSettingsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateHuntGroupSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateHuntGroupSettings"))
                  .build();
          }
        }
     }
     return getUpdateHuntGroupSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse> getListCallerIdBucketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCallerIdBuckets",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse> getListCallerIdBucketsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse> getListCallerIdBucketsMethod;
    if ((getListCallerIdBucketsMethod = OrgGrpc.getListCallerIdBucketsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListCallerIdBucketsMethod = OrgGrpc.getListCallerIdBucketsMethod) == null) {
          OrgGrpc.getListCallerIdBucketsMethod = getListCallerIdBucketsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListCallerIdBuckets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListCallerIdBuckets"))
                  .build();
          }
        }
     }
     return getListCallerIdBucketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse> getGetDataDipTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataDipTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse> getGetDataDipTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest, com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse> getGetDataDipTemplateMethod;
    if ((getGetDataDipTemplateMethod = OrgGrpc.getGetDataDipTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetDataDipTemplateMethod = OrgGrpc.getGetDataDipTemplateMethod) == null) {
          OrgGrpc.getGetDataDipTemplateMethod = getGetDataDipTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest, com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetDataDipTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetDataDipTemplate"))
                  .build();
          }
        }
     }
     return getGetDataDipTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse> getListDataDipTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataDipTemplates",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse> getListDataDipTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest, com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse> getListDataDipTemplatesMethod;
    if ((getListDataDipTemplatesMethod = OrgGrpc.getListDataDipTemplatesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListDataDipTemplatesMethod = OrgGrpc.getListDataDipTemplatesMethod) == null) {
          OrgGrpc.getListDataDipTemplatesMethod = getListDataDipTemplatesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest, com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListDataDipTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListDataDipTemplates"))
                  .build();
          }
        }
     }
     return getListDataDipTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse> getCreateDataDipTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataDipTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse> getCreateDataDipTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse> getCreateDataDipTemplateMethod;
    if ((getCreateDataDipTemplateMethod = OrgGrpc.getCreateDataDipTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateDataDipTemplateMethod = OrgGrpc.getCreateDataDipTemplateMethod) == null) {
          OrgGrpc.getCreateDataDipTemplateMethod = getCreateDataDipTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreateDataDipTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateDataDipTemplate"))
                  .build();
          }
        }
     }
     return getCreateDataDipTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse> getListAgentResponseAutoRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentResponseAutoRules",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse> getListAgentResponseAutoRulesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse> getListAgentResponseAutoRulesMethod;
    if ((getListAgentResponseAutoRulesMethod = OrgGrpc.getListAgentResponseAutoRulesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAgentResponseAutoRulesMethod = OrgGrpc.getListAgentResponseAutoRulesMethod) == null) {
          OrgGrpc.getListAgentResponseAutoRulesMethod = getListAgentResponseAutoRulesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListAgentResponseAutoRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAgentResponseAutoRules"))
                  .build();
          }
        }
     }
     return getListAgentResponseAutoRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse> getCreateAgentResponseAutoRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentResponseAutoRules",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse> getCreateAgentResponseAutoRulesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse> getCreateAgentResponseAutoRulesMethod;
    if ((getCreateAgentResponseAutoRulesMethod = OrgGrpc.getCreateAgentResponseAutoRulesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateAgentResponseAutoRulesMethod = OrgGrpc.getCreateAgentResponseAutoRulesMethod) == null) {
          OrgGrpc.getCreateAgentResponseAutoRulesMethod = getCreateAgentResponseAutoRulesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreateAgentResponseAutoRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateAgentResponseAutoRules"))
                  .build();
          }
        }
     }
     return getCreateAgentResponseAutoRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse> getUpdateAgentResponseAutoRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentResponseAutoRules",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse> getUpdateAgentResponseAutoRulesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse> getUpdateAgentResponseAutoRulesMethod;
    if ((getUpdateAgentResponseAutoRulesMethod = OrgGrpc.getUpdateAgentResponseAutoRulesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAgentResponseAutoRulesMethod = OrgGrpc.getUpdateAgentResponseAutoRulesMethod) == null) {
          OrgGrpc.getUpdateAgentResponseAutoRulesMethod = getUpdateAgentResponseAutoRulesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateAgentResponseAutoRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAgentResponseAutoRules"))
                  .build();
          }
        }
     }
     return getUpdateAgentResponseAutoRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse> getDeleteAgentResponseAutoRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentResponseAutoRules",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse> getDeleteAgentResponseAutoRulesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse> getDeleteAgentResponseAutoRulesMethod;
    if ((getDeleteAgentResponseAutoRulesMethod = OrgGrpc.getDeleteAgentResponseAutoRulesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteAgentResponseAutoRulesMethod = OrgGrpc.getDeleteAgentResponseAutoRulesMethod) == null) {
          OrgGrpc.getDeleteAgentResponseAutoRulesMethod = getDeleteAgentResponseAutoRulesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "DeleteAgentResponseAutoRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteAgentResponseAutoRules"))
                  .build();
          }
        }
     }
     return getDeleteAgentResponseAutoRulesMethod;
  }

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
    if ((getCreateTrustMethod = OrgGrpc.getCreateTrustMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateTrustMethod = OrgGrpc.getCreateTrustMethod) == null) {
          OrgGrpc.getCreateTrustMethod = getCreateTrustMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreateTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateTrust"))
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
    if ((getAcceptTrustMethod = OrgGrpc.getAcceptTrustMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAcceptTrustMethod = OrgGrpc.getAcceptTrustMethod) == null) {
          OrgGrpc.getAcceptTrustMethod = getAcceptTrustMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AcceptTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AcceptTrust"))
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
    if ((getRejectTrustMethod = OrgGrpc.getRejectTrustMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRejectTrustMethod = OrgGrpc.getRejectTrustMethod) == null) {
          OrgGrpc.getRejectTrustMethod = getRejectTrustMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "RejectTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RejectTrust"))
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
    if ((getGetTrustMethod = OrgGrpc.getGetTrustMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetTrustMethod = OrgGrpc.getGetTrustMethod) == null) {
          OrgGrpc.getGetTrustMethod = getGetTrustMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetTrust"))
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
    if ((getListIncomingTrustsMethod = OrgGrpc.getListIncomingTrustsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListIncomingTrustsMethod = OrgGrpc.getListIncomingTrustsMethod) == null) {
          OrgGrpc.getListIncomingTrustsMethod = getListIncomingTrustsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListIncomingTrusts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListIncomingTrusts"))
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
    if ((getListGivenTrustsMethod = OrgGrpc.getListGivenTrustsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListGivenTrustsMethod = OrgGrpc.getListGivenTrustsMethod) == null) {
          OrgGrpc.getListGivenTrustsMethod = getListGivenTrustsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListGivenTrusts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListGivenTrusts"))
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
    if ((getListAssignableTrustsMethod = OrgGrpc.getListAssignableTrustsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAssignableTrustsMethod = OrgGrpc.getListAssignableTrustsMethod) == null) {
          OrgGrpc.getListAssignableTrustsMethod = getListAssignableTrustsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListAssignableTrusts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAssignableTrusts"))
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
    if ((getDeleteTrustMethod = OrgGrpc.getDeleteTrustMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteTrustMethod = OrgGrpc.getDeleteTrustMethod) == null) {
          OrgGrpc.getDeleteTrustMethod = getDeleteTrustMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "DeleteTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteTrust"))
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
    if ((getAssignTrustMethod = OrgGrpc.getAssignTrustMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignTrustMethod = OrgGrpc.getAssignTrustMethod) == null) {
          OrgGrpc.getAssignTrustMethod = getAssignTrustMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AssignTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignTrust"))
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
    if ((getUnassignTrustMethod = OrgGrpc.getUnassignTrustMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUnassignTrustMethod = OrgGrpc.getUnassignTrustMethod) == null) {
          OrgGrpc.getUnassignTrustMethod = getUnassignTrustMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest, com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UnassignTrust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UnassignTrust"))
                  .build();
          }
        }
     }
     return getUnassignTrustMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse> getCreateLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse> getCreateLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse> getCreateLabelMethod;
    if ((getCreateLabelMethod = OrgGrpc.getCreateLabelMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateLabelMethod = OrgGrpc.getCreateLabelMethod) == null) {
          OrgGrpc.getCreateLabelMethod = getCreateLabelMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreateLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateLabel"))
                  .build();
          }
        }
     }
     return getCreateLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse> getDeleteLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse> getDeleteLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse> getDeleteLabelMethod;
    if ((getDeleteLabelMethod = OrgGrpc.getDeleteLabelMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteLabelMethod = OrgGrpc.getDeleteLabelMethod) == null) {
          OrgGrpc.getDeleteLabelMethod = getDeleteLabelMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "DeleteLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteLabel"))
                  .build();
          }
        }
     }
     return getDeleteLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse> getListLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLabels",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse> getListLabelsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse> getListLabelsMethod;
    if ((getListLabelsMethod = OrgGrpc.getListLabelsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListLabelsMethod = OrgGrpc.getListLabelsMethod) == null) {
          OrgGrpc.getListLabelsMethod = getListLabelsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListLabels"))
                  .build();
          }
        }
     }
     return getListLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse> getGetLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse> getGetLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse> getGetLabelMethod;
    if ((getGetLabelMethod = OrgGrpc.getGetLabelMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetLabelMethod = OrgGrpc.getGetLabelMethod) == null) {
          OrgGrpc.getGetLabelMethod = getGetLabelMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetLabel"))
                  .build();
          }
        }
     }
     return getGetLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse> getUpdateLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse> getUpdateLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse> getUpdateLabelMethod;
    if ((getUpdateLabelMethod = OrgGrpc.getUpdateLabelMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateLabelMethod = OrgGrpc.getUpdateLabelMethod) == null) {
          OrgGrpc.getUpdateLabelMethod = getUpdateLabelMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateLabel"))
                  .build();
          }
        }
     }
     return getUpdateLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse> getAssignLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse> getAssignLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse> getAssignLabelMethod;
    if ((getAssignLabelMethod = OrgGrpc.getAssignLabelMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignLabelMethod = OrgGrpc.getAssignLabelMethod) == null) {
          OrgGrpc.getAssignLabelMethod = getAssignLabelMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AssignLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignLabel"))
                  .build();
          }
        }
     }
     return getAssignLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse> getUnassignLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse> getUnassignLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse> getUnassignLabelMethod;
    if ((getUnassignLabelMethod = OrgGrpc.getUnassignLabelMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUnassignLabelMethod = OrgGrpc.getUnassignLabelMethod) == null) {
          OrgGrpc.getUnassignLabelMethod = getUnassignLabelMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UnassignLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UnassignLabel"))
                  .build();
          }
        }
     }
     return getUnassignLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse> getGetAssignmentCountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssignmentCounts",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse> getGetAssignmentCountsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse> getGetAssignmentCountsMethod;
    if ((getGetAssignmentCountsMethod = OrgGrpc.getGetAssignmentCountsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAssignmentCountsMethod = OrgGrpc.getGetAssignmentCountsMethod) == null) {
          OrgGrpc.getGetAssignmentCountsMethod = getGetAssignmentCountsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetAssignmentCounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAssignmentCounts"))
                  .build();
          }
        }
     }
     return getGetAssignmentCountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse> getGetAssignableLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssignableLabels",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse> getGetAssignableLabelsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse> getGetAssignableLabelsMethod;
    if ((getGetAssignableLabelsMethod = OrgGrpc.getGetAssignableLabelsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAssignableLabelsMethod = OrgGrpc.getGetAssignableLabelsMethod) == null) {
          OrgGrpc.getGetAssignableLabelsMethod = getGetAssignableLabelsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetAssignableLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAssignableLabels"))
                  .build();
          }
        }
     }
     return getGetAssignableLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse> getGetPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPermissions",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse> getGetPermissionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse> getGetPermissionsMethod;
    if ((getGetPermissionsMethod = OrgGrpc.getGetPermissionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetPermissionsMethod = OrgGrpc.getGetPermissionsMethod) == null) {
          OrgGrpc.getGetPermissionsMethod = getGetPermissionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetPermissions"))
                  .build();
          }
        }
     }
     return getGetPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse> getGetUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPermissions",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse> getGetUserPermissionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse> getGetUserPermissionsMethod;
    if ((getGetUserPermissionsMethod = OrgGrpc.getGetUserPermissionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserPermissionsMethod = OrgGrpc.getGetUserPermissionsMethod) == null) {
          OrgGrpc.getGetUserPermissionsMethod = getGetUserPermissionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest, com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetUserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserPermissions"))
                  .build();
          }
        }
     }
     return getGetUserPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse> getCreatePermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse> getCreatePermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse> getCreatePermissionGroupMethod;
    if ((getCreatePermissionGroupMethod = OrgGrpc.getCreatePermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreatePermissionGroupMethod = OrgGrpc.getCreatePermissionGroupMethod) == null) {
          OrgGrpc.getCreatePermissionGroupMethod = getCreatePermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreatePermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreatePermissionGroup"))
                  .build();
          }
        }
     }
     return getCreatePermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse> getUpdatePermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse> getUpdatePermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse> getUpdatePermissionGroupMethod;
    if ((getUpdatePermissionGroupMethod = OrgGrpc.getUpdatePermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdatePermissionGroupMethod = OrgGrpc.getUpdatePermissionGroupMethod) == null) {
          OrgGrpc.getUpdatePermissionGroupMethod = getUpdatePermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdatePermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdatePermissionGroup"))
                  .build();
          }
        }
     }
     return getUpdatePermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse> getDeletePermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse> getDeletePermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse> getDeletePermissionGroupMethod;
    if ((getDeletePermissionGroupMethod = OrgGrpc.getDeletePermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeletePermissionGroupMethod = OrgGrpc.getDeletePermissionGroupMethod) == null) {
          OrgGrpc.getDeletePermissionGroupMethod = getDeletePermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "DeletePermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeletePermissionGroup"))
                  .build();
          }
        }
     }
     return getDeletePermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse> getListPermissionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPermissionGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse> getListPermissionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse> getListPermissionGroupsMethod;
    if ((getListPermissionGroupsMethod = OrgGrpc.getListPermissionGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListPermissionGroupsMethod = OrgGrpc.getListPermissionGroupsMethod) == null) {
          OrgGrpc.getListPermissionGroupsMethod = getListPermissionGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListPermissionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListPermissionGroups"))
                  .build();
          }
        }
     }
     return getListPermissionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse> getListPermissionGroupsByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPermissionGroupsByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse> getListPermissionGroupsByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse> getListPermissionGroupsByOrgIdMethod;
    if ((getListPermissionGroupsByOrgIdMethod = OrgGrpc.getListPermissionGroupsByOrgIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListPermissionGroupsByOrgIdMethod = OrgGrpc.getListPermissionGroupsByOrgIdMethod) == null) {
          OrgGrpc.getListPermissionGroupsByOrgIdMethod = getListPermissionGroupsByOrgIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListPermissionGroupsByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListPermissionGroupsByOrgId"))
                  .build();
          }
        }
     }
     return getListPermissionGroupsByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse> getAssignUsersPermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignUsersPermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse> getAssignUsersPermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse> getAssignUsersPermissionGroupMethod;
    if ((getAssignUsersPermissionGroupMethod = OrgGrpc.getAssignUsersPermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignUsersPermissionGroupMethod = OrgGrpc.getAssignUsersPermissionGroupMethod) == null) {
          OrgGrpc.getAssignUsersPermissionGroupMethod = getAssignUsersPermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AssignUsersPermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignUsersPermissionGroup"))
                  .build();
          }
        }
     }
     return getAssignUsersPermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse> getRevokeUsersPermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeUsersPermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse> getRevokeUsersPermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse> getRevokeUsersPermissionGroupMethod;
    if ((getRevokeUsersPermissionGroupMethod = OrgGrpc.getRevokeUsersPermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRevokeUsersPermissionGroupMethod = OrgGrpc.getRevokeUsersPermissionGroupMethod) == null) {
          OrgGrpc.getRevokeUsersPermissionGroupMethod = getRevokeUsersPermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "RevokeUsersPermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RevokeUsersPermissionGroup"))
                  .build();
          }
        }
     }
     return getRevokeUsersPermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse> getAssignAccountOwnerPermissionToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignAccountOwnerPermissionToUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse> getAssignAccountOwnerPermissionToUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse> getAssignAccountOwnerPermissionToUserMethod;
    if ((getAssignAccountOwnerPermissionToUserMethod = OrgGrpc.getAssignAccountOwnerPermissionToUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignAccountOwnerPermissionToUserMethod = OrgGrpc.getAssignAccountOwnerPermissionToUserMethod) == null) {
          OrgGrpc.getAssignAccountOwnerPermissionToUserMethod = getAssignAccountOwnerPermissionToUserMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AssignAccountOwnerPermissionToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignAccountOwnerPermissionToUser"))
                  .build();
          }
        }
     }
     return getAssignAccountOwnerPermissionToUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse> getRevokeAccountOwnerPermissionFromUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeAccountOwnerPermissionFromUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse> getRevokeAccountOwnerPermissionFromUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest, com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse> getRevokeAccountOwnerPermissionFromUserMethod;
    if ((getRevokeAccountOwnerPermissionFromUserMethod = OrgGrpc.getRevokeAccountOwnerPermissionFromUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRevokeAccountOwnerPermissionFromUserMethod = OrgGrpc.getRevokeAccountOwnerPermissionFromUserMethod) == null) {
          OrgGrpc.getRevokeAccountOwnerPermissionFromUserMethod = getRevokeAccountOwnerPermissionFromUserMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest, com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "RevokeAccountOwnerPermissionFromUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RevokeAccountOwnerPermissionFromUser"))
                  .build();
          }
        }
     }
     return getRevokeAccountOwnerPermissionFromUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse> getInitDefaultPermissionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitDefaultPermissionGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse> getInitDefaultPermissionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse> getInitDefaultPermissionGroupsMethod;
    if ((getInitDefaultPermissionGroupsMethod = OrgGrpc.getInitDefaultPermissionGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getInitDefaultPermissionGroupsMethod = OrgGrpc.getInitDefaultPermissionGroupsMethod) == null) {
          OrgGrpc.getInitDefaultPermissionGroupsMethod = getInitDefaultPermissionGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "InitDefaultPermissionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("InitDefaultPermissionGroups"))
                  .build();
          }
        }
     }
     return getInitDefaultPermissionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse> getGetAccountOwnerGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountOwnerGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse> getGetAccountOwnerGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse> getGetAccountOwnerGroupMethod;
    if ((getGetAccountOwnerGroupMethod = OrgGrpc.getGetAccountOwnerGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAccountOwnerGroupMethod = OrgGrpc.getGetAccountOwnerGroupMethod) == null) {
          OrgGrpc.getGetAccountOwnerGroupMethod = getGetAccountOwnerGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetAccountOwnerGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAccountOwnerGroup"))
                  .build();
          }
        }
     }
     return getGetAccountOwnerGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse> getGetLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLicenses",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse> getGetLicensesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse> getGetLicensesMethod;
    if ((getGetLicensesMethod = OrgGrpc.getGetLicensesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetLicensesMethod = OrgGrpc.getGetLicensesMethod) == null) {
          OrgGrpc.getGetLicensesMethod = getGetLicensesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetLicenses"))
                  .build();
          }
        }
     }
     return getGetLicensesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse> getGetOrgLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrgLicenses",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse> getGetOrgLicensesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse> getGetOrgLicensesMethod;
    if ((getGetOrgLicensesMethod = OrgGrpc.getGetOrgLicensesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetOrgLicensesMethod = OrgGrpc.getGetOrgLicensesMethod) == null) {
          OrgGrpc.getGetOrgLicensesMethod = getGetOrgLicensesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "GetOrgLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetOrgLicenses"))
                  .build();
          }
        }
     }
     return getGetOrgLicensesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse> getUpdateLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLicenses",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse> getUpdateLicensesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse> getUpdateLicensesMethod;
    if ((getUpdateLicensesMethod = OrgGrpc.getUpdateLicensesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateLicensesMethod = OrgGrpc.getUpdateLicensesMethod) == null) {
          OrgGrpc.getUpdateLicensesMethod = getUpdateLicensesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateLicenses"))
                  .build();
          }
        }
     }
     return getUpdateLicensesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse> getRemovePermissionFromAllPermissionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePermissionFromAllPermissionGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse> getRemovePermissionFromAllPermissionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse> getRemovePermissionFromAllPermissionGroupsMethod;
    if ((getRemovePermissionFromAllPermissionGroupsMethod = OrgGrpc.getRemovePermissionFromAllPermissionGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRemovePermissionFromAllPermissionGroupsMethod = OrgGrpc.getRemovePermissionFromAllPermissionGroupsMethod) == null) {
          OrgGrpc.getRemovePermissionFromAllPermissionGroupsMethod = getRemovePermissionFromAllPermissionGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "RemovePermissionFromAllPermissionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RemovePermissionFromAllPermissionGroups"))
                  .build();
          }
        }
     }
     return getRemovePermissionFromAllPermissionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> getListP3PermissionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListP3PermissionGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> getListP3PermissionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> getListP3PermissionGroupsMethod;
    if ((getListP3PermissionGroupsMethod = OrgGrpc.getListP3PermissionGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListP3PermissionGroupsMethod = OrgGrpc.getListP3PermissionGroupsMethod) == null) {
          OrgGrpc.getListP3PermissionGroupsMethod = getListP3PermissionGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListP3PermissionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListP3PermissionGroups"))
                  .build();
          }
        }
     }
     return getListP3PermissionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> getListP3PermissionGroupsByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListP3PermissionGroupsByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> getListP3PermissionGroupsByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> getListP3PermissionGroupsByOrgIdMethod;
    if ((getListP3PermissionGroupsByOrgIdMethod = OrgGrpc.getListP3PermissionGroupsByOrgIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListP3PermissionGroupsByOrgIdMethod = OrgGrpc.getListP3PermissionGroupsByOrgIdMethod) == null) {
          OrgGrpc.getListP3PermissionGroupsByOrgIdMethod = getListP3PermissionGroupsByOrgIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "ListP3PermissionGroupsByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListP3PermissionGroupsByOrgId"))
                  .build();
          }
        }
     }
     return getListP3PermissionGroupsByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse> getCreateP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse> getCreateP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse> getCreateP3PermissionGroupMethod;
    if ((getCreateP3PermissionGroupMethod = OrgGrpc.getCreateP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateP3PermissionGroupMethod = OrgGrpc.getCreateP3PermissionGroupMethod) == null) {
          OrgGrpc.getCreateP3PermissionGroupMethod = getCreateP3PermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "CreateP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateP3PermissionGroup"))
                  .build();
          }
        }
     }
     return getCreateP3PermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse> getUpdateP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse> getUpdateP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse> getUpdateP3PermissionGroupMethod;
    if ((getUpdateP3PermissionGroupMethod = OrgGrpc.getUpdateP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateP3PermissionGroupMethod = OrgGrpc.getUpdateP3PermissionGroupMethod) == null) {
          OrgGrpc.getUpdateP3PermissionGroupMethod = getUpdateP3PermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateP3PermissionGroup"))
                  .build();
          }
        }
     }
     return getUpdateP3PermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse> getUpdateP3PermissionGroupByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateP3PermissionGroupByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse> getUpdateP3PermissionGroupByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse> getUpdateP3PermissionGroupByOrgIdMethod;
    if ((getUpdateP3PermissionGroupByOrgIdMethod = OrgGrpc.getUpdateP3PermissionGroupByOrgIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateP3PermissionGroupByOrgIdMethod = OrgGrpc.getUpdateP3PermissionGroupByOrgIdMethod) == null) {
          OrgGrpc.getUpdateP3PermissionGroupByOrgIdMethod = getUpdateP3PermissionGroupByOrgIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "UpdateP3PermissionGroupByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateP3PermissionGroupByOrgId"))
                  .build();
          }
        }
     }
     return getUpdateP3PermissionGroupByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse> getDeleteP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse> getDeleteP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse> getDeleteP3PermissionGroupMethod;
    if ((getDeleteP3PermissionGroupMethod = OrgGrpc.getDeleteP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteP3PermissionGroupMethod = OrgGrpc.getDeleteP3PermissionGroupMethod) == null) {
          OrgGrpc.getDeleteP3PermissionGroupMethod = getDeleteP3PermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "DeleteP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteP3PermissionGroup"))
                  .build();
          }
        }
     }
     return getDeleteP3PermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse> getAssignUsersP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignUsersP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse> getAssignUsersP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse> getAssignUsersP3PermissionGroupMethod;
    if ((getAssignUsersP3PermissionGroupMethod = OrgGrpc.getAssignUsersP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignUsersP3PermissionGroupMethod = OrgGrpc.getAssignUsersP3PermissionGroupMethod) == null) {
          OrgGrpc.getAssignUsersP3PermissionGroupMethod = getAssignUsersP3PermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "AssignUsersP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignUsersP3PermissionGroup"))
                  .build();
          }
        }
     }
     return getAssignUsersP3PermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse> getRevokeUsersP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeUsersP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse> getRevokeUsersP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse> getRevokeUsersP3PermissionGroupMethod;
    if ((getRevokeUsersP3PermissionGroupMethod = OrgGrpc.getRevokeUsersP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRevokeUsersP3PermissionGroupMethod = OrgGrpc.getRevokeUsersP3PermissionGroupMethod) == null) {
          OrgGrpc.getRevokeUsersP3PermissionGroupMethod = getRevokeUsersP3PermissionGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.Org", "RevokeUsersP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RevokeUsersP3PermissionGroup"))
                  .build();
          }
        }
     }
     return getRevokeUsersP3PermissionGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrgStub newStub(io.grpc.Channel channel) {
    return new OrgStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrgBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrgFutureStub(channel);
  }

  /**
   * <pre>
   * ORGANIZATION
   * </pre>
   */
  public static abstract class OrgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateOrganization creates a new organization entity and enables it for the
     * region it is getting created in.
     * </pre>
     */
    public void createOrganization(com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOrganization returns a single organization.
     * </pre>
     */
    public void getOrganization(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOrganizationById returns a single organization by a given orgId.
     * </pre>
     */
    public void getOrganizationById(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrganizationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganization updates the mutable fields on the Organization entity
     * using the provided field mask.
     * </pre>
     */
    public void updateOrganization(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public void archiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getArchiveOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unarchives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public void unArchiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnArchiveOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAllOrganizationsGlobally lists all organizations globally (archived and unarchived).
     * </pre>
     */
    public void listAllOrganizationsGlobally(com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAllOrganizationsGloballyMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListOrganizationsByRegion lists organizations in the given region (unarchived).
     * </pre>
     */
    public void listOrganizationsByRegion(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOrganizationsByRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListArchivedOrganizations lists all archived organizations in the current region.
     * </pre>
     */
    public void listArchivedOrganizations(com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListArchivedOrganizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConvertOrgToManual converts an organization to manual only by org id.
     * </pre>
     */
    public void convertOrgToManual(com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertOrgToManualMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all orgs under the p3 hierarchy
     * </pre>
     */
    public void listOwnedOrgs(com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOwnedOrgsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public void getOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrganizationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public void updateOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOrganizationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgentPreferences returns preferences controlling direct agent properties.
     * </pre>
     */
    public void getAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates preferences controlling direct agent
     * properties.
     * </pre>
     */
    public void updateAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAgentPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetContactPreferences returns preferences for contact lists.
     * </pre>
     */
    public void getContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContactPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateContactPreferences updates preferences for contact lists.
     * </pre>
     */
    public void updateContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateContactPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns preferences for controlling the
     * </pre>
     */
    public void getAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthenticationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates preferences for controlling the
     * </pre>
     */
    public void updateAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAuthenticationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns preferences for web-hook push URLs.
     * </pre>
     */
    public void getWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWebhookPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates preferences for web-hook push URLs.
     * </pre>
     */
    public void updateWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateWebhookPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns preferences for agent dashboard
     * controls.
     * </pre>
     */
    public void getDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDashboardGeneralPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates preferences for agent dashboard
     * controls.
     * </pre>
     */
    public void updateDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDashboardGeneralPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns preferences for controlling agent queue
     * and hold table settings.
     * </pre>
     */
    public void getDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDashboardQueuePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates preferences for controlling agent
     * queue and hold table settings.
     * </pre>
     */
    public void updateDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDashboardQueuePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPhonePreferences returns preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public void getPhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPhonePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public void updatePhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePhonePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCompliancePreferences returns preferences for natural language compliance
     * campaign settings.
     * </pre>
     */
    public void getCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCompliancePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCompliancePreferences updates preferences for natural language
     * compliance campaign settings.
     * </pre>
     */
    public void updateCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCompliancePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public void getBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBroadcastPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public void updateBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBroadcastPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns preferences for editing campaign scheduling
     * properties.
     * </pre>
     */
    public void getSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSchedulePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences updates preferences for editing campaign
     * scheduling properties.
     * </pre>
     */
    public void updateSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSchedulePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns preferences for email and SMS management.
     * </pre>
     */
    public void getEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmailSmsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEmailSmsPreferences updates preferences for email and SMS management.
     * </pre>
     */
    public void updateEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEmailSmsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns preferences for business intelligence.
     * </pre>
     */
    public void getBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBusinessPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public void updateBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBusinessPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns preferences for scorecards.
     * </pre>
     */
    public void getScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScorecardsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateScorecardsPreferences updates preferences for scorecards.
     * </pre>
     */
    public void updateScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateScorecardsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns preferences for voice analytics.
     * </pre>
     */
    public void getVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVoiceAnalyticsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListVoiceAnalyticsPreferences lists preferences for voice analytics.
     * </pre>
     */
    public void listVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVoiceAnalyticsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateVoiceAnalyticsPreferences updates preferences for voice analytics.
     * </pre>
     */
    public void updateVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVoiceAnalyticsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns preferences for automated report jobs
     * </pre>
     */
    public void getEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEndOfDayPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences updates preferences for automated report jobs
     * </pre>
     */
    public void updateEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEndOfDayPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for filters in reports and
     * </pre>
     */
    public void getReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReportFilterPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for filters in reports and
     * </pre>
     */
    public void updateReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReportFilterPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns preferences for audio recording properties.
     * </pre>
     */
    public void getRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRecordingPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates preferences for audio recording
     * properties.
     * </pre>
     */
    public void updateRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRecordingPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAdminClientPreferences returns preferences for essential organization
     * properties only to be used by account managers and customer support.
     * </pre>
     */
    public void getAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdminClientPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAdminClientPreferences updates preferences for essential organization
     * </pre>
     */
    public void updateAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAdminClientPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcceptLinkbackRecordingTerms insert a digital signature acceptance activity
     * log upon client acknowledgement of terms and conditions usage for linkback
     * recorded calls.
     * </pre>
     */
    public void acceptLinkbackRecordingTerms(com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAcceptLinkbackRecordingTermsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template options action
     * parameters to reflect the linkback recording usage value.
     * </pre>
     */
    public void linkbackUpdateBroadcastTemplates(com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLinkbackUpdateBroadcastTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement insert an activity log upon client
     * acknowledgement of responsibility for their own email unsubscribe links.
     * </pre>
     */
    public void recordEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecordEmailUnsubscribeAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement insert an activity log upon the client
     * revoking their responsibility for email unsubscribe links.
     * </pre>
     */
    public void clearEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearEmailUnsubscribeAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateUser creates a new user and enables it for the region it is getting created in.
     * </pre>
     */
    public void createUser(com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateDelegatedUser creates a new delegated user and enables it for the region it is getting created in.
     * </pre>
     */
    public void createDelegatedUser(com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDelegatedUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMyUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public void getMyUser(com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMyUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public void getUser(com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserByOrgId returns a single user by UserId and OrgId
     * Requires Customer Support permission and allows cross Org requests.
     * </pre>
     */
    public void getUserByOrgId(com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgents returns a list of Agents.
     * </pre>
     */
    public void listAgents(com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    public void listUsers(com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListUsersByOrgId returns a list of users.
     * </pre>
     */
    public void listUsersByOrgId(com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUsersByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListUsersByRegion returns a list of usersByRegion.
     * </pre>
     */
    public void listUsersByRegion(com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUsersByRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMyUser updates a user.
     * </pre>
     */
    public void updateMyUser(com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMyUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public void updateUser(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserLabels updates a user's labels to be the passed in set of labels.
     * </pre>
     */
    public void updateUserLabels(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserCallerId updates a user.
     * </pre>
     */
    public void updateUserCallerId(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserCallerIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates whether a user is disabled.
     * </pre>
     */
    public void updateUserDisabled(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserDisabledMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabledByOrgId updates a user is disabled.
     * </pre>
     */
    public void updateUserDisabledByOrgId(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserDisabledByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMyUserPasswordResetLink updates a user's password.
     * </pre>
     */
    public void getMyUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMyUserPasswordResetLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserPasswordResetLink gets a link to update a user's password.
     * </pre>
     */
    public void getUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserPasswordResetLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserPasswordResetLinkByOrgId gets a link to update a user's password.
     * </pre>
     */
    public void getUserPasswordResetLinkByOrgId(com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserPasswordResetLinkByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used to be called GetUserBlocked
     * GetUserLoginInfo gets information about a user's login.
     * </pre>
     */
    public void getUserLoginInfo(com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserLoginInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserEmailVerified gets whether the user's email is verified.
     * </pre>
     */
    public void getUserEmailVerified(com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserEmailVerifiedMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserEmailVerifiedByOrgId gets whether the user's email is verified.
     * </pre>
     */
    public void getUserEmailVerifiedByOrgId(com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserEmailVerifiedByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendUserEmailVerification sends a verification email to the user.
     * </pre>
     */
    public void sendUserEmailVerification(com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendUserEmailVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendUserEmailVerificationByOrgId sends a verification email to the user.
     * </pre>
     */
    public void sendUserEmailVerificationByOrgId(com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendUserEmailVerificationByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserSessionData returns data for the front end's session state
     * </pre>
     */
    public void getUserSessionData(com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserSessionDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgentProfileGroup returns an agent profile group by id
     * </pre>
     */
    public void getAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgentProfileGroups returns the agent profile groups associated with the current organization
     * </pre>
     */
    public void listAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentProfileGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * </pre>
     */
    public void updateAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * </pre>
     */
    public void createAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes an AgentProfileGroup. Can only delete if user is in same org as AgentProfileGroup
     * </pre>
     */
    public void deleteAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups assigns a list of users to an AgentProfileGroup. Can only use if everything is in the same organization.
     * </pre>
     */
    public void assignAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignAgentProfileGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new user subscription.
     * </pre>
     */
    public void addUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new user subscription for a specified user with in requested users org.
     * </pre>
     */
    public void addUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserSubscriptionByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription.
     * </pre>
     */
    public void getUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription for a specified user with in requested users org.
     * </pre>
     */
    public void getUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserSubscriptionByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription for the current user
     * </pre>
     */
    public void updateUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription for a given user id
     * </pre>
     */
    public void updateUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserSubscriptionByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove a user subscription.
     * </pre>
     */
    public void removeUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove a user subscription by a given user id
     * </pre>
     */
    public void removeUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserSubscriptionByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public void listUserSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUserSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public void listUserSubscriptionsByUserId(com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUserSubscriptionsByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists subscriptions for multiple users in an org.
     * </pre>
     */
    public void listOrgSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOrgSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetHuntGroupSettings returns the field masked hunt group settings for the
     * provided hunt group.
     * </pre>
     */
    public void getHuntGroupSettings(com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHuntGroupSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupSettings updates the selected/masked hunt group settings
     * for the given hunt group.
     * </pre>
     */
    public void updateHuntGroupSettings(com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateHuntGroupSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists caller id numbers with their associated region codes for the given
     * bucket.
     * </pre>
     */
    public void listCallerIdBuckets(com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCallerIdBucketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a single data dip template.
     * </pre>
     */
    public void getDataDipTemplate(com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDataDipTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists data dip templates, optionally filtered by config type.
     * </pre>
     */
    public void listDataDipTemplates(com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDataDipTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Saves a new data dip template.
     * </pre>
     */
    public void createDataDipTemplate(com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDataDipTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists Agent Call Response Automatically added compliance rules for an Org.
     * </pre>
     */
    public void listAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentResponseAutoRulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public void createAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAgentResponseAutoRulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public void updateAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAgentResponseAutoRulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public void deleteAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAgentResponseAutoRulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateTrust creates a new trust.
     * </pre>
     */
    public void createTrust(com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcceptTrust accepts an incoming trust.
     * </pre>
     */
    public void acceptTrust(com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAcceptTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * RejectTrust rejects an incoming trust.
     * </pre>
     */
    public void rejectTrust(com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRejectTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTrust returns a single trust by trust id.
     * </pre>
     */
    public void getTrust(com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListIncomingTrusts returns all pending trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public void listIncomingTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListIncomingTrustsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListGivenTrustsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAssignableTrusts returns all accepted trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public void listAssignableTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAssignableTrustsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteTrust deletes a trust by trust id. Only trusts where the current
     * org is the grantor can be deleted by this endpoint.
     * </pre>
     */
    public void deleteTrust(com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignTrust assigns a trust to the given user ids.
     * </pre>
     */
    public void assignTrust(com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnassignTrust unassigns a trust from the given user id.
     * </pre>
     */
    public void unassignTrust(com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnassignTrustMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateLabel creates a label with the given properties.
     * </pre>
     */
    public void createLabel(com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteLabel deletes a label with the id given on the request.
     * </pre>
     */
    public void deleteLabel(com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListLabels returns all unique label names belonging to the given org id.
     * </pre>
     */
    public void listLabels(com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLabel returns a single label with the given ID.
     * </pre>
     */
    public void getLabel(com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLabel updates the given label.
     * </pre>
     */
    public void updateLabel(com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assignlabel creates label assignments defined by the request.
     * </pre>
     */
    public void assignLabel(com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unassignlabel removes label assignments defined by the request.
     * </pre>
     */
    public void unassignLabel(com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnassignLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAssignmentCounts returns the total amount of label assignments
     * per entity type.
     * </pre>
     */
    public void getAssignmentCounts(com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssignmentCountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAssignableLabels returns a list of labels available to the current user.
     * </pre>
     */
    public void getAssignableLabels(com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssignableLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPermissions returns the permissions for a given user along with other user information.
     * </pre>
     */
    public void getPermissions(com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserPermissions returns the permissions for a given user.
     * </pre>
     */
    public void getUserPermissions(com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new permission group.
     * </pre>
     */
    public void createPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdatePermissionGroup updates the permission group with the given id.
     * </pre>
     */
    public void updatePermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeletePermissionGroup deletes the permission group with the given id.
     * </pre>
     */
    public void deletePermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListPermissionGroups returns a list of permissions for an organization.
     * </pre>
     */
    public void listPermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPermissionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListPermissionGroupsByOrgId returns a list of permissions for an
     * organization.
     * </pre>
     */
    public void listPermissionGroupsByOrgId(com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPermissionGroupsByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignUsersPermissionGroup returns a user a permission group.
     * </pre>
     */
    public void assignUsersPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignUsersPermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeUsersPermissionGroup returns a user a permission group.
     * </pre>
     */
    public void revokeUsersPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeUsersPermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignAccountOwnerPermissionToUser returns a user a permission group.
     * </pre>
     */
    public void assignAccountOwnerPermissionToUser(com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignAccountOwnerPermissionToUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeAccountOwnerPermissionFromUser returns a user a permission group.
     * </pre>
     */
    public void revokeAccountOwnerPermissionFromUser(com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeAccountOwnerPermissionFromUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initializes the default read only permissions group for the
     * given organization.
     * </pre>
     */
    public void initDefaultPermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitDefaultPermissionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAccountOwnerGroup returns the account owner permission group
     * for an organization.
     * </pre>
     */
    public void getAccountOwnerGroup(com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountOwnerGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLicenses returns the licenses an organitzation is assigned.
     * </pre>
     */
    public void getLicenses(com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLicensesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOrgLicenses returns the licenses assigned to the organization
     * of the user who makes the request.
     * </pre>
     */
    public void getOrgLicenses(com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrgLicensesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLicenses updates an organization's licenses.
     * </pre>
     */
    public void updateLicenses(com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLicensesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemovePermissionFromAllPermissionGroups removes a permission from
     * all permission groups in an organization.
     * </pre>
     */
    public void removePermissionFromAllPermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemovePermissionFromAllPermissionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListP3PermissionGroups returns the list of p3 permission groups
     * for the user's org.
     * </pre>
     */
    public void listP3PermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListP3PermissionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListP3PermissionGroupsByOrgId returns the list of p3 permission groups
     * for an org by id.
     * </pre>
     */
    public void listP3PermissionGroupsByOrgId(com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListP3PermissionGroupsByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateP3PermissionGroup creates a new p3 permission group.
     * </pre>
     */
    public void createP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateP3PermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateP3PermissionGroup updates an existing p3 permission group.
     * Requires PERMISSION_GROUP_EDIT.
     * </pre>
     */
    public void updateP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateP3PermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateP3PermissionGroup updates an existing p3 permission group.
     * CUSTOMER_SUPPORT required for passing in an org id.
     * </pre>
     */
    public void updateP3PermissionGroupByOrgId(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateP3PermissionGroupByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteP3PermissionGroup deletes a p3 permission group.
     * </pre>
     */
    public void deleteP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteP3PermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignUsersP3PermissionGroup assigns a p3 permission group
     * to a list of users.
     * </pre>
     */
    public void assignUsersP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignUsersP3PermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeUsersP3PermissionGroup revokes a p3 permission group
     * from a list of users.
     * </pre>
     */
    public void revokeUsersP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeUsersP3PermissionGroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse>(
                  this, METHODID_CREATE_ORGANIZATION)))
          .addMethod(
            getGetOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse>(
                  this, METHODID_GET_ORGANIZATION)))
          .addMethod(
            getGetOrganizationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse>(
                  this, METHODID_GET_ORGANIZATION_BY_ID)))
          .addMethod(
            getUpdateOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse>(
                  this, METHODID_UPDATE_ORGANIZATION)))
          .addMethod(
            getArchiveOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse>(
                  this, METHODID_ARCHIVE_ORGANIZATION)))
          .addMethod(
            getUnArchiveOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse>(
                  this, METHODID_UN_ARCHIVE_ORGANIZATION)))
          .addMethod(
            getListAllOrganizationsGloballyMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse>(
                  this, METHODID_LIST_ALL_ORGANIZATIONS_GLOBALLY)))
          .addMethod(
            getListOrganizationsByRegionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse>(
                  this, METHODID_LIST_ORGANIZATIONS_BY_REGION)))
          .addMethod(
            getListArchivedOrganizationsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse>(
                  this, METHODID_LIST_ARCHIVED_ORGANIZATIONS)))
          .addMethod(
            getConvertOrgToManualMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse>(
                  this, METHODID_CONVERT_ORG_TO_MANUAL)))
          .addMethod(
            getListOwnedOrgsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse>(
                  this, METHODID_LIST_OWNED_ORGS)))
          .addMethod(
            getGetOrganizationPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse>(
                  this, METHODID_GET_ORGANIZATION_PREFERENCES)))
          .addMethod(
            getUpdateOrganizationPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse>(
                  this, METHODID_UPDATE_ORGANIZATION_PREFERENCES)))
          .addMethod(
            getGetAgentPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse>(
                  this, METHODID_GET_AGENT_PREFERENCES)))
          .addMethod(
            getUpdateAgentPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse>(
                  this, METHODID_UPDATE_AGENT_PREFERENCES)))
          .addMethod(
            getGetContactPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse>(
                  this, METHODID_GET_CONTACT_PREFERENCES)))
          .addMethod(
            getUpdateContactPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse>(
                  this, METHODID_UPDATE_CONTACT_PREFERENCES)))
          .addMethod(
            getGetAuthenticationPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse>(
                  this, METHODID_GET_AUTHENTICATION_PREFERENCES)))
          .addMethod(
            getUpdateAuthenticationPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse>(
                  this, METHODID_UPDATE_AUTHENTICATION_PREFERENCES)))
          .addMethod(
            getGetWebhookPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse>(
                  this, METHODID_GET_WEBHOOK_PREFERENCES)))
          .addMethod(
            getUpdateWebhookPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse>(
                  this, METHODID_UPDATE_WEBHOOK_PREFERENCES)))
          .addMethod(
            getGetDashboardGeneralPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse>(
                  this, METHODID_GET_DASHBOARD_GENERAL_PREFERENCES)))
          .addMethod(
            getUpdateDashboardGeneralPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse>(
                  this, METHODID_UPDATE_DASHBOARD_GENERAL_PREFERENCES)))
          .addMethod(
            getGetDashboardQueuePreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse>(
                  this, METHODID_GET_DASHBOARD_QUEUE_PREFERENCES)))
          .addMethod(
            getUpdateDashboardQueuePreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse>(
                  this, METHODID_UPDATE_DASHBOARD_QUEUE_PREFERENCES)))
          .addMethod(
            getGetPhonePreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse>(
                  this, METHODID_GET_PHONE_PREFERENCES)))
          .addMethod(
            getUpdatePhonePreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse>(
                  this, METHODID_UPDATE_PHONE_PREFERENCES)))
          .addMethod(
            getGetCompliancePreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse>(
                  this, METHODID_GET_COMPLIANCE_PREFERENCES)))
          .addMethod(
            getUpdateCompliancePreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse>(
                  this, METHODID_UPDATE_COMPLIANCE_PREFERENCES)))
          .addMethod(
            getGetBroadcastPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse>(
                  this, METHODID_GET_BROADCAST_PREFERENCES)))
          .addMethod(
            getUpdateBroadcastPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse>(
                  this, METHODID_UPDATE_BROADCAST_PREFERENCES)))
          .addMethod(
            getGetSchedulePreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse>(
                  this, METHODID_GET_SCHEDULE_PREFERENCES)))
          .addMethod(
            getUpdateSchedulePreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse>(
                  this, METHODID_UPDATE_SCHEDULE_PREFERENCES)))
          .addMethod(
            getGetEmailSmsPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse>(
                  this, METHODID_GET_EMAIL_SMS_PREFERENCES)))
          .addMethod(
            getUpdateEmailSmsPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse>(
                  this, METHODID_UPDATE_EMAIL_SMS_PREFERENCES)))
          .addMethod(
            getGetBusinessPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse>(
                  this, METHODID_GET_BUSINESS_PREFERENCES)))
          .addMethod(
            getUpdateBusinessPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse>(
                  this, METHODID_UPDATE_BUSINESS_PREFERENCES)))
          .addMethod(
            getGetScorecardsPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse>(
                  this, METHODID_GET_SCORECARDS_PREFERENCES)))
          .addMethod(
            getUpdateScorecardsPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse>(
                  this, METHODID_UPDATE_SCORECARDS_PREFERENCES)))
          .addMethod(
            getGetVoiceAnalyticsPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse>(
                  this, METHODID_GET_VOICE_ANALYTICS_PREFERENCES)))
          .addMethod(
            getListVoiceAnalyticsPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse>(
                  this, METHODID_LIST_VOICE_ANALYTICS_PREFERENCES)))
          .addMethod(
            getUpdateVoiceAnalyticsPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse>(
                  this, METHODID_UPDATE_VOICE_ANALYTICS_PREFERENCES)))
          .addMethod(
            getGetEndOfDayPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse>(
                  this, METHODID_GET_END_OF_DAY_PREFERENCES)))
          .addMethod(
            getUpdateEndOfDayPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse>(
                  this, METHODID_UPDATE_END_OF_DAY_PREFERENCES)))
          .addMethod(
            getGetReportFilterPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse>(
                  this, METHODID_GET_REPORT_FILTER_PREFERENCES)))
          .addMethod(
            getUpdateReportFilterPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse>(
                  this, METHODID_UPDATE_REPORT_FILTER_PREFERENCES)))
          .addMethod(
            getGetRecordingPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse>(
                  this, METHODID_GET_RECORDING_PREFERENCES)))
          .addMethod(
            getUpdateRecordingPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse>(
                  this, METHODID_UPDATE_RECORDING_PREFERENCES)))
          .addMethod(
            getGetAdminClientPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse>(
                  this, METHODID_GET_ADMIN_CLIENT_PREFERENCES)))
          .addMethod(
            getUpdateAdminClientPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse>(
                  this, METHODID_UPDATE_ADMIN_CLIENT_PREFERENCES)))
          .addMethod(
            getAcceptLinkbackRecordingTermsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse>(
                  this, METHODID_ACCEPT_LINKBACK_RECORDING_TERMS)))
          .addMethod(
            getLinkbackUpdateBroadcastTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse>(
                  this, METHODID_LINKBACK_UPDATE_BROADCAST_TEMPLATES)))
          .addMethod(
            getRecordEmailUnsubscribeAcknowledgementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest,
                com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse>(
                  this, METHODID_RECORD_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT)))
          .addMethod(
            getClearEmailUnsubscribeAcknowledgementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse>(
                  this, METHODID_CLEAR_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT)))
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getCreateDelegatedUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse>(
                  this, METHODID_CREATE_DELEGATED_USER)))
          .addMethod(
            getGetMyUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse>(
                  this, METHODID_GET_MY_USER)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetUserByOrgIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse>(
                  this, METHODID_GET_USER_BY_ORG_ID)))
          .addMethod(
            getListAgentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse>(
                  this, METHODID_LIST_AGENTS)))
          .addMethod(
            getListUsersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse>(
                  this, METHODID_LIST_USERS)))
          .addMethod(
            getListUsersByOrgIdMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse>(
                  this, METHODID_LIST_USERS_BY_ORG_ID)))
          .addMethod(
            getListUsersByRegionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse>(
                  this, METHODID_LIST_USERS_BY_REGION)))
          .addMethod(
            getUpdateMyUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse>(
                  this, METHODID_UPDATE_MY_USER)))
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getUpdateUserLabelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse>(
                  this, METHODID_UPDATE_USER_LABELS)))
          .addMethod(
            getUpdateUserCallerIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse>(
                  this, METHODID_UPDATE_USER_CALLER_ID)))
          .addMethod(
            getUpdateUserDisabledMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse>(
                  this, METHODID_UPDATE_USER_DISABLED)))
          .addMethod(
            getUpdateUserDisabledByOrgIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse>(
                  this, METHODID_UPDATE_USER_DISABLED_BY_ORG_ID)))
          .addMethod(
            getGetMyUserPasswordResetLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse>(
                  this, METHODID_GET_MY_USER_PASSWORD_RESET_LINK)))
          .addMethod(
            getGetUserPasswordResetLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse>(
                  this, METHODID_GET_USER_PASSWORD_RESET_LINK)))
          .addMethod(
            getGetUserPasswordResetLinkByOrgIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse>(
                  this, METHODID_GET_USER_PASSWORD_RESET_LINK_BY_ORG_ID)))
          .addMethod(
            getGetUserLoginInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse>(
                  this, METHODID_GET_USER_LOGIN_INFO)))
          .addMethod(
            getGetUserEmailVerifiedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse>(
                  this, METHODID_GET_USER_EMAIL_VERIFIED)))
          .addMethod(
            getGetUserEmailVerifiedByOrgIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse>(
                  this, METHODID_GET_USER_EMAIL_VERIFIED_BY_ORG_ID)))
          .addMethod(
            getSendUserEmailVerificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest,
                com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse>(
                  this, METHODID_SEND_USER_EMAIL_VERIFICATION)))
          .addMethod(
            getSendUserEmailVerificationByOrgIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse>(
                  this, METHODID_SEND_USER_EMAIL_VERIFICATION_BY_ORG_ID)))
          .addMethod(
            getGetUserSessionDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse>(
                  this, METHODID_GET_USER_SESSION_DATA)))
          .addMethod(
            getGetAgentProfileGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse>(
                  this, METHODID_GET_AGENT_PROFILE_GROUP)))
          .addMethod(
            getListAgentProfileGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse>(
                  this, METHODID_LIST_AGENT_PROFILE_GROUPS)))
          .addMethod(
            getUpdateAgentProfileGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse>(
                  this, METHODID_UPDATE_AGENT_PROFILE_GROUP)))
          .addMethod(
            getCreateAgentProfileGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse>(
                  this, METHODID_CREATE_AGENT_PROFILE_GROUP)))
          .addMethod(
            getDeleteAgentProfileGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse>(
                  this, METHODID_DELETE_AGENT_PROFILE_GROUP)))
          .addMethod(
            getAssignAgentProfileGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse>(
                  this, METHODID_ASSIGN_AGENT_PROFILE_GROUPS)))
          .addMethod(
            getAddUserSubscriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse>(
                  this, METHODID_ADD_USER_SUBSCRIPTION)))
          .addMethod(
            getAddUserSubscriptionByUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse>(
                  this, METHODID_ADD_USER_SUBSCRIPTION_BY_USER_ID)))
          .addMethod(
            getGetUserSubscriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse>(
                  this, METHODID_GET_USER_SUBSCRIPTION)))
          .addMethod(
            getGetUserSubscriptionByUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse>(
                  this, METHODID_GET_USER_SUBSCRIPTION_BY_USER_ID)))
          .addMethod(
            getUpdateUserSubscriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse>(
                  this, METHODID_UPDATE_USER_SUBSCRIPTION)))
          .addMethod(
            getUpdateUserSubscriptionByUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse>(
                  this, METHODID_UPDATE_USER_SUBSCRIPTION_BY_USER_ID)))
          .addMethod(
            getRemoveUserSubscriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest,
                com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse>(
                  this, METHODID_REMOVE_USER_SUBSCRIPTION)))
          .addMethod(
            getRemoveUserSubscriptionByUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse>(
                  this, METHODID_REMOVE_USER_SUBSCRIPTION_BY_USER_ID)))
          .addMethod(
            getListUserSubscriptionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse>(
                  this, METHODID_LIST_USER_SUBSCRIPTIONS)))
          .addMethod(
            getListUserSubscriptionsByUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse>(
                  this, METHODID_LIST_USER_SUBSCRIPTIONS_BY_USER_ID)))
          .addMethod(
            getListOrgSubscriptionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse>(
                  this, METHODID_LIST_ORG_SUBSCRIPTIONS)))
          .addMethod(
            getGetHuntGroupSettingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse>(
                  this, METHODID_GET_HUNT_GROUP_SETTINGS)))
          .addMethod(
            getUpdateHuntGroupSettingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse>(
                  this, METHODID_UPDATE_HUNT_GROUP_SETTINGS)))
          .addMethod(
            getListCallerIdBucketsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse>(
                  this, METHODID_LIST_CALLER_ID_BUCKETS)))
          .addMethod(
            getGetDataDipTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse>(
                  this, METHODID_GET_DATA_DIP_TEMPLATE)))
          .addMethod(
            getListDataDipTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse>(
                  this, METHODID_LIST_DATA_DIP_TEMPLATES)))
          .addMethod(
            getCreateDataDipTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse>(
                  this, METHODID_CREATE_DATA_DIP_TEMPLATE)))
          .addMethod(
            getListAgentResponseAutoRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse>(
                  this, METHODID_LIST_AGENT_RESPONSE_AUTO_RULES)))
          .addMethod(
            getCreateAgentResponseAutoRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse>(
                  this, METHODID_CREATE_AGENT_RESPONSE_AUTO_RULES)))
          .addMethod(
            getUpdateAgentResponseAutoRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse>(
                  this, METHODID_UPDATE_AGENT_RESPONSE_AUTO_RULES)))
          .addMethod(
            getDeleteAgentResponseAutoRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse>(
                  this, METHODID_DELETE_AGENT_RESPONSE_AUTO_RULES)))
          .addMethod(
            getCreateTrustMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse>(
                  this, METHODID_CREATE_TRUST)))
          .addMethod(
            getAcceptTrustMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse>(
                  this, METHODID_ACCEPT_TRUST)))
          .addMethod(
            getRejectTrustMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest,
                com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse>(
                  this, METHODID_REJECT_TRUST)))
          .addMethod(
            getGetTrustMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse>(
                  this, METHODID_GET_TRUST)))
          .addMethod(
            getListIncomingTrustsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse>(
                  this, METHODID_LIST_INCOMING_TRUSTS)))
          .addMethod(
            getListGivenTrustsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListGivenTrustsResponse>(
                  this, METHODID_LIST_GIVEN_TRUSTS)))
          .addMethod(
            getListAssignableTrustsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse>(
                  this, METHODID_LIST_ASSIGNABLE_TRUSTS)))
          .addMethod(
            getDeleteTrustMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest,
                com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse>(
                  this, METHODID_DELETE_TRUST)))
          .addMethod(
            getAssignTrustMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse>(
                  this, METHODID_ASSIGN_TRUST)))
          .addMethod(
            getUnassignTrustMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse>(
                  this, METHODID_UNASSIGN_TRUST)))
          .addMethod(
            getCreateLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse>(
                  this, METHODID_CREATE_LABEL)))
          .addMethod(
            getDeleteLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest,
                com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse>(
                  this, METHODID_DELETE_LABEL)))
          .addMethod(
            getListLabelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse>(
                  this, METHODID_LIST_LABELS)))
          .addMethod(
            getGetLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse>(
                  this, METHODID_GET_LABEL)))
          .addMethod(
            getUpdateLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse>(
                  this, METHODID_UPDATE_LABEL)))
          .addMethod(
            getAssignLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse>(
                  this, METHODID_ASSIGN_LABEL)))
          .addMethod(
            getUnassignLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse>(
                  this, METHODID_UNASSIGN_LABEL)))
          .addMethod(
            getGetAssignmentCountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse>(
                  this, METHODID_GET_ASSIGNMENT_COUNTS)))
          .addMethod(
            getGetAssignableLabelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse>(
                  this, METHODID_GET_ASSIGNABLE_LABELS)))
          .addMethod(
            getGetPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse>(
                  this, METHODID_GET_PERMISSIONS)))
          .addMethod(
            getGetUserPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse>(
                  this, METHODID_GET_USER_PERMISSIONS)))
          .addMethod(
            getCreatePermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse>(
                  this, METHODID_CREATE_PERMISSION_GROUP)))
          .addMethod(
            getUpdatePermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse>(
                  this, METHODID_UPDATE_PERMISSION_GROUP)))
          .addMethod(
            getDeletePermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse>(
                  this, METHODID_DELETE_PERMISSION_GROUP)))
          .addMethod(
            getListPermissionGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse>(
                  this, METHODID_LIST_PERMISSION_GROUPS)))
          .addMethod(
            getListPermissionGroupsByOrgIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse>(
                  this, METHODID_LIST_PERMISSION_GROUPS_BY_ORG_ID)))
          .addMethod(
            getAssignUsersPermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse>(
                  this, METHODID_ASSIGN_USERS_PERMISSION_GROUP)))
          .addMethod(
            getRevokeUsersPermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse>(
                  this, METHODID_REVOKE_USERS_PERMISSION_GROUP)))
          .addMethod(
            getAssignAccountOwnerPermissionToUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse>(
                  this, METHODID_ASSIGN_ACCOUNT_OWNER_PERMISSION_TO_USER)))
          .addMethod(
            getRevokeAccountOwnerPermissionFromUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest,
                com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse>(
                  this, METHODID_REVOKE_ACCOUNT_OWNER_PERMISSION_FROM_USER)))
          .addMethod(
            getInitDefaultPermissionGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse>(
                  this, METHODID_INIT_DEFAULT_PERMISSION_GROUPS)))
          .addMethod(
            getGetAccountOwnerGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse>(
                  this, METHODID_GET_ACCOUNT_OWNER_GROUP)))
          .addMethod(
            getGetLicensesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse>(
                  this, METHODID_GET_LICENSES)))
          .addMethod(
            getGetOrgLicensesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse>(
                  this, METHODID_GET_ORG_LICENSES)))
          .addMethod(
            getUpdateLicensesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse>(
                  this, METHODID_UPDATE_LICENSES)))
          .addMethod(
            getRemovePermissionFromAllPermissionGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse>(
                  this, METHODID_REMOVE_PERMISSION_FROM_ALL_PERMISSION_GROUPS)))
          .addMethod(
            getListP3PermissionGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse>(
                  this, METHODID_LIST_P3PERMISSION_GROUPS)))
          .addMethod(
            getListP3PermissionGroupsByOrgIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest,
                com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse>(
                  this, METHODID_LIST_P3PERMISSION_GROUPS_BY_ORG_ID)))
          .addMethod(
            getCreateP3PermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse>(
                  this, METHODID_CREATE_P3PERMISSION_GROUP)))
          .addMethod(
            getUpdateP3PermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse>(
                  this, METHODID_UPDATE_P3PERMISSION_GROUP)))
          .addMethod(
            getUpdateP3PermissionGroupByOrgIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest,
                com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse>(
                  this, METHODID_UPDATE_P3PERMISSION_GROUP_BY_ORG_ID)))
          .addMethod(
            getDeleteP3PermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse>(
                  this, METHODID_DELETE_P3PERMISSION_GROUP)))
          .addMethod(
            getAssignUsersP3PermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse>(
                  this, METHODID_ASSIGN_USERS_P3PERMISSION_GROUP)))
          .addMethod(
            getRevokeUsersP3PermissionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest,
                com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse>(
                  this, METHODID_REVOKE_USERS_P3PERMISSION_GROUP)))
          .build();
    }
  }

  /**
   * <pre>
   * ORGANIZATION
   * </pre>
   */
  public static final class OrgStub extends io.grpc.stub.AbstractStub<OrgStub> {
    private OrgStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrgStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrgStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization entity and enables it for the
     * region it is getting created in.
     * </pre>
     */
    public void createOrganization(com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetOrganization returns a single organization.
     * </pre>
     */
    public void getOrganization(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetOrganizationById returns a single organization by a given orgId.
     * </pre>
     */
    public void getOrganizationById(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrganizationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganization updates the mutable fields on the Organization entity
     * using the provided field mask.
     * </pre>
     */
    public void updateOrganization(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public void archiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getArchiveOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unarchives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public void unArchiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnArchiveOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAllOrganizationsGlobally lists all organizations globally (archived and unarchived).
     * </pre>
     */
    public void listAllOrganizationsGlobally(com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListAllOrganizationsGloballyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListOrganizationsByRegion lists organizations in the given region (unarchived).
     * </pre>
     */
    public void listOrganizationsByRegion(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListOrganizationsByRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListArchivedOrganizations lists all archived organizations in the current region.
     * </pre>
     */
    public void listArchivedOrganizations(com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListArchivedOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConvertOrgToManual converts an organization to manual only by org id.
     * </pre>
     */
    public void convertOrgToManual(com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertOrgToManualMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all orgs under the p3 hierarchy
     * </pre>
     */
    public void listOwnedOrgs(com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListOwnedOrgsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public void getOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrganizationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public void updateOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgentPreferences returns preferences controlling direct agent properties.
     * </pre>
     */
    public void getAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates preferences controlling direct agent
     * properties.
     * </pre>
     */
    public void updateAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAgentPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetContactPreferences returns preferences for contact lists.
     * </pre>
     */
    public void getContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContactPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateContactPreferences updates preferences for contact lists.
     * </pre>
     */
    public void updateContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateContactPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns preferences for controlling the
     * </pre>
     */
    public void getAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthenticationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates preferences for controlling the
     * </pre>
     */
    public void updateAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAuthenticationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns preferences for web-hook push URLs.
     * </pre>
     */
    public void getWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWebhookPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates preferences for web-hook push URLs.
     * </pre>
     */
    public void updateWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateWebhookPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns preferences for agent dashboard
     * controls.
     * </pre>
     */
    public void getDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDashboardGeneralPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates preferences for agent dashboard
     * controls.
     * </pre>
     */
    public void updateDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardGeneralPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns preferences for controlling agent queue
     * and hold table settings.
     * </pre>
     */
    public void getDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDashboardQueuePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates preferences for controlling agent
     * queue and hold table settings.
     * </pre>
     */
    public void updateDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardQueuePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPhonePreferences returns preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public void getPhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPhonePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public void updatePhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePhonePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCompliancePreferences returns preferences for natural language compliance
     * campaign settings.
     * </pre>
     */
    public void getCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCompliancePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCompliancePreferences updates preferences for natural language
     * compliance campaign settings.
     * </pre>
     */
    public void updateCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCompliancePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public void getBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBroadcastPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public void updateBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBroadcastPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns preferences for editing campaign scheduling
     * properties.
     * </pre>
     */
    public void getSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSchedulePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences updates preferences for editing campaign
     * scheduling properties.
     * </pre>
     */
    public void updateSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSchedulePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns preferences for email and SMS management.
     * </pre>
     */
    public void getEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmailSmsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEmailSmsPreferences updates preferences for email and SMS management.
     * </pre>
     */
    public void updateEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEmailSmsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns preferences for business intelligence.
     * </pre>
     */
    public void getBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBusinessPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public void updateBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBusinessPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns preferences for scorecards.
     * </pre>
     */
    public void getScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScorecardsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateScorecardsPreferences updates preferences for scorecards.
     * </pre>
     */
    public void updateScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateScorecardsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns preferences for voice analytics.
     * </pre>
     */
    public void getVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVoiceAnalyticsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListVoiceAnalyticsPreferences lists preferences for voice analytics.
     * </pre>
     */
    public void listVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVoiceAnalyticsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateVoiceAnalyticsPreferences updates preferences for voice analytics.
     * </pre>
     */
    public void updateVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVoiceAnalyticsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns preferences for automated report jobs
     * </pre>
     */
    public void getEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEndOfDayPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences updates preferences for automated report jobs
     * </pre>
     */
    public void updateEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEndOfDayPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for filters in reports and
     * </pre>
     */
    public void getReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReportFilterPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for filters in reports and
     * </pre>
     */
    public void updateReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReportFilterPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns preferences for audio recording properties.
     * </pre>
     */
    public void getRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRecordingPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates preferences for audio recording
     * properties.
     * </pre>
     */
    public void updateRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRecordingPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAdminClientPreferences returns preferences for essential organization
     * properties only to be used by account managers and customer support.
     * </pre>
     */
    public void getAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdminClientPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAdminClientPreferences updates preferences for essential organization
     * </pre>
     */
    public void updateAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAdminClientPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AcceptLinkbackRecordingTerms insert a digital signature acceptance activity
     * log upon client acknowledgement of terms and conditions usage for linkback
     * recorded calls.
     * </pre>
     */
    public void acceptLinkbackRecordingTerms(com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcceptLinkbackRecordingTermsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template options action
     * parameters to reflect the linkback recording usage value.
     * </pre>
     */
    public void linkbackUpdateBroadcastTemplates(com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLinkbackUpdateBroadcastTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement insert an activity log upon client
     * acknowledgement of responsibility for their own email unsubscribe links.
     * </pre>
     */
    public void recordEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecordEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement insert an activity log upon the client
     * revoking their responsibility for email unsubscribe links.
     * </pre>
     */
    public void clearEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateUser creates a new user and enables it for the region it is getting created in.
     * </pre>
     */
    public void createUser(com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateDelegatedUser creates a new delegated user and enables it for the region it is getting created in.
     * </pre>
     */
    public void createDelegatedUser(com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDelegatedUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMyUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public void getMyUser(com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMyUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public void getUser(com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserByOrgId returns a single user by UserId and OrgId
     * Requires Customer Support permission and allows cross Org requests.
     * </pre>
     */
    public void getUserByOrgId(com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgents returns a list of Agents.
     * </pre>
     */
    public void listAgents(com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    public void listUsers(com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListUsersByOrgId returns a list of users.
     * </pre>
     */
    public void listUsersByOrgId(com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListUsersByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListUsersByRegion returns a list of usersByRegion.
     * </pre>
     */
    public void listUsersByRegion(com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListUsersByRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateMyUser updates a user.
     * </pre>
     */
    public void updateMyUser(com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMyUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public void updateUser(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserLabels updates a user's labels to be the passed in set of labels.
     * </pre>
     */
    public void updateUserLabels(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserCallerId updates a user.
     * </pre>
     */
    public void updateUserCallerId(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserCallerIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates whether a user is disabled.
     * </pre>
     */
    public void updateUserDisabled(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserDisabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabledByOrgId updates a user is disabled.
     * </pre>
     */
    public void updateUserDisabledByOrgId(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserDisabledByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMyUserPasswordResetLink updates a user's password.
     * </pre>
     */
    public void getMyUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMyUserPasswordResetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserPasswordResetLink gets a link to update a user's password.
     * </pre>
     */
    public void getUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserPasswordResetLinkByOrgId gets a link to update a user's password.
     * </pre>
     */
    public void getUserPasswordResetLinkByOrgId(com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used to be called GetUserBlocked
     * GetUserLoginInfo gets information about a user's login.
     * </pre>
     */
    public void getUserLoginInfo(com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserLoginInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserEmailVerified gets whether the user's email is verified.
     * </pre>
     */
    public void getUserEmailVerified(com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserEmailVerifiedByOrgId gets whether the user's email is verified.
     * </pre>
     */
    public void getUserEmailVerifiedByOrgId(com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendUserEmailVerification sends a verification email to the user.
     * </pre>
     */
    public void sendUserEmailVerification(com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendUserEmailVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendUserEmailVerificationByOrgId sends a verification email to the user.
     * </pre>
     */
    public void sendUserEmailVerificationByOrgId(com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendUserEmailVerificationByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserSessionData returns data for the front end's session state
     * </pre>
     */
    public void getUserSessionData(com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserSessionDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgentProfileGroup returns an agent profile group by id
     * </pre>
     */
    public void getAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgentProfileGroups returns the agent profile groups associated with the current organization
     * </pre>
     */
    public void listAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentProfileGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * </pre>
     */
    public void updateAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * </pre>
     */
    public void createAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes an AgentProfileGroup. Can only delete if user is in same org as AgentProfileGroup
     * </pre>
     */
    public void deleteAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups assigns a list of users to an AgentProfileGroup. Can only use if everything is in the same organization.
     * </pre>
     */
    public void assignAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignAgentProfileGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new user subscription.
     * </pre>
     */
    public void addUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new user subscription for a specified user with in requested users org.
     * </pre>
     */
    public void addUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserSubscriptionByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription.
     * </pre>
     */
    public void getUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription for a specified user with in requested users org.
     * </pre>
     */
    public void getUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserSubscriptionByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription for the current user
     * </pre>
     */
    public void updateUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription for a given user id
     * </pre>
     */
    public void updateUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove a user subscription.
     * </pre>
     */
    public void removeUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove a user subscription by a given user id
     * </pre>
     */
    public void removeUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public void listUserSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUserSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public void listUserSubscriptionsByUserId(com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUserSubscriptionsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists subscriptions for multiple users in an org.
     * </pre>
     */
    public void listOrgSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOrgSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetHuntGroupSettings returns the field masked hunt group settings for the
     * provided hunt group.
     * </pre>
     */
    public void getHuntGroupSettings(com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHuntGroupSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupSettings updates the selected/masked hunt group settings
     * for the given hunt group.
     * </pre>
     */
    public void updateHuntGroupSettings(com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateHuntGroupSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists caller id numbers with their associated region codes for the given
     * bucket.
     * </pre>
     */
    public void listCallerIdBuckets(com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCallerIdBucketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single data dip template.
     * </pre>
     */
    public void getDataDipTemplate(com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDataDipTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists data dip templates, optionally filtered by config type.
     * </pre>
     */
    public void listDataDipTemplates(com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDataDipTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Saves a new data dip template.
     * </pre>
     */
    public void createDataDipTemplate(com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDataDipTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists Agent Call Response Automatically added compliance rules for an Org.
     * </pre>
     */
    public void listAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentResponseAutoRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public void createAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAgentResponseAutoRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public void updateAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAgentResponseAutoRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public void deleteAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAgentResponseAutoRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateTrust creates a new trust.
     * </pre>
     */
    public void createTrust(com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AcceptTrust accepts an incoming trust.
     * </pre>
     */
    public void acceptTrust(com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcceptTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RejectTrust rejects an incoming trust.
     * </pre>
     */
    public void rejectTrust(com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRejectTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTrust returns a single trust by trust id.
     * </pre>
     */
    public void getTrust(com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getDeleteTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignTrust assigns a trust to the given user ids.
     * </pre>
     */
    public void assignTrust(com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnassignTrust unassigns a trust from the given user id.
     * </pre>
     */
    public void unassignTrust(com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnassignTrustMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateLabel creates a label with the given properties.
     * </pre>
     */
    public void createLabel(com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteLabel deletes a label with the id given on the request.
     * </pre>
     */
    public void deleteLabel(com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListLabels returns all unique label names belonging to the given org id.
     * </pre>
     */
    public void listLabels(com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLabel returns a single label with the given ID.
     * </pre>
     */
    public void getLabel(com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLabel updates the given label.
     * </pre>
     */
    public void updateLabel(com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assignlabel creates label assignments defined by the request.
     * </pre>
     */
    public void assignLabel(com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unassignlabel removes label assignments defined by the request.
     * </pre>
     */
    public void unassignLabel(com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnassignLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAssignmentCounts returns the total amount of label assignments
     * per entity type.
     * </pre>
     */
    public void getAssignmentCounts(com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssignmentCountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAssignableLabels returns a list of labels available to the current user.
     * </pre>
     */
    public void getAssignableLabels(com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssignableLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPermissions returns the permissions for a given user along with other user information.
     * </pre>
     */
    public void getPermissions(com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserPermissions returns the permissions for a given user.
     * </pre>
     */
    public void getUserPermissions(com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new permission group.
     * </pre>
     */
    public void createPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdatePermissionGroup updates the permission group with the given id.
     * </pre>
     */
    public void updatePermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeletePermissionGroup deletes the permission group with the given id.
     * </pre>
     */
    public void deletePermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListPermissionGroups returns a list of permissions for an organization.
     * </pre>
     */
    public void listPermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPermissionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListPermissionGroupsByOrgId returns a list of permissions for an
     * organization.
     * </pre>
     */
    public void listPermissionGroupsByOrgId(com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPermissionGroupsByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignUsersPermissionGroup returns a user a permission group.
     * </pre>
     */
    public void assignUsersPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignUsersPermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeUsersPermissionGroup returns a user a permission group.
     * </pre>
     */
    public void revokeUsersPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeUsersPermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignAccountOwnerPermissionToUser returns a user a permission group.
     * </pre>
     */
    public void assignAccountOwnerPermissionToUser(com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignAccountOwnerPermissionToUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeAccountOwnerPermissionFromUser returns a user a permission group.
     * </pre>
     */
    public void revokeAccountOwnerPermissionFromUser(com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeAccountOwnerPermissionFromUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initializes the default read only permissions group for the
     * given organization.
     * </pre>
     */
    public void initDefaultPermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitDefaultPermissionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAccountOwnerGroup returns the account owner permission group
     * for an organization.
     * </pre>
     */
    public void getAccountOwnerGroup(com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountOwnerGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLicenses returns the licenses an organitzation is assigned.
     * </pre>
     */
    public void getLicenses(com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLicensesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetOrgLicenses returns the licenses assigned to the organization
     * of the user who makes the request.
     * </pre>
     */
    public void getOrgLicenses(com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrgLicensesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLicenses updates an organization's licenses.
     * </pre>
     */
    public void updateLicenses(com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLicensesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemovePermissionFromAllPermissionGroups removes a permission from
     * all permission groups in an organization.
     * </pre>
     */
    public void removePermissionFromAllPermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemovePermissionFromAllPermissionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListP3PermissionGroups returns the list of p3 permission groups
     * for the user's org.
     * </pre>
     */
    public void listP3PermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListP3PermissionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListP3PermissionGroupsByOrgId returns the list of p3 permission groups
     * for an org by id.
     * </pre>
     */
    public void listP3PermissionGroupsByOrgId(com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListP3PermissionGroupsByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateP3PermissionGroup creates a new p3 permission group.
     * </pre>
     */
    public void createP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateP3PermissionGroup updates an existing p3 permission group.
     * Requires PERMISSION_GROUP_EDIT.
     * </pre>
     */
    public void updateP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateP3PermissionGroup updates an existing p3 permission group.
     * CUSTOMER_SUPPORT required for passing in an org id.
     * </pre>
     */
    public void updateP3PermissionGroupByOrgId(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateP3PermissionGroupByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteP3PermissionGroup deletes a p3 permission group.
     * </pre>
     */
    public void deleteP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignUsersP3PermissionGroup assigns a p3 permission group
     * to a list of users.
     * </pre>
     */
    public void assignUsersP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignUsersP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeUsersP3PermissionGroup revokes a p3 permission group
     * from a list of users.
     * </pre>
     */
    public void revokeUsersP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeUsersP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ORGANIZATION
   * </pre>
   */
  public static final class OrgBlockingStub extends io.grpc.stub.AbstractStub<OrgBlockingStub> {
    private OrgBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrgBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization entity and enables it for the
     * region it is getting created in.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse createOrganization(com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOrganization returns a single organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse getOrganization(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOrganizationById returns a single organization by a given orgId.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse getOrganizationById(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrganizationByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateOrganization updates the mutable fields on the Organization entity
     * using the provided field mask.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse updateOrganization(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse archiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getArchiveOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unarchives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse unArchiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnArchiveOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAllOrganizationsGlobally lists all organizations globally (archived and unarchived).
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse> listAllOrganizationsGlobally(
        com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListAllOrganizationsGloballyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListOrganizationsByRegion lists organizations in the given region (unarchived).
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse> listOrganizationsByRegion(
        com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListOrganizationsByRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListArchivedOrganizations lists all archived organizations in the current region.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse> listArchivedOrganizations(
        com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListArchivedOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConvertOrgToManual converts an organization to manual only by org id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse convertOrgToManual(com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertOrgToManualMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all orgs under the p3 hierarchy
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse> listOwnedOrgs(
        com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListOwnedOrgsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse getOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrganizationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse updateOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOrganizationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgentPreferences returns preferences controlling direct agent properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse getAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAgentPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates preferences controlling direct agent
     * properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse updateAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAgentPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetContactPreferences returns preferences for contact lists.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse getContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetContactPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateContactPreferences updates preferences for contact lists.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse updateContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateContactPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns preferences for controlling the
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse getAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthenticationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates preferences for controlling the
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse updateAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAuthenticationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns preferences for web-hook push URLs.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse getWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWebhookPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates preferences for web-hook push URLs.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse updateWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateWebhookPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns preferences for agent dashboard
     * controls.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse getDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDashboardGeneralPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates preferences for agent dashboard
     * controls.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse updateDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDashboardGeneralPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns preferences for controlling agent queue
     * and hold table settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse getDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDashboardQueuePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates preferences for controlling agent
     * queue and hold table settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse updateDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDashboardQueuePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPhonePreferences returns preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse getPhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPhonePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse updatePhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePhonePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCompliancePreferences returns preferences for natural language compliance
     * campaign settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse getCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCompliancePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCompliancePreferences updates preferences for natural language
     * compliance campaign settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse updateCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCompliancePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse getBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBroadcastPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse updateBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBroadcastPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns preferences for editing campaign scheduling
     * properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse getSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSchedulePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences updates preferences for editing campaign
     * scheduling properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse updateSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSchedulePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns preferences for email and SMS management.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse getEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEmailSmsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEmailSmsPreferences updates preferences for email and SMS management.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse updateEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEmailSmsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns preferences for business intelligence.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse getBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBusinessPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse updateBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBusinessPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns preferences for scorecards.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse getScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetScorecardsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateScorecardsPreferences updates preferences for scorecards.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse updateScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateScorecardsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns preferences for voice analytics.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse getVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVoiceAnalyticsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListVoiceAnalyticsPreferences lists preferences for voice analytics.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse listVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVoiceAnalyticsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateVoiceAnalyticsPreferences updates preferences for voice analytics.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse updateVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVoiceAnalyticsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns preferences for automated report jobs
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse getEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEndOfDayPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences updates preferences for automated report jobs
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse updateEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEndOfDayPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for filters in reports and
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse getReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReportFilterPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for filters in reports and
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse updateReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReportFilterPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns preferences for audio recording properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse getRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRecordingPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates preferences for audio recording
     * properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse updateRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRecordingPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAdminClientPreferences returns preferences for essential organization
     * properties only to be used by account managers and customer support.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse getAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdminClientPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAdminClientPreferences updates preferences for essential organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse updateAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAdminClientPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AcceptLinkbackRecordingTerms insert a digital signature acceptance activity
     * log upon client acknowledgement of terms and conditions usage for linkback
     * recorded calls.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse acceptLinkbackRecordingTerms(com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAcceptLinkbackRecordingTermsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template options action
     * parameters to reflect the linkback recording usage value.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse linkbackUpdateBroadcastTemplates(com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getLinkbackUpdateBroadcastTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement insert an activity log upon client
     * acknowledgement of responsibility for their own email unsubscribe links.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse recordEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest request) {
      return blockingUnaryCall(
          getChannel(), getRecordEmailUnsubscribeAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement insert an activity log upon the client
     * revoking their responsibility for email unsubscribe links.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse clearEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest request) {
      return blockingUnaryCall(
          getChannel(), getClearEmailUnsubscribeAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateUser creates a new user and enables it for the region it is getting created in.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse createUser(com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateDelegatedUser creates a new delegated user and enables it for the region it is getting created in.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse createDelegatedUser(com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateDelegatedUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMyUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse getMyUser(com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMyUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse getUser(com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserByOrgId returns a single user by UserId and OrgId
     * Requires Customer Support permission and allows cross Org requests.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse getUserByOrgId(com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgents returns a list of Agents.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse> listAgents(
        com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse> listUsers(
        com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListUsersByOrgId returns a list of users.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse> listUsersByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListUsersByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListUsersByRegion returns a list of usersByRegion.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse> listUsersByRegion(
        com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListUsersByRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateMyUser updates a user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse updateMyUser(com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMyUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse updateUser(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserLabels updates a user's labels to be the passed in set of labels.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse updateUserLabels(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserCallerId updates a user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse updateUserCallerId(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserCallerIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates whether a user is disabled.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse updateUserDisabled(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserDisabledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserDisabledByOrgId updates a user is disabled.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse updateUserDisabledByOrgId(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserDisabledByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMyUserPasswordResetLink updates a user's password.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse getMyUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMyUserPasswordResetLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserPasswordResetLink gets a link to update a user's password.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse getUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserPasswordResetLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserPasswordResetLinkByOrgId gets a link to update a user's password.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse getUserPasswordResetLinkByOrgId(com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserPasswordResetLinkByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used to be called GetUserBlocked
     * GetUserLoginInfo gets information about a user's login.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse getUserLoginInfo(com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserLoginInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserEmailVerified gets whether the user's email is verified.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse getUserEmailVerified(com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserEmailVerifiedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserEmailVerifiedByOrgId gets whether the user's email is verified.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse getUserEmailVerifiedByOrgId(com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserEmailVerifiedByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendUserEmailVerification sends a verification email to the user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse sendUserEmailVerification(com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendUserEmailVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendUserEmailVerificationByOrgId sends a verification email to the user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse sendUserEmailVerificationByOrgId(com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendUserEmailVerificationByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserSessionData returns data for the front end's session state
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse getUserSessionData(com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserSessionDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgentProfileGroup returns an agent profile group by id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse getAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgentProfileGroups returns the agent profile groups associated with the current organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse listAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAgentProfileGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse updateAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse createAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes an AgentProfileGroup. Can only delete if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse deleteAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups assigns a list of users to an AgentProfileGroup. Can only use if everything is in the same organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse assignAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignAgentProfileGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new user subscription.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse addUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new user subscription for a specified user with in requested users org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse addUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserSubscriptionByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a user subscription.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse getUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a user subscription for a specified user with in requested users org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse getUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserSubscriptionByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a user subscription for the current user
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse updateUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a user subscription for a given user id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse updateUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserSubscriptionByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a user subscription.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse removeUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a user subscription by a given user id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse removeUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserSubscriptionByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse listUserSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUserSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse listUserSubscriptionsByUserId(com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUserSubscriptionsByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists subscriptions for multiple users in an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse listOrgSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOrgSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetHuntGroupSettings returns the field masked hunt group settings for the
     * provided hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse getHuntGroupSettings(com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHuntGroupSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupSettings updates the selected/masked hunt group settings
     * for the given hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse updateHuntGroupSettings(com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateHuntGroupSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists caller id numbers with their associated region codes for the given
     * bucket.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse listCallerIdBuckets(com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCallerIdBucketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single data dip template.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse getDataDipTemplate(com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDataDipTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists data dip templates, optionally filtered by config type.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse listDataDipTemplates(com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDataDipTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Saves a new data dip template.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse createDataDipTemplate(com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateDataDipTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists Agent Call Response Automatically added compliance rules for an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse listAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAgentResponseAutoRulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse createAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAgentResponseAutoRulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse updateAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAgentResponseAutoRulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an existing Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse deleteAgentResponseAutoRules(com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAgentResponseAutoRulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateTrust creates a new trust.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse createTrust(com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AcceptTrust accepts an incoming trust.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse acceptTrust(com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest request) {
      return blockingUnaryCall(
          getChannel(), getAcceptTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RejectTrust rejects an incoming trust.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse rejectTrust(com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest request) {
      return blockingUnaryCall(
          getChannel(), getRejectTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTrust returns a single trust by trust id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse getTrust(com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListIncomingTrusts returns all pending trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsResponse listIncomingTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListIncomingTrustsRequest request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getListGivenTrustsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAssignableTrusts returns all accepted trusts that are being granted
     * to the org of the currently logged in user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsResponse listAssignableTrusts(com.tcn.cloud.api.api.v1alpha1.org.ListAssignableTrustsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAssignableTrustsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteTrust deletes a trust by trust id. Only trusts where the current
     * org is the grantor can be deleted by this endpoint.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustResponse deleteTrust(com.tcn.cloud.api.api.v1alpha1.org.DeleteTrustRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignTrust assigns a trust to the given user ids.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse assignTrust(com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnassignTrust unassigns a trust from the given user id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse unassignTrust(com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnassignTrustMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateLabel creates a label with the given properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse createLabel(com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteLabel deletes a label with the id given on the request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse deleteLabel(com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListLabels returns all unique label names belonging to the given org id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse listLabels(com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLabel returns a single label with the given ID.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse getLabel(com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLabel updates the given label.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse updateLabel(com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assignlabel creates label assignments defined by the request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse assignLabel(com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unassignlabel removes label assignments defined by the request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse unassignLabel(com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnassignLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAssignmentCounts returns the total amount of label assignments
     * per entity type.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse getAssignmentCounts(com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAssignmentCountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAssignableLabels returns a list of labels available to the current user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse getAssignableLabels(com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAssignableLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPermissions returns the permissions for a given user along with other user information.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse getPermissions(com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserPermissions returns the permissions for a given user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse getUserPermissions(com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new permission group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse createPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdatePermissionGroup updates the permission group with the given id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse updatePermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeletePermissionGroup deletes the permission group with the given id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse deletePermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListPermissionGroups returns a list of permissions for an organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse listPermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPermissionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListPermissionGroupsByOrgId returns a list of permissions for an
     * organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse listPermissionGroupsByOrgId(com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPermissionGroupsByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignUsersPermissionGroup returns a user a permission group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse assignUsersPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignUsersPermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeUsersPermissionGroup returns a user a permission group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse revokeUsersPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getRevokeUsersPermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignAccountOwnerPermissionToUser returns a user a permission group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse assignAccountOwnerPermissionToUser(com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignAccountOwnerPermissionToUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeAccountOwnerPermissionFromUser returns a user a permission group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse revokeAccountOwnerPermissionFromUser(com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getRevokeAccountOwnerPermissionFromUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initializes the default read only permissions group for the
     * given organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse initDefaultPermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getInitDefaultPermissionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAccountOwnerGroup returns the account owner permission group
     * for an organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse getAccountOwnerGroup(com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountOwnerGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLicenses returns the licenses an organitzation is assigned.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse getLicenses(com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLicensesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOrgLicenses returns the licenses assigned to the organization
     * of the user who makes the request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse getOrgLicenses(com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrgLicensesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLicenses updates an organization's licenses.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse updateLicenses(com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLicensesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemovePermissionFromAllPermissionGroups removes a permission from
     * all permission groups in an organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse removePermissionFromAllPermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemovePermissionFromAllPermissionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListP3PermissionGroups returns the list of p3 permission groups
     * for the user's org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse listP3PermissionGroups(com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListP3PermissionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListP3PermissionGroupsByOrgId returns the list of p3 permission groups
     * for an org by id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse listP3PermissionGroupsByOrgId(com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListP3PermissionGroupsByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateP3PermissionGroup creates a new p3 permission group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse createP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateP3PermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateP3PermissionGroup updates an existing p3 permission group.
     * Requires PERMISSION_GROUP_EDIT.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse updateP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateP3PermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateP3PermissionGroup updates an existing p3 permission group.
     * CUSTOMER_SUPPORT required for passing in an org id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse updateP3PermissionGroupByOrgId(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateP3PermissionGroupByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteP3PermissionGroup deletes a p3 permission group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse deleteP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteP3PermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignUsersP3PermissionGroup assigns a p3 permission group
     * to a list of users.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse assignUsersP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignUsersP3PermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeUsersP3PermissionGroup revokes a p3 permission group
     * from a list of users.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse revokeUsersP3PermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getRevokeUsersP3PermissionGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ORGANIZATION
   * </pre>
   */
  public static final class OrgFutureStub extends io.grpc.stub.AbstractStub<OrgFutureStub> {
    private OrgFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrgFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization entity and enables it for the
     * region it is getting created in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse> createOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetOrganization returns a single organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse> getOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetOrganizationById returns a single organization by a given orgId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse> getOrganizationById(
        com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrganizationByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateOrganization updates the mutable fields on the Organization entity
     * using the provided field mask.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse> updateOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse> archiveOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getArchiveOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unarchives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse> unArchiveOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnArchiveOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConvertOrgToManual converts an organization to manual only by org id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse> convertOrgToManual(
        com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertOrgToManualMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse> getOrganizationPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrganizationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse> updateOrganizationPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgentPreferences returns preferences controlling direct agent properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse> getAgentPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAgentPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates preferences controlling direct agent
     * properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse> updateAgentPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAgentPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetContactPreferences returns preferences for contact lists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse> getContactPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContactPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateContactPreferences updates preferences for contact lists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse> updateContactPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateContactPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns preferences for controlling the
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse> getAuthenticationPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthenticationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates preferences for controlling the
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse> updateAuthenticationPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAuthenticationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns preferences for web-hook push URLs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse> getWebhookPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWebhookPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates preferences for web-hook push URLs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse> updateWebhookPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateWebhookPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns preferences for agent dashboard
     * controls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse> getDashboardGeneralPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDashboardGeneralPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates preferences for agent dashboard
     * controls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse> updateDashboardGeneralPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDashboardGeneralPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns preferences for controlling agent queue
     * and hold table settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse> getDashboardQueuePreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDashboardQueuePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates preferences for controlling agent
     * queue and hold table settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse> updateDashboardQueuePreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDashboardQueuePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPhonePreferences returns preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse> getPhonePreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPhonePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse> updatePhonePreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePhonePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCompliancePreferences returns preferences for natural language compliance
     * campaign settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse> getCompliancePreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCompliancePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCompliancePreferences updates preferences for natural language
     * compliance campaign settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse> updateCompliancePreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCompliancePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse> getBroadcastPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBroadcastPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse> updateBroadcastPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBroadcastPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns preferences for editing campaign scheduling
     * properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse> getSchedulePreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSchedulePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences updates preferences for editing campaign
     * scheduling properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse> updateSchedulePreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSchedulePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns preferences for email and SMS management.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse> getEmailSmsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmailSmsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEmailSmsPreferences updates preferences for email and SMS management.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse> updateEmailSmsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEmailSmsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns preferences for business intelligence.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse> getBusinessPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBusinessPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse> updateBusinessPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBusinessPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns preferences for scorecards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse> getScorecardsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScorecardsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateScorecardsPreferences updates preferences for scorecards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse> updateScorecardsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateScorecardsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns preferences for voice analytics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse> getVoiceAnalyticsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVoiceAnalyticsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListVoiceAnalyticsPreferences lists preferences for voice analytics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse> listVoiceAnalyticsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVoiceAnalyticsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateVoiceAnalyticsPreferences updates preferences for voice analytics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse> updateVoiceAnalyticsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVoiceAnalyticsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns preferences for automated report jobs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse> getEndOfDayPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEndOfDayPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences updates preferences for automated report jobs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse> updateEndOfDayPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEndOfDayPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for filters in reports and
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse> getReportFilterPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReportFilterPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for filters in reports and
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse> updateReportFilterPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReportFilterPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns preferences for audio recording properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse> getRecordingPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRecordingPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates preferences for audio recording
     * properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse> updateRecordingPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRecordingPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAdminClientPreferences returns preferences for essential organization
     * properties only to be used by account managers and customer support.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse> getAdminClientPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdminClientPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAdminClientPreferences updates preferences for essential organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse> updateAdminClientPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAdminClientPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AcceptLinkbackRecordingTerms insert a digital signature acceptance activity
     * log upon client acknowledgement of terms and conditions usage for linkback
     * recorded calls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse> acceptLinkbackRecordingTerms(
        com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAcceptLinkbackRecordingTermsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template options action
     * parameters to reflect the linkback recording usage value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse> linkbackUpdateBroadcastTemplates(
        com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLinkbackUpdateBroadcastTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement insert an activity log upon client
     * acknowledgement of responsibility for their own email unsubscribe links.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse> recordEmailUnsubscribeAcknowledgement(
        com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRecordEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement insert an activity log upon the client
     * revoking their responsibility for email unsubscribe links.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse> clearEmailUnsubscribeAcknowledgement(
        com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClearEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateUser creates a new user and enables it for the region it is getting created in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse> createUser(
        com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateDelegatedUser creates a new delegated user and enables it for the region it is getting created in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse> createDelegatedUser(
        com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDelegatedUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMyUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse> getMyUser(
        com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMyUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse> getUser(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserByOrgId returns a single user by UserId and OrgId
     * Requires Customer Support permission and allows cross Org requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse> getUserByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateMyUser updates a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse> updateMyUser(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMyUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse> updateUser(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserLabels updates a user's labels to be the passed in set of labels.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse> updateUserLabels(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserCallerId updates a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse> updateUserCallerId(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserCallerIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates whether a user is disabled.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse> updateUserDisabled(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserDisabledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserDisabledByOrgId updates a user is disabled.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse> updateUserDisabledByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserDisabledByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMyUserPasswordResetLink updates a user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse> getMyUserPasswordResetLink(
        com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMyUserPasswordResetLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserPasswordResetLink gets a link to update a user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse> getUserPasswordResetLink(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserPasswordResetLinkByOrgId gets a link to update a user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse> getUserPasswordResetLinkByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used to be called GetUserBlocked
     * GetUserLoginInfo gets information about a user's login.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse> getUserLoginInfo(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserLoginInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserEmailVerified gets whether the user's email is verified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse> getUserEmailVerified(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserEmailVerifiedByOrgId gets whether the user's email is verified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse> getUserEmailVerifiedByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendUserEmailVerification sends a verification email to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse> sendUserEmailVerification(
        com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendUserEmailVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendUserEmailVerificationByOrgId sends a verification email to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse> sendUserEmailVerificationByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendUserEmailVerificationByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserSessionData returns data for the front end's session state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse> getUserSessionData(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserSessionDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgentProfileGroup returns an agent profile group by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse> getAgentProfileGroup(
        com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAgentProfileGroups returns the agent profile groups associated with the current organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse> listAgentProfileGroups(
        com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentProfileGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse> updateAgentProfileGroup(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse> createAgentProfileGroup(
        com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes an AgentProfileGroup. Can only delete if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse> deleteAgentProfileGroup(
        com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups assigns a list of users to an AgentProfileGroup. Can only use if everything is in the same organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse> assignAgentProfileGroups(
        com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignAgentProfileGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new user subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse> addUserSubscription(
        com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new user subscription for a specified user with in requested users org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse> addUserSubscriptionByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserSubscriptionByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a user subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse> getUserSubscription(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a user subscription for a specified user with in requested users org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse> getUserSubscriptionByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserSubscriptionByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a user subscription for the current user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse> updateUserSubscription(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a user subscription for a given user id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse> updateUserSubscriptionByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove a user subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse> removeUserSubscription(
        com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove a user subscription by a given user id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse> removeUserSubscriptionByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse> listUserSubscriptions(
        com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUserSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse> listUserSubscriptionsByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUserSubscriptionsByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists subscriptions for multiple users in an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse> listOrgSubscriptions(
        com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOrgSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetHuntGroupSettings returns the field masked hunt group settings for the
     * provided hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse> getHuntGroupSettings(
        com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHuntGroupSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupSettings updates the selected/masked hunt group settings
     * for the given hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse> updateHuntGroupSettings(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateHuntGroupSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists caller id numbers with their associated region codes for the given
     * bucket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse> listCallerIdBuckets(
        com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCallerIdBucketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single data dip template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse> getDataDipTemplate(
        com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDataDipTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists data dip templates, optionally filtered by config type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse> listDataDipTemplates(
        com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDataDipTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Saves a new data dip template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse> createDataDipTemplate(
        com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDataDipTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists Agent Call Response Automatically added compliance rules for an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse> listAgentResponseAutoRules(
        com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentResponseAutoRulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse> createAgentResponseAutoRules(
        com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAgentResponseAutoRulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse> updateAgentResponseAutoRules(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAgentResponseAutoRulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an existing Agent Call Response Automatically added compliance rule set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse> deleteAgentResponseAutoRules(
        com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAgentResponseAutoRulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateTrust creates a new trust.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateTrustResponse> createTrust(
        com.tcn.cloud.api.api.v1alpha1.org.CreateTrustRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AcceptTrust accepts an incoming trust.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustResponse> acceptTrust(
        com.tcn.cloud.api.api.v1alpha1.org.AcceptTrustRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAcceptTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RejectTrust rejects an incoming trust.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.RejectTrustResponse> rejectTrust(
        com.tcn.cloud.api.api.v1alpha1.org.RejectTrustRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRejectTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTrust returns a single trust by trust id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetTrustResponse> getTrust(
        com.tcn.cloud.api.api.v1alpha1.org.GetTrustRequest request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getDeleteTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignTrust assigns a trust to the given user ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AssignTrustResponse> assignTrust(
        com.tcn.cloud.api.api.v1alpha1.org.AssignTrustRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnassignTrust unassigns a trust from the given user id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustResponse> unassignTrust(
        com.tcn.cloud.api.api.v1alpha1.org.UnassignTrustRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnassignTrustMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateLabel creates a label with the given properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse> createLabel(
        com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteLabel deletes a label with the id given on the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse> deleteLabel(
        com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListLabels returns all unique label names belonging to the given org id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse> listLabels(
        com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLabel returns a single label with the given ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse> getLabel(
        com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLabel updates the given label.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse> updateLabel(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assignlabel creates label assignments defined by the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse> assignLabel(
        com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unassignlabel removes label assignments defined by the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse> unassignLabel(
        com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnassignLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAssignmentCounts returns the total amount of label assignments
     * per entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse> getAssignmentCounts(
        com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssignmentCountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAssignableLabels returns a list of labels available to the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse> getAssignableLabels(
        com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssignableLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPermissions returns the permissions for a given user along with other user information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse> getPermissions(
        com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserPermissions returns the permissions for a given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse> getUserPermissions(
        com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new permission group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse> createPermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdatePermissionGroup updates the permission group with the given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse> updatePermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeletePermissionGroup deletes the permission group with the given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse> deletePermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListPermissionGroups returns a list of permissions for an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse> listPermissionGroups(
        com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPermissionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListPermissionGroupsByOrgId returns a list of permissions for an
     * organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse> listPermissionGroupsByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPermissionGroupsByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignUsersPermissionGroup returns a user a permission group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse> assignUsersPermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignUsersPermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeUsersPermissionGroup returns a user a permission group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse> revokeUsersPermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeUsersPermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignAccountOwnerPermissionToUser returns a user a permission group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse> assignAccountOwnerPermissionToUser(
        com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignAccountOwnerPermissionToUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeAccountOwnerPermissionFromUser returns a user a permission group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse> revokeAccountOwnerPermissionFromUser(
        com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeAccountOwnerPermissionFromUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initializes the default read only permissions group for the
     * given organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse> initDefaultPermissionGroups(
        com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInitDefaultPermissionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAccountOwnerGroup returns the account owner permission group
     * for an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse> getAccountOwnerGroup(
        com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountOwnerGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLicenses returns the licenses an organitzation is assigned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse> getLicenses(
        com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLicensesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetOrgLicenses returns the licenses assigned to the organization
     * of the user who makes the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse> getOrgLicenses(
        com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrgLicensesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLicenses updates an organization's licenses.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse> updateLicenses(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLicensesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemovePermissionFromAllPermissionGroups removes a permission from
     * all permission groups in an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse> removePermissionFromAllPermissionGroups(
        com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemovePermissionFromAllPermissionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListP3PermissionGroups returns the list of p3 permission groups
     * for the user's org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> listP3PermissionGroups(
        com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListP3PermissionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListP3PermissionGroupsByOrgId returns the list of p3 permission groups
     * for an org by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse> listP3PermissionGroupsByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListP3PermissionGroupsByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateP3PermissionGroup creates a new p3 permission group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse> createP3PermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateP3PermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateP3PermissionGroup updates an existing p3 permission group.
     * Requires PERMISSION_GROUP_EDIT.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse> updateP3PermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateP3PermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateP3PermissionGroup updates an existing p3 permission group.
     * CUSTOMER_SUPPORT required for passing in an org id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse> updateP3PermissionGroupByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateP3PermissionGroupByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteP3PermissionGroup deletes a p3 permission group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse> deleteP3PermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteP3PermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignUsersP3PermissionGroup assigns a p3 permission group
     * to a list of users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse> assignUsersP3PermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignUsersP3PermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeUsersP3PermissionGroup revokes a p3 permission group
     * from a list of users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse> revokeUsersP3PermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeUsersP3PermissionGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORGANIZATION = 0;
  private static final int METHODID_GET_ORGANIZATION = 1;
  private static final int METHODID_GET_ORGANIZATION_BY_ID = 2;
  private static final int METHODID_UPDATE_ORGANIZATION = 3;
  private static final int METHODID_ARCHIVE_ORGANIZATION = 4;
  private static final int METHODID_UN_ARCHIVE_ORGANIZATION = 5;
  private static final int METHODID_LIST_ALL_ORGANIZATIONS_GLOBALLY = 6;
  private static final int METHODID_LIST_ORGANIZATIONS_BY_REGION = 7;
  private static final int METHODID_LIST_ARCHIVED_ORGANIZATIONS = 8;
  private static final int METHODID_CONVERT_ORG_TO_MANUAL = 9;
  private static final int METHODID_LIST_OWNED_ORGS = 10;
  private static final int METHODID_GET_ORGANIZATION_PREFERENCES = 11;
  private static final int METHODID_UPDATE_ORGANIZATION_PREFERENCES = 12;
  private static final int METHODID_GET_AGENT_PREFERENCES = 13;
  private static final int METHODID_UPDATE_AGENT_PREFERENCES = 14;
  private static final int METHODID_GET_CONTACT_PREFERENCES = 15;
  private static final int METHODID_UPDATE_CONTACT_PREFERENCES = 16;
  private static final int METHODID_GET_AUTHENTICATION_PREFERENCES = 17;
  private static final int METHODID_UPDATE_AUTHENTICATION_PREFERENCES = 18;
  private static final int METHODID_GET_WEBHOOK_PREFERENCES = 19;
  private static final int METHODID_UPDATE_WEBHOOK_PREFERENCES = 20;
  private static final int METHODID_GET_DASHBOARD_GENERAL_PREFERENCES = 21;
  private static final int METHODID_UPDATE_DASHBOARD_GENERAL_PREFERENCES = 22;
  private static final int METHODID_GET_DASHBOARD_QUEUE_PREFERENCES = 23;
  private static final int METHODID_UPDATE_DASHBOARD_QUEUE_PREFERENCES = 24;
  private static final int METHODID_GET_PHONE_PREFERENCES = 25;
  private static final int METHODID_UPDATE_PHONE_PREFERENCES = 26;
  private static final int METHODID_GET_COMPLIANCE_PREFERENCES = 27;
  private static final int METHODID_UPDATE_COMPLIANCE_PREFERENCES = 28;
  private static final int METHODID_GET_BROADCAST_PREFERENCES = 29;
  private static final int METHODID_UPDATE_BROADCAST_PREFERENCES = 30;
  private static final int METHODID_GET_SCHEDULE_PREFERENCES = 31;
  private static final int METHODID_UPDATE_SCHEDULE_PREFERENCES = 32;
  private static final int METHODID_GET_EMAIL_SMS_PREFERENCES = 33;
  private static final int METHODID_UPDATE_EMAIL_SMS_PREFERENCES = 34;
  private static final int METHODID_GET_BUSINESS_PREFERENCES = 35;
  private static final int METHODID_UPDATE_BUSINESS_PREFERENCES = 36;
  private static final int METHODID_GET_SCORECARDS_PREFERENCES = 37;
  private static final int METHODID_UPDATE_SCORECARDS_PREFERENCES = 38;
  private static final int METHODID_GET_VOICE_ANALYTICS_PREFERENCES = 39;
  private static final int METHODID_LIST_VOICE_ANALYTICS_PREFERENCES = 40;
  private static final int METHODID_UPDATE_VOICE_ANALYTICS_PREFERENCES = 41;
  private static final int METHODID_GET_END_OF_DAY_PREFERENCES = 42;
  private static final int METHODID_UPDATE_END_OF_DAY_PREFERENCES = 43;
  private static final int METHODID_GET_REPORT_FILTER_PREFERENCES = 44;
  private static final int METHODID_UPDATE_REPORT_FILTER_PREFERENCES = 45;
  private static final int METHODID_GET_RECORDING_PREFERENCES = 46;
  private static final int METHODID_UPDATE_RECORDING_PREFERENCES = 47;
  private static final int METHODID_GET_ADMIN_CLIENT_PREFERENCES = 48;
  private static final int METHODID_UPDATE_ADMIN_CLIENT_PREFERENCES = 49;
  private static final int METHODID_ACCEPT_LINKBACK_RECORDING_TERMS = 50;
  private static final int METHODID_LINKBACK_UPDATE_BROADCAST_TEMPLATES = 51;
  private static final int METHODID_RECORD_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT = 52;
  private static final int METHODID_CLEAR_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT = 53;
  private static final int METHODID_CREATE_USER = 54;
  private static final int METHODID_CREATE_DELEGATED_USER = 55;
  private static final int METHODID_GET_MY_USER = 56;
  private static final int METHODID_GET_USER = 57;
  private static final int METHODID_GET_USER_BY_ORG_ID = 58;
  private static final int METHODID_LIST_AGENTS = 59;
  private static final int METHODID_LIST_USERS = 60;
  private static final int METHODID_LIST_USERS_BY_ORG_ID = 61;
  private static final int METHODID_LIST_USERS_BY_REGION = 62;
  private static final int METHODID_UPDATE_MY_USER = 63;
  private static final int METHODID_UPDATE_USER = 64;
  private static final int METHODID_UPDATE_USER_LABELS = 65;
  private static final int METHODID_UPDATE_USER_CALLER_ID = 66;
  private static final int METHODID_UPDATE_USER_DISABLED = 67;
  private static final int METHODID_UPDATE_USER_DISABLED_BY_ORG_ID = 68;
  private static final int METHODID_GET_MY_USER_PASSWORD_RESET_LINK = 69;
  private static final int METHODID_GET_USER_PASSWORD_RESET_LINK = 70;
  private static final int METHODID_GET_USER_PASSWORD_RESET_LINK_BY_ORG_ID = 71;
  private static final int METHODID_GET_USER_LOGIN_INFO = 72;
  private static final int METHODID_GET_USER_EMAIL_VERIFIED = 73;
  private static final int METHODID_GET_USER_EMAIL_VERIFIED_BY_ORG_ID = 74;
  private static final int METHODID_SEND_USER_EMAIL_VERIFICATION = 75;
  private static final int METHODID_SEND_USER_EMAIL_VERIFICATION_BY_ORG_ID = 76;
  private static final int METHODID_GET_USER_SESSION_DATA = 77;
  private static final int METHODID_GET_AGENT_PROFILE_GROUP = 78;
  private static final int METHODID_LIST_AGENT_PROFILE_GROUPS = 79;
  private static final int METHODID_UPDATE_AGENT_PROFILE_GROUP = 80;
  private static final int METHODID_CREATE_AGENT_PROFILE_GROUP = 81;
  private static final int METHODID_DELETE_AGENT_PROFILE_GROUP = 82;
  private static final int METHODID_ASSIGN_AGENT_PROFILE_GROUPS = 83;
  private static final int METHODID_ADD_USER_SUBSCRIPTION = 84;
  private static final int METHODID_ADD_USER_SUBSCRIPTION_BY_USER_ID = 85;
  private static final int METHODID_GET_USER_SUBSCRIPTION = 86;
  private static final int METHODID_GET_USER_SUBSCRIPTION_BY_USER_ID = 87;
  private static final int METHODID_UPDATE_USER_SUBSCRIPTION = 88;
  private static final int METHODID_UPDATE_USER_SUBSCRIPTION_BY_USER_ID = 89;
  private static final int METHODID_REMOVE_USER_SUBSCRIPTION = 90;
  private static final int METHODID_REMOVE_USER_SUBSCRIPTION_BY_USER_ID = 91;
  private static final int METHODID_LIST_USER_SUBSCRIPTIONS = 92;
  private static final int METHODID_LIST_USER_SUBSCRIPTIONS_BY_USER_ID = 93;
  private static final int METHODID_LIST_ORG_SUBSCRIPTIONS = 94;
  private static final int METHODID_GET_HUNT_GROUP_SETTINGS = 95;
  private static final int METHODID_UPDATE_HUNT_GROUP_SETTINGS = 96;
  private static final int METHODID_LIST_CALLER_ID_BUCKETS = 97;
  private static final int METHODID_GET_DATA_DIP_TEMPLATE = 98;
  private static final int METHODID_LIST_DATA_DIP_TEMPLATES = 99;
  private static final int METHODID_CREATE_DATA_DIP_TEMPLATE = 100;
  private static final int METHODID_LIST_AGENT_RESPONSE_AUTO_RULES = 101;
  private static final int METHODID_CREATE_AGENT_RESPONSE_AUTO_RULES = 102;
  private static final int METHODID_UPDATE_AGENT_RESPONSE_AUTO_RULES = 103;
  private static final int METHODID_DELETE_AGENT_RESPONSE_AUTO_RULES = 104;
  private static final int METHODID_CREATE_TRUST = 105;
  private static final int METHODID_ACCEPT_TRUST = 106;
  private static final int METHODID_REJECT_TRUST = 107;
  private static final int METHODID_GET_TRUST = 108;
  private static final int METHODID_LIST_INCOMING_TRUSTS = 109;
  private static final int METHODID_LIST_GIVEN_TRUSTS = 110;
  private static final int METHODID_LIST_ASSIGNABLE_TRUSTS = 111;
  private static final int METHODID_DELETE_TRUST = 112;
  private static final int METHODID_ASSIGN_TRUST = 113;
  private static final int METHODID_UNASSIGN_TRUST = 114;
  private static final int METHODID_CREATE_LABEL = 115;
  private static final int METHODID_DELETE_LABEL = 116;
  private static final int METHODID_LIST_LABELS = 117;
  private static final int METHODID_GET_LABEL = 118;
  private static final int METHODID_UPDATE_LABEL = 119;
  private static final int METHODID_ASSIGN_LABEL = 120;
  private static final int METHODID_UNASSIGN_LABEL = 121;
  private static final int METHODID_GET_ASSIGNMENT_COUNTS = 122;
  private static final int METHODID_GET_ASSIGNABLE_LABELS = 123;
  private static final int METHODID_GET_PERMISSIONS = 124;
  private static final int METHODID_GET_USER_PERMISSIONS = 125;
  private static final int METHODID_CREATE_PERMISSION_GROUP = 126;
  private static final int METHODID_UPDATE_PERMISSION_GROUP = 127;
  private static final int METHODID_DELETE_PERMISSION_GROUP = 128;
  private static final int METHODID_LIST_PERMISSION_GROUPS = 129;
  private static final int METHODID_LIST_PERMISSION_GROUPS_BY_ORG_ID = 130;
  private static final int METHODID_ASSIGN_USERS_PERMISSION_GROUP = 131;
  private static final int METHODID_REVOKE_USERS_PERMISSION_GROUP = 132;
  private static final int METHODID_ASSIGN_ACCOUNT_OWNER_PERMISSION_TO_USER = 133;
  private static final int METHODID_REVOKE_ACCOUNT_OWNER_PERMISSION_FROM_USER = 134;
  private static final int METHODID_INIT_DEFAULT_PERMISSION_GROUPS = 135;
  private static final int METHODID_GET_ACCOUNT_OWNER_GROUP = 136;
  private static final int METHODID_GET_LICENSES = 137;
  private static final int METHODID_GET_ORG_LICENSES = 138;
  private static final int METHODID_UPDATE_LICENSES = 139;
  private static final int METHODID_REMOVE_PERMISSION_FROM_ALL_PERMISSION_GROUPS = 140;
  private static final int METHODID_LIST_P3PERMISSION_GROUPS = 141;
  private static final int METHODID_LIST_P3PERMISSION_GROUPS_BY_ORG_ID = 142;
  private static final int METHODID_CREATE_P3PERMISSION_GROUP = 143;
  private static final int METHODID_UPDATE_P3PERMISSION_GROUP = 144;
  private static final int METHODID_UPDATE_P3PERMISSION_GROUP_BY_ORG_ID = 145;
  private static final int METHODID_DELETE_P3PERMISSION_GROUP = 146;
  private static final int METHODID_ASSIGN_USERS_P3PERMISSION_GROUP = 147;
  private static final int METHODID_REVOKE_USERS_P3PERMISSION_GROUP = 148;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrgImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrgImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ORGANIZATION:
          serviceImpl.createOrganization((com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_BY_ID:
          serviceImpl.getOrganizationById((com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse>) responseObserver);
          break;
        case METHODID_ARCHIVE_ORGANIZATION:
          serviceImpl.archiveOrganization((com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse>) responseObserver);
          break;
        case METHODID_UN_ARCHIVE_ORGANIZATION:
          serviceImpl.unArchiveOrganization((com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse>) responseObserver);
          break;
        case METHODID_LIST_ALL_ORGANIZATIONS_GLOBALLY:
          serviceImpl.listAllOrganizationsGlobally((com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATIONS_BY_REGION:
          serviceImpl.listOrganizationsByRegion((com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse>) responseObserver);
          break;
        case METHODID_LIST_ARCHIVED_ORGANIZATIONS:
          serviceImpl.listArchivedOrganizations((com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse>) responseObserver);
          break;
        case METHODID_CONVERT_ORG_TO_MANUAL:
          serviceImpl.convertOrgToManual((com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse>) responseObserver);
          break;
        case METHODID_LIST_OWNED_ORGS:
          serviceImpl.listOwnedOrgs((com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_PREFERENCES:
          serviceImpl.getOrganizationPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_PREFERENCES:
          serviceImpl.updateOrganizationPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_PREFERENCES:
          serviceImpl.getAgentPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_PREFERENCES:
          serviceImpl.updateAgentPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_CONTACT_PREFERENCES:
          serviceImpl.getContactPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONTACT_PREFERENCES:
          serviceImpl.updateContactPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_AUTHENTICATION_PREFERENCES:
          serviceImpl.getAuthenticationPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTHENTICATION_PREFERENCES:
          serviceImpl.updateAuthenticationPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_WEBHOOK_PREFERENCES:
          serviceImpl.getWebhookPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WEBHOOK_PREFERENCES:
          serviceImpl.updateWebhookPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_DASHBOARD_GENERAL_PREFERENCES:
          serviceImpl.getDashboardGeneralPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARD_GENERAL_PREFERENCES:
          serviceImpl.updateDashboardGeneralPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_DASHBOARD_QUEUE_PREFERENCES:
          serviceImpl.getDashboardQueuePreferences((com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARD_QUEUE_PREFERENCES:
          serviceImpl.updateDashboardQueuePreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_PHONE_PREFERENCES:
          serviceImpl.getPhonePreferences((com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PHONE_PREFERENCES:
          serviceImpl.updatePhonePreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_COMPLIANCE_PREFERENCES:
          serviceImpl.getCompliancePreferences((com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMPLIANCE_PREFERENCES:
          serviceImpl.updateCompliancePreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_BROADCAST_PREFERENCES:
          serviceImpl.getBroadcastPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BROADCAST_PREFERENCES:
          serviceImpl.updateBroadcastPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_SCHEDULE_PREFERENCES:
          serviceImpl.getSchedulePreferences((com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULE_PREFERENCES:
          serviceImpl.updateSchedulePreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_EMAIL_SMS_PREFERENCES:
          serviceImpl.getEmailSmsPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL_SMS_PREFERENCES:
          serviceImpl.updateEmailSmsPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_BUSINESS_PREFERENCES:
          serviceImpl.getBusinessPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BUSINESS_PREFERENCES:
          serviceImpl.updateBusinessPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_SCORECARDS_PREFERENCES:
          serviceImpl.getScorecardsPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCORECARDS_PREFERENCES:
          serviceImpl.updateScorecardsPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_VOICE_ANALYTICS_PREFERENCES:
          serviceImpl.getVoiceAnalyticsPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse>) responseObserver);
          break;
        case METHODID_LIST_VOICE_ANALYTICS_PREFERENCES:
          serviceImpl.listVoiceAnalyticsPreferences((com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VOICE_ANALYTICS_PREFERENCES:
          serviceImpl.updateVoiceAnalyticsPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_END_OF_DAY_PREFERENCES:
          serviceImpl.getEndOfDayPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_END_OF_DAY_PREFERENCES:
          serviceImpl.updateEndOfDayPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_REPORT_FILTER_PREFERENCES:
          serviceImpl.getReportFilterPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REPORT_FILTER_PREFERENCES:
          serviceImpl.updateReportFilterPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_RECORDING_PREFERENCES:
          serviceImpl.getRecordingPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RECORDING_PREFERENCES:
          serviceImpl.updateRecordingPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_ADMIN_CLIENT_PREFERENCES:
          serviceImpl.getAdminClientPreferences((com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ADMIN_CLIENT_PREFERENCES:
          serviceImpl.updateAdminClientPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_LINKBACK_RECORDING_TERMS:
          serviceImpl.acceptLinkbackRecordingTerms((com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse>) responseObserver);
          break;
        case METHODID_LINKBACK_UPDATE_BROADCAST_TEMPLATES:
          serviceImpl.linkbackUpdateBroadcastTemplates((com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse>) responseObserver);
          break;
        case METHODID_RECORD_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT:
          serviceImpl.recordEmailUnsubscribeAcknowledgement((com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse>) responseObserver);
          break;
        case METHODID_CLEAR_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT:
          serviceImpl.clearEmailUnsubscribeAcknowledgement((com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.tcn.cloud.api.api.v1alpha1.org.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_DELEGATED_USER:
          serviceImpl.createDelegatedUser((com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateDelegatedUserResponse>) responseObserver);
          break;
        case METHODID_GET_MY_USER:
          serviceImpl.getMyUser((com.tcn.cloud.api.api.v1alpha1.org.GetMyUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.tcn.cloud.api.api.v1alpha1.org.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ORG_ID:
          serviceImpl.getUserByOrgId((com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserByOrgIdResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENTS:
          serviceImpl.listAgents((com.tcn.cloud.api.api.v1alpha1.org.ListAgentsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAgentsResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.tcn.cloud.api.api.v1alpha1.org.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUsersResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS_BY_ORG_ID:
          serviceImpl.listUsersByOrgId((com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS_BY_REGION:
          serviceImpl.listUsersByRegion((com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUsersByRegionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MY_USER:
          serviceImpl.updateMyUser((com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateMyUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.tcn.cloud.api.api.v1alpha1.org.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_LABELS:
          serviceImpl.updateUserLabels((com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_CALLER_ID:
          serviceImpl.updateUserCallerId((com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserCallerIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_DISABLED:
          serviceImpl.updateUserDisabled((com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_DISABLED_BY_ORG_ID:
          serviceImpl.updateUserDisabledByOrgId((com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserDisabledByOrgIdResponse>) responseObserver);
          break;
        case METHODID_GET_MY_USER_PASSWORD_RESET_LINK:
          serviceImpl.getMyUserPasswordResetLink((com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetMyUserPasswordResetLinkResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PASSWORD_RESET_LINK:
          serviceImpl.getUserPasswordResetLink((com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PASSWORD_RESET_LINK_BY_ORG_ID:
          serviceImpl.getUserPasswordResetLinkByOrgId((com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserPasswordResetLinkByOrgIdResponse>) responseObserver);
          break;
        case METHODID_GET_USER_LOGIN_INFO:
          serviceImpl.getUserLoginInfo((com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserLoginInfoResponse>) responseObserver);
          break;
        case METHODID_GET_USER_EMAIL_VERIFIED:
          serviceImpl.getUserEmailVerified((com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedResponse>) responseObserver);
          break;
        case METHODID_GET_USER_EMAIL_VERIFIED_BY_ORG_ID:
          serviceImpl.getUserEmailVerifiedByOrgId((com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserEmailVerifiedByOrgIdResponse>) responseObserver);
          break;
        case METHODID_SEND_USER_EMAIL_VERIFICATION:
          serviceImpl.sendUserEmailVerification((com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationResponse>) responseObserver);
          break;
        case METHODID_SEND_USER_EMAIL_VERIFICATION_BY_ORG_ID:
          serviceImpl.sendUserEmailVerificationByOrgId((com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.SendUserEmailVerificationByOrgIdResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SESSION_DATA:
          serviceImpl.getUserSessionData((com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserSessionDataResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_PROFILE_GROUP:
          serviceImpl.getAgentProfileGroup((com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_PROFILE_GROUPS:
          serviceImpl.listAgentProfileGroups((com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAgentProfileGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_PROFILE_GROUP:
          serviceImpl.updateAgentProfileGroup((com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_PROFILE_GROUP:
          serviceImpl.createAgentProfileGroup((com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_PROFILE_GROUP:
          serviceImpl.deleteAgentProfileGroup((com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_AGENT_PROFILE_GROUPS:
          serviceImpl.assignAgentProfileGroups((com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignAgentProfileGroupsResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_SUBSCRIPTION:
          serviceImpl.addUserSubscription((com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_SUBSCRIPTION_BY_USER_ID:
          serviceImpl.addUserSubscriptionByUserId((com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AddUserSubscriptionByUserIdResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SUBSCRIPTION:
          serviceImpl.getUserSubscription((com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SUBSCRIPTION_BY_USER_ID:
          serviceImpl.getUserSubscriptionByUserId((com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserSubscriptionByUserIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_SUBSCRIPTION:
          serviceImpl.updateUserSubscription((com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_SUBSCRIPTION_BY_USER_ID:
          serviceImpl.updateUserSubscriptionByUserId((com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateUserSubscriptionByUserIdResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_SUBSCRIPTION:
          serviceImpl.removeUserSubscription((com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_SUBSCRIPTION_BY_USER_ID:
          serviceImpl.removeUserSubscriptionByUserId((com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RemoveUserSubscriptionByUserIdResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_SUBSCRIPTIONS:
          serviceImpl.listUserSubscriptions((com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_SUBSCRIPTIONS_BY_USER_ID:
          serviceImpl.listUserSubscriptionsByUserId((com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListUserSubscriptionsByUserIdResponse>) responseObserver);
          break;
        case METHODID_LIST_ORG_SUBSCRIPTIONS:
          serviceImpl.listOrgSubscriptions((com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOrgSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_GET_HUNT_GROUP_SETTINGS:
          serviceImpl.getHuntGroupSettings((com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetHuntGroupSettingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HUNT_GROUP_SETTINGS:
          serviceImpl.updateHuntGroupSettings((com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupSettingsResponse>) responseObserver);
          break;
        case METHODID_LIST_CALLER_ID_BUCKETS:
          serviceImpl.listCallerIdBuckets((com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListCallerIdBucketsResponse>) responseObserver);
          break;
        case METHODID_GET_DATA_DIP_TEMPLATE:
          serviceImpl.getDataDipTemplate((com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_DATA_DIP_TEMPLATES:
          serviceImpl.listDataDipTemplates((com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse>) responseObserver);
          break;
        case METHODID_CREATE_DATA_DIP_TEMPLATE:
          serviceImpl.createDataDipTemplate((com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateDataDipTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_RESPONSE_AUTO_RULES:
          serviceImpl.listAgentResponseAutoRules((com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAgentResponseAutoRulesResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_RESPONSE_AUTO_RULES:
          serviceImpl.createAgentResponseAutoRules((com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_RESPONSE_AUTO_RULES:
          serviceImpl.updateAgentResponseAutoRules((com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentResponseAutoRulesResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_RESPONSE_AUTO_RULES:
          serviceImpl.deleteAgentResponseAutoRules((com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesResponse>) responseObserver);
          break;
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
        case METHODID_CREATE_LABEL:
          serviceImpl.createLabel((com.tcn.cloud.api.api.v1alpha1.org.CreateLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateLabelResponse>) responseObserver);
          break;
        case METHODID_DELETE_LABEL:
          serviceImpl.deleteLabel((com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteLabelResponse>) responseObserver);
          break;
        case METHODID_LIST_LABELS:
          serviceImpl.listLabels((com.tcn.cloud.api.api.v1alpha1.org.ListLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListLabelsResponse>) responseObserver);
          break;
        case METHODID_GET_LABEL:
          serviceImpl.getLabel((com.tcn.cloud.api.api.v1alpha1.org.GetLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetLabelResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LABEL:
          serviceImpl.updateLabel((com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateLabelResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_LABEL:
          serviceImpl.assignLabel((com.tcn.cloud.api.api.v1alpha1.org.AssignLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignLabelResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_LABEL:
          serviceImpl.unassignLabel((com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnassignLabelResponse>) responseObserver);
          break;
        case METHODID_GET_ASSIGNMENT_COUNTS:
          serviceImpl.getAssignmentCounts((com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse>) responseObserver);
          break;
        case METHODID_GET_ASSIGNABLE_LABELS:
          serviceImpl.getAssignableLabels((com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse>) responseObserver);
          break;
        case METHODID_GET_PERMISSIONS:
          serviceImpl.getPermissions((com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetPermissionsResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PERMISSIONS:
          serviceImpl.getUserPermissions((com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetUserPermissionsResponse>) responseObserver);
          break;
        case METHODID_CREATE_PERMISSION_GROUP:
          serviceImpl.createPermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreatePermissionGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PERMISSION_GROUP:
          serviceImpl.updatePermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdatePermissionGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_PERMISSION_GROUP:
          serviceImpl.deletePermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeletePermissionGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_PERMISSION_GROUPS:
          serviceImpl.listPermissionGroups((com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_PERMISSION_GROUPS_BY_ORG_ID:
          serviceImpl.listPermissionGroupsByOrgId((com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListPermissionGroupsByOrgIdResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_USERS_PERMISSION_GROUP:
          serviceImpl.assignUsersPermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersPermissionGroupResponse>) responseObserver);
          break;
        case METHODID_REVOKE_USERS_PERMISSION_GROUP:
          serviceImpl.revokeUsersPermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersPermissionGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_ACCOUNT_OWNER_PERMISSION_TO_USER:
          serviceImpl.assignAccountOwnerPermissionToUser((com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignAccountOwnerPermissionToUserResponse>) responseObserver);
          break;
        case METHODID_REVOKE_ACCOUNT_OWNER_PERMISSION_FROM_USER:
          serviceImpl.revokeAccountOwnerPermissionFromUser((com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RevokeAccountOwnerPermissionFromUserResponse>) responseObserver);
          break;
        case METHODID_INIT_DEFAULT_PERMISSION_GROUPS:
          serviceImpl.initDefaultPermissionGroups((com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.InitDefaultPermissionGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_OWNER_GROUP:
          serviceImpl.getAccountOwnerGroup((com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAccountOwnerGroupResponse>) responseObserver);
          break;
        case METHODID_GET_LICENSES:
          serviceImpl.getLicenses((com.tcn.cloud.api.api.v1alpha1.org.GetLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetLicensesResponse>) responseObserver);
          break;
        case METHODID_GET_ORG_LICENSES:
          serviceImpl.getOrgLicenses((com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LICENSES:
          serviceImpl.updateLicenses((com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateLicensesResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PERMISSION_FROM_ALL_PERMISSION_GROUPS:
          serviceImpl.removePermissionFromAllPermissionGroups((com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RemovePermissionFromAllPermissionGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_P3PERMISSION_GROUPS:
          serviceImpl.listP3PermissionGroups((com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_P3PERMISSION_GROUPS_BY_ORG_ID:
          serviceImpl.listP3PermissionGroupsByOrgId((com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListP3PermissionGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE_P3PERMISSION_GROUP:
          serviceImpl.createP3PermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateP3PermissionGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_P3PERMISSION_GROUP:
          serviceImpl.updateP3PermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_P3PERMISSION_GROUP_BY_ORG_ID:
          serviceImpl.updateP3PermissionGroupByOrgId((com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupByOrgIdResponse>) responseObserver);
          break;
        case METHODID_DELETE_P3PERMISSION_GROUP:
          serviceImpl.deleteP3PermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.DeleteP3PermissionGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_USERS_P3PERMISSION_GROUP:
          serviceImpl.assignUsersP3PermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupResponse>) responseObserver);
          break;
        case METHODID_REVOKE_USERS_P3PERMISSION_GROUP:
          serviceImpl.revokeUsersP3PermissionGroup((com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RevokeUsersP3PermissionGroupResponse>) responseObserver);
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

  private static abstract class OrgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Org");
    }
  }

  private static final class OrgFileDescriptorSupplier
      extends OrgBaseDescriptorSupplier {
    OrgFileDescriptorSupplier() {}
  }

  private static final class OrgMethodDescriptorSupplier
      extends OrgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrgMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrgFileDescriptorSupplier())
              .addMethod(getCreateOrganizationMethod())
              .addMethod(getGetOrganizationMethod())
              .addMethod(getGetOrganizationByIdMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getArchiveOrganizationMethod())
              .addMethod(getUnArchiveOrganizationMethod())
              .addMethod(getListAllOrganizationsGloballyMethod())
              .addMethod(getListOrganizationsByRegionMethod())
              .addMethod(getListArchivedOrganizationsMethod())
              .addMethod(getConvertOrgToManualMethod())
              .addMethod(getListOwnedOrgsMethod())
              .addMethod(getGetOrganizationPreferencesMethod())
              .addMethod(getUpdateOrganizationPreferencesMethod())
              .addMethod(getGetAgentPreferencesMethod())
              .addMethod(getUpdateAgentPreferencesMethod())
              .addMethod(getGetContactPreferencesMethod())
              .addMethod(getUpdateContactPreferencesMethod())
              .addMethod(getGetAuthenticationPreferencesMethod())
              .addMethod(getUpdateAuthenticationPreferencesMethod())
              .addMethod(getGetWebhookPreferencesMethod())
              .addMethod(getUpdateWebhookPreferencesMethod())
              .addMethod(getGetDashboardGeneralPreferencesMethod())
              .addMethod(getUpdateDashboardGeneralPreferencesMethod())
              .addMethod(getGetDashboardQueuePreferencesMethod())
              .addMethod(getUpdateDashboardQueuePreferencesMethod())
              .addMethod(getGetPhonePreferencesMethod())
              .addMethod(getUpdatePhonePreferencesMethod())
              .addMethod(getGetCompliancePreferencesMethod())
              .addMethod(getUpdateCompliancePreferencesMethod())
              .addMethod(getGetBroadcastPreferencesMethod())
              .addMethod(getUpdateBroadcastPreferencesMethod())
              .addMethod(getGetSchedulePreferencesMethod())
              .addMethod(getUpdateSchedulePreferencesMethod())
              .addMethod(getGetEmailSmsPreferencesMethod())
              .addMethod(getUpdateEmailSmsPreferencesMethod())
              .addMethod(getGetBusinessPreferencesMethod())
              .addMethod(getUpdateBusinessPreferencesMethod())
              .addMethod(getGetScorecardsPreferencesMethod())
              .addMethod(getUpdateScorecardsPreferencesMethod())
              .addMethod(getGetVoiceAnalyticsPreferencesMethod())
              .addMethod(getListVoiceAnalyticsPreferencesMethod())
              .addMethod(getUpdateVoiceAnalyticsPreferencesMethod())
              .addMethod(getGetEndOfDayPreferencesMethod())
              .addMethod(getUpdateEndOfDayPreferencesMethod())
              .addMethod(getGetReportFilterPreferencesMethod())
              .addMethod(getUpdateReportFilterPreferencesMethod())
              .addMethod(getGetRecordingPreferencesMethod())
              .addMethod(getUpdateRecordingPreferencesMethod())
              .addMethod(getGetAdminClientPreferencesMethod())
              .addMethod(getUpdateAdminClientPreferencesMethod())
              .addMethod(getAcceptLinkbackRecordingTermsMethod())
              .addMethod(getLinkbackUpdateBroadcastTemplatesMethod())
              .addMethod(getRecordEmailUnsubscribeAcknowledgementMethod())
              .addMethod(getClearEmailUnsubscribeAcknowledgementMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getCreateDelegatedUserMethod())
              .addMethod(getGetMyUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUserByOrgIdMethod())
              .addMethod(getListAgentsMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getListUsersByOrgIdMethod())
              .addMethod(getListUsersByRegionMethod())
              .addMethod(getUpdateMyUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getUpdateUserLabelsMethod())
              .addMethod(getUpdateUserCallerIdMethod())
              .addMethod(getUpdateUserDisabledMethod())
              .addMethod(getUpdateUserDisabledByOrgIdMethod())
              .addMethod(getGetMyUserPasswordResetLinkMethod())
              .addMethod(getGetUserPasswordResetLinkMethod())
              .addMethod(getGetUserPasswordResetLinkByOrgIdMethod())
              .addMethod(getGetUserLoginInfoMethod())
              .addMethod(getGetUserEmailVerifiedMethod())
              .addMethod(getGetUserEmailVerifiedByOrgIdMethod())
              .addMethod(getSendUserEmailVerificationMethod())
              .addMethod(getSendUserEmailVerificationByOrgIdMethod())
              .addMethod(getGetUserSessionDataMethod())
              .addMethod(getGetAgentProfileGroupMethod())
              .addMethod(getListAgentProfileGroupsMethod())
              .addMethod(getUpdateAgentProfileGroupMethod())
              .addMethod(getCreateAgentProfileGroupMethod())
              .addMethod(getDeleteAgentProfileGroupMethod())
              .addMethod(getAssignAgentProfileGroupsMethod())
              .addMethod(getAddUserSubscriptionMethod())
              .addMethod(getAddUserSubscriptionByUserIdMethod())
              .addMethod(getGetUserSubscriptionMethod())
              .addMethod(getGetUserSubscriptionByUserIdMethod())
              .addMethod(getUpdateUserSubscriptionMethod())
              .addMethod(getUpdateUserSubscriptionByUserIdMethod())
              .addMethod(getRemoveUserSubscriptionMethod())
              .addMethod(getRemoveUserSubscriptionByUserIdMethod())
              .addMethod(getListUserSubscriptionsMethod())
              .addMethod(getListUserSubscriptionsByUserIdMethod())
              .addMethod(getListOrgSubscriptionsMethod())
              .addMethod(getGetHuntGroupSettingsMethod())
              .addMethod(getUpdateHuntGroupSettingsMethod())
              .addMethod(getListCallerIdBucketsMethod())
              .addMethod(getGetDataDipTemplateMethod())
              .addMethod(getListDataDipTemplatesMethod())
              .addMethod(getCreateDataDipTemplateMethod())
              .addMethod(getListAgentResponseAutoRulesMethod())
              .addMethod(getCreateAgentResponseAutoRulesMethod())
              .addMethod(getUpdateAgentResponseAutoRulesMethod())
              .addMethod(getDeleteAgentResponseAutoRulesMethod())
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
              .addMethod(getCreateLabelMethod())
              .addMethod(getDeleteLabelMethod())
              .addMethod(getListLabelsMethod())
              .addMethod(getGetLabelMethod())
              .addMethod(getUpdateLabelMethod())
              .addMethod(getAssignLabelMethod())
              .addMethod(getUnassignLabelMethod())
              .addMethod(getGetAssignmentCountsMethod())
              .addMethod(getGetAssignableLabelsMethod())
              .addMethod(getGetPermissionsMethod())
              .addMethod(getGetUserPermissionsMethod())
              .addMethod(getCreatePermissionGroupMethod())
              .addMethod(getUpdatePermissionGroupMethod())
              .addMethod(getDeletePermissionGroupMethod())
              .addMethod(getListPermissionGroupsMethod())
              .addMethod(getListPermissionGroupsByOrgIdMethod())
              .addMethod(getAssignUsersPermissionGroupMethod())
              .addMethod(getRevokeUsersPermissionGroupMethod())
              .addMethod(getAssignAccountOwnerPermissionToUserMethod())
              .addMethod(getRevokeAccountOwnerPermissionFromUserMethod())
              .addMethod(getInitDefaultPermissionGroupsMethod())
              .addMethod(getGetAccountOwnerGroupMethod())
              .addMethod(getGetLicensesMethod())
              .addMethod(getGetOrgLicensesMethod())
              .addMethod(getUpdateLicensesMethod())
              .addMethod(getRemovePermissionFromAllPermissionGroupsMethod())
              .addMethod(getListP3PermissionGroupsMethod())
              .addMethod(getListP3PermissionGroupsByOrgIdMethod())
              .addMethod(getCreateP3PermissionGroupMethod())
              .addMethod(getUpdateP3PermissionGroupMethod())
              .addMethod(getUpdateP3PermissionGroupByOrgIdMethod())
              .addMethod(getDeleteP3PermissionGroupMethod())
              .addMethod(getAssignUsersP3PermissionGroupMethod())
              .addMethod(getRevokeUsersP3PermissionGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
