package com.tcn.cloud.api.api.v1alpha1.projects;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Projects service is the public api for the omni/projects service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/projects/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectsGrpc {

  private ProjectsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.projects.Projects";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest,
      com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse> getListProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjects",
      requestType = com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest,
      com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse> getListProjectsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest, com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse> getListProjectsMethod;
    if ((getListProjectsMethod = ProjectsGrpc.getListProjectsMethod) == null) {
      synchronized (ProjectsGrpc.class) {
        if ((getListProjectsMethod = ProjectsGrpc.getListProjectsMethod) == null) {
          ProjectsGrpc.getListProjectsMethod = getListProjectsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest, com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsMethodDescriptorSupplier("ListProjects"))
              .build();
        }
      }
    }
    return getListProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse> getGetProjectByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjectById",
      requestType = com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse> getGetProjectByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest, com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse> getGetProjectByIdMethod;
    if ((getGetProjectByIdMethod = ProjectsGrpc.getGetProjectByIdMethod) == null) {
      synchronized (ProjectsGrpc.class) {
        if ((getGetProjectByIdMethod = ProjectsGrpc.getGetProjectByIdMethod) == null) {
          ProjectsGrpc.getGetProjectByIdMethod = getGetProjectByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest, com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjectById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectsMethodDescriptorSupplier("GetProjectById"))
              .build();
        }
      }
    }
    return getGetProjectByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectsStub>() {
        @java.lang.Override
        public ProjectsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectsStub(channel, callOptions);
        }
      };
    return ProjectsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectsBlockingStub>() {
        @java.lang.Override
        public ProjectsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectsBlockingStub(channel, callOptions);
        }
      };
    return ProjectsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectsFutureStub>() {
        @java.lang.Override
        public ProjectsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectsFutureStub(channel, callOptions);
        }
      };
    return ProjectsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Projects service is the public api for the omni/projects service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Public method to list projects
     * </pre>
     */
    default void listProjects(com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to get project by project Id
     * </pre>
     */
    default void getProjectById(com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Projects.
   * <pre>
   * Projects service is the public api for the omni/projects service.
   * </pre>
   */
  public static abstract class ProjectsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProjectsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Projects.
   * <pre>
   * Projects service is the public api for the omni/projects service.
   * </pre>
   */
  public static final class ProjectsStub
      extends io.grpc.stub.AbstractAsyncStub<ProjectsStub> {
    private ProjectsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Public method to list projects
     * </pre>
     */
    public void listProjects(com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to get project by project Id
     * </pre>
     */
    public void getProjectById(com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Projects.
   * <pre>
   * Projects service is the public api for the omni/projects service.
   * </pre>
   */
  public static final class ProjectsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProjectsBlockingStub> {
    private ProjectsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Public method to list projects
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse listProjects(com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to get project by project Id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse getProjectById(com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Projects.
   * <pre>
   * Projects service is the public api for the omni/projects service.
   * </pre>
   */
  public static final class ProjectsFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProjectsFutureStub> {
    private ProjectsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Public method to list projects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse> listProjects(
        com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to get project by project Id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse> getProjectById(
        com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PROJECTS = 0;
  private static final int METHODID_GET_PROJECT_BY_ID = 1;

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
        case METHODID_LIST_PROJECTS:
          serviceImpl.listProjects((com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT_BY_ID:
          serviceImpl.getProjectById((com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse>) responseObserver);
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
          getListProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsRequest,
              com.tcn.cloud.api.api.v1alpha1.projects.ListProjectsResponse>(
                service, METHODID_LIST_PROJECTS)))
        .addMethod(
          getGetProjectByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdRequest,
              com.tcn.cloud.api.api.v1alpha1.projects.GetProjectByIdResponse>(
                service, METHODID_GET_PROJECT_BY_ID)))
        .build();
  }

  private static abstract class ProjectsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.projects.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Projects");
    }
  }

  private static final class ProjectsFileDescriptorSupplier
      extends ProjectsBaseDescriptorSupplier {
    ProjectsFileDescriptorSupplier() {}
  }

  private static final class ProjectsMethodDescriptorSupplier
      extends ProjectsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProjectsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProjectsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectsFileDescriptorSupplier())
              .addMethod(getListProjectsMethod())
              .addMethod(getGetProjectByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
