package com.tcn.cloud.api.api.v1alpha1.org.programmeddates;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/programmeddates/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProgrammedDatesServiceGrpc {

  private ProgrammedDatesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.programmeddates.ProgrammedDatesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse> getListProgrammedDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProgrammedDates",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse> getListProgrammedDatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse> getListProgrammedDatesMethod;
    if ((getListProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getListProgrammedDatesMethod) == null) {
      synchronized (ProgrammedDatesServiceGrpc.class) {
        if ((getListProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getListProgrammedDatesMethod) == null) {
          ProgrammedDatesServiceGrpc.getListProgrammedDatesMethod = getListProgrammedDatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProgrammedDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProgrammedDatesServiceMethodDescriptorSupplier("ListProgrammedDates"))
              .build();
        }
      }
    }
    return getListProgrammedDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse> getGetProgrammedDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProgrammedDates",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse> getGetProgrammedDatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse> getGetProgrammedDatesMethod;
    if ((getGetProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getGetProgrammedDatesMethod) == null) {
      synchronized (ProgrammedDatesServiceGrpc.class) {
        if ((getGetProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getGetProgrammedDatesMethod) == null) {
          ProgrammedDatesServiceGrpc.getGetProgrammedDatesMethod = getGetProgrammedDatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProgrammedDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProgrammedDatesServiceMethodDescriptorSupplier("GetProgrammedDates"))
              .build();
        }
      }
    }
    return getGetProgrammedDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse> getSetProgrammedDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetProgrammedDates",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse> getSetProgrammedDatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse> getSetProgrammedDatesMethod;
    if ((getSetProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getSetProgrammedDatesMethod) == null) {
      synchronized (ProgrammedDatesServiceGrpc.class) {
        if ((getSetProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getSetProgrammedDatesMethod) == null) {
          ProgrammedDatesServiceGrpc.getSetProgrammedDatesMethod = getSetProgrammedDatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetProgrammedDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProgrammedDatesServiceMethodDescriptorSupplier("SetProgrammedDates"))
              .build();
        }
      }
    }
    return getSetProgrammedDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse> getAddToProgrammedDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToProgrammedDates",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse> getAddToProgrammedDatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse> getAddToProgrammedDatesMethod;
    if ((getAddToProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getAddToProgrammedDatesMethod) == null) {
      synchronized (ProgrammedDatesServiceGrpc.class) {
        if ((getAddToProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getAddToProgrammedDatesMethod) == null) {
          ProgrammedDatesServiceGrpc.getAddToProgrammedDatesMethod = getAddToProgrammedDatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToProgrammedDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProgrammedDatesServiceMethodDescriptorSupplier("AddToProgrammedDates"))
              .build();
        }
      }
    }
    return getAddToProgrammedDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse> getRemoveFromProgrammedDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFromProgrammedDates",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse> getRemoveFromProgrammedDatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse> getRemoveFromProgrammedDatesMethod;
    if ((getRemoveFromProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getRemoveFromProgrammedDatesMethod) == null) {
      synchronized (ProgrammedDatesServiceGrpc.class) {
        if ((getRemoveFromProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getRemoveFromProgrammedDatesMethod) == null) {
          ProgrammedDatesServiceGrpc.getRemoveFromProgrammedDatesMethod = getRemoveFromProgrammedDatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFromProgrammedDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProgrammedDatesServiceMethodDescriptorSupplier("RemoveFromProgrammedDates"))
              .build();
        }
      }
    }
    return getRemoveFromProgrammedDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse> getUpdateProgrammedDatesInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProgrammedDatesInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse> getUpdateProgrammedDatesInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse> getUpdateProgrammedDatesInfoMethod;
    if ((getUpdateProgrammedDatesInfoMethod = ProgrammedDatesServiceGrpc.getUpdateProgrammedDatesInfoMethod) == null) {
      synchronized (ProgrammedDatesServiceGrpc.class) {
        if ((getUpdateProgrammedDatesInfoMethod = ProgrammedDatesServiceGrpc.getUpdateProgrammedDatesInfoMethod) == null) {
          ProgrammedDatesServiceGrpc.getUpdateProgrammedDatesInfoMethod = getUpdateProgrammedDatesInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProgrammedDatesInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProgrammedDatesServiceMethodDescriptorSupplier("UpdateProgrammedDatesInfo"))
              .build();
        }
      }
    }
    return getUpdateProgrammedDatesInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse> getDeleteProgrammedDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProgrammedDates",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse> getDeleteProgrammedDatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse> getDeleteProgrammedDatesMethod;
    if ((getDeleteProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getDeleteProgrammedDatesMethod) == null) {
      synchronized (ProgrammedDatesServiceGrpc.class) {
        if ((getDeleteProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getDeleteProgrammedDatesMethod) == null) {
          ProgrammedDatesServiceGrpc.getDeleteProgrammedDatesMethod = getDeleteProgrammedDatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProgrammedDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProgrammedDatesServiceMethodDescriptorSupplier("DeleteProgrammedDates"))
              .build();
        }
      }
    }
    return getDeleteProgrammedDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse> getEvaluateProgrammedDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EvaluateProgrammedDates",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest,
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse> getEvaluateProgrammedDatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse> getEvaluateProgrammedDatesMethod;
    if ((getEvaluateProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getEvaluateProgrammedDatesMethod) == null) {
      synchronized (ProgrammedDatesServiceGrpc.class) {
        if ((getEvaluateProgrammedDatesMethod = ProgrammedDatesServiceGrpc.getEvaluateProgrammedDatesMethod) == null) {
          ProgrammedDatesServiceGrpc.getEvaluateProgrammedDatesMethod = getEvaluateProgrammedDatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EvaluateProgrammedDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProgrammedDatesServiceMethodDescriptorSupplier("EvaluateProgrammedDates"))
              .build();
        }
      }
    }
    return getEvaluateProgrammedDatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProgrammedDatesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProgrammedDatesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProgrammedDatesServiceStub>() {
        @java.lang.Override
        public ProgrammedDatesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProgrammedDatesServiceStub(channel, callOptions);
        }
      };
    return ProgrammedDatesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProgrammedDatesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProgrammedDatesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProgrammedDatesServiceBlockingStub>() {
        @java.lang.Override
        public ProgrammedDatesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProgrammedDatesServiceBlockingStub(channel, callOptions);
        }
      };
    return ProgrammedDatesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProgrammedDatesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProgrammedDatesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProgrammedDatesServiceFutureStub>() {
        @java.lang.Override
        public ProgrammedDatesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProgrammedDatesServiceFutureStub(channel, callOptions);
        }
      };
    return ProgrammedDatesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListProgrammedDates returns all ListProgrammedDates for an Org.
     * </pre>
     */
    default void listProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProgrammedDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProgrammedDates returns the programmed dates for the ID.
     * </pre>
     */
    default void getProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProgrammedDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetProgrammedDates creates a new programmed dates for an Org.
     * </pre>
     */
    default void setProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetProgrammedDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddToProgrammedDates adds a new programmed day for an Org.
     * </pre>
     */
    default void addToProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToProgrammedDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveFromProgrammedDates removes an existing programmed day from an Org.
     * </pre>
     */
    default void removeFromProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveFromProgrammedDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProgrammedDatesInfo updates the general info for a programmed date.
     * </pre>
     */
    default void updateProgrammedDatesInfo(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProgrammedDatesInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteProgrammedDates deletes an existing programmed date.
     * </pre>
     */
    default void deleteProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProgrammedDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * EvaluateProgrammedDates evaluates the programmed date.
     * </pre>
     */
    default void evaluateProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEvaluateProgrammedDatesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProgrammedDatesService.
   */
  public static abstract class ProgrammedDatesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProgrammedDatesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProgrammedDatesService.
   */
  public static final class ProgrammedDatesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProgrammedDatesServiceStub> {
    private ProgrammedDatesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProgrammedDatesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProgrammedDatesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListProgrammedDates returns all ListProgrammedDates for an Org.
     * </pre>
     */
    public void listProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProgrammedDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProgrammedDates returns the programmed dates for the ID.
     * </pre>
     */
    public void getProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProgrammedDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetProgrammedDates creates a new programmed dates for an Org.
     * </pre>
     */
    public void setProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetProgrammedDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddToProgrammedDates adds a new programmed day for an Org.
     * </pre>
     */
    public void addToProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToProgrammedDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveFromProgrammedDates removes an existing programmed day from an Org.
     * </pre>
     */
    public void removeFromProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveFromProgrammedDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateProgrammedDatesInfo updates the general info for a programmed date.
     * </pre>
     */
    public void updateProgrammedDatesInfo(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProgrammedDatesInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteProgrammedDates deletes an existing programmed date.
     * </pre>
     */
    public void deleteProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProgrammedDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EvaluateProgrammedDates evaluates the programmed date.
     * </pre>
     */
    public void evaluateProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEvaluateProgrammedDatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProgrammedDatesService.
   */
  public static final class ProgrammedDatesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProgrammedDatesServiceBlockingStub> {
    private ProgrammedDatesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProgrammedDatesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProgrammedDatesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListProgrammedDates returns all ListProgrammedDates for an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse listProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProgrammedDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProgrammedDates returns the programmed dates for the ID.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse getProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProgrammedDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetProgrammedDates creates a new programmed dates for an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse setProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetProgrammedDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddToProgrammedDates adds a new programmed day for an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse addToProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToProgrammedDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveFromProgrammedDates removes an existing programmed day from an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse removeFromProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveFromProgrammedDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateProgrammedDatesInfo updates the general info for a programmed date.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse updateProgrammedDatesInfo(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProgrammedDatesInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteProgrammedDates deletes an existing programmed date.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse deleteProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProgrammedDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EvaluateProgrammedDates evaluates the programmed date.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse evaluateProgrammedDates(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEvaluateProgrammedDatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProgrammedDatesService.
   */
  public static final class ProgrammedDatesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProgrammedDatesServiceFutureStub> {
    private ProgrammedDatesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProgrammedDatesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProgrammedDatesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListProgrammedDates returns all ListProgrammedDates for an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse> listProgrammedDates(
        com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProgrammedDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProgrammedDates returns the programmed dates for the ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse> getProgrammedDates(
        com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProgrammedDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetProgrammedDates creates a new programmed dates for an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse> setProgrammedDates(
        com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetProgrammedDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddToProgrammedDates adds a new programmed day for an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse> addToProgrammedDates(
        com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToProgrammedDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveFromProgrammedDates removes an existing programmed day from an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse> removeFromProgrammedDates(
        com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveFromProgrammedDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateProgrammedDatesInfo updates the general info for a programmed date.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse> updateProgrammedDatesInfo(
        com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProgrammedDatesInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteProgrammedDates deletes an existing programmed date.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse> deleteProgrammedDates(
        com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProgrammedDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EvaluateProgrammedDates evaluates the programmed date.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse> evaluateProgrammedDates(
        com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEvaluateProgrammedDatesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PROGRAMMED_DATES = 0;
  private static final int METHODID_GET_PROGRAMMED_DATES = 1;
  private static final int METHODID_SET_PROGRAMMED_DATES = 2;
  private static final int METHODID_ADD_TO_PROGRAMMED_DATES = 3;
  private static final int METHODID_REMOVE_FROM_PROGRAMMED_DATES = 4;
  private static final int METHODID_UPDATE_PROGRAMMED_DATES_INFO = 5;
  private static final int METHODID_DELETE_PROGRAMMED_DATES = 6;
  private static final int METHODID_EVALUATE_PROGRAMMED_DATES = 7;

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
        case METHODID_LIST_PROGRAMMED_DATES:
          serviceImpl.listProgrammedDates((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse>) responseObserver);
          break;
        case METHODID_GET_PROGRAMMED_DATES:
          serviceImpl.getProgrammedDates((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse>) responseObserver);
          break;
        case METHODID_SET_PROGRAMMED_DATES:
          serviceImpl.setProgrammedDates((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_PROGRAMMED_DATES:
          serviceImpl.addToProgrammedDates((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FROM_PROGRAMMED_DATES:
          serviceImpl.removeFromProgrammedDates((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROGRAMMED_DATES_INFO:
          serviceImpl.updateProgrammedDatesInfo((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROGRAMMED_DATES:
          serviceImpl.deleteProgrammedDates((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse>) responseObserver);
          break;
        case METHODID_EVALUATE_PROGRAMMED_DATES:
          serviceImpl.evaluateProgrammedDates((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse>) responseObserver);
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
          getListProgrammedDatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ListProgrammedDatesResponse>(
                service, METHODID_LIST_PROGRAMMED_DATES)))
        .addMethod(
          getGetProgrammedDatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse>(
                service, METHODID_GET_PROGRAMMED_DATES)))
        .addMethod(
          getSetProgrammedDatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.SetProgrammedDatesResponse>(
                service, METHODID_SET_PROGRAMMED_DATES)))
        .addMethod(
          getAddToProgrammedDatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.AddToProgrammedDatesResponse>(
                service, METHODID_ADD_TO_PROGRAMMED_DATES)))
        .addMethod(
          getRemoveFromProgrammedDatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesResponse>(
                service, METHODID_REMOVE_FROM_PROGRAMMED_DATES)))
        .addMethod(
          getUpdateProgrammedDatesInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.UpdateProgrammedDatesInfoResponse>(
                service, METHODID_UPDATE_PROGRAMMED_DATES_INFO)))
        .addMethod(
          getDeleteProgrammedDatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesResponse>(
                service, METHODID_DELETE_PROGRAMMED_DATES)))
        .addMethod(
          getEvaluateProgrammedDatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesRequest,
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EvaluateProgrammedDatesResponse>(
                service, METHODID_EVALUATE_PROGRAMMED_DATES)))
        .build();
  }

  private static abstract class ProgrammedDatesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProgrammedDatesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProgrammedDatesService");
    }
  }

  private static final class ProgrammedDatesServiceFileDescriptorSupplier
      extends ProgrammedDatesServiceBaseDescriptorSupplier {
    ProgrammedDatesServiceFileDescriptorSupplier() {}
  }

  private static final class ProgrammedDatesServiceMethodDescriptorSupplier
      extends ProgrammedDatesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProgrammedDatesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProgrammedDatesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProgrammedDatesServiceFileDescriptorSupplier())
              .addMethod(getListProgrammedDatesMethod())
              .addMethod(getGetProgrammedDatesMethod())
              .addMethod(getSetProgrammedDatesMethod())
              .addMethod(getAddToProgrammedDatesMethod())
              .addMethod(getRemoveFromProgrammedDatesMethod())
              .addMethod(getUpdateProgrammedDatesInfoMethod())
              .addMethod(getDeleteProgrammedDatesMethod())
              .addMethod(getEvaluateProgrammedDatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
