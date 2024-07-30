package com.tcn.cloud.api.services.org.exile_certificate_manager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ExileCertificateManagerService is the service for managing organization's certificate info.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/org/exile_certificate_manager/v1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExileCertificateManagerServiceGrpc {

  private ExileCertificateManagerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.org.exile_certificate_manager.v1.ExileCertificateManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse> getCreateCertificateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCertificateInfo",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse> getCreateCertificateInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse> getCreateCertificateInfoMethod;
    if ((getCreateCertificateInfoMethod = ExileCertificateManagerServiceGrpc.getCreateCertificateInfoMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getCreateCertificateInfoMethod = ExileCertificateManagerServiceGrpc.getCreateCertificateInfoMethod) == null) {
          ExileCertificateManagerServiceGrpc.getCreateCertificateInfoMethod = getCreateCertificateInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCertificateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("CreateCertificateInfo"))
              .build();
        }
      }
    }
    return getCreateCertificateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse> getDeleteCertificateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCertificateInfo",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse> getDeleteCertificateInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse> getDeleteCertificateInfoMethod;
    if ((getDeleteCertificateInfoMethod = ExileCertificateManagerServiceGrpc.getDeleteCertificateInfoMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getDeleteCertificateInfoMethod = ExileCertificateManagerServiceGrpc.getDeleteCertificateInfoMethod) == null) {
          ExileCertificateManagerServiceGrpc.getDeleteCertificateInfoMethod = getDeleteCertificateInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCertificateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("DeleteCertificateInfo"))
              .build();
        }
      }
    }
    return getDeleteCertificateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse> getRevokeCertificateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeCertificateInfo",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse> getRevokeCertificateInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse> getRevokeCertificateInfoMethod;
    if ((getRevokeCertificateInfoMethod = ExileCertificateManagerServiceGrpc.getRevokeCertificateInfoMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getRevokeCertificateInfoMethod = ExileCertificateManagerServiceGrpc.getRevokeCertificateInfoMethod) == null) {
          ExileCertificateManagerServiceGrpc.getRevokeCertificateInfoMethod = getRevokeCertificateInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeCertificateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("RevokeCertificateInfo"))
              .build();
        }
      }
    }
    return getRevokeCertificateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse> getListCertificateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCertificateInfo",
      requestType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest.class,
      responseType = com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest,
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse> getListCertificateInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse> getListCertificateInfoMethod;
    if ((getListCertificateInfoMethod = ExileCertificateManagerServiceGrpc.getListCertificateInfoMethod) == null) {
      synchronized (ExileCertificateManagerServiceGrpc.class) {
        if ((getListCertificateInfoMethod = ExileCertificateManagerServiceGrpc.getListCertificateInfoMethod) == null) {
          ExileCertificateManagerServiceGrpc.getListCertificateInfoMethod = getListCertificateInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest, com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCertificateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExileCertificateManagerServiceMethodDescriptorSupplier("ListCertificateInfo"))
              .build();
        }
      }
    }
    return getListCertificateInfoMethod;
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
   * ExileCertificateManagerService is the service for managing organization's certificate info.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateCertificateInfo creates a new TLS certificate and
     * returns the certificate info for the current organization.
     * </pre>
     */
    default void createCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCertificateInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    default void deleteCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCertificateInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    default void revokeCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeCertificateInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListCertificateInfo returns a list of certificate info for the current organization.
     * </pre>
     */
    default void listCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCertificateInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExileCertificateManagerService.
   * <pre>
   * ExileCertificateManagerService is the service for managing organization's certificate info.
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
   * ExileCertificateManagerService is the service for managing organization's certificate info.
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
     * CreateCertificateInfo creates a new TLS certificate and
     * returns the certificate info for the current organization.
     * </pre>
     */
    public void createCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCertificateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public void deleteCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCertificateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public void revokeCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeCertificateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListCertificateInfo returns a list of certificate info for the current organization.
     * </pre>
     */
    public void listCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCertificateInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExileCertificateManagerService.
   * <pre>
   * ExileCertificateManagerService is the service for managing organization's certificate info.
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
     * CreateCertificateInfo creates a new TLS certificate and
     * returns the certificate info for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse createCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCertificateInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse deleteCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCertificateInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse revokeCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeCertificateInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListCertificateInfo returns a list of certificate info for the current organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse listCertificateInfo(com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCertificateInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExileCertificateManagerService.
   * <pre>
   * ExileCertificateManagerService is the service for managing organization's certificate info.
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
     * CreateCertificateInfo creates a new TLS certificate and
     * returns the certificate info for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse> createCertificateInfo(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCertificateInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse> deleteCertificateInfo(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCertificateInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeCertificateInfo deletes a certificate info for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse> revokeCertificateInfo(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeCertificateInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListCertificateInfo returns a list of certificate info for the current organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse> listCertificateInfo(
        com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest request) {
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
          serviceImpl.createCertificateInfo((com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse>) responseObserver);
          break;
        case METHODID_DELETE_CERTIFICATE_INFO:
          serviceImpl.deleteCertificateInfo((com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse>) responseObserver);
          break;
        case METHODID_REVOKE_CERTIFICATE_INFO:
          serviceImpl.revokeCertificateInfo((com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse>) responseObserver);
          break;
        case METHODID_LIST_CERTIFICATE_INFO:
          serviceImpl.listCertificateInfo((com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse>) responseObserver);
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
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1.CreateCertificateInfoResponse>(
                service, METHODID_CREATE_CERTIFICATE_INFO)))
        .addMethod(
          getDeleteCertificateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1.DeleteCertificateInfoResponse>(
                service, METHODID_DELETE_CERTIFICATE_INFO)))
        .addMethod(
          getRevokeCertificateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1.RevokeCertificateInfoResponse>(
                service, METHODID_REVOKE_CERTIFICATE_INFO)))
        .addMethod(
          getListCertificateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoRequest,
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ListCertificateInfoResponse>(
                service, METHODID_LIST_CERTIFICATE_INFO)))
        .build();
  }

  private static abstract class ExileCertificateManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExileCertificateManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1.ServiceProto.getDescriptor();
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
