package com.tcn.cloud.api.api.v1alpha1.org.businesshours;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/businesshours/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BusinessHoursServiceGrpc {

  private BusinessHoursServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.businesshours.BusinessHoursService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse> getGetBusinessHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBusinessHours",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse> getGetBusinessHoursMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse> getGetBusinessHoursMethod;
    if ((getGetBusinessHoursMethod = BusinessHoursServiceGrpc.getGetBusinessHoursMethod) == null) {
      synchronized (BusinessHoursServiceGrpc.class) {
        if ((getGetBusinessHoursMethod = BusinessHoursServiceGrpc.getGetBusinessHoursMethod) == null) {
          BusinessHoursServiceGrpc.getGetBusinessHoursMethod = getGetBusinessHoursMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBusinessHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessHoursServiceMethodDescriptorSupplier("GetBusinessHours"))
              .build();
        }
      }
    }
    return getGetBusinessHoursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse> getSetBusinessHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetBusinessHours",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse> getSetBusinessHoursMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse> getSetBusinessHoursMethod;
    if ((getSetBusinessHoursMethod = BusinessHoursServiceGrpc.getSetBusinessHoursMethod) == null) {
      synchronized (BusinessHoursServiceGrpc.class) {
        if ((getSetBusinessHoursMethod = BusinessHoursServiceGrpc.getSetBusinessHoursMethod) == null) {
          BusinessHoursServiceGrpc.getSetBusinessHoursMethod = getSetBusinessHoursMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetBusinessHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessHoursServiceMethodDescriptorSupplier("SetBusinessHours"))
              .build();
        }
      }
    }
    return getSetBusinessHoursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse> getAddIntervalToBusinessHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddIntervalToBusinessHours",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse> getAddIntervalToBusinessHoursMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse> getAddIntervalToBusinessHoursMethod;
    if ((getAddIntervalToBusinessHoursMethod = BusinessHoursServiceGrpc.getAddIntervalToBusinessHoursMethod) == null) {
      synchronized (BusinessHoursServiceGrpc.class) {
        if ((getAddIntervalToBusinessHoursMethod = BusinessHoursServiceGrpc.getAddIntervalToBusinessHoursMethod) == null) {
          BusinessHoursServiceGrpc.getAddIntervalToBusinessHoursMethod = getAddIntervalToBusinessHoursMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddIntervalToBusinessHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessHoursServiceMethodDescriptorSupplier("AddIntervalToBusinessHours"))
              .build();
        }
      }
    }
    return getAddIntervalToBusinessHoursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse> getRemoveIntervalFromBusinessHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveIntervalFromBusinessHours",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse> getRemoveIntervalFromBusinessHoursMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse> getRemoveIntervalFromBusinessHoursMethod;
    if ((getRemoveIntervalFromBusinessHoursMethod = BusinessHoursServiceGrpc.getRemoveIntervalFromBusinessHoursMethod) == null) {
      synchronized (BusinessHoursServiceGrpc.class) {
        if ((getRemoveIntervalFromBusinessHoursMethod = BusinessHoursServiceGrpc.getRemoveIntervalFromBusinessHoursMethod) == null) {
          BusinessHoursServiceGrpc.getRemoveIntervalFromBusinessHoursMethod = getRemoveIntervalFromBusinessHoursMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveIntervalFromBusinessHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessHoursServiceMethodDescriptorSupplier("RemoveIntervalFromBusinessHours"))
              .build();
        }
      }
    }
    return getRemoveIntervalFromBusinessHoursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse> getUpdateBusinessHoursInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBusinessHoursInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse> getUpdateBusinessHoursInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse> getUpdateBusinessHoursInfoMethod;
    if ((getUpdateBusinessHoursInfoMethod = BusinessHoursServiceGrpc.getUpdateBusinessHoursInfoMethod) == null) {
      synchronized (BusinessHoursServiceGrpc.class) {
        if ((getUpdateBusinessHoursInfoMethod = BusinessHoursServiceGrpc.getUpdateBusinessHoursInfoMethod) == null) {
          BusinessHoursServiceGrpc.getUpdateBusinessHoursInfoMethod = getUpdateBusinessHoursInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBusinessHoursInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessHoursServiceMethodDescriptorSupplier("UpdateBusinessHoursInfo"))
              .build();
        }
      }
    }
    return getUpdateBusinessHoursInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse> getDeleteBusinessHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBusinessHours",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse> getDeleteBusinessHoursMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse> getDeleteBusinessHoursMethod;
    if ((getDeleteBusinessHoursMethod = BusinessHoursServiceGrpc.getDeleteBusinessHoursMethod) == null) {
      synchronized (BusinessHoursServiceGrpc.class) {
        if ((getDeleteBusinessHoursMethod = BusinessHoursServiceGrpc.getDeleteBusinessHoursMethod) == null) {
          BusinessHoursServiceGrpc.getDeleteBusinessHoursMethod = getDeleteBusinessHoursMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBusinessHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessHoursServiceMethodDescriptorSupplier("DeleteBusinessHours"))
              .build();
        }
      }
    }
    return getDeleteBusinessHoursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse> getEvaluateBusinessHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EvaluateBusinessHours",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest,
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse> getEvaluateBusinessHoursMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse> getEvaluateBusinessHoursMethod;
    if ((getEvaluateBusinessHoursMethod = BusinessHoursServiceGrpc.getEvaluateBusinessHoursMethod) == null) {
      synchronized (BusinessHoursServiceGrpc.class) {
        if ((getEvaluateBusinessHoursMethod = BusinessHoursServiceGrpc.getEvaluateBusinessHoursMethod) == null) {
          BusinessHoursServiceGrpc.getEvaluateBusinessHoursMethod = getEvaluateBusinessHoursMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest, com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EvaluateBusinessHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessHoursServiceMethodDescriptorSupplier("EvaluateBusinessHours"))
              .build();
        }
      }
    }
    return getEvaluateBusinessHoursMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BusinessHoursServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BusinessHoursServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BusinessHoursServiceStub>() {
        @java.lang.Override
        public BusinessHoursServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BusinessHoursServiceStub(channel, callOptions);
        }
      };
    return BusinessHoursServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BusinessHoursServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BusinessHoursServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BusinessHoursServiceBlockingStub>() {
        @java.lang.Override
        public BusinessHoursServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BusinessHoursServiceBlockingStub(channel, callOptions);
        }
      };
    return BusinessHoursServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BusinessHoursServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BusinessHoursServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BusinessHoursServiceFutureStub>() {
        @java.lang.Override
        public BusinessHoursServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BusinessHoursServiceFutureStub(channel, callOptions);
        }
      };
    return BusinessHoursServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetBusinessHours returns the business hours for the ID.
     * </pre>
     */
    default void getBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBusinessHoursMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetBusinessHours initializes a business hours object
     * </pre>
     */
    default void setBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetBusinessHoursMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddIntervalToBusinessHours adds a day interval to a business hours object
     * </pre>
     */
    default void addIntervalToBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddIntervalToBusinessHoursMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveIntervalFromBusinessHours removes a day interval from a business hours object
     * </pre>
     */
    default void removeIntervalFromBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveIntervalFromBusinessHoursMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBusinessHoursInfo updates the general info of a business hours object
     * </pre>
     */
    default void updateBusinessHoursInfo(com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBusinessHoursInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteBusinessHours removes business hours.
     * </pre>
     */
    default void deleteBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBusinessHoursMethod(), responseObserver);
    }

    /**
     * <pre>
     * EvaluateBusinessHours determines whether or not the current time is within a business hours day interval
     * </pre>
     */
    default void evaluateBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEvaluateBusinessHoursMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BusinessHoursService.
   */
  public static abstract class BusinessHoursServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BusinessHoursServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BusinessHoursService.
   */
  public static final class BusinessHoursServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BusinessHoursServiceStub> {
    private BusinessHoursServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessHoursServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BusinessHoursServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetBusinessHours returns the business hours for the ID.
     * </pre>
     */
    public void getBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBusinessHoursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetBusinessHours initializes a business hours object
     * </pre>
     */
    public void setBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetBusinessHoursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddIntervalToBusinessHours adds a day interval to a business hours object
     * </pre>
     */
    public void addIntervalToBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddIntervalToBusinessHoursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveIntervalFromBusinessHours removes a day interval from a business hours object
     * </pre>
     */
    public void removeIntervalFromBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveIntervalFromBusinessHoursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBusinessHoursInfo updates the general info of a business hours object
     * </pre>
     */
    public void updateBusinessHoursInfo(com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBusinessHoursInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteBusinessHours removes business hours.
     * </pre>
     */
    public void deleteBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBusinessHoursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EvaluateBusinessHours determines whether or not the current time is within a business hours day interval
     * </pre>
     */
    public void evaluateBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEvaluateBusinessHoursMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BusinessHoursService.
   */
  public static final class BusinessHoursServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BusinessHoursServiceBlockingStub> {
    private BusinessHoursServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessHoursServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BusinessHoursServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetBusinessHours returns the business hours for the ID.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse getBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBusinessHoursMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetBusinessHours initializes a business hours object
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse setBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetBusinessHoursMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddIntervalToBusinessHours adds a day interval to a business hours object
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse addIntervalToBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddIntervalToBusinessHoursMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveIntervalFromBusinessHours removes a day interval from a business hours object
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse removeIntervalFromBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveIntervalFromBusinessHoursMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBusinessHoursInfo updates the general info of a business hours object
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse updateBusinessHoursInfo(com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBusinessHoursInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteBusinessHours removes business hours.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse deleteBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBusinessHoursMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EvaluateBusinessHours determines whether or not the current time is within a business hours day interval
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse evaluateBusinessHours(com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEvaluateBusinessHoursMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BusinessHoursService.
   */
  public static final class BusinessHoursServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BusinessHoursServiceFutureStub> {
    private BusinessHoursServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessHoursServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BusinessHoursServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetBusinessHours returns the business hours for the ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse> getBusinessHours(
        com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBusinessHoursMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetBusinessHours initializes a business hours object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse> setBusinessHours(
        com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetBusinessHoursMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddIntervalToBusinessHours adds a day interval to a business hours object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse> addIntervalToBusinessHours(
        com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddIntervalToBusinessHoursMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveIntervalFromBusinessHours removes a day interval from a business hours object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse> removeIntervalFromBusinessHours(
        com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveIntervalFromBusinessHoursMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBusinessHoursInfo updates the general info of a business hours object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse> updateBusinessHoursInfo(
        com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBusinessHoursInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteBusinessHours removes business hours.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse> deleteBusinessHours(
        com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBusinessHoursMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EvaluateBusinessHours determines whether or not the current time is within a business hours day interval
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse> evaluateBusinessHours(
        com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEvaluateBusinessHoursMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BUSINESS_HOURS = 0;
  private static final int METHODID_SET_BUSINESS_HOURS = 1;
  private static final int METHODID_ADD_INTERVAL_TO_BUSINESS_HOURS = 2;
  private static final int METHODID_REMOVE_INTERVAL_FROM_BUSINESS_HOURS = 3;
  private static final int METHODID_UPDATE_BUSINESS_HOURS_INFO = 4;
  private static final int METHODID_DELETE_BUSINESS_HOURS = 5;
  private static final int METHODID_EVALUATE_BUSINESS_HOURS = 6;

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
        case METHODID_GET_BUSINESS_HOURS:
          serviceImpl.getBusinessHours((com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse>) responseObserver);
          break;
        case METHODID_SET_BUSINESS_HOURS:
          serviceImpl.setBusinessHours((com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse>) responseObserver);
          break;
        case METHODID_ADD_INTERVAL_TO_BUSINESS_HOURS:
          serviceImpl.addIntervalToBusinessHours((com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse>) responseObserver);
          break;
        case METHODID_REMOVE_INTERVAL_FROM_BUSINESS_HOURS:
          serviceImpl.removeIntervalFromBusinessHours((com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BUSINESS_HOURS_INFO:
          serviceImpl.updateBusinessHoursInfo((com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse>) responseObserver);
          break;
        case METHODID_DELETE_BUSINESS_HOURS:
          serviceImpl.deleteBusinessHours((com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse>) responseObserver);
          break;
        case METHODID_EVALUATE_BUSINESS_HOURS:
          serviceImpl.evaluateBusinessHours((com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse>) responseObserver);
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
          getGetBusinessHoursMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursRequest,
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.GetBusinessHoursResponse>(
                service, METHODID_GET_BUSINESS_HOURS)))
        .addMethod(
          getSetBusinessHoursMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursRequest,
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.SetBusinessHoursResponse>(
                service, METHODID_SET_BUSINESS_HOURS)))
        .addMethod(
          getAddIntervalToBusinessHoursMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursRequest,
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.AddIntervalToBusinessHoursResponse>(
                service, METHODID_ADD_INTERVAL_TO_BUSINESS_HOURS)))
        .addMethod(
          getRemoveIntervalFromBusinessHoursMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursRequest,
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.RemoveIntervalFromBusinessHoursResponse>(
                service, METHODID_REMOVE_INTERVAL_FROM_BUSINESS_HOURS)))
        .addMethod(
          getUpdateBusinessHoursInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.UpdateBusinessHoursInfoResponse>(
                service, METHODID_UPDATE_BUSINESS_HOURS_INFO)))
        .addMethod(
          getDeleteBusinessHoursMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursRequest,
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.DeleteBusinessHoursResponse>(
                service, METHODID_DELETE_BUSINESS_HOURS)))
        .addMethod(
          getEvaluateBusinessHoursMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursRequest,
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse>(
                service, METHODID_EVALUATE_BUSINESS_HOURS)))
        .build();
  }

  private static abstract class BusinessHoursServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BusinessHoursServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.businesshours.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BusinessHoursService");
    }
  }

  private static final class BusinessHoursServiceFileDescriptorSupplier
      extends BusinessHoursServiceBaseDescriptorSupplier {
    BusinessHoursServiceFileDescriptorSupplier() {}
  }

  private static final class BusinessHoursServiceMethodDescriptorSupplier
      extends BusinessHoursServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BusinessHoursServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BusinessHoursServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BusinessHoursServiceFileDescriptorSupplier())
              .addMethod(getGetBusinessHoursMethod())
              .addMethod(getSetBusinessHoursMethod())
              .addMethod(getAddIntervalToBusinessHoursMethod())
              .addMethod(getRemoveIntervalFromBusinessHoursMethod())
              .addMethod(getUpdateBusinessHoursInfoMethod())
              .addMethod(getDeleteBusinessHoursMethod())
              .addMethod(getEvaluateBusinessHoursMethod())
              .build();
        }
      }
    }
    return result;
  }
}
