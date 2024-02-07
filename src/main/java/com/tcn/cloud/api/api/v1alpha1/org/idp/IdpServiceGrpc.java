package com.tcn.cloud.api.api.v1alpha1.org.idp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/idp/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IdpServiceGrpc {

  private IdpServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.idp.IdpService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest,
      com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse> getCreateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClient",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest,
      com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse> getCreateClientMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest, com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse> getCreateClientMethod;
    if ((getCreateClientMethod = IdpServiceGrpc.getCreateClientMethod) == null) {
      synchronized (IdpServiceGrpc.class) {
        if ((getCreateClientMethod = IdpServiceGrpc.getCreateClientMethod) == null) {
          IdpServiceGrpc.getCreateClientMethod = getCreateClientMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest, com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdpServiceMethodDescriptorSupplier("CreateClient"))
              .build();
        }
      }
    }
    return getCreateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest,
      com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse> getUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClient",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest,
      com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse> getUpdateClientMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest, com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse> getUpdateClientMethod;
    if ((getUpdateClientMethod = IdpServiceGrpc.getUpdateClientMethod) == null) {
      synchronized (IdpServiceGrpc.class) {
        if ((getUpdateClientMethod = IdpServiceGrpc.getUpdateClientMethod) == null) {
          IdpServiceGrpc.getUpdateClientMethod = getUpdateClientMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest, com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdpServiceMethodDescriptorSupplier("UpdateClient"))
              .build();
        }
      }
    }
    return getUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest,
      com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClient",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest,
      com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest, com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse> getDeleteClientMethod;
    if ((getDeleteClientMethod = IdpServiceGrpc.getDeleteClientMethod) == null) {
      synchronized (IdpServiceGrpc.class) {
        if ((getDeleteClientMethod = IdpServiceGrpc.getDeleteClientMethod) == null) {
          IdpServiceGrpc.getDeleteClientMethod = getDeleteClientMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest, com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdpServiceMethodDescriptorSupplier("DeleteClient"))
              .build();
        }
      }
    }
    return getDeleteClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse> getListClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListClients",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse> getListClientsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest, com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse> getListClientsMethod;
    if ((getListClientsMethod = IdpServiceGrpc.getListClientsMethod) == null) {
      synchronized (IdpServiceGrpc.class) {
        if ((getListClientsMethod = IdpServiceGrpc.getListClientsMethod) == null) {
          IdpServiceGrpc.getListClientsMethod = getListClientsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest, com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdpServiceMethodDescriptorSupplier("ListClients"))
              .build();
        }
      }
    }
    return getListClientsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdpServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdpServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdpServiceStub>() {
        @java.lang.Override
        public IdpServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdpServiceStub(channel, callOptions);
        }
      };
    return IdpServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdpServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdpServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdpServiceBlockingStub>() {
        @java.lang.Override
        public IdpServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdpServiceBlockingStub(channel, callOptions);
        }
      };
    return IdpServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdpServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdpServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdpServiceFutureStub>() {
        @java.lang.Override
        public IdpServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdpServiceFutureStub(channel, callOptions);
        }
      };
    return IdpServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateClient creates a client.
     * </pre>
     */
    default void createClient(com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateClient updates an existing client
     * </pre>
     */
    default void updateClient(com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteClient deletes the provided client.
     * </pre>
     */
    default void deleteClient(com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListClients returns all clients.
     * </pre>
     */
    default void listClients(com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListClientsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IdpService.
   */
  public static abstract class IdpServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IdpServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IdpService.
   */
  public static final class IdpServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IdpServiceStub> {
    private IdpServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdpServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdpServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateClient creates a client.
     * </pre>
     */
    public void createClient(com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateClient updates an existing client
     * </pre>
     */
    public void updateClient(com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteClient deletes the provided client.
     * </pre>
     */
    public void deleteClient(com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListClients returns all clients.
     * </pre>
     */
    public void listClients(com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListClientsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IdpService.
   */
  public static final class IdpServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IdpServiceBlockingStub> {
    private IdpServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdpServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdpServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateClient creates a client.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse createClient(com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateClient updates an existing client
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse updateClient(com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteClient deletes the provided client.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse deleteClient(com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListClients returns all clients.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse listClients(com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListClientsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IdpService.
   */
  public static final class IdpServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IdpServiceFutureStub> {
    private IdpServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdpServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdpServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateClient creates a client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse> createClient(
        com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateClient updates an existing client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse> updateClient(
        com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteClient deletes the provided client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse> deleteClient(
        com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListClients returns all clients.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse> listClients(
        com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListClientsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CLIENT = 0;
  private static final int METHODID_UPDATE_CLIENT = 1;
  private static final int METHODID_DELETE_CLIENT = 2;
  private static final int METHODID_LIST_CLIENTS = 3;

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
        case METHODID_CREATE_CLIENT:
          serviceImpl.createClient((com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT:
          serviceImpl.updateClient((com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse>) responseObserver);
          break;
        case METHODID_LIST_CLIENTS:
          serviceImpl.listClients((com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse>) responseObserver);
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
          getCreateClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRequest,
              com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResponse>(
                service, METHODID_CREATE_CLIENT)))
        .addMethod(
          getUpdateClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientRequest,
              com.tcn.cloud.api.api.v1alpha1.org.idp.UpdateClientResponse>(
                service, METHODID_UPDATE_CLIENT)))
        .addMethod(
          getDeleteClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientRequest,
              com.tcn.cloud.api.api.v1alpha1.org.idp.DeleteClientResponse>(
                service, METHODID_DELETE_CLIENT)))
        .addMethod(
          getListClientsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.idp.ListClientsResponse>(
                service, METHODID_LIST_CLIENTS)))
        .build();
  }

  private static abstract class IdpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdpServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.idp.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IdpService");
    }
  }

  private static final class IdpServiceFileDescriptorSupplier
      extends IdpServiceBaseDescriptorSupplier {
    IdpServiceFileDescriptorSupplier() {}
  }

  private static final class IdpServiceMethodDescriptorSupplier
      extends IdpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IdpServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IdpServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdpServiceFileDescriptorSupplier())
              .addMethod(getCreateClientMethod())
              .addMethod(getUpdateClientMethod())
              .addMethod(getDeleteClientMethod())
              .addMethod(getListClientsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
