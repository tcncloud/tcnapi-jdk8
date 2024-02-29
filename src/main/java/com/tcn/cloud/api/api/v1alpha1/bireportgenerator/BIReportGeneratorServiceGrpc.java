package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * BIReportGeneratorService is the service for generating BI reports.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/bireportgenerator/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BIReportGeneratorServiceGrpc {

  private BIReportGeneratorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.bireportgenerator.BIReportGeneratorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse> getCreateReportJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReportJob",
      requestType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse> getCreateReportJobMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse> getCreateReportJobMethod;
    if ((getCreateReportJobMethod = BIReportGeneratorServiceGrpc.getCreateReportJobMethod) == null) {
      synchronized (BIReportGeneratorServiceGrpc.class) {
        if ((getCreateReportJobMethod = BIReportGeneratorServiceGrpc.getCreateReportJobMethod) == null) {
          BIReportGeneratorServiceGrpc.getCreateReportJobMethod = getCreateReportJobMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReportJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BIReportGeneratorServiceMethodDescriptorSupplier("CreateReportJob"))
              .build();
        }
      }
    }
    return getCreateReportJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse> getListReportJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListReportJobs",
      requestType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse> getListReportJobsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse> getListReportJobsMethod;
    if ((getListReportJobsMethod = BIReportGeneratorServiceGrpc.getListReportJobsMethod) == null) {
      synchronized (BIReportGeneratorServiceGrpc.class) {
        if ((getListReportJobsMethod = BIReportGeneratorServiceGrpc.getListReportJobsMethod) == null) {
          BIReportGeneratorServiceGrpc.getListReportJobsMethod = getListReportJobsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListReportJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BIReportGeneratorServiceMethodDescriptorSupplier("ListReportJobs"))
              .build();
        }
      }
    }
    return getListReportJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse> getUpdateReportJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReportJob",
      requestType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse> getUpdateReportJobMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse> getUpdateReportJobMethod;
    if ((getUpdateReportJobMethod = BIReportGeneratorServiceGrpc.getUpdateReportJobMethod) == null) {
      synchronized (BIReportGeneratorServiceGrpc.class) {
        if ((getUpdateReportJobMethod = BIReportGeneratorServiceGrpc.getUpdateReportJobMethod) == null) {
          BIReportGeneratorServiceGrpc.getUpdateReportJobMethod = getUpdateReportJobMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReportJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BIReportGeneratorServiceMethodDescriptorSupplier("UpdateReportJob"))
              .build();
        }
      }
    }
    return getUpdateReportJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse> getDeleteReportJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReportJob",
      requestType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse> getDeleteReportJobMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse> getDeleteReportJobMethod;
    if ((getDeleteReportJobMethod = BIReportGeneratorServiceGrpc.getDeleteReportJobMethod) == null) {
      synchronized (BIReportGeneratorServiceGrpc.class) {
        if ((getDeleteReportJobMethod = BIReportGeneratorServiceGrpc.getDeleteReportJobMethod) == null) {
          BIReportGeneratorServiceGrpc.getDeleteReportJobMethod = getDeleteReportJobMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReportJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BIReportGeneratorServiceMethodDescriptorSupplier("DeleteReportJob"))
              .build();
        }
      }
    }
    return getDeleteReportJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse> getGetReportJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReportJob",
      requestType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse> getGetReportJobMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse> getGetReportJobMethod;
    if ((getGetReportJobMethod = BIReportGeneratorServiceGrpc.getGetReportJobMethod) == null) {
      synchronized (BIReportGeneratorServiceGrpc.class) {
        if ((getGetReportJobMethod = BIReportGeneratorServiceGrpc.getGetReportJobMethod) == null) {
          BIReportGeneratorServiceGrpc.getGetReportJobMethod = getGetReportJobMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReportJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BIReportGeneratorServiceMethodDescriptorSupplier("GetReportJob"))
              .build();
        }
      }
    }
    return getGetReportJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse> getGenerateReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateReport",
      requestType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest,
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse> getGenerateReportMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse> getGenerateReportMethod;
    if ((getGenerateReportMethod = BIReportGeneratorServiceGrpc.getGenerateReportMethod) == null) {
      synchronized (BIReportGeneratorServiceGrpc.class) {
        if ((getGenerateReportMethod = BIReportGeneratorServiceGrpc.getGenerateReportMethod) == null) {
          BIReportGeneratorServiceGrpc.getGenerateReportMethod = getGenerateReportMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BIReportGeneratorServiceMethodDescriptorSupplier("GenerateReport"))
              .build();
        }
      }
    }
    return getGenerateReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BIReportGeneratorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BIReportGeneratorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BIReportGeneratorServiceStub>() {
        @java.lang.Override
        public BIReportGeneratorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BIReportGeneratorServiceStub(channel, callOptions);
        }
      };
    return BIReportGeneratorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BIReportGeneratorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BIReportGeneratorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BIReportGeneratorServiceBlockingStub>() {
        @java.lang.Override
        public BIReportGeneratorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BIReportGeneratorServiceBlockingStub(channel, callOptions);
        }
      };
    return BIReportGeneratorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BIReportGeneratorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BIReportGeneratorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BIReportGeneratorServiceFutureStub>() {
        @java.lang.Override
        public BIReportGeneratorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BIReportGeneratorServiceFutureStub(channel, callOptions);
        }
      };
    return BIReportGeneratorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * BIReportGeneratorService is the service for generating BI reports.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateReportJob creates a new report job.
     * </pre>
     */
    default void createReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReportJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListReportJobs lists report jobs.
     * </pre>
     */
    default void listReportJobs(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListReportJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateReportJob updates a report job.
     * </pre>
     */
    default void updateReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReportJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteReportJob deletes a report job.
     * </pre>
     */
    default void deleteReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReportJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReportJob gets a report job.
     * </pre>
     */
    default void getReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReportJobMethod(), responseObserver);
    }

    /**
     */
    default void generateReport(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateReportMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BIReportGeneratorService.
   * <pre>
   * BIReportGeneratorService is the service for generating BI reports.
   * </pre>
   */
  public static abstract class BIReportGeneratorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BIReportGeneratorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BIReportGeneratorService.
   * <pre>
   * BIReportGeneratorService is the service for generating BI reports.
   * </pre>
   */
  public static final class BIReportGeneratorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BIReportGeneratorServiceStub> {
    private BIReportGeneratorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BIReportGeneratorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BIReportGeneratorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateReportJob creates a new report job.
     * </pre>
     */
    public void createReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReportJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListReportJobs lists report jobs.
     * </pre>
     */
    public void listReportJobs(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListReportJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateReportJob updates a report job.
     * </pre>
     */
    public void updateReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReportJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteReportJob deletes a report job.
     * </pre>
     */
    public void deleteReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReportJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReportJob gets a report job.
     * </pre>
     */
    public void getReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReportJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateReport(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BIReportGeneratorService.
   * <pre>
   * BIReportGeneratorService is the service for generating BI reports.
   * </pre>
   */
  public static final class BIReportGeneratorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BIReportGeneratorServiceBlockingStub> {
    private BIReportGeneratorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BIReportGeneratorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BIReportGeneratorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateReportJob creates a new report job.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse createReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReportJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListReportJobs lists report jobs.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse listReportJobs(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListReportJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateReportJob updates a report job.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse updateReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReportJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteReportJob deletes a report job.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse deleteReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReportJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReportJob gets a report job.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse getReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReportJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse generateReport(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateReportMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BIReportGeneratorService.
   * <pre>
   * BIReportGeneratorService is the service for generating BI reports.
   * </pre>
   */
  public static final class BIReportGeneratorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BIReportGeneratorServiceFutureStub> {
    private BIReportGeneratorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BIReportGeneratorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BIReportGeneratorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateReportJob creates a new report job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse> createReportJob(
        com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReportJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListReportJobs lists report jobs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse> listReportJobs(
        com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListReportJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateReportJob updates a report job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse> updateReportJob(
        com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReportJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteReportJob deletes a report job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse> deleteReportJob(
        com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReportJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReportJob gets a report job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse> getReportJob(
        com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReportJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse> generateReport(
        com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_REPORT_JOB = 0;
  private static final int METHODID_LIST_REPORT_JOBS = 1;
  private static final int METHODID_UPDATE_REPORT_JOB = 2;
  private static final int METHODID_DELETE_REPORT_JOB = 3;
  private static final int METHODID_GET_REPORT_JOB = 4;
  private static final int METHODID_GENERATE_REPORT = 5;

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
        case METHODID_CREATE_REPORT_JOB:
          serviceImpl.createReportJob((com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse>) responseObserver);
          break;
        case METHODID_LIST_REPORT_JOBS:
          serviceImpl.listReportJobs((com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REPORT_JOB:
          serviceImpl.updateReportJob((com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse>) responseObserver);
          break;
        case METHODID_DELETE_REPORT_JOB:
          serviceImpl.deleteReportJob((com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse>) responseObserver);
          break;
        case METHODID_GET_REPORT_JOB:
          serviceImpl.getReportJob((com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse>) responseObserver);
          break;
        case METHODID_GENERATE_REPORT:
          serviceImpl.generateReport((com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse>) responseObserver);
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
          getCreateReportJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobRequest,
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.CreateReportJobResponse>(
                service, METHODID_CREATE_REPORT_JOB)))
        .addMethod(
          getListReportJobsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsRequest,
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ListReportJobsResponse>(
                service, METHODID_LIST_REPORT_JOBS)))
        .addMethod(
          getUpdateReportJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobRequest,
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.UpdateReportJobResponse>(
                service, METHODID_UPDATE_REPORT_JOB)))
        .addMethod(
          getDeleteReportJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobRequest,
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.DeleteReportJobResponse>(
                service, METHODID_DELETE_REPORT_JOB)))
        .addMethod(
          getGetReportJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobRequest,
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GetReportJobResponse>(
                service, METHODID_GET_REPORT_JOB)))
        .addMethod(
          getGenerateReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest,
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportResponse>(
                service, METHODID_GENERATE_REPORT)))
        .build();
  }

  private static abstract class BIReportGeneratorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BIReportGeneratorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BIReportGeneratorService");
    }
  }

  private static final class BIReportGeneratorServiceFileDescriptorSupplier
      extends BIReportGeneratorServiceBaseDescriptorSupplier {
    BIReportGeneratorServiceFileDescriptorSupplier() {}
  }

  private static final class BIReportGeneratorServiceMethodDescriptorSupplier
      extends BIReportGeneratorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BIReportGeneratorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BIReportGeneratorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BIReportGeneratorServiceFileDescriptorSupplier())
              .addMethod(getCreateReportJobMethod())
              .addMethod(getListReportJobsMethod())
              .addMethod(getUpdateReportJobMethod())
              .addMethod(getDeleteReportJobMethod())
              .addMethod(getGetReportJobMethod())
              .addMethod(getGenerateReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
