package com.tcn.cloud.api.services.org.hunt_groups.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * HuntGroupsService is the service for managing hunt groups and their related entities.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/org/hunt_groups/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HuntGroupsServiceGrpc {

  private HuntGroupsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.org.hunt_groups.v1alpha1.HuntGroupsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> getListHuntGroupExileLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHuntGroupExileLinks",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> getListHuntGroupExileLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> getListHuntGroupExileLinksMethod;
    if ((getListHuntGroupExileLinksMethod = HuntGroupsServiceGrpc.getListHuntGroupExileLinksMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getListHuntGroupExileLinksMethod = HuntGroupsServiceGrpc.getListHuntGroupExileLinksMethod) == null) {
          HuntGroupsServiceGrpc.getListHuntGroupExileLinksMethod = getListHuntGroupExileLinksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHuntGroupExileLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("ListHuntGroupExileLinks"))
              .build();
        }
      }
    }
    return getListHuntGroupExileLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> getCopyHuntGroupExileLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyHuntGroupExileLink",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> getCopyHuntGroupExileLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> getCopyHuntGroupExileLinkMethod;
    if ((getCopyHuntGroupExileLinkMethod = HuntGroupsServiceGrpc.getCopyHuntGroupExileLinkMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getCopyHuntGroupExileLinkMethod = HuntGroupsServiceGrpc.getCopyHuntGroupExileLinkMethod) == null) {
          HuntGroupsServiceGrpc.getCopyHuntGroupExileLinkMethod = getCopyHuntGroupExileLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyHuntGroupExileLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("CopyHuntGroupExileLink"))
              .build();
        }
      }
    }
    return getCopyHuntGroupExileLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> getUpdateHuntGroupExileLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHuntGroupExileLinks",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> getUpdateHuntGroupExileLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> getUpdateHuntGroupExileLinksMethod;
    if ((getUpdateHuntGroupExileLinksMethod = HuntGroupsServiceGrpc.getUpdateHuntGroupExileLinksMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getUpdateHuntGroupExileLinksMethod = HuntGroupsServiceGrpc.getUpdateHuntGroupExileLinksMethod) == null) {
          HuntGroupsServiceGrpc.getUpdateHuntGroupExileLinksMethod = getUpdateHuntGroupExileLinksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHuntGroupExileLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("UpdateHuntGroupExileLinks"))
              .build();
        }
      }
    }
    return getUpdateHuntGroupExileLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> getListHuntGroupAgentTriggersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHuntGroupAgentTriggers",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> getListHuntGroupAgentTriggersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> getListHuntGroupAgentTriggersMethod;
    if ((getListHuntGroupAgentTriggersMethod = HuntGroupsServiceGrpc.getListHuntGroupAgentTriggersMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getListHuntGroupAgentTriggersMethod = HuntGroupsServiceGrpc.getListHuntGroupAgentTriggersMethod) == null) {
          HuntGroupsServiceGrpc.getListHuntGroupAgentTriggersMethod = getListHuntGroupAgentTriggersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHuntGroupAgentTriggers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("ListHuntGroupAgentTriggers"))
              .build();
        }
      }
    }
    return getListHuntGroupAgentTriggersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> getCopyHuntGroupAgentTriggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyHuntGroupAgentTrigger",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> getCopyHuntGroupAgentTriggerMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> getCopyHuntGroupAgentTriggerMethod;
    if ((getCopyHuntGroupAgentTriggerMethod = HuntGroupsServiceGrpc.getCopyHuntGroupAgentTriggerMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getCopyHuntGroupAgentTriggerMethod = HuntGroupsServiceGrpc.getCopyHuntGroupAgentTriggerMethod) == null) {
          HuntGroupsServiceGrpc.getCopyHuntGroupAgentTriggerMethod = getCopyHuntGroupAgentTriggerMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyHuntGroupAgentTrigger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("CopyHuntGroupAgentTrigger"))
              .build();
        }
      }
    }
    return getCopyHuntGroupAgentTriggerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> getUpdateHuntGroupAgentTriggersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHuntGroupAgentTriggers",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> getUpdateHuntGroupAgentTriggersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> getUpdateHuntGroupAgentTriggersMethod;
    if ((getUpdateHuntGroupAgentTriggersMethod = HuntGroupsServiceGrpc.getUpdateHuntGroupAgentTriggersMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getUpdateHuntGroupAgentTriggersMethod = HuntGroupsServiceGrpc.getUpdateHuntGroupAgentTriggersMethod) == null) {
          HuntGroupsServiceGrpc.getUpdateHuntGroupAgentTriggersMethod = getUpdateHuntGroupAgentTriggersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHuntGroupAgentTriggers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("UpdateHuntGroupAgentTriggers"))
              .build();
        }
      }
    }
    return getUpdateHuntGroupAgentTriggersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse> getCopyHuntGroupToOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyHuntGroupToOrganization",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse> getCopyHuntGroupToOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse> getCopyHuntGroupToOrganizationMethod;
    if ((getCopyHuntGroupToOrganizationMethod = HuntGroupsServiceGrpc.getCopyHuntGroupToOrganizationMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getCopyHuntGroupToOrganizationMethod = HuntGroupsServiceGrpc.getCopyHuntGroupToOrganizationMethod) == null) {
          HuntGroupsServiceGrpc.getCopyHuntGroupToOrganizationMethod = getCopyHuntGroupToOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyHuntGroupToOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("CopyHuntGroupToOrganization"))
              .build();
        }
      }
    }
    return getCopyHuntGroupToOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse> getAdminCopyHuntGroupToOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdminCopyHuntGroupToOrganization",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse> getAdminCopyHuntGroupToOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse> getAdminCopyHuntGroupToOrganizationMethod;
    if ((getAdminCopyHuntGroupToOrganizationMethod = HuntGroupsServiceGrpc.getAdminCopyHuntGroupToOrganizationMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getAdminCopyHuntGroupToOrganizationMethod = HuntGroupsServiceGrpc.getAdminCopyHuntGroupToOrganizationMethod) == null) {
          HuntGroupsServiceGrpc.getAdminCopyHuntGroupToOrganizationMethod = getAdminCopyHuntGroupToOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdminCopyHuntGroupToOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("AdminCopyHuntGroupToOrganization"))
              .build();
        }
      }
    }
    return getAdminCopyHuntGroupToOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse> getAdminListHuntGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdminListHuntGroups",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse> getAdminListHuntGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse> getAdminListHuntGroupsMethod;
    if ((getAdminListHuntGroupsMethod = HuntGroupsServiceGrpc.getAdminListHuntGroupsMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getAdminListHuntGroupsMethod = HuntGroupsServiceGrpc.getAdminListHuntGroupsMethod) == null) {
          HuntGroupsServiceGrpc.getAdminListHuntGroupsMethod = getAdminListHuntGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdminListHuntGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("AdminListHuntGroups"))
              .build();
        }
      }
    }
    return getAdminListHuntGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse> getListAgentScriptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentScripts",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse> getListAgentScriptsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse> getListAgentScriptsMethod;
    if ((getListAgentScriptsMethod = HuntGroupsServiceGrpc.getListAgentScriptsMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getListAgentScriptsMethod = HuntGroupsServiceGrpc.getListAgentScriptsMethod) == null) {
          HuntGroupsServiceGrpc.getListAgentScriptsMethod = getListAgentScriptsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentScripts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("ListAgentScripts"))
              .build();
        }
      }
    }
    return getListAgentScriptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse> getCreateAgentClientInfoDisplayTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentClientInfoDisplayTemplate",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse> getCreateAgentClientInfoDisplayTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse> getCreateAgentClientInfoDisplayTemplateMethod;
    if ((getCreateAgentClientInfoDisplayTemplateMethod = HuntGroupsServiceGrpc.getCreateAgentClientInfoDisplayTemplateMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getCreateAgentClientInfoDisplayTemplateMethod = HuntGroupsServiceGrpc.getCreateAgentClientInfoDisplayTemplateMethod) == null) {
          HuntGroupsServiceGrpc.getCreateAgentClientInfoDisplayTemplateMethod = getCreateAgentClientInfoDisplayTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgentClientInfoDisplayTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("CreateAgentClientInfoDisplayTemplate"))
              .build();
        }
      }
    }
    return getCreateAgentClientInfoDisplayTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse> getUpdateAgentClientInfoDisplayTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentClientInfoDisplayTemplate",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse> getUpdateAgentClientInfoDisplayTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse> getUpdateAgentClientInfoDisplayTemplateMethod;
    if ((getUpdateAgentClientInfoDisplayTemplateMethod = HuntGroupsServiceGrpc.getUpdateAgentClientInfoDisplayTemplateMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getUpdateAgentClientInfoDisplayTemplateMethod = HuntGroupsServiceGrpc.getUpdateAgentClientInfoDisplayTemplateMethod) == null) {
          HuntGroupsServiceGrpc.getUpdateAgentClientInfoDisplayTemplateMethod = getUpdateAgentClientInfoDisplayTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentClientInfoDisplayTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("UpdateAgentClientInfoDisplayTemplate"))
              .build();
        }
      }
    }
    return getUpdateAgentClientInfoDisplayTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse> getGetAgentClientInfoDisplayTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentClientInfoDisplayTemplate",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse> getGetAgentClientInfoDisplayTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse> getGetAgentClientInfoDisplayTemplateMethod;
    if ((getGetAgentClientInfoDisplayTemplateMethod = HuntGroupsServiceGrpc.getGetAgentClientInfoDisplayTemplateMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getGetAgentClientInfoDisplayTemplateMethod = HuntGroupsServiceGrpc.getGetAgentClientInfoDisplayTemplateMethod) == null) {
          HuntGroupsServiceGrpc.getGetAgentClientInfoDisplayTemplateMethod = getGetAgentClientInfoDisplayTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentClientInfoDisplayTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("GetAgentClientInfoDisplayTemplate"))
              .build();
        }
      }
    }
    return getGetAgentClientInfoDisplayTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> getListAgentClientInfoDisplayTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentClientInfoDisplayTemplates",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> getListAgentClientInfoDisplayTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> getListAgentClientInfoDisplayTemplatesMethod;
    if ((getListAgentClientInfoDisplayTemplatesMethod = HuntGroupsServiceGrpc.getListAgentClientInfoDisplayTemplatesMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getListAgentClientInfoDisplayTemplatesMethod = HuntGroupsServiceGrpc.getListAgentClientInfoDisplayTemplatesMethod) == null) {
          HuntGroupsServiceGrpc.getListAgentClientInfoDisplayTemplatesMethod = getListAgentClientInfoDisplayTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentClientInfoDisplayTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("ListAgentClientInfoDisplayTemplates"))
              .build();
        }
      }
    }
    return getListAgentClientInfoDisplayTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> getListAgentCampaignClientInfoDisplayTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentCampaignClientInfoDisplayTemplates",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> getListAgentCampaignClientInfoDisplayTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> getListAgentCampaignClientInfoDisplayTemplatesMethod;
    if ((getListAgentCampaignClientInfoDisplayTemplatesMethod = HuntGroupsServiceGrpc.getListAgentCampaignClientInfoDisplayTemplatesMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getListAgentCampaignClientInfoDisplayTemplatesMethod = HuntGroupsServiceGrpc.getListAgentCampaignClientInfoDisplayTemplatesMethod) == null) {
          HuntGroupsServiceGrpc.getListAgentCampaignClientInfoDisplayTemplatesMethod = getListAgentCampaignClientInfoDisplayTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentCampaignClientInfoDisplayTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("ListAgentCampaignClientInfoDisplayTemplates"))
              .build();
        }
      }
    }
    return getListAgentCampaignClientInfoDisplayTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse> getDeleteAgentClientInfoDisplayTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentClientInfoDisplayTemplate",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse> getDeleteAgentClientInfoDisplayTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse> getDeleteAgentClientInfoDisplayTemplateMethod;
    if ((getDeleteAgentClientInfoDisplayTemplateMethod = HuntGroupsServiceGrpc.getDeleteAgentClientInfoDisplayTemplateMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getDeleteAgentClientInfoDisplayTemplateMethod = HuntGroupsServiceGrpc.getDeleteAgentClientInfoDisplayTemplateMethod) == null) {
          HuntGroupsServiceGrpc.getDeleteAgentClientInfoDisplayTemplateMethod = getDeleteAgentClientInfoDisplayTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgentClientInfoDisplayTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("DeleteAgentClientInfoDisplayTemplate"))
              .build();
        }
      }
    }
    return getDeleteAgentClientInfoDisplayTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse> getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignAgentClientInfoDisplayTemplateToHuntGroups",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse> getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse> getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod;
    if ((getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod = HuntGroupsServiceGrpc.getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod = HuntGroupsServiceGrpc.getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod) == null) {
          HuntGroupsServiceGrpc.getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod = getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignAgentClientInfoDisplayTemplateToHuntGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("AssignAgentClientInfoDisplayTemplateToHuntGroups"))
              .build();
        }
      }
    }
    return getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse> getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignAgentClientInfoDisplayTemplateFromHuntGroups",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse> getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse> getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod;
    if ((getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod = HuntGroupsServiceGrpc.getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod = HuntGroupsServiceGrpc.getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod) == null) {
          HuntGroupsServiceGrpc.getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod = getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnassignAgentClientInfoDisplayTemplateFromHuntGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("UnassignAgentClientInfoDisplayTemplateFromHuntGroups"))
              .build();
        }
      }
    }
    return getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HuntGroupsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceStub>() {
        @java.lang.Override
        public HuntGroupsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HuntGroupsServiceStub(channel, callOptions);
        }
      };
    return HuntGroupsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HuntGroupsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceBlockingStub>() {
        @java.lang.Override
        public HuntGroupsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HuntGroupsServiceBlockingStub(channel, callOptions);
        }
      };
    return HuntGroupsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HuntGroupsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceFutureStub>() {
        @java.lang.Override
        public HuntGroupsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HuntGroupsServiceFutureStub(channel, callOptions);
        }
      };
    return HuntGroupsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * HuntGroupsService is the service for managing hunt groups and their related entities.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListHuntGroupExileLinks returns a list of Exile links for a given hunt group.
     * </pre>
     */
    default void listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHuntGroupExileLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupExileLink copies an exile link from one hunt group to another.
     * It will create a new exile link in the destination hunt group with the same
     * settings/parameters as the source exile link.
     * </pre>
     */
    default void copyHuntGroupExileLink(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyHuntGroupExileLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupExileLinks updates the exile links for a hunt group.
     * It will create any new exile links that do not already exist in the hunt group,
     * update any existing exile links with the new settings/parameters, and
     * delete any exile links that are not in the request.
     * </pre>
     */
    default void updateHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHuntGroupExileLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListHuntGroupAgentTriggers returns a list of agent triggers for the given hunt group.
     * </pre>
     */
    default void listHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHuntGroupAgentTriggersMethod(), responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupAgentTrigger copys an agent trigger to the given hunt group in the same org.
     * </pre>
     */
    default void copyHuntGroupAgentTrigger(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyHuntGroupAgentTriggerMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupAgentTriggers updates all agent triggers for the given hunt group.
     * </pre>
     */
    default void updateHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHuntGroupAgentTriggersMethod(), responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupToOrganization copies a hunt group to a different organization.
     * The destination organization must be a child of the source organization.
     * This would create a new hunt group in the destination organization with the same
     * settings/parameters and all associated data (skill, call-queue config) as the source hunt group.
     * </pre>
     */
    default void copyHuntGroupToOrganization(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyHuntGroupToOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * AdminCopyHuntGroupToOrganization copies a hunt group to a different organization.
     * This will create a new hunt group in the destination organization with the same
     * settings/parameters and all associated data (skill, call-queue config) as the source hunt group.
     * </pre>
     */
    default void adminCopyHuntGroupToOrganization(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdminCopyHuntGroupToOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * AdminListHuntGroups returns a list of hunt groups for the given organization.
     * </pre>
     */
    default void adminListHuntGroups(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdminListHuntGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgentScripts returns a list of agent scripts for the given organization.
     * </pre>
     */
    default void listAgentScripts(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentScriptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateAgentClientInfoDisplayTemplate persists the given template.
     * </pre>
     */
    default void createAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentClientInfoDisplayTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentClientInfoDisplayTemplate persists changes to the given template.
     * </pre>
     */
    default void updateAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentClientInfoDisplayTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgentClientInfoDisplayTemplate returns requested template.
     * </pre>
     */
    default void getAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentClientInfoDisplayTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgentClientInfoDisplayTemplates returns org related templates.
     * </pre>
     */
    @java.lang.Deprecated
    default void listAgentClientInfoDisplayTemplates(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentClientInfoDisplayTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgentCampaignClientInfoDisplayTemplates returns org related templates.
     * </pre>
     */
    default void listAgentCampaignClientInfoDisplayTemplates(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentCampaignClientInfoDisplayTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAgentClientInfoDisplayTemplate removes the requested template.
     * </pre>
     */
    default void deleteAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgentClientInfoDisplayTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignAgentClientInfoDisplayTemplateToHuntGroups assigns a display template to the specified groups.
     * </pre>
     */
    default void assignAgentClientInfoDisplayTemplateToHuntGroups(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnassignAgentClientInfoDisplayTemplateFromHuntGroups removes display templates from the specified groups.
     * </pre>
     */
    default void unassignAgentClientInfoDisplayTemplateFromHuntGroups(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HuntGroupsService.
   * <pre>
   * HuntGroupsService is the service for managing hunt groups and their related entities.
   * </pre>
   */
  public static abstract class HuntGroupsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HuntGroupsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HuntGroupsService.
   * <pre>
   * HuntGroupsService is the service for managing hunt groups and their related entities.
   * </pre>
   */
  public static final class HuntGroupsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HuntGroupsServiceStub> {
    private HuntGroupsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuntGroupsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HuntGroupsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListHuntGroupExileLinks returns a list of Exile links for a given hunt group.
     * </pre>
     */
    public void listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHuntGroupExileLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupExileLink copies an exile link from one hunt group to another.
     * It will create a new exile link in the destination hunt group with the same
     * settings/parameters as the source exile link.
     * </pre>
     */
    public void copyHuntGroupExileLink(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyHuntGroupExileLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupExileLinks updates the exile links for a hunt group.
     * It will create any new exile links that do not already exist in the hunt group,
     * update any existing exile links with the new settings/parameters, and
     * delete any exile links that are not in the request.
     * </pre>
     */
    public void updateHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHuntGroupExileLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListHuntGroupAgentTriggers returns a list of agent triggers for the given hunt group.
     * </pre>
     */
    public void listHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHuntGroupAgentTriggersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupAgentTrigger copys an agent trigger to the given hunt group in the same org.
     * </pre>
     */
    public void copyHuntGroupAgentTrigger(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyHuntGroupAgentTriggerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupAgentTriggers updates all agent triggers for the given hunt group.
     * </pre>
     */
    public void updateHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHuntGroupAgentTriggersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupToOrganization copies a hunt group to a different organization.
     * The destination organization must be a child of the source organization.
     * This would create a new hunt group in the destination organization with the same
     * settings/parameters and all associated data (skill, call-queue config) as the source hunt group.
     * </pre>
     */
    public void copyHuntGroupToOrganization(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyHuntGroupToOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AdminCopyHuntGroupToOrganization copies a hunt group to a different organization.
     * This will create a new hunt group in the destination organization with the same
     * settings/parameters and all associated data (skill, call-queue config) as the source hunt group.
     * </pre>
     */
    public void adminCopyHuntGroupToOrganization(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdminCopyHuntGroupToOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AdminListHuntGroups returns a list of hunt groups for the given organization.
     * </pre>
     */
    public void adminListHuntGroups(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdminListHuntGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgentScripts returns a list of agent scripts for the given organization.
     * </pre>
     */
    public void listAgentScripts(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListAgentScriptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateAgentClientInfoDisplayTemplate persists the given template.
     * </pre>
     */
    public void createAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentClientInfoDisplayTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentClientInfoDisplayTemplate persists changes to the given template.
     * </pre>
     */
    public void updateAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentClientInfoDisplayTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgentClientInfoDisplayTemplate returns requested template.
     * </pre>
     */
    public void getAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentClientInfoDisplayTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgentClientInfoDisplayTemplates returns org related templates.
     * </pre>
     */
    @java.lang.Deprecated
    public void listAgentClientInfoDisplayTemplates(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentClientInfoDisplayTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgentCampaignClientInfoDisplayTemplates returns org related templates.
     * </pre>
     */
    public void listAgentCampaignClientInfoDisplayTemplates(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListAgentCampaignClientInfoDisplayTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAgentClientInfoDisplayTemplate removes the requested template.
     * </pre>
     */
    public void deleteAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgentClientInfoDisplayTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignAgentClientInfoDisplayTemplateToHuntGroups assigns a display template to the specified groups.
     * </pre>
     */
    public void assignAgentClientInfoDisplayTemplateToHuntGroups(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnassignAgentClientInfoDisplayTemplateFromHuntGroups removes display templates from the specified groups.
     * </pre>
     */
    public void unassignAgentClientInfoDisplayTemplateFromHuntGroups(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HuntGroupsService.
   * <pre>
   * HuntGroupsService is the service for managing hunt groups and their related entities.
   * </pre>
   */
  public static final class HuntGroupsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HuntGroupsServiceBlockingStub> {
    private HuntGroupsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuntGroupsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HuntGroupsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListHuntGroupExileLinks returns a list of Exile links for a given hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHuntGroupExileLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CopyHuntGroupExileLink copies an exile link from one hunt group to another.
     * It will create a new exile link in the destination hunt group with the same
     * settings/parameters as the source exile link.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse copyHuntGroupExileLink(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyHuntGroupExileLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupExileLinks updates the exile links for a hunt group.
     * It will create any new exile links that do not already exist in the hunt group,
     * update any existing exile links with the new settings/parameters, and
     * delete any exile links that are not in the request.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse updateHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHuntGroupExileLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListHuntGroupAgentTriggers returns a list of agent triggers for the given hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse listHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHuntGroupAgentTriggersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CopyHuntGroupAgentTrigger copys an agent trigger to the given hunt group in the same org.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse copyHuntGroupAgentTrigger(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyHuntGroupAgentTriggerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupAgentTriggers updates all agent triggers for the given hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse updateHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHuntGroupAgentTriggersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CopyHuntGroupToOrganization copies a hunt group to a different organization.
     * The destination organization must be a child of the source organization.
     * This would create a new hunt group in the destination organization with the same
     * settings/parameters and all associated data (skill, call-queue config) as the source hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse copyHuntGroupToOrganization(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyHuntGroupToOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AdminCopyHuntGroupToOrganization copies a hunt group to a different organization.
     * This will create a new hunt group in the destination organization with the same
     * settings/parameters and all associated data (skill, call-queue config) as the source hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse adminCopyHuntGroupToOrganization(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdminCopyHuntGroupToOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AdminListHuntGroups returns a list of hunt groups for the given organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse adminListHuntGroups(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdminListHuntGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgentScripts returns a list of agent scripts for the given organization.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse> listAgentScripts(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListAgentScriptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateAgentClientInfoDisplayTemplate persists the given template.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse createAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentClientInfoDisplayTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgentClientInfoDisplayTemplate persists changes to the given template.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse updateAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentClientInfoDisplayTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgentClientInfoDisplayTemplate returns requested template.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse getAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentClientInfoDisplayTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgentClientInfoDisplayTemplates returns org related templates.
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse listAgentClientInfoDisplayTemplates(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentClientInfoDisplayTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgentCampaignClientInfoDisplayTemplates returns org related templates.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> listAgentCampaignClientInfoDisplayTemplates(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListAgentCampaignClientInfoDisplayTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAgentClientInfoDisplayTemplate removes the requested template.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse deleteAgentClientInfoDisplayTemplate(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgentClientInfoDisplayTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignAgentClientInfoDisplayTemplateToHuntGroups assigns a display template to the specified groups.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse assignAgentClientInfoDisplayTemplateToHuntGroups(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnassignAgentClientInfoDisplayTemplateFromHuntGroups removes display templates from the specified groups.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse unassignAgentClientInfoDisplayTemplateFromHuntGroups(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HuntGroupsService.
   * <pre>
   * HuntGroupsService is the service for managing hunt groups and their related entities.
   * </pre>
   */
  public static final class HuntGroupsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HuntGroupsServiceFutureStub> {
    private HuntGroupsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuntGroupsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HuntGroupsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListHuntGroupExileLinks returns a list of Exile links for a given hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> listHuntGroupExileLinks(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHuntGroupExileLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CopyHuntGroupExileLink copies an exile link from one hunt group to another.
     * It will create a new exile link in the destination hunt group with the same
     * settings/parameters as the source exile link.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> copyHuntGroupExileLink(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyHuntGroupExileLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupExileLinks updates the exile links for a hunt group.
     * It will create any new exile links that do not already exist in the hunt group,
     * update any existing exile links with the new settings/parameters, and
     * delete any exile links that are not in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> updateHuntGroupExileLinks(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHuntGroupExileLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListHuntGroupAgentTriggers returns a list of agent triggers for the given hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> listHuntGroupAgentTriggers(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHuntGroupAgentTriggersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CopyHuntGroupAgentTrigger copys an agent trigger to the given hunt group in the same org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> copyHuntGroupAgentTrigger(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyHuntGroupAgentTriggerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupAgentTriggers updates all agent triggers for the given hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> updateHuntGroupAgentTriggers(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHuntGroupAgentTriggersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CopyHuntGroupToOrganization copies a hunt group to a different organization.
     * The destination organization must be a child of the source organization.
     * This would create a new hunt group in the destination organization with the same
     * settings/parameters and all associated data (skill, call-queue config) as the source hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse> copyHuntGroupToOrganization(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyHuntGroupToOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AdminCopyHuntGroupToOrganization copies a hunt group to a different organization.
     * This will create a new hunt group in the destination organization with the same
     * settings/parameters and all associated data (skill, call-queue config) as the source hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse> adminCopyHuntGroupToOrganization(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdminCopyHuntGroupToOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AdminListHuntGroups returns a list of hunt groups for the given organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse> adminListHuntGroups(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdminListHuntGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateAgentClientInfoDisplayTemplate persists the given template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse> createAgentClientInfoDisplayTemplate(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentClientInfoDisplayTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAgentClientInfoDisplayTemplate persists changes to the given template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse> updateAgentClientInfoDisplayTemplate(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentClientInfoDisplayTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgentClientInfoDisplayTemplate returns requested template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse> getAgentClientInfoDisplayTemplate(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentClientInfoDisplayTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAgentClientInfoDisplayTemplates returns org related templates.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse> listAgentClientInfoDisplayTemplates(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentClientInfoDisplayTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAgentClientInfoDisplayTemplate removes the requested template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse> deleteAgentClientInfoDisplayTemplate(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgentClientInfoDisplayTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignAgentClientInfoDisplayTemplateToHuntGroups assigns a display template to the specified groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse> assignAgentClientInfoDisplayTemplateToHuntGroups(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnassignAgentClientInfoDisplayTemplateFromHuntGroups removes display templates from the specified groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse> unassignAgentClientInfoDisplayTemplateFromHuntGroups(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_HUNT_GROUP_EXILE_LINKS = 0;
  private static final int METHODID_COPY_HUNT_GROUP_EXILE_LINK = 1;
  private static final int METHODID_UPDATE_HUNT_GROUP_EXILE_LINKS = 2;
  private static final int METHODID_LIST_HUNT_GROUP_AGENT_TRIGGERS = 3;
  private static final int METHODID_COPY_HUNT_GROUP_AGENT_TRIGGER = 4;
  private static final int METHODID_UPDATE_HUNT_GROUP_AGENT_TRIGGERS = 5;
  private static final int METHODID_COPY_HUNT_GROUP_TO_ORGANIZATION = 6;
  private static final int METHODID_ADMIN_COPY_HUNT_GROUP_TO_ORGANIZATION = 7;
  private static final int METHODID_ADMIN_LIST_HUNT_GROUPS = 8;
  private static final int METHODID_LIST_AGENT_SCRIPTS = 9;
  private static final int METHODID_CREATE_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE = 10;
  private static final int METHODID_UPDATE_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE = 11;
  private static final int METHODID_GET_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE = 12;
  private static final int METHODID_LIST_AGENT_CLIENT_INFO_DISPLAY_TEMPLATES = 13;
  private static final int METHODID_LIST_AGENT_CAMPAIGN_CLIENT_INFO_DISPLAY_TEMPLATES = 14;
  private static final int METHODID_DELETE_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE = 15;
  private static final int METHODID_ASSIGN_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE_TO_HUNT_GROUPS = 16;
  private static final int METHODID_UNASSIGN_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE_FROM_HUNT_GROUPS = 17;

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
        case METHODID_LIST_HUNT_GROUP_EXILE_LINKS:
          serviceImpl.listHuntGroupExileLinks((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse>) responseObserver);
          break;
        case METHODID_COPY_HUNT_GROUP_EXILE_LINK:
          serviceImpl.copyHuntGroupExileLink((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HUNT_GROUP_EXILE_LINKS:
          serviceImpl.updateHuntGroupExileLinks((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse>) responseObserver);
          break;
        case METHODID_LIST_HUNT_GROUP_AGENT_TRIGGERS:
          serviceImpl.listHuntGroupAgentTriggers((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse>) responseObserver);
          break;
        case METHODID_COPY_HUNT_GROUP_AGENT_TRIGGER:
          serviceImpl.copyHuntGroupAgentTrigger((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HUNT_GROUP_AGENT_TRIGGERS:
          serviceImpl.updateHuntGroupAgentTriggers((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse>) responseObserver);
          break;
        case METHODID_COPY_HUNT_GROUP_TO_ORGANIZATION:
          serviceImpl.copyHuntGroupToOrganization((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse>) responseObserver);
          break;
        case METHODID_ADMIN_COPY_HUNT_GROUP_TO_ORGANIZATION:
          serviceImpl.adminCopyHuntGroupToOrganization((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse>) responseObserver);
          break;
        case METHODID_ADMIN_LIST_HUNT_GROUPS:
          serviceImpl.adminListHuntGroups((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_SCRIPTS:
          serviceImpl.listAgentScripts((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE:
          serviceImpl.createAgentClientInfoDisplayTemplate((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE:
          serviceImpl.updateAgentClientInfoDisplayTemplate((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE:
          serviceImpl.getAgentClientInfoDisplayTemplate((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_CLIENT_INFO_DISPLAY_TEMPLATES:
          serviceImpl.listAgentClientInfoDisplayTemplates((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_CAMPAIGN_CLIENT_INFO_DISPLAY_TEMPLATES:
          serviceImpl.listAgentCampaignClientInfoDisplayTemplates((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE:
          serviceImpl.deleteAgentClientInfoDisplayTemplate((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE_TO_HUNT_GROUPS:
          serviceImpl.assignAgentClientInfoDisplayTemplateToHuntGroups((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE_FROM_HUNT_GROUPS:
          serviceImpl.unassignAgentClientInfoDisplayTemplateFromHuntGroups((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse>) responseObserver);
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
          getListHuntGroupExileLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse>(
                service, METHODID_LIST_HUNT_GROUP_EXILE_LINKS)))
        .addMethod(
          getCopyHuntGroupExileLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse>(
                service, METHODID_COPY_HUNT_GROUP_EXILE_LINK)))
        .addMethod(
          getUpdateHuntGroupExileLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse>(
                service, METHODID_UPDATE_HUNT_GROUP_EXILE_LINKS)))
        .addMethod(
          getListHuntGroupAgentTriggersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse>(
                service, METHODID_LIST_HUNT_GROUP_AGENT_TRIGGERS)))
        .addMethod(
          getCopyHuntGroupAgentTriggerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse>(
                service, METHODID_COPY_HUNT_GROUP_AGENT_TRIGGER)))
        .addMethod(
          getUpdateHuntGroupAgentTriggersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse>(
                service, METHODID_UPDATE_HUNT_GROUP_AGENT_TRIGGERS)))
        .addMethod(
          getCopyHuntGroupToOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupToOrganizationResponse>(
                service, METHODID_COPY_HUNT_GROUP_TO_ORGANIZATION)))
        .addMethod(
          getAdminCopyHuntGroupToOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminCopyHuntGroupToOrganizationResponse>(
                service, METHODID_ADMIN_COPY_HUNT_GROUP_TO_ORGANIZATION)))
        .addMethod(
          getAdminListHuntGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AdminListHuntGroupsResponse>(
                service, METHODID_ADMIN_LIST_HUNT_GROUPS)))
        .addMethod(
          getListAgentScriptsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentScriptsResponse>(
                service, METHODID_LIST_AGENT_SCRIPTS)))
        .addMethod(
          getCreateAgentClientInfoDisplayTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CreateAgentClientInfoDisplayTemplateResponse>(
                service, METHODID_CREATE_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE)))
        .addMethod(
          getUpdateAgentClientInfoDisplayTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateAgentClientInfoDisplayTemplateResponse>(
                service, METHODID_UPDATE_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE)))
        .addMethod(
          getGetAgentClientInfoDisplayTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateResponse>(
                service, METHODID_GET_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE)))
        .addMethod(
          getListAgentClientInfoDisplayTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse>(
                service, METHODID_LIST_AGENT_CLIENT_INFO_DISPLAY_TEMPLATES)))
        .addMethod(
          getListAgentCampaignClientInfoDisplayTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListAgentClientInfoDisplayTemplatesResponse>(
                service, METHODID_LIST_AGENT_CAMPAIGN_CLIENT_INFO_DISPLAY_TEMPLATES)))
        .addMethod(
          getDeleteAgentClientInfoDisplayTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.DeleteAgentClientInfoDisplayTemplateResponse>(
                service, METHODID_DELETE_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE)))
        .addMethod(
          getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.AssignAgentClientInfoDisplayTemplateToHuntGroupsResponse>(
                service, METHODID_ASSIGN_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE_TO_HUNT_GROUPS)))
        .addMethod(
          getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UnassignAgentClientInfoDisplayTemplateFromHuntGroupsResponse>(
                service, METHODID_UNASSIGN_AGENT_CLIENT_INFO_DISPLAY_TEMPLATE_FROM_HUNT_GROUPS)))
        .build();
  }

  private static abstract class HuntGroupsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HuntGroupsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HuntGroupsService");
    }
  }

  private static final class HuntGroupsServiceFileDescriptorSupplier
      extends HuntGroupsServiceBaseDescriptorSupplier {
    HuntGroupsServiceFileDescriptorSupplier() {}
  }

  private static final class HuntGroupsServiceMethodDescriptorSupplier
      extends HuntGroupsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HuntGroupsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HuntGroupsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HuntGroupsServiceFileDescriptorSupplier())
              .addMethod(getListHuntGroupExileLinksMethod())
              .addMethod(getCopyHuntGroupExileLinkMethod())
              .addMethod(getUpdateHuntGroupExileLinksMethod())
              .addMethod(getListHuntGroupAgentTriggersMethod())
              .addMethod(getCopyHuntGroupAgentTriggerMethod())
              .addMethod(getUpdateHuntGroupAgentTriggersMethod())
              .addMethod(getCopyHuntGroupToOrganizationMethod())
              .addMethod(getAdminCopyHuntGroupToOrganizationMethod())
              .addMethod(getAdminListHuntGroupsMethod())
              .addMethod(getListAgentScriptsMethod())
              .addMethod(getCreateAgentClientInfoDisplayTemplateMethod())
              .addMethod(getUpdateAgentClientInfoDisplayTemplateMethod())
              .addMethod(getGetAgentClientInfoDisplayTemplateMethod())
              .addMethod(getListAgentClientInfoDisplayTemplatesMethod())
              .addMethod(getListAgentCampaignClientInfoDisplayTemplatesMethod())
              .addMethod(getDeleteAgentClientInfoDisplayTemplateMethod())
              .addMethod(getAssignAgentClientInfoDisplayTemplateToHuntGroupsMethod())
              .addMethod(getUnassignAgentClientInfoDisplayTemplateFromHuntGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
