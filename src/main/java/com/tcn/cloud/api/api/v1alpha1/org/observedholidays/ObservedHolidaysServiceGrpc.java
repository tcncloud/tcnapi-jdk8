package com.tcn.cloud.api.api.v1alpha1.org.observedholidays;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/observedholidays/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ObservedHolidaysServiceGrpc {

  private ObservedHolidaysServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.observedholidays.ObservedHolidaysService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse> getListObservedHolidaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListObservedHolidays",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse> getListObservedHolidaysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse> getListObservedHolidaysMethod;
    if ((getListObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getListObservedHolidaysMethod) == null) {
      synchronized (ObservedHolidaysServiceGrpc.class) {
        if ((getListObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getListObservedHolidaysMethod) == null) {
          ObservedHolidaysServiceGrpc.getListObservedHolidaysMethod = getListObservedHolidaysMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListObservedHolidays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObservedHolidaysServiceMethodDescriptorSupplier("ListObservedHolidays"))
              .build();
        }
      }
    }
    return getListObservedHolidaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse> getGetObservedHolidaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObservedHolidays",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse> getGetObservedHolidaysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse> getGetObservedHolidaysMethod;
    if ((getGetObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getGetObservedHolidaysMethod) == null) {
      synchronized (ObservedHolidaysServiceGrpc.class) {
        if ((getGetObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getGetObservedHolidaysMethod) == null) {
          ObservedHolidaysServiceGrpc.getGetObservedHolidaysMethod = getGetObservedHolidaysMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObservedHolidays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObservedHolidaysServiceMethodDescriptorSupplier("GetObservedHolidays"))
              .build();
        }
      }
    }
    return getGetObservedHolidaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse> getSetObservedHolidaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetObservedHolidays",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse> getSetObservedHolidaysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse> getSetObservedHolidaysMethod;
    if ((getSetObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getSetObservedHolidaysMethod) == null) {
      synchronized (ObservedHolidaysServiceGrpc.class) {
        if ((getSetObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getSetObservedHolidaysMethod) == null) {
          ObservedHolidaysServiceGrpc.getSetObservedHolidaysMethod = getSetObservedHolidaysMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetObservedHolidays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObservedHolidaysServiceMethodDescriptorSupplier("SetObservedHolidays"))
              .build();
        }
      }
    }
    return getSetObservedHolidaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse> getAddToObservedHolidaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToObservedHolidays",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse> getAddToObservedHolidaysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse> getAddToObservedHolidaysMethod;
    if ((getAddToObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getAddToObservedHolidaysMethod) == null) {
      synchronized (ObservedHolidaysServiceGrpc.class) {
        if ((getAddToObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getAddToObservedHolidaysMethod) == null) {
          ObservedHolidaysServiceGrpc.getAddToObservedHolidaysMethod = getAddToObservedHolidaysMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToObservedHolidays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObservedHolidaysServiceMethodDescriptorSupplier("AddToObservedHolidays"))
              .build();
        }
      }
    }
    return getAddToObservedHolidaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse> getRemoveObservedHolidaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveObservedHolidays",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse> getRemoveObservedHolidaysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse> getRemoveObservedHolidaysMethod;
    if ((getRemoveObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getRemoveObservedHolidaysMethod) == null) {
      synchronized (ObservedHolidaysServiceGrpc.class) {
        if ((getRemoveObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getRemoveObservedHolidaysMethod) == null) {
          ObservedHolidaysServiceGrpc.getRemoveObservedHolidaysMethod = getRemoveObservedHolidaysMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveObservedHolidays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObservedHolidaysServiceMethodDescriptorSupplier("RemoveObservedHolidays"))
              .build();
        }
      }
    }
    return getRemoveObservedHolidaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse> getUpdateObservedHolidaysInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObservedHolidaysInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse> getUpdateObservedHolidaysInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse> getUpdateObservedHolidaysInfoMethod;
    if ((getUpdateObservedHolidaysInfoMethod = ObservedHolidaysServiceGrpc.getUpdateObservedHolidaysInfoMethod) == null) {
      synchronized (ObservedHolidaysServiceGrpc.class) {
        if ((getUpdateObservedHolidaysInfoMethod = ObservedHolidaysServiceGrpc.getUpdateObservedHolidaysInfoMethod) == null) {
          ObservedHolidaysServiceGrpc.getUpdateObservedHolidaysInfoMethod = getUpdateObservedHolidaysInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObservedHolidaysInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObservedHolidaysServiceMethodDescriptorSupplier("UpdateObservedHolidaysInfo"))
              .build();
        }
      }
    }
    return getUpdateObservedHolidaysInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse> getDeleteObservedHolidaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObservedHolidays",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse> getDeleteObservedHolidaysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse> getDeleteObservedHolidaysMethod;
    if ((getDeleteObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getDeleteObservedHolidaysMethod) == null) {
      synchronized (ObservedHolidaysServiceGrpc.class) {
        if ((getDeleteObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getDeleteObservedHolidaysMethod) == null) {
          ObservedHolidaysServiceGrpc.getDeleteObservedHolidaysMethod = getDeleteObservedHolidaysMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObservedHolidays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObservedHolidaysServiceMethodDescriptorSupplier("DeleteObservedHolidays"))
              .build();
        }
      }
    }
    return getDeleteObservedHolidaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse> getEvaluateObservedHolidaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EvaluateObservedHolidays",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest,
      com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse> getEvaluateObservedHolidaysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse> getEvaluateObservedHolidaysMethod;
    if ((getEvaluateObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getEvaluateObservedHolidaysMethod) == null) {
      synchronized (ObservedHolidaysServiceGrpc.class) {
        if ((getEvaluateObservedHolidaysMethod = ObservedHolidaysServiceGrpc.getEvaluateObservedHolidaysMethod) == null) {
          ObservedHolidaysServiceGrpc.getEvaluateObservedHolidaysMethod = getEvaluateObservedHolidaysMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest, com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EvaluateObservedHolidays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObservedHolidaysServiceMethodDescriptorSupplier("EvaluateObservedHolidays"))
              .build();
        }
      }
    }
    return getEvaluateObservedHolidaysMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObservedHolidaysServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObservedHolidaysServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObservedHolidaysServiceStub>() {
        @java.lang.Override
        public ObservedHolidaysServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObservedHolidaysServiceStub(channel, callOptions);
        }
      };
    return ObservedHolidaysServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObservedHolidaysServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObservedHolidaysServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObservedHolidaysServiceBlockingStub>() {
        @java.lang.Override
        public ObservedHolidaysServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObservedHolidaysServiceBlockingStub(channel, callOptions);
        }
      };
    return ObservedHolidaysServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObservedHolidaysServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObservedHolidaysServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObservedHolidaysServiceFutureStub>() {
        @java.lang.Override
        public ObservedHolidaysServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObservedHolidaysServiceFutureStub(channel, callOptions);
        }
      };
    return ObservedHolidaysServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListObservedHolidays returns all ObservedHolidays for an Org.
     * </pre>
     */
    default void listObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListObservedHolidaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObservedHolidays returns the ObservedHolidays for the ID.
     * </pre>
     */
    default void getObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObservedHolidaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetObservedHolidays creates a new ObservedHolidays for an Org.
     * </pre>
     */
    default void setObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetObservedHolidaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddToObservedHolidays adds a new ObservedHolidays for an Org.
     * </pre>
     */
    default void addToObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToObservedHolidaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveObservedHolidays removes an existing ObservedHolidays from an Org.
     * </pre>
     */
    default void removeObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveObservedHolidaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateObservedHolidaysInfo updates the general info for a specified ObservedHolidays.
     * </pre>
     */
    default void updateObservedHolidaysInfo(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObservedHolidaysInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteObservedHolidays deletes an existing ObservedHolidays.
     * </pre>
     */
    default void deleteObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObservedHolidaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * EvaluateObservedHolidays evaluates the ObservedHolidays.
     * </pre>
     */
    default void evaluateObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEvaluateObservedHolidaysMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ObservedHolidaysService.
   */
  public static abstract class ObservedHolidaysServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ObservedHolidaysServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ObservedHolidaysService.
   */
  public static final class ObservedHolidaysServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ObservedHolidaysServiceStub> {
    private ObservedHolidaysServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObservedHolidaysServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObservedHolidaysServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListObservedHolidays returns all ObservedHolidays for an Org.
     * </pre>
     */
    public void listObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListObservedHolidaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObservedHolidays returns the ObservedHolidays for the ID.
     * </pre>
     */
    public void getObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObservedHolidaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetObservedHolidays creates a new ObservedHolidays for an Org.
     * </pre>
     */
    public void setObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetObservedHolidaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddToObservedHolidays adds a new ObservedHolidays for an Org.
     * </pre>
     */
    public void addToObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToObservedHolidaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveObservedHolidays removes an existing ObservedHolidays from an Org.
     * </pre>
     */
    public void removeObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveObservedHolidaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateObservedHolidaysInfo updates the general info for a specified ObservedHolidays.
     * </pre>
     */
    public void updateObservedHolidaysInfo(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObservedHolidaysInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteObservedHolidays deletes an existing ObservedHolidays.
     * </pre>
     */
    public void deleteObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObservedHolidaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EvaluateObservedHolidays evaluates the ObservedHolidays.
     * </pre>
     */
    public void evaluateObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEvaluateObservedHolidaysMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ObservedHolidaysService.
   */
  public static final class ObservedHolidaysServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ObservedHolidaysServiceBlockingStub> {
    private ObservedHolidaysServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObservedHolidaysServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObservedHolidaysServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListObservedHolidays returns all ObservedHolidays for an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse listObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListObservedHolidaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObservedHolidays returns the ObservedHolidays for the ID.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse getObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObservedHolidaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetObservedHolidays creates a new ObservedHolidays for an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse setObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetObservedHolidaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddToObservedHolidays adds a new ObservedHolidays for an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse addToObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToObservedHolidaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveObservedHolidays removes an existing ObservedHolidays from an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse removeObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveObservedHolidaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateObservedHolidaysInfo updates the general info for a specified ObservedHolidays.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse updateObservedHolidaysInfo(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObservedHolidaysInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteObservedHolidays deletes an existing ObservedHolidays.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse deleteObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObservedHolidaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EvaluateObservedHolidays evaluates the ObservedHolidays.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse evaluateObservedHolidays(com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEvaluateObservedHolidaysMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ObservedHolidaysService.
   */
  public static final class ObservedHolidaysServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ObservedHolidaysServiceFutureStub> {
    private ObservedHolidaysServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObservedHolidaysServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObservedHolidaysServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListObservedHolidays returns all ObservedHolidays for an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse> listObservedHolidays(
        com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListObservedHolidaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObservedHolidays returns the ObservedHolidays for the ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse> getObservedHolidays(
        com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObservedHolidaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetObservedHolidays creates a new ObservedHolidays for an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse> setObservedHolidays(
        com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetObservedHolidaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddToObservedHolidays adds a new ObservedHolidays for an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse> addToObservedHolidays(
        com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToObservedHolidaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveObservedHolidays removes an existing ObservedHolidays from an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse> removeObservedHolidays(
        com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveObservedHolidaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateObservedHolidaysInfo updates the general info for a specified ObservedHolidays.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse> updateObservedHolidaysInfo(
        com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObservedHolidaysInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteObservedHolidays deletes an existing ObservedHolidays.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse> deleteObservedHolidays(
        com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObservedHolidaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EvaluateObservedHolidays evaluates the ObservedHolidays.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse> evaluateObservedHolidays(
        com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEvaluateObservedHolidaysMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_OBSERVED_HOLIDAYS = 0;
  private static final int METHODID_GET_OBSERVED_HOLIDAYS = 1;
  private static final int METHODID_SET_OBSERVED_HOLIDAYS = 2;
  private static final int METHODID_ADD_TO_OBSERVED_HOLIDAYS = 3;
  private static final int METHODID_REMOVE_OBSERVED_HOLIDAYS = 4;
  private static final int METHODID_UPDATE_OBSERVED_HOLIDAYS_INFO = 5;
  private static final int METHODID_DELETE_OBSERVED_HOLIDAYS = 6;
  private static final int METHODID_EVALUATE_OBSERVED_HOLIDAYS = 7;

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
        case METHODID_LIST_OBSERVED_HOLIDAYS:
          serviceImpl.listObservedHolidays((com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse>) responseObserver);
          break;
        case METHODID_GET_OBSERVED_HOLIDAYS:
          serviceImpl.getObservedHolidays((com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse>) responseObserver);
          break;
        case METHODID_SET_OBSERVED_HOLIDAYS:
          serviceImpl.setObservedHolidays((com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_OBSERVED_HOLIDAYS:
          serviceImpl.addToObservedHolidays((com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse>) responseObserver);
          break;
        case METHODID_REMOVE_OBSERVED_HOLIDAYS:
          serviceImpl.removeObservedHolidays((com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBSERVED_HOLIDAYS_INFO:
          serviceImpl.updateObservedHolidaysInfo((com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBSERVED_HOLIDAYS:
          serviceImpl.deleteObservedHolidays((com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse>) responseObserver);
          break;
        case METHODID_EVALUATE_OBSERVED_HOLIDAYS:
          serviceImpl.evaluateObservedHolidays((com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse>) responseObserver);
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
          getListObservedHolidaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysRequest,
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ListObservedHolidaysResponse>(
                service, METHODID_LIST_OBSERVED_HOLIDAYS)))
        .addMethod(
          getGetObservedHolidaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysRequest,
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.GetObservedHolidaysResponse>(
                service, METHODID_GET_OBSERVED_HOLIDAYS)))
        .addMethod(
          getSetObservedHolidaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysRequest,
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.SetObservedHolidaysResponse>(
                service, METHODID_SET_OBSERVED_HOLIDAYS)))
        .addMethod(
          getAddToObservedHolidaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysRequest,
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.AddToObservedHolidaysResponse>(
                service, METHODID_ADD_TO_OBSERVED_HOLIDAYS)))
        .addMethod(
          getRemoveObservedHolidaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysRequest,
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.RemoveFromObservedHolidaysResponse>(
                service, METHODID_REMOVE_OBSERVED_HOLIDAYS)))
        .addMethod(
          getUpdateObservedHolidaysInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.UpdateObservedHolidaysInfoResponse>(
                service, METHODID_UPDATE_OBSERVED_HOLIDAYS_INFO)))
        .addMethod(
          getDeleteObservedHolidaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysRequest,
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.DeleteObservedHolidaysResponse>(
                service, METHODID_DELETE_OBSERVED_HOLIDAYS)))
        .addMethod(
          getEvaluateObservedHolidaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysRequest,
              com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EvaluateObservedHolidaysResponse>(
                service, METHODID_EVALUATE_OBSERVED_HOLIDAYS)))
        .build();
  }

  private static abstract class ObservedHolidaysServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObservedHolidaysServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.observedholidays.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ObservedHolidaysService");
    }
  }

  private static final class ObservedHolidaysServiceFileDescriptorSupplier
      extends ObservedHolidaysServiceBaseDescriptorSupplier {
    ObservedHolidaysServiceFileDescriptorSupplier() {}
  }

  private static final class ObservedHolidaysServiceMethodDescriptorSupplier
      extends ObservedHolidaysServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ObservedHolidaysServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ObservedHolidaysServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObservedHolidaysServiceFileDescriptorSupplier())
              .addMethod(getListObservedHolidaysMethod())
              .addMethod(getGetObservedHolidaysMethod())
              .addMethod(getSetObservedHolidaysMethod())
              .addMethod(getAddToObservedHolidaysMethod())
              .addMethod(getRemoveObservedHolidaysMethod())
              .addMethod(getUpdateObservedHolidaysInfoMethod())
              .addMethod(getDeleteObservedHolidaysMethod())
              .addMethod(getEvaluateObservedHolidaysMethod())
              .build();
        }
      }
    }
    return result;
  }
}
