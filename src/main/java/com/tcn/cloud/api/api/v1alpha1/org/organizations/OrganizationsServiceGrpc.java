package com.tcn.cloud.api.api.v1alpha1.org.organizations;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/organizations/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrganizationsServiceGrpc {

  private OrganizationsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.organizations.OrganizationsService";

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
    if ((getCreateOrganizationMethod = OrganizationsServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getCreateOrganizationMethod = OrganizationsServiceGrpc.getCreateOrganizationMethod) == null) {
          OrganizationsServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("CreateOrganization"))
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
    if ((getGetOrganizationMethod = OrganizationsServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetOrganizationMethod = OrganizationsServiceGrpc.getGetOrganizationMethod) == null) {
          OrganizationsServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetOrganization"))
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
    if ((getGetOrganizationByIdMethod = OrganizationsServiceGrpc.getGetOrganizationByIdMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetOrganizationByIdMethod = OrganizationsServiceGrpc.getGetOrganizationByIdMethod) == null) {
          OrganizationsServiceGrpc.getGetOrganizationByIdMethod = getGetOrganizationByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetOrganizationById"))
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
    if ((getUpdateOrganizationMethod = OrganizationsServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = OrganizationsServiceGrpc.getUpdateOrganizationMethod) == null) {
          OrganizationsServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateOrganization"))
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
    if ((getArchiveOrganizationMethod = OrganizationsServiceGrpc.getArchiveOrganizationMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getArchiveOrganizationMethod = OrganizationsServiceGrpc.getArchiveOrganizationMethod) == null) {
          OrganizationsServiceGrpc.getArchiveOrganizationMethod = getArchiveOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArchiveOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("ArchiveOrganization"))
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
    if ((getUnArchiveOrganizationMethod = OrganizationsServiceGrpc.getUnArchiveOrganizationMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUnArchiveOrganizationMethod = OrganizationsServiceGrpc.getUnArchiveOrganizationMethod) == null) {
          OrganizationsServiceGrpc.getUnArchiveOrganizationMethod = getUnArchiveOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnArchiveOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UnArchiveOrganization"))
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
    if ((getListAllOrganizationsGloballyMethod = OrganizationsServiceGrpc.getListAllOrganizationsGloballyMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getListAllOrganizationsGloballyMethod = OrganizationsServiceGrpc.getListAllOrganizationsGloballyMethod) == null) {
          OrganizationsServiceGrpc.getListAllOrganizationsGloballyMethod = getListAllOrganizationsGloballyMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest, com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllOrganizationsGlobally"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("ListAllOrganizationsGlobally"))
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
    if ((getListOrganizationsByRegionMethod = OrganizationsServiceGrpc.getListOrganizationsByRegionMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getListOrganizationsByRegionMethod = OrganizationsServiceGrpc.getListOrganizationsByRegionMethod) == null) {
          OrganizationsServiceGrpc.getListOrganizationsByRegionMethod = getListOrganizationsByRegionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest, com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationsByRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("ListOrganizationsByRegion"))
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
    if ((getListArchivedOrganizationsMethod = OrganizationsServiceGrpc.getListArchivedOrganizationsMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getListArchivedOrganizationsMethod = OrganizationsServiceGrpc.getListArchivedOrganizationsMethod) == null) {
          OrganizationsServiceGrpc.getListArchivedOrganizationsMethod = getListArchivedOrganizationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListArchivedOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("ListArchivedOrganizations"))
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
    if ((getConvertOrgToManualMethod = OrganizationsServiceGrpc.getConvertOrgToManualMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getConvertOrgToManualMethod = OrganizationsServiceGrpc.getConvertOrgToManualMethod) == null) {
          OrganizationsServiceGrpc.getConvertOrgToManualMethod = getConvertOrgToManualMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest, com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConvertOrgToManual"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("ConvertOrgToManual"))
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
    if ((getListOwnedOrgsMethod = OrganizationsServiceGrpc.getListOwnedOrgsMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getListOwnedOrgsMethod = OrganizationsServiceGrpc.getListOwnedOrgsMethod) == null) {
          OrganizationsServiceGrpc.getListOwnedOrgsMethod = getListOwnedOrgsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest, com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOwnedOrgs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("ListOwnedOrgs"))
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
    if ((getGetOrganizationPreferencesMethod = OrganizationsServiceGrpc.getGetOrganizationPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetOrganizationPreferencesMethod = OrganizationsServiceGrpc.getGetOrganizationPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetOrganizationPreferencesMethod = getGetOrganizationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetOrganizationPreferences"))
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
    if ((getUpdateOrganizationPreferencesMethod = OrganizationsServiceGrpc.getUpdateOrganizationPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateOrganizationPreferencesMethod = OrganizationsServiceGrpc.getUpdateOrganizationPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateOrganizationPreferencesMethod = getUpdateOrganizationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateOrganizationPreferences"))
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
    if ((getGetAgentPreferencesMethod = OrganizationsServiceGrpc.getGetAgentPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetAgentPreferencesMethod = OrganizationsServiceGrpc.getGetAgentPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetAgentPreferencesMethod = getGetAgentPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetAgentPreferences"))
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
    if ((getUpdateAgentPreferencesMethod = OrganizationsServiceGrpc.getUpdateAgentPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateAgentPreferencesMethod = OrganizationsServiceGrpc.getUpdateAgentPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateAgentPreferencesMethod = getUpdateAgentPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateAgentPreferences"))
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
    if ((getGetContactPreferencesMethod = OrganizationsServiceGrpc.getGetContactPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetContactPreferencesMethod = OrganizationsServiceGrpc.getGetContactPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetContactPreferencesMethod = getGetContactPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContactPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetContactPreferences"))
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
    if ((getUpdateContactPreferencesMethod = OrganizationsServiceGrpc.getUpdateContactPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateContactPreferencesMethod = OrganizationsServiceGrpc.getUpdateContactPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateContactPreferencesMethod = getUpdateContactPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateContactPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateContactPreferences"))
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
    if ((getGetAuthenticationPreferencesMethod = OrganizationsServiceGrpc.getGetAuthenticationPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetAuthenticationPreferencesMethod = OrganizationsServiceGrpc.getGetAuthenticationPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetAuthenticationPreferencesMethod = getGetAuthenticationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthenticationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetAuthenticationPreferences"))
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
    if ((getUpdateAuthenticationPreferencesMethod = OrganizationsServiceGrpc.getUpdateAuthenticationPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateAuthenticationPreferencesMethod = OrganizationsServiceGrpc.getUpdateAuthenticationPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateAuthenticationPreferencesMethod = getUpdateAuthenticationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthenticationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateAuthenticationPreferences"))
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
    if ((getGetWebhookPreferencesMethod = OrganizationsServiceGrpc.getGetWebhookPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetWebhookPreferencesMethod = OrganizationsServiceGrpc.getGetWebhookPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetWebhookPreferencesMethod = getGetWebhookPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWebhookPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetWebhookPreferences"))
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
    if ((getUpdateWebhookPreferencesMethod = OrganizationsServiceGrpc.getUpdateWebhookPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateWebhookPreferencesMethod = OrganizationsServiceGrpc.getUpdateWebhookPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateWebhookPreferencesMethod = getUpdateWebhookPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWebhookPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateWebhookPreferences"))
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
    if ((getGetDashboardGeneralPreferencesMethod = OrganizationsServiceGrpc.getGetDashboardGeneralPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetDashboardGeneralPreferencesMethod = OrganizationsServiceGrpc.getGetDashboardGeneralPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetDashboardGeneralPreferencesMethod = getGetDashboardGeneralPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDashboardGeneralPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetDashboardGeneralPreferences"))
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
    if ((getUpdateDashboardGeneralPreferencesMethod = OrganizationsServiceGrpc.getUpdateDashboardGeneralPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateDashboardGeneralPreferencesMethod = OrganizationsServiceGrpc.getUpdateDashboardGeneralPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateDashboardGeneralPreferencesMethod = getUpdateDashboardGeneralPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDashboardGeneralPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateDashboardGeneralPreferences"))
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
    if ((getGetDashboardQueuePreferencesMethod = OrganizationsServiceGrpc.getGetDashboardQueuePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetDashboardQueuePreferencesMethod = OrganizationsServiceGrpc.getGetDashboardQueuePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetDashboardQueuePreferencesMethod = getGetDashboardQueuePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDashboardQueuePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetDashboardQueuePreferences"))
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
    if ((getUpdateDashboardQueuePreferencesMethod = OrganizationsServiceGrpc.getUpdateDashboardQueuePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateDashboardQueuePreferencesMethod = OrganizationsServiceGrpc.getUpdateDashboardQueuePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateDashboardQueuePreferencesMethod = getUpdateDashboardQueuePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDashboardQueuePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateDashboardQueuePreferences"))
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
    if ((getGetPhonePreferencesMethod = OrganizationsServiceGrpc.getGetPhonePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetPhonePreferencesMethod = OrganizationsServiceGrpc.getGetPhonePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetPhonePreferencesMethod = getGetPhonePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPhonePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetPhonePreferences"))
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
    if ((getUpdatePhonePreferencesMethod = OrganizationsServiceGrpc.getUpdatePhonePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdatePhonePreferencesMethod = OrganizationsServiceGrpc.getUpdatePhonePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdatePhonePreferencesMethod = getUpdatePhonePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePhonePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdatePhonePreferences"))
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
    if ((getGetCompliancePreferencesMethod = OrganizationsServiceGrpc.getGetCompliancePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetCompliancePreferencesMethod = OrganizationsServiceGrpc.getGetCompliancePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetCompliancePreferencesMethod = getGetCompliancePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCompliancePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetCompliancePreferences"))
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
    if ((getUpdateCompliancePreferencesMethod = OrganizationsServiceGrpc.getUpdateCompliancePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateCompliancePreferencesMethod = OrganizationsServiceGrpc.getUpdateCompliancePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateCompliancePreferencesMethod = getUpdateCompliancePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCompliancePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateCompliancePreferences"))
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
    if ((getGetBroadcastPreferencesMethod = OrganizationsServiceGrpc.getGetBroadcastPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetBroadcastPreferencesMethod = OrganizationsServiceGrpc.getGetBroadcastPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetBroadcastPreferencesMethod = getGetBroadcastPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBroadcastPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetBroadcastPreferences"))
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
    if ((getUpdateBroadcastPreferencesMethod = OrganizationsServiceGrpc.getUpdateBroadcastPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateBroadcastPreferencesMethod = OrganizationsServiceGrpc.getUpdateBroadcastPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateBroadcastPreferencesMethod = getUpdateBroadcastPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBroadcastPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateBroadcastPreferences"))
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
    if ((getGetSchedulePreferencesMethod = OrganizationsServiceGrpc.getGetSchedulePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetSchedulePreferencesMethod = OrganizationsServiceGrpc.getGetSchedulePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetSchedulePreferencesMethod = getGetSchedulePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSchedulePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetSchedulePreferences"))
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
    if ((getUpdateSchedulePreferencesMethod = OrganizationsServiceGrpc.getUpdateSchedulePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateSchedulePreferencesMethod = OrganizationsServiceGrpc.getUpdateSchedulePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateSchedulePreferencesMethod = getUpdateSchedulePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSchedulePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateSchedulePreferences"))
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
    if ((getGetEmailSmsPreferencesMethod = OrganizationsServiceGrpc.getGetEmailSmsPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetEmailSmsPreferencesMethod = OrganizationsServiceGrpc.getGetEmailSmsPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetEmailSmsPreferencesMethod = getGetEmailSmsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailSmsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetEmailSmsPreferences"))
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
    if ((getUpdateEmailSmsPreferencesMethod = OrganizationsServiceGrpc.getUpdateEmailSmsPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateEmailSmsPreferencesMethod = OrganizationsServiceGrpc.getUpdateEmailSmsPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateEmailSmsPreferencesMethod = getUpdateEmailSmsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmailSmsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateEmailSmsPreferences"))
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
    if ((getGetBusinessPreferencesMethod = OrganizationsServiceGrpc.getGetBusinessPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetBusinessPreferencesMethod = OrganizationsServiceGrpc.getGetBusinessPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetBusinessPreferencesMethod = getGetBusinessPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBusinessPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetBusinessPreferences"))
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
    if ((getUpdateBusinessPreferencesMethod = OrganizationsServiceGrpc.getUpdateBusinessPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateBusinessPreferencesMethod = OrganizationsServiceGrpc.getUpdateBusinessPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateBusinessPreferencesMethod = getUpdateBusinessPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBusinessPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateBusinessPreferences"))
              .build();
        }
      }
    }
    return getUpdateBusinessPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse> getUpdateAdminBusinessPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAdminBusinessPreferences",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse> getUpdateAdminBusinessPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse> getUpdateAdminBusinessPreferencesMethod;
    if ((getUpdateAdminBusinessPreferencesMethod = OrganizationsServiceGrpc.getUpdateAdminBusinessPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateAdminBusinessPreferencesMethod = OrganizationsServiceGrpc.getUpdateAdminBusinessPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateAdminBusinessPreferencesMethod = getUpdateAdminBusinessPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAdminBusinessPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateAdminBusinessPreferences"))
              .build();
        }
      }
    }
    return getUpdateAdminBusinessPreferencesMethod;
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
    if ((getGetScorecardsPreferencesMethod = OrganizationsServiceGrpc.getGetScorecardsPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetScorecardsPreferencesMethod = OrganizationsServiceGrpc.getGetScorecardsPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetScorecardsPreferencesMethod = getGetScorecardsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScorecardsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetScorecardsPreferences"))
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
    if ((getUpdateScorecardsPreferencesMethod = OrganizationsServiceGrpc.getUpdateScorecardsPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateScorecardsPreferencesMethod = OrganizationsServiceGrpc.getUpdateScorecardsPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateScorecardsPreferencesMethod = getUpdateScorecardsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScorecardsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateScorecardsPreferences"))
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
    if ((getGetVoiceAnalyticsPreferencesMethod = OrganizationsServiceGrpc.getGetVoiceAnalyticsPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetVoiceAnalyticsPreferencesMethod = OrganizationsServiceGrpc.getGetVoiceAnalyticsPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetVoiceAnalyticsPreferencesMethod = getGetVoiceAnalyticsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVoiceAnalyticsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetVoiceAnalyticsPreferences"))
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
    if ((getListVoiceAnalyticsPreferencesMethod = OrganizationsServiceGrpc.getListVoiceAnalyticsPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getListVoiceAnalyticsPreferencesMethod = OrganizationsServiceGrpc.getListVoiceAnalyticsPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getListVoiceAnalyticsPreferencesMethod = getListVoiceAnalyticsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVoiceAnalyticsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("ListVoiceAnalyticsPreferences"))
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
    if ((getUpdateVoiceAnalyticsPreferencesMethod = OrganizationsServiceGrpc.getUpdateVoiceAnalyticsPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateVoiceAnalyticsPreferencesMethod = OrganizationsServiceGrpc.getUpdateVoiceAnalyticsPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateVoiceAnalyticsPreferencesMethod = getUpdateVoiceAnalyticsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVoiceAnalyticsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateVoiceAnalyticsPreferences"))
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
    if ((getGetEndOfDayPreferencesMethod = OrganizationsServiceGrpc.getGetEndOfDayPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetEndOfDayPreferencesMethod = OrganizationsServiceGrpc.getGetEndOfDayPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetEndOfDayPreferencesMethod = getGetEndOfDayPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEndOfDayPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetEndOfDayPreferences"))
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
    if ((getUpdateEndOfDayPreferencesMethod = OrganizationsServiceGrpc.getUpdateEndOfDayPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateEndOfDayPreferencesMethod = OrganizationsServiceGrpc.getUpdateEndOfDayPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateEndOfDayPreferencesMethod = getUpdateEndOfDayPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEndOfDayPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateEndOfDayPreferences"))
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
    if ((getGetReportFilterPreferencesMethod = OrganizationsServiceGrpc.getGetReportFilterPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetReportFilterPreferencesMethod = OrganizationsServiceGrpc.getGetReportFilterPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetReportFilterPreferencesMethod = getGetReportFilterPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReportFilterPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetReportFilterPreferences"))
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
    if ((getUpdateReportFilterPreferencesMethod = OrganizationsServiceGrpc.getUpdateReportFilterPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateReportFilterPreferencesMethod = OrganizationsServiceGrpc.getUpdateReportFilterPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateReportFilterPreferencesMethod = getUpdateReportFilterPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReportFilterPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateReportFilterPreferences"))
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
    if ((getGetRecordingPreferencesMethod = OrganizationsServiceGrpc.getGetRecordingPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetRecordingPreferencesMethod = OrganizationsServiceGrpc.getGetRecordingPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetRecordingPreferencesMethod = getGetRecordingPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecordingPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetRecordingPreferences"))
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
    if ((getUpdateRecordingPreferencesMethod = OrganizationsServiceGrpc.getUpdateRecordingPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateRecordingPreferencesMethod = OrganizationsServiceGrpc.getUpdateRecordingPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateRecordingPreferencesMethod = getUpdateRecordingPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRecordingPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateRecordingPreferences"))
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
    if ((getGetAdminClientPreferencesMethod = OrganizationsServiceGrpc.getGetAdminClientPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetAdminClientPreferencesMethod = OrganizationsServiceGrpc.getGetAdminClientPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetAdminClientPreferencesMethod = getGetAdminClientPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdminClientPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetAdminClientPreferences"))
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
    if ((getUpdateAdminClientPreferencesMethod = OrganizationsServiceGrpc.getUpdateAdminClientPreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateAdminClientPreferencesMethod = OrganizationsServiceGrpc.getUpdateAdminClientPreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateAdminClientPreferencesMethod = getUpdateAdminClientPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest, com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAdminClientPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateAdminClientPreferences"))
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
    if ((getAcceptLinkbackRecordingTermsMethod = OrganizationsServiceGrpc.getAcceptLinkbackRecordingTermsMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getAcceptLinkbackRecordingTermsMethod = OrganizationsServiceGrpc.getAcceptLinkbackRecordingTermsMethod) == null) {
          OrganizationsServiceGrpc.getAcceptLinkbackRecordingTermsMethod = getAcceptLinkbackRecordingTermsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest, com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptLinkbackRecordingTerms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("AcceptLinkbackRecordingTerms"))
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
    if ((getLinkbackUpdateBroadcastTemplatesMethod = OrganizationsServiceGrpc.getLinkbackUpdateBroadcastTemplatesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getLinkbackUpdateBroadcastTemplatesMethod = OrganizationsServiceGrpc.getLinkbackUpdateBroadcastTemplatesMethod) == null) {
          OrganizationsServiceGrpc.getLinkbackUpdateBroadcastTemplatesMethod = getLinkbackUpdateBroadcastTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest, com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkbackUpdateBroadcastTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("LinkbackUpdateBroadcastTemplates"))
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
    if ((getRecordEmailUnsubscribeAcknowledgementMethod = OrganizationsServiceGrpc.getRecordEmailUnsubscribeAcknowledgementMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getRecordEmailUnsubscribeAcknowledgementMethod = OrganizationsServiceGrpc.getRecordEmailUnsubscribeAcknowledgementMethod) == null) {
          OrganizationsServiceGrpc.getRecordEmailUnsubscribeAcknowledgementMethod = getRecordEmailUnsubscribeAcknowledgementMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordEmailUnsubscribeAcknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("RecordEmailUnsubscribeAcknowledgement"))
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
    if ((getClearEmailUnsubscribeAcknowledgementMethod = OrganizationsServiceGrpc.getClearEmailUnsubscribeAcknowledgementMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getClearEmailUnsubscribeAcknowledgementMethod = OrganizationsServiceGrpc.getClearEmailUnsubscribeAcknowledgementMethod) == null) {
          OrganizationsServiceGrpc.getClearEmailUnsubscribeAcknowledgementMethod = getClearEmailUnsubscribeAcknowledgementMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearEmailUnsubscribeAcknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("ClearEmailUnsubscribeAcknowledgement"))
              .build();
        }
      }
    }
    return getClearEmailUnsubscribeAcknowledgementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrganizationsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceStub>() {
        @java.lang.Override
        public OrganizationsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsServiceStub(channel, callOptions);
        }
      };
    return OrganizationsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrganizationsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceBlockingStub>() {
        @java.lang.Override
        public OrganizationsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsServiceBlockingStub(channel, callOptions);
        }
      };
    return OrganizationsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrganizationsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceFutureStub>() {
        @java.lang.Override
        public OrganizationsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsServiceFutureStub(channel, callOptions);
        }
      };
    return OrganizationsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateOrganization creates a new organization entity and enables it for the
     * region it is getting created in.
     * </pre>
     */
    default void createOrganization(com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOrganization returns a single organization.
     * </pre>
     */
    default void getOrganization(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOrganizationById returns a single organization by a given orgId.
     * </pre>
     */
    default void getOrganizationById(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganization updates the mutable fields on the Organization entity
     * using the provided field mask.
     * </pre>
     */
    default void updateOrganization(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    default void archiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArchiveOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unarchives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    default void unArchiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnArchiveOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAllOrganizationsGlobally lists all organizations globally (archived and unarchived).
     * </pre>
     */
    default void listAllOrganizationsGlobally(com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllOrganizationsGloballyMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListOrganizationsByRegion lists organizations in the given region (unarchived).
     * </pre>
     */
    default void listOrganizationsByRegion(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationsByRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListArchivedOrganizations lists all archived organizations in the current region.
     * </pre>
     */
    default void listArchivedOrganizations(com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListArchivedOrganizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConvertOrgToManual converts an organization to manual only by org id.
     * </pre>
     */
    default void convertOrgToManual(com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertOrgToManualMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all orgs under the p3 hierarchy
     * </pre>
     */
    default void listOwnedOrgs(com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOwnedOrgsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    default void getOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    default void updateOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgentPreferences returns preferences controlling direct agent properties.
     * </pre>
     */
    default void getAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates preferences controlling direct agent
     * properties.
     * </pre>
     */
    default void updateAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetContactPreferences returns preferences for contact lists.
     * </pre>
     */
    default void getContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContactPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateContactPreferences updates preferences for contact lists.
     * </pre>
     */
    default void updateContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateContactPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns preferences for controlling the
     * </pre>
     */
    default void getAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthenticationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates preferences for controlling the
     * </pre>
     */
    default void updateAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthenticationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns preferences for web-hook push URLs.
     * </pre>
     */
    default void getWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWebhookPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates preferences for web-hook push URLs.
     * </pre>
     */
    default void updateWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWebhookPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns preferences for agent dashboard
     * controls.
     * </pre>
     */
    default void getDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDashboardGeneralPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates preferences for agent dashboard
     * controls.
     * </pre>
     */
    default void updateDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDashboardGeneralPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns preferences for controlling agent queue
     * and hold table settings.
     * </pre>
     */
    default void getDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDashboardQueuePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates preferences for controlling agent
     * queue and hold table settings.
     * </pre>
     */
    default void updateDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDashboardQueuePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPhonePreferences returns preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    default void getPhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPhonePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    default void updatePhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePhonePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCompliancePreferences returns preferences for natural language compliance
     * campaign settings.
     * </pre>
     */
    default void getCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompliancePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCompliancePreferences updates preferences for natural language
     * compliance campaign settings.
     * </pre>
     */
    default void updateCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCompliancePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    default void getBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBroadcastPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    default void updateBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBroadcastPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns preferences for editing campaign scheduling
     * properties.
     * </pre>
     */
    default void getSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSchedulePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences updates preferences for editing campaign
     * scheduling properties.
     * </pre>
     */
    default void updateSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSchedulePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns preferences for email and SMS management.
     * </pre>
     */
    default void getEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailSmsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEmailSmsPreferences updates preferences for email and SMS management.
     * </pre>
     */
    default void updateEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmailSmsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns preferences for business intelligence.
     * </pre>
     */
    default void getBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBusinessPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    default void updateBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBusinessPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAdminBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    default void updateAdminBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAdminBusinessPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns preferences for scorecards.
     * </pre>
     */
    default void getScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScorecardsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateScorecardsPreferences updates preferences for scorecards.
     * </pre>
     */
    default void updateScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScorecardsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns preferences for voice analytics.
     * </pre>
     */
    default void getVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVoiceAnalyticsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListVoiceAnalyticsPreferences lists preferences for voice analytics.
     * </pre>
     */
    default void listVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVoiceAnalyticsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateVoiceAnalyticsPreferences updates preferences for voice analytics.
     * </pre>
     */
    default void updateVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVoiceAnalyticsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns preferences for automated report jobs
     * </pre>
     */
    default void getEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEndOfDayPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences updates preferences for automated report jobs
     * </pre>
     */
    default void updateEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEndOfDayPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for filters in reports and
     * </pre>
     */
    default void getReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReportFilterPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for filters in reports and
     * </pre>
     */
    default void updateReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReportFilterPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns preferences for audio recording properties.
     * </pre>
     */
    default void getRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecordingPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates preferences for audio recording
     * properties.
     * </pre>
     */
    default void updateRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRecordingPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAdminClientPreferences returns preferences for essential organization
     * properties only to be used by account managers and customer support.
     * </pre>
     */
    default void getAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdminClientPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAdminClientPreferences updates preferences for essential organization
     * </pre>
     */
    default void updateAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAdminClientPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcceptLinkbackRecordingTerms insert a digital signature acceptance activity
     * log upon client acknowledgement of terms and conditions usage for linkback
     * recorded calls.
     * </pre>
     */
    default void acceptLinkbackRecordingTerms(com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcceptLinkbackRecordingTermsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template options action
     * parameters to reflect the linkback recording usage value.
     * </pre>
     */
    default void linkbackUpdateBroadcastTemplates(com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkbackUpdateBroadcastTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement insert an activity log upon client
     * acknowledgement of responsibility for their own email unsubscribe links.
     * </pre>
     */
    default void recordEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordEmailUnsubscribeAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement insert an activity log upon the client
     * revoking their responsibility for email unsubscribe links.
     * </pre>
     */
    default void clearEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearEmailUnsubscribeAcknowledgementMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrganizationsService.
   */
  public static abstract class OrganizationsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrganizationsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrganizationsService.
   */
  public static final class OrganizationsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrganizationsServiceStub> {
    private OrganizationsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization entity and enables it for the
     * region it is getting created in.
     * </pre>
     */
    public void createOrganization(com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetOrganization returns a single organization.
     * </pre>
     */
    public void getOrganization(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetOrganizationById returns a single organization by a given orgId.
     * </pre>
     */
    public void getOrganizationById(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public void archiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArchiveOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unarchives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public void unArchiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnArchiveOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAllOrganizationsGlobally lists all organizations globally (archived and unarchived).
     * </pre>
     */
    public void listAllOrganizationsGlobally(com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListAllOrganizationsGloballyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListOrganizationsByRegion lists organizations in the given region (unarchived).
     * </pre>
     */
    public void listOrganizationsByRegion(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListOrganizationsByRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListArchivedOrganizations lists all archived organizations in the current region.
     * </pre>
     */
    public void listArchivedOrganizations(com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListArchivedOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConvertOrgToManual converts an organization to manual only by org id.
     * </pre>
     */
    public void convertOrgToManual(com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertOrgToManualMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all orgs under the p3 hierarchy
     * </pre>
     */
    public void listOwnedOrgs(com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgentPreferences returns preferences controlling direct agent properties.
     * </pre>
     */
    public void getAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetContactPreferences returns preferences for contact lists.
     * </pre>
     */
    public void getContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContactPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateContactPreferences updates preferences for contact lists.
     * </pre>
     */
    public void updateContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateContactPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns preferences for controlling the
     * </pre>
     */
    public void getAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthenticationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates preferences for controlling the
     * </pre>
     */
    public void updateAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthenticationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns preferences for web-hook push URLs.
     * </pre>
     */
    public void getWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWebhookPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates preferences for web-hook push URLs.
     * </pre>
     */
    public void updateWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSchedulePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns preferences for email and SMS management.
     * </pre>
     */
    public void getEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailSmsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEmailSmsPreferences updates preferences for email and SMS management.
     * </pre>
     */
    public void updateEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmailSmsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns preferences for business intelligence.
     * </pre>
     */
    public void getBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBusinessPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public void updateBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBusinessPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAdminBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public void updateAdminBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAdminBusinessPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns preferences for scorecards.
     * </pre>
     */
    public void getScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScorecardsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateScorecardsPreferences updates preferences for scorecards.
     * </pre>
     */
    public void updateScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScorecardsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns preferences for voice analytics.
     * </pre>
     */
    public void getVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVoiceAnalyticsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListVoiceAnalyticsPreferences lists preferences for voice analytics.
     * </pre>
     */
    public void listVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVoiceAnalyticsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateVoiceAnalyticsPreferences updates preferences for voice analytics.
     * </pre>
     */
    public void updateVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVoiceAnalyticsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns preferences for automated report jobs
     * </pre>
     */
    public void getEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEndOfDayPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences updates preferences for automated report jobs
     * </pre>
     */
    public void updateEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEndOfDayPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for filters in reports and
     * </pre>
     */
    public void getReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReportFilterPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for filters in reports and
     * </pre>
     */
    public void updateReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReportFilterPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns preferences for audio recording properties.
     * </pre>
     */
    public void getRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdminClientPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAdminClientPreferences updates preferences for essential organization
     * </pre>
     */
    public void updateAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrganizationsService.
   */
  public static final class OrganizationsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrganizationsServiceBlockingStub> {
    private OrganizationsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization entity and enables it for the
     * region it is getting created in.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse createOrganization(com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOrganization returns a single organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse getOrganization(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOrganizationById returns a single organization by a given orgId.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse getOrganizationById(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateOrganization updates the mutable fields on the Organization entity
     * using the provided field mask.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse updateOrganization(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse archiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArchiveOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unarchives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse unArchiveOrganization(com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnArchiveOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAllOrganizationsGlobally lists all organizations globally (archived and unarchived).
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse> listAllOrganizationsGlobally(
        com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListAllOrganizationsGloballyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListOrganizationsByRegion lists organizations in the given region (unarchived).
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse> listOrganizationsByRegion(
        com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListOrganizationsByRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListArchivedOrganizations lists all archived organizations in the current region.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse> listArchivedOrganizations(
        com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListArchivedOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConvertOrgToManual converts an organization to manual only by org id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse convertOrgToManual(com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertOrgToManualMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all orgs under the p3 hierarchy
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse> listOwnedOrgs(
        com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListOwnedOrgsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse getOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates general preferences controlling basic
     * organization related properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse updateOrganizationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgentPreferences returns preferences controlling direct agent properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse getAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates preferences controlling direct agent
     * properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse updateAgentPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetContactPreferences returns preferences for contact lists.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse getContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContactPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateContactPreferences updates preferences for contact lists.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse updateContactPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateContactPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns preferences for controlling the
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse getAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthenticationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates preferences for controlling the
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse updateAuthenticationPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthenticationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns preferences for web-hook push URLs.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse getWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWebhookPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates preferences for web-hook push URLs.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse updateWebhookPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWebhookPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns preferences for agent dashboard
     * controls.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse getDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDashboardGeneralPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates preferences for agent dashboard
     * controls.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse updateDashboardGeneralPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDashboardGeneralPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns preferences for controlling agent queue
     * and hold table settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse getDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDashboardQueuePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates preferences for controlling agent
     * queue and hold table settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse updateDashboardQueuePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDashboardQueuePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPhonePreferences returns preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse getPhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPhonePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates preferences for phone dial options, call ID,
     * and other call properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse updatePhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePhonePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCompliancePreferences returns preferences for natural language compliance
     * campaign settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse getCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCompliancePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCompliancePreferences updates preferences for natural language
     * compliance campaign settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse updateCompliancePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCompliancePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse getBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBroadcastPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates preferences for editing templates and
     * broadcast scheduling properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse updateBroadcastPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBroadcastPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns preferences for editing campaign scheduling
     * properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse getSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSchedulePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences updates preferences for editing campaign
     * scheduling properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse updateSchedulePreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSchedulePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns preferences for email and SMS management.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse getEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailSmsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEmailSmsPreferences updates preferences for email and SMS management.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse updateEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmailSmsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns preferences for business intelligence.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse getBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBusinessPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse updateBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBusinessPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAdminBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse updateAdminBusinessPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAdminBusinessPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns preferences for scorecards.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse getScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScorecardsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateScorecardsPreferences updates preferences for scorecards.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse updateScorecardsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScorecardsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns preferences for voice analytics.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse getVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVoiceAnalyticsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListVoiceAnalyticsPreferences lists preferences for voice analytics.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse listVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVoiceAnalyticsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateVoiceAnalyticsPreferences updates preferences for voice analytics.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse updateVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVoiceAnalyticsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns preferences for automated report jobs
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse getEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEndOfDayPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences updates preferences for automated report jobs
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse updateEndOfDayPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEndOfDayPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for filters in reports and
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse getReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReportFilterPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for filters in reports and
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse updateReportFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReportFilterPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns preferences for audio recording properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse getRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRecordingPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates preferences for audio recording
     * properties.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse updateRecordingPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRecordingPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAdminClientPreferences returns preferences for essential organization
     * properties only to be used by account managers and customer support.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse getAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdminClientPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAdminClientPreferences updates preferences for essential organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse updateAdminClientPreferences(com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptLinkbackRecordingTermsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template options action
     * parameters to reflect the linkback recording usage value.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse linkbackUpdateBroadcastTemplates(com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkbackUpdateBroadcastTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement insert an activity log upon client
     * acknowledgement of responsibility for their own email unsubscribe links.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse recordEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordEmailUnsubscribeAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement insert an activity log upon the client
     * revoking their responsibility for email unsubscribe links.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse clearEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearEmailUnsubscribeAcknowledgementMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrganizationsService.
   */
  public static final class OrganizationsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrganizationsServiceFutureStub> {
    private OrganizationsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization entity and enables it for the
     * region it is getting created in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse> createOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetOrganization returns a single organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse> getOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetOrganizationById returns a single organization by a given orgId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse> getOrganizationById(
        com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse> archiveOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArchiveOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unarchives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse> unArchiveOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnArchiveOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConvertOrgToManual converts an organization to manual only by org id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse> convertOrgToManual(
        com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgentPreferences returns preferences controlling direct agent properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse> getAgentPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetContactPreferences returns preferences for contact lists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse> getContactPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContactPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateContactPreferences updates preferences for contact lists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse> updateContactPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateContactPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns preferences for controlling the
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse> getAuthenticationPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthenticationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates preferences for controlling the
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse> updateAuthenticationPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthenticationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns preferences for web-hook push URLs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse> getWebhookPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWebhookPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates preferences for web-hook push URLs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse> updateWebhookPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSchedulePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns preferences for email and SMS management.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse> getEmailSmsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailSmsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEmailSmsPreferences updates preferences for email and SMS management.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse> updateEmailSmsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmailSmsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns preferences for business intelligence.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse> getBusinessPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBusinessPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse> updateBusinessPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBusinessPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAdminBusinessPreferences updates preferences for business intelligence.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse> updateAdminBusinessPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAdminBusinessPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns preferences for scorecards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse> getScorecardsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScorecardsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateScorecardsPreferences updates preferences for scorecards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse> updateScorecardsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScorecardsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns preferences for voice analytics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse> getVoiceAnalyticsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVoiceAnalyticsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListVoiceAnalyticsPreferences lists preferences for voice analytics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse> listVoiceAnalyticsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVoiceAnalyticsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateVoiceAnalyticsPreferences updates preferences for voice analytics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse> updateVoiceAnalyticsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVoiceAnalyticsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns preferences for automated report jobs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse> getEndOfDayPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEndOfDayPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences updates preferences for automated report jobs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse> updateEndOfDayPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEndOfDayPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for filters in reports and
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse> getReportFilterPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReportFilterPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for filters in reports and
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse> updateReportFilterPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReportFilterPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns preferences for audio recording properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse> getRecordingPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdminClientPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAdminClientPreferences updates preferences for essential organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse> updateAdminClientPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request);
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
  private static final int METHODID_UPDATE_ADMIN_BUSINESS_PREFERENCES = 37;
  private static final int METHODID_GET_SCORECARDS_PREFERENCES = 38;
  private static final int METHODID_UPDATE_SCORECARDS_PREFERENCES = 39;
  private static final int METHODID_GET_VOICE_ANALYTICS_PREFERENCES = 40;
  private static final int METHODID_LIST_VOICE_ANALYTICS_PREFERENCES = 41;
  private static final int METHODID_UPDATE_VOICE_ANALYTICS_PREFERENCES = 42;
  private static final int METHODID_GET_END_OF_DAY_PREFERENCES = 43;
  private static final int METHODID_UPDATE_END_OF_DAY_PREFERENCES = 44;
  private static final int METHODID_GET_REPORT_FILTER_PREFERENCES = 45;
  private static final int METHODID_UPDATE_REPORT_FILTER_PREFERENCES = 46;
  private static final int METHODID_GET_RECORDING_PREFERENCES = 47;
  private static final int METHODID_UPDATE_RECORDING_PREFERENCES = 48;
  private static final int METHODID_GET_ADMIN_CLIENT_PREFERENCES = 49;
  private static final int METHODID_UPDATE_ADMIN_CLIENT_PREFERENCES = 50;
  private static final int METHODID_ACCEPT_LINKBACK_RECORDING_TERMS = 51;
  private static final int METHODID_LINKBACK_UPDATE_BROADCAST_TEMPLATES = 52;
  private static final int METHODID_RECORD_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT = 53;
  private static final int METHODID_CLEAR_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT = 54;

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
        case METHODID_UPDATE_ADMIN_BUSINESS_PREFERENCES:
          serviceImpl.updateAdminBusinessPreferences((com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse>) responseObserver);
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
          getCreateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationRequest,
              com.tcn.cloud.api.api.v1alpha1.org.CreateOrganizationResponse>(
                service, METHODID_CREATE_ORGANIZATION)))
        .addMethod(
          getGetOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationResponse>(
                service, METHODID_GET_ORGANIZATION)))
        .addMethod(
          getGetOrganizationByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationByIdResponse>(
                service, METHODID_GET_ORGANIZATION_BY_ID)))
        .addMethod(
          getUpdateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationResponse>(
                service, METHODID_UPDATE_ORGANIZATION)))
        .addMethod(
          getArchiveOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ArchiveOrganizationResponse>(
                service, METHODID_ARCHIVE_ORGANIZATION)))
        .addMethod(
          getUnArchiveOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UnArchiveOrganizationResponse>(
                service, METHODID_UN_ARCHIVE_ORGANIZATION)))
        .addMethod(
          getListAllOrganizationsGloballyMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ListAllOrganizationsGloballyResponse>(
                service, METHODID_LIST_ALL_ORGANIZATIONS_GLOBALLY)))
        .addMethod(
          getListOrganizationsByRegionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsByRegionResponse>(
                service, METHODID_LIST_ORGANIZATIONS_BY_REGION)))
        .addMethod(
          getListArchivedOrganizationsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ListArchivedOrganizationsResponse>(
                service, METHODID_LIST_ARCHIVED_ORGANIZATIONS)))
        .addMethod(
          getConvertOrgToManualMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ConvertOrgToManualResponse>(
                service, METHODID_CONVERT_ORG_TO_MANUAL)))
        .addMethod(
          getListOwnedOrgsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ListOwnedOrgsResponse>(
                service, METHODID_LIST_OWNED_ORGS)))
        .addMethod(
          getGetOrganizationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetOrganizationPreferencesResponse>(
                service, METHODID_GET_ORGANIZATION_PREFERENCES)))
        .addMethod(
          getUpdateOrganizationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesResponse>(
                service, METHODID_UPDATE_ORGANIZATION_PREFERENCES)))
        .addMethod(
          getGetAgentPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse>(
                service, METHODID_GET_AGENT_PREFERENCES)))
        .addMethod(
          getUpdateAgentPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateAgentPreferencesResponse>(
                service, METHODID_UPDATE_AGENT_PREFERENCES)))
        .addMethod(
          getGetContactPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetContactPreferencesResponse>(
                service, METHODID_GET_CONTACT_PREFERENCES)))
        .addMethod(
          getUpdateContactPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateContactPreferencesResponse>(
                service, METHODID_UPDATE_CONTACT_PREFERENCES)))
        .addMethod(
          getGetAuthenticationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetAuthenticationPreferencesResponse>(
                service, METHODID_GET_AUTHENTICATION_PREFERENCES)))
        .addMethod(
          getUpdateAuthenticationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateAuthenticationPreferencesResponse>(
                service, METHODID_UPDATE_AUTHENTICATION_PREFERENCES)))
        .addMethod(
          getGetWebhookPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetWebhookPreferencesResponse>(
                service, METHODID_GET_WEBHOOK_PREFERENCES)))
        .addMethod(
          getUpdateWebhookPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesResponse>(
                service, METHODID_UPDATE_WEBHOOK_PREFERENCES)))
        .addMethod(
          getGetDashboardGeneralPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetDashboardGeneralPreferencesResponse>(
                service, METHODID_GET_DASHBOARD_GENERAL_PREFERENCES)))
        .addMethod(
          getUpdateDashboardGeneralPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardGeneralPreferencesResponse>(
                service, METHODID_UPDATE_DASHBOARD_GENERAL_PREFERENCES)))
        .addMethod(
          getGetDashboardQueuePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse>(
                service, METHODID_GET_DASHBOARD_QUEUE_PREFERENCES)))
        .addMethod(
          getUpdateDashboardQueuePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateDashboardQueuePreferencesResponse>(
                service, METHODID_UPDATE_DASHBOARD_QUEUE_PREFERENCES)))
        .addMethod(
          getGetPhonePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetPhonePreferencesResponse>(
                service, METHODID_GET_PHONE_PREFERENCES)))
        .addMethod(
          getUpdatePhonePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdatePhonePreferencesResponse>(
                service, METHODID_UPDATE_PHONE_PREFERENCES)))
        .addMethod(
          getGetCompliancePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetCompliancePreferencesResponse>(
                service, METHODID_GET_COMPLIANCE_PREFERENCES)))
        .addMethod(
          getUpdateCompliancePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateCompliancePreferencesResponse>(
                service, METHODID_UPDATE_COMPLIANCE_PREFERENCES)))
        .addMethod(
          getGetBroadcastPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetBroadcastPreferencesResponse>(
                service, METHODID_GET_BROADCAST_PREFERENCES)))
        .addMethod(
          getUpdateBroadcastPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesResponse>(
                service, METHODID_UPDATE_BROADCAST_PREFERENCES)))
        .addMethod(
          getGetSchedulePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetSchedulePreferencesResponse>(
                service, METHODID_GET_SCHEDULE_PREFERENCES)))
        .addMethod(
          getUpdateSchedulePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateSchedulePreferencesResponse>(
                service, METHODID_UPDATE_SCHEDULE_PREFERENCES)))
        .addMethod(
          getGetEmailSmsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetEmailSmsPreferencesResponse>(
                service, METHODID_GET_EMAIL_SMS_PREFERENCES)))
        .addMethod(
          getUpdateEmailSmsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateEmailSmsPreferencesResponse>(
                service, METHODID_UPDATE_EMAIL_SMS_PREFERENCES)))
        .addMethod(
          getGetBusinessPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetBusinessPreferencesResponse>(
                service, METHODID_GET_BUSINESS_PREFERENCES)))
        .addMethod(
          getUpdateBusinessPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateBusinessPreferencesResponse>(
                service, METHODID_UPDATE_BUSINESS_PREFERENCES)))
        .addMethod(
          getUpdateAdminBusinessPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminBusinessPreferencesResponse>(
                service, METHODID_UPDATE_ADMIN_BUSINESS_PREFERENCES)))
        .addMethod(
          getGetScorecardsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetScorecardsPreferencesResponse>(
                service, METHODID_GET_SCORECARDS_PREFERENCES)))
        .addMethod(
          getUpdateScorecardsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateScorecardsPreferencesResponse>(
                service, METHODID_UPDATE_SCORECARDS_PREFERENCES)))
        .addMethod(
          getGetVoiceAnalyticsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetVoiceAnalyticsPreferencesResponse>(
                service, METHODID_GET_VOICE_ANALYTICS_PREFERENCES)))
        .addMethod(
          getListVoiceAnalyticsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ListVoiceAnalyticsPreferencesResponse>(
                service, METHODID_LIST_VOICE_ANALYTICS_PREFERENCES)))
        .addMethod(
          getUpdateVoiceAnalyticsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateVoiceAnalyticsPreferencesResponse>(
                service, METHODID_UPDATE_VOICE_ANALYTICS_PREFERENCES)))
        .addMethod(
          getGetEndOfDayPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetEndOfDayPreferencesResponse>(
                service, METHODID_GET_END_OF_DAY_PREFERENCES)))
        .addMethod(
          getUpdateEndOfDayPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateEndOfDayPreferencesResponse>(
                service, METHODID_UPDATE_END_OF_DAY_PREFERENCES)))
        .addMethod(
          getGetReportFilterPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetFilterPreferencesResponse>(
                service, METHODID_GET_REPORT_FILTER_PREFERENCES)))
        .addMethod(
          getUpdateReportFilterPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateFilterPreferencesResponse>(
                service, METHODID_UPDATE_REPORT_FILTER_PREFERENCES)))
        .addMethod(
          getGetRecordingPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetRecordingPreferencesResponse>(
                service, METHODID_GET_RECORDING_PREFERENCES)))
        .addMethod(
          getUpdateRecordingPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesResponse>(
                service, METHODID_UPDATE_RECORDING_PREFERENCES)))
        .addMethod(
          getGetAdminClientPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse>(
                service, METHODID_GET_ADMIN_CLIENT_PREFERENCES)))
        .addMethod(
          getUpdateAdminClientPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.UpdateAdminClientPreferencesResponse>(
                service, METHODID_UPDATE_ADMIN_CLIENT_PREFERENCES)))
        .addMethod(
          getAcceptLinkbackRecordingTermsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.AcceptLinkbackRecordingTermsResponse>(
                service, METHODID_ACCEPT_LINKBACK_RECORDING_TERMS)))
        .addMethod(
          getLinkbackUpdateBroadcastTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.LinkbackUpdateBroadcastTemplatesResponse>(
                service, METHODID_LINKBACK_UPDATE_BROADCAST_TEMPLATES)))
        .addMethod(
          getRecordEmailUnsubscribeAcknowledgementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementRequest,
              com.tcn.cloud.api.api.v1alpha1.org.RecordEmailUnsubscribeAcknowledgementResponse>(
                service, METHODID_RECORD_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT)))
        .addMethod(
          getClearEmailUnsubscribeAcknowledgementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementRequest,
              com.tcn.cloud.api.api.v1alpha1.org.ClearEmailUnsubscribeAcknowledgementResponse>(
                service, METHODID_CLEAR_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT)))
        .build();
  }

  private static abstract class OrganizationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrganizationsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrganizationsService");
    }
  }

  private static final class OrganizationsServiceFileDescriptorSupplier
      extends OrganizationsServiceBaseDescriptorSupplier {
    OrganizationsServiceFileDescriptorSupplier() {}
  }

  private static final class OrganizationsServiceMethodDescriptorSupplier
      extends OrganizationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrganizationsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrganizationsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrganizationsServiceFileDescriptorSupplier())
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
              .addMethod(getUpdateAdminBusinessPreferencesMethod())
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
              .build();
        }
      }
    }
    return result;
  }
}
