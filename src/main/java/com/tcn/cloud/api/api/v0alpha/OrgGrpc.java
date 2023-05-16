package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: api/v0alpha/org.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrgGrpc {

  private OrgGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.Org";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest,
      com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse> getRegisterOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterOrganization",
      requestType = com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest,
      com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse> getRegisterOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest, com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse> getRegisterOrganizationMethod;
    if ((getRegisterOrganizationMethod = OrgGrpc.getRegisterOrganizationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRegisterOrganizationMethod = OrgGrpc.getRegisterOrganizationMethod) == null) {
          OrgGrpc.getRegisterOrganizationMethod = getRegisterOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest, com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RegisterOrganization"))
              .build();
        }
      }
    }
    return getRegisterOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest,
      com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse> getConvertOrgToManualMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConvertOrgToManual",
      requestType = com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest,
      com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse> getConvertOrgToManualMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest, com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse> getConvertOrgToManualMethod;
    if ((getConvertOrgToManualMethod = OrgGrpc.getConvertOrgToManualMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getConvertOrgToManualMethod = OrgGrpc.getConvertOrgToManualMethod) == null) {
          OrgGrpc.getConvertOrgToManualMethod = getConvertOrgToManualMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest, com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConvertOrgToManual"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ConvertOrgToManual"))
              .build();
        }
      }
    }
    return getConvertOrgToManualMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest, com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = OrgGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateOrganizationMethod = OrgGrpc.getUpdateOrganizationMethod) == null) {
          OrgGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest, com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateOrganization"))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest,
      com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse> getArchiveOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArchiveOrganization",
      requestType = com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest,
      com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse> getArchiveOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest, com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse> getArchiveOrganizationMethod;
    if ((getArchiveOrganizationMethod = OrgGrpc.getArchiveOrganizationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getArchiveOrganizationMethod = OrgGrpc.getArchiveOrganizationMethod) == null) {
          OrgGrpc.getArchiveOrganizationMethod = getArchiveOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest, com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArchiveOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ArchiveOrganization"))
              .build();
        }
      }
    }
    return getArchiveOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest,
      com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse> getUnArchiveOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnArchiveOrganization",
      requestType = com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest,
      com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse> getUnArchiveOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest, com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse> getUnArchiveOrganizationMethod;
    if ((getUnArchiveOrganizationMethod = OrgGrpc.getUnArchiveOrganizationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUnArchiveOrganizationMethod = OrgGrpc.getUnArchiveOrganizationMethod) == null) {
          OrgGrpc.getUnArchiveOrganizationMethod = getUnArchiveOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest, com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnArchiveOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UnArchiveOrganization"))
              .build();
        }
      }
    }
    return getUnArchiveOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest,
      com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse> getListArchivedOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListArchivedOrganizations",
      requestType = com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest,
      com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse> getListArchivedOrganizationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest, com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse> getListArchivedOrganizationsMethod;
    if ((getListArchivedOrganizationsMethod = OrgGrpc.getListArchivedOrganizationsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListArchivedOrganizationsMethod = OrgGrpc.getListArchivedOrganizationsMethod) == null) {
          OrgGrpc.getListArchivedOrganizationsMethod = getListArchivedOrganizationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest, com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListArchivedOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListArchivedOrganizations"))
              .build();
        }
      }
    }
    return getListArchivedOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> getGetOrganizationProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationProfile",
      requestType = com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> getGetOrganizationProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest, com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> getGetOrganizationProfileMethod;
    if ((getGetOrganizationProfileMethod = OrgGrpc.getGetOrganizationProfileMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetOrganizationProfileMethod = OrgGrpc.getGetOrganizationProfileMethod) == null) {
          OrgGrpc.getGetOrganizationProfileMethod = getGetOrganizationProfileMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest, com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetOrganizationProfile"))
              .build();
        }
      }
    }
    return getGetOrganizationProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> getGetOrganizationProfileByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationProfileById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> getGetOrganizationProfileByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest, com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> getGetOrganizationProfileByIdMethod;
    if ((getGetOrganizationProfileByIdMethod = OrgGrpc.getGetOrganizationProfileByIdMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetOrganizationProfileByIdMethod = OrgGrpc.getGetOrganizationProfileByIdMethod) == null) {
          OrgGrpc.getGetOrganizationProfileByIdMethod = getGetOrganizationProfileByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest, com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationProfileById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetOrganizationProfileById"))
              .build();
        }
      }
    }
    return getGetOrganizationProfileByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse> getListOrganizationDescriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationDescriptions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse> getListOrganizationDescriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse> getListOrganizationDescriptionsMethod;
    if ((getListOrganizationDescriptionsMethod = OrgGrpc.getListOrganizationDescriptionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListOrganizationDescriptionsMethod = OrgGrpc.getListOrganizationDescriptionsMethod) == null) {
          OrgGrpc.getListOrganizationDescriptionsMethod = getListOrganizationDescriptionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationDescriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListOrganizationDescriptions"))
              .build();
        }
      }
    }
    return getListOrganizationDescriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest,
      com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse> getListRegionalOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRegionalOrganizations",
      requestType = com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest,
      com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse> getListRegionalOrganizationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest, com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse> getListRegionalOrganizationsMethod;
    if ((getListRegionalOrganizationsMethod = OrgGrpc.getListRegionalOrganizationsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListRegionalOrganizationsMethod = OrgGrpc.getListRegionalOrganizationsMethod) == null) {
          OrgGrpc.getListRegionalOrganizationsMethod = getListRegionalOrganizationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest, com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRegionalOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListRegionalOrganizations"))
              .build();
        }
      }
    }
    return getListRegionalOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse> getUpdateP3OwningOrgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateP3OwningOrg",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse> getUpdateP3OwningOrgMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest, com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse> getUpdateP3OwningOrgMethod;
    if ((getUpdateP3OwningOrgMethod = OrgGrpc.getUpdateP3OwningOrgMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateP3OwningOrgMethod = OrgGrpc.getUpdateP3OwningOrgMethod) == null) {
          OrgGrpc.getUpdateP3OwningOrgMethod = getUpdateP3OwningOrgMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest, com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateP3OwningOrg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateP3OwningOrg"))
              .build();
        }
      }
    }
    return getUpdateP3OwningOrgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest,
      com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse> getGetP3OwningOrgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetP3OwningOrg",
      requestType = com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest,
      com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse> getGetP3OwningOrgMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest, com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse> getGetP3OwningOrgMethod;
    if ((getGetP3OwningOrgMethod = OrgGrpc.getGetP3OwningOrgMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetP3OwningOrgMethod = OrgGrpc.getGetP3OwningOrgMethod) == null) {
          OrgGrpc.getGetP3OwningOrgMethod = getGetP3OwningOrgMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest, com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetP3OwningOrg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetP3OwningOrg"))
              .build();
        }
      }
    }
    return getGetP3OwningOrgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse> getListOrganizationUserDescriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationUserDescriptions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse> getListOrganizationUserDescriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse> getListOrganizationUserDescriptionsMethod;
    if ((getListOrganizationUserDescriptionsMethod = OrgGrpc.getListOrganizationUserDescriptionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListOrganizationUserDescriptionsMethod = OrgGrpc.getListOrganizationUserDescriptionsMethod) == null) {
          OrgGrpc.getListOrganizationUserDescriptionsMethod = getListOrganizationUserDescriptionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationUserDescriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListOrganizationUserDescriptions"))
              .build();
        }
      }
    }
    return getListOrganizationUserDescriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse> getListUserDescriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserDescriptions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse> getListUserDescriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse> getListUserDescriptionsMethod;
    if ((getListUserDescriptionsMethod = OrgGrpc.getListUserDescriptionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListUserDescriptionsMethod = OrgGrpc.getListUserDescriptionsMethod) == null) {
          OrgGrpc.getListUserDescriptionsMethod = getListUserDescriptionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserDescriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListUserDescriptions"))
              .build();
        }
      }
    }
    return getListUserDescriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse> getGetUserDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserDirectory",
      requestType = com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse> getGetUserDirectoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest, com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse> getGetUserDirectoryMethod;
    if ((getGetUserDirectoryMethod = OrgGrpc.getGetUserDirectoryMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserDirectoryMethod = OrgGrpc.getGetUserDirectoryMethod) == null) {
          OrgGrpc.getGetUserDirectoryMethod = getGetUserDirectoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest, com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserDirectory"))
              .build();
        }
      }
    }
    return getGetUserDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRegionsRequest,
      com.tcn.cloud.api.api.v0alpha.GetRegionsResponse> getGetRegionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegions",
      requestType = com.tcn.cloud.api.api.v0alpha.GetRegionsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetRegionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRegionsRequest,
      com.tcn.cloud.api.api.v0alpha.GetRegionsResponse> getGetRegionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRegionsRequest, com.tcn.cloud.api.api.v0alpha.GetRegionsResponse> getGetRegionsMethod;
    if ((getGetRegionsMethod = OrgGrpc.getGetRegionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetRegionsMethod = OrgGrpc.getGetRegionsMethod) == null) {
          OrgGrpc.getGetRegionsMethod = getGetRegionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetRegionsRequest, com.tcn.cloud.api.api.v0alpha.GetRegionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetRegionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetRegionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetRegions"))
              .build();
        }
      }
    }
    return getGetRegionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest,
      com.tcn.cloud.api.api.v0alpha.UserDetails> getGetUserDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserDetails",
      requestType = com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UserDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest,
      com.tcn.cloud.api.api.v0alpha.UserDetails> getGetUserDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest, com.tcn.cloud.api.api.v0alpha.UserDetails> getGetUserDetailsMethod;
    if ((getGetUserDetailsMethod = OrgGrpc.getGetUserDetailsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserDetailsMethod = OrgGrpc.getGetUserDetailsMethod) == null) {
          OrgGrpc.getGetUserDetailsMethod = getGetUserDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest, com.tcn.cloud.api.api.v0alpha.UserDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UserDetails.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserDetails"))
              .build();
        }
      }
    }
    return getGetUserDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest,
      com.tcn.cloud.api.api.v0alpha.UserDetails> getAdminGetUserDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdminGetUserDetails",
      requestType = com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UserDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest,
      com.tcn.cloud.api.api.v0alpha.UserDetails> getAdminGetUserDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest, com.tcn.cloud.api.api.v0alpha.UserDetails> getAdminGetUserDetailsMethod;
    if ((getAdminGetUserDetailsMethod = OrgGrpc.getAdminGetUserDetailsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAdminGetUserDetailsMethod = OrgGrpc.getAdminGetUserDetailsMethod) == null) {
          OrgGrpc.getAdminGetUserDetailsMethod = getAdminGetUserDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest, com.tcn.cloud.api.api.v0alpha.UserDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdminGetUserDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UserDetails.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AdminGetUserDetails"))
              .build();
        }
      }
    }
    return getAdminGetUserDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse> getGetAgentUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentUsers",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse> getGetAgentUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest, com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse> getGetAgentUsersMethod;
    if ((getGetAgentUsersMethod = OrgGrpc.getGetAgentUsersMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAgentUsersMethod = OrgGrpc.getGetAgentUsersMethod) == null) {
          OrgGrpc.getGetAgentUsersMethod = getGetAgentUsersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest, com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAgentUsers"))
              .build();
        }
      }
    }
    return getGetAgentUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse> getGetAgentSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentSettings",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse> getGetAgentSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest, com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse> getGetAgentSettingsMethod;
    if ((getGetAgentSettingsMethod = OrgGrpc.getGetAgentSettingsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAgentSettingsMethod = OrgGrpc.getGetAgentSettingsMethod) == null) {
          OrgGrpc.getGetAgentSettingsMethod = getGetAgentSettingsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest, com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAgentSettings"))
              .build();
        }
      }
    }
    return getGetAgentSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse> getGetAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse> getGetAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest, com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse> getGetAgentProfileGroupMethod;
    if ((getGetAgentProfileGroupMethod = OrgGrpc.getGetAgentProfileGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAgentProfileGroupMethod = OrgGrpc.getGetAgentProfileGroupMethod) == null) {
          OrgGrpc.getGetAgentProfileGroupMethod = getGetAgentProfileGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest, com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAgentProfileGroup"))
              .build();
        }
      }
    }
    return getGetAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse> getUpdateAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse> getUpdateAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse> getUpdateAgentProfileGroupMethod;
    if ((getUpdateAgentProfileGroupMethod = OrgGrpc.getUpdateAgentProfileGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAgentProfileGroupMethod = OrgGrpc.getUpdateAgentProfileGroupMethod) == null) {
          OrgGrpc.getUpdateAgentProfileGroupMethod = getUpdateAgentProfileGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAgentProfileGroup"))
              .build();
        }
      }
    }
    return getUpdateAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse> getCreateAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse> getCreateAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest, com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse> getCreateAgentProfileGroupMethod;
    if ((getCreateAgentProfileGroupMethod = OrgGrpc.getCreateAgentProfileGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateAgentProfileGroupMethod = OrgGrpc.getCreateAgentProfileGroupMethod) == null) {
          OrgGrpc.getCreateAgentProfileGroupMethod = getCreateAgentProfileGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest, com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateAgentProfileGroup"))
              .build();
        }
      }
    }
    return getCreateAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse> getListAgentProfileGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentProfileGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse> getListAgentProfileGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest, com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse> getListAgentProfileGroupsMethod;
    if ((getListAgentProfileGroupsMethod = OrgGrpc.getListAgentProfileGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAgentProfileGroupsMethod = OrgGrpc.getListAgentProfileGroupsMethod) == null) {
          OrgGrpc.getListAgentProfileGroupsMethod = getListAgentProfileGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest, com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentProfileGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAgentProfileGroups"))
              .build();
        }
      }
    }
    return getListAgentProfileGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse> getDeleteAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse> getDeleteAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest, com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse> getDeleteAgentProfileGroupMethod;
    if ((getDeleteAgentProfileGroupMethod = OrgGrpc.getDeleteAgentProfileGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteAgentProfileGroupMethod = OrgGrpc.getDeleteAgentProfileGroupMethod) == null) {
          OrgGrpc.getDeleteAgentProfileGroupMethod = getDeleteAgentProfileGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest, com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteAgentProfileGroup"))
              .build();
        }
      }
    }
    return getDeleteAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse> getAssignAgentProfileGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignAgentProfileGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse> getAssignAgentProfileGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest, com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse> getAssignAgentProfileGroupsMethod;
    if ((getAssignAgentProfileGroupsMethod = OrgGrpc.getAssignAgentProfileGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignAgentProfileGroupsMethod = OrgGrpc.getAssignAgentProfileGroupsMethod) == null) {
          OrgGrpc.getAssignAgentProfileGroupsMethod = getAssignAgentProfileGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest, com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignAgentProfileGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignAgentProfileGroups"))
              .build();
        }
      }
    }
    return getAssignAgentProfileGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateUserRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = OrgGrpc.getUpdateUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserMethod = OrgGrpc.getUpdateUserMethod) == null) {
          OrgGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateUserRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateUserRequest,
      com.tcn.cloud.api.api.v0alpha.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateUserRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateUserRequest,
      com.tcn.cloud.api.api.v0alpha.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateUserRequest, com.tcn.cloud.api.api.v0alpha.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = OrgGrpc.getCreateUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateUserMethod = OrgGrpc.getCreateUserMethod) == null) {
          OrgGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateUserRequest, com.tcn.cloud.api.api.v0alpha.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest,
      com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse> getCreateDelegatedUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDelegatedUser",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest,
      com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse> getCreateDelegatedUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest, com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse> getCreateDelegatedUserMethod;
    if ((getCreateDelegatedUserMethod = OrgGrpc.getCreateDelegatedUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateDelegatedUserMethod = OrgGrpc.getCreateDelegatedUserMethod) == null) {
          OrgGrpc.getCreateDelegatedUserMethod = getCreateDelegatedUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest, com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDelegatedUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateDelegatedUser"))
              .build();
        }
      }
    }
    return getCreateDelegatedUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse> getUpdateUserPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserPassword",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse> getUpdateUserPasswordMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse> getUpdateUserPasswordMethod;
    if ((getUpdateUserPasswordMethod = OrgGrpc.getUpdateUserPasswordMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserPasswordMethod = OrgGrpc.getUpdateUserPasswordMethod) == null) {
          OrgGrpc.getUpdateUserPasswordMethod = getUpdateUserPasswordMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserPassword"))
              .build();
        }
      }
    }
    return getUpdateUserPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest,
      com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse> getResetUserRequirePasswordResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetUserRequirePasswordReset",
      requestType = com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest,
      com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse> getResetUserRequirePasswordResetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest, com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse> getResetUserRequirePasswordResetMethod;
    if ((getResetUserRequirePasswordResetMethod = OrgGrpc.getResetUserRequirePasswordResetMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getResetUserRequirePasswordResetMethod = OrgGrpc.getResetUserRequirePasswordResetMethod) == null) {
          OrgGrpc.getResetUserRequirePasswordResetMethod = getResetUserRequirePasswordResetMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest, com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetUserRequirePasswordReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ResetUserRequirePasswordReset"))
              .build();
        }
      }
    }
    return getResetUserRequirePasswordResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse> getGetUserPasswordResetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPasswordResetLink",
      requestType = com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse> getGetUserPasswordResetLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse> getGetUserPasswordResetLinkMethod;
    if ((getGetUserPasswordResetLinkMethod = OrgGrpc.getGetUserPasswordResetLinkMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserPasswordResetLinkMethod = OrgGrpc.getGetUserPasswordResetLinkMethod) == null) {
          OrgGrpc.getGetUserPasswordResetLinkMethod = getGetUserPasswordResetLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPasswordResetLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserPasswordResetLink"))
              .build();
        }
      }
    }
    return getGetUserPasswordResetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse> getGetUserEmailVerifiedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserEmailVerified",
      requestType = com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse> getGetUserEmailVerifiedMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest, com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse> getGetUserEmailVerifiedMethod;
    if ((getGetUserEmailVerifiedMethod = OrgGrpc.getGetUserEmailVerifiedMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserEmailVerifiedMethod = OrgGrpc.getGetUserEmailVerifiedMethod) == null) {
          OrgGrpc.getGetUserEmailVerifiedMethod = getGetUserEmailVerifiedMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest, com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserEmailVerified"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserEmailVerified"))
              .build();
        }
      }
    }
    return getGetUserEmailVerifiedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest,
      com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse> getSendUserVerificationEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendUserVerificationEmail",
      requestType = com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest,
      com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse> getSendUserVerificationEmailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest, com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse> getSendUserVerificationEmailMethod;
    if ((getSendUserVerificationEmailMethod = OrgGrpc.getSendUserVerificationEmailMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getSendUserVerificationEmailMethod = OrgGrpc.getSendUserVerificationEmailMethod) == null) {
          OrgGrpc.getSendUserVerificationEmailMethod = getSendUserVerificationEmailMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest, com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendUserVerificationEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("SendUserVerificationEmail"))
              .build();
        }
      }
    }
    return getSendUserVerificationEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest,
      com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse> getManualUserEmailVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManualUserEmailVerification",
      requestType = com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest,
      com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse> getManualUserEmailVerificationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest, com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse> getManualUserEmailVerificationMethod;
    if ((getManualUserEmailVerificationMethod = OrgGrpc.getManualUserEmailVerificationMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getManualUserEmailVerificationMethod = OrgGrpc.getManualUserEmailVerificationMethod) == null) {
          OrgGrpc.getManualUserEmailVerificationMethod = getManualUserEmailVerificationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest, com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManualUserEmailVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ManualUserEmailVerification"))
              .build();
        }
      }
    }
    return getManualUserEmailVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq,
      com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes> getGetTempUserTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTempUserToken",
      requestType = com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq,
      com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes> getGetTempUserTokenMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq, com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes> getGetTempUserTokenMethod;
    if ((getGetTempUserTokenMethod = OrgGrpc.getGetTempUserTokenMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetTempUserTokenMethod = OrgGrpc.getGetTempUserTokenMethod) == null) {
          OrgGrpc.getGetTempUserTokenMethod = getGetTempUserTokenMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq, com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTempUserToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetTempUserToken"))
              .build();
        }
      }
    }
    return getGetTempUserTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest,
      com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse> getGetCountriesListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCountriesList",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest,
      com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse> getGetCountriesListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest, com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse> getGetCountriesListMethod;
    if ((getGetCountriesListMethod = OrgGrpc.getGetCountriesListMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetCountriesListMethod = OrgGrpc.getGetCountriesListMethod) == null) {
          OrgGrpc.getGetCountriesListMethod = getGetCountriesListMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest, com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCountriesList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetCountriesList"))
              .build();
        }
      }
    }
    return getGetCountriesListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse> getGetAdminClientPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdminClientPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse> getGetAdminClientPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse> getGetAdminClientPreferencesMethod;
    if ((getGetAdminClientPreferencesMethod = OrgGrpc.getGetAdminClientPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAdminClientPreferencesMethod = OrgGrpc.getGetAdminClientPreferencesMethod) == null) {
          OrgGrpc.getGetAdminClientPreferencesMethod = getGetAdminClientPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdminClientPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAdminClientPreferences"))
              .build();
        }
      }
    }
    return getGetAdminClientPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse> getUpdateAdminClientPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAdminClientPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse> getUpdateAdminClientPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse> getUpdateAdminClientPreferencesMethod;
    if ((getUpdateAdminClientPreferencesMethod = OrgGrpc.getUpdateAdminClientPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAdminClientPreferencesMethod = OrgGrpc.getUpdateAdminClientPreferencesMethod) == null) {
          OrgGrpc.getUpdateAdminClientPreferencesMethod = getUpdateAdminClientPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAdminClientPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAdminClientPreferences"))
              .build();
        }
      }
    }
    return getUpdateAdminClientPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest,
      com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse> getGetPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPermissions",
      requestType = com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest,
      com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse> getGetPermissionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest, com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse> getGetPermissionsMethod;
    if ((getGetPermissionsMethod = OrgGrpc.getGetPermissionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetPermissionsMethod = OrgGrpc.getGetPermissionsMethod) == null) {
          OrgGrpc.getGetPermissionsMethod = getGetPermissionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest, com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetPermissions"))
              .build();
        }
      }
    }
    return getGetPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest,
      com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse> getRevokeAccountOwnerPermissionFromUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeAccountOwnerPermissionFromUser",
      requestType = com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest,
      com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse> getRevokeAccountOwnerPermissionFromUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest, com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse> getRevokeAccountOwnerPermissionFromUserMethod;
    if ((getRevokeAccountOwnerPermissionFromUserMethod = OrgGrpc.getRevokeAccountOwnerPermissionFromUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRevokeAccountOwnerPermissionFromUserMethod = OrgGrpc.getRevokeAccountOwnerPermissionFromUserMethod) == null) {
          OrgGrpc.getRevokeAccountOwnerPermissionFromUserMethod = getRevokeAccountOwnerPermissionFromUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest, com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeAccountOwnerPermissionFromUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RevokeAccountOwnerPermissionFromUser"))
              .build();
        }
      }
    }
    return getRevokeAccountOwnerPermissionFromUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse> getUpdateUserDisabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserDisabled",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse> getUpdateUserDisabledMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse> getUpdateUserDisabledMethod;
    if ((getUpdateUserDisabledMethod = OrgGrpc.getUpdateUserDisabledMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserDisabledMethod = OrgGrpc.getUpdateUserDisabledMethod) == null) {
          OrgGrpc.getUpdateUserDisabledMethod = getUpdateUserDisabledMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserDisabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserDisabled"))
              .build();
        }
      }
    }
    return getUpdateUserDisabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse> getUpdateBulkUsersDisabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBulkUsersDisabled",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse> getUpdateBulkUsersDisabledMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest, com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse> getUpdateBulkUsersDisabledMethod;
    if ((getUpdateBulkUsersDisabledMethod = OrgGrpc.getUpdateBulkUsersDisabledMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateBulkUsersDisabledMethod = OrgGrpc.getUpdateBulkUsersDisabledMethod) == null) {
          OrgGrpc.getUpdateBulkUsersDisabledMethod = getUpdateBulkUsersDisabledMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest, com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBulkUsersDisabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateBulkUsersDisabled"))
              .build();
        }
      }
    }
    return getUpdateBulkUsersDisabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse> getGetOrgBillingSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrgBillingSettings",
      requestType = com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse> getGetOrgBillingSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest, com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse> getGetOrgBillingSettingsMethod;
    if ((getGetOrgBillingSettingsMethod = OrgGrpc.getGetOrgBillingSettingsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetOrgBillingSettingsMethod = OrgGrpc.getGetOrgBillingSettingsMethod) == null) {
          OrgGrpc.getGetOrgBillingSettingsMethod = getGetOrgBillingSettingsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest, com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrgBillingSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetOrgBillingSettings"))
              .build();
        }
      }
    }
    return getGetOrgBillingSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse> getSetOrgBillingSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOrgBillingSettings",
      requestType = com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse> getSetOrgBillingSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest, com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse> getSetOrgBillingSettingsMethod;
    if ((getSetOrgBillingSettingsMethod = OrgGrpc.getSetOrgBillingSettingsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getSetOrgBillingSettingsMethod = OrgGrpc.getSetOrgBillingSettingsMethod) == null) {
          OrgGrpc.getSetOrgBillingSettingsMethod = getSetOrgBillingSettingsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest, com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOrgBillingSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("SetOrgBillingSettings"))
              .build();
        }
      }
    }
    return getSetOrgBillingSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest,
      com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse> getAddOrgBillingOverrideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOrgBillingOverride",
      requestType = com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest,
      com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse> getAddOrgBillingOverrideMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest, com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse> getAddOrgBillingOverrideMethod;
    if ((getAddOrgBillingOverrideMethod = OrgGrpc.getAddOrgBillingOverrideMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAddOrgBillingOverrideMethod = OrgGrpc.getAddOrgBillingOverrideMethod) == null) {
          OrgGrpc.getAddOrgBillingOverrideMethod = getAddOrgBillingOverrideMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest, com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOrgBillingOverride"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AddOrgBillingOverride"))
              .build();
        }
      }
    }
    return getAddOrgBillingOverrideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse> getRemoveOrgBillingOverrideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveOrgBillingOverride",
      requestType = com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse> getRemoveOrgBillingOverrideMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest, com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse> getRemoveOrgBillingOverrideMethod;
    if ((getRemoveOrgBillingOverrideMethod = OrgGrpc.getRemoveOrgBillingOverrideMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRemoveOrgBillingOverrideMethod = OrgGrpc.getRemoveOrgBillingOverrideMethod) == null) {
          OrgGrpc.getRemoveOrgBillingOverrideMethod = getRemoveOrgBillingOverrideMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest, com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveOrgBillingOverride"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RemoveOrgBillingOverride"))
              .build();
        }
      }
    }
    return getRemoveOrgBillingOverrideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest,
      com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse> getGetSystemDefaultBillingRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSystemDefaultBillingRates",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest,
      com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse> getGetSystemDefaultBillingRatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest, com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse> getGetSystemDefaultBillingRatesMethod;
    if ((getGetSystemDefaultBillingRatesMethod = OrgGrpc.getGetSystemDefaultBillingRatesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetSystemDefaultBillingRatesMethod = OrgGrpc.getGetSystemDefaultBillingRatesMethod) == null) {
          OrgGrpc.getGetSystemDefaultBillingRatesMethod = getGetSystemDefaultBillingRatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest, com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSystemDefaultBillingRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetSystemDefaultBillingRates"))
              .build();
        }
      }
    }
    return getGetSystemDefaultBillingRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse> getListPermissionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPermissionGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse> getListPermissionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest, com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse> getListPermissionGroupsMethod;
    if ((getListPermissionGroupsMethod = OrgGrpc.getListPermissionGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListPermissionGroupsMethod = OrgGrpc.getListPermissionGroupsMethod) == null) {
          OrgGrpc.getListPermissionGroupsMethod = getListPermissionGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest, com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPermissionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListPermissionGroups"))
              .build();
        }
      }
    }
    return getListPermissionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse> getCreatePermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse> getCreatePermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse> getCreatePermissionGroupMethod;
    if ((getCreatePermissionGroupMethod = OrgGrpc.getCreatePermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreatePermissionGroupMethod = OrgGrpc.getCreatePermissionGroupMethod) == null) {
          OrgGrpc.getCreatePermissionGroupMethod = getCreatePermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreatePermissionGroup"))
              .build();
        }
      }
    }
    return getCreatePermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse> getUpdatePermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse> getUpdatePermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse> getUpdatePermissionGroupMethod;
    if ((getUpdatePermissionGroupMethod = OrgGrpc.getUpdatePermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdatePermissionGroupMethod = OrgGrpc.getUpdatePermissionGroupMethod) == null) {
          OrgGrpc.getUpdatePermissionGroupMethod = getUpdatePermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdatePermissionGroup"))
              .build();
        }
      }
    }
    return getUpdatePermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse> getDeletePermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse> getDeletePermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse> getDeletePermissionGroupMethod;
    if ((getDeletePermissionGroupMethod = OrgGrpc.getDeletePermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeletePermissionGroupMethod = OrgGrpc.getDeletePermissionGroupMethod) == null) {
          OrgGrpc.getDeletePermissionGroupMethod = getDeletePermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeletePermissionGroup"))
              .build();
        }
      }
    }
    return getDeletePermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse> getAssignUserToAccountOwnerPermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignUserToAccountOwnerPermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse> getAssignUserToAccountOwnerPermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse> getAssignUserToAccountOwnerPermissionGroupMethod;
    if ((getAssignUserToAccountOwnerPermissionGroupMethod = OrgGrpc.getAssignUserToAccountOwnerPermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignUserToAccountOwnerPermissionGroupMethod = OrgGrpc.getAssignUserToAccountOwnerPermissionGroupMethod) == null) {
          OrgGrpc.getAssignUserToAccountOwnerPermissionGroupMethod = getAssignUserToAccountOwnerPermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignUserToAccountOwnerPermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignUserToAccountOwnerPermissionGroup"))
              .build();
        }
      }
    }
    return getAssignUserToAccountOwnerPermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse> getAssignUserPermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignUserPermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse> getAssignUserPermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse> getAssignUserPermissionGroupMethod;
    if ((getAssignUserPermissionGroupMethod = OrgGrpc.getAssignUserPermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignUserPermissionGroupMethod = OrgGrpc.getAssignUserPermissionGroupMethod) == null) {
          OrgGrpc.getAssignUserPermissionGroupMethod = getAssignUserPermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignUserPermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignUserPermissionGroup"))
              .build();
        }
      }
    }
    return getAssignUserPermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse> getAssignUsersPermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignUsersPermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse> getAssignUsersPermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse> getAssignUsersPermissionGroupMethod;
    if ((getAssignUsersPermissionGroupMethod = OrgGrpc.getAssignUsersPermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignUsersPermissionGroupMethod = OrgGrpc.getAssignUsersPermissionGroupMethod) == null) {
          OrgGrpc.getAssignUsersPermissionGroupMethod = getAssignUsersPermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignUsersPermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignUsersPermissionGroup"))
              .build();
        }
      }
    }
    return getAssignUsersPermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse> getUpdateUserNeoPermissionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserNeoPermissionGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse> getUpdateUserNeoPermissionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse> getUpdateUserNeoPermissionGroupsMethod;
    if ((getUpdateUserNeoPermissionGroupsMethod = OrgGrpc.getUpdateUserNeoPermissionGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserNeoPermissionGroupsMethod = OrgGrpc.getUpdateUserNeoPermissionGroupsMethod) == null) {
          OrgGrpc.getUpdateUserNeoPermissionGroupsMethod = getUpdateUserNeoPermissionGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserNeoPermissionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserNeoPermissionGroups"))
              .build();
        }
      }
    }
    return getUpdateUserNeoPermissionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse> getRevokeUserPermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeUserPermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse> getRevokeUserPermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse> getRevokeUserPermissionGroupMethod;
    if ((getRevokeUserPermissionGroupMethod = OrgGrpc.getRevokeUserPermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRevokeUserPermissionGroupMethod = OrgGrpc.getRevokeUserPermissionGroupMethod) == null) {
          OrgGrpc.getRevokeUserPermissionGroupMethod = getRevokeUserPermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeUserPermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RevokeUserPermissionGroup"))
              .build();
        }
      }
    }
    return getRevokeUserPermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse> getRevokeUsersPermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeUsersPermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse> getRevokeUsersPermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse> getRevokeUsersPermissionGroupMethod;
    if ((getRevokeUsersPermissionGroupMethod = OrgGrpc.getRevokeUsersPermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRevokeUsersPermissionGroupMethod = OrgGrpc.getRevokeUsersPermissionGroupMethod) == null) {
          OrgGrpc.getRevokeUsersPermissionGroupMethod = getRevokeUsersPermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeUsersPermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RevokeUsersPermissionGroup"))
              .build();
        }
      }
    }
    return getRevokeUsersPermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse> getInitDefaultPermissionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitDefaultPermissionGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse> getInitDefaultPermissionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest, com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse> getInitDefaultPermissionGroupsMethod;
    if ((getInitDefaultPermissionGroupsMethod = OrgGrpc.getInitDefaultPermissionGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getInitDefaultPermissionGroupsMethod = OrgGrpc.getInitDefaultPermissionGroupsMethod) == null) {
          OrgGrpc.getInitDefaultPermissionGroupsMethod = getInitDefaultPermissionGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest, com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitDefaultPermissionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("InitDefaultPermissionGroups"))
              .build();
        }
      }
    }
    return getInitDefaultPermissionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse> getAddPermissionToAccountOwnerPermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPermissionToAccountOwnerPermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse> getAddPermissionToAccountOwnerPermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse> getAddPermissionToAccountOwnerPermissionGroupMethod;
    if ((getAddPermissionToAccountOwnerPermissionGroupMethod = OrgGrpc.getAddPermissionToAccountOwnerPermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAddPermissionToAccountOwnerPermissionGroupMethod = OrgGrpc.getAddPermissionToAccountOwnerPermissionGroupMethod) == null) {
          OrgGrpc.getAddPermissionToAccountOwnerPermissionGroupMethod = getAddPermissionToAccountOwnerPermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPermissionToAccountOwnerPermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AddPermissionToAccountOwnerPermissionGroup"))
              .build();
        }
      }
    }
    return getAddPermissionToAccountOwnerPermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse> getRevokePermissionToAccountOwnerPermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokePermissionToAccountOwnerPermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse> getRevokePermissionToAccountOwnerPermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse> getRevokePermissionToAccountOwnerPermissionGroupMethod;
    if ((getRevokePermissionToAccountOwnerPermissionGroupMethod = OrgGrpc.getRevokePermissionToAccountOwnerPermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRevokePermissionToAccountOwnerPermissionGroupMethod = OrgGrpc.getRevokePermissionToAccountOwnerPermissionGroupMethod) == null) {
          OrgGrpc.getRevokePermissionToAccountOwnerPermissionGroupMethod = getRevokePermissionToAccountOwnerPermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokePermissionToAccountOwnerPermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RevokePermissionToAccountOwnerPermissionGroup"))
              .build();
        }
      }
    }
    return getRevokePermissionToAccountOwnerPermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse> getAddPermissionToOrgDefaultGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPermissionToOrgDefaultGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse> getAddPermissionToOrgDefaultGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest, com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse> getAddPermissionToOrgDefaultGroupMethod;
    if ((getAddPermissionToOrgDefaultGroupMethod = OrgGrpc.getAddPermissionToOrgDefaultGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAddPermissionToOrgDefaultGroupMethod = OrgGrpc.getAddPermissionToOrgDefaultGroupMethod) == null) {
          OrgGrpc.getAddPermissionToOrgDefaultGroupMethod = getAddPermissionToOrgDefaultGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest, com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPermissionToOrgDefaultGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AddPermissionToOrgDefaultGroup"))
              .build();
        }
      }
    }
    return getAddPermissionToOrgDefaultGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse> getRemovePermissionFromOrgDefaultGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePermissionFromOrgDefaultGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse> getRemovePermissionFromOrgDefaultGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest, com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse> getRemovePermissionFromOrgDefaultGroupMethod;
    if ((getRemovePermissionFromOrgDefaultGroupMethod = OrgGrpc.getRemovePermissionFromOrgDefaultGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRemovePermissionFromOrgDefaultGroupMethod = OrgGrpc.getRemovePermissionFromOrgDefaultGroupMethod) == null) {
          OrgGrpc.getRemovePermissionFromOrgDefaultGroupMethod = getRemovePermissionFromOrgDefaultGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest, com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePermissionFromOrgDefaultGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RemovePermissionFromOrgDefaultGroup"))
              .build();
        }
      }
    }
    return getRemovePermissionFromOrgDefaultGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse> getGetOrgDefaultSuperUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrgDefaultSuperUserGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse> getGetOrgDefaultSuperUserGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest, com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse> getGetOrgDefaultSuperUserGroupMethod;
    if ((getGetOrgDefaultSuperUserGroupMethod = OrgGrpc.getGetOrgDefaultSuperUserGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetOrgDefaultSuperUserGroupMethod = OrgGrpc.getGetOrgDefaultSuperUserGroupMethod) == null) {
          OrgGrpc.getGetOrgDefaultSuperUserGroupMethod = getGetOrgDefaultSuperUserGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest, com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrgDefaultSuperUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetOrgDefaultSuperUserGroup"))
              .build();
        }
      }
    }
    return getGetOrgDefaultSuperUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse> getListP3PermissionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListP3PermissionGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse> getListP3PermissionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest, com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse> getListP3PermissionGroupsMethod;
    if ((getListP3PermissionGroupsMethod = OrgGrpc.getListP3PermissionGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListP3PermissionGroupsMethod = OrgGrpc.getListP3PermissionGroupsMethod) == null) {
          OrgGrpc.getListP3PermissionGroupsMethod = getListP3PermissionGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest, com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListP3PermissionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListP3PermissionGroups"))
              .build();
        }
      }
    }
    return getListP3PermissionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest,
      com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse> getAddUserRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserRegion",
      requestType = com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest,
      com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse> getAddUserRegionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest, com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse> getAddUserRegionMethod;
    if ((getAddUserRegionMethod = OrgGrpc.getAddUserRegionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAddUserRegionMethod = OrgGrpc.getAddUserRegionMethod) == null) {
          OrgGrpc.getAddUserRegionMethod = getAddUserRegionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest, com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AddUserRegion"))
              .build();
        }
      }
    }
    return getAddUserRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse> getRemoveUserRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserRegion",
      requestType = com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse> getRemoveUserRegionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest, com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse> getRemoveUserRegionMethod;
    if ((getRemoveUserRegionMethod = OrgGrpc.getRemoveUserRegionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRemoveUserRegionMethod = OrgGrpc.getRemoveUserRegionMethod) == null) {
          OrgGrpc.getRemoveUserRegionMethod = getRemoveUserRegionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest, com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RemoveUserRegion"))
              .build();
        }
      }
    }
    return getRemoveUserRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse> getCreateP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse> getCreateP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse> getCreateP3PermissionGroupMethod;
    if ((getCreateP3PermissionGroupMethod = OrgGrpc.getCreateP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateP3PermissionGroupMethod = OrgGrpc.getCreateP3PermissionGroupMethod) == null) {
          OrgGrpc.getCreateP3PermissionGroupMethod = getCreateP3PermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateP3PermissionGroup"))
              .build();
        }
      }
    }
    return getCreateP3PermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse> getUpdateP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse> getUpdateP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse> getUpdateP3PermissionGroupMethod;
    if ((getUpdateP3PermissionGroupMethod = OrgGrpc.getUpdateP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateP3PermissionGroupMethod = OrgGrpc.getUpdateP3PermissionGroupMethod) == null) {
          OrgGrpc.getUpdateP3PermissionGroupMethod = getUpdateP3PermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateP3PermissionGroup"))
              .build();
        }
      }
    }
    return getUpdateP3PermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse> getDeleteP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse> getDeleteP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse> getDeleteP3PermissionGroupMethod;
    if ((getDeleteP3PermissionGroupMethod = OrgGrpc.getDeleteP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteP3PermissionGroupMethod = OrgGrpc.getDeleteP3PermissionGroupMethod) == null) {
          OrgGrpc.getDeleteP3PermissionGroupMethod = getDeleteP3PermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteP3PermissionGroup"))
              .build();
        }
      }
    }
    return getDeleteP3PermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse> getAssignUsersP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignUsersP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse> getAssignUsersP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse> getAssignUsersP3PermissionGroupMethod;
    if ((getAssignUsersP3PermissionGroupMethod = OrgGrpc.getAssignUsersP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAssignUsersP3PermissionGroupMethod = OrgGrpc.getAssignUsersP3PermissionGroupMethod) == null) {
          OrgGrpc.getAssignUsersP3PermissionGroupMethod = getAssignUsersP3PermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignUsersP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AssignUsersP3PermissionGroup"))
              .build();
        }
      }
    }
    return getAssignUsersP3PermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest,
      com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse> getAddLoginToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLoginToUser",
      requestType = com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest,
      com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse> getAddLoginToUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest, com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse> getAddLoginToUserMethod;
    if ((getAddLoginToUserMethod = OrgGrpc.getAddLoginToUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAddLoginToUserMethod = OrgGrpc.getAddLoginToUserMethod) == null) {
          OrgGrpc.getAddLoginToUserMethod = getAddLoginToUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest, com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLoginToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AddLoginToUser"))
              .build();
        }
      }
    }
    return getAddLoginToUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse> getRevokeUsersP3PermissionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeUsersP3PermissionGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest,
      com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse> getRevokeUsersP3PermissionGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse> getRevokeUsersP3PermissionGroupMethod;
    if ((getRevokeUsersP3PermissionGroupMethod = OrgGrpc.getRevokeUsersP3PermissionGroupMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRevokeUsersP3PermissionGroupMethod = OrgGrpc.getRevokeUsersP3PermissionGroupMethod) == null) {
          OrgGrpc.getRevokeUsersP3PermissionGroupMethod = getRevokeUsersP3PermissionGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest, com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeUsersP3PermissionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RevokeUsersP3PermissionGroup"))
              .build();
        }
      }
    }
    return getRevokeUsersP3PermissionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse> getGetContactPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContactPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse> getGetContactPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse> getGetContactPreferencesMethod;
    if ((getGetContactPreferencesMethod = OrgGrpc.getGetContactPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetContactPreferencesMethod = OrgGrpc.getGetContactPreferencesMethod) == null) {
          OrgGrpc.getGetContactPreferencesMethod = getGetContactPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContactPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetContactPreferences"))
              .build();
        }
      }
    }
    return getGetContactPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse> getUpdateContactPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateContactPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse> getUpdateContactPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse> getUpdateContactPreferencesMethod;
    if ((getUpdateContactPreferencesMethod = OrgGrpc.getUpdateContactPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateContactPreferencesMethod = OrgGrpc.getUpdateContactPreferencesMethod) == null) {
          OrgGrpc.getUpdateContactPreferencesMethod = getUpdateContactPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateContactPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateContactPreferences"))
              .build();
        }
      }
    }
    return getUpdateContactPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse> getGetCompliancePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCompliancePreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse> getGetCompliancePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse> getGetCompliancePreferencesMethod;
    if ((getGetCompliancePreferencesMethod = OrgGrpc.getGetCompliancePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetCompliancePreferencesMethod = OrgGrpc.getGetCompliancePreferencesMethod) == null) {
          OrgGrpc.getGetCompliancePreferencesMethod = getGetCompliancePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCompliancePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetCompliancePreferences"))
              .build();
        }
      }
    }
    return getGetCompliancePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse> getUpdateCompliancePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCompliancePreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse> getUpdateCompliancePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse> getUpdateCompliancePreferencesMethod;
    if ((getUpdateCompliancePreferencesMethod = OrgGrpc.getUpdateCompliancePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateCompliancePreferencesMethod = OrgGrpc.getUpdateCompliancePreferencesMethod) == null) {
          OrgGrpc.getUpdateCompliancePreferencesMethod = getUpdateCompliancePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCompliancePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateCompliancePreferences"))
              .build();
        }
      }
    }
    return getUpdateCompliancePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse> getGetAgentPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse> getGetAgentPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse> getGetAgentPreferencesMethod;
    if ((getGetAgentPreferencesMethod = OrgGrpc.getGetAgentPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAgentPreferencesMethod = OrgGrpc.getGetAgentPreferencesMethod) == null) {
          OrgGrpc.getGetAgentPreferencesMethod = getGetAgentPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAgentPreferences"))
              .build();
        }
      }
    }
    return getGetAgentPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse> getUpdateAgentPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse> getUpdateAgentPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse> getUpdateAgentPreferencesMethod;
    if ((getUpdateAgentPreferencesMethod = OrgGrpc.getUpdateAgentPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAgentPreferencesMethod = OrgGrpc.getUpdateAgentPreferencesMethod) == null) {
          OrgGrpc.getUpdateAgentPreferencesMethod = getUpdateAgentPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAgentPreferences"))
              .build();
        }
      }
    }
    return getUpdateAgentPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse> getGetOrganizationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse> getGetOrganizationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse> getGetOrganizationPreferencesMethod;
    if ((getGetOrganizationPreferencesMethod = OrgGrpc.getGetOrganizationPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetOrganizationPreferencesMethod = OrgGrpc.getGetOrganizationPreferencesMethod) == null) {
          OrgGrpc.getGetOrganizationPreferencesMethod = getGetOrganizationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetOrganizationPreferences"))
              .build();
        }
      }
    }
    return getGetOrganizationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse> getUpdateOrganizationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse> getUpdateOrganizationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse> getUpdateOrganizationPreferencesMethod;
    if ((getUpdateOrganizationPreferencesMethod = OrgGrpc.getUpdateOrganizationPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateOrganizationPreferencesMethod = OrgGrpc.getUpdateOrganizationPreferencesMethod) == null) {
          OrgGrpc.getUpdateOrganizationPreferencesMethod = getUpdateOrganizationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateOrganizationPreferences"))
              .build();
        }
      }
    }
    return getUpdateOrganizationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse> getGetSchedulePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSchedulePreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse> getGetSchedulePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse> getGetSchedulePreferencesMethod;
    if ((getGetSchedulePreferencesMethod = OrgGrpc.getGetSchedulePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetSchedulePreferencesMethod = OrgGrpc.getGetSchedulePreferencesMethod) == null) {
          OrgGrpc.getGetSchedulePreferencesMethod = getGetSchedulePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSchedulePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetSchedulePreferences"))
              .build();
        }
      }
    }
    return getGetSchedulePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse> getUpdateSchedulePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSchedulePreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse> getUpdateSchedulePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse> getUpdateSchedulePreferencesMethod;
    if ((getUpdateSchedulePreferencesMethod = OrgGrpc.getUpdateSchedulePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateSchedulePreferencesMethod = OrgGrpc.getUpdateSchedulePreferencesMethod) == null) {
          OrgGrpc.getUpdateSchedulePreferencesMethod = getUpdateSchedulePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSchedulePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateSchedulePreferences"))
              .build();
        }
      }
    }
    return getUpdateSchedulePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse> getGetBusinessPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBusinessPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse> getGetBusinessPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse> getGetBusinessPreferencesMethod;
    if ((getGetBusinessPreferencesMethod = OrgGrpc.getGetBusinessPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetBusinessPreferencesMethod = OrgGrpc.getGetBusinessPreferencesMethod) == null) {
          OrgGrpc.getGetBusinessPreferencesMethod = getGetBusinessPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBusinessPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetBusinessPreferences"))
              .build();
        }
      }
    }
    return getGetBusinessPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse> getUpdateBusinessPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBusinessPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse> getUpdateBusinessPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse> getUpdateBusinessPreferencesMethod;
    if ((getUpdateBusinessPreferencesMethod = OrgGrpc.getUpdateBusinessPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateBusinessPreferencesMethod = OrgGrpc.getUpdateBusinessPreferencesMethod) == null) {
          OrgGrpc.getUpdateBusinessPreferencesMethod = getUpdateBusinessPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBusinessPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateBusinessPreferences"))
              .build();
        }
      }
    }
    return getUpdateBusinessPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse> getGetEndOfDayPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEndOfDayPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse> getGetEndOfDayPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse> getGetEndOfDayPreferencesMethod;
    if ((getGetEndOfDayPreferencesMethod = OrgGrpc.getGetEndOfDayPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetEndOfDayPreferencesMethod = OrgGrpc.getGetEndOfDayPreferencesMethod) == null) {
          OrgGrpc.getGetEndOfDayPreferencesMethod = getGetEndOfDayPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEndOfDayPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetEndOfDayPreferences"))
              .build();
        }
      }
    }
    return getGetEndOfDayPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse> getUpdateEndOfDayPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEndOfDayPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse> getUpdateEndOfDayPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse> getUpdateEndOfDayPreferencesMethod;
    if ((getUpdateEndOfDayPreferencesMethod = OrgGrpc.getUpdateEndOfDayPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateEndOfDayPreferencesMethod = OrgGrpc.getUpdateEndOfDayPreferencesMethod) == null) {
          OrgGrpc.getUpdateEndOfDayPreferencesMethod = getUpdateEndOfDayPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEndOfDayPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateEndOfDayPreferences"))
              .build();
        }
      }
    }
    return getUpdateEndOfDayPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse> getGetReportFilterPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReportFilterPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse> getGetReportFilterPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse> getGetReportFilterPreferencesMethod;
    if ((getGetReportFilterPreferencesMethod = OrgGrpc.getGetReportFilterPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetReportFilterPreferencesMethod = OrgGrpc.getGetReportFilterPreferencesMethod) == null) {
          OrgGrpc.getGetReportFilterPreferencesMethod = getGetReportFilterPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReportFilterPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetReportFilterPreferences"))
              .build();
        }
      }
    }
    return getGetReportFilterPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse> getUpdateReportFilterPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReportFilterPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse> getUpdateReportFilterPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse> getUpdateReportFilterPreferencesMethod;
    if ((getUpdateReportFilterPreferencesMethod = OrgGrpc.getUpdateReportFilterPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateReportFilterPreferencesMethod = OrgGrpc.getUpdateReportFilterPreferencesMethod) == null) {
          OrgGrpc.getUpdateReportFilterPreferencesMethod = getUpdateReportFilterPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReportFilterPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateReportFilterPreferences"))
              .build();
        }
      }
    }
    return getUpdateReportFilterPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse> getGetPhonePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPhonePreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse> getGetPhonePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse> getGetPhonePreferencesMethod;
    if ((getGetPhonePreferencesMethod = OrgGrpc.getGetPhonePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetPhonePreferencesMethod = OrgGrpc.getGetPhonePreferencesMethod) == null) {
          OrgGrpc.getGetPhonePreferencesMethod = getGetPhonePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPhonePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetPhonePreferences"))
              .build();
        }
      }
    }
    return getGetPhonePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse> getUpdatePhonePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePhonePreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse> getUpdatePhonePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse> getUpdatePhonePreferencesMethod;
    if ((getUpdatePhonePreferencesMethod = OrgGrpc.getUpdatePhonePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdatePhonePreferencesMethod = OrgGrpc.getUpdatePhonePreferencesMethod) == null) {
          OrgGrpc.getUpdatePhonePreferencesMethod = getUpdatePhonePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePhonePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdatePhonePreferences"))
              .build();
        }
      }
    }
    return getUpdatePhonePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse> getGetDashboardGeneralPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDashboardGeneralPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse> getGetDashboardGeneralPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse> getGetDashboardGeneralPreferencesMethod;
    if ((getGetDashboardGeneralPreferencesMethod = OrgGrpc.getGetDashboardGeneralPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetDashboardGeneralPreferencesMethod = OrgGrpc.getGetDashboardGeneralPreferencesMethod) == null) {
          OrgGrpc.getGetDashboardGeneralPreferencesMethod = getGetDashboardGeneralPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDashboardGeneralPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetDashboardGeneralPreferences"))
              .build();
        }
      }
    }
    return getGetDashboardGeneralPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse> getUpdateDashboardGeneralPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboardGeneralPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse> getUpdateDashboardGeneralPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse> getUpdateDashboardGeneralPreferencesMethod;
    if ((getUpdateDashboardGeneralPreferencesMethod = OrgGrpc.getUpdateDashboardGeneralPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateDashboardGeneralPreferencesMethod = OrgGrpc.getUpdateDashboardGeneralPreferencesMethod) == null) {
          OrgGrpc.getUpdateDashboardGeneralPreferencesMethod = getUpdateDashboardGeneralPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDashboardGeneralPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateDashboardGeneralPreferences"))
              .build();
        }
      }
    }
    return getUpdateDashboardGeneralPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse> getGetWebhookPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWebhookPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse> getGetWebhookPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse> getGetWebhookPreferencesMethod;
    if ((getGetWebhookPreferencesMethod = OrgGrpc.getGetWebhookPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetWebhookPreferencesMethod = OrgGrpc.getGetWebhookPreferencesMethod) == null) {
          OrgGrpc.getGetWebhookPreferencesMethod = getGetWebhookPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWebhookPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetWebhookPreferences"))
              .build();
        }
      }
    }
    return getGetWebhookPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse> getUpdateWebhookPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWebhookPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse> getUpdateWebhookPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse> getUpdateWebhookPreferencesMethod;
    if ((getUpdateWebhookPreferencesMethod = OrgGrpc.getUpdateWebhookPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateWebhookPreferencesMethod = OrgGrpc.getUpdateWebhookPreferencesMethod) == null) {
          OrgGrpc.getUpdateWebhookPreferencesMethod = getUpdateWebhookPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWebhookPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateWebhookPreferences"))
              .build();
        }
      }
    }
    return getUpdateWebhookPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse> getGetBroadcastPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBroadcastPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse> getGetBroadcastPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse> getGetBroadcastPreferencesMethod;
    if ((getGetBroadcastPreferencesMethod = OrgGrpc.getGetBroadcastPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetBroadcastPreferencesMethod = OrgGrpc.getGetBroadcastPreferencesMethod) == null) {
          OrgGrpc.getGetBroadcastPreferencesMethod = getGetBroadcastPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBroadcastPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetBroadcastPreferences"))
              .build();
        }
      }
    }
    return getGetBroadcastPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse> getUpdateBroadcastPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBroadcastPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse> getUpdateBroadcastPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse> getUpdateBroadcastPreferencesMethod;
    if ((getUpdateBroadcastPreferencesMethod = OrgGrpc.getUpdateBroadcastPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateBroadcastPreferencesMethod = OrgGrpc.getUpdateBroadcastPreferencesMethod) == null) {
          OrgGrpc.getUpdateBroadcastPreferencesMethod = getUpdateBroadcastPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBroadcastPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateBroadcastPreferences"))
              .build();
        }
      }
    }
    return getUpdateBroadcastPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse> getGetAuthenticationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthenticationPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse> getGetAuthenticationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse> getGetAuthenticationPreferencesMethod;
    if ((getGetAuthenticationPreferencesMethod = OrgGrpc.getGetAuthenticationPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAuthenticationPreferencesMethod = OrgGrpc.getGetAuthenticationPreferencesMethod) == null) {
          OrgGrpc.getGetAuthenticationPreferencesMethod = getGetAuthenticationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthenticationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAuthenticationPreferences"))
              .build();
        }
      }
    }
    return getGetAuthenticationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse> getUpdateAuthenticationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthenticationPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse> getUpdateAuthenticationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse> getUpdateAuthenticationPreferencesMethod;
    if ((getUpdateAuthenticationPreferencesMethod = OrgGrpc.getUpdateAuthenticationPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAuthenticationPreferencesMethod = OrgGrpc.getUpdateAuthenticationPreferencesMethod) == null) {
          OrgGrpc.getUpdateAuthenticationPreferencesMethod = getUpdateAuthenticationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthenticationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAuthenticationPreferences"))
              .build();
        }
      }
    }
    return getUpdateAuthenticationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse> getGetRecordingPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecordingPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse> getGetRecordingPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse> getGetRecordingPreferencesMethod;
    if ((getGetRecordingPreferencesMethod = OrgGrpc.getGetRecordingPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetRecordingPreferencesMethod = OrgGrpc.getGetRecordingPreferencesMethod) == null) {
          OrgGrpc.getGetRecordingPreferencesMethod = getGetRecordingPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecordingPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetRecordingPreferences"))
              .build();
        }
      }
    }
    return getGetRecordingPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse> getUpdateRecordingPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRecordingPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse> getUpdateRecordingPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse> getUpdateRecordingPreferencesMethod;
    if ((getUpdateRecordingPreferencesMethod = OrgGrpc.getUpdateRecordingPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateRecordingPreferencesMethod = OrgGrpc.getUpdateRecordingPreferencesMethod) == null) {
          OrgGrpc.getUpdateRecordingPreferencesMethod = getUpdateRecordingPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRecordingPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateRecordingPreferences"))
              .build();
        }
      }
    }
    return getUpdateRecordingPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse> getGetDashboardQueuePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDashboardQueuePreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse> getGetDashboardQueuePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse> getGetDashboardQueuePreferencesMethod;
    if ((getGetDashboardQueuePreferencesMethod = OrgGrpc.getGetDashboardQueuePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetDashboardQueuePreferencesMethod = OrgGrpc.getGetDashboardQueuePreferencesMethod) == null) {
          OrgGrpc.getGetDashboardQueuePreferencesMethod = getGetDashboardQueuePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDashboardQueuePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetDashboardQueuePreferences"))
              .build();
        }
      }
    }
    return getGetDashboardQueuePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse> getUpdateDashboardQueuePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboardQueuePreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse> getUpdateDashboardQueuePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse> getUpdateDashboardQueuePreferencesMethod;
    if ((getUpdateDashboardQueuePreferencesMethod = OrgGrpc.getUpdateDashboardQueuePreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateDashboardQueuePreferencesMethod = OrgGrpc.getUpdateDashboardQueuePreferencesMethod) == null) {
          OrgGrpc.getUpdateDashboardQueuePreferencesMethod = getUpdateDashboardQueuePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDashboardQueuePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateDashboardQueuePreferences"))
              .build();
        }
      }
    }
    return getUpdateDashboardQueuePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse> getGetAgentQuickViewPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentQuickViewPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse> getGetAgentQuickViewPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse> getGetAgentQuickViewPreferencesMethod;
    if ((getGetAgentQuickViewPreferencesMethod = OrgGrpc.getGetAgentQuickViewPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAgentQuickViewPreferencesMethod = OrgGrpc.getGetAgentQuickViewPreferencesMethod) == null) {
          OrgGrpc.getGetAgentQuickViewPreferencesMethod = getGetAgentQuickViewPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentQuickViewPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAgentQuickViewPreferences"))
              .build();
        }
      }
    }
    return getGetAgentQuickViewPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse> getGetVoiceAnalyticsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVoiceAnalyticsPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse> getGetVoiceAnalyticsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse> getGetVoiceAnalyticsPreferencesMethod;
    if ((getGetVoiceAnalyticsPreferencesMethod = OrgGrpc.getGetVoiceAnalyticsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetVoiceAnalyticsPreferencesMethod = OrgGrpc.getGetVoiceAnalyticsPreferencesMethod) == null) {
          OrgGrpc.getGetVoiceAnalyticsPreferencesMethod = getGetVoiceAnalyticsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVoiceAnalyticsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetVoiceAnalyticsPreferences"))
              .build();
        }
      }
    }
    return getGetVoiceAnalyticsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse> getUpdateVoiceAnalyticsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVoiceAnalyticsPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse> getUpdateVoiceAnalyticsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse> getUpdateVoiceAnalyticsPreferencesMethod;
    if ((getUpdateVoiceAnalyticsPreferencesMethod = OrgGrpc.getUpdateVoiceAnalyticsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateVoiceAnalyticsPreferencesMethod = OrgGrpc.getUpdateVoiceAnalyticsPreferencesMethod) == null) {
          OrgGrpc.getUpdateVoiceAnalyticsPreferencesMethod = getUpdateVoiceAnalyticsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVoiceAnalyticsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateVoiceAnalyticsPreferences"))
              .build();
        }
      }
    }
    return getUpdateVoiceAnalyticsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse> getGetScorecardsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScorecardsPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse> getGetScorecardsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse> getGetScorecardsPreferencesMethod;
    if ((getGetScorecardsPreferencesMethod = OrgGrpc.getGetScorecardsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetScorecardsPreferencesMethod = OrgGrpc.getGetScorecardsPreferencesMethod) == null) {
          OrgGrpc.getGetScorecardsPreferencesMethod = getGetScorecardsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScorecardsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetScorecardsPreferences"))
              .build();
        }
      }
    }
    return getGetScorecardsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse> getUpdateScorecardsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScorecardsPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse> getUpdateScorecardsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse> getUpdateScorecardsPreferencesMethod;
    if ((getUpdateScorecardsPreferencesMethod = OrgGrpc.getUpdateScorecardsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateScorecardsPreferencesMethod = OrgGrpc.getUpdateScorecardsPreferencesMethod) == null) {
          OrgGrpc.getUpdateScorecardsPreferencesMethod = getUpdateScorecardsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScorecardsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateScorecardsPreferences"))
              .build();
        }
      }
    }
    return getUpdateScorecardsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse> getGetEmailSmsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailSmsPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse> getGetEmailSmsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse> getGetEmailSmsPreferencesMethod;
    if ((getGetEmailSmsPreferencesMethod = OrgGrpc.getGetEmailSmsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetEmailSmsPreferencesMethod = OrgGrpc.getGetEmailSmsPreferencesMethod) == null) {
          OrgGrpc.getGetEmailSmsPreferencesMethod = getGetEmailSmsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailSmsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetEmailSmsPreferences"))
              .build();
        }
      }
    }
    return getGetEmailSmsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse> getUpdateEmailSmsPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmailSmsPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse> getUpdateEmailSmsPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse> getUpdateEmailSmsPreferencesMethod;
    if ((getUpdateEmailSmsPreferencesMethod = OrgGrpc.getUpdateEmailSmsPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateEmailSmsPreferencesMethod = OrgGrpc.getUpdateEmailSmsPreferencesMethod) == null) {
          OrgGrpc.getUpdateEmailSmsPreferencesMethod = getUpdateEmailSmsPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest, com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmailSmsPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateEmailSmsPreferences"))
              .build();
        }
      }
    }
    return getUpdateEmailSmsPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse> getEditAgentQuickViewPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditAgentQuickViewPreferences",
      requestType = com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest,
      com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse> getEditAgentQuickViewPreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest, com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse> getEditAgentQuickViewPreferencesMethod;
    if ((getEditAgentQuickViewPreferencesMethod = OrgGrpc.getEditAgentQuickViewPreferencesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getEditAgentQuickViewPreferencesMethod = OrgGrpc.getEditAgentQuickViewPreferencesMethod) == null) {
          OrgGrpc.getEditAgentQuickViewPreferencesMethod = getEditAgentQuickViewPreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest, com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditAgentQuickViewPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("EditAgentQuickViewPreferences"))
              .build();
        }
      }
    }
    return getEditAgentQuickViewPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest,
      com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse> getEditBackofficeThemePreferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditBackofficeThemePreference",
      requestType = com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest,
      com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse> getEditBackofficeThemePreferenceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest, com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse> getEditBackofficeThemePreferenceMethod;
    if ((getEditBackofficeThemePreferenceMethod = OrgGrpc.getEditBackofficeThemePreferenceMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getEditBackofficeThemePreferenceMethod = OrgGrpc.getEditBackofficeThemePreferenceMethod) == null) {
          OrgGrpc.getEditBackofficeThemePreferenceMethod = getEditBackofficeThemePreferenceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest, com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditBackofficeThemePreference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("EditBackofficeThemePreference"))
              .build();
        }
      }
    }
    return getEditBackofficeThemePreferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest,
      com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse> getGetBackofficeThemePreferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBackofficeThemePreference",
      requestType = com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest,
      com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse> getGetBackofficeThemePreferenceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest, com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse> getGetBackofficeThemePreferenceMethod;
    if ((getGetBackofficeThemePreferenceMethod = OrgGrpc.getGetBackofficeThemePreferenceMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetBackofficeThemePreferenceMethod = OrgGrpc.getGetBackofficeThemePreferenceMethod) == null) {
          OrgGrpc.getGetBackofficeThemePreferenceMethod = getGetBackofficeThemePreferenceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest, com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBackofficeThemePreference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetBackofficeThemePreference"))
              .build();
        }
      }
    }
    return getGetBackofficeThemePreferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest,
      com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse> getAcceptLinkbackRecordingTermsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptLinkbackRecordingTerms",
      requestType = com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest,
      com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse> getAcceptLinkbackRecordingTermsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest, com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse> getAcceptLinkbackRecordingTermsMethod;
    if ((getAcceptLinkbackRecordingTermsMethod = OrgGrpc.getAcceptLinkbackRecordingTermsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAcceptLinkbackRecordingTermsMethod = OrgGrpc.getAcceptLinkbackRecordingTermsMethod) == null) {
          OrgGrpc.getAcceptLinkbackRecordingTermsMethod = getAcceptLinkbackRecordingTermsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest, com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptLinkbackRecordingTerms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AcceptLinkbackRecordingTerms"))
              .build();
        }
      }
    }
    return getAcceptLinkbackRecordingTermsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse> getLinkbackUpdateBroadcastTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkbackUpdateBroadcastTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse> getLinkbackUpdateBroadcastTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest, com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse> getLinkbackUpdateBroadcastTemplatesMethod;
    if ((getLinkbackUpdateBroadcastTemplatesMethod = OrgGrpc.getLinkbackUpdateBroadcastTemplatesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getLinkbackUpdateBroadcastTemplatesMethod = OrgGrpc.getLinkbackUpdateBroadcastTemplatesMethod) == null) {
          OrgGrpc.getLinkbackUpdateBroadcastTemplatesMethod = getLinkbackUpdateBroadcastTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest, com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkbackUpdateBroadcastTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("LinkbackUpdateBroadcastTemplates"))
              .build();
        }
      }
    }
    return getLinkbackUpdateBroadcastTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest,
      com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse> getRecordEmailUnsubscribeAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordEmailUnsubscribeAcknowledgement",
      requestType = com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest,
      com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse> getRecordEmailUnsubscribeAcknowledgementMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse> getRecordEmailUnsubscribeAcknowledgementMethod;
    if ((getRecordEmailUnsubscribeAcknowledgementMethod = OrgGrpc.getRecordEmailUnsubscribeAcknowledgementMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRecordEmailUnsubscribeAcknowledgementMethod = OrgGrpc.getRecordEmailUnsubscribeAcknowledgementMethod) == null) {
          OrgGrpc.getRecordEmailUnsubscribeAcknowledgementMethod = getRecordEmailUnsubscribeAcknowledgementMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordEmailUnsubscribeAcknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RecordEmailUnsubscribeAcknowledgement"))
              .build();
        }
      }
    }
    return getRecordEmailUnsubscribeAcknowledgementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest,
      com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse> getClearEmailUnsubscribeAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearEmailUnsubscribeAcknowledgement",
      requestType = com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest,
      com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse> getClearEmailUnsubscribeAcknowledgementMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse> getClearEmailUnsubscribeAcknowledgementMethod;
    if ((getClearEmailUnsubscribeAcknowledgementMethod = OrgGrpc.getClearEmailUnsubscribeAcknowledgementMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getClearEmailUnsubscribeAcknowledgementMethod = OrgGrpc.getClearEmailUnsubscribeAcknowledgementMethod) == null) {
          OrgGrpc.getClearEmailUnsubscribeAcknowledgementMethod = getClearEmailUnsubscribeAcknowledgementMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest, com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearEmailUnsubscribeAcknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ClearEmailUnsubscribeAcknowledgement"))
              .build();
        }
      }
    }
    return getClearEmailUnsubscribeAcknowledgementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse> getCreateWebLinkTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWebLinkTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse> getCreateWebLinkTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest, com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse> getCreateWebLinkTemplateMethod;
    if ((getCreateWebLinkTemplateMethod = OrgGrpc.getCreateWebLinkTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateWebLinkTemplateMethod = OrgGrpc.getCreateWebLinkTemplateMethod) == null) {
          OrgGrpc.getCreateWebLinkTemplateMethod = getCreateWebLinkTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest, com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWebLinkTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateWebLinkTemplate"))
              .build();
        }
      }
    }
    return getCreateWebLinkTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse> getListWebLinkTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWebLinkTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse> getListWebLinkTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest, com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse> getListWebLinkTemplatesMethod;
    if ((getListWebLinkTemplatesMethod = OrgGrpc.getListWebLinkTemplatesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListWebLinkTemplatesMethod = OrgGrpc.getListWebLinkTemplatesMethod) == null) {
          OrgGrpc.getListWebLinkTemplatesMethod = getListWebLinkTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest, com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWebLinkTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListWebLinkTemplates"))
              .build();
        }
      }
    }
    return getListWebLinkTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse> getGetWebLinkTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWebLinkTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse> getGetWebLinkTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest, com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse> getGetWebLinkTemplateMethod;
    if ((getGetWebLinkTemplateMethod = OrgGrpc.getGetWebLinkTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetWebLinkTemplateMethod = OrgGrpc.getGetWebLinkTemplateMethod) == null) {
          OrgGrpc.getGetWebLinkTemplateMethod = getGetWebLinkTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest, com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWebLinkTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetWebLinkTemplate"))
              .build();
        }
      }
    }
    return getGetWebLinkTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse> getUpdateWebLinkTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWebLinkTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse> getUpdateWebLinkTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest, com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse> getUpdateWebLinkTemplateMethod;
    if ((getUpdateWebLinkTemplateMethod = OrgGrpc.getUpdateWebLinkTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateWebLinkTemplateMethod = OrgGrpc.getUpdateWebLinkTemplateMethod) == null) {
          OrgGrpc.getUpdateWebLinkTemplateMethod = getUpdateWebLinkTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest, com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWebLinkTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateWebLinkTemplate"))
              .build();
        }
      }
    }
    return getUpdateWebLinkTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse> getDeleteWebLinkTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWebLinkTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse> getDeleteWebLinkTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest, com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse> getDeleteWebLinkTemplateMethod;
    if ((getDeleteWebLinkTemplateMethod = OrgGrpc.getDeleteWebLinkTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteWebLinkTemplateMethod = OrgGrpc.getDeleteWebLinkTemplateMethod) == null) {
          OrgGrpc.getDeleteWebLinkTemplateMethod = getDeleteWebLinkTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest, com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWebLinkTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteWebLinkTemplate"))
              .build();
        }
      }
    }
    return getDeleteWebLinkTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse> getCreateAgentTriggerTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentTriggerTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse> getCreateAgentTriggerTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest, com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse> getCreateAgentTriggerTemplateMethod;
    if ((getCreateAgentTriggerTemplateMethod = OrgGrpc.getCreateAgentTriggerTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateAgentTriggerTemplateMethod = OrgGrpc.getCreateAgentTriggerTemplateMethod) == null) {
          OrgGrpc.getCreateAgentTriggerTemplateMethod = getCreateAgentTriggerTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest, com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgentTriggerTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateAgentTriggerTemplate"))
              .build();
        }
      }
    }
    return getCreateAgentTriggerTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse> getListAgentTriggerTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentTriggerTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse> getListAgentTriggerTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest, com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse> getListAgentTriggerTemplatesMethod;
    if ((getListAgentTriggerTemplatesMethod = OrgGrpc.getListAgentTriggerTemplatesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAgentTriggerTemplatesMethod = OrgGrpc.getListAgentTriggerTemplatesMethod) == null) {
          OrgGrpc.getListAgentTriggerTemplatesMethod = getListAgentTriggerTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest, com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentTriggerTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAgentTriggerTemplates"))
              .build();
        }
      }
    }
    return getListAgentTriggerTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse> getGetAgentTriggerTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentTriggerTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse> getGetAgentTriggerTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest, com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse> getGetAgentTriggerTemplateMethod;
    if ((getGetAgentTriggerTemplateMethod = OrgGrpc.getGetAgentTriggerTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAgentTriggerTemplateMethod = OrgGrpc.getGetAgentTriggerTemplateMethod) == null) {
          OrgGrpc.getGetAgentTriggerTemplateMethod = getGetAgentTriggerTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest, com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentTriggerTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAgentTriggerTemplate"))
              .build();
        }
      }
    }
    return getGetAgentTriggerTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse> getUpdateAgentTriggerTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentTriggerTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse> getUpdateAgentTriggerTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse> getUpdateAgentTriggerTemplateMethod;
    if ((getUpdateAgentTriggerTemplateMethod = OrgGrpc.getUpdateAgentTriggerTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAgentTriggerTemplateMethod = OrgGrpc.getUpdateAgentTriggerTemplateMethod) == null) {
          OrgGrpc.getUpdateAgentTriggerTemplateMethod = getUpdateAgentTriggerTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentTriggerTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAgentTriggerTemplate"))
              .build();
        }
      }
    }
    return getUpdateAgentTriggerTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse> getDeleteAgentTriggerTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentTriggerTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse> getDeleteAgentTriggerTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest, com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse> getDeleteAgentTriggerTemplateMethod;
    if ((getDeleteAgentTriggerTemplateMethod = OrgGrpc.getDeleteAgentTriggerTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteAgentTriggerTemplateMethod = OrgGrpc.getDeleteAgentTriggerTemplateMethod) == null) {
          OrgGrpc.getDeleteAgentTriggerTemplateMethod = getDeleteAgentTriggerTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest, com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgentTriggerTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteAgentTriggerTemplate"))
              .build();
        }
      }
    }
    return getDeleteAgentTriggerTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse> getCreateClientInfoDisplayTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClientInfoDisplayTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse> getCreateClientInfoDisplayTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest, com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse> getCreateClientInfoDisplayTemplateMethod;
    if ((getCreateClientInfoDisplayTemplateMethod = OrgGrpc.getCreateClientInfoDisplayTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateClientInfoDisplayTemplateMethod = OrgGrpc.getCreateClientInfoDisplayTemplateMethod) == null) {
          OrgGrpc.getCreateClientInfoDisplayTemplateMethod = getCreateClientInfoDisplayTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest, com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClientInfoDisplayTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateClientInfoDisplayTemplate"))
              .build();
        }
      }
    }
    return getCreateClientInfoDisplayTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse> getListClientInfoDisplayTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListClientInfoDisplayTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse> getListClientInfoDisplayTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest, com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse> getListClientInfoDisplayTemplatesMethod;
    if ((getListClientInfoDisplayTemplatesMethod = OrgGrpc.getListClientInfoDisplayTemplatesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListClientInfoDisplayTemplatesMethod = OrgGrpc.getListClientInfoDisplayTemplatesMethod) == null) {
          OrgGrpc.getListClientInfoDisplayTemplatesMethod = getListClientInfoDisplayTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest, com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListClientInfoDisplayTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListClientInfoDisplayTemplates"))
              .build();
        }
      }
    }
    return getListClientInfoDisplayTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse> getUpdateClientInfoDisplayTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClientInfoDisplayTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse> getUpdateClientInfoDisplayTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest, com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse> getUpdateClientInfoDisplayTemplateMethod;
    if ((getUpdateClientInfoDisplayTemplateMethod = OrgGrpc.getUpdateClientInfoDisplayTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateClientInfoDisplayTemplateMethod = OrgGrpc.getUpdateClientInfoDisplayTemplateMethod) == null) {
          OrgGrpc.getUpdateClientInfoDisplayTemplateMethod = getUpdateClientInfoDisplayTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest, com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClientInfoDisplayTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateClientInfoDisplayTemplate"))
              .build();
        }
      }
    }
    return getUpdateClientInfoDisplayTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse> getDeleteClientInfoDisplayTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClientInfoDisplayTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse> getDeleteClientInfoDisplayTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest, com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse> getDeleteClientInfoDisplayTemplateMethod;
    if ((getDeleteClientInfoDisplayTemplateMethod = OrgGrpc.getDeleteClientInfoDisplayTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteClientInfoDisplayTemplateMethod = OrgGrpc.getDeleteClientInfoDisplayTemplateMethod) == null) {
          OrgGrpc.getDeleteClientInfoDisplayTemplateMethod = getDeleteClientInfoDisplayTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest, com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteClientInfoDisplayTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteClientInfoDisplayTemplate"))
              .build();
        }
      }
    }
    return getDeleteClientInfoDisplayTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse> getGetClientInfoDisplayTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientInfoDisplayTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse> getGetClientInfoDisplayTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest, com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse> getGetClientInfoDisplayTemplateMethod;
    if ((getGetClientInfoDisplayTemplateMethod = OrgGrpc.getGetClientInfoDisplayTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetClientInfoDisplayTemplateMethod = OrgGrpc.getGetClientInfoDisplayTemplateMethod) == null) {
          OrgGrpc.getGetClientInfoDisplayTemplateMethod = getGetClientInfoDisplayTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest, com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClientInfoDisplayTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetClientInfoDisplayTemplate"))
              .build();
        }
      }
    }
    return getGetClientInfoDisplayTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse> getListAgentPauseCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentPauseCodes",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse> getListAgentPauseCodesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest, com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse> getListAgentPauseCodesMethod;
    if ((getListAgentPauseCodesMethod = OrgGrpc.getListAgentPauseCodesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAgentPauseCodesMethod = OrgGrpc.getListAgentPauseCodesMethod) == null) {
          OrgGrpc.getListAgentPauseCodesMethod = getListAgentPauseCodesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest, com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentPauseCodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAgentPauseCodes"))
              .build();
        }
      }
    }
    return getListAgentPauseCodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse> getCreateAgentPauseCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentPauseCode",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse> getCreateAgentPauseCodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest, com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse> getCreateAgentPauseCodeMethod;
    if ((getCreateAgentPauseCodeMethod = OrgGrpc.getCreateAgentPauseCodeMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateAgentPauseCodeMethod = OrgGrpc.getCreateAgentPauseCodeMethod) == null) {
          OrgGrpc.getCreateAgentPauseCodeMethod = getCreateAgentPauseCodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest, com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgentPauseCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateAgentPauseCode"))
              .build();
        }
      }
    }
    return getCreateAgentPauseCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse> getUpdateAgentPauseCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentPauseCode",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse> getUpdateAgentPauseCodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse> getUpdateAgentPauseCodeMethod;
    if ((getUpdateAgentPauseCodeMethod = OrgGrpc.getUpdateAgentPauseCodeMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAgentPauseCodeMethod = OrgGrpc.getUpdateAgentPauseCodeMethod) == null) {
          OrgGrpc.getUpdateAgentPauseCodeMethod = getUpdateAgentPauseCodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentPauseCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAgentPauseCode"))
              .build();
        }
      }
    }
    return getUpdateAgentPauseCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse> getDeleteAgentPauseCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentPauseCode",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse> getDeleteAgentPauseCodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest, com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse> getDeleteAgentPauseCodeMethod;
    if ((getDeleteAgentPauseCodeMethod = OrgGrpc.getDeleteAgentPauseCodeMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteAgentPauseCodeMethod = OrgGrpc.getDeleteAgentPauseCodeMethod) == null) {
          OrgGrpc.getDeleteAgentPauseCodeMethod = getDeleteAgentPauseCodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest, com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgentPauseCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteAgentPauseCode"))
              .build();
        }
      }
    }
    return getDeleteAgentPauseCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest,
      com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse> getListCustomReportFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCustomReportFilters",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest,
      com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse> getListCustomReportFiltersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest, com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse> getListCustomReportFiltersMethod;
    if ((getListCustomReportFiltersMethod = OrgGrpc.getListCustomReportFiltersMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListCustomReportFiltersMethod = OrgGrpc.getListCustomReportFiltersMethod) == null) {
          OrgGrpc.getListCustomReportFiltersMethod = getListCustomReportFiltersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest, com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCustomReportFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListCustomReportFilters"))
              .build();
        }
      }
    }
    return getListCustomReportFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest,
      com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse> getCreateCustomReportFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomReportFilter",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest,
      com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse> getCreateCustomReportFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest, com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse> getCreateCustomReportFilterMethod;
    if ((getCreateCustomReportFilterMethod = OrgGrpc.getCreateCustomReportFilterMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateCustomReportFilterMethod = OrgGrpc.getCreateCustomReportFilterMethod) == null) {
          OrgGrpc.getCreateCustomReportFilterMethod = getCreateCustomReportFilterMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest, com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomReportFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateCustomReportFilter"))
              .build();
        }
      }
    }
    return getCreateCustomReportFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse> getUpdateCustomReportFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCustomReportFilter",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse> getUpdateCustomReportFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest, com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse> getUpdateCustomReportFilterMethod;
    if ((getUpdateCustomReportFilterMethod = OrgGrpc.getUpdateCustomReportFilterMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateCustomReportFilterMethod = OrgGrpc.getUpdateCustomReportFilterMethod) == null) {
          OrgGrpc.getUpdateCustomReportFilterMethod = getUpdateCustomReportFilterMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest, com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCustomReportFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateCustomReportFilter"))
              .build();
        }
      }
    }
    return getUpdateCustomReportFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse> getDeleteCustomReportFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCustomReportFilter",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse> getDeleteCustomReportFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest, com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse> getDeleteCustomReportFilterMethod;
    if ((getDeleteCustomReportFilterMethod = OrgGrpc.getDeleteCustomReportFilterMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteCustomReportFilterMethod = OrgGrpc.getDeleteCustomReportFilterMethod) == null) {
          OrgGrpc.getDeleteCustomReportFilterMethod = getDeleteCustomReportFilterMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest, com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCustomReportFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteCustomReportFilter"))
              .build();
        }
      }
    }
    return getDeleteCustomReportFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse> getListAgentResponseGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentResponseGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse> getListAgentResponseGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest, com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse> getListAgentResponseGroupsMethod;
    if ((getListAgentResponseGroupsMethod = OrgGrpc.getListAgentResponseGroupsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAgentResponseGroupsMethod = OrgGrpc.getListAgentResponseGroupsMethod) == null) {
          OrgGrpc.getListAgentResponseGroupsMethod = getListAgentResponseGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest, com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentResponseGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAgentResponseGroups"))
              .build();
        }
      }
    }
    return getListAgentResponseGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest,
      com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse> getListLastTemplateElementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLastTemplateElements",
      requestType = com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest,
      com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse> getListLastTemplateElementsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest, com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse> getListLastTemplateElementsMethod;
    if ((getListLastTemplateElementsMethod = OrgGrpc.getListLastTemplateElementsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListLastTemplateElementsMethod = OrgGrpc.getListLastTemplateElementsMethod) == null) {
          OrgGrpc.getListLastTemplateElementsMethod = getListLastTemplateElementsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest, com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLastTemplateElements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListLastTemplateElements"))
              .build();
        }
      }
    }
    return getListLastTemplateElementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq,
      com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes> getListQueueConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListQueueConfigs",
      requestType = com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq,
      com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes> getListQueueConfigsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq, com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes> getListQueueConfigsMethod;
    if ((getListQueueConfigsMethod = OrgGrpc.getListQueueConfigsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListQueueConfigsMethod = OrgGrpc.getListQueueConfigsMethod) == null) {
          OrgGrpc.getListQueueConfigsMethod = getListQueueConfigsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq, com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListQueueConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListQueueConfigs"))
              .build();
        }
      }
    }
    return getListQueueConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes> getDeleteQueueConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteQueueConfig",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes> getDeleteQueueConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq, com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes> getDeleteQueueConfigMethod;
    if ((getDeleteQueueConfigMethod = OrgGrpc.getDeleteQueueConfigMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteQueueConfigMethod = OrgGrpc.getDeleteQueueConfigMethod) == null) {
          OrgGrpc.getDeleteQueueConfigMethod = getDeleteQueueConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq, com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteQueueConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteQueueConfig"))
              .build();
        }
      }
    }
    return getDeleteQueueConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes> getGetQueueConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueConfig",
      requestType = com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes> getGetQueueConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq, com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes> getGetQueueConfigMethod;
    if ((getGetQueueConfigMethod = OrgGrpc.getGetQueueConfigMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetQueueConfigMethod = OrgGrpc.getGetQueueConfigMethod) == null) {
          OrgGrpc.getGetQueueConfigMethod = getGetQueueConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq, com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueueConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetQueueConfig"))
              .build();
        }
      }
    }
    return getGetQueueConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes> getCreateQueueConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateQueueConfig",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes> getCreateQueueConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq, com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes> getCreateQueueConfigMethod;
    if ((getCreateQueueConfigMethod = OrgGrpc.getCreateQueueConfigMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateQueueConfigMethod = OrgGrpc.getCreateQueueConfigMethod) == null) {
          OrgGrpc.getCreateQueueConfigMethod = getCreateQueueConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq, com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateQueueConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateQueueConfig"))
              .build();
        }
      }
    }
    return getCreateQueueConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes> getUpdateQueueConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateQueueConfig",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes> getUpdateQueueConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq, com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes> getUpdateQueueConfigMethod;
    if ((getUpdateQueueConfigMethod = OrgGrpc.getUpdateQueueConfigMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateQueueConfigMethod = OrgGrpc.getUpdateQueueConfigMethod) == null) {
          OrgGrpc.getUpdateQueueConfigMethod = getUpdateQueueConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq, com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQueueConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateQueueConfig"))
              .build();
        }
      }
    }
    return getUpdateQueueConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes> getCopyQueueConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyQueueConfig",
      requestType = com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq,
      com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes> getCopyQueueConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq, com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes> getCopyQueueConfigMethod;
    if ((getCopyQueueConfigMethod = OrgGrpc.getCopyQueueConfigMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCopyQueueConfigMethod = OrgGrpc.getCopyQueueConfigMethod) == null) {
          OrgGrpc.getCopyQueueConfigMethod = getCopyQueueConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq, com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyQueueConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CopyQueueConfig"))
              .build();
        }
      }
    }
    return getCopyQueueConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq,
      com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes> getGetAllQueueConfigSoundsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllQueueConfigSounds",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq,
      com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes> getGetAllQueueConfigSoundsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq, com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes> getGetAllQueueConfigSoundsMethod;
    if ((getGetAllQueueConfigSoundsMethod = OrgGrpc.getGetAllQueueConfigSoundsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAllQueueConfigSoundsMethod = OrgGrpc.getGetAllQueueConfigSoundsMethod) == null) {
          OrgGrpc.getGetAllQueueConfigSoundsMethod = getGetAllQueueConfigSoundsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq, com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllQueueConfigSounds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAllQueueConfigSounds"))
              .build();
        }
      }
    }
    return getGetAllQueueConfigSoundsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq,
      com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes> getGetQueueConfigSoundMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueConfigSound",
      requestType = com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq,
      com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes> getGetQueueConfigSoundMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq, com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes> getGetQueueConfigSoundMethod;
    if ((getGetQueueConfigSoundMethod = OrgGrpc.getGetQueueConfigSoundMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetQueueConfigSoundMethod = OrgGrpc.getGetQueueConfigSoundMethod) == null) {
          OrgGrpc.getGetQueueConfigSoundMethod = getGetQueueConfigSoundMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq, com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueueConfigSound"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetQueueConfigSound"))
              .build();
        }
      }
    }
    return getGetQueueConfigSoundMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq,
      com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes> getSetQueueConfigSoundMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetQueueConfigSound",
      requestType = com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq,
      com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes> getSetQueueConfigSoundMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq, com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes> getSetQueueConfigSoundMethod;
    if ((getSetQueueConfigSoundMethod = OrgGrpc.getSetQueueConfigSoundMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getSetQueueConfigSoundMethod = OrgGrpc.getSetQueueConfigSoundMethod) == null) {
          OrgGrpc.getSetQueueConfigSoundMethod = getSetQueueConfigSoundMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq, com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetQueueConfigSound"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("SetQueueConfigSound"))
              .build();
        }
      }
    }
    return getSetQueueConfigSoundMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq,
      com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes> getSetAllQueueConfigSoundsFromSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAllQueueConfigSoundsFromSource",
      requestType = com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq,
      com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes> getSetAllQueueConfigSoundsFromSourceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq, com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes> getSetAllQueueConfigSoundsFromSourceMethod;
    if ((getSetAllQueueConfigSoundsFromSourceMethod = OrgGrpc.getSetAllQueueConfigSoundsFromSourceMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getSetAllQueueConfigSoundsFromSourceMethod = OrgGrpc.getSetAllQueueConfigSoundsFromSourceMethod) == null) {
          OrgGrpc.getSetAllQueueConfigSoundsFromSourceMethod = getSetAllQueueConfigSoundsFromSourceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq, com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAllQueueConfigSoundsFromSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("SetAllQueueConfigSoundsFromSource"))
              .build();
        }
      }
    }
    return getSetAllQueueConfigSoundsFromSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse> getGetUserBlockedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserBlocked",
      requestType = com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse> getGetUserBlockedMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest, com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse> getGetUserBlockedMethod;
    if ((getGetUserBlockedMethod = OrgGrpc.getGetUserBlockedMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserBlockedMethod = OrgGrpc.getGetUserBlockedMethod) == null) {
          OrgGrpc.getGetUserBlockedMethod = getGetUserBlockedMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest, com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserBlocked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserBlocked"))
              .build();
        }
      }
    }
    return getGetUserBlockedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnblockUserRequest,
      com.tcn.cloud.api.api.v0alpha.UnblockUserResponse> getUnblockUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnblockUser",
      requestType = com.tcn.cloud.api.api.v0alpha.UnblockUserRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UnblockUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnblockUserRequest,
      com.tcn.cloud.api.api.v0alpha.UnblockUserResponse> getUnblockUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnblockUserRequest, com.tcn.cloud.api.api.v0alpha.UnblockUserResponse> getUnblockUserMethod;
    if ((getUnblockUserMethod = OrgGrpc.getUnblockUserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUnblockUserMethod = OrgGrpc.getUnblockUserMethod) == null) {
          OrgGrpc.getUnblockUserMethod = getUnblockUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UnblockUserRequest, com.tcn.cloud.api.api.v0alpha.UnblockUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnblockUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UnblockUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UnblockUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UnblockUser"))
              .build();
        }
      }
    }
    return getUnblockUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest,
      com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse> getListP3UnMigratedUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListP3UnMigratedUsers",
      requestType = com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest,
      com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse> getListP3UnMigratedUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest, com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse> getListP3UnMigratedUsersMethod;
    if ((getListP3UnMigratedUsersMethod = OrgGrpc.getListP3UnMigratedUsersMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListP3UnMigratedUsersMethod = OrgGrpc.getListP3UnMigratedUsersMethod) == null) {
          OrgGrpc.getListP3UnMigratedUsersMethod = getListP3UnMigratedUsersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest, com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListP3UnMigratedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListP3UnMigratedUsers"))
              .build();
        }
      }
    }
    return getListP3UnMigratedUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest,
      com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse> getMigrateP3UserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateP3User",
      requestType = com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest,
      com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse> getMigrateP3UserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest, com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse> getMigrateP3UserMethod;
    if ((getMigrateP3UserMethod = OrgGrpc.getMigrateP3UserMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getMigrateP3UserMethod = OrgGrpc.getMigrateP3UserMethod) == null) {
          OrgGrpc.getMigrateP3UserMethod = getMigrateP3UserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest, com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateP3User"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("MigrateP3User"))
              .build();
        }
      }
    }
    return getMigrateP3UserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse> getUpdateP3UserNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateP3UserName",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse> getUpdateP3UserNameMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest, com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse> getUpdateP3UserNameMethod;
    if ((getUpdateP3UserNameMethod = OrgGrpc.getUpdateP3UserNameMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateP3UserNameMethod = OrgGrpc.getUpdateP3UserNameMethod) == null) {
          OrgGrpc.getUpdateP3UserNameMethod = getUpdateP3UserNameMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest, com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateP3UserName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateP3UserName"))
              .build();
        }
      }
    }
    return getUpdateP3UserNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest,
      com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse> getListOwnedUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOwnedUsers",
      requestType = com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest,
      com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse> getListOwnedUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest, com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse> getListOwnedUsersMethod;
    if ((getListOwnedUsersMethod = OrgGrpc.getListOwnedUsersMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListOwnedUsersMethod = OrgGrpc.getListOwnedUsersMethod) == null) {
          OrgGrpc.getListOwnedUsersMethod = getListOwnedUsersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest, com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOwnedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListOwnedUsers"))
              .build();
        }
      }
    }
    return getListOwnedUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest,
      com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse> getListOwnedOrgsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOwnedOrgs",
      requestType = com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest,
      com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse> getListOwnedOrgsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest, com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse> getListOwnedOrgsMethod;
    if ((getListOwnedOrgsMethod = OrgGrpc.getListOwnedOrgsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListOwnedOrgsMethod = OrgGrpc.getListOwnedOrgsMethod) == null) {
          OrgGrpc.getListOwnedOrgsMethod = getListOwnedOrgsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest, com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOwnedOrgs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListOwnedOrgs"))
              .build();
        }
      }
    }
    return getListOwnedOrgsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse> getRemoveLoginStrikesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLoginStrikes",
      requestType = com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse> getRemoveLoginStrikesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest, com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse> getRemoveLoginStrikesMethod;
    if ((getRemoveLoginStrikesMethod = OrgGrpc.getRemoveLoginStrikesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRemoveLoginStrikesMethod = OrgGrpc.getRemoveLoginStrikesMethod) == null) {
          OrgGrpc.getRemoveLoginStrikesMethod = getRemoveLoginStrikesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest, com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveLoginStrikes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RemoveLoginStrikes"))
              .build();
        }
      }
    }
    return getRemoveLoginStrikesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse> getRemoveUserLoginStrikesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserLoginStrikes",
      requestType = com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse> getRemoveUserLoginStrikesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest, com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse> getRemoveUserLoginStrikesMethod;
    if ((getRemoveUserLoginStrikesMethod = OrgGrpc.getRemoveUserLoginStrikesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRemoveUserLoginStrikesMethod = OrgGrpc.getRemoveUserLoginStrikesMethod) == null) {
          OrgGrpc.getRemoveUserLoginStrikesMethod = getRemoveUserLoginStrikesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest, com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserLoginStrikes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RemoveUserLoginStrikes"))
              .build();
        }
      }
    }
    return getRemoveUserLoginStrikesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest,
      com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse> getListLoginHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLoginHistory",
      requestType = com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest,
      com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse> getListLoginHistoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest, com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse> getListLoginHistoryMethod;
    if ((getListLoginHistoryMethod = OrgGrpc.getListLoginHistoryMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListLoginHistoryMethod = OrgGrpc.getListLoginHistoryMethod) == null) {
          OrgGrpc.getListLoginHistoryMethod = getListLoginHistoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest, com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLoginHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListLoginHistory"))
              .build();
        }
      }
    }
    return getListLoginHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse> getUpdateP3UserSidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateP3UserSids",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse> getUpdateP3UserSidsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest, com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse> getUpdateP3UserSidsMethod;
    if ((getUpdateP3UserSidsMethod = OrgGrpc.getUpdateP3UserSidsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateP3UserSidsMethod = OrgGrpc.getUpdateP3UserSidsMethod) == null) {
          OrgGrpc.getUpdateP3UserSidsMethod = getUpdateP3UserSidsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest, com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateP3UserSids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateP3UserSids"))
              .build();
        }
      }
    }
    return getUpdateP3UserSidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse> getCreateAuthConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAuthConnection",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse> getCreateAuthConnectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest, com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse> getCreateAuthConnectionMethod;
    if ((getCreateAuthConnectionMethod = OrgGrpc.getCreateAuthConnectionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateAuthConnectionMethod = OrgGrpc.getCreateAuthConnectionMethod) == null) {
          OrgGrpc.getCreateAuthConnectionMethod = getCreateAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest, com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateAuthConnection"))
              .build();
        }
      }
    }
    return getCreateAuthConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse> getGetAuthConnectionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthConnectionSettings",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse> getGetAuthConnectionSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest, com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse> getGetAuthConnectionSettingsMethod;
    if ((getGetAuthConnectionSettingsMethod = OrgGrpc.getGetAuthConnectionSettingsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetAuthConnectionSettingsMethod = OrgGrpc.getGetAuthConnectionSettingsMethod) == null) {
          OrgGrpc.getGetAuthConnectionSettingsMethod = getGetAuthConnectionSettingsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest, com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthConnectionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetAuthConnectionSettings"))
              .build();
        }
      }
    }
    return getGetAuthConnectionSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse> getUpdateAuthConnectionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthConnectionSettings",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse> getUpdateAuthConnectionSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest, com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse> getUpdateAuthConnectionSettingsMethod;
    if ((getUpdateAuthConnectionSettingsMethod = OrgGrpc.getUpdateAuthConnectionSettingsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAuthConnectionSettingsMethod = OrgGrpc.getUpdateAuthConnectionSettingsMethod) == null) {
          OrgGrpc.getUpdateAuthConnectionSettingsMethod = getUpdateAuthConnectionSettingsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest, com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthConnectionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAuthConnectionSettings"))
              .build();
        }
      }
    }
    return getUpdateAuthConnectionSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse> getDeleteAuthConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthConnection",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse> getDeleteAuthConnectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest, com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse> getDeleteAuthConnectionMethod;
    if ((getDeleteAuthConnectionMethod = OrgGrpc.getDeleteAuthConnectionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteAuthConnectionMethod = OrgGrpc.getDeleteAuthConnectionMethod) == null) {
          OrgGrpc.getDeleteAuthConnectionMethod = getDeleteAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest, com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteAuthConnection"))
              .build();
        }
      }
    }
    return getDeleteAuthConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse> getGetUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSubscription",
      requestType = com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest,
      com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse> getGetUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest, com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse> getGetUserSubscriptionMethod;
    if ((getGetUserSubscriptionMethod = OrgGrpc.getGetUserSubscriptionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetUserSubscriptionMethod = OrgGrpc.getGetUserSubscriptionMethod) == null) {
          OrgGrpc.getGetUserSubscriptionMethod = getGetUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest, com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetUserSubscription"))
              .build();
        }
      }
    }
    return getGetUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest,
      com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse> getAddUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserSubscription",
      requestType = com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest,
      com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse> getAddUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest, com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse> getAddUserSubscriptionMethod;
    if ((getAddUserSubscriptionMethod = OrgGrpc.getAddUserSubscriptionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getAddUserSubscriptionMethod = OrgGrpc.getAddUserSubscriptionMethod) == null) {
          OrgGrpc.getAddUserSubscriptionMethod = getAddUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest, com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("AddUserSubscription"))
              .build();
        }
      }
    }
    return getAddUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserSubscription",
      requestType = com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest,
      com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest, com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod;
    if ((getRemoveUserSubscriptionMethod = OrgGrpc.getRemoveUserSubscriptionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getRemoveUserSubscriptionMethod = OrgGrpc.getRemoveUserSubscriptionMethod) == null) {
          OrgGrpc.getRemoveUserSubscriptionMethod = getRemoveUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest, com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("RemoveUserSubscription"))
              .build();
        }
      }
    }
    return getRemoveUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse> getUpdateUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserSubscription",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse> getUpdateUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse> getUpdateUserSubscriptionMethod;
    if ((getUpdateUserSubscriptionMethod = OrgGrpc.getUpdateUserSubscriptionMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateUserSubscriptionMethod = OrgGrpc.getUpdateUserSubscriptionMethod) == null) {
          OrgGrpc.getUpdateUserSubscriptionMethod = getUpdateUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest, com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateUserSubscription"))
              .build();
        }
      }
    }
    return getUpdateUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserSubscriptions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod;
    if ((getListUserSubscriptionsMethod = OrgGrpc.getListUserSubscriptionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListUserSubscriptionsMethod = OrgGrpc.getListUserSubscriptionsMethod) == null) {
          OrgGrpc.getListUserSubscriptionsMethod = getListUserSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListUserSubscriptions"))
              .build();
        }
      }
    }
    return getListUserSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse> getListOrgSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrgSubscriptions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest,
      com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse> getListOrgSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse> getListOrgSubscriptionsMethod;
    if ((getListOrgSubscriptionsMethod = OrgGrpc.getListOrgSubscriptionsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListOrgSubscriptionsMethod = OrgGrpc.getListOrgSubscriptionsMethod) == null) {
          OrgGrpc.getListOrgSubscriptionsMethod = getListOrgSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest, com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrgSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListOrgSubscriptions"))
              .build();
        }
      }
    }
    return getListOrgSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest,
      com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse> getGetSystemEnvironmentDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSystemEnvironmentDetails",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest,
      com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse> getGetSystemEnvironmentDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest, com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse> getGetSystemEnvironmentDetailsMethod;
    if ((getGetSystemEnvironmentDetailsMethod = OrgGrpc.getGetSystemEnvironmentDetailsMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getGetSystemEnvironmentDetailsMethod = OrgGrpc.getGetSystemEnvironmentDetailsMethod) == null) {
          OrgGrpc.getGetSystemEnvironmentDetailsMethod = getGetSystemEnvironmentDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest, com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSystemEnvironmentDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("GetSystemEnvironmentDetails"))
              .build();
        }
      }
    }
    return getGetSystemEnvironmentDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse> getListAgentStatisticsTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentStatisticsTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest,
      com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse> getListAgentStatisticsTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest, com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse> getListAgentStatisticsTemplatesMethod;
    if ((getListAgentStatisticsTemplatesMethod = OrgGrpc.getListAgentStatisticsTemplatesMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getListAgentStatisticsTemplatesMethod = OrgGrpc.getListAgentStatisticsTemplatesMethod) == null) {
          OrgGrpc.getListAgentStatisticsTemplatesMethod = getListAgentStatisticsTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest, com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentStatisticsTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("ListAgentStatisticsTemplates"))
              .build();
        }
      }
    }
    return getListAgentStatisticsTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse> getCreateAgentStatisticsTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentStatisticsTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse> getCreateAgentStatisticsTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest, com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse> getCreateAgentStatisticsTemplateMethod;
    if ((getCreateAgentStatisticsTemplateMethod = OrgGrpc.getCreateAgentStatisticsTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getCreateAgentStatisticsTemplateMethod = OrgGrpc.getCreateAgentStatisticsTemplateMethod) == null) {
          OrgGrpc.getCreateAgentStatisticsTemplateMethod = getCreateAgentStatisticsTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest, com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgentStatisticsTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("CreateAgentStatisticsTemplate"))
              .build();
        }
      }
    }
    return getCreateAgentStatisticsTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse> getUpdateAgentStatisticsTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentStatisticsTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse> getUpdateAgentStatisticsTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse> getUpdateAgentStatisticsTemplateMethod;
    if ((getUpdateAgentStatisticsTemplateMethod = OrgGrpc.getUpdateAgentStatisticsTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getUpdateAgentStatisticsTemplateMethod = OrgGrpc.getUpdateAgentStatisticsTemplateMethod) == null) {
          OrgGrpc.getUpdateAgentStatisticsTemplateMethod = getUpdateAgentStatisticsTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest, com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentStatisticsTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("UpdateAgentStatisticsTemplate"))
              .build();
        }
      }
    }
    return getUpdateAgentStatisticsTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse> getDeleteAgentStatisticsTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentStatisticsTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse> getDeleteAgentStatisticsTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest, com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse> getDeleteAgentStatisticsTemplateMethod;
    if ((getDeleteAgentStatisticsTemplateMethod = OrgGrpc.getDeleteAgentStatisticsTemplateMethod) == null) {
      synchronized (OrgGrpc.class) {
        if ((getDeleteAgentStatisticsTemplateMethod = OrgGrpc.getDeleteAgentStatisticsTemplateMethod) == null) {
          OrgGrpc.getDeleteAgentStatisticsTemplateMethod = getDeleteAgentStatisticsTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest, com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgentStatisticsTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgMethodDescriptorSupplier("DeleteAgentStatisticsTemplate"))
              .build();
        }
      }
    }
    return getDeleteAgentStatisticsTemplateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrgStub>() {
        @java.lang.Override
        public OrgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrgStub(channel, callOptions);
        }
      };
    return OrgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrgBlockingStub>() {
        @java.lang.Override
        public OrgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrgBlockingStub(channel, callOptions);
        }
      };
    return OrgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrgFutureStub>() {
        @java.lang.Override
        public OrgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrgFutureStub(channel, callOptions);
        }
      };
    return OrgFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    default void registerOrganization(com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Converts a standard organiztion to a manual one.
     * WARNING: this process cannot be reversed.
     * </pre>
     */
    default void convertOrgToManual(com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertOrgToManualMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an organization
     * </pre>
     */
    default void updateOrganization(com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    default void archiveOrganization(com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArchiveOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Restores an archived organization.
     * </pre>
     */
    default void unArchiveOrganization(com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnArchiveOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of organizations that have been archived.
     * </pre>
     */
    default void listArchivedOrganizations(com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListArchivedOrganizationsMethod(), responseObserver);
    }

    /**
     */
    default void getOrganizationProfile(com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationProfileMethod(), responseObserver);
    }

    /**
     */
    default void getOrganizationProfileById(com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationProfileByIdMethod(), responseObserver);
    }

    /**
     */
    default void listOrganizationDescriptions(com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationDescriptionsMethod(), responseObserver);
    }

    /**
     */
    default void listRegionalOrganizations(com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRegionalOrganizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * update an organizations owning organization.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    default void updateP3OwningOrg(com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateP3OwningOrgMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets the owning organiztion for the given org
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    default void getP3OwningOrg(com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetP3OwningOrgMethod(), responseObserver);
    }

    /**
     */
    default void listOrganizationUserDescriptions(com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationUserDescriptionsMethod(), responseObserver);
    }

    /**
     */
    default void listUserDescriptions(com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserDescriptionsMethod(), responseObserver);
    }

    /**
     */
    default void getUserDirectory(com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserDirectoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetRegions takes nothing in the request and returns a list of all region names
     * </pre>
     */
    default void getRegions(com.tcn.cloud.api.api.v0alpha.GetRegionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetRegionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegionsMethod(), responseObserver);
    }

    /**
     */
    default void getUserDetails(com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UserDetails> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserDetailsMethod(), responseObserver);
    }

    /**
     */
    default void adminGetUserDetails(com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UserDetails> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdminGetUserDetailsMethod(), responseObserver);
    }

    /**
     */
    default void getAgentUsers(com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * This is transitionary api. It will be removed when user api is available.
     * GetAgentSettings gets some agent settings as defined by the GetAgentSettingsRequest.
     * Required Permissions:
     * AGENT
     * </pre>
     */
    default void getAgentSettings(com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgentProfileGroup gets a single AgentProfileGroup by given ID
     * Required Permissions:
     * ORG_VIEW
     * </pre>
     */
    default void getAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    default void updateAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    default void createAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgentProfileGroups lists all AgentProfileGroups for a given org
     * Required Permissions:
     * ORG_VIEW
     * </pre>
     */
    default void listAgentProfileGroups(com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentProfileGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes a single AgentProfileGroup by given ID. Can only delete if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    default void deleteAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups bulk assigns a list of users to a given AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    default void assignAgentProfileGroups(com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignAgentProfileGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUser updates a user as defined by the UpdateUserRequest.
     * Required Permissions:
     * USER_EDIT if the user_id is given on the request.
     * NONE (TODO: create &amp; use new perm) if the user_id is NOT given.
     *  This will only the currently logged in user.
     *  Only some of the fields on the request message can be updated
     *  for the currently logged in user: time_zone, linkback_numbers,
     *  caller_ids, and default_app.
     * </pre>
     */
    default void updateUser(com.tcn.cloud.api.api.v0alpha.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateUser creates a new user as defined by the CreateUserRequest
     * request message.
     * Required Permissions:
     * USER_CREATE, CUSTOMER_SUPPORT if adding to an org other than your own
     * </pre>
     */
    default void createUser(com.tcn.cloud.api.api.v0alpha.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a delegated user. This should only be called by an auth0 action.
     * </pre>
     */
    default void createDelegatedUser(com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDelegatedUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserPassword updates a users password to the
     * password given on the request message.
     * Required Permissions:
     * USER_EDIT if user_id was given on the request (Update another user's password)
     * USER_EDIT_PASSWORD if user_id is retrieved from token (Update your own password)
     * </pre>
     */
    default void updateUserPassword(com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * updates the users PasswordResetRequired field to false.
     * this should only be called by an auth0 action.
     * </pre>
     */
    default void resetUserRequirePasswordReset(com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetUserRequirePasswordResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate a password reset link for a user.
     * Required Permissions:
     *  USER_EDIT_PASSWORD if user_id not given on request.
     *  USER_EDIT if user_id given on the request.
     *  CUSTOMER_SUPPORT if user_id &amp; org_id given on request. User_id must be given if org_id is.
     * </pre>
     */
    default void getUserPasswordResetLink(com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserPasswordResetLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns whether or not the given user's email is verified.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    default void getUserEmailVerified(com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserEmailVerifiedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends a verfication email to the given users email.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    default void sendUserVerificationEmail(com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendUserVerificationEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the given user's to verified without needing to send a verification email.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    default void manualUserEmailVerification(com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getManualUserEmailVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticates impersonation and generates token to be used.
     * Required Permissions:
     * CUSTOMER_SUPPORT
     * </pre>
     */
    default void getTempUserToken(com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTempUserTokenMethod(), responseObserver);
    }

    /**
     */
    default void getCountriesList(com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCountriesListMethod(), responseObserver);
    }

    /**
     */
    default void getAdminClientPreferences(com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdminClientPreferencesMethod(), responseObserver);
    }

    /**
     */
    default void updateAdminClientPreferences(com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAdminClientPreferencesMethod(), responseObserver);
    }

    /**
     */
    default void getPermissions(com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeAccountOwnerPermissionFromUser revokes the
     * account owner permission for the given user
     * </pre>
     */
    default void revokeAccountOwnerPermissionFromUser(com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeAccountOwnerPermissionFromUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates a specified user to disabled or enabled. A disabled user cannot log in.
     * Required Permissions:
     *    - USER_EDIT
     * </pre>
     */
    default void updateUserDisabled(com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserDisabledMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBulkUsersDisabled updates every given user_id to be disabled or enabled. The returned list of updated_ids contains every id that was successfully updated.
     * Required Permissions:
     *		- USER_EDIT
     * </pre>
     */
    default void updateBulkUsersDisabled(com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBulkUsersDisabledMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the billing data for the given org. Billing data
     * will only be included for countries present on the org's
     * allowed countries preference.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: The org_id on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while getting the orgs billing settings.
     * </pre>
     */
    default void getOrgBillingSettings(com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrgBillingSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the given orgs billing settings as defined by the info
     * given on the request message. Only fields that are given on the
     * field mask will be updated.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: A field on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while updating the orgs billing settings.
     * </pre>
     */
    default void setOrgBillingSettings(com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetOrgBillingSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a single billing region override for the given orgs billing settings.
     * If an override already exists for the given region it will be updated.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: A field on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while adding the override.
     * </pre>
     */
    default void addOrgBillingOverride(com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOrgBillingOverrideMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a single billing region override for the given orgs billing settings.
     * If the region override doesn't exist the rpcs will just do nothing.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: The given org_id was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while removing the override.
     * </pre>
     */
    default void removeOrgBillingOverride(com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveOrgBillingOverrideMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the system default billing rates.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    default void getSystemDefaultBillingRates(com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSystemDefaultBillingRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListPermissionGroups returns the list of an org's permission groups.
     * </pre>
     */
    default void listPermissionGroups(com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPermissionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreatePermissionGroup creates a new permission group for the caller's organization.
     * </pre>
     */
    default void createPermissionGroup(com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdatePermissionGroup updates a permission group by id for the caller's organization.
     * </pre>
     */
    default void updatePermissionGroup(com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeletePermissionGroup deletes a permission group by id for the caller's organization.
     * </pre>
     */
    default void deletePermissionGroup(com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assigns a user to a acount owner permission group.
     * </pre>
     */
    default void assignUserToAccountOwnerPermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignUserToAccountOwnerPermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assigns a permission group to another user.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    default void assignUserPermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignUserPermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assigns a permission group to multiple users.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    default void assignUsersPermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignUsersPermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assigns permission group(s) to another user.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    default void updateUserNeoPermissionGroups(com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserNeoPermissionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revokes a permission group from another user.
     * Requires that all three of permission group, calling user, and user being revoked to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    default void revokeUserPermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeUserPermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revokes a permission group to multiple users.
     * Requires that all three of permission group, calling user, and user being revoked to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    default void revokeUsersPermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeUsersPermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * InitDefaultPermissionGroups initializes the default read only permission groups for the callers organization.
     * Idempotent call. Returns the default permission groups for the organization.
     * </pre>
     */
    default void initDefaultPermissionGroups(com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitDefaultPermissionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's Account Owner Group.
     * </pre>
     */
    default void addPermissionToAccountOwnerPermissionGroup(com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPermissionToAccountOwnerPermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's Account Owner Group.
     * </pre>
     */
    default void revokePermissionToAccountOwnerPermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokePermissionToAccountOwnerPermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    default void addPermissionToOrgDefaultGroup(com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPermissionToOrgDefaultGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a single permission from an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    default void removePermissionFromOrgDefaultGroup(com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePermissionFromOrgDefaultGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    default void getOrgDefaultSuperUserGroup(com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrgDefaultSuperUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListP3PermissionGroups returns the list of an org's P3 permission groups.
     * </pre>
     */
    default void listP3PermissionGroups(com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListP3PermissionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddUserRegion to a Users Accessible Regions
     * </pre>
     */
    default void addUserRegion(com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveUserRegion from a Users Accessible Regions
     * </pre>
     */
    default void removeUserRegion(com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates new p3 permission group
     * </pre>
     */
    default void createP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateP3PermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update p3 permission group
     * </pre>
     */
    default void updateP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateP3PermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete new p3 permission group
     * </pre>
     */
    default void deleteP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteP3PermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign one or many users a p3 permission group
     * </pre>
     */
    default void assignUsersP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignUsersP3PermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddLoginToUser Creates new login for a given user
     * </pre>
     */
    default void addLoginToUser(com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLoginToUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revoke a p3 permission group to another user(s).
     * Requires that permission group and user(s) being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    default void revokeUsersP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeUsersP3PermissionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetContactPreferences returns all contact preferences for client TODO: will replace ContactList above
     * </pre>
     */
    default void getContactPreferences(com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContactPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateContactPreferences update fields for all contact preferences for client
     * </pre>
     */
    default void updateContactPreferences(com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateContactPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all client compliance preferences
     * </pre>
     */
    default void getCompliancePreferences(com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompliancePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates all client Compliance preferences
     * </pre>
     */
    default void updateCompliancePreferences(com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCompliancePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgentPreferences returns all client agent preferences
     * </pre>
     */
    default void getAgentPreferences(com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates client agent preferences
     * </pre>
     */
    default void updateAgentPreferences(com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns preferences for the organization tab
     * </pre>
     */
    default void getOrganizationPreferences(com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates preferences for the organization tab
     * </pre>
     */
    default void updateOrganizationPreferences(com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns all schedule preferences for an org.
     * </pre>
     */
    default void getSchedulePreferences(com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSchedulePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences returns all schedule preferences for an org.
     * </pre>
     */
    default void updateSchedulePreferences(com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSchedulePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns all business intelligence and associated analytic preferences
     * </pre>
     */
    default void getBusinessPreferences(com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBusinessPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates all business intelligence and associated analytic preferences
     * </pre>
     */
    default void updateBusinessPreferences(com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBusinessPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns a time (hour 1-24) for each day of the week.
     * </pre>
     */
    default void getEndOfDayPreferences(com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEndOfDayPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences update fields for a time (hour 1-24) for each day of the week.
     * </pre>
     */
    default void updateEndOfDayPreferences(com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEndOfDayPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for the organization tab
     * </pre>
     */
    default void getReportFilterPreferences(com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReportFilterPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for the filter tab
     * </pre>
     */
    default void updateReportFilterPreferences(com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReportFilterPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPhonePreferences returns all phone and recording preferences for an org.
     * </pre>
     */
    default void getPhonePreferences(com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPhonePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates phone and recording preferences for an org.
     * </pre>
     */
    default void updatePhonePreferences(com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePhonePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns all dashboard general preferences for an org.
     * </pre>
     */
    default void getDashboardGeneralPreferences(com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDashboardGeneralPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates dashboard General preferences for an org.
     * </pre>
     */
    default void updateDashboardGeneralPreferences(com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDashboardGeneralPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns all webhook preferences for an org.
     * </pre>
     */
    default void getWebhookPreferences(com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWebhookPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates webhook preferences for an org.
     * </pre>
     */
    default void updateWebhookPreferences(com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWebhookPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns all broadcast options for campaign preferences for an org.
     * </pre>
     */
    default void getBroadcastPreferences(com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBroadcastPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates broadcast options for campaign preferences for an org.
     * </pre>
     */
    default void updateBroadcastPreferences(com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBroadcastPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns all authentication options for an org.
     * </pre>
     */
    default void getAuthenticationPreferences(com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthenticationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates authentication preferences for an org.
     * </pre>
     */
    default void updateAuthenticationPreferences(com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthenticationPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns all recording options for an org.
     * </pre>
     */
    default void getRecordingPreferences(com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecordingPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates Recording preferences for an org.
     * </pre>
     */
    default void updateRecordingPreferences(com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRecordingPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns the Dashboard Queue table preferences.
     * </pre>
     */
    default void getDashboardQueuePreferences(com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDashboardQueuePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates the Dashboard Queue table preferences.
     * </pre>
     */
    default void updateDashboardQueuePreferences(com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDashboardQueuePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgentQuickViewPreferences returns the diplay templates for the client
     * </pre>
     */
    default void getAgentQuickViewPreferences(com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentQuickViewPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns the all preferences for voice analytics
     * </pre>
     */
    default void getVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVoiceAnalyticsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences updates the all preferences for voice analytics
     * </pre>
     */
    default void updateVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVoiceAnalyticsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns the all preferences for scorecards
     * </pre>
     */
    default void getScorecardsPreferences(com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScorecardsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetScorecardsPreferences updates the all preferences for scorecards
     * </pre>
     */
    default void updateScorecardsPreferences(com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScorecardsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns the all preferences for email and sms
     * </pre>
     */
    default void getEmailSmsPreferences(com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailSmsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences updates the all preferences for email and sms
     * </pre>
     */
    default void updateEmailSmsPreferences(com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmailSmsPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditAgentQuickViewPreferences return nil,error
     * </pre>
     */
    default void editAgentQuickViewPreferences(com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditAgentQuickViewPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditBackofficeThemePreference returns nil, error
     * changes the Client Skin client property
     * </pre>
     */
    default void editBackofficeThemePreference(com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditBackofficeThemePreferenceMethod(), responseObserver);
    }

    /**
     */
    default void getBackofficeThemePreference(com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBackofficeThemePreferenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcceptLinkbackRecordingTerms controls acknowledgement for linkback recording terms and conditions
     * </pre>
     */
    default void acceptLinkbackRecordingTerms(com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcceptLinkbackRecordingTermsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template action parameters pertaining to linkback recording
     * </pre>
     */
    default void linkbackUpdateBroadcastTemplates(com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkbackUpdateBroadcastTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement inserts an activity log when the client acknowledges responsibility
     * for their own email unsubscribe links.
     * </pre>
     */
    default void recordEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordEmailUnsubscribeAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement inserts an activity log when the client clears acknowledgement for
     * their own email unsubscribe links.
     * </pre>
     */
    default void clearEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearEmailUnsubscribeAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new WebLinkTemplate as defined by request message CreateWebLinkTemplateRequest.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    default void createWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWebLinkTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * List every WebLinkTemplate.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    default void listWebLinkTemplates(com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWebLinkTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get one WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    default void getWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWebLinkTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    default void updateWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWebLinkTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    default void deleteWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWebLinkTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new AgentTriggerTemplate as defined by request message CreateAgentTriggerTemplateRequest.
     * The id field on the request message will be generated as part of
     * this method. If the id field is set it WILL be overwritten.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    default void createAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentTriggerTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of every AgentTriggerTemplate for the given
     * hunt_group_sid on the request.
     * Requiree Permissions:
     *  ORG_VIEW
     * </pre>
     */
    default void listAgentTriggerTemplates(com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentTriggerTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns one AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    default void getAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentTriggerTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    default void updateAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentTriggerTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    default void deleteAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgentTriggerTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new ClientInfoDisplayTemplate as defined by request
     * message CreateClientInfoDisplayRequest.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    default void createClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClientInfoDisplayTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of every ClientInfoDisplayTemplate.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    default void listClientInfoDisplayTemplates(com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListClientInfoDisplayTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the ClientInfoDisplayTemplate as defined by request
     * message UpdateClientIntoDisplayTemplateRequest.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    default void updateClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientInfoDisplayTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the ClientInfoDisplayTemplate with the id given on the request
     * message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    default void deleteClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteClientInfoDisplayTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns one ClientInfoDisplayTemplate with the id given on the
     * request message.
     *  Required Permissions:
     *    ORG_VIEW
     * </pre>
     */
    default void getClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientInfoDisplayTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a slice of agent pause codes.
     * </pre>
     */
    default void listAgentPauseCodes(com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentPauseCodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new Agent Pause Code as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set, or the the pause_code.codes field is an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    default void createAgentPauseCode(com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentPauseCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an Agent Pause Code with the xml_client_property_sid given on
     * the pause_code in the request message as defined by the other fields
     * on the pause_code message.
     * Required Permissions:
     *    AGENT_MANAGEMENT
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set or the pause_code.codes field was an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    default void updateAgentPauseCode(com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentPauseCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an Agent Pause Code with the sid given on the request message.
     * Errors:
     *    - grpc.InvalidArgument: The xml_client_property_sid field is invalid.
     * </pre>
     */
    default void deleteAgentPauseCode(com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgentPauseCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a slice of custom report filters belonging to client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    default void listCustomReportFilters(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCustomReportFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new custom report filter as defined by the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The custom report filter has an empty name or no filtering parameters.
     *    - grpc.Internal: An error occurred marshalling the custom report filter into an xml string.
     * </pre>
     */
    default void createCustomReportFilter(com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCustomReportFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a custom report filter with the requested xml_client_property_sid
     * with the report filter in the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set or the pause_code.codes field was an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    default void updateCustomReportFilter(com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCustomReportFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a custom report filter with the sid given on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The xml_client_property_sid field is invalid.
     * </pre>
     */
    default void deleteCustomReportFilter(com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCustomReportFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a slice of hunt group scripts belonging to the client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    default void listAgentResponseGroups(com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentResponseGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a slice of last template element scripts belonging to the client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    default void listLastTemplateElements(com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLastTemplateElementsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the names of the custom queue configs.
     * Required Permissions:
     *    ORG_VIEW (If &#64;org_id is empty)
     *    CUSTOMER_SUPPORT (If &#64;org_id is NOT empty)
     * Errors:
     *   - grpc.Internal: An error occurred while getting the config names.
     *   - grpc.NotFound: The given &#64;org_id was not found (if &#64;org_id is NOT empty).
     * </pre>
     */
    default void listQueueConfigs(com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListQueueConfigsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a queue config with the given &#64;client_sid and &#64;config_name.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while removing the config.
     *    - grpc.InvalidArgument: the config_name was invalid.
     * </pre>
     */
    default void deleteQueueConfig(com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteQueueConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the details for the queue config for the given &#64;client_sid with
     * the given &#64;name. If &#64;merge is true, the config data will be merged
     * with the default config data.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *   - grpc.Internal: An unexpected error occurred getting the config data.
     *   - grpc.InvalidArgument: the given config name was invalid.
     * </pre>
     */
    default void getQueueConfig(com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueueConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a queue config as defined by the &#64;config given
     * on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while saving the config.
     *    - grpc.InvalidArgument: the given config was invalid.
     * </pre>
     */
    default void createQueueConfig(com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateQueueConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a new queue config as defined by the &#64;config given
     * on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The name of the given config could not be found.
     *    - grpc.Internal: An unexpected error occurred while saving the config.
     *    - grpc.InvalidArgument: the given config was invalid.
     * </pre>
     */
    default void updateQueueConfig(com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateQueueConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Copies a queue config belonging to one organization to another.
     * The queue config with the &#64;from_name will be copied from the
     * organization with the &#64;from_org_id to the organization with the
     * &#64;to_org_id under the new &#64;to_name.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while copying the config.
     *    - grpc.InvalidArgument: A field on the request message was invalid.
     *    - grpc.NotFound: The &#64;to_org_id, &#64;from_org_id, or &#64;from_name was not found.
     *    - grpc.AlreadyExists: The &#64;to_name already exists for the &#64;to_org_id.
     * </pre>
     */
    default void copyQueueConfig(com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyQueueConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the url of a downloadable zip file containing every
     * sound for the given queue config.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while zipping the files.
     *    - grpc.NotFound: The given queue config was not found.
     * </pre>
     */
    default void getAllQueueConfigSounds(com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllQueueConfigSoundsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the url of a downladable wav file for the given config's
     * sound matching the given sound enum. Leaving the config field empty
     * will look up the sound for the account default config.
     * Required Permissions:
     *  ORG_VIEW
     * Errors:
     *  - grpc.Internal: An unexpected error occurrec while getting the
     *    downloadable file url.
     *  - grpc.NotFound: The given queue config was not found or the sound
     *    was not found for the config.
     * </pre>
     */
    default void getQueueConfigSound(com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueueConfigSoundMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the given sound for the config to one of the uploaded
     * sound files in the clients upload folder matching the
     * given file_name on the request. Leaving the config field empty
     * will set the sound for the account default config.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while updating
     *      the configs sound.
     *    - gprc.NotFound: The given queue config was not found or the
     *      sound file was not found for the client.
     *    - grpc.InvalidArgument: The file_name on the request was invalid.
     * </pre>
     */
    default void setQueueConfigSound(com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetQueueConfigSoundMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets every sound for a given config by copying them from
     * another config OR by copying them from a default sound set
     * identified by language and gender. Empty config names will be
     * treated as the account default config.
     * Required Permissions:
     *    ORG_EDIT
     * Errors
     *    - grpc.Internal: An unexpected error occurred while updating
     *      all sounds for the given to_config.
     *    - grpc.NotFound: The given to_config or from.config (if used)
     *      could not be found or the default sound set for the given
     *      gender/language identifier could not be found.
     *    - grpc.InvalidArgument: The to_config and from.config contained
     *      the same value. (If from.config was used)
     * </pre>
     */
    default void setAllQueueConfigSoundsFromSource(com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAllQueueConfigSoundsFromSourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks a user's blocked status.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while getting the user.
     *    - grpc.InvalidArgument: The user_id on the request was invalid.
     * </pre>
     */
    default void getUserBlocked(com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserBlockedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unblocks the given user.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while unblocking the user.
     *    - grpc.InvalidArgument: The user_id on the request was invalid.
     * </pre>
     */
    default void unblockUser(com.tcn.cloud.api.api.v0alpha.UnblockUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnblockUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnblockUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all users who only exist in skunk and have not yet been migrated
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    default void listP3UnMigratedUsers(com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListP3UnMigratedUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Migrates a login or agent from backoffice to firestore
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    default void migrateP3User(com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateP3UserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the username in skunk only for a agent or login
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    default void updateP3UserName(com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateP3UserNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all users under the p3 hierarchy
     * Required Permissions:
     *  OWNING_ORG_IMITATION
     * </pre>
     */
    default void listOwnedUsers(com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOwnedUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all orgs under the p3 hierarchy
     * Required Permissions:
     * PERMISSION_ORG_VIEW
     * </pre>
     */
    default void listOwnedOrgs(com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOwnedOrgsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removed login strike from list of given login_log_sids
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    default void removeLoginStrikes(com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveLoginStrikesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removed login strikes by user_id
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    default void removeUserLoginStrikes(com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserLoginStrikesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists user login history by ip or user_id
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    default void listLoginHistory(com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLoginHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a users agentsid and loginsid
     * Required Permissions:
     *  TCN_ADMIN_SETTINGS
     * </pre>
     */
    default void updateP3UserSids(com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateP3UserSidsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    default void createAuthConnection(com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuthConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth0 connection settings.
     * </pre>
     */
    default void getAuthConnectionSettings(com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthConnectionSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSettings updates an existing auth0 connection settings.
     * </pre>
     */
    default void updateAuthConnectionSettings(com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthConnectionSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    default void deleteAuthConnection(com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAuthConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription by id
     * Required Permissions:
     *    ORG_VIEW if user id IS provided
     *    none if user id NOT provided
     * </pre>
     */
    default void getUserSubscription(com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a user subscription to users list of subscriptions
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    default void addUserSubscription(com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a user subscription from a users list of subscription
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    default void removeUserSubscription(com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    default void updateUserSubscription(com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all of a users subscriptions
     * Required Permissions:
     *    ORG_VIEW if user id IS provided
     *    none if user id NOT provided
     * </pre>
     */
    default void listUserSubscriptions(com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists multiple users subscriptions by org. Optionally filters by event type.
     * Required Permissions:
     *    ORG_VIEW
     * </pre>
     */
    default void listOrgSubscriptions(com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrgSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the systems current environment details
     * Required Permissions:
     *    N/A
     * </pre>
     */
    default void getSystemEnvironmentDetails(com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSystemEnvironmentDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of agent statistics templates belonging to client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    default void listAgentStatisticsTemplates(com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentStatisticsTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid is not found.
     * </pre>
     */
    default void createAgentStatisticsTemplate(com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentStatisticsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid is not found.
     * </pre>
     */
    default void updateAgentStatisticsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentStatisticsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid or agent statistics template is not found.
     * </pre>
     */
    default void deleteAgentStatisticsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgentStatisticsTemplateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Org.
   */
  public static abstract class OrgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Org.
   */
  public static final class OrgStub
      extends io.grpc.stub.AbstractAsyncStub<OrgStub> {
    private OrgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrgStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public void registerOrganization(com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Converts a standard organiztion to a manual one.
     * WARNING: this process cannot be reversed.
     * </pre>
     */
    public void convertOrgToManual(com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertOrgToManualMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an organization
     * </pre>
     */
    public void updateOrganization(com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public void archiveOrganization(com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArchiveOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Restores an archived organization.
     * </pre>
     */
    public void unArchiveOrganization(com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnArchiveOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of organizations that have been archived.
     * </pre>
     */
    public void listArchivedOrganizations(com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListArchivedOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganizationProfile(com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganizationProfileById(com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationProfileByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrganizationDescriptions(com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationDescriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRegionalOrganizations(com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRegionalOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update an organizations owning organization.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    public void updateP3OwningOrg(com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateP3OwningOrgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets the owning organiztion for the given org
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    public void getP3OwningOrg(com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetP3OwningOrgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrganizationUserDescriptions(com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationUserDescriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUserDescriptions(com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListUserDescriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserDirectory(com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetRegions takes nothing in the request and returns a list of all region names
     * </pre>
     */
    public void getRegions(com.tcn.cloud.api.api.v0alpha.GetRegionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetRegionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserDetails(com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UserDetails> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adminGetUserDetails(com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UserDetails> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdminGetUserDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAgentUsers(com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * This is transitionary api. It will be removed when user api is available.
     * GetAgentSettings gets some agent settings as defined by the GetAgentSettingsRequest.
     * Required Permissions:
     * AGENT
     * </pre>
     */
    public void getAgentSettings(com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgentProfileGroup gets a single AgentProfileGroup by given ID
     * Required Permissions:
     * ORG_VIEW
     * </pre>
     */
    public void getAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public void updateAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public void createAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgentProfileGroups lists all AgentProfileGroups for a given org
     * Required Permissions:
     * ORG_VIEW
     * </pre>
     */
    public void listAgentProfileGroups(com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentProfileGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes a single AgentProfileGroup by given ID. Can only delete if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public void deleteAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups bulk assigns a list of users to a given AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public void assignAgentProfileGroups(com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignAgentProfileGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUser updates a user as defined by the UpdateUserRequest.
     * Required Permissions:
     * USER_EDIT if the user_id is given on the request.
     * NONE (TODO: create &amp; use new perm) if the user_id is NOT given.
     *  This will only the currently logged in user.
     *  Only some of the fields on the request message can be updated
     *  for the currently logged in user: time_zone, linkback_numbers,
     *  caller_ids, and default_app.
     * </pre>
     */
    public void updateUser(com.tcn.cloud.api.api.v0alpha.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateUser creates a new user as defined by the CreateUserRequest
     * request message.
     * Required Permissions:
     * USER_CREATE, CUSTOMER_SUPPORT if adding to an org other than your own
     * </pre>
     */
    public void createUser(com.tcn.cloud.api.api.v0alpha.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a delegated user. This should only be called by an auth0 action.
     * </pre>
     */
    public void createDelegatedUser(com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDelegatedUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserPassword updates a users password to the
     * password given on the request message.
     * Required Permissions:
     * USER_EDIT if user_id was given on the request (Update another user's password)
     * USER_EDIT_PASSWORD if user_id is retrieved from token (Update your own password)
     * </pre>
     */
    public void updateUserPassword(com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * updates the users PasswordResetRequired field to false.
     * this should only be called by an auth0 action.
     * </pre>
     */
    public void resetUserRequirePasswordReset(com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetUserRequirePasswordResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate a password reset link for a user.
     * Required Permissions:
     *  USER_EDIT_PASSWORD if user_id not given on request.
     *  USER_EDIT if user_id given on the request.
     *  CUSTOMER_SUPPORT if user_id &amp; org_id given on request. User_id must be given if org_id is.
     * </pre>
     */
    public void getUserPasswordResetLink(com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns whether or not the given user's email is verified.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    public void getUserEmailVerified(com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends a verfication email to the given users email.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    public void sendUserVerificationEmail(com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendUserVerificationEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the given user's to verified without needing to send a verification email.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    public void manualUserEmailVerification(com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getManualUserEmailVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticates impersonation and generates token to be used.
     * Required Permissions:
     * CUSTOMER_SUPPORT
     * </pre>
     */
    public void getTempUserToken(com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTempUserTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCountriesList(com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCountriesListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAdminClientPreferences(com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdminClientPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAdminClientPreferences(com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAdminClientPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPermissions(com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeAccountOwnerPermissionFromUser revokes the
     * account owner permission for the given user
     * </pre>
     */
    public void revokeAccountOwnerPermissionFromUser(com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeAccountOwnerPermissionFromUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates a specified user to disabled or enabled. A disabled user cannot log in.
     * Required Permissions:
     *    - USER_EDIT
     * </pre>
     */
    public void updateUserDisabled(com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserDisabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBulkUsersDisabled updates every given user_id to be disabled or enabled. The returned list of updated_ids contains every id that was successfully updated.
     * Required Permissions:
     *		- USER_EDIT
     * </pre>
     */
    public void updateBulkUsersDisabled(com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBulkUsersDisabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the billing data for the given org. Billing data
     * will only be included for countries present on the org's
     * allowed countries preference.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: The org_id on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while getting the orgs billing settings.
     * </pre>
     */
    public void getOrgBillingSettings(com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrgBillingSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the given orgs billing settings as defined by the info
     * given on the request message. Only fields that are given on the
     * field mask will be updated.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: A field on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while updating the orgs billing settings.
     * </pre>
     */
    public void setOrgBillingSettings(com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetOrgBillingSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a single billing region override for the given orgs billing settings.
     * If an override already exists for the given region it will be updated.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: A field on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while adding the override.
     * </pre>
     */
    public void addOrgBillingOverride(com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOrgBillingOverrideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a single billing region override for the given orgs billing settings.
     * If the region override doesn't exist the rpcs will just do nothing.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: The given org_id was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while removing the override.
     * </pre>
     */
    public void removeOrgBillingOverride(com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveOrgBillingOverrideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the system default billing rates.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    public void getSystemDefaultBillingRates(com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSystemDefaultBillingRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListPermissionGroups returns the list of an org's permission groups.
     * </pre>
     */
    public void listPermissionGroups(com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPermissionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreatePermissionGroup creates a new permission group for the caller's organization.
     * </pre>
     */
    public void createPermissionGroup(com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdatePermissionGroup updates a permission group by id for the caller's organization.
     * </pre>
     */
    public void updatePermissionGroup(com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeletePermissionGroup deletes a permission group by id for the caller's organization.
     * </pre>
     */
    public void deletePermissionGroup(com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assigns a user to a acount owner permission group.
     * </pre>
     */
    public void assignUserToAccountOwnerPermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignUserToAccountOwnerPermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assigns a permission group to another user.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public void assignUserPermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignUserPermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assigns a permission group to multiple users.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public void assignUsersPermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignUsersPermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assigns permission group(s) to another user.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public void updateUserNeoPermissionGroups(com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserNeoPermissionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revokes a permission group from another user.
     * Requires that all three of permission group, calling user, and user being revoked to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public void revokeUserPermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeUserPermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revokes a permission group to multiple users.
     * Requires that all three of permission group, calling user, and user being revoked to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public void revokeUsersPermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeUsersPermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InitDefaultPermissionGroups initializes the default read only permission groups for the callers organization.
     * Idempotent call. Returns the default permission groups for the organization.
     * </pre>
     */
    public void initDefaultPermissionGroups(com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitDefaultPermissionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's Account Owner Group.
     * </pre>
     */
    public void addPermissionToAccountOwnerPermissionGroup(com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPermissionToAccountOwnerPermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's Account Owner Group.
     * </pre>
     */
    public void revokePermissionToAccountOwnerPermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokePermissionToAccountOwnerPermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    public void addPermissionToOrgDefaultGroup(com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPermissionToOrgDefaultGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a single permission from an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    public void removePermissionFromOrgDefaultGroup(com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePermissionFromOrgDefaultGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    public void getOrgDefaultSuperUserGroup(com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrgDefaultSuperUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListP3PermissionGroups returns the list of an org's P3 permission groups.
     * </pre>
     */
    public void listP3PermissionGroups(com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListP3PermissionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddUserRegion to a Users Accessible Regions
     * </pre>
     */
    public void addUserRegion(com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveUserRegion from a Users Accessible Regions
     * </pre>
     */
    public void removeUserRegion(com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates new p3 permission group
     * </pre>
     */
    public void createP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update p3 permission group
     * </pre>
     */
    public void updateP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete new p3 permission group
     * </pre>
     */
    public void deleteP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign one or many users a p3 permission group
     * </pre>
     */
    public void assignUsersP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignUsersP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddLoginToUser Creates new login for a given user
     * </pre>
     */
    public void addLoginToUser(com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLoginToUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revoke a p3 permission group to another user(s).
     * Requires that permission group and user(s) being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public void revokeUsersP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeUsersP3PermissionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetContactPreferences returns all contact preferences for client TODO: will replace ContactList above
     * </pre>
     */
    public void getContactPreferences(com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContactPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateContactPreferences update fields for all contact preferences for client
     * </pre>
     */
    public void updateContactPreferences(com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateContactPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all client compliance preferences
     * </pre>
     */
    public void getCompliancePreferences(com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCompliancePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates all client Compliance preferences
     * </pre>
     */
    public void updateCompliancePreferences(com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCompliancePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgentPreferences returns all client agent preferences
     * </pre>
     */
    public void getAgentPreferences(com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates client agent preferences
     * </pre>
     */
    public void updateAgentPreferences(com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns preferences for the organization tab
     * </pre>
     */
    public void getOrganizationPreferences(com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates preferences for the organization tab
     * </pre>
     */
    public void updateOrganizationPreferences(com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns all schedule preferences for an org.
     * </pre>
     */
    public void getSchedulePreferences(com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSchedulePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences returns all schedule preferences for an org.
     * </pre>
     */
    public void updateSchedulePreferences(com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSchedulePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns all business intelligence and associated analytic preferences
     * </pre>
     */
    public void getBusinessPreferences(com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBusinessPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates all business intelligence and associated analytic preferences
     * </pre>
     */
    public void updateBusinessPreferences(com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBusinessPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns a time (hour 1-24) for each day of the week.
     * </pre>
     */
    public void getEndOfDayPreferences(com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEndOfDayPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences update fields for a time (hour 1-24) for each day of the week.
     * </pre>
     */
    public void updateEndOfDayPreferences(com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEndOfDayPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for the organization tab
     * </pre>
     */
    public void getReportFilterPreferences(com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReportFilterPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for the filter tab
     * </pre>
     */
    public void updateReportFilterPreferences(com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReportFilterPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPhonePreferences returns all phone and recording preferences for an org.
     * </pre>
     */
    public void getPhonePreferences(com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPhonePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates phone and recording preferences for an org.
     * </pre>
     */
    public void updatePhonePreferences(com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePhonePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns all dashboard general preferences for an org.
     * </pre>
     */
    public void getDashboardGeneralPreferences(com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDashboardGeneralPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates dashboard General preferences for an org.
     * </pre>
     */
    public void updateDashboardGeneralPreferences(com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardGeneralPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns all webhook preferences for an org.
     * </pre>
     */
    public void getWebhookPreferences(com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWebhookPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates webhook preferences for an org.
     * </pre>
     */
    public void updateWebhookPreferences(com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWebhookPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns all broadcast options for campaign preferences for an org.
     * </pre>
     */
    public void getBroadcastPreferences(com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBroadcastPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates broadcast options for campaign preferences for an org.
     * </pre>
     */
    public void updateBroadcastPreferences(com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBroadcastPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns all authentication options for an org.
     * </pre>
     */
    public void getAuthenticationPreferences(com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthenticationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates authentication preferences for an org.
     * </pre>
     */
    public void updateAuthenticationPreferences(com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthenticationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns all recording options for an org.
     * </pre>
     */
    public void getRecordingPreferences(com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRecordingPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates Recording preferences for an org.
     * </pre>
     */
    public void updateRecordingPreferences(com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRecordingPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns the Dashboard Queue table preferences.
     * </pre>
     */
    public void getDashboardQueuePreferences(com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDashboardQueuePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates the Dashboard Queue table preferences.
     * </pre>
     */
    public void updateDashboardQueuePreferences(com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardQueuePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgentQuickViewPreferences returns the diplay templates for the client
     * </pre>
     */
    public void getAgentQuickViewPreferences(com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentQuickViewPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns the all preferences for voice analytics
     * </pre>
     */
    public void getVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVoiceAnalyticsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences updates the all preferences for voice analytics
     * </pre>
     */
    public void updateVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVoiceAnalyticsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns the all preferences for scorecards
     * </pre>
     */
    public void getScorecardsPreferences(com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScorecardsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetScorecardsPreferences updates the all preferences for scorecards
     * </pre>
     */
    public void updateScorecardsPreferences(com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScorecardsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns the all preferences for email and sms
     * </pre>
     */
    public void getEmailSmsPreferences(com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailSmsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences updates the all preferences for email and sms
     * </pre>
     */
    public void updateEmailSmsPreferences(com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmailSmsPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditAgentQuickViewPreferences return nil,error
     * </pre>
     */
    public void editAgentQuickViewPreferences(com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditAgentQuickViewPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditBackofficeThemePreference returns nil, error
     * changes the Client Skin client property
     * </pre>
     */
    public void editBackofficeThemePreference(com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditBackofficeThemePreferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBackofficeThemePreference(com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBackofficeThemePreferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AcceptLinkbackRecordingTerms controls acknowledgement for linkback recording terms and conditions
     * </pre>
     */
    public void acceptLinkbackRecordingTerms(com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcceptLinkbackRecordingTermsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template action parameters pertaining to linkback recording
     * </pre>
     */
    public void linkbackUpdateBroadcastTemplates(com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkbackUpdateBroadcastTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement inserts an activity log when the client acknowledges responsibility
     * for their own email unsubscribe links.
     * </pre>
     */
    public void recordEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement inserts an activity log when the client clears acknowledgement for
     * their own email unsubscribe links.
     * </pre>
     */
    public void clearEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new WebLinkTemplate as defined by request message CreateWebLinkTemplateRequest.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public void createWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWebLinkTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List every WebLinkTemplate.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public void listWebLinkTemplates(com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWebLinkTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get one WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public void getWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWebLinkTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public void updateWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWebLinkTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public void deleteWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWebLinkTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new AgentTriggerTemplate as defined by request message CreateAgentTriggerTemplateRequest.
     * The id field on the request message will be generated as part of
     * this method. If the id field is set it WILL be overwritten.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public void createAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentTriggerTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of every AgentTriggerTemplate for the given
     * hunt_group_sid on the request.
     * Requiree Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public void listAgentTriggerTemplates(com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentTriggerTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns one AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public void getAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentTriggerTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public void updateAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentTriggerTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public void deleteAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgentTriggerTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new ClientInfoDisplayTemplate as defined by request
     * message CreateClientInfoDisplayRequest.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public void createClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClientInfoDisplayTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of every ClientInfoDisplayTemplate.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public void listClientInfoDisplayTemplates(com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListClientInfoDisplayTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the ClientInfoDisplayTemplate as defined by request
     * message UpdateClientIntoDisplayTemplateRequest.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public void updateClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientInfoDisplayTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the ClientInfoDisplayTemplate with the id given on the request
     * message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public void deleteClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteClientInfoDisplayTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns one ClientInfoDisplayTemplate with the id given on the
     * request message.
     *  Required Permissions:
     *    ORG_VIEW
     * </pre>
     */
    public void getClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientInfoDisplayTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a slice of agent pause codes.
     * </pre>
     */
    public void listAgentPauseCodes(com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentPauseCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Agent Pause Code as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set, or the the pause_code.codes field is an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    public void createAgentPauseCode(com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentPauseCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an Agent Pause Code with the xml_client_property_sid given on
     * the pause_code in the request message as defined by the other fields
     * on the pause_code message.
     * Required Permissions:
     *    AGENT_MANAGEMENT
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set or the pause_code.codes field was an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    public void updateAgentPauseCode(com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentPauseCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an Agent Pause Code with the sid given on the request message.
     * Errors:
     *    - grpc.InvalidArgument: The xml_client_property_sid field is invalid.
     * </pre>
     */
    public void deleteAgentPauseCode(com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgentPauseCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a slice of custom report filters belonging to client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public void listCustomReportFilters(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCustomReportFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new custom report filter as defined by the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The custom report filter has an empty name or no filtering parameters.
     *    - grpc.Internal: An error occurred marshalling the custom report filter into an xml string.
     * </pre>
     */
    public void createCustomReportFilter(com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCustomReportFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a custom report filter with the requested xml_client_property_sid
     * with the report filter in the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set or the pause_code.codes field was an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    public void updateCustomReportFilter(com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCustomReportFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a custom report filter with the sid given on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The xml_client_property_sid field is invalid.
     * </pre>
     */
    public void deleteCustomReportFilter(com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCustomReportFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a slice of hunt group scripts belonging to the client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public void listAgentResponseGroups(com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentResponseGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a slice of last template element scripts belonging to the client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public void listLastTemplateElements(com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLastTemplateElementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the names of the custom queue configs.
     * Required Permissions:
     *    ORG_VIEW (If &#64;org_id is empty)
     *    CUSTOMER_SUPPORT (If &#64;org_id is NOT empty)
     * Errors:
     *   - grpc.Internal: An error occurred while getting the config names.
     *   - grpc.NotFound: The given &#64;org_id was not found (if &#64;org_id is NOT empty).
     * </pre>
     */
    public void listQueueConfigs(com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListQueueConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a queue config with the given &#64;client_sid and &#64;config_name.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while removing the config.
     *    - grpc.InvalidArgument: the config_name was invalid.
     * </pre>
     */
    public void deleteQueueConfig(com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteQueueConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the details for the queue config for the given &#64;client_sid with
     * the given &#64;name. If &#64;merge is true, the config data will be merged
     * with the default config data.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *   - grpc.Internal: An unexpected error occurred getting the config data.
     *   - grpc.InvalidArgument: the given config name was invalid.
     * </pre>
     */
    public void getQueueConfig(com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueueConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a queue config as defined by the &#64;config given
     * on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while saving the config.
     *    - grpc.InvalidArgument: the given config was invalid.
     * </pre>
     */
    public void createQueueConfig(com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateQueueConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a new queue config as defined by the &#64;config given
     * on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The name of the given config could not be found.
     *    - grpc.Internal: An unexpected error occurred while saving the config.
     *    - grpc.InvalidArgument: the given config was invalid.
     * </pre>
     */
    public void updateQueueConfig(com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateQueueConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Copies a queue config belonging to one organization to another.
     * The queue config with the &#64;from_name will be copied from the
     * organization with the &#64;from_org_id to the organization with the
     * &#64;to_org_id under the new &#64;to_name.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while copying the config.
     *    - grpc.InvalidArgument: A field on the request message was invalid.
     *    - grpc.NotFound: The &#64;to_org_id, &#64;from_org_id, or &#64;from_name was not found.
     *    - grpc.AlreadyExists: The &#64;to_name already exists for the &#64;to_org_id.
     * </pre>
     */
    public void copyQueueConfig(com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyQueueConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the url of a downloadable zip file containing every
     * sound for the given queue config.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while zipping the files.
     *    - grpc.NotFound: The given queue config was not found.
     * </pre>
     */
    public void getAllQueueConfigSounds(com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllQueueConfigSoundsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the url of a downladable wav file for the given config's
     * sound matching the given sound enum. Leaving the config field empty
     * will look up the sound for the account default config.
     * Required Permissions:
     *  ORG_VIEW
     * Errors:
     *  - grpc.Internal: An unexpected error occurrec while getting the
     *    downloadable file url.
     *  - grpc.NotFound: The given queue config was not found or the sound
     *    was not found for the config.
     * </pre>
     */
    public void getQueueConfigSound(com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueueConfigSoundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the given sound for the config to one of the uploaded
     * sound files in the clients upload folder matching the
     * given file_name on the request. Leaving the config field empty
     * will set the sound for the account default config.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while updating
     *      the configs sound.
     *    - gprc.NotFound: The given queue config was not found or the
     *      sound file was not found for the client.
     *    - grpc.InvalidArgument: The file_name on the request was invalid.
     * </pre>
     */
    public void setQueueConfigSound(com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetQueueConfigSoundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets every sound for a given config by copying them from
     * another config OR by copying them from a default sound set
     * identified by language and gender. Empty config names will be
     * treated as the account default config.
     * Required Permissions:
     *    ORG_EDIT
     * Errors
     *    - grpc.Internal: An unexpected error occurred while updating
     *      all sounds for the given to_config.
     *    - grpc.NotFound: The given to_config or from.config (if used)
     *      could not be found or the default sound set for the given
     *      gender/language identifier could not be found.
     *    - grpc.InvalidArgument: The to_config and from.config contained
     *      the same value. (If from.config was used)
     * </pre>
     */
    public void setAllQueueConfigSoundsFromSource(com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAllQueueConfigSoundsFromSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks a user's blocked status.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while getting the user.
     *    - grpc.InvalidArgument: The user_id on the request was invalid.
     * </pre>
     */
    public void getUserBlocked(com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserBlockedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unblocks the given user.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while unblocking the user.
     *    - grpc.InvalidArgument: The user_id on the request was invalid.
     * </pre>
     */
    public void unblockUser(com.tcn.cloud.api.api.v0alpha.UnblockUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnblockUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnblockUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all users who only exist in skunk and have not yet been migrated
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public void listP3UnMigratedUsers(com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListP3UnMigratedUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Migrates a login or agent from backoffice to firestore
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public void migrateP3User(com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateP3UserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the username in skunk only for a agent or login
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public void updateP3UserName(com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateP3UserNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all users under the p3 hierarchy
     * Required Permissions:
     *  OWNING_ORG_IMITATION
     * </pre>
     */
    public void listOwnedUsers(com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOwnedUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all orgs under the p3 hierarchy
     * Required Permissions:
     * PERMISSION_ORG_VIEW
     * </pre>
     */
    public void listOwnedOrgs(com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOwnedOrgsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removed login strike from list of given login_log_sids
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public void removeLoginStrikes(com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveLoginStrikesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removed login strikes by user_id
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public void removeUserLoginStrikes(com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserLoginStrikesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists user login history by ip or user_id
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public void listLoginHistory(com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLoginHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a users agentsid and loginsid
     * Required Permissions:
     *  TCN_ADMIN_SETTINGS
     * </pre>
     */
    public void updateP3UserSids(com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateP3UserSidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    public void createAuthConnection(com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuthConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth0 connection settings.
     * </pre>
     */
    public void getAuthConnectionSettings(com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthConnectionSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSettings updates an existing auth0 connection settings.
     * </pre>
     */
    public void updateAuthConnectionSettings(com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthConnectionSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    public void deleteAuthConnection(com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAuthConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription by id
     * Required Permissions:
     *    ORG_VIEW if user id IS provided
     *    none if user id NOT provided
     * </pre>
     */
    public void getUserSubscription(com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a user subscription to users list of subscriptions
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    public void addUserSubscription(com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a user subscription from a users list of subscription
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    public void removeUserSubscription(com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    public void updateUserSubscription(com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all of a users subscriptions
     * Required Permissions:
     *    ORG_VIEW if user id IS provided
     *    none if user id NOT provided
     * </pre>
     */
    public void listUserSubscriptions(com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists multiple users subscriptions by org. Optionally filters by event type.
     * Required Permissions:
     *    ORG_VIEW
     * </pre>
     */
    public void listOrgSubscriptions(com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrgSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the systems current environment details
     * Required Permissions:
     *    N/A
     * </pre>
     */
    public void getSystemEnvironmentDetails(com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSystemEnvironmentDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of agent statistics templates belonging to client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public void listAgentStatisticsTemplates(com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentStatisticsTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid is not found.
     * </pre>
     */
    public void createAgentStatisticsTemplate(com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentStatisticsTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid is not found.
     * </pre>
     */
    public void updateAgentStatisticsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentStatisticsTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid or agent statistics template is not found.
     * </pre>
     */
    public void deleteAgentStatisticsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgentStatisticsTemplateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Org.
   */
  public static final class OrgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrgBlockingStub> {
    private OrgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse registerOrganization(com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Converts a standard organiztion to a manual one.
     * WARNING: this process cannot be reversed.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse convertOrgToManual(com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertOrgToManualMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse updateOrganization(com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse archiveOrganization(com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArchiveOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Restores an archived organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse unArchiveOrganization(com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnArchiveOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of organizations that have been archived.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse listArchivedOrganizations(com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListArchivedOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse getOrganizationProfile(com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse getOrganizationProfileById(com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationProfileByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse listOrganizationDescriptions(com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationDescriptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse listRegionalOrganizations(com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRegionalOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update an organizations owning organization.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse updateP3OwningOrg(com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateP3OwningOrgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets the owning organiztion for the given org
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse getP3OwningOrg(com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetP3OwningOrgMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse listOrganizationUserDescriptions(com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationUserDescriptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse> listUserDescriptions(
        com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListUserDescriptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse getUserDirectory(com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserDirectoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetRegions takes nothing in the request and returns a list of all region names
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetRegionsResponse getRegions(com.tcn.cloud.api.api.v0alpha.GetRegionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UserDetails getUserDetails(com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UserDetails adminGetUserDetails(com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdminGetUserDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse getAgentUsers(com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * This is transitionary api. It will be removed when user api is available.
     * GetAgentSettings gets some agent settings as defined by the GetAgentSettingsRequest.
     * Required Permissions:
     * AGENT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse getAgentSettings(com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgentProfileGroup gets a single AgentProfileGroup by given ID
     * Required Permissions:
     * ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse getAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse updateAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse createAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgentProfileGroups lists all AgentProfileGroups for a given org
     * Required Permissions:
     * ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse listAgentProfileGroups(com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentProfileGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes a single AgentProfileGroup by given ID. Can only delete if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse deleteAgentProfileGroup(com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups bulk assigns a list of users to a given AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse assignAgentProfileGroups(com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignAgentProfileGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUser updates a user as defined by the UpdateUserRequest.
     * Required Permissions:
     * USER_EDIT if the user_id is given on the request.
     * NONE (TODO: create &amp; use new perm) if the user_id is NOT given.
     *  This will only the currently logged in user.
     *  Only some of the fields on the request message can be updated
     *  for the currently logged in user: time_zone, linkback_numbers,
     *  caller_ids, and default_app.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateUserResponse updateUser(com.tcn.cloud.api.api.v0alpha.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateUser creates a new user as defined by the CreateUserRequest
     * request message.
     * Required Permissions:
     * USER_CREATE, CUSTOMER_SUPPORT if adding to an org other than your own
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateUserResponse createUser(com.tcn.cloud.api.api.v0alpha.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a delegated user. This should only be called by an auth0 action.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse createDelegatedUser(com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDelegatedUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserPassword updates a users password to the
     * password given on the request message.
     * Required Permissions:
     * USER_EDIT if user_id was given on the request (Update another user's password)
     * USER_EDIT_PASSWORD if user_id is retrieved from token (Update your own password)
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse updateUserPassword(com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * updates the users PasswordResetRequired field to false.
     * this should only be called by an auth0 action.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse resetUserRequirePasswordReset(com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetUserRequirePasswordResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate a password reset link for a user.
     * Required Permissions:
     *  USER_EDIT_PASSWORD if user_id not given on request.
     *  USER_EDIT if user_id given on the request.
     *  CUSTOMER_SUPPORT if user_id &amp; org_id given on request. User_id must be given if org_id is.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse getUserPasswordResetLink(com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserPasswordResetLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns whether or not the given user's email is verified.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse getUserEmailVerified(com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserEmailVerifiedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends a verfication email to the given users email.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse sendUserVerificationEmail(com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendUserVerificationEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the given user's to verified without needing to send a verification email.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse manualUserEmailVerification(com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getManualUserEmailVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticates impersonation and generates token to be used.
     * Required Permissions:
     * CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes getTempUserToken(com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTempUserTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse getCountriesList(com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCountriesListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse getAdminClientPreferences(com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdminClientPreferencesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse updateAdminClientPreferences(com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAdminClientPreferencesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse getPermissions(com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeAccountOwnerPermissionFromUser revokes the
     * account owner permission for the given user
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse revokeAccountOwnerPermissionFromUser(com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeAccountOwnerPermissionFromUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates a specified user to disabled or enabled. A disabled user cannot log in.
     * Required Permissions:
     *    - USER_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse updateUserDisabled(com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserDisabledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBulkUsersDisabled updates every given user_id to be disabled or enabled. The returned list of updated_ids contains every id that was successfully updated.
     * Required Permissions:
     *		- USER_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse updateBulkUsersDisabled(com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBulkUsersDisabledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the billing data for the given org. Billing data
     * will only be included for countries present on the org's
     * allowed countries preference.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: The org_id on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while getting the orgs billing settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse getOrgBillingSettings(com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrgBillingSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the given orgs billing settings as defined by the info
     * given on the request message. Only fields that are given on the
     * field mask will be updated.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: A field on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while updating the orgs billing settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse setOrgBillingSettings(com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetOrgBillingSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a single billing region override for the given orgs billing settings.
     * If an override already exists for the given region it will be updated.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: A field on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while adding the override.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse addOrgBillingOverride(com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOrgBillingOverrideMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a single billing region override for the given orgs billing settings.
     * If the region override doesn't exist the rpcs will just do nothing.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: The given org_id was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while removing the override.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse removeOrgBillingOverride(com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveOrgBillingOverrideMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the system default billing rates.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse getSystemDefaultBillingRates(com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSystemDefaultBillingRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListPermissionGroups returns the list of an org's permission groups.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse listPermissionGroups(com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPermissionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreatePermissionGroup creates a new permission group for the caller's organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse createPermissionGroup(com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdatePermissionGroup updates a permission group by id for the caller's organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse updatePermissionGroup(com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeletePermissionGroup deletes a permission group by id for the caller's organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse deletePermissionGroup(com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assigns a user to a acount owner permission group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse assignUserToAccountOwnerPermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignUserToAccountOwnerPermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assigns a permission group to another user.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse assignUserPermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignUserPermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assigns a permission group to multiple users.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse assignUsersPermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignUsersPermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assigns permission group(s) to another user.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse updateUserNeoPermissionGroups(com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserNeoPermissionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revokes a permission group from another user.
     * Requires that all three of permission group, calling user, and user being revoked to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse revokeUserPermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeUserPermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revokes a permission group to multiple users.
     * Requires that all three of permission group, calling user, and user being revoked to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse revokeUsersPermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeUsersPermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InitDefaultPermissionGroups initializes the default read only permission groups for the callers organization.
     * Idempotent call. Returns the default permission groups for the organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse initDefaultPermissionGroups(com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitDefaultPermissionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's Account Owner Group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse addPermissionToAccountOwnerPermissionGroup(com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPermissionToAccountOwnerPermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's Account Owner Group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse revokePermissionToAccountOwnerPermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokePermissionToAccountOwnerPermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse addPermissionToOrgDefaultGroup(com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPermissionToOrgDefaultGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a single permission from an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse removePermissionFromOrgDefaultGroup(com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePermissionFromOrgDefaultGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse getOrgDefaultSuperUserGroup(com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrgDefaultSuperUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListP3PermissionGroups returns the list of an org's P3 permission groups.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse listP3PermissionGroups(com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListP3PermissionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddUserRegion to a Users Accessible Regions
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse addUserRegion(com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveUserRegion from a Users Accessible Regions
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse removeUserRegion(com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates new p3 permission group
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse createP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateP3PermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update p3 permission group
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse updateP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateP3PermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete new p3 permission group
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse deleteP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteP3PermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign one or many users a p3 permission group
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse assignUsersP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignUsersP3PermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddLoginToUser Creates new login for a given user
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse addLoginToUser(com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLoginToUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revoke a p3 permission group to another user(s).
     * Requires that permission group and user(s) being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse revokeUsersP3PermissionGroup(com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeUsersP3PermissionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetContactPreferences returns all contact preferences for client TODO: will replace ContactList above
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse getContactPreferences(com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContactPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateContactPreferences update fields for all contact preferences for client
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse updateContactPreferences(com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateContactPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all client compliance preferences
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse getCompliancePreferences(com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCompliancePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates all client Compliance preferences
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse updateCompliancePreferences(com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCompliancePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgentPreferences returns all client agent preferences
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse getAgentPreferences(com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates client agent preferences
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse updateAgentPreferences(com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns preferences for the organization tab
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse getOrganizationPreferences(com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates preferences for the organization tab
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse updateOrganizationPreferences(com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns all schedule preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse getSchedulePreferences(com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSchedulePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences returns all schedule preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse updateSchedulePreferences(com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSchedulePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns all business intelligence and associated analytic preferences
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse getBusinessPreferences(com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBusinessPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates all business intelligence and associated analytic preferences
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse updateBusinessPreferences(com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBusinessPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns a time (hour 1-24) for each day of the week.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse getEndOfDayPreferences(com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEndOfDayPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences update fields for a time (hour 1-24) for each day of the week.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse updateEndOfDayPreferences(com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEndOfDayPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for the organization tab
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse getReportFilterPreferences(com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReportFilterPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for the filter tab
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse updateReportFilterPreferences(com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReportFilterPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPhonePreferences returns all phone and recording preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse getPhonePreferences(com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPhonePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates phone and recording preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse updatePhonePreferences(com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePhonePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns all dashboard general preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse getDashboardGeneralPreferences(com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDashboardGeneralPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates dashboard General preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse updateDashboardGeneralPreferences(com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDashboardGeneralPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns all webhook preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse getWebhookPreferences(com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWebhookPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates webhook preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse updateWebhookPreferences(com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWebhookPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns all broadcast options for campaign preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse getBroadcastPreferences(com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBroadcastPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates broadcast options for campaign preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse updateBroadcastPreferences(com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBroadcastPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns all authentication options for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse getAuthenticationPreferences(com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthenticationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates authentication preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse updateAuthenticationPreferences(com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthenticationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns all recording options for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse getRecordingPreferences(com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRecordingPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates Recording preferences for an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse updateRecordingPreferences(com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRecordingPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns the Dashboard Queue table preferences.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse getDashboardQueuePreferences(com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDashboardQueuePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates the Dashboard Queue table preferences.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse updateDashboardQueuePreferences(com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDashboardQueuePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgentQuickViewPreferences returns the diplay templates for the client
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse getAgentQuickViewPreferences(com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentQuickViewPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns the all preferences for voice analytics
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse getVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVoiceAnalyticsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences updates the all preferences for voice analytics
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse updateVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVoiceAnalyticsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns the all preferences for scorecards
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse getScorecardsPreferences(com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScorecardsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetScorecardsPreferences updates the all preferences for scorecards
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse updateScorecardsPreferences(com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScorecardsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns the all preferences for email and sms
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse getEmailSmsPreferences(com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailSmsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences updates the all preferences for email and sms
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse updateEmailSmsPreferences(com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmailSmsPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditAgentQuickViewPreferences return nil,error
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse editAgentQuickViewPreferences(com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditAgentQuickViewPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditBackofficeThemePreference returns nil, error
     * changes the Client Skin client property
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse editBackofficeThemePreference(com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditBackofficeThemePreferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse getBackofficeThemePreference(com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBackofficeThemePreferenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AcceptLinkbackRecordingTerms controls acknowledgement for linkback recording terms and conditions
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse acceptLinkbackRecordingTerms(com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptLinkbackRecordingTermsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template action parameters pertaining to linkback recording
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse linkbackUpdateBroadcastTemplates(com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkbackUpdateBroadcastTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement inserts an activity log when the client acknowledges responsibility
     * for their own email unsubscribe links.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse recordEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordEmailUnsubscribeAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement inserts an activity log when the client clears acknowledgement for
     * their own email unsubscribe links.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse clearEmailUnsubscribeAcknowledgement(com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearEmailUnsubscribeAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new WebLinkTemplate as defined by request message CreateWebLinkTemplateRequest.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse createWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWebLinkTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List every WebLinkTemplate.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse listWebLinkTemplates(com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWebLinkTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get one WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse getWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWebLinkTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse updateWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWebLinkTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse deleteWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWebLinkTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new AgentTriggerTemplate as defined by request message CreateAgentTriggerTemplateRequest.
     * The id field on the request message will be generated as part of
     * this method. If the id field is set it WILL be overwritten.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse createAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentTriggerTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of every AgentTriggerTemplate for the given
     * hunt_group_sid on the request.
     * Requiree Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse listAgentTriggerTemplates(com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentTriggerTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns one AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse getAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentTriggerTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse updateAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentTriggerTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse deleteAgentTriggerTemplate(com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgentTriggerTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new ClientInfoDisplayTemplate as defined by request
     * message CreateClientInfoDisplayRequest.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse createClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClientInfoDisplayTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of every ClientInfoDisplayTemplate.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse listClientInfoDisplayTemplates(com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListClientInfoDisplayTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the ClientInfoDisplayTemplate as defined by request
     * message UpdateClientIntoDisplayTemplateRequest.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse updateClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientInfoDisplayTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the ClientInfoDisplayTemplate with the id given on the request
     * message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse deleteClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteClientInfoDisplayTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns one ClientInfoDisplayTemplate with the id given on the
     * request message.
     *  Required Permissions:
     *    ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse getClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientInfoDisplayTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a slice of agent pause codes.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse listAgentPauseCodes(com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentPauseCodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new Agent Pause Code as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set, or the the pause_code.codes field is an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse createAgentPauseCode(com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentPauseCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an Agent Pause Code with the xml_client_property_sid given on
     * the pause_code in the request message as defined by the other fields
     * on the pause_code message.
     * Required Permissions:
     *    AGENT_MANAGEMENT
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set or the pause_code.codes field was an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse updateAgentPauseCode(com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentPauseCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an Agent Pause Code with the sid given on the request message.
     * Errors:
     *    - grpc.InvalidArgument: The xml_client_property_sid field is invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse deleteAgentPauseCode(com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgentPauseCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a slice of custom report filters belonging to client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse listCustomReportFilters(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCustomReportFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new custom report filter as defined by the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The custom report filter has an empty name or no filtering parameters.
     *    - grpc.Internal: An error occurred marshalling the custom report filter into an xml string.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse createCustomReportFilter(com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCustomReportFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a custom report filter with the requested xml_client_property_sid
     * with the report filter in the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set or the pause_code.codes field was an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse updateCustomReportFilter(com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCustomReportFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a custom report filter with the sid given on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The xml_client_property_sid field is invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse deleteCustomReportFilter(com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCustomReportFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a slice of hunt group scripts belonging to the client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse listAgentResponseGroups(com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentResponseGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a slice of last template element scripts belonging to the client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse listLastTemplateElements(com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLastTemplateElementsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the names of the custom queue configs.
     * Required Permissions:
     *    ORG_VIEW (If &#64;org_id is empty)
     *    CUSTOMER_SUPPORT (If &#64;org_id is NOT empty)
     * Errors:
     *   - grpc.Internal: An error occurred while getting the config names.
     *   - grpc.NotFound: The given &#64;org_id was not found (if &#64;org_id is NOT empty).
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes listQueueConfigs(com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListQueueConfigsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a queue config with the given &#64;client_sid and &#64;config_name.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while removing the config.
     *    - grpc.InvalidArgument: the config_name was invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes deleteQueueConfig(com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteQueueConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the details for the queue config for the given &#64;client_sid with
     * the given &#64;name. If &#64;merge is true, the config data will be merged
     * with the default config data.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *   - grpc.Internal: An unexpected error occurred getting the config data.
     *   - grpc.InvalidArgument: the given config name was invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes getQueueConfig(com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueueConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a queue config as defined by the &#64;config given
     * on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while saving the config.
     *    - grpc.InvalidArgument: the given config was invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes createQueueConfig(com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateQueueConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a new queue config as defined by the &#64;config given
     * on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The name of the given config could not be found.
     *    - grpc.Internal: An unexpected error occurred while saving the config.
     *    - grpc.InvalidArgument: the given config was invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes updateQueueConfig(com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateQueueConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Copies a queue config belonging to one organization to another.
     * The queue config with the &#64;from_name will be copied from the
     * organization with the &#64;from_org_id to the organization with the
     * &#64;to_org_id under the new &#64;to_name.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while copying the config.
     *    - grpc.InvalidArgument: A field on the request message was invalid.
     *    - grpc.NotFound: The &#64;to_org_id, &#64;from_org_id, or &#64;from_name was not found.
     *    - grpc.AlreadyExists: The &#64;to_name already exists for the &#64;to_org_id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes copyQueueConfig(com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyQueueConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the url of a downloadable zip file containing every
     * sound for the given queue config.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while zipping the files.
     *    - grpc.NotFound: The given queue config was not found.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes getAllQueueConfigSounds(com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllQueueConfigSoundsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the url of a downladable wav file for the given config's
     * sound matching the given sound enum. Leaving the config field empty
     * will look up the sound for the account default config.
     * Required Permissions:
     *  ORG_VIEW
     * Errors:
     *  - grpc.Internal: An unexpected error occurrec while getting the
     *    downloadable file url.
     *  - grpc.NotFound: The given queue config was not found or the sound
     *    was not found for the config.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes getQueueConfigSound(com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueueConfigSoundMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the given sound for the config to one of the uploaded
     * sound files in the clients upload folder matching the
     * given file_name on the request. Leaving the config field empty
     * will set the sound for the account default config.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while updating
     *      the configs sound.
     *    - gprc.NotFound: The given queue config was not found or the
     *      sound file was not found for the client.
     *    - grpc.InvalidArgument: The file_name on the request was invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes setQueueConfigSound(com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetQueueConfigSoundMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets every sound for a given config by copying them from
     * another config OR by copying them from a default sound set
     * identified by language and gender. Empty config names will be
     * treated as the account default config.
     * Required Permissions:
     *    ORG_EDIT
     * Errors
     *    - grpc.Internal: An unexpected error occurred while updating
     *      all sounds for the given to_config.
     *    - grpc.NotFound: The given to_config or from.config (if used)
     *      could not be found or the default sound set for the given
     *      gender/language identifier could not be found.
     *    - grpc.InvalidArgument: The to_config and from.config contained
     *      the same value. (If from.config was used)
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes setAllQueueConfigSoundsFromSource(com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAllQueueConfigSoundsFromSourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks a user's blocked status.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while getting the user.
     *    - grpc.InvalidArgument: The user_id on the request was invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse getUserBlocked(com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserBlockedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unblocks the given user.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while unblocking the user.
     *    - grpc.InvalidArgument: The user_id on the request was invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UnblockUserResponse unblockUser(com.tcn.cloud.api.api.v0alpha.UnblockUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnblockUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all users who only exist in skunk and have not yet been migrated
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse listP3UnMigratedUsers(com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListP3UnMigratedUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Migrates a login or agent from backoffice to firestore
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse migrateP3User(com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateP3UserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the username in skunk only for a agent or login
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse updateP3UserName(com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateP3UserNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all users under the p3 hierarchy
     * Required Permissions:
     *  OWNING_ORG_IMITATION
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse listOwnedUsers(com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOwnedUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all orgs under the p3 hierarchy
     * Required Permissions:
     * PERMISSION_ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse listOwnedOrgs(com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOwnedOrgsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removed login strike from list of given login_log_sids
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse removeLoginStrikes(com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveLoginStrikesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removed login strikes by user_id
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse removeUserLoginStrikes(com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserLoginStrikesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists user login history by ip or user_id
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse listLoginHistory(com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLoginHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a users agentsid and loginsid
     * Required Permissions:
     *  TCN_ADMIN_SETTINGS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse updateP3UserSids(com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateP3UserSidsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse createAuthConnection(com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuthConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth0 connection settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse getAuthConnectionSettings(com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthConnectionSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSettings updates an existing auth0 connection settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse updateAuthConnectionSettings(com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthConnectionSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse deleteAuthConnection(com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAuthConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a user subscription by id
     * Required Permissions:
     *    ORG_VIEW if user id IS provided
     *    none if user id NOT provided
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse getUserSubscription(com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a user subscription to users list of subscriptions
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse addUserSubscription(com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a user subscription from a users list of subscription
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse removeUserSubscription(com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a user subscription
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse updateUserSubscription(com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all of a users subscriptions
     * Required Permissions:
     *    ORG_VIEW if user id IS provided
     *    none if user id NOT provided
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse listUserSubscriptions(com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists multiple users subscriptions by org. Optionally filters by event type.
     * Required Permissions:
     *    ORG_VIEW
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse listOrgSubscriptions(com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrgSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the systems current environment details
     * Required Permissions:
     *    N/A
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse getSystemEnvironmentDetails(com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSystemEnvironmentDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of agent statistics templates belonging to client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse listAgentStatisticsTemplates(com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentStatisticsTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid is not found.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse createAgentStatisticsTemplate(com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentStatisticsTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid is not found.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse updateAgentStatisticsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentStatisticsTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an existing agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid or agent statistics template is not found.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse deleteAgentStatisticsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgentStatisticsTemplateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Org.
   */
  public static final class OrgFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrgFutureStub> {
    private OrgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse> registerOrganization(
        com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Converts a standard organiztion to a manual one.
     * WARNING: this process cannot be reversed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse> convertOrgToManual(
        com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertOrgToManualMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse> updateOrganization(
        com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Archives an organization. An archived organization effectively disappears, but isn't deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse> archiveOrganization(
        com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArchiveOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Restores an archived organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse> unArchiveOrganization(
        com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnArchiveOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of organizations that have been archived.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse> listArchivedOrganizations(
        com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListArchivedOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> getOrganizationProfile(
        com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse> getOrganizationProfileById(
        com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationProfileByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse> listOrganizationDescriptions(
        com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationDescriptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse> listRegionalOrganizations(
        com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRegionalOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update an organizations owning organization.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse> updateP3OwningOrg(
        com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateP3OwningOrgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets the owning organiztion for the given org
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse> getP3OwningOrg(
        com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetP3OwningOrgMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse> listOrganizationUserDescriptions(
        com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationUserDescriptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse> getUserDirectory(
        com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserDirectoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetRegions takes nothing in the request and returns a list of all region names
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetRegionsResponse> getRegions(
        com.tcn.cloud.api.api.v0alpha.GetRegionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UserDetails> getUserDetails(
        com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UserDetails> adminGetUserDetails(
        com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdminGetUserDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse> getAgentUsers(
        com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * This is transitionary api. It will be removed when user api is available.
     * GetAgentSettings gets some agent settings as defined by the GetAgentSettingsRequest.
     * Required Permissions:
     * AGENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse> getAgentSettings(
        com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgentProfileGroup gets a single AgentProfileGroup by given ID
     * Required Permissions:
     * ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse> getAgentProfileGroup(
        com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse> updateAgentProfileGroup(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse> createAgentProfileGroup(
        com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAgentProfileGroups lists all AgentProfileGroups for a given org
     * Required Permissions:
     * ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse> listAgentProfileGroups(
        com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentProfileGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes a single AgentProfileGroup by given ID. Can only delete if user is in same org as AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse> deleteAgentProfileGroup(
        com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups bulk assigns a list of users to a given AgentProfileGroup
     * Required Permissions:
     * ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse> assignAgentProfileGroups(
        com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignAgentProfileGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUser updates a user as defined by the UpdateUserRequest.
     * Required Permissions:
     * USER_EDIT if the user_id is given on the request.
     * NONE (TODO: create &amp; use new perm) if the user_id is NOT given.
     *  This will only the currently logged in user.
     *  Only some of the fields on the request message can be updated
     *  for the currently logged in user: time_zone, linkback_numbers,
     *  caller_ids, and default_app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateUserResponse> updateUser(
        com.tcn.cloud.api.api.v0alpha.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateUser creates a new user as defined by the CreateUserRequest
     * request message.
     * Required Permissions:
     * USER_CREATE, CUSTOMER_SUPPORT if adding to an org other than your own
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateUserResponse> createUser(
        com.tcn.cloud.api.api.v0alpha.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a delegated user. This should only be called by an auth0 action.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse> createDelegatedUser(
        com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDelegatedUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserPassword updates a users password to the
     * password given on the request message.
     * Required Permissions:
     * USER_EDIT if user_id was given on the request (Update another user's password)
     * USER_EDIT_PASSWORD if user_id is retrieved from token (Update your own password)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse> updateUserPassword(
        com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * updates the users PasswordResetRequired field to false.
     * this should only be called by an auth0 action.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse> resetUserRequirePasswordReset(
        com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetUserRequirePasswordResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate a password reset link for a user.
     * Required Permissions:
     *  USER_EDIT_PASSWORD if user_id not given on request.
     *  USER_EDIT if user_id given on the request.
     *  CUSTOMER_SUPPORT if user_id &amp; org_id given on request. User_id must be given if org_id is.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse> getUserPasswordResetLink(
        com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns whether or not the given user's email is verified.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse> getUserEmailVerified(
        com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends a verfication email to the given users email.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse> sendUserVerificationEmail(
        com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendUserVerificationEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the given user's to verified without needing to send a verification email.
     * Required Permissions:
     *  USER_EDIT if org_id not given on request.
     *  CUSTOMER_SUPPORT if org_id given on request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse> manualUserEmailVerification(
        com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getManualUserEmailVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticates impersonation and generates token to be used.
     * Required Permissions:
     * CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes> getTempUserToken(
        com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTempUserTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse> getCountriesList(
        com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCountriesListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse> getAdminClientPreferences(
        com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdminClientPreferencesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse> updateAdminClientPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAdminClientPreferencesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse> getPermissions(
        com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeAccountOwnerPermissionFromUser revokes the
     * account owner permission for the given user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse> revokeAccountOwnerPermissionFromUser(
        com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeAccountOwnerPermissionFromUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates a specified user to disabled or enabled. A disabled user cannot log in.
     * Required Permissions:
     *    - USER_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse> updateUserDisabled(
        com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserDisabledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBulkUsersDisabled updates every given user_id to be disabled or enabled. The returned list of updated_ids contains every id that was successfully updated.
     * Required Permissions:
     *		- USER_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse> updateBulkUsersDisabled(
        com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBulkUsersDisabledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the billing data for the given org. Billing data
     * will only be included for countries present on the org's
     * allowed countries preference.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: The org_id on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while getting the orgs billing settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse> getOrgBillingSettings(
        com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrgBillingSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the given orgs billing settings as defined by the info
     * given on the request message. Only fields that are given on the
     * field mask will be updated.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: A field on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while updating the orgs billing settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse> setOrgBillingSettings(
        com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetOrgBillingSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a single billing region override for the given orgs billing settings.
     * If an override already exists for the given region it will be updated.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: A field on the request was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while adding the override.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse> addOrgBillingOverride(
        com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOrgBillingOverrideMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a single billing region override for the given orgs billing settings.
     * If the region override doesn't exist the rpcs will just do nothing.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.InvalidArgument: The given org_id was invalid.
     *    - grpc.NotFound: The given org_id did not exist.
     *    - grpc.Internal: An unexpected error occurred while removing the override.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse> removeOrgBillingOverride(
        com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveOrgBillingOverrideMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the system default billing rates.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse> getSystemDefaultBillingRates(
        com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSystemDefaultBillingRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListPermissionGroups returns the list of an org's permission groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse> listPermissionGroups(
        com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPermissionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreatePermissionGroup creates a new permission group for the caller's organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse> createPermissionGroup(
        com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdatePermissionGroup updates a permission group by id for the caller's organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse> updatePermissionGroup(
        com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeletePermissionGroup deletes a permission group by id for the caller's organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse> deletePermissionGroup(
        com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assigns a user to a acount owner permission group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse> assignUserToAccountOwnerPermissionGroup(
        com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignUserToAccountOwnerPermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assigns a permission group to another user.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse> assignUserPermissionGroup(
        com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignUserPermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assigns a permission group to multiple users.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse> assignUsersPermissionGroup(
        com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignUsersPermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assigns permission group(s) to another user.
     * Requires that all three of permission group, calling user, and user being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse> updateUserNeoPermissionGroups(
        com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserNeoPermissionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revokes a permission group from another user.
     * Requires that all three of permission group, calling user, and user being revoked to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse> revokeUserPermissionGroup(
        com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeUserPermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revokes a permission group to multiple users.
     * Requires that all three of permission group, calling user, and user being revoked to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse> revokeUsersPermissionGroup(
        com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeUsersPermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InitDefaultPermissionGroups initializes the default read only permission groups for the callers organization.
     * Idempotent call. Returns the default permission groups for the organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse> initDefaultPermissionGroups(
        com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitDefaultPermissionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's Account Owner Group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse> addPermissionToAccountOwnerPermissionGroup(
        com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPermissionToAccountOwnerPermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's Account Owner Group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse> revokePermissionToAccountOwnerPermissionGroup(
        com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokePermissionToAccountOwnerPermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a single permission to an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse> addPermissionToOrgDefaultGroup(
        com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPermissionToOrgDefaultGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a single permission from an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse> removePermissionFromOrgDefaultGroup(
        com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePermissionFromOrgDefaultGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns an organization's default Super User Group.
     * Required Permissions:
     *    - TCN_ADMIN_SETTINGS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse> getOrgDefaultSuperUserGroup(
        com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrgDefaultSuperUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListP3PermissionGroups returns the list of an org's P3 permission groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse> listP3PermissionGroups(
        com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListP3PermissionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddUserRegion to a Users Accessible Regions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse> addUserRegion(
        com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserRegionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveUserRegion from a Users Accessible Regions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse> removeUserRegion(
        com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserRegionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates new p3 permission group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse> createP3PermissionGroup(
        com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateP3PermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update p3 permission group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse> updateP3PermissionGroup(
        com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateP3PermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete new p3 permission group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse> deleteP3PermissionGroup(
        com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteP3PermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign one or many users a p3 permission group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse> assignUsersP3PermissionGroup(
        com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignUsersP3PermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddLoginToUser Creates new login for a given user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse> addLoginToUser(
        com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLoginToUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revoke a p3 permission group to another user(s).
     * Requires that permission group and user(s) being assigned to be of the same organization.
     * Calling user must have PERMISSION_PERMISSION_GROUP_ASSIGN.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse> revokeUsersP3PermissionGroup(
        com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeUsersP3PermissionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetContactPreferences returns all contact preferences for client TODO: will replace ContactList above
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse> getContactPreferences(
        com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContactPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateContactPreferences update fields for all contact preferences for client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse> updateContactPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateContactPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all client compliance preferences
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse> getCompliancePreferences(
        com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCompliancePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates all client Compliance preferences
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse> updateCompliancePreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCompliancePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgentPreferences returns all client agent preferences
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse> getAgentPreferences(
        com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAgentPreferences updates client agent preferences
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse> updateAgentPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetOrganizationPreferences returns preferences for the organization tab
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse> getOrganizationPreferences(
        com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateOrganizationPreferences updates preferences for the organization tab
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse> updateOrganizationPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSchedulePreferences returns all schedule preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse> getSchedulePreferences(
        com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSchedulePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSchedulePreferences returns all schedule preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse> updateSchedulePreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSchedulePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBusinessPreferences returns all business intelligence and associated analytic preferences
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse> getBusinessPreferences(
        com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBusinessPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBusinessPreferences updates all business intelligence and associated analytic preferences
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse> updateBusinessPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBusinessPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEndOfDayPreferences returns a time (hour 1-24) for each day of the week.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse> getEndOfDayPreferences(
        com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEndOfDayPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEndOfDayPreferences update fields for a time (hour 1-24) for each day of the week.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse> updateEndOfDayPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEndOfDayPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReportFilterPreferences returns preferences for the organization tab
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse> getReportFilterPreferences(
        com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReportFilterPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateReportFilterPreferences updates preferences for the filter tab
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse> updateReportFilterPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReportFilterPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPhonePreferences returns all phone and recording preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse> getPhonePreferences(
        com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPhonePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdatePhonePreferences updates phone and recording preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse> updatePhonePreferences(
        com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePhonePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDashboardGeneralPreferences returns all dashboard general preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse> getDashboardGeneralPreferences(
        com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDashboardGeneralPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDashboardGeneralPreferences updates dashboard General preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse> updateDashboardGeneralPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDashboardGeneralPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetWebhookPreferences returns all webhook preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse> getWebhookPreferences(
        com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWebhookPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateWebhookPreferences updates webhook preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse> updateWebhookPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWebhookPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBroadcastPreferences returns all broadcast options for campaign preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse> getBroadcastPreferences(
        com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBroadcastPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBroadcastPreferences updates broadcast options for campaign preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse> updateBroadcastPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBroadcastPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthenticationPreferences returns all authentication options for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse> getAuthenticationPreferences(
        com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthenticationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthenticationPreferences updates authentication preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse> updateAuthenticationPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthenticationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetRecordingPreferences returns all recording options for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse> getRecordingPreferences(
        com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRecordingPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRecordingPreferences updates Recording preferences for an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse> updateRecordingPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRecordingPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDashboardQueuePreferences returns the Dashboard Queue table preferences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse> getDashboardQueuePreferences(
        com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDashboardQueuePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDashboardQueuePreferences updates the Dashboard Queue table preferences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse> updateDashboardQueuePreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDashboardQueuePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgentQuickViewPreferences returns the diplay templates for the client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse> getAgentQuickViewPreferences(
        com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentQuickViewPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences returns the all preferences for voice analytics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse> getVoiceAnalyticsPreferences(
        com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVoiceAnalyticsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetVoiceAnalyticsPreferences updates the all preferences for voice analytics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse> updateVoiceAnalyticsPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVoiceAnalyticsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetScorecardsPreferences returns the all preferences for scorecards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse> getScorecardsPreferences(
        com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScorecardsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetScorecardsPreferences updates the all preferences for scorecards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse> updateScorecardsPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScorecardsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences returns the all preferences for email and sms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse> getEmailSmsPreferences(
        com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailSmsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEmailSmsPreferences updates the all preferences for email and sms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse> updateEmailSmsPreferences(
        com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmailSmsPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditAgentQuickViewPreferences return nil,error
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse> editAgentQuickViewPreferences(
        com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditAgentQuickViewPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditBackofficeThemePreference returns nil, error
     * changes the Client Skin client property
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse> editBackofficeThemePreference(
        com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditBackofficeThemePreferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse> getBackofficeThemePreference(
        com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBackofficeThemePreferenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AcceptLinkbackRecordingTerms controls acknowledgement for linkback recording terms and conditions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse> acceptLinkbackRecordingTerms(
        com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcceptLinkbackRecordingTermsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LinkbackUpdateBroadcastTemplates updates broadcast template action parameters pertaining to linkback recording
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse> linkbackUpdateBroadcastTemplates(
        com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkbackUpdateBroadcastTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecordEmailUnsubscribeAcknowledgement inserts an activity log when the client acknowledges responsibility
     * for their own email unsubscribe links.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse> recordEmailUnsubscribeAcknowledgement(
        com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClearEmailUnsubscribeAcknowledgement inserts an activity log when the client clears acknowledgement for
     * their own email unsubscribe links.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse> clearEmailUnsubscribeAcknowledgement(
        com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearEmailUnsubscribeAcknowledgementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new WebLinkTemplate as defined by request message CreateWebLinkTemplateRequest.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse> createWebLinkTemplate(
        com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWebLinkTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List every WebLinkTemplate.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse> listWebLinkTemplates(
        com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWebLinkTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get one WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse> getWebLinkTemplate(
        com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWebLinkTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse> updateWebLinkTemplate(
        com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWebLinkTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the WebLinkTemplate with the given web_link_template_id.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse> deleteWebLinkTemplate(
        com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWebLinkTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new AgentTriggerTemplate as defined by request message CreateAgentTriggerTemplateRequest.
     * The id field on the request message will be generated as part of
     * this method. If the id field is set it WILL be overwritten.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse> createAgentTriggerTemplate(
        com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentTriggerTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of every AgentTriggerTemplate for the given
     * hunt_group_sid on the request.
     * Requiree Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse> listAgentTriggerTemplates(
        com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentTriggerTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns one AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse> getAgentTriggerTemplate(
        com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentTriggerTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse> updateAgentTriggerTemplate(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentTriggerTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the AgentTriggerTemplate with the id given on the request message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse> deleteAgentTriggerTemplate(
        com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgentTriggerTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new ClientInfoDisplayTemplate as defined by request
     * message CreateClientInfoDisplayRequest.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse> createClientInfoDisplayTemplate(
        com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClientInfoDisplayTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of every ClientInfoDisplayTemplate.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse> listClientInfoDisplayTemplates(
        com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListClientInfoDisplayTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the ClientInfoDisplayTemplate as defined by request
     * message UpdateClientIntoDisplayTemplateRequest.
     * Required Permissions:
     *  ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse> updateClientInfoDisplayTemplate(
        com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientInfoDisplayTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the ClientInfoDisplayTemplate with the id given on the request
     * message.
     * Required Permissions:
     *  ORG_EDIT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse> deleteClientInfoDisplayTemplate(
        com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteClientInfoDisplayTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns one ClientInfoDisplayTemplate with the id given on the
     * request message.
     *  Required Permissions:
     *    ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse> getClientInfoDisplayTemplate(
        com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientInfoDisplayTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a slice of agent pause codes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse> listAgentPauseCodes(
        com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentPauseCodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new Agent Pause Code as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set, or the the pause_code.codes field is an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse> createAgentPauseCode(
        com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentPauseCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an Agent Pause Code with the xml_client_property_sid given on
     * the pause_code in the request message as defined by the other fields
     * on the pause_code message.
     * Required Permissions:
     *    AGENT_MANAGEMENT
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set or the pause_code.codes field was an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse> updateAgentPauseCode(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentPauseCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an Agent Pause Code with the sid given on the request message.
     * Errors:
     *    - grpc.InvalidArgument: The xml_client_property_sid field is invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse> deleteAgentPauseCode(
        com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgentPauseCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a slice of custom report filters belonging to client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse> listCustomReportFilters(
        com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCustomReportFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new custom report filter as defined by the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The custom report filter has an empty name or no filtering parameters.
     *    - grpc.Internal: An error occurred marshalling the custom report filter into an xml string.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse> createCustomReportFilter(
        com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCustomReportFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a custom report filter with the requested xml_client_property_sid
     * with the report filter in the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The pause_code field was not set or the pause_code.codes field was an empty list.
     *    - grpc.Internal: an error occurred while marshalling the pause_code into an xml string.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse> updateCustomReportFilter(
        com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCustomReportFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a custom report filter with the sid given on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The xml_client_property_sid field is invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse> deleteCustomReportFilter(
        com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCustomReportFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a slice of hunt group scripts belonging to the client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse> listAgentResponseGroups(
        com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentResponseGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a slice of last template element scripts belonging to the client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse> listLastTemplateElements(
        com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLastTemplateElementsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the names of the custom queue configs.
     * Required Permissions:
     *    ORG_VIEW (If &#64;org_id is empty)
     *    CUSTOMER_SUPPORT (If &#64;org_id is NOT empty)
     * Errors:
     *   - grpc.Internal: An error occurred while getting the config names.
     *   - grpc.NotFound: The given &#64;org_id was not found (if &#64;org_id is NOT empty).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes> listQueueConfigs(
        com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListQueueConfigsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a queue config with the given &#64;client_sid and &#64;config_name.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while removing the config.
     *    - grpc.InvalidArgument: the config_name was invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes> deleteQueueConfig(
        com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteQueueConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the details for the queue config for the given &#64;client_sid with
     * the given &#64;name. If &#64;merge is true, the config data will be merged
     * with the default config data.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *   - grpc.Internal: An unexpected error occurred getting the config data.
     *   - grpc.InvalidArgument: the given config name was invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes> getQueueConfig(
        com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueueConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a queue config as defined by the &#64;config given
     * on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while saving the config.
     *    - grpc.InvalidArgument: the given config was invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes> createQueueConfig(
        com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateQueueConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a new queue config as defined by the &#64;config given
     * on the request message.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The name of the given config could not be found.
     *    - grpc.Internal: An unexpected error occurred while saving the config.
     *    - grpc.InvalidArgument: the given config was invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes> updateQueueConfig(
        com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateQueueConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Copies a queue config belonging to one organization to another.
     * The queue config with the &#64;from_name will be copied from the
     * organization with the &#64;from_org_id to the organization with the
     * &#64;to_org_id under the new &#64;to_name.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while copying the config.
     *    - grpc.InvalidArgument: A field on the request message was invalid.
     *    - grpc.NotFound: The &#64;to_org_id, &#64;from_org_id, or &#64;from_name was not found.
     *    - grpc.AlreadyExists: The &#64;to_name already exists for the &#64;to_org_id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes> copyQueueConfig(
        com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyQueueConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the url of a downloadable zip file containing every
     * sound for the given queue config.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while zipping the files.
     *    - grpc.NotFound: The given queue config was not found.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes> getAllQueueConfigSounds(
        com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllQueueConfigSoundsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the url of a downladable wav file for the given config's
     * sound matching the given sound enum. Leaving the config field empty
     * will look up the sound for the account default config.
     * Required Permissions:
     *  ORG_VIEW
     * Errors:
     *  - grpc.Internal: An unexpected error occurrec while getting the
     *    downloadable file url.
     *  - grpc.NotFound: The given queue config was not found or the sound
     *    was not found for the config.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes> getQueueConfigSound(
        com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueueConfigSoundMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the given sound for the config to one of the uploaded
     * sound files in the clients upload folder matching the
     * given file_name on the request. Leaving the config field empty
     * will set the sound for the account default config.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while updating
     *      the configs sound.
     *    - gprc.NotFound: The given queue config was not found or the
     *      sound file was not found for the client.
     *    - grpc.InvalidArgument: The file_name on the request was invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes> setQueueConfigSound(
        com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetQueueConfigSoundMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets every sound for a given config by copying them from
     * another config OR by copying them from a default sound set
     * identified by language and gender. Empty config names will be
     * treated as the account default config.
     * Required Permissions:
     *    ORG_EDIT
     * Errors
     *    - grpc.Internal: An unexpected error occurred while updating
     *      all sounds for the given to_config.
     *    - grpc.NotFound: The given to_config or from.config (if used)
     *      could not be found or the default sound set for the given
     *      gender/language identifier could not be found.
     *    - grpc.InvalidArgument: The to_config and from.config contained
     *      the same value. (If from.config was used)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes> setAllQueueConfigSoundsFromSource(
        com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAllQueueConfigSoundsFromSourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks a user's blocked status.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while getting the user.
     *    - grpc.InvalidArgument: The user_id on the request was invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse> getUserBlocked(
        com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserBlockedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unblocks the given user.
     * Required Permissions:
     *    CUSTOMER_SUPPORT
     * Errors:
     *    - grpc.Internal: An unexpected error occurred while unblocking the user.
     *    - grpc.InvalidArgument: The user_id on the request was invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UnblockUserResponse> unblockUser(
        com.tcn.cloud.api.api.v0alpha.UnblockUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnblockUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all users who only exist in skunk and have not yet been migrated
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse> listP3UnMigratedUsers(
        com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListP3UnMigratedUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Migrates a login or agent from backoffice to firestore
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse> migrateP3User(
        com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateP3UserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the username in skunk only for a agent or login
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse> updateP3UserName(
        com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateP3UserNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all users under the p3 hierarchy
     * Required Permissions:
     *  OWNING_ORG_IMITATION
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse> listOwnedUsers(
        com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOwnedUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all orgs under the p3 hierarchy
     * Required Permissions:
     * PERMISSION_ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse> listOwnedOrgs(
        com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOwnedOrgsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removed login strike from list of given login_log_sids
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse> removeLoginStrikes(
        com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveLoginStrikesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removed login strikes by user_id
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse> removeUserLoginStrikes(
        com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserLoginStrikesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists user login history by ip or user_id
     * Required Permissions:
     *  CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse> listLoginHistory(
        com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLoginHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a users agentsid and loginsid
     * Required Permissions:
     *  TCN_ADMIN_SETTINGS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse> updateP3UserSids(
        com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateP3UserSidsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse> createAuthConnection(
        com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuthConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth0 connection settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse> getAuthConnectionSettings(
        com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthConnectionSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSettings updates an existing auth0 connection settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse> updateAuthConnectionSettings(
        com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthConnectionSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse> deleteAuthConnection(
        com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAuthConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a user subscription by id
     * Required Permissions:
     *    ORG_VIEW if user id IS provided
     *    none if user id NOT provided
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse> getUserSubscription(
        com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a user subscription to users list of subscriptions
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse> addUserSubscription(
        com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a user subscription from a users list of subscription
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse> removeUserSubscription(
        com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a user subscription
     * Required Permissions:
     *    USER_EDIT if user id IS provided
     *    EDIT_USER_OPTIONS if user id NOT provided
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse> updateUserSubscription(
        com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all of a users subscriptions
     * Required Permissions:
     *    ORG_VIEW if user id IS provided
     *    none if user id NOT provided
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse> listUserSubscriptions(
        com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists multiple users subscriptions by org. Optionally filters by event type.
     * Required Permissions:
     *    ORG_VIEW
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse> listOrgSubscriptions(
        com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrgSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the systems current environment details
     * Required Permissions:
     *    N/A
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse> getSystemEnvironmentDetails(
        com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSystemEnvironmentDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of agent statistics templates belonging to client_sid.
     * Required Permissions:
     *    ORG_VIEW
     * Errors:
     *    - grpc.NotFound: There is no entry matching the requested client_sid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse> listAgentStatisticsTemplates(
        com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentStatisticsTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid is not found.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse> createAgentStatisticsTemplate(
        com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentStatisticsTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid is not found.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse> updateAgentStatisticsTemplate(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentStatisticsTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an existing agent statistics template for the given client_sid.
     * Required Permissions:
     *    ORG_EDIT
     * Errors:
     *    - grpc.NotFound: The client_sid or agent statistics template is not found.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse> deleteAgentStatisticsTemplate(
        com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgentStatisticsTemplateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ORGANIZATION = 0;
  private static final int METHODID_CONVERT_ORG_TO_MANUAL = 1;
  private static final int METHODID_UPDATE_ORGANIZATION = 2;
  private static final int METHODID_ARCHIVE_ORGANIZATION = 3;
  private static final int METHODID_UN_ARCHIVE_ORGANIZATION = 4;
  private static final int METHODID_LIST_ARCHIVED_ORGANIZATIONS = 5;
  private static final int METHODID_GET_ORGANIZATION_PROFILE = 6;
  private static final int METHODID_GET_ORGANIZATION_PROFILE_BY_ID = 7;
  private static final int METHODID_LIST_ORGANIZATION_DESCRIPTIONS = 8;
  private static final int METHODID_LIST_REGIONAL_ORGANIZATIONS = 9;
  private static final int METHODID_UPDATE_P3OWNING_ORG = 10;
  private static final int METHODID_GET_P3OWNING_ORG = 11;
  private static final int METHODID_LIST_ORGANIZATION_USER_DESCRIPTIONS = 12;
  private static final int METHODID_LIST_USER_DESCRIPTIONS = 13;
  private static final int METHODID_GET_USER_DIRECTORY = 14;
  private static final int METHODID_GET_REGIONS = 15;
  private static final int METHODID_GET_USER_DETAILS = 16;
  private static final int METHODID_ADMIN_GET_USER_DETAILS = 17;
  private static final int METHODID_GET_AGENT_USERS = 18;
  private static final int METHODID_GET_AGENT_SETTINGS = 19;
  private static final int METHODID_GET_AGENT_PROFILE_GROUP = 20;
  private static final int METHODID_UPDATE_AGENT_PROFILE_GROUP = 21;
  private static final int METHODID_CREATE_AGENT_PROFILE_GROUP = 22;
  private static final int METHODID_LIST_AGENT_PROFILE_GROUPS = 23;
  private static final int METHODID_DELETE_AGENT_PROFILE_GROUP = 24;
  private static final int METHODID_ASSIGN_AGENT_PROFILE_GROUPS = 25;
  private static final int METHODID_UPDATE_USER = 26;
  private static final int METHODID_CREATE_USER = 27;
  private static final int METHODID_CREATE_DELEGATED_USER = 28;
  private static final int METHODID_UPDATE_USER_PASSWORD = 29;
  private static final int METHODID_RESET_USER_REQUIRE_PASSWORD_RESET = 30;
  private static final int METHODID_GET_USER_PASSWORD_RESET_LINK = 31;
  private static final int METHODID_GET_USER_EMAIL_VERIFIED = 32;
  private static final int METHODID_SEND_USER_VERIFICATION_EMAIL = 33;
  private static final int METHODID_MANUAL_USER_EMAIL_VERIFICATION = 34;
  private static final int METHODID_GET_TEMP_USER_TOKEN = 35;
  private static final int METHODID_GET_COUNTRIES_LIST = 36;
  private static final int METHODID_GET_ADMIN_CLIENT_PREFERENCES = 37;
  private static final int METHODID_UPDATE_ADMIN_CLIENT_PREFERENCES = 38;
  private static final int METHODID_GET_PERMISSIONS = 39;
  private static final int METHODID_REVOKE_ACCOUNT_OWNER_PERMISSION_FROM_USER = 40;
  private static final int METHODID_UPDATE_USER_DISABLED = 41;
  private static final int METHODID_UPDATE_BULK_USERS_DISABLED = 42;
  private static final int METHODID_GET_ORG_BILLING_SETTINGS = 43;
  private static final int METHODID_SET_ORG_BILLING_SETTINGS = 44;
  private static final int METHODID_ADD_ORG_BILLING_OVERRIDE = 45;
  private static final int METHODID_REMOVE_ORG_BILLING_OVERRIDE = 46;
  private static final int METHODID_GET_SYSTEM_DEFAULT_BILLING_RATES = 47;
  private static final int METHODID_LIST_PERMISSION_GROUPS = 48;
  private static final int METHODID_CREATE_PERMISSION_GROUP = 49;
  private static final int METHODID_UPDATE_PERMISSION_GROUP = 50;
  private static final int METHODID_DELETE_PERMISSION_GROUP = 51;
  private static final int METHODID_ASSIGN_USER_TO_ACCOUNT_OWNER_PERMISSION_GROUP = 52;
  private static final int METHODID_ASSIGN_USER_PERMISSION_GROUP = 53;
  private static final int METHODID_ASSIGN_USERS_PERMISSION_GROUP = 54;
  private static final int METHODID_UPDATE_USER_NEO_PERMISSION_GROUPS = 55;
  private static final int METHODID_REVOKE_USER_PERMISSION_GROUP = 56;
  private static final int METHODID_REVOKE_USERS_PERMISSION_GROUP = 57;
  private static final int METHODID_INIT_DEFAULT_PERMISSION_GROUPS = 58;
  private static final int METHODID_ADD_PERMISSION_TO_ACCOUNT_OWNER_PERMISSION_GROUP = 59;
  private static final int METHODID_REVOKE_PERMISSION_TO_ACCOUNT_OWNER_PERMISSION_GROUP = 60;
  private static final int METHODID_ADD_PERMISSION_TO_ORG_DEFAULT_GROUP = 61;
  private static final int METHODID_REMOVE_PERMISSION_FROM_ORG_DEFAULT_GROUP = 62;
  private static final int METHODID_GET_ORG_DEFAULT_SUPER_USER_GROUP = 63;
  private static final int METHODID_LIST_P3PERMISSION_GROUPS = 64;
  private static final int METHODID_ADD_USER_REGION = 65;
  private static final int METHODID_REMOVE_USER_REGION = 66;
  private static final int METHODID_CREATE_P3PERMISSION_GROUP = 67;
  private static final int METHODID_UPDATE_P3PERMISSION_GROUP = 68;
  private static final int METHODID_DELETE_P3PERMISSION_GROUP = 69;
  private static final int METHODID_ASSIGN_USERS_P3PERMISSION_GROUP = 70;
  private static final int METHODID_ADD_LOGIN_TO_USER = 71;
  private static final int METHODID_REVOKE_USERS_P3PERMISSION_GROUP = 72;
  private static final int METHODID_GET_CONTACT_PREFERENCES = 73;
  private static final int METHODID_UPDATE_CONTACT_PREFERENCES = 74;
  private static final int METHODID_GET_COMPLIANCE_PREFERENCES = 75;
  private static final int METHODID_UPDATE_COMPLIANCE_PREFERENCES = 76;
  private static final int METHODID_GET_AGENT_PREFERENCES = 77;
  private static final int METHODID_UPDATE_AGENT_PREFERENCES = 78;
  private static final int METHODID_GET_ORGANIZATION_PREFERENCES = 79;
  private static final int METHODID_UPDATE_ORGANIZATION_PREFERENCES = 80;
  private static final int METHODID_GET_SCHEDULE_PREFERENCES = 81;
  private static final int METHODID_UPDATE_SCHEDULE_PREFERENCES = 82;
  private static final int METHODID_GET_BUSINESS_PREFERENCES = 83;
  private static final int METHODID_UPDATE_BUSINESS_PREFERENCES = 84;
  private static final int METHODID_GET_END_OF_DAY_PREFERENCES = 85;
  private static final int METHODID_UPDATE_END_OF_DAY_PREFERENCES = 86;
  private static final int METHODID_GET_REPORT_FILTER_PREFERENCES = 87;
  private static final int METHODID_UPDATE_REPORT_FILTER_PREFERENCES = 88;
  private static final int METHODID_GET_PHONE_PREFERENCES = 89;
  private static final int METHODID_UPDATE_PHONE_PREFERENCES = 90;
  private static final int METHODID_GET_DASHBOARD_GENERAL_PREFERENCES = 91;
  private static final int METHODID_UPDATE_DASHBOARD_GENERAL_PREFERENCES = 92;
  private static final int METHODID_GET_WEBHOOK_PREFERENCES = 93;
  private static final int METHODID_UPDATE_WEBHOOK_PREFERENCES = 94;
  private static final int METHODID_GET_BROADCAST_PREFERENCES = 95;
  private static final int METHODID_UPDATE_BROADCAST_PREFERENCES = 96;
  private static final int METHODID_GET_AUTHENTICATION_PREFERENCES = 97;
  private static final int METHODID_UPDATE_AUTHENTICATION_PREFERENCES = 98;
  private static final int METHODID_GET_RECORDING_PREFERENCES = 99;
  private static final int METHODID_UPDATE_RECORDING_PREFERENCES = 100;
  private static final int METHODID_GET_DASHBOARD_QUEUE_PREFERENCES = 101;
  private static final int METHODID_UPDATE_DASHBOARD_QUEUE_PREFERENCES = 102;
  private static final int METHODID_GET_AGENT_QUICK_VIEW_PREFERENCES = 103;
  private static final int METHODID_GET_VOICE_ANALYTICS_PREFERENCES = 104;
  private static final int METHODID_UPDATE_VOICE_ANALYTICS_PREFERENCES = 105;
  private static final int METHODID_GET_SCORECARDS_PREFERENCES = 106;
  private static final int METHODID_UPDATE_SCORECARDS_PREFERENCES = 107;
  private static final int METHODID_GET_EMAIL_SMS_PREFERENCES = 108;
  private static final int METHODID_UPDATE_EMAIL_SMS_PREFERENCES = 109;
  private static final int METHODID_EDIT_AGENT_QUICK_VIEW_PREFERENCES = 110;
  private static final int METHODID_EDIT_BACKOFFICE_THEME_PREFERENCE = 111;
  private static final int METHODID_GET_BACKOFFICE_THEME_PREFERENCE = 112;
  private static final int METHODID_ACCEPT_LINKBACK_RECORDING_TERMS = 113;
  private static final int METHODID_LINKBACK_UPDATE_BROADCAST_TEMPLATES = 114;
  private static final int METHODID_RECORD_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT = 115;
  private static final int METHODID_CLEAR_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT = 116;
  private static final int METHODID_CREATE_WEB_LINK_TEMPLATE = 117;
  private static final int METHODID_LIST_WEB_LINK_TEMPLATES = 118;
  private static final int METHODID_GET_WEB_LINK_TEMPLATE = 119;
  private static final int METHODID_UPDATE_WEB_LINK_TEMPLATE = 120;
  private static final int METHODID_DELETE_WEB_LINK_TEMPLATE = 121;
  private static final int METHODID_CREATE_AGENT_TRIGGER_TEMPLATE = 122;
  private static final int METHODID_LIST_AGENT_TRIGGER_TEMPLATES = 123;
  private static final int METHODID_GET_AGENT_TRIGGER_TEMPLATE = 124;
  private static final int METHODID_UPDATE_AGENT_TRIGGER_TEMPLATE = 125;
  private static final int METHODID_DELETE_AGENT_TRIGGER_TEMPLATE = 126;
  private static final int METHODID_CREATE_CLIENT_INFO_DISPLAY_TEMPLATE = 127;
  private static final int METHODID_LIST_CLIENT_INFO_DISPLAY_TEMPLATES = 128;
  private static final int METHODID_UPDATE_CLIENT_INFO_DISPLAY_TEMPLATE = 129;
  private static final int METHODID_DELETE_CLIENT_INFO_DISPLAY_TEMPLATE = 130;
  private static final int METHODID_GET_CLIENT_INFO_DISPLAY_TEMPLATE = 131;
  private static final int METHODID_LIST_AGENT_PAUSE_CODES = 132;
  private static final int METHODID_CREATE_AGENT_PAUSE_CODE = 133;
  private static final int METHODID_UPDATE_AGENT_PAUSE_CODE = 134;
  private static final int METHODID_DELETE_AGENT_PAUSE_CODE = 135;
  private static final int METHODID_LIST_CUSTOM_REPORT_FILTERS = 136;
  private static final int METHODID_CREATE_CUSTOM_REPORT_FILTER = 137;
  private static final int METHODID_UPDATE_CUSTOM_REPORT_FILTER = 138;
  private static final int METHODID_DELETE_CUSTOM_REPORT_FILTER = 139;
  private static final int METHODID_LIST_AGENT_RESPONSE_GROUPS = 140;
  private static final int METHODID_LIST_LAST_TEMPLATE_ELEMENTS = 141;
  private static final int METHODID_LIST_QUEUE_CONFIGS = 142;
  private static final int METHODID_DELETE_QUEUE_CONFIG = 143;
  private static final int METHODID_GET_QUEUE_CONFIG = 144;
  private static final int METHODID_CREATE_QUEUE_CONFIG = 145;
  private static final int METHODID_UPDATE_QUEUE_CONFIG = 146;
  private static final int METHODID_COPY_QUEUE_CONFIG = 147;
  private static final int METHODID_GET_ALL_QUEUE_CONFIG_SOUNDS = 148;
  private static final int METHODID_GET_QUEUE_CONFIG_SOUND = 149;
  private static final int METHODID_SET_QUEUE_CONFIG_SOUND = 150;
  private static final int METHODID_SET_ALL_QUEUE_CONFIG_SOUNDS_FROM_SOURCE = 151;
  private static final int METHODID_GET_USER_BLOCKED = 152;
  private static final int METHODID_UNBLOCK_USER = 153;
  private static final int METHODID_LIST_P3UN_MIGRATED_USERS = 154;
  private static final int METHODID_MIGRATE_P3USER = 155;
  private static final int METHODID_UPDATE_P3USER_NAME = 156;
  private static final int METHODID_LIST_OWNED_USERS = 157;
  private static final int METHODID_LIST_OWNED_ORGS = 158;
  private static final int METHODID_REMOVE_LOGIN_STRIKES = 159;
  private static final int METHODID_REMOVE_USER_LOGIN_STRIKES = 160;
  private static final int METHODID_LIST_LOGIN_HISTORY = 161;
  private static final int METHODID_UPDATE_P3USER_SIDS = 162;
  private static final int METHODID_CREATE_AUTH_CONNECTION = 163;
  private static final int METHODID_GET_AUTH_CONNECTION_SETTINGS = 164;
  private static final int METHODID_UPDATE_AUTH_CONNECTION_SETTINGS = 165;
  private static final int METHODID_DELETE_AUTH_CONNECTION = 166;
  private static final int METHODID_GET_USER_SUBSCRIPTION = 167;
  private static final int METHODID_ADD_USER_SUBSCRIPTION = 168;
  private static final int METHODID_REMOVE_USER_SUBSCRIPTION = 169;
  private static final int METHODID_UPDATE_USER_SUBSCRIPTION = 170;
  private static final int METHODID_LIST_USER_SUBSCRIPTIONS = 171;
  private static final int METHODID_LIST_ORG_SUBSCRIPTIONS = 172;
  private static final int METHODID_GET_SYSTEM_ENVIRONMENT_DETAILS = 173;
  private static final int METHODID_LIST_AGENT_STATISTICS_TEMPLATES = 174;
  private static final int METHODID_CREATE_AGENT_STATISTICS_TEMPLATE = 175;
  private static final int METHODID_UPDATE_AGENT_STATISTICS_TEMPLATE = 176;
  private static final int METHODID_DELETE_AGENT_STATISTICS_TEMPLATE = 177;

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
        case METHODID_REGISTER_ORGANIZATION:
          serviceImpl.registerOrganization((com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse>) responseObserver);
          break;
        case METHODID_CONVERT_ORG_TO_MANUAL:
          serviceImpl.convertOrgToManual((com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse>) responseObserver);
          break;
        case METHODID_ARCHIVE_ORGANIZATION:
          serviceImpl.archiveOrganization((com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse>) responseObserver);
          break;
        case METHODID_UN_ARCHIVE_ORGANIZATION:
          serviceImpl.unArchiveOrganization((com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse>) responseObserver);
          break;
        case METHODID_LIST_ARCHIVED_ORGANIZATIONS:
          serviceImpl.listArchivedOrganizations((com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_PROFILE:
          serviceImpl.getOrganizationProfile((com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_PROFILE_BY_ID:
          serviceImpl.getOrganizationProfileById((com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATION_DESCRIPTIONS:
          serviceImpl.listOrganizationDescriptions((com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse>) responseObserver);
          break;
        case METHODID_LIST_REGIONAL_ORGANIZATIONS:
          serviceImpl.listRegionalOrganizations((com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_P3OWNING_ORG:
          serviceImpl.updateP3OwningOrg((com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse>) responseObserver);
          break;
        case METHODID_GET_P3OWNING_ORG:
          serviceImpl.getP3OwningOrg((com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATION_USER_DESCRIPTIONS:
          serviceImpl.listOrganizationUserDescriptions((com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_DESCRIPTIONS:
          serviceImpl.listUserDescriptions((com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse>) responseObserver);
          break;
        case METHODID_GET_USER_DIRECTORY:
          serviceImpl.getUserDirectory((com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse>) responseObserver);
          break;
        case METHODID_GET_REGIONS:
          serviceImpl.getRegions((com.tcn.cloud.api.api.v0alpha.GetRegionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetRegionsResponse>) responseObserver);
          break;
        case METHODID_GET_USER_DETAILS:
          serviceImpl.getUserDetails((com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UserDetails>) responseObserver);
          break;
        case METHODID_ADMIN_GET_USER_DETAILS:
          serviceImpl.adminGetUserDetails((com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UserDetails>) responseObserver);
          break;
        case METHODID_GET_AGENT_USERS:
          serviceImpl.getAgentUsers((com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_SETTINGS:
          serviceImpl.getAgentSettings((com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_PROFILE_GROUP:
          serviceImpl.getAgentProfileGroup((com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_PROFILE_GROUP:
          serviceImpl.updateAgentProfileGroup((com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_PROFILE_GROUP:
          serviceImpl.createAgentProfileGroup((com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_PROFILE_GROUPS:
          serviceImpl.listAgentProfileGroups((com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_PROFILE_GROUP:
          serviceImpl.deleteAgentProfileGroup((com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_AGENT_PROFILE_GROUPS:
          serviceImpl.assignAgentProfileGroups((com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.tcn.cloud.api.api.v0alpha.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.tcn.cloud.api.api.v0alpha.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_DELEGATED_USER:
          serviceImpl.createDelegatedUser((com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_PASSWORD:
          serviceImpl.updateUserPassword((com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse>) responseObserver);
          break;
        case METHODID_RESET_USER_REQUIRE_PASSWORD_RESET:
          serviceImpl.resetUserRequirePasswordReset((com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PASSWORD_RESET_LINK:
          serviceImpl.getUserPasswordResetLink((com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse>) responseObserver);
          break;
        case METHODID_GET_USER_EMAIL_VERIFIED:
          serviceImpl.getUserEmailVerified((com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse>) responseObserver);
          break;
        case METHODID_SEND_USER_VERIFICATION_EMAIL:
          serviceImpl.sendUserVerificationEmail((com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse>) responseObserver);
          break;
        case METHODID_MANUAL_USER_EMAIL_VERIFICATION:
          serviceImpl.manualUserEmailVerification((com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse>) responseObserver);
          break;
        case METHODID_GET_TEMP_USER_TOKEN:
          serviceImpl.getTempUserToken((com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes>) responseObserver);
          break;
        case METHODID_GET_COUNTRIES_LIST:
          serviceImpl.getCountriesList((com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse>) responseObserver);
          break;
        case METHODID_GET_ADMIN_CLIENT_PREFERENCES:
          serviceImpl.getAdminClientPreferences((com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ADMIN_CLIENT_PREFERENCES:
          serviceImpl.updateAdminClientPreferences((com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_PERMISSIONS:
          serviceImpl.getPermissions((com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse>) responseObserver);
          break;
        case METHODID_REVOKE_ACCOUNT_OWNER_PERMISSION_FROM_USER:
          serviceImpl.revokeAccountOwnerPermissionFromUser((com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_DISABLED:
          serviceImpl.updateUserDisabled((com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BULK_USERS_DISABLED:
          serviceImpl.updateBulkUsersDisabled((com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse>) responseObserver);
          break;
        case METHODID_GET_ORG_BILLING_SETTINGS:
          serviceImpl.getOrgBillingSettings((com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse>) responseObserver);
          break;
        case METHODID_SET_ORG_BILLING_SETTINGS:
          serviceImpl.setOrgBillingSettings((com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse>) responseObserver);
          break;
        case METHODID_ADD_ORG_BILLING_OVERRIDE:
          serviceImpl.addOrgBillingOverride((com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ORG_BILLING_OVERRIDE:
          serviceImpl.removeOrgBillingOverride((com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse>) responseObserver);
          break;
        case METHODID_GET_SYSTEM_DEFAULT_BILLING_RATES:
          serviceImpl.getSystemDefaultBillingRates((com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse>) responseObserver);
          break;
        case METHODID_LIST_PERMISSION_GROUPS:
          serviceImpl.listPermissionGroups((com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE_PERMISSION_GROUP:
          serviceImpl.createPermissionGroup((com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PERMISSION_GROUP:
          serviceImpl.updatePermissionGroup((com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_PERMISSION_GROUP:
          serviceImpl.deletePermissionGroup((com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_USER_TO_ACCOUNT_OWNER_PERMISSION_GROUP:
          serviceImpl.assignUserToAccountOwnerPermissionGroup((com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_USER_PERMISSION_GROUP:
          serviceImpl.assignUserPermissionGroup((com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_USERS_PERMISSION_GROUP:
          serviceImpl.assignUsersPermissionGroup((com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_NEO_PERMISSION_GROUPS:
          serviceImpl.updateUserNeoPermissionGroups((com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse>) responseObserver);
          break;
        case METHODID_REVOKE_USER_PERMISSION_GROUP:
          serviceImpl.revokeUserPermissionGroup((com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse>) responseObserver);
          break;
        case METHODID_REVOKE_USERS_PERMISSION_GROUP:
          serviceImpl.revokeUsersPermissionGroup((com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse>) responseObserver);
          break;
        case METHODID_INIT_DEFAULT_PERMISSION_GROUPS:
          serviceImpl.initDefaultPermissionGroups((com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse>) responseObserver);
          break;
        case METHODID_ADD_PERMISSION_TO_ACCOUNT_OWNER_PERMISSION_GROUP:
          serviceImpl.addPermissionToAccountOwnerPermissionGroup((com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse>) responseObserver);
          break;
        case METHODID_REVOKE_PERMISSION_TO_ACCOUNT_OWNER_PERMISSION_GROUP:
          serviceImpl.revokePermissionToAccountOwnerPermissionGroup((com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse>) responseObserver);
          break;
        case METHODID_ADD_PERMISSION_TO_ORG_DEFAULT_GROUP:
          serviceImpl.addPermissionToOrgDefaultGroup((com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PERMISSION_FROM_ORG_DEFAULT_GROUP:
          serviceImpl.removePermissionFromOrgDefaultGroup((com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse>) responseObserver);
          break;
        case METHODID_GET_ORG_DEFAULT_SUPER_USER_GROUP:
          serviceImpl.getOrgDefaultSuperUserGroup((com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_P3PERMISSION_GROUPS:
          serviceImpl.listP3PermissionGroups((com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_REGION:
          serviceImpl.addUserRegion((com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_REGION:
          serviceImpl.removeUserRegion((com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse>) responseObserver);
          break;
        case METHODID_CREATE_P3PERMISSION_GROUP:
          serviceImpl.createP3PermissionGroup((com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_P3PERMISSION_GROUP:
          serviceImpl.updateP3PermissionGroup((com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_P3PERMISSION_GROUP:
          serviceImpl.deleteP3PermissionGroup((com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_USERS_P3PERMISSION_GROUP:
          serviceImpl.assignUsersP3PermissionGroup((com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse>) responseObserver);
          break;
        case METHODID_ADD_LOGIN_TO_USER:
          serviceImpl.addLoginToUser((com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse>) responseObserver);
          break;
        case METHODID_REVOKE_USERS_P3PERMISSION_GROUP:
          serviceImpl.revokeUsersP3PermissionGroup((com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse>) responseObserver);
          break;
        case METHODID_GET_CONTACT_PREFERENCES:
          serviceImpl.getContactPreferences((com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONTACT_PREFERENCES:
          serviceImpl.updateContactPreferences((com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_COMPLIANCE_PREFERENCES:
          serviceImpl.getCompliancePreferences((com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMPLIANCE_PREFERENCES:
          serviceImpl.updateCompliancePreferences((com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_PREFERENCES:
          serviceImpl.getAgentPreferences((com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_PREFERENCES:
          serviceImpl.updateAgentPreferences((com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_PREFERENCES:
          serviceImpl.getOrganizationPreferences((com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_PREFERENCES:
          serviceImpl.updateOrganizationPreferences((com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_SCHEDULE_PREFERENCES:
          serviceImpl.getSchedulePreferences((com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULE_PREFERENCES:
          serviceImpl.updateSchedulePreferences((com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_BUSINESS_PREFERENCES:
          serviceImpl.getBusinessPreferences((com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BUSINESS_PREFERENCES:
          serviceImpl.updateBusinessPreferences((com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_END_OF_DAY_PREFERENCES:
          serviceImpl.getEndOfDayPreferences((com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_END_OF_DAY_PREFERENCES:
          serviceImpl.updateEndOfDayPreferences((com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_REPORT_FILTER_PREFERENCES:
          serviceImpl.getReportFilterPreferences((com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REPORT_FILTER_PREFERENCES:
          serviceImpl.updateReportFilterPreferences((com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_PHONE_PREFERENCES:
          serviceImpl.getPhonePreferences((com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PHONE_PREFERENCES:
          serviceImpl.updatePhonePreferences((com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_DASHBOARD_GENERAL_PREFERENCES:
          serviceImpl.getDashboardGeneralPreferences((com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARD_GENERAL_PREFERENCES:
          serviceImpl.updateDashboardGeneralPreferences((com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_WEBHOOK_PREFERENCES:
          serviceImpl.getWebhookPreferences((com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WEBHOOK_PREFERENCES:
          serviceImpl.updateWebhookPreferences((com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_BROADCAST_PREFERENCES:
          serviceImpl.getBroadcastPreferences((com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BROADCAST_PREFERENCES:
          serviceImpl.updateBroadcastPreferences((com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_AUTHENTICATION_PREFERENCES:
          serviceImpl.getAuthenticationPreferences((com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTHENTICATION_PREFERENCES:
          serviceImpl.updateAuthenticationPreferences((com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_RECORDING_PREFERENCES:
          serviceImpl.getRecordingPreferences((com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RECORDING_PREFERENCES:
          serviceImpl.updateRecordingPreferences((com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_DASHBOARD_QUEUE_PREFERENCES:
          serviceImpl.getDashboardQueuePreferences((com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARD_QUEUE_PREFERENCES:
          serviceImpl.updateDashboardQueuePreferences((com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_QUICK_VIEW_PREFERENCES:
          serviceImpl.getAgentQuickViewPreferences((com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_VOICE_ANALYTICS_PREFERENCES:
          serviceImpl.getVoiceAnalyticsPreferences((com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VOICE_ANALYTICS_PREFERENCES:
          serviceImpl.updateVoiceAnalyticsPreferences((com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_SCORECARDS_PREFERENCES:
          serviceImpl.getScorecardsPreferences((com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCORECARDS_PREFERENCES:
          serviceImpl.updateScorecardsPreferences((com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_EMAIL_SMS_PREFERENCES:
          serviceImpl.getEmailSmsPreferences((com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL_SMS_PREFERENCES:
          serviceImpl.updateEmailSmsPreferences((com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse>) responseObserver);
          break;
        case METHODID_EDIT_AGENT_QUICK_VIEW_PREFERENCES:
          serviceImpl.editAgentQuickViewPreferences((com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse>) responseObserver);
          break;
        case METHODID_EDIT_BACKOFFICE_THEME_PREFERENCE:
          serviceImpl.editBackofficeThemePreference((com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse>) responseObserver);
          break;
        case METHODID_GET_BACKOFFICE_THEME_PREFERENCE:
          serviceImpl.getBackofficeThemePreference((com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_LINKBACK_RECORDING_TERMS:
          serviceImpl.acceptLinkbackRecordingTerms((com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse>) responseObserver);
          break;
        case METHODID_LINKBACK_UPDATE_BROADCAST_TEMPLATES:
          serviceImpl.linkbackUpdateBroadcastTemplates((com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse>) responseObserver);
          break;
        case METHODID_RECORD_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT:
          serviceImpl.recordEmailUnsubscribeAcknowledgement((com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse>) responseObserver);
          break;
        case METHODID_CLEAR_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT:
          serviceImpl.clearEmailUnsubscribeAcknowledgement((com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse>) responseObserver);
          break;
        case METHODID_CREATE_WEB_LINK_TEMPLATE:
          serviceImpl.createWebLinkTemplate((com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_WEB_LINK_TEMPLATES:
          serviceImpl.listWebLinkTemplates((com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse>) responseObserver);
          break;
        case METHODID_GET_WEB_LINK_TEMPLATE:
          serviceImpl.getWebLinkTemplate((com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WEB_LINK_TEMPLATE:
          serviceImpl.updateWebLinkTemplate((com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE_WEB_LINK_TEMPLATE:
          serviceImpl.deleteWebLinkTemplate((com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_TRIGGER_TEMPLATE:
          serviceImpl.createAgentTriggerTemplate((com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_TRIGGER_TEMPLATES:
          serviceImpl.listAgentTriggerTemplates((com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_TRIGGER_TEMPLATE:
          serviceImpl.getAgentTriggerTemplate((com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_TRIGGER_TEMPLATE:
          serviceImpl.updateAgentTriggerTemplate((com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_TRIGGER_TEMPLATE:
          serviceImpl.deleteAgentTriggerTemplate((com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLIENT_INFO_DISPLAY_TEMPLATE:
          serviceImpl.createClientInfoDisplayTemplate((com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_CLIENT_INFO_DISPLAY_TEMPLATES:
          serviceImpl.listClientInfoDisplayTemplates((com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT_INFO_DISPLAY_TEMPLATE:
          serviceImpl.updateClientInfoDisplayTemplate((com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT_INFO_DISPLAY_TEMPLATE:
          serviceImpl.deleteClientInfoDisplayTemplate((com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT_INFO_DISPLAY_TEMPLATE:
          serviceImpl.getClientInfoDisplayTemplate((com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_PAUSE_CODES:
          serviceImpl.listAgentPauseCodes((com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_PAUSE_CODE:
          serviceImpl.createAgentPauseCode((com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_PAUSE_CODE:
          serviceImpl.updateAgentPauseCode((com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_PAUSE_CODE:
          serviceImpl.deleteAgentPauseCode((com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse>) responseObserver);
          break;
        case METHODID_LIST_CUSTOM_REPORT_FILTERS:
          serviceImpl.listCustomReportFilters((com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOM_REPORT_FILTER:
          serviceImpl.createCustomReportFilter((com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CUSTOM_REPORT_FILTER:
          serviceImpl.updateCustomReportFilter((com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse>) responseObserver);
          break;
        case METHODID_DELETE_CUSTOM_REPORT_FILTER:
          serviceImpl.deleteCustomReportFilter((com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_RESPONSE_GROUPS:
          serviceImpl.listAgentResponseGroups((com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_LAST_TEMPLATE_ELEMENTS:
          serviceImpl.listLastTemplateElements((com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse>) responseObserver);
          break;
        case METHODID_LIST_QUEUE_CONFIGS:
          serviceImpl.listQueueConfigs((com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes>) responseObserver);
          break;
        case METHODID_DELETE_QUEUE_CONFIG:
          serviceImpl.deleteQueueConfig((com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes>) responseObserver);
          break;
        case METHODID_GET_QUEUE_CONFIG:
          serviceImpl.getQueueConfig((com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes>) responseObserver);
          break;
        case METHODID_CREATE_QUEUE_CONFIG:
          serviceImpl.createQueueConfig((com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes>) responseObserver);
          break;
        case METHODID_UPDATE_QUEUE_CONFIG:
          serviceImpl.updateQueueConfig((com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes>) responseObserver);
          break;
        case METHODID_COPY_QUEUE_CONFIG:
          serviceImpl.copyQueueConfig((com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes>) responseObserver);
          break;
        case METHODID_GET_ALL_QUEUE_CONFIG_SOUNDS:
          serviceImpl.getAllQueueConfigSounds((com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes>) responseObserver);
          break;
        case METHODID_GET_QUEUE_CONFIG_SOUND:
          serviceImpl.getQueueConfigSound((com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes>) responseObserver);
          break;
        case METHODID_SET_QUEUE_CONFIG_SOUND:
          serviceImpl.setQueueConfigSound((com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes>) responseObserver);
          break;
        case METHODID_SET_ALL_QUEUE_CONFIG_SOUNDS_FROM_SOURCE:
          serviceImpl.setAllQueueConfigSoundsFromSource((com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes>) responseObserver);
          break;
        case METHODID_GET_USER_BLOCKED:
          serviceImpl.getUserBlocked((com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse>) responseObserver);
          break;
        case METHODID_UNBLOCK_USER:
          serviceImpl.unblockUser((com.tcn.cloud.api.api.v0alpha.UnblockUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnblockUserResponse>) responseObserver);
          break;
        case METHODID_LIST_P3UN_MIGRATED_USERS:
          serviceImpl.listP3UnMigratedUsers((com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_P3USER:
          serviceImpl.migrateP3User((com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_P3USER_NAME:
          serviceImpl.updateP3UserName((com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse>) responseObserver);
          break;
        case METHODID_LIST_OWNED_USERS:
          serviceImpl.listOwnedUsers((com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse>) responseObserver);
          break;
        case METHODID_LIST_OWNED_ORGS:
          serviceImpl.listOwnedOrgs((com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_LOGIN_STRIKES:
          serviceImpl.removeLoginStrikes((com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_LOGIN_STRIKES:
          serviceImpl.removeUserLoginStrikes((com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse>) responseObserver);
          break;
        case METHODID_LIST_LOGIN_HISTORY:
          serviceImpl.listLoginHistory((com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse>) responseObserver);
          break;
        case METHODID_UPDATE_P3USER_SIDS:
          serviceImpl.updateP3UserSids((com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse>) responseObserver);
          break;
        case METHODID_CREATE_AUTH_CONNECTION:
          serviceImpl.createAuthConnection((com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_CONNECTION_SETTINGS:
          serviceImpl.getAuthConnectionSettings((com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTH_CONNECTION_SETTINGS:
          serviceImpl.updateAuthConnectionSettings((com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTH_CONNECTION:
          serviceImpl.deleteAuthConnection((com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SUBSCRIPTION:
          serviceImpl.getUserSubscription((com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_SUBSCRIPTION:
          serviceImpl.addUserSubscription((com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_SUBSCRIPTION:
          serviceImpl.removeUserSubscription((com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_SUBSCRIPTION:
          serviceImpl.updateUserSubscription((com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_SUBSCRIPTIONS:
          serviceImpl.listUserSubscriptions((com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_LIST_ORG_SUBSCRIPTIONS:
          serviceImpl.listOrgSubscriptions((com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_GET_SYSTEM_ENVIRONMENT_DETAILS:
          serviceImpl.getSystemEnvironmentDetails((com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_STATISTICS_TEMPLATES:
          serviceImpl.listAgentStatisticsTemplates((com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_STATISTICS_TEMPLATE:
          serviceImpl.createAgentStatisticsTemplate((com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_STATISTICS_TEMPLATE:
          serviceImpl.updateAgentStatisticsTemplate((com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_STATISTICS_TEMPLATE:
          serviceImpl.deleteAgentStatisticsTemplate((com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse>) responseObserver);
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
          getRegisterOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RegisterOrganizationRequest,
              com.tcn.cloud.api.api.v0alpha.RegisterOrganizationResponse>(
                service, METHODID_REGISTER_ORGANIZATION)))
        .addMethod(
          getConvertOrgToManualMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualRequest,
              com.tcn.cloud.api.api.v0alpha.ConvertOrgToManualResponse>(
                service, METHODID_CONVERT_ORG_TO_MANUAL)))
        .addMethod(
          getUpdateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateOrganizationRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateOrganizationResponse>(
                service, METHODID_UPDATE_ORGANIZATION)))
        .addMethod(
          getArchiveOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationRequest,
              com.tcn.cloud.api.api.v0alpha.ArchiveOrganizationResponse>(
                service, METHODID_ARCHIVE_ORGANIZATION)))
        .addMethod(
          getUnArchiveOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationRequest,
              com.tcn.cloud.api.api.v0alpha.UnArchiveOrganizationResponse>(
                service, METHODID_UN_ARCHIVE_ORGANIZATION)))
        .addMethod(
          getListArchivedOrganizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsRequest,
              com.tcn.cloud.api.api.v0alpha.ListArchivedOrganizationsResponse>(
                service, METHODID_LIST_ARCHIVED_ORGANIZATIONS)))
        .addMethod(
          getGetOrganizationProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileRequest,
              com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse>(
                service, METHODID_GET_ORGANIZATION_PROFILE)))
        .addMethod(
          getGetOrganizationProfileByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileByIdRequest,
              com.tcn.cloud.api.api.v0alpha.GetOrganizationProfileResponse>(
                service, METHODID_GET_ORGANIZATION_PROFILE_BY_ID)))
        .addMethod(
          getListOrganizationDescriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsRequest,
              com.tcn.cloud.api.api.v0alpha.ListOrganizationDescriptionsResponse>(
                service, METHODID_LIST_ORGANIZATION_DESCRIPTIONS)))
        .addMethod(
          getListRegionalOrganizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsRequest,
              com.tcn.cloud.api.api.v0alpha.ListRegionalOrganizationsResponse>(
                service, METHODID_LIST_REGIONAL_ORGANIZATIONS)))
        .addMethod(
          getUpdateP3OwningOrgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateP3OwningOrgResponse>(
                service, METHODID_UPDATE_P3OWNING_ORG)))
        .addMethod(
          getGetP3OwningOrgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgRequest,
              com.tcn.cloud.api.api.v0alpha.GetP3OwningOrgResponse>(
                service, METHODID_GET_P3OWNING_ORG)))
        .addMethod(
          getListOrganizationUserDescriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsRequest,
              com.tcn.cloud.api.api.v0alpha.ListOrganizationUserDescriptionsResponse>(
                service, METHODID_LIST_ORGANIZATION_USER_DESCRIPTIONS)))
        .addMethod(
          getListUserDescriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsRequest,
              com.tcn.cloud.api.api.v0alpha.ListUserDescriptionsResponse>(
                service, METHODID_LIST_USER_DESCRIPTIONS)))
        .addMethod(
          getGetUserDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetUserDirectoryRequest,
              com.tcn.cloud.api.api.v0alpha.GetUserDirectoryResponse>(
                service, METHODID_GET_USER_DIRECTORY)))
        .addMethod(
          getGetRegionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetRegionsRequest,
              com.tcn.cloud.api.api.v0alpha.GetRegionsResponse>(
                service, METHODID_GET_REGIONS)))
        .addMethod(
          getGetUserDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetUserDetailsRequest,
              com.tcn.cloud.api.api.v0alpha.UserDetails>(
                service, METHODID_GET_USER_DETAILS)))
        .addMethod(
          getAdminGetUserDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AdminGetUserDetailsRequest,
              com.tcn.cloud.api.api.v0alpha.UserDetails>(
                service, METHODID_ADMIN_GET_USER_DETAILS)))
        .addMethod(
          getGetAgentUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAgentUsersRequest,
              com.tcn.cloud.api.api.v0alpha.GetAgentUsersResponse>(
                service, METHODID_GET_AGENT_USERS)))
        .addMethod(
          getGetAgentSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAgentSettingsRequest,
              com.tcn.cloud.api.api.v0alpha.GetAgentSettingsResponse>(
                service, METHODID_GET_AGENT_SETTINGS)))
        .addMethod(
          getGetAgentProfileGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupRequest,
              com.tcn.cloud.api.api.v0alpha.GetAgentProfileGroupResponse>(
                service, METHODID_GET_AGENT_PROFILE_GROUP)))
        .addMethod(
          getUpdateAgentProfileGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateAgentProfileGroupResponse>(
                service, METHODID_UPDATE_AGENT_PROFILE_GROUP)))
        .addMethod(
          getCreateAgentProfileGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupRequest,
              com.tcn.cloud.api.api.v0alpha.CreateAgentProfileGroupResponse>(
                service, METHODID_CREATE_AGENT_PROFILE_GROUP)))
        .addMethod(
          getListAgentProfileGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsRequest,
              com.tcn.cloud.api.api.v0alpha.ListAgentProfileGroupsResponse>(
                service, METHODID_LIST_AGENT_PROFILE_GROUPS)))
        .addMethod(
          getDeleteAgentProfileGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupRequest,
              com.tcn.cloud.api.api.v0alpha.DeleteAgentProfileGroupResponse>(
                service, METHODID_DELETE_AGENT_PROFILE_GROUP)))
        .addMethod(
          getAssignAgentProfileGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsRequest,
              com.tcn.cloud.api.api.v0alpha.AssignAgentProfileGroupsResponse>(
                service, METHODID_ASSIGN_AGENT_PROFILE_GROUPS)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateUserRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateUserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateUserRequest,
              com.tcn.cloud.api.api.v0alpha.CreateUserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getCreateDelegatedUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserRequest,
              com.tcn.cloud.api.api.v0alpha.CreateDelegatedUserResponse>(
                service, METHODID_CREATE_DELEGATED_USER)))
        .addMethod(
          getUpdateUserPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordResponse>(
                service, METHODID_UPDATE_USER_PASSWORD)))
        .addMethod(
          getResetUserRequirePasswordResetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetRequest,
              com.tcn.cloud.api.api.v0alpha.ResetUserRequirePasswordResetResponse>(
                service, METHODID_RESET_USER_REQUIRE_PASSWORD_RESET)))
        .addMethod(
          getGetUserPasswordResetLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkRequest,
              com.tcn.cloud.api.api.v0alpha.GetUserPasswordResetLinkResponse>(
                service, METHODID_GET_USER_PASSWORD_RESET_LINK)))
        .addMethod(
          getGetUserEmailVerifiedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedRequest,
              com.tcn.cloud.api.api.v0alpha.GetUserEmailVerifiedResponse>(
                service, METHODID_GET_USER_EMAIL_VERIFIED)))
        .addMethod(
          getSendUserVerificationEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailRequest,
              com.tcn.cloud.api.api.v0alpha.SendUserVerificationEmailResponse>(
                service, METHODID_SEND_USER_VERIFICATION_EMAIL)))
        .addMethod(
          getManualUserEmailVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationRequest,
              com.tcn.cloud.api.api.v0alpha.ManualUserEmailVerificationResponse>(
                service, METHODID_MANUAL_USER_EMAIL_VERIFICATION)))
        .addMethod(
          getGetTempUserTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetTempUserTokenReq,
              com.tcn.cloud.api.api.v0alpha.GetTempUserTokenRes>(
                service, METHODID_GET_TEMP_USER_TOKEN)))
        .addMethod(
          getGetCountriesListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetCountriesListRequest,
              com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse>(
                service, METHODID_GET_COUNTRIES_LIST)))
        .addMethod(
          getGetAdminClientPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetAdminClientPreferencesResponse>(
                service, METHODID_GET_ADMIN_CLIENT_PREFERENCES)))
        .addMethod(
          getUpdateAdminClientPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesResponse>(
                service, METHODID_UPDATE_ADMIN_CLIENT_PREFERENCES)))
        .addMethod(
          getGetPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetPermissionsRequest,
              com.tcn.cloud.api.api.v0alpha.GetPermissionsResponse>(
                service, METHODID_GET_PERMISSIONS)))
        .addMethod(
          getRevokeAccountOwnerPermissionFromUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserRequest,
              com.tcn.cloud.api.api.v0alpha.RevokeAccountOwnerPermissionFromUserResponse>(
                service, METHODID_REVOKE_ACCOUNT_OWNER_PERMISSION_FROM_USER)))
        .addMethod(
          getUpdateUserDisabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateUserDisabledResponse>(
                service, METHODID_UPDATE_USER_DISABLED)))
        .addMethod(
          getUpdateBulkUsersDisabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateBulkUsersDisabledResponse>(
                service, METHODID_UPDATE_BULK_USERS_DISABLED)))
        .addMethod(
          getGetOrgBillingSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsRequest,
              com.tcn.cloud.api.api.v0alpha.GetOrgBillingSettingsResponse>(
                service, METHODID_GET_ORG_BILLING_SETTINGS)))
        .addMethod(
          getSetOrgBillingSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsRequest,
              com.tcn.cloud.api.api.v0alpha.SetOrgBillingSettingsResponse>(
                service, METHODID_SET_ORG_BILLING_SETTINGS)))
        .addMethod(
          getAddOrgBillingOverrideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideRequest,
              com.tcn.cloud.api.api.v0alpha.AddOrgBillingOverrideResponse>(
                service, METHODID_ADD_ORG_BILLING_OVERRIDE)))
        .addMethod(
          getRemoveOrgBillingOverrideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideRequest,
              com.tcn.cloud.api.api.v0alpha.RemoveOrgBillingOverrideResponse>(
                service, METHODID_REMOVE_ORG_BILLING_OVERRIDE)))
        .addMethod(
          getGetSystemDefaultBillingRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesRequest,
              com.tcn.cloud.api.api.v0alpha.GetSystemDefaultBillingRatesResponse>(
                service, METHODID_GET_SYSTEM_DEFAULT_BILLING_RATES)))
        .addMethod(
          getListPermissionGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsRequest,
              com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse>(
                service, METHODID_LIST_PERMISSION_GROUPS)))
        .addMethod(
          getCreatePermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.CreatePermissionGroupResponse>(
                service, METHODID_CREATE_PERMISSION_GROUP)))
        .addMethod(
          getUpdatePermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.UpdatePermissionGroupResponse>(
                service, METHODID_UPDATE_PERMISSION_GROUP)))
        .addMethod(
          getDeletePermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.DeletePermissionGroupResponse>(
                service, METHODID_DELETE_PERMISSION_GROUP)))
        .addMethod(
          getAssignUserToAccountOwnerPermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.AssignUserToAccountOwnerPermissionGroupResponse>(
                service, METHODID_ASSIGN_USER_TO_ACCOUNT_OWNER_PERMISSION_GROUP)))
        .addMethod(
          getAssignUserPermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.AssignUserPermissionGroupResponse>(
                service, METHODID_ASSIGN_USER_PERMISSION_GROUP)))
        .addMethod(
          getAssignUsersPermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupResponse>(
                service, METHODID_ASSIGN_USERS_PERMISSION_GROUP)))
        .addMethod(
          getUpdateUserNeoPermissionGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateUserNeoPermissionGroupsResponse>(
                service, METHODID_UPDATE_USER_NEO_PERMISSION_GROUPS)))
        .addMethod(
          getRevokeUserPermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupResponse>(
                service, METHODID_REVOKE_USER_PERMISSION_GROUP)))
        .addMethod(
          getRevokeUsersPermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.RevokeUsersPermissionGroupResponse>(
                service, METHODID_REVOKE_USERS_PERMISSION_GROUP)))
        .addMethod(
          getInitDefaultPermissionGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsRequest,
              com.tcn.cloud.api.api.v0alpha.InitDefaultPermissionGroupsResponse>(
                service, METHODID_INIT_DEFAULT_PERMISSION_GROUPS)))
        .addMethod(
          getAddPermissionToAccountOwnerPermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.AddPermissionToAccountOwnerPermissionGroupResponse>(
                service, METHODID_ADD_PERMISSION_TO_ACCOUNT_OWNER_PERMISSION_GROUP)))
        .addMethod(
          getRevokePermissionToAccountOwnerPermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.RevokePermissionToAccountOwnerPermissionGroupResponse>(
                service, METHODID_REVOKE_PERMISSION_TO_ACCOUNT_OWNER_PERMISSION_GROUP)))
        .addMethod(
          getAddPermissionToOrgDefaultGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupRequest,
              com.tcn.cloud.api.api.v0alpha.AddPermissionToOrgDefaultGroupResponse>(
                service, METHODID_ADD_PERMISSION_TO_ORG_DEFAULT_GROUP)))
        .addMethod(
          getRemovePermissionFromOrgDefaultGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest,
              com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupResponse>(
                service, METHODID_REMOVE_PERMISSION_FROM_ORG_DEFAULT_GROUP)))
        .addMethod(
          getGetOrgDefaultSuperUserGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupRequest,
              com.tcn.cloud.api.api.v0alpha.GetOrgDefaultSuperUserGroupResponse>(
                service, METHODID_GET_ORG_DEFAULT_SUPER_USER_GROUP)))
        .addMethod(
          getListP3PermissionGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsRequest,
              com.tcn.cloud.api.api.v0alpha.ListP3PermissionGroupsResponse>(
                service, METHODID_LIST_P3PERMISSION_GROUPS)))
        .addMethod(
          getAddUserRegionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AddUserRegionRequest,
              com.tcn.cloud.api.api.v0alpha.AddUserRegionResponse>(
                service, METHODID_ADD_USER_REGION)))
        .addMethod(
          getRemoveUserRegionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RemoveUserRegionRequest,
              com.tcn.cloud.api.api.v0alpha.RemoveUserRegionResponse>(
                service, METHODID_REMOVE_USER_REGION)))
        .addMethod(
          getCreateP3PermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.CreateP3PermissionGroupResponse>(
                service, METHODID_CREATE_P3PERMISSION_GROUP)))
        .addMethod(
          getUpdateP3PermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateP3PermissionGroupResponse>(
                service, METHODID_UPDATE_P3PERMISSION_GROUP)))
        .addMethod(
          getDeleteP3PermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.DeleteP3PermissionGroupResponse>(
                service, METHODID_DELETE_P3PERMISSION_GROUP)))
        .addMethod(
          getAssignUsersP3PermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.AssignUsersP3PermissionGroupResponse>(
                service, METHODID_ASSIGN_USERS_P3PERMISSION_GROUP)))
        .addMethod(
          getAddLoginToUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AddLoginToUserRequest,
              com.tcn.cloud.api.api.v0alpha.AddLoginToUserResponse>(
                service, METHODID_ADD_LOGIN_TO_USER)))
        .addMethod(
          getRevokeUsersP3PermissionGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupRequest,
              com.tcn.cloud.api.api.v0alpha.RevokeUsersP3PermissionGroupResponse>(
                service, METHODID_REVOKE_USERS_P3PERMISSION_GROUP)))
        .addMethod(
          getGetContactPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetContactPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetContactPreferencesResponse>(
                service, METHODID_GET_CONTACT_PREFERENCES)))
        .addMethod(
          getUpdateContactPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateContactPreferencesResponse>(
                service, METHODID_UPDATE_CONTACT_PREFERENCES)))
        .addMethod(
          getGetCompliancePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetCompliancePreferencesResponse>(
                service, METHODID_GET_COMPLIANCE_PREFERENCES)))
        .addMethod(
          getUpdateCompliancePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateCompliancePreferencesResponse>(
                service, METHODID_UPDATE_COMPLIANCE_PREFERENCES)))
        .addMethod(
          getGetAgentPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetAgentPreferencesResponse>(
                service, METHODID_GET_AGENT_PREFERENCES)))
        .addMethod(
          getUpdateAgentPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateAgentPreferencesResponse>(
                service, METHODID_UPDATE_AGENT_PREFERENCES)))
        .addMethod(
          getGetOrganizationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetOrganizationPreferencesResponse>(
                service, METHODID_GET_ORGANIZATION_PREFERENCES)))
        .addMethod(
          getUpdateOrganizationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateOrganizationPreferencesResponse>(
                service, METHODID_UPDATE_ORGANIZATION_PREFERENCES)))
        .addMethod(
          getGetSchedulePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse>(
                service, METHODID_GET_SCHEDULE_PREFERENCES)))
        .addMethod(
          getUpdateSchedulePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateSchedulePreferencesResponse>(
                service, METHODID_UPDATE_SCHEDULE_PREFERENCES)))
        .addMethod(
          getGetBusinessPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetBusinessPreferencesResponse>(
                service, METHODID_GET_BUSINESS_PREFERENCES)))
        .addMethod(
          getUpdateBusinessPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateBusinessPreferencesResponse>(
                service, METHODID_UPDATE_BUSINESS_PREFERENCES)))
        .addMethod(
          getGetEndOfDayPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse>(
                service, METHODID_GET_END_OF_DAY_PREFERENCES)))
        .addMethod(
          getUpdateEndOfDayPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateEndOfDayPreferencesResponse>(
                service, METHODID_UPDATE_END_OF_DAY_PREFERENCES)))
        .addMethod(
          getGetReportFilterPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetFilterPreferencesResponse>(
                service, METHODID_GET_REPORT_FILTER_PREFERENCES)))
        .addMethod(
          getUpdateReportFilterPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateFilterPreferencesResponse>(
                service, METHODID_UPDATE_REPORT_FILTER_PREFERENCES)))
        .addMethod(
          getGetPhonePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse>(
                service, METHODID_GET_PHONE_PREFERENCES)))
        .addMethod(
          getUpdatePhonePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdatePhonePreferencesResponse>(
                service, METHODID_UPDATE_PHONE_PREFERENCES)))
        .addMethod(
          getGetDashboardGeneralPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetDashboardGeneralPreferencesResponse>(
                service, METHODID_GET_DASHBOARD_GENERAL_PREFERENCES)))
        .addMethod(
          getUpdateDashboardGeneralPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateDashboardGeneralPreferencesResponse>(
                service, METHODID_UPDATE_DASHBOARD_GENERAL_PREFERENCES)))
        .addMethod(
          getGetWebhookPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetWebhookPreferencesResponse>(
                service, METHODID_GET_WEBHOOK_PREFERENCES)))
        .addMethod(
          getUpdateWebhookPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateWebhookPreferencesResponse>(
                service, METHODID_UPDATE_WEBHOOK_PREFERENCES)))
        .addMethod(
          getGetBroadcastPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetBroadcastPreferencesResponse>(
                service, METHODID_GET_BROADCAST_PREFERENCES)))
        .addMethod(
          getUpdateBroadcastPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateBroadcastPreferencesResponse>(
                service, METHODID_UPDATE_BROADCAST_PREFERENCES)))
        .addMethod(
          getGetAuthenticationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetAuthenticationPreferencesResponse>(
                service, METHODID_GET_AUTHENTICATION_PREFERENCES)))
        .addMethod(
          getUpdateAuthenticationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesResponse>(
                service, METHODID_UPDATE_AUTHENTICATION_PREFERENCES)))
        .addMethod(
          getGetRecordingPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetRecordingPreferencesResponse>(
                service, METHODID_GET_RECORDING_PREFERENCES)))
        .addMethod(
          getUpdateRecordingPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateRecordingPreferencesResponse>(
                service, METHODID_UPDATE_RECORDING_PREFERENCES)))
        .addMethod(
          getGetDashboardQueuePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse>(
                service, METHODID_GET_DASHBOARD_QUEUE_PREFERENCES)))
        .addMethod(
          getUpdateDashboardQueuePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesResponse>(
                service, METHODID_UPDATE_DASHBOARD_QUEUE_PREFERENCES)))
        .addMethod(
          getGetAgentQuickViewPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetAgentQuickViewPreferencesResponse>(
                service, METHODID_GET_AGENT_QUICK_VIEW_PREFERENCES)))
        .addMethod(
          getGetVoiceAnalyticsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse>(
                service, METHODID_GET_VOICE_ANALYTICS_PREFERENCES)))
        .addMethod(
          getUpdateVoiceAnalyticsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateVoiceAnalyticsPreferencesResponse>(
                service, METHODID_UPDATE_VOICE_ANALYTICS_PREFERENCES)))
        .addMethod(
          getGetScorecardsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetScorecardsPreferencesResponse>(
                service, METHODID_GET_SCORECARDS_PREFERENCES)))
        .addMethod(
          getUpdateScorecardsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateScorecardsPreferencesResponse>(
                service, METHODID_UPDATE_SCORECARDS_PREFERENCES)))
        .addMethod(
          getGetEmailSmsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.GetEmailSmsPreferencesResponse>(
                service, METHODID_GET_EMAIL_SMS_PREFERENCES)))
        .addMethod(
          getUpdateEmailSmsPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesResponse>(
                service, METHODID_UPDATE_EMAIL_SMS_PREFERENCES)))
        .addMethod(
          getEditAgentQuickViewPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesRequest,
              com.tcn.cloud.api.api.v0alpha.EditAgentQuickViewPreferencesResponse>(
                service, METHODID_EDIT_AGENT_QUICK_VIEW_PREFERENCES)))
        .addMethod(
          getEditBackofficeThemePreferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceRequest,
              com.tcn.cloud.api.api.v0alpha.EditBackofficeThemePreferenceResponse>(
                service, METHODID_EDIT_BACKOFFICE_THEME_PREFERENCE)))
        .addMethod(
          getGetBackofficeThemePreferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceRequest,
              com.tcn.cloud.api.api.v0alpha.GetBackofficeThemePreferenceResponse>(
                service, METHODID_GET_BACKOFFICE_THEME_PREFERENCE)))
        .addMethod(
          getAcceptLinkbackRecordingTermsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsRequest,
              com.tcn.cloud.api.api.v0alpha.AcceptLinkbackRecordingTermsResponse>(
                service, METHODID_ACCEPT_LINKBACK_RECORDING_TERMS)))
        .addMethod(
          getLinkbackUpdateBroadcastTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesRequest,
              com.tcn.cloud.api.api.v0alpha.LinkbackUpdateBroadcastTemplatesResponse>(
                service, METHODID_LINKBACK_UPDATE_BROADCAST_TEMPLATES)))
        .addMethod(
          getRecordEmailUnsubscribeAcknowledgementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementRequest,
              com.tcn.cloud.api.api.v0alpha.RecordEmailUnsubscribeAcknowledgementResponse>(
                service, METHODID_RECORD_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT)))
        .addMethod(
          getClearEmailUnsubscribeAcknowledgementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementRequest,
              com.tcn.cloud.api.api.v0alpha.ClearEmailUnsubscribeAcknowledgementResponse>(
                service, METHODID_CLEAR_EMAIL_UNSUBSCRIBE_ACKNOWLEDGEMENT)))
        .addMethod(
          getCreateWebLinkTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.CreateWebLinkTemplateResponse>(
                service, METHODID_CREATE_WEB_LINK_TEMPLATE)))
        .addMethod(
          getListWebLinkTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesRequest,
              com.tcn.cloud.api.api.v0alpha.ListWebLinkTemplatesResponse>(
                service, METHODID_LIST_WEB_LINK_TEMPLATES)))
        .addMethod(
          getGetWebLinkTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse>(
                service, METHODID_GET_WEB_LINK_TEMPLATE)))
        .addMethod(
          getUpdateWebLinkTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateWebLinkTemplateResponse>(
                service, METHODID_UPDATE_WEB_LINK_TEMPLATE)))
        .addMethod(
          getDeleteWebLinkTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.DeleteWebLinkTemplateResponse>(
                service, METHODID_DELETE_WEB_LINK_TEMPLATE)))
        .addMethod(
          getCreateAgentTriggerTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.CreateAgentTriggerTemplateResponse>(
                service, METHODID_CREATE_AGENT_TRIGGER_TEMPLATE)))
        .addMethod(
          getListAgentTriggerTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesRequest,
              com.tcn.cloud.api.api.v0alpha.ListAgentTriggerTemplatesResponse>(
                service, METHODID_LIST_AGENT_TRIGGER_TEMPLATES)))
        .addMethod(
          getGetAgentTriggerTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.GetAgentTriggerTemplateResponse>(
                service, METHODID_GET_AGENT_TRIGGER_TEMPLATE)))
        .addMethod(
          getUpdateAgentTriggerTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateAgentTriggerTemplateResponse>(
                service, METHODID_UPDATE_AGENT_TRIGGER_TEMPLATE)))
        .addMethod(
          getDeleteAgentTriggerTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.DeleteAgentTriggerTemplateResponse>(
                service, METHODID_DELETE_AGENT_TRIGGER_TEMPLATE)))
        .addMethod(
          getCreateClientInfoDisplayTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.CreateClientInfoDisplayTemplateResponse>(
                service, METHODID_CREATE_CLIENT_INFO_DISPLAY_TEMPLATE)))
        .addMethod(
          getListClientInfoDisplayTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesRequest,
              com.tcn.cloud.api.api.v0alpha.ListClientInfoDisplayTemplatesResponse>(
                service, METHODID_LIST_CLIENT_INFO_DISPLAY_TEMPLATES)))
        .addMethod(
          getUpdateClientInfoDisplayTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateClientInfoDisplayTemplateResponse>(
                service, METHODID_UPDATE_CLIENT_INFO_DISPLAY_TEMPLATE)))
        .addMethod(
          getDeleteClientInfoDisplayTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.DeleteClientInfoDisplayTemplateResponse>(
                service, METHODID_DELETE_CLIENT_INFO_DISPLAY_TEMPLATE)))
        .addMethod(
          getGetClientInfoDisplayTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse>(
                service, METHODID_GET_CLIENT_INFO_DISPLAY_TEMPLATE)))
        .addMethod(
          getListAgentPauseCodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesRequest,
              com.tcn.cloud.api.api.v0alpha.ListAgentPauseCodesResponse>(
                service, METHODID_LIST_AGENT_PAUSE_CODES)))
        .addMethod(
          getCreateAgentPauseCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest,
              com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeResponse>(
                service, METHODID_CREATE_AGENT_PAUSE_CODE)))
        .addMethod(
          getUpdateAgentPauseCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateAgentPauseCodeResponse>(
                service, METHODID_UPDATE_AGENT_PAUSE_CODE)))
        .addMethod(
          getDeleteAgentPauseCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest,
              com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeResponse>(
                service, METHODID_DELETE_AGENT_PAUSE_CODE)))
        .addMethod(
          getListCustomReportFiltersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRequest,
              com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse>(
                service, METHODID_LIST_CUSTOM_REPORT_FILTERS)))
        .addMethod(
          getCreateCustomReportFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterRequest,
              com.tcn.cloud.api.api.v0alpha.CreateCustomReportFilterResponse>(
                service, METHODID_CREATE_CUSTOM_REPORT_FILTER)))
        .addMethod(
          getUpdateCustomReportFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateCustomReportFilterResponse>(
                service, METHODID_UPDATE_CUSTOM_REPORT_FILTER)))
        .addMethod(
          getDeleteCustomReportFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterRequest,
              com.tcn.cloud.api.api.v0alpha.DeleteCustomReportFilterResponse>(
                service, METHODID_DELETE_CUSTOM_REPORT_FILTER)))
        .addMethod(
          getListAgentResponseGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsRequest,
              com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse>(
                service, METHODID_LIST_AGENT_RESPONSE_GROUPS)))
        .addMethod(
          getListLastTemplateElementsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsRequest,
              com.tcn.cloud.api.api.v0alpha.ListLastTemplateElementsResponse>(
                service, METHODID_LIST_LAST_TEMPLATE_ELEMENTS)))
        .addMethod(
          getListQueueConfigsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListQueueConfigsReq,
              com.tcn.cloud.api.api.v0alpha.ListQueueConfigsRes>(
                service, METHODID_LIST_QUEUE_CONFIGS)))
        .addMethod(
          getDeleteQueueConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigReq,
              com.tcn.cloud.api.api.v0alpha.DeleteQueueConfigRes>(
                service, METHODID_DELETE_QUEUE_CONFIG)))
        .addMethod(
          getGetQueueConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetQueueConfigReq,
              com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes>(
                service, METHODID_GET_QUEUE_CONFIG)))
        .addMethod(
          getCreateQueueConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateQueueConfigReq,
              com.tcn.cloud.api.api.v0alpha.CreateQueueConfigRes>(
                service, METHODID_CREATE_QUEUE_CONFIG)))
        .addMethod(
          getUpdateQueueConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigReq,
              com.tcn.cloud.api.api.v0alpha.UpdateQueueConfigRes>(
                service, METHODID_UPDATE_QUEUE_CONFIG)))
        .addMethod(
          getCopyQueueConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq,
              com.tcn.cloud.api.api.v0alpha.CopyQueueConfigRes>(
                service, METHODID_COPY_QUEUE_CONFIG)))
        .addMethod(
          getGetAllQueueConfigSoundsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsReq,
              com.tcn.cloud.api.api.v0alpha.GetAllQueueConfigSoundsRes>(
                service, METHODID_GET_ALL_QUEUE_CONFIG_SOUNDS)))
        .addMethod(
          getGetQueueConfigSoundMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundReq,
              com.tcn.cloud.api.api.v0alpha.GetQueueConfigSoundRes>(
                service, METHODID_GET_QUEUE_CONFIG_SOUND)))
        .addMethod(
          getSetQueueConfigSoundMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundReq,
              com.tcn.cloud.api.api.v0alpha.SetQueueConfigSoundRes>(
                service, METHODID_SET_QUEUE_CONFIG_SOUND)))
        .addMethod(
          getSetAllQueueConfigSoundsFromSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceReq,
              com.tcn.cloud.api.api.v0alpha.SetAllQueueConfigSoundsFromSourceRes>(
                service, METHODID_SET_ALL_QUEUE_CONFIG_SOUNDS_FROM_SOURCE)))
        .addMethod(
          getGetUserBlockedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetUserBlockedRequest,
              com.tcn.cloud.api.api.v0alpha.GetUserBlockedResponse>(
                service, METHODID_GET_USER_BLOCKED)))
        .addMethod(
          getUnblockUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UnblockUserRequest,
              com.tcn.cloud.api.api.v0alpha.UnblockUserResponse>(
                service, METHODID_UNBLOCK_USER)))
        .addMethod(
          getListP3UnMigratedUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersRequest,
              com.tcn.cloud.api.api.v0alpha.ListP3UnMigratedUsersResponse>(
                service, METHODID_LIST_P3UN_MIGRATED_USERS)))
        .addMethod(
          getMigrateP3UserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.MigrateP3UserRequest,
              com.tcn.cloud.api.api.v0alpha.MigrateP3UserResponse>(
                service, METHODID_MIGRATE_P3USER)))
        .addMethod(
          getUpdateP3UserNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateP3UserNameResponse>(
                service, METHODID_UPDATE_P3USER_NAME)))
        .addMethod(
          getListOwnedUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListOwnedUsersRequest,
              com.tcn.cloud.api.api.v0alpha.ListOwnedUsersResponse>(
                service, METHODID_LIST_OWNED_USERS)))
        .addMethod(
          getListOwnedOrgsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsRequest,
              com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse>(
                service, METHODID_LIST_OWNED_ORGS)))
        .addMethod(
          getRemoveLoginStrikesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesRequest,
              com.tcn.cloud.api.api.v0alpha.RemoveLoginStrikesResponse>(
                service, METHODID_REMOVE_LOGIN_STRIKES)))
        .addMethod(
          getRemoveUserLoginStrikesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesRequest,
              com.tcn.cloud.api.api.v0alpha.RemoveUserLoginStrikesResponse>(
                service, METHODID_REMOVE_USER_LOGIN_STRIKES)))
        .addMethod(
          getListLoginHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListLoginHistoryRequest,
              com.tcn.cloud.api.api.v0alpha.ListLoginHistoryResponse>(
                service, METHODID_LIST_LOGIN_HISTORY)))
        .addMethod(
          getUpdateP3UserSidsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateP3UserSidsResponse>(
                service, METHODID_UPDATE_P3USER_SIDS)))
        .addMethod(
          getCreateAuthConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionRequest,
              com.tcn.cloud.api.api.v0alpha.CreateAuthConnectionResponse>(
                service, METHODID_CREATE_AUTH_CONNECTION)))
        .addMethod(
          getGetAuthConnectionSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsRequest,
              com.tcn.cloud.api.api.v0alpha.GetAuthConnectionSettingsResponse>(
                service, METHODID_GET_AUTH_CONNECTION_SETTINGS)))
        .addMethod(
          getUpdateAuthConnectionSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateAuthConnectionSettingsResponse>(
                service, METHODID_UPDATE_AUTH_CONNECTION_SETTINGS)))
        .addMethod(
          getDeleteAuthConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionRequest,
              com.tcn.cloud.api.api.v0alpha.DeleteAuthConnectionResponse>(
                service, METHODID_DELETE_AUTH_CONNECTION)))
        .addMethod(
          getGetUserSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionRequest,
              com.tcn.cloud.api.api.v0alpha.GetUserSubscriptionResponse>(
                service, METHODID_GET_USER_SUBSCRIPTION)))
        .addMethod(
          getAddUserSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionRequest,
              com.tcn.cloud.api.api.v0alpha.AddUserSubscriptionResponse>(
                service, METHODID_ADD_USER_SUBSCRIPTION)))
        .addMethod(
          getRemoveUserSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionRequest,
              com.tcn.cloud.api.api.v0alpha.RemoveUserSubscriptionResponse>(
                service, METHODID_REMOVE_USER_SUBSCRIPTION)))
        .addMethod(
          getUpdateUserSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateUserSubscriptionResponse>(
                service, METHODID_UPDATE_USER_SUBSCRIPTION)))
        .addMethod(
          getListUserSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsRequest,
              com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse>(
                service, METHODID_LIST_USER_SUBSCRIPTIONS)))
        .addMethod(
          getListOrgSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsRequest,
              com.tcn.cloud.api.api.v0alpha.ListOrgSubscriptionsResponse>(
                service, METHODID_LIST_ORG_SUBSCRIPTIONS)))
        .addMethod(
          getGetSystemEnvironmentDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsRequest,
              com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse>(
                service, METHODID_GET_SYSTEM_ENVIRONMENT_DETAILS)))
        .addMethod(
          getListAgentStatisticsTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesRequest,
              com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsTemplatesResponse>(
                service, METHODID_LIST_AGENT_STATISTICS_TEMPLATES)))
        .addMethod(
          getCreateAgentStatisticsTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.CreateAgentStatisticsTemplateResponse>(
                service, METHODID_CREATE_AGENT_STATISTICS_TEMPLATE)))
        .addMethod(
          getUpdateAgentStatisticsTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.UpdateAgentStatisticsTemplateResponse>(
                service, METHODID_UPDATE_AGENT_STATISTICS_TEMPLATE)))
        .addMethod(
          getDeleteAgentStatisticsTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateRequest,
              com.tcn.cloud.api.api.v0alpha.DeleteAgentStatisticsTemplateResponse>(
                service, METHODID_DELETE_AGENT_STATISTICS_TEMPLATE)))
        .build();
  }

  private static abstract class OrgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.getDescriptor();
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
              .addMethod(getRegisterOrganizationMethod())
              .addMethod(getConvertOrgToManualMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getArchiveOrganizationMethod())
              .addMethod(getUnArchiveOrganizationMethod())
              .addMethod(getListArchivedOrganizationsMethod())
              .addMethod(getGetOrganizationProfileMethod())
              .addMethod(getGetOrganizationProfileByIdMethod())
              .addMethod(getListOrganizationDescriptionsMethod())
              .addMethod(getListRegionalOrganizationsMethod())
              .addMethod(getUpdateP3OwningOrgMethod())
              .addMethod(getGetP3OwningOrgMethod())
              .addMethod(getListOrganizationUserDescriptionsMethod())
              .addMethod(getListUserDescriptionsMethod())
              .addMethod(getGetUserDirectoryMethod())
              .addMethod(getGetRegionsMethod())
              .addMethod(getGetUserDetailsMethod())
              .addMethod(getAdminGetUserDetailsMethod())
              .addMethod(getGetAgentUsersMethod())
              .addMethod(getGetAgentSettingsMethod())
              .addMethod(getGetAgentProfileGroupMethod())
              .addMethod(getUpdateAgentProfileGroupMethod())
              .addMethod(getCreateAgentProfileGroupMethod())
              .addMethod(getListAgentProfileGroupsMethod())
              .addMethod(getDeleteAgentProfileGroupMethod())
              .addMethod(getAssignAgentProfileGroupsMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getCreateDelegatedUserMethod())
              .addMethod(getUpdateUserPasswordMethod())
              .addMethod(getResetUserRequirePasswordResetMethod())
              .addMethod(getGetUserPasswordResetLinkMethod())
              .addMethod(getGetUserEmailVerifiedMethod())
              .addMethod(getSendUserVerificationEmailMethod())
              .addMethod(getManualUserEmailVerificationMethod())
              .addMethod(getGetTempUserTokenMethod())
              .addMethod(getGetCountriesListMethod())
              .addMethod(getGetAdminClientPreferencesMethod())
              .addMethod(getUpdateAdminClientPreferencesMethod())
              .addMethod(getGetPermissionsMethod())
              .addMethod(getRevokeAccountOwnerPermissionFromUserMethod())
              .addMethod(getUpdateUserDisabledMethod())
              .addMethod(getUpdateBulkUsersDisabledMethod())
              .addMethod(getGetOrgBillingSettingsMethod())
              .addMethod(getSetOrgBillingSettingsMethod())
              .addMethod(getAddOrgBillingOverrideMethod())
              .addMethod(getRemoveOrgBillingOverrideMethod())
              .addMethod(getGetSystemDefaultBillingRatesMethod())
              .addMethod(getListPermissionGroupsMethod())
              .addMethod(getCreatePermissionGroupMethod())
              .addMethod(getUpdatePermissionGroupMethod())
              .addMethod(getDeletePermissionGroupMethod())
              .addMethod(getAssignUserToAccountOwnerPermissionGroupMethod())
              .addMethod(getAssignUserPermissionGroupMethod())
              .addMethod(getAssignUsersPermissionGroupMethod())
              .addMethod(getUpdateUserNeoPermissionGroupsMethod())
              .addMethod(getRevokeUserPermissionGroupMethod())
              .addMethod(getRevokeUsersPermissionGroupMethod())
              .addMethod(getInitDefaultPermissionGroupsMethod())
              .addMethod(getAddPermissionToAccountOwnerPermissionGroupMethod())
              .addMethod(getRevokePermissionToAccountOwnerPermissionGroupMethod())
              .addMethod(getAddPermissionToOrgDefaultGroupMethod())
              .addMethod(getRemovePermissionFromOrgDefaultGroupMethod())
              .addMethod(getGetOrgDefaultSuperUserGroupMethod())
              .addMethod(getListP3PermissionGroupsMethod())
              .addMethod(getAddUserRegionMethod())
              .addMethod(getRemoveUserRegionMethod())
              .addMethod(getCreateP3PermissionGroupMethod())
              .addMethod(getUpdateP3PermissionGroupMethod())
              .addMethod(getDeleteP3PermissionGroupMethod())
              .addMethod(getAssignUsersP3PermissionGroupMethod())
              .addMethod(getAddLoginToUserMethod())
              .addMethod(getRevokeUsersP3PermissionGroupMethod())
              .addMethod(getGetContactPreferencesMethod())
              .addMethod(getUpdateContactPreferencesMethod())
              .addMethod(getGetCompliancePreferencesMethod())
              .addMethod(getUpdateCompliancePreferencesMethod())
              .addMethod(getGetAgentPreferencesMethod())
              .addMethod(getUpdateAgentPreferencesMethod())
              .addMethod(getGetOrganizationPreferencesMethod())
              .addMethod(getUpdateOrganizationPreferencesMethod())
              .addMethod(getGetSchedulePreferencesMethod())
              .addMethod(getUpdateSchedulePreferencesMethod())
              .addMethod(getGetBusinessPreferencesMethod())
              .addMethod(getUpdateBusinessPreferencesMethod())
              .addMethod(getGetEndOfDayPreferencesMethod())
              .addMethod(getUpdateEndOfDayPreferencesMethod())
              .addMethod(getGetReportFilterPreferencesMethod())
              .addMethod(getUpdateReportFilterPreferencesMethod())
              .addMethod(getGetPhonePreferencesMethod())
              .addMethod(getUpdatePhonePreferencesMethod())
              .addMethod(getGetDashboardGeneralPreferencesMethod())
              .addMethod(getUpdateDashboardGeneralPreferencesMethod())
              .addMethod(getGetWebhookPreferencesMethod())
              .addMethod(getUpdateWebhookPreferencesMethod())
              .addMethod(getGetBroadcastPreferencesMethod())
              .addMethod(getUpdateBroadcastPreferencesMethod())
              .addMethod(getGetAuthenticationPreferencesMethod())
              .addMethod(getUpdateAuthenticationPreferencesMethod())
              .addMethod(getGetRecordingPreferencesMethod())
              .addMethod(getUpdateRecordingPreferencesMethod())
              .addMethod(getGetDashboardQueuePreferencesMethod())
              .addMethod(getUpdateDashboardQueuePreferencesMethod())
              .addMethod(getGetAgentQuickViewPreferencesMethod())
              .addMethod(getGetVoiceAnalyticsPreferencesMethod())
              .addMethod(getUpdateVoiceAnalyticsPreferencesMethod())
              .addMethod(getGetScorecardsPreferencesMethod())
              .addMethod(getUpdateScorecardsPreferencesMethod())
              .addMethod(getGetEmailSmsPreferencesMethod())
              .addMethod(getUpdateEmailSmsPreferencesMethod())
              .addMethod(getEditAgentQuickViewPreferencesMethod())
              .addMethod(getEditBackofficeThemePreferenceMethod())
              .addMethod(getGetBackofficeThemePreferenceMethod())
              .addMethod(getAcceptLinkbackRecordingTermsMethod())
              .addMethod(getLinkbackUpdateBroadcastTemplatesMethod())
              .addMethod(getRecordEmailUnsubscribeAcknowledgementMethod())
              .addMethod(getClearEmailUnsubscribeAcknowledgementMethod())
              .addMethod(getCreateWebLinkTemplateMethod())
              .addMethod(getListWebLinkTemplatesMethod())
              .addMethod(getGetWebLinkTemplateMethod())
              .addMethod(getUpdateWebLinkTemplateMethod())
              .addMethod(getDeleteWebLinkTemplateMethod())
              .addMethod(getCreateAgentTriggerTemplateMethod())
              .addMethod(getListAgentTriggerTemplatesMethod())
              .addMethod(getGetAgentTriggerTemplateMethod())
              .addMethod(getUpdateAgentTriggerTemplateMethod())
              .addMethod(getDeleteAgentTriggerTemplateMethod())
              .addMethod(getCreateClientInfoDisplayTemplateMethod())
              .addMethod(getListClientInfoDisplayTemplatesMethod())
              .addMethod(getUpdateClientInfoDisplayTemplateMethod())
              .addMethod(getDeleteClientInfoDisplayTemplateMethod())
              .addMethod(getGetClientInfoDisplayTemplateMethod())
              .addMethod(getListAgentPauseCodesMethod())
              .addMethod(getCreateAgentPauseCodeMethod())
              .addMethod(getUpdateAgentPauseCodeMethod())
              .addMethod(getDeleteAgentPauseCodeMethod())
              .addMethod(getListCustomReportFiltersMethod())
              .addMethod(getCreateCustomReportFilterMethod())
              .addMethod(getUpdateCustomReportFilterMethod())
              .addMethod(getDeleteCustomReportFilterMethod())
              .addMethod(getListAgentResponseGroupsMethod())
              .addMethod(getListLastTemplateElementsMethod())
              .addMethod(getListQueueConfigsMethod())
              .addMethod(getDeleteQueueConfigMethod())
              .addMethod(getGetQueueConfigMethod())
              .addMethod(getCreateQueueConfigMethod())
              .addMethod(getUpdateQueueConfigMethod())
              .addMethod(getCopyQueueConfigMethod())
              .addMethod(getGetAllQueueConfigSoundsMethod())
              .addMethod(getGetQueueConfigSoundMethod())
              .addMethod(getSetQueueConfigSoundMethod())
              .addMethod(getSetAllQueueConfigSoundsFromSourceMethod())
              .addMethod(getGetUserBlockedMethod())
              .addMethod(getUnblockUserMethod())
              .addMethod(getListP3UnMigratedUsersMethod())
              .addMethod(getMigrateP3UserMethod())
              .addMethod(getUpdateP3UserNameMethod())
              .addMethod(getListOwnedUsersMethod())
              .addMethod(getListOwnedOrgsMethod())
              .addMethod(getRemoveLoginStrikesMethod())
              .addMethod(getRemoveUserLoginStrikesMethod())
              .addMethod(getListLoginHistoryMethod())
              .addMethod(getUpdateP3UserSidsMethod())
              .addMethod(getCreateAuthConnectionMethod())
              .addMethod(getGetAuthConnectionSettingsMethod())
              .addMethod(getUpdateAuthConnectionSettingsMethod())
              .addMethod(getDeleteAuthConnectionMethod())
              .addMethod(getGetUserSubscriptionMethod())
              .addMethod(getAddUserSubscriptionMethod())
              .addMethod(getRemoveUserSubscriptionMethod())
              .addMethod(getUpdateUserSubscriptionMethod())
              .addMethod(getListUserSubscriptionsMethod())
              .addMethod(getListOrgSubscriptionsMethod())
              .addMethod(getGetSystemEnvironmentDetailsMethod())
              .addMethod(getListAgentStatisticsTemplatesMethod())
              .addMethod(getCreateAgentStatisticsTemplateMethod())
              .addMethod(getUpdateAgentStatisticsTemplateMethod())
              .addMethod(getDeleteAgentStatisticsTemplateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
