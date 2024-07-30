package com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ExileCertificateManagerService is the service for managing organization's exile ceritificate.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/org/exile_certificate_manager/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExileCertificateManagerServiceGrpc {

  private ExileCertificateManagerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.org.exile_certificate_manager.v1alpha1.ExileCertificateManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse> getCreateExileCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExileCertificate",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse> getCreateExileCertificateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse> getCreateExileCertificateMethod;
    if ((getCreateExileCertificateMethod = ExileCertificateManagerServiceGrpc.getCreateExileCertificateMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getCreateExileCertificateMethod = ExileCertificateManagerServiceGrpc.getCreateExileCertificateMethod) == null) {
          ExileCertificateManagerServiceGrpc.getCreateExileCertificateMethod = getCreateExileCertificateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExileCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("CreateExileCertificate"))
              .build();
        }
      }
    }
    return getCreateExileCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse> getRevokeExileCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeExileCertificate",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse> getRevokeExileCertificateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse> getRevokeExileCertificateMethod;
    if ((getRevokeExileCertificateMethod = ExileCertificateManagerServiceGrpc.getRevokeExileCertificateMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getRevokeExileCertificateMethod = ExileCertificateManagerServiceGrpc.getRevokeExileCertificateMethod) == null) {
          ExileCertificateManagerServiceGrpc.getRevokeExileCertificateMethod = getRevokeExileCertificateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeExileCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("RevokeExileCertificate"))
              .build();
        }
      }
    }
    return getRevokeExileCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse> getAssignExileConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignExileConfiguration",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse> getAssignExileConfigurationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse> getAssignExileConfigurationMethod;
    if ((getAssignExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getAssignExileConfigurationMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getAssignExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getAssignExileConfigurationMethod) == null) {
          ExileCertificateManagerServiceGrpc.getAssignExileConfigurationMethod = getAssignExileConfigurationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignExileConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("AssignExileConfiguration"))
              .build();
        }
      }
    }
    return getAssignExileConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse> getUnassignExileConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignExileConfiguration",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse> getUnassignExileConfigurationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse> getUnassignExileConfigurationMethod;
    if ((getUnassignExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getUnassignExileConfigurationMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getUnassignExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getUnassignExileConfigurationMethod) == null) {
          ExileCertificateManagerServiceGrpc.getUnassignExileConfigurationMethod = getUnassignExileConfigurationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnassignExileConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("UnassignExileConfiguration"))
              .build();
        }
      }
    }
    return getUnassignExileConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse> getListExileCertificatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExileCertificates",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse> getListExileCertificatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse> getListExileCertificatesMethod;
    if ((getListExileCertificatesMethod = ExileCertificateManagerServiceGrpc.getListExileCertificatesMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getListExileCertificatesMethod = ExileCertificateManagerServiceGrpc.getListExileCertificatesMethod) == null) {
          ExileCertificateManagerServiceGrpc.getListExileCertificatesMethod = getListExileCertificatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExileCertificates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("ListExileCertificates"))
              .build();
        }
      }
    }
    return getListExileCertificatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse> getCreateExileConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExileConfiguration",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse> getCreateExileConfigurationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse> getCreateExileConfigurationMethod;
    if ((getCreateExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getCreateExileConfigurationMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getCreateExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getCreateExileConfigurationMethod) == null) {
          ExileCertificateManagerServiceGrpc.getCreateExileConfigurationMethod = getCreateExileConfigurationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExileConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("CreateExileConfiguration"))
              .build();
        }
      }
    }
    return getCreateExileConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse> getUpdateExileConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExileConfiguration",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse> getUpdateExileConfigurationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse> getUpdateExileConfigurationMethod;
    if ((getUpdateExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getUpdateExileConfigurationMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getUpdateExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getUpdateExileConfigurationMethod) == null) {
          ExileCertificateManagerServiceGrpc.getUpdateExileConfigurationMethod = getUpdateExileConfigurationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateExileConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("UpdateExileConfiguration"))
              .build();
        }
      }
    }
    return getUpdateExileConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse> getDeleteExileConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExileConfiguration",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse> getDeleteExileConfigurationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse> getDeleteExileConfigurationMethod;
    if ((getDeleteExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getDeleteExileConfigurationMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getDeleteExileConfigurationMethod = ExileCertificateManagerServiceGrpc.getDeleteExileConfigurationMethod) == null) {
          ExileCertificateManagerServiceGrpc.getDeleteExileConfigurationMethod = getDeleteExileConfigurationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteExileConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("DeleteExileConfiguration"))
              .build();
        }
      }
    }
    return getDeleteExileConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse> getListExileConfigurationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExileConfigurations",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse> getListExileConfigurationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse> getListExileConfigurationsMethod;
    if ((getListExileConfigurationsMethod = ExileCertificateManagerServiceGrpc.getListExileConfigurationsMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getListExileConfigurationsMethod = ExileCertificateManagerServiceGrpc.getListExileConfigurationsMethod) == null) {
          ExileCertificateManagerServiceGrpc.getListExileConfigurationsMethod = getListExileConfigurationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExileConfigurations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("ListExileConfigurations"))
              .build();
        }
      }
    }
    return getListExileConfigurationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExileCertificateManagerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExileCertificateManagerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExileCertificateManagerServiceStub>() {
        @java.lang.Override
        public ExileCertificateManagerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExileCertificateManagerServiceStub(channel, callOptions);
        }
      };
    return ExileCertificateManagerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExileCertificateManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExileCertificateManagerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExileCertificateManagerServiceBlockingStub>() {
        @java.lang.Override
        public ExileCertificateManagerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExileCertificateManagerServiceBlockingStub(channel, callOptions);
        }
      };
    return ExileCertificateManagerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExileCertificateManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExileCertificateManagerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExileCertificateManagerServiceFutureStub>() {
        @java.lang.Override
        public ExileCertificateManagerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExileCertificateManagerServiceFutureStub(channel, callOptions);
        }
      };
    return ExileCertificateManagerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ExileCertificateManagerService is the service for managing organization's exile ceritificate.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateExileCertificate creates a new TLS certificate and
     * returns the exile ceritificate for the current organization.
     * </pre>
     */
    default void createExileCertificate(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExileCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeExileCertificate deletes a exile ceritificate for the current organization.
     * </pre>
     */
    default void revokeExileCertificate(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeExileCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignExileConfiguration assigns a configuration to a certificate.
     * </pre>
     */
    default void assignExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignExileConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnassignExileConfiguration unassigns a configuration from a certificate.
     * </pre>
     */
    default void unassignExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnassignExileConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListExileCertificates returns a list of exile ceritificate for the current organization.
     * </pre>
     */
    default void listExileCertificates(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExileCertificatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateExileConfiguration creates a new exile configuration for the current organization.
     * </pre>
     */
    default void createExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExileConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateExileConfiguration updates a exile configuration for the current organization.
     * </pre>
     */
    default void updateExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateExileConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteExileConfiguration deletes a exile configuration for the current organization.
     * The configuration can only be deleted if it is not assigned to any certificates.
     * </pre>
     */
    default void deleteExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteExileConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListExileConfigurations returns a list of exile configurations for the current organization.
     * </pre>
     */
    default void listExileConfigurations(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExileConfigurationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExileCertificateManagerService.
   * <pre>
   * ExileCertificateManagerService is the service for managing organization's exile ceritificate.
   * </pre>
   */
  public static abstract class ExileCertificateManagerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExileCertificateManagerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExileCertificateManagerService.
   * <pre>
   * ExileCertificateManagerService is the service for managing organization's exile ceritificate.
   * </pre>
   */
  public static final class ExileCertificateManagerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExileCertificateManagerServiceStub> {
    private ExileCertificateManagerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExileCertificateManagerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExileCertificateManagerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateExileCertificate creates a new TLS certificate and
     * returns the exile ceritificate for the current organization.
     * </pre>
     */
    public void createExileCertificate(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExileCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeExileCertificate deletes a exile ceritificate for the current organization.
     * </pre>
     */
    public void revokeExileCertificate(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeExileCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignExileConfiguration assigns a configuration to a certificate.
     * </pre>
     */
    public void assignExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignExileConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnassignExileConfiguration unassigns a configuration from a certificate.
     * </pre>
     */
    public void unassignExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnassignExileConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListExileCertificates returns a list of exile ceritificate for the current organization.
     * </pre>
     */
    public void listExileCertificates(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExileCertificatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateExileConfiguration creates a new exile configuration for the current organization.
     * </pre>
     */
    public void createExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExileConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateExileConfiguration updates a exile configuration for the current organization.
     * </pre>
     */
    public void updateExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateExileConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteExileConfiguration deletes a exile configuration for the current organization.
     * The configuration can only be deleted if it is not assigned to any certificates.
     * </pre>
     */
    public void deleteExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteExileConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListExileConfigurations returns a list of exile configurations for the current organization.
     * </pre>
     */
    public void listExileConfigurations(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExileConfigurationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExileCertificateManagerService.
   * <pre>
   * ExileCertificateManagerService is the service for managing organization's exile ceritificate.
   * </pre>
   */
  public static final class ExileCertificateManagerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExileCertificateManagerServiceBlockingStub> {
    private ExileCertificateManagerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExileCertificateManagerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExileCertificateManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateExileCertificate creates a new TLS certificate and
     * returns the exile ceritificate for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse createExileCertificate(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExileCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeExileCertificate deletes a exile ceritificate for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse revokeExileCertificate(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeExileCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignExileConfiguration assigns a configuration to a certificate.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse assignExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignExileConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnassignExileConfiguration unassigns a configuration from a certificate.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse unassignExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnassignExileConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListExileCertificates returns a list of exile ceritificate for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse listExileCertificates(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExileCertificatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateExileConfiguration creates a new exile configuration for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse createExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExileConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateExileConfiguration updates a exile configuration for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse updateExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateExileConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteExileConfiguration deletes a exile configuration for the current organization.
     * The configuration can only be deleted if it is not assigned to any certificates.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse deleteExileConfiguration(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteExileConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListExileConfigurations returns a list of exile configurations for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse listExileConfigurations(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExileConfigurationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExileCertificateManagerService.
   * <pre>
   * ExileCertificateManagerService is the service for managing organization's exile ceritificate.
   * </pre>
   */
  public static final class ExileCertificateManagerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExileCertificateManagerServiceFutureStub> {
    private ExileCertificateManagerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExileCertificateManagerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExileCertificateManagerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateExileCertificate creates a new TLS certificate and
     * returns the exile ceritificate for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse> createExileCertificate(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExileCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeExileCertificate deletes a exile ceritificate for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse> revokeExileCertificate(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeExileCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignExileConfiguration assigns a configuration to a certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse> assignExileConfiguration(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignExileConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnassignExileConfiguration unassigns a configuration from a certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse> unassignExileConfiguration(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnassignExileConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListExileCertificates returns a list of exile ceritificate for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse> listExileCertificates(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExileCertificatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateExileConfiguration creates a new exile configuration for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse> createExileConfiguration(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExileConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateExileConfiguration updates a exile configuration for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse> updateExileConfiguration(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateExileConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteExileConfiguration deletes a exile configuration for the current organization.
     * The configuration can only be deleted if it is not assigned to any certificates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse> deleteExileConfiguration(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteExileConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListExileConfigurations returns a list of exile configurations for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse> listExileConfigurations(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExileConfigurationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EXILE_CERTIFICATE = 0;
  private static final int METHODID_REVOKE_EXILE_CERTIFICATE = 1;
  private static final int METHODID_ASSIGN_EXILE_CONFIGURATION = 2;
  private static final int METHODID_UNASSIGN_EXILE_CONFIGURATION = 3;
  private static final int METHODID_LIST_EXILE_CERTIFICATES = 4;
  private static final int METHODID_CREATE_EXILE_CONFIGURATION = 5;
  private static final int METHODID_UPDATE_EXILE_CONFIGURATION = 6;
  private static final int METHODID_DELETE_EXILE_CONFIGURATION = 7;
  private static final int METHODID_LIST_EXILE_CONFIGURATIONS = 8;

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
        case METHODID_CREATE_EXILE_CERTIFICATE:
          serviceImpl.createExileCertificate((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse>) responseObserver);
          break;
        case METHODID_REVOKE_EXILE_CERTIFICATE:
          serviceImpl.revokeExileCertificate((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_EXILE_CONFIGURATION:
          serviceImpl.assignExileConfiguration((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_EXILE_CONFIGURATION:
          serviceImpl.unassignExileConfiguration((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse>) responseObserver);
          break;
        case METHODID_LIST_EXILE_CERTIFICATES:
          serviceImpl.listExileCertificates((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse>) responseObserver);
          break;
        case METHODID_CREATE_EXILE_CONFIGURATION:
          serviceImpl.createExileConfiguration((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EXILE_CONFIGURATION:
          serviceImpl.updateExileConfiguration((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse>) responseObserver);
          break;
        case METHODID_DELETE_EXILE_CONFIGURATION:
          serviceImpl.deleteExileConfiguration((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse>) responseObserver);
          break;
        case METHODID_LIST_EXILE_CONFIGURATIONS:
          serviceImpl.listExileConfigurations((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse>) responseObserver);
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
          getCreateExileCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileCertificateResponse>(
                service, METHODID_CREATE_EXILE_CERTIFICATE)))
        .addMethod(
          getRevokeExileCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateResponse>(
                service, METHODID_REVOKE_EXILE_CERTIFICATE)))
        .addMethod(
          getAssignExileConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.AssignExileConfigurationResponse>(
                service, METHODID_ASSIGN_EXILE_CONFIGURATION)))
        .addMethod(
          getUnassignExileConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UnassignExileConfigurationResponse>(
                service, METHODID_UNASSIGN_EXILE_CONFIGURATION)))
        .addMethod(
          getListExileCertificatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileCertificatesResponse>(
                service, METHODID_LIST_EXILE_CERTIFICATES)))
        .addMethod(
          getCreateExileConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse>(
                service, METHODID_CREATE_EXILE_CONFIGURATION)))
        .addMethod(
          getUpdateExileConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.UpdateExileConfigurationResponse>(
                service, METHODID_UPDATE_EXILE_CONFIGURATION)))
        .addMethod(
          getDeleteExileConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.DeleteExileConfigurationResponse>(
                service, METHODID_DELETE_EXILE_CONFIGURATION)))
        .addMethod(
          getListExileConfigurationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ListExileConfigurationsResponse>(
                service, METHODID_LIST_EXILE_CONFIGURATIONS)))
        .build();
  }

  private static abstract class ExileCertificateManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExileCertificateManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExileCertificateManagerService");
    }
  }

  private static final class ExileCertificateManagerServiceFileDescriptorSupplier
      extends ExileCertificateManagerServiceBaseDescriptorSupplier {
    ExileCertificateManagerServiceFileDescriptorSupplier() {}
  }

  private static final class ExileCertificateManagerServiceMethodDescriptorSupplier
      extends ExileCertificateManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExileCertificateManagerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExileCertificateManagerServiceFileDescriptorSupplier())
              .addMethod(getCreateExileCertificateMethod())
              .addMethod(getRevokeExileCertificateMethod())
              .addMethod(getAssignExileConfigurationMethod())
              .addMethod(getUnassignExileConfigurationMethod())
              .addMethod(getListExileCertificatesMethod())
              .addMethod(getCreateExileConfigurationMethod())
              .addMethod(getUpdateExileConfigurationMethod())
              .addMethod(getDeleteExileConfigurationMethod())
              .addMethod(getListExileConfigurationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
