package com.tcn.cloud.api.api.v1alpha1.org.labels;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/labels/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LabelsServiceGrpc {

  private LabelsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.labels.LabelsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse> getCreateLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse> getCreateLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse> getCreateLabelMethod;
    if ((getCreateLabelMethod = LabelsServiceGrpc.getCreateLabelMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getCreateLabelMethod = LabelsServiceGrpc.getCreateLabelMethod) == null) {
          LabelsServiceGrpc.getCreateLabelMethod = getCreateLabelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("CreateLabel"))
              .build();
        }
      }
    }
    return getCreateLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse> getGetLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse> getGetLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse> getGetLabelMethod;
    if ((getGetLabelMethod = LabelsServiceGrpc.getGetLabelMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getGetLabelMethod = LabelsServiceGrpc.getGetLabelMethod) == null) {
          LabelsServiceGrpc.getGetLabelMethod = getGetLabelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("GetLabel"))
              .build();
        }
      }
    }
    return getGetLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse> getUpdateLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse> getUpdateLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse> getUpdateLabelMethod;
    if ((getUpdateLabelMethod = LabelsServiceGrpc.getUpdateLabelMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getUpdateLabelMethod = LabelsServiceGrpc.getUpdateLabelMethod) == null) {
          LabelsServiceGrpc.getUpdateLabelMethod = getUpdateLabelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("UpdateLabel"))
              .build();
        }
      }
    }
    return getUpdateLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse> getListLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLabels",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse> getListLabelsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse> getListLabelsMethod;
    if ((getListLabelsMethod = LabelsServiceGrpc.getListLabelsMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getListLabelsMethod = LabelsServiceGrpc.getListLabelsMethod) == null) {
          LabelsServiceGrpc.getListLabelsMethod = getListLabelsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("ListLabels"))
              .build();
        }
      }
    }
    return getListLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse> getDeleteLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse> getDeleteLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse> getDeleteLabelMethod;
    if ((getDeleteLabelMethod = LabelsServiceGrpc.getDeleteLabelMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getDeleteLabelMethod = LabelsServiceGrpc.getDeleteLabelMethod) == null) {
          LabelsServiceGrpc.getDeleteLabelMethod = getDeleteLabelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("DeleteLabel"))
              .build();
        }
      }
    }
    return getDeleteLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse> getAttachLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttachLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse> getAttachLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse> getAttachLabelMethod;
    if ((getAttachLabelMethod = LabelsServiceGrpc.getAttachLabelMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getAttachLabelMethod = LabelsServiceGrpc.getAttachLabelMethod) == null) {
          LabelsServiceGrpc.getAttachLabelMethod = getAttachLabelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AttachLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("AttachLabel"))
              .build();
        }
      }
    }
    return getAttachLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse> getDetachLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetachLabel",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse> getDetachLabelMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse> getDetachLabelMethod;
    if ((getDetachLabelMethod = LabelsServiceGrpc.getDetachLabelMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getDetachLabelMethod = LabelsServiceGrpc.getDetachLabelMethod) == null) {
          LabelsServiceGrpc.getDetachLabelMethod = getDetachLabelMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetachLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("DetachLabel"))
              .build();
        }
      }
    }
    return getDetachLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse> getGetLabeledEntityMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLabeledEntityMap",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse> getGetLabeledEntityMapMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse> getGetLabeledEntityMapMethod;
    if ((getGetLabeledEntityMapMethod = LabelsServiceGrpc.getGetLabeledEntityMapMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getGetLabeledEntityMapMethod = LabelsServiceGrpc.getGetLabeledEntityMapMethod) == null) {
          LabelsServiceGrpc.getGetLabeledEntityMapMethod = getGetLabeledEntityMapMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLabeledEntityMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("GetLabeledEntityMap"))
              .build();
        }
      }
    }
    return getGetLabeledEntityMapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse> getAssignLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignLabels",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse> getAssignLabelsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse> getAssignLabelsMethod;
    if ((getAssignLabelsMethod = LabelsServiceGrpc.getAssignLabelsMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getAssignLabelsMethod = LabelsServiceGrpc.getAssignLabelsMethod) == null) {
          LabelsServiceGrpc.getAssignLabelsMethod = getAssignLabelsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("AssignLabels"))
              .build();
        }
      }
    }
    return getAssignLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse> getRevokeLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeLabels",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse> getRevokeLabelsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse> getRevokeLabelsMethod;
    if ((getRevokeLabelsMethod = LabelsServiceGrpc.getRevokeLabelsMethod) == null) {
      synchronized (LabelsServiceGrpc.class) {
        if ((getRevokeLabelsMethod = LabelsServiceGrpc.getRevokeLabelsMethod) == null) {
          LabelsServiceGrpc.getRevokeLabelsMethod = getRevokeLabelsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelsServiceMethodDescriptorSupplier("RevokeLabels"))
              .build();
        }
      }
    }
    return getRevokeLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LabelsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LabelsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LabelsServiceStub>() {
        @java.lang.Override
        public LabelsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LabelsServiceStub(channel, callOptions);
        }
      };
    return LabelsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LabelsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LabelsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LabelsServiceBlockingStub>() {
        @java.lang.Override
        public LabelsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LabelsServiceBlockingStub(channel, callOptions);
        }
      };
    return LabelsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LabelsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LabelsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LabelsServiceFutureStub>() {
        @java.lang.Override
        public LabelsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LabelsServiceFutureStub(channel, callOptions);
        }
      };
    return LabelsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateLabel creates a new label.
     * </pre>
     */
    default void createLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLabel gets a single label
     * </pre>
     */
    default void getLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLabel updates a single label
     * </pre>
     */
    default void updateLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListLabels lists all labels for a given organization
     * </pre>
     */
    default void listLabels(com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     *   DeleteLabel deletes a single label
     * </pre>
     */
    default void deleteLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * AttachLabel attaches a label to a given entity type
     * </pre>
     */
    default void attachLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttachLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * DetachLabel detaches a label from an entity based on an entity type
     * </pre>
     */
    default void detachLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetachLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLabeledEntityMap gives back a map of entity Id to attached labels. The Entity type is specified on the request
     * </pre>
     */
    default void getLabeledEntityMap(com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLabeledEntityMapMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignLabels assigns labels to a specific permission group
     * </pre>
     */
    default void assignLabels(com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeLabels revokes labels from a specific permission group
     * </pre>
     */
    default void revokeLabels(com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeLabelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LabelsService.
   */
  public static abstract class LabelsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LabelsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LabelsService.
   */
  public static final class LabelsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LabelsServiceStub> {
    private LabelsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LabelsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateLabel creates a new label.
     * </pre>
     */
    public void createLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLabel gets a single label
     * </pre>
     */
    public void getLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLabel updates a single label
     * </pre>
     */
    public void updateLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListLabels lists all labels for a given organization
     * </pre>
     */
    public void listLabels(com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *   DeleteLabel deletes a single label
     * </pre>
     */
    public void deleteLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AttachLabel attaches a label to a given entity type
     * </pre>
     */
    public void attachLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttachLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DetachLabel detaches a label from an entity based on an entity type
     * </pre>
     */
    public void detachLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetachLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLabeledEntityMap gives back a map of entity Id to attached labels. The Entity type is specified on the request
     * </pre>
     */
    public void getLabeledEntityMap(com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLabeledEntityMapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignLabels assigns labels to a specific permission group
     * </pre>
     */
    public void assignLabels(com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeLabels revokes labels from a specific permission group
     * </pre>
     */
    public void revokeLabels(com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LabelsService.
   */
  public static final class LabelsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LabelsServiceBlockingStub> {
    private LabelsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LabelsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateLabel creates a new label.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse createLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLabel gets a single label
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse getLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLabel updates a single label
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse updateLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListLabels lists all labels for a given organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse listLabels(com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *   DeleteLabel deletes a single label
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse deleteLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AttachLabel attaches a label to a given entity type
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse attachLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttachLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DetachLabel detaches a label from an entity based on an entity type
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse detachLabel(com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetachLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLabeledEntityMap gives back a map of entity Id to attached labels. The Entity type is specified on the request
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse getLabeledEntityMap(com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLabeledEntityMapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignLabels assigns labels to a specific permission group
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse assignLabels(com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeLabels revokes labels from a specific permission group
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse revokeLabels(com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LabelsService.
   */
  public static final class LabelsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LabelsServiceFutureStub> {
    private LabelsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LabelsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateLabel creates a new label.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse> createLabel(
        com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLabel gets a single label
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse> getLabel(
        com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLabel updates a single label
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse> updateLabel(
        com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListLabels lists all labels for a given organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse> listLabels(
        com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *   DeleteLabel deletes a single label
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse> deleteLabel(
        com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AttachLabel attaches a label to a given entity type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse> attachLabel(
        com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttachLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DetachLabel detaches a label from an entity based on an entity type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse> detachLabel(
        com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetachLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLabeledEntityMap gives back a map of entity Id to attached labels. The Entity type is specified on the request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse> getLabeledEntityMap(
        com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLabeledEntityMapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignLabels assigns labels to a specific permission group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse> assignLabels(
        com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeLabels revokes labels from a specific permission group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse> revokeLabels(
        com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LABEL = 0;
  private static final int METHODID_GET_LABEL = 1;
  private static final int METHODID_UPDATE_LABEL = 2;
  private static final int METHODID_LIST_LABELS = 3;
  private static final int METHODID_DELETE_LABEL = 4;
  private static final int METHODID_ATTACH_LABEL = 5;
  private static final int METHODID_DETACH_LABEL = 6;
  private static final int METHODID_GET_LABELED_ENTITY_MAP = 7;
  private static final int METHODID_ASSIGN_LABELS = 8;
  private static final int METHODID_REVOKE_LABELS = 9;

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
        case METHODID_CREATE_LABEL:
          serviceImpl.createLabel((com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse>) responseObserver);
          break;
        case METHODID_GET_LABEL:
          serviceImpl.getLabel((com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LABEL:
          serviceImpl.updateLabel((com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse>) responseObserver);
          break;
        case METHODID_LIST_LABELS:
          serviceImpl.listLabels((com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse>) responseObserver);
          break;
        case METHODID_DELETE_LABEL:
          serviceImpl.deleteLabel((com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse>) responseObserver);
          break;
        case METHODID_ATTACH_LABEL:
          serviceImpl.attachLabel((com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse>) responseObserver);
          break;
        case METHODID_DETACH_LABEL:
          serviceImpl.detachLabel((com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse>) responseObserver);
          break;
        case METHODID_GET_LABELED_ENTITY_MAP:
          serviceImpl.getLabeledEntityMap((com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_LABELS:
          serviceImpl.assignLabels((com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse>) responseObserver);
          break;
        case METHODID_REVOKE_LABELS:
          serviceImpl.revokeLabels((com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse>) responseObserver);
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
          getCreateLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.CreateLabelResponse>(
                service, METHODID_CREATE_LABEL)))
        .addMethod(
          getGetLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabelResponse>(
                service, METHODID_GET_LABEL)))
        .addMethod(
          getUpdateLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.UpdateLabelResponse>(
                service, METHODID_UPDATE_LABEL)))
        .addMethod(
          getListLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.ListLabelsResponse>(
                service, METHODID_LIST_LABELS)))
        .addMethod(
          getDeleteLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.DeleteLabelResponse>(
                service, METHODID_DELETE_LABEL)))
        .addMethod(
          getAttachLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.AttachLabelResponse>(
                service, METHODID_ATTACH_LABEL)))
        .addMethod(
          getDetachLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.DetachLabelResponse>(
                service, METHODID_DETACH_LABEL)))
        .addMethod(
          getGetLabeledEntityMapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.GetLabeledEntityMapResponse>(
                service, METHODID_GET_LABELED_ENTITY_MAP)))
        .addMethod(
          getAssignLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.AssignLabelsResponse>(
                service, METHODID_ASSIGN_LABELS)))
        .addMethod(
          getRevokeLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.labels.RevokeLabelsResponse>(
                service, METHODID_REVOKE_LABELS)))
        .build();
  }

  private static abstract class LabelsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LabelsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.labels.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LabelsService");
    }
  }

  private static final class LabelsServiceFileDescriptorSupplier
      extends LabelsServiceBaseDescriptorSupplier {
    LabelsServiceFileDescriptorSupplier() {}
  }

  private static final class LabelsServiceMethodDescriptorSupplier
      extends LabelsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LabelsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LabelsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LabelsServiceFileDescriptorSupplier())
              .addMethod(getCreateLabelMethod())
              .addMethod(getGetLabelMethod())
              .addMethod(getUpdateLabelMethod())
              .addMethod(getListLabelsMethod())
              .addMethod(getDeleteLabelMethod())
              .addMethod(getAttachLabelMethod())
              .addMethod(getDetachLabelMethod())
              .addMethod(getGetLabeledEntityMapMethod())
              .addMethod(getAssignLabelsMethod())
              .addMethod(getRevokeLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
