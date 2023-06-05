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
    comments = "Source: api/v0alpha/dashboards.proto")
public final class DashboardsGrpc {

  private DashboardsGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.Dashboards";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest,
      com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse> getCreateDashboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDashboard",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest,
      com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse> getCreateDashboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest, com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse> getCreateDashboardMethod;
    if ((getCreateDashboardMethod = DashboardsGrpc.getCreateDashboardMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getCreateDashboardMethod = DashboardsGrpc.getCreateDashboardMethod) == null) {
          DashboardsGrpc.getCreateDashboardMethod = getCreateDashboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest, com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "CreateDashboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("CreateDashboard"))
                  .build();
          }
        }
     }
     return getCreateDashboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDashboardRequest,
      com.tcn.cloud.api.api.v0alpha.Dashboard> getGetDashboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDashboard",
      requestType = com.tcn.cloud.api.api.v0alpha.GetDashboardRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Dashboard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDashboardRequest,
      com.tcn.cloud.api.api.v0alpha.Dashboard> getGetDashboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDashboardRequest, com.tcn.cloud.api.api.v0alpha.Dashboard> getGetDashboardMethod;
    if ((getGetDashboardMethod = DashboardsGrpc.getGetDashboardMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getGetDashboardMethod = DashboardsGrpc.getGetDashboardMethod) == null) {
          DashboardsGrpc.getGetDashboardMethod = getGetDashboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetDashboardRequest, com.tcn.cloud.api.api.v0alpha.Dashboard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "GetDashboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Dashboard.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("GetDashboard"))
                  .build();
          }
        }
     }
     return getGetDashboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest,
      com.tcn.cloud.api.api.v0alpha.Dashboard> getGetDefaultDashboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefaultDashboard",
      requestType = com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Dashboard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest,
      com.tcn.cloud.api.api.v0alpha.Dashboard> getGetDefaultDashboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest, com.tcn.cloud.api.api.v0alpha.Dashboard> getGetDefaultDashboardMethod;
    if ((getGetDefaultDashboardMethod = DashboardsGrpc.getGetDefaultDashboardMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getGetDefaultDashboardMethod = DashboardsGrpc.getGetDefaultDashboardMethod) == null) {
          DashboardsGrpc.getGetDefaultDashboardMethod = getGetDefaultDashboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest, com.tcn.cloud.api.api.v0alpha.Dashboard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "GetDefaultDashboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Dashboard.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("GetDefaultDashboard"))
                  .build();
          }
        }
     }
     return getGetDefaultDashboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest,
      com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse> getListDashboardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDashboards",
      requestType = com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest,
      com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse> getListDashboardsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest, com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse> getListDashboardsMethod;
    if ((getListDashboardsMethod = DashboardsGrpc.getListDashboardsMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getListDashboardsMethod = DashboardsGrpc.getListDashboardsMethod) == null) {
          DashboardsGrpc.getListDashboardsMethod = getListDashboardsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest, com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "ListDashboards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("ListDashboards"))
                  .build();
          }
        }
     }
     return getListDashboardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest,
      com.tcn.cloud.api.api.v0alpha.ListProductTypesResult> getListProductTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProductTypes",
      requestType = com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListProductTypesResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest,
      com.tcn.cloud.api.api.v0alpha.ListProductTypesResult> getListProductTypesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest, com.tcn.cloud.api.api.v0alpha.ListProductTypesResult> getListProductTypesMethod;
    if ((getListProductTypesMethod = DashboardsGrpc.getListProductTypesMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getListProductTypesMethod = DashboardsGrpc.getListProductTypesMethod) == null) {
          DashboardsGrpc.getListProductTypesMethod = getListProductTypesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest, com.tcn.cloud.api.api.v0alpha.ListProductTypesResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "ListProductTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListProductTypesResult.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("ListProductTypes"))
                  .build();
          }
        }
     }
     return getListProductTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest,
      com.google.protobuf.Empty> getDeleteDashboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDashboard",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest,
      com.google.protobuf.Empty> getDeleteDashboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest, com.google.protobuf.Empty> getDeleteDashboardMethod;
    if ((getDeleteDashboardMethod = DashboardsGrpc.getDeleteDashboardMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getDeleteDashboardMethod = DashboardsGrpc.getDeleteDashboardMethod) == null) {
          DashboardsGrpc.getDeleteDashboardMethod = getDeleteDashboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "DeleteDashboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("DeleteDashboard"))
                  .build();
          }
        }
     }
     return getDeleteDashboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest,
      com.google.protobuf.Empty> getSetDefaultDashboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDefaultDashboard",
      requestType = com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest,
      com.google.protobuf.Empty> getSetDefaultDashboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest, com.google.protobuf.Empty> getSetDefaultDashboardMethod;
    if ((getSetDefaultDashboardMethod = DashboardsGrpc.getSetDefaultDashboardMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getSetDefaultDashboardMethod = DashboardsGrpc.getSetDefaultDashboardMethod) == null) {
          DashboardsGrpc.getSetDefaultDashboardMethod = getSetDefaultDashboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "SetDefaultDashboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("SetDefaultDashboard"))
                  .build();
          }
        }
     }
     return getSetDefaultDashboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest,
      com.google.protobuf.Empty> getUpdateDashboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboard",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest,
      com.google.protobuf.Empty> getUpdateDashboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest, com.google.protobuf.Empty> getUpdateDashboardMethod;
    if ((getUpdateDashboardMethod = DashboardsGrpc.getUpdateDashboardMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getUpdateDashboardMethod = DashboardsGrpc.getUpdateDashboardMethod) == null) {
          DashboardsGrpc.getUpdateDashboardMethod = getUpdateDashboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "UpdateDashboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("UpdateDashboard"))
                  .build();
          }
        }
     }
     return getUpdateDashboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest,
      com.google.protobuf.Empty> getUpdateDashboardTitleAndDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboardTitleAndDescription",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest,
      com.google.protobuf.Empty> getUpdateDashboardTitleAndDescriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest, com.google.protobuf.Empty> getUpdateDashboardTitleAndDescriptionMethod;
    if ((getUpdateDashboardTitleAndDescriptionMethod = DashboardsGrpc.getUpdateDashboardTitleAndDescriptionMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getUpdateDashboardTitleAndDescriptionMethod = DashboardsGrpc.getUpdateDashboardTitleAndDescriptionMethod) == null) {
          DashboardsGrpc.getUpdateDashboardTitleAndDescriptionMethod = getUpdateDashboardTitleAndDescriptionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "UpdateDashboardTitleAndDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("UpdateDashboardTitleAndDescription"))
                  .build();
          }
        }
     }
     return getUpdateDashboardTitleAndDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest,
      com.google.protobuf.Empty> getUpdateDashboardViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboardView",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest,
      com.google.protobuf.Empty> getUpdateDashboardViewMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest, com.google.protobuf.Empty> getUpdateDashboardViewMethod;
    if ((getUpdateDashboardViewMethod = DashboardsGrpc.getUpdateDashboardViewMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getUpdateDashboardViewMethod = DashboardsGrpc.getUpdateDashboardViewMethod) == null) {
          DashboardsGrpc.getUpdateDashboardViewMethod = getUpdateDashboardViewMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "UpdateDashboardView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("UpdateDashboardView"))
                  .build();
          }
        }
     }
     return getUpdateDashboardViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest,
      com.google.protobuf.Empty> getUpdateDashboardLayoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboardLayout",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest,
      com.google.protobuf.Empty> getUpdateDashboardLayoutMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest, com.google.protobuf.Empty> getUpdateDashboardLayoutMethod;
    if ((getUpdateDashboardLayoutMethod = DashboardsGrpc.getUpdateDashboardLayoutMethod) == null) {
      synchronized (DashboardsGrpc.class) {
        if ((getUpdateDashboardLayoutMethod = DashboardsGrpc.getUpdateDashboardLayoutMethod) == null) {
          DashboardsGrpc.getUpdateDashboardLayoutMethod = getUpdateDashboardLayoutMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Dashboards", "UpdateDashboardLayout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardsMethodDescriptorSupplier("UpdateDashboardLayout"))
                  .build();
          }
        }
     }
     return getUpdateDashboardLayoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DashboardsStub newStub(io.grpc.Channel channel) {
    return new DashboardsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DashboardsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DashboardsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DashboardsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DashboardsFutureStub(channel);
  }

  /**
   */
  public static abstract class DashboardsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateDashboard creates a dashboard and associated panels
     * </pre>
     */
    public void createDashboard(com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDashboardMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDashboard retrieves a dashboard by the given ID and orgID and fetches its associated panels
     * </pre>
     */
    public void getDashboard(com.tcn.cloud.api.api.v0alpha.GetDashboardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Dashboard> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDashboardMethod(), responseObserver);
    }

    /**
     */
    public void getDefaultDashboard(com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Dashboard> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDefaultDashboardMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDashboards retrieves all dashboard summaries for the given organization
     * </pre>
     */
    public void listDashboards(com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDashboardsMethod(), responseObserver);
    }

    /**
     */
    public void listProductTypes(com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListProductTypesResult> responseObserver) {
      asyncUnimplementedUnaryCall(getListProductTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a given dashboard
     * </pre>
     */
    public void deleteDashboard(com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDashboardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets a dashboard as the user's default
     * </pre>
     */
    public void setDefaultDashboard(com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDefaultDashboardMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboard updates a dashboard
     * </pre>
     */
    public void updateDashboard(com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDashboardMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardTitleAndDescription updates a dashboards title and description
     * </pre>
     */
    public void updateDashboardTitleAndDescription(com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDashboardTitleAndDescriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardView updates a dashboards view with the given view
     * </pre>
     */
    public void updateDashboardView(com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDashboardViewMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardLayout replaces a dashboards layout with a given layout
     * </pre>
     */
    public void updateDashboardLayout(com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDashboardLayoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateDashboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest,
                com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse>(
                  this, METHODID_CREATE_DASHBOARD)))
          .addMethod(
            getGetDashboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetDashboardRequest,
                com.tcn.cloud.api.api.v0alpha.Dashboard>(
                  this, METHODID_GET_DASHBOARD)))
          .addMethod(
            getGetDefaultDashboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest,
                com.tcn.cloud.api.api.v0alpha.Dashboard>(
                  this, METHODID_GET_DEFAULT_DASHBOARD)))
          .addMethod(
            getListDashboardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest,
                com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse>(
                  this, METHODID_LIST_DASHBOARDS)))
          .addMethod(
            getListProductTypesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest,
                com.tcn.cloud.api.api.v0alpha.ListProductTypesResult>(
                  this, METHODID_LIST_PRODUCT_TYPES)))
          .addMethod(
            getDeleteDashboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DASHBOARD)))
          .addMethod(
            getSetDefaultDashboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_DEFAULT_DASHBOARD)))
          .addMethod(
            getUpdateDashboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_DASHBOARD)))
          .addMethod(
            getUpdateDashboardTitleAndDescriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_DASHBOARD_TITLE_AND_DESCRIPTION)))
          .addMethod(
            getUpdateDashboardViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_DASHBOARD_VIEW)))
          .addMethod(
            getUpdateDashboardLayoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_DASHBOARD_LAYOUT)))
          .build();
    }
  }

  /**
   */
  public static final class DashboardsStub extends io.grpc.stub.AbstractStub<DashboardsStub> {
    private DashboardsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardsStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateDashboard creates a dashboard and associated panels
     * </pre>
     */
    public void createDashboard(com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDashboardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDashboard retrieves a dashboard by the given ID and orgID and fetches its associated panels
     * </pre>
     */
    public void getDashboard(com.tcn.cloud.api.api.v0alpha.GetDashboardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Dashboard> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDashboardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDefaultDashboard(com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Dashboard> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDefaultDashboardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDashboards retrieves all dashboard summaries for the given organization
     * </pre>
     */
    public void listDashboards(com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDashboardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProductTypes(com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListProductTypesResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProductTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a given dashboard
     * </pre>
     */
    public void deleteDashboard(com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDashboardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets a dashboard as the user's default
     * </pre>
     */
    public void setDefaultDashboard(com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDefaultDashboardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboard updates a dashboard
     * </pre>
     */
    public void updateDashboard(com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardTitleAndDescription updates a dashboards title and description
     * </pre>
     */
    public void updateDashboardTitleAndDescription(com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardTitleAndDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardView updates a dashboards view with the given view
     * </pre>
     */
    public void updateDashboardView(com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDashboardLayout replaces a dashboards layout with a given layout
     * </pre>
     */
    public void updateDashboardLayout(com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardLayoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DashboardsBlockingStub extends io.grpc.stub.AbstractStub<DashboardsBlockingStub> {
    private DashboardsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateDashboard creates a dashboard and associated panels
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse createDashboard(com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateDashboardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDashboard retrieves a dashboard by the given ID and orgID and fetches its associated panels
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.Dashboard getDashboard(com.tcn.cloud.api.api.v0alpha.GetDashboardRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDashboardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Dashboard getDefaultDashboard(com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDefaultDashboardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDashboards retrieves all dashboard summaries for the given organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse listDashboards(com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDashboardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListProductTypesResult listProductTypes(com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProductTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a given dashboard
     * </pre>
     */
    public com.google.protobuf.Empty deleteDashboard(com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDashboardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets a dashboard as the user's default
     * </pre>
     */
    public com.google.protobuf.Empty setDefaultDashboard(com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetDefaultDashboardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboard updates a dashboard
     * </pre>
     */
    public com.google.protobuf.Empty updateDashboard(com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDashboardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboardTitleAndDescription updates a dashboards title and description
     * </pre>
     */
    public com.google.protobuf.Empty updateDashboardTitleAndDescription(com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDashboardTitleAndDescriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboardView updates a dashboards view with the given view
     * </pre>
     */
    public com.google.protobuf.Empty updateDashboardView(com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDashboardViewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDashboardLayout replaces a dashboards layout with a given layout
     * </pre>
     */
    public com.google.protobuf.Empty updateDashboardLayout(com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDashboardLayoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DashboardsFutureStub extends io.grpc.stub.AbstractStub<DashboardsFutureStub> {
    private DashboardsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateDashboard creates a dashboard and associated panels
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse> createDashboard(
        com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDashboardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDashboard retrieves a dashboard by the given ID and orgID and fetches its associated panels
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Dashboard> getDashboard(
        com.tcn.cloud.api.api.v0alpha.GetDashboardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDashboardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Dashboard> getDefaultDashboard(
        com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDefaultDashboardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDashboards retrieves all dashboard summaries for the given organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse> listDashboards(
        com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDashboardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListProductTypesResult> listProductTypes(
        com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProductTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a given dashboard
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDashboard(
        com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDashboardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets a dashboard as the user's default
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setDefaultDashboard(
        com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDefaultDashboardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDashboard updates a dashboard
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDashboard(
        com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDashboardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDashboardTitleAndDescription updates a dashboards title and description
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDashboardTitleAndDescription(
        com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDashboardTitleAndDescriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDashboardView updates a dashboards view with the given view
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDashboardView(
        com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDashboardViewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDashboardLayout replaces a dashboards layout with a given layout
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDashboardLayout(
        com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDashboardLayoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DASHBOARD = 0;
  private static final int METHODID_GET_DASHBOARD = 1;
  private static final int METHODID_GET_DEFAULT_DASHBOARD = 2;
  private static final int METHODID_LIST_DASHBOARDS = 3;
  private static final int METHODID_LIST_PRODUCT_TYPES = 4;
  private static final int METHODID_DELETE_DASHBOARD = 5;
  private static final int METHODID_SET_DEFAULT_DASHBOARD = 6;
  private static final int METHODID_UPDATE_DASHBOARD = 7;
  private static final int METHODID_UPDATE_DASHBOARD_TITLE_AND_DESCRIPTION = 8;
  private static final int METHODID_UPDATE_DASHBOARD_VIEW = 9;
  private static final int METHODID_UPDATE_DASHBOARD_LAYOUT = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DashboardsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DashboardsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DASHBOARD:
          serviceImpl.createDashboard((com.tcn.cloud.api.api.v0alpha.CreateDashboardRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDashboardResponse>) responseObserver);
          break;
        case METHODID_GET_DASHBOARD:
          serviceImpl.getDashboard((com.tcn.cloud.api.api.v0alpha.GetDashboardRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Dashboard>) responseObserver);
          break;
        case METHODID_GET_DEFAULT_DASHBOARD:
          serviceImpl.getDefaultDashboard((com.tcn.cloud.api.api.v0alpha.GetDefaultDashboardRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Dashboard>) responseObserver);
          break;
        case METHODID_LIST_DASHBOARDS:
          serviceImpl.listDashboards((com.tcn.cloud.api.api.v0alpha.ListDashboardsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListDashboardsResponse>) responseObserver);
          break;
        case METHODID_LIST_PRODUCT_TYPES:
          serviceImpl.listProductTypes((com.tcn.cloud.api.api.v0alpha.ListProductTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListProductTypesResult>) responseObserver);
          break;
        case METHODID_DELETE_DASHBOARD:
          serviceImpl.deleteDashboard((com.tcn.cloud.api.api.v0alpha.DeleteDashboardRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SET_DEFAULT_DASHBOARD:
          serviceImpl.setDefaultDashboard((com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARD:
          serviceImpl.updateDashboard((com.tcn.cloud.api.api.v0alpha.UpdateDashboardRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARD_TITLE_AND_DESCRIPTION:
          serviceImpl.updateDashboardTitleAndDescription((com.tcn.cloud.api.api.v0alpha.UpdateDashboardTitleAndDescriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARD_VIEW:
          serviceImpl.updateDashboardView((com.tcn.cloud.api.api.v0alpha.UpdateDashboardViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARD_LAYOUT:
          serviceImpl.updateDashboardLayout((com.tcn.cloud.api.api.v0alpha.UpdateDashboardLayoutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class DashboardsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DashboardsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Dashboards");
    }
  }

  private static final class DashboardsFileDescriptorSupplier
      extends DashboardsBaseDescriptorSupplier {
    DashboardsFileDescriptorSupplier() {}
  }

  private static final class DashboardsMethodDescriptorSupplier
      extends DashboardsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DashboardsMethodDescriptorSupplier(String methodName) {
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
      synchronized (DashboardsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DashboardsFileDescriptorSupplier())
              .addMethod(getCreateDashboardMethod())
              .addMethod(getGetDashboardMethod())
              .addMethod(getGetDefaultDashboardMethod())
              .addMethod(getListDashboardsMethod())
              .addMethod(getListProductTypesMethod())
              .addMethod(getDeleteDashboardMethod())
              .addMethod(getSetDefaultDashboardMethod())
              .addMethod(getUpdateDashboardMethod())
              .addMethod(getUpdateDashboardTitleAndDescriptionMethod())
              .addMethod(getUpdateDashboardViewMethod())
              .addMethod(getUpdateDashboardLayoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
