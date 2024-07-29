package com.tcn.cloud.api.api.v1alpha1.org.exile_manager;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/exile_manager/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExileManagerServiceGrpc {

  private ExileManagerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.exile_manager.ExileManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse> getCreateCertificateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCertificateInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse> getCreateCertificateInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse> getCreateCertificateInfoMethod;
    if ((getCreateCertificateInfoMethod = ExileManagerServiceGrpc.getCreateCertificateInfoMethod) == null) {
      synchronized (ExileManagerServiceGrpc.class) {
        if ((getCreateCertificateInfoMethod = ExileManagerServiceGrpc.getCreateCertificateInfoMethod) == null) {
          ExileManagerServiceGrpc.getCreateCertificateInfoMethod = getCreateCertificateInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCertificateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileManagerServiceMethodDescriptorSupplier("CreateCertificateInfo"))
              .build();
        }
      }
    }
    return getCreateCertificateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse> getDeleteCertificateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCertificateInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse> getDeleteCertificateInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse> getDeleteCertificateInfoMethod;
    if ((getDeleteCertificateInfoMethod = ExileManagerServiceGrpc.getDeleteCertificateInfoMethod) == null) {
      synchronized (ExileManagerServiceGrpc.class) {
        if ((getDeleteCertificateInfoMethod = ExileManagerServiceGrpc.getDeleteCertificateInfoMethod) == null) {
          ExileManagerServiceGrpc.getDeleteCertificateInfoMethod = getDeleteCertificateInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCertificateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileManagerServiceMethodDescriptorSupplier("DeleteCertificateInfo"))
              .build();
        }
      }
    }
    return getDeleteCertificateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse> getRevokeCertificateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeCertificateInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse> getRevokeCertificateInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse> getRevokeCertificateInfoMethod;
    if ((getRevokeCertificateInfoMethod = ExileManagerServiceGrpc.getRevokeCertificateInfoMethod) == null) {
      synchronized (ExileManagerServiceGrpc.class) {
        if ((getRevokeCertificateInfoMethod = ExileManagerServiceGrpc.getRevokeCertificateInfoMethod) == null) {
          ExileManagerServiceGrpc.getRevokeCertificateInfoMethod = getRevokeCertificateInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeCertificateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileManagerServiceMethodDescriptorSupplier("RevokeCertificateInfo"))
              .build();
        }
      }
    }
    return getRevokeCertificateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse> getListCertificateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCertificateInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse> getListCertificateInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse> getListCertificateInfoMethod;
    if ((getListCertificateInfoMethod = ExileManagerServiceGrpc.getListCertificateInfoMethod) == null) {
      synchronized (ExileManagerServiceGrpc.class) {
        if ((getListCertificateInfoMethod = ExileManagerServiceGrpc.getListCertificateInfoMethod) == null) {
          ExileManagerServiceGrpc.getListCertificateInfoMethod = getListCertificateInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCertificateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileManagerServiceMethodDescriptorSupplier("ListCertificateInfo"))
              .build();
        }
      }
    }
    return getListCertificateInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExileManagerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExileManagerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExileManagerServiceStub>() {
        @java.lang.Override
        public ExileManagerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExileManagerServiceStub(channel, callOptions);
        }
      };
    return ExileManagerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExileManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExileManagerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExileManagerServiceBlockingStub>() {
        @java.lang.Override
        public ExileManagerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExileManagerServiceBlockingStub(channel, callOptions);
        }
      };
    return ExileManagerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExileManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExileManagerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExileManagerServiceFutureStub>() {
        @java.lang.Override
        public ExileManagerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExileManagerServiceFutureStub(channel, callOptions);
        }
      };
    return ExileManagerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateCertificateInfo creates a new TLS certificate and
     * returns the certificate info for the current organization.
     * </pre>
     */
    default void createCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCertificateInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    default void deleteCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCertificateInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    default void revokeCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeCertificateInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListCertificateInfo returns a list of certificate info for the current organization.
     * </pre>
     */
    default void listCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCertificateInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExileManagerService.
   */
  public static abstract class ExileManagerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExileManagerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExileManagerService.
   */
  public static final class ExileManagerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExileManagerServiceStub> {
    private ExileManagerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExileManagerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExileManagerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateCertificateInfo creates a new TLS certificate and
     * returns the certificate info for the current organization.
     * </pre>
     */
    public void createCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCertificateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public void deleteCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCertificateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public void revokeCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeCertificateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListCertificateInfo returns a list of certificate info for the current organization.
     * </pre>
     */
    public void listCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCertificateInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExileManagerService.
   */
  public static final class ExileManagerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExileManagerServiceBlockingStub> {
    private ExileManagerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExileManagerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExileManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateCertificateInfo creates a new TLS certificate and
     * returns the certificate info for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse createCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCertificateInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse deleteCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCertificateInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse revokeCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeCertificateInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListCertificateInfo returns a list of certificate info for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse listCertificateInfo(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCertificateInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExileManagerService.
   */
  public static final class ExileManagerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExileManagerServiceFutureStub> {
    private ExileManagerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExileManagerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExileManagerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateCertificateInfo creates a new TLS certificate and
     * returns the certificate info for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse> createCertificateInfo(
        com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCertificateInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse> deleteCertificateInfo(
        com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCertificateInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse> revokeCertificateInfo(
        com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeCertificateInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListCertificateInfo returns a list of certificate info for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse> listCertificateInfo(
        com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCertificateInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CERTIFICATE_INFO = 0;
  private static final int METHODID_DELETE_CERTIFICATE_INFO = 1;
  private static final int METHODID_REVOKE_CERTIFICATE_INFO = 2;
  private static final int METHODID_LIST_CERTIFICATE_INFO = 3;

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
        case METHODID_CREATE_CERTIFICATE_INFO:
          serviceImpl.createCertificateInfo((com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse>) responseObserver);
          break;
        case METHODID_DELETE_CERTIFICATE_INFO:
          serviceImpl.deleteCertificateInfo((com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse>) responseObserver);
          break;
        case METHODID_REVOKE_CERTIFICATE_INFO:
          serviceImpl.revokeCertificateInfo((com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse>) responseObserver);
          break;
        case METHODID_LIST_CERTIFICATE_INFO:
          serviceImpl.listCertificateInfo((com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse>) responseObserver);
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
          getCreateCertificateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse>(
                service, METHODID_CREATE_CERTIFICATE_INFO)))
        .addMethod(
          getDeleteCertificateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.exile_manager.DeleteCertificateInfoResponse>(
                service, METHODID_DELETE_CERTIFICATE_INFO)))
        .addMethod(
          getRevokeCertificateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.exile_manager.RevokeCertificateInfoResponse>(
                service, METHODID_REVOKE_CERTIFICATE_INFO)))
        .addMethod(
          getListCertificateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ListCertificateInfoResponse>(
                service, METHODID_LIST_CERTIFICATE_INFO)))
        .build();
  }

  private static abstract class ExileManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExileManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.exile_manager.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExileManagerService");
    }
  }

  private static final class ExileManagerServiceFileDescriptorSupplier
      extends ExileManagerServiceBaseDescriptorSupplier {
    ExileManagerServiceFileDescriptorSupplier() {}
  }

  private static final class ExileManagerServiceMethodDescriptorSupplier
      extends ExileManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExileManagerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExileManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExileManagerServiceFileDescriptorSupplier())
              .addMethod(getCreateCertificateInfoMethod())
              .addMethod(getDeleteCertificateInfoMethod())
              .addMethod(getRevokeCertificateInfoMethod())
              .addMethod(getListCertificateInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
