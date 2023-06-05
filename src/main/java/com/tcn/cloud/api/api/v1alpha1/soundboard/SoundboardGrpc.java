package com.tcn.cloud.api.api.v1alpha1.soundboard;

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
    comments = "Source: api/v1alpha1/soundboard/service.proto")
public final class SoundboardGrpc {

  private SoundboardGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.soundboard.Soundboard";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes> getGetSoundboardFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSoundboardFile",
      requestType = com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes> getGetSoundboardFileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq, com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes> getGetSoundboardFileMethod;
    if ((getGetSoundboardFileMethod = SoundboardGrpc.getGetSoundboardFileMethod) == null) {
      synchronized (SoundboardGrpc.class) {
        if ((getGetSoundboardFileMethod = SoundboardGrpc.getGetSoundboardFileMethod) == null) {
          SoundboardGrpc.getGetSoundboardFileMethod = getGetSoundboardFileMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq, com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.soundboard.Soundboard", "GetSoundboardFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SoundboardMethodDescriptorSupplier("GetSoundboardFile"))
                  .build();
          }
        }
     }
     return getGetSoundboardFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes> getCreateSoundboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSoundboard",
      requestType = com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes> getCreateSoundboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq, com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes> getCreateSoundboardMethod;
    if ((getCreateSoundboardMethod = SoundboardGrpc.getCreateSoundboardMethod) == null) {
      synchronized (SoundboardGrpc.class) {
        if ((getCreateSoundboardMethod = SoundboardGrpc.getCreateSoundboardMethod) == null) {
          SoundboardGrpc.getCreateSoundboardMethod = getCreateSoundboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq, com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.soundboard.Soundboard", "CreateSoundboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SoundboardMethodDescriptorSupplier("CreateSoundboard"))
                  .build();
          }
        }
     }
     return getCreateSoundboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes> getListSoundboardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSoundboards",
      requestType = com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes> getListSoundboardsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq, com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes> getListSoundboardsMethod;
    if ((getListSoundboardsMethod = SoundboardGrpc.getListSoundboardsMethod) == null) {
      synchronized (SoundboardGrpc.class) {
        if ((getListSoundboardsMethod = SoundboardGrpc.getListSoundboardsMethod) == null) {
          SoundboardGrpc.getListSoundboardsMethod = getListSoundboardsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq, com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.soundboard.Soundboard", "ListSoundboards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SoundboardMethodDescriptorSupplier("ListSoundboards"))
                  .build();
          }
        }
     }
     return getListSoundboardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes> getUpdateSoundboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSoundboard",
      requestType = com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes> getUpdateSoundboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq, com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes> getUpdateSoundboardMethod;
    if ((getUpdateSoundboardMethod = SoundboardGrpc.getUpdateSoundboardMethod) == null) {
      synchronized (SoundboardGrpc.class) {
        if ((getUpdateSoundboardMethod = SoundboardGrpc.getUpdateSoundboardMethod) == null) {
          SoundboardGrpc.getUpdateSoundboardMethod = getUpdateSoundboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq, com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.soundboard.Soundboard", "UpdateSoundboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SoundboardMethodDescriptorSupplier("UpdateSoundboard"))
                  .build();
          }
        }
     }
     return getUpdateSoundboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes> getDeleteSoundboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSoundboard",
      requestType = com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq,
      com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes> getDeleteSoundboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq, com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes> getDeleteSoundboardMethod;
    if ((getDeleteSoundboardMethod = SoundboardGrpc.getDeleteSoundboardMethod) == null) {
      synchronized (SoundboardGrpc.class) {
        if ((getDeleteSoundboardMethod = SoundboardGrpc.getDeleteSoundboardMethod) == null) {
          SoundboardGrpc.getDeleteSoundboardMethod = getDeleteSoundboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq, com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.soundboard.Soundboard", "DeleteSoundboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SoundboardMethodDescriptorSupplier("DeleteSoundboard"))
                  .build();
          }
        }
     }
     return getDeleteSoundboardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SoundboardStub newStub(io.grpc.Channel channel) {
    return new SoundboardStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SoundboardBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SoundboardBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SoundboardFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SoundboardFutureStub(channel);
  }

  /**
   */
  public static abstract class SoundboardImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetSoundboardFile streams back segments of the audio file stored in rec
     * corresponding to the provided soundboard id and org id.
     * </pre>
     */
    public void getSoundboardFile(com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSoundboardFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSoundboard takes in a stream of metadata and audio file segments.
     * The first expected message should contain SoundboardDetails, then following
     * messages will be chunks of audio file data, which is then aggregated and put
     * into rec. The generated soundboard id is returned.
     * </pre>
     */
    public void createSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSoundboardMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSoundboards returns all of the metadata for soundboards corresponding
     * corresponding to a given org id.
     * </pre>
     */
    public void listSoundboards(com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSoundboardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSondboard updates a soundboard's metadata in the soundboard table.
     * </pre>
     */
    public void updateSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSoundboardMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSondboard deletes a soundboard's metadata from the soundboard table.
     * </pre>
     */
    public void deleteSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSoundboardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSoundboardFileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq,
                com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes>(
                  this, METHODID_GET_SOUNDBOARD_FILE)))
          .addMethod(
            getCreateSoundboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq,
                com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes>(
                  this, METHODID_CREATE_SOUNDBOARD)))
          .addMethod(
            getListSoundboardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq,
                com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes>(
                  this, METHODID_LIST_SOUNDBOARDS)))
          .addMethod(
            getUpdateSoundboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq,
                com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes>(
                  this, METHODID_UPDATE_SOUNDBOARD)))
          .addMethod(
            getDeleteSoundboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq,
                com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes>(
                  this, METHODID_DELETE_SOUNDBOARD)))
          .build();
    }
  }

  /**
   */
  public static final class SoundboardStub extends io.grpc.stub.AbstractStub<SoundboardStub> {
    private SoundboardStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SoundboardStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SoundboardStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SoundboardStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSoundboardFile streams back segments of the audio file stored in rec
     * corresponding to the provided soundboard id and org id.
     * </pre>
     */
    public void getSoundboardFile(com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetSoundboardFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSoundboard takes in a stream of metadata and audio file segments.
     * The first expected message should contain SoundboardDetails, then following
     * messages will be chunks of audio file data, which is then aggregated and put
     * into rec. The generated soundboard id is returned.
     * </pre>
     */
    public void createSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSoundboardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListSoundboards returns all of the metadata for soundboards corresponding
     * corresponding to a given org id.
     * </pre>
     */
    public void listSoundboards(com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSoundboardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSondboard updates a soundboard's metadata in the soundboard table.
     * </pre>
     */
    public void updateSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSoundboardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSondboard deletes a soundboard's metadata from the soundboard table.
     * </pre>
     */
    public void deleteSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSoundboardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SoundboardBlockingStub extends io.grpc.stub.AbstractStub<SoundboardBlockingStub> {
    private SoundboardBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SoundboardBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SoundboardBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SoundboardBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSoundboardFile streams back segments of the audio file stored in rec
     * corresponding to the provided soundboard id and org id.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes> getSoundboardFile(
        com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetSoundboardFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSoundboard takes in a stream of metadata and audio file segments.
     * The first expected message should contain SoundboardDetails, then following
     * messages will be chunks of audio file data, which is then aggregated and put
     * into rec. The generated soundboard id is returned.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes createSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateSoundboardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSoundboards returns all of the metadata for soundboards corresponding
     * corresponding to a given org id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes listSoundboards(com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq request) {
      return blockingUnaryCall(
          getChannel(), getListSoundboardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSondboard updates a soundboard's metadata in the soundboard table.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes updateSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSoundboardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSondboard deletes a soundboard's metadata from the soundboard table.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes deleteSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSoundboardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SoundboardFutureStub extends io.grpc.stub.AbstractStub<SoundboardFutureStub> {
    private SoundboardFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SoundboardFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SoundboardFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SoundboardFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateSoundboard takes in a stream of metadata and audio file segments.
     * The first expected message should contain SoundboardDetails, then following
     * messages will be chunks of audio file data, which is then aggregated and put
     * into rec. The generated soundboard id is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes> createSoundboard(
        com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSoundboardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSoundboards returns all of the metadata for soundboards corresponding
     * corresponding to a given org id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes> listSoundboards(
        com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSoundboardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSondboard updates a soundboard's metadata in the soundboard table.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes> updateSoundboard(
        com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSoundboardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSondboard deletes a soundboard's metadata from the soundboard table.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes> deleteSoundboard(
        com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSoundboardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SOUNDBOARD_FILE = 0;
  private static final int METHODID_CREATE_SOUNDBOARD = 1;
  private static final int METHODID_LIST_SOUNDBOARDS = 2;
  private static final int METHODID_UPDATE_SOUNDBOARD = 3;
  private static final int METHODID_DELETE_SOUNDBOARD = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SoundboardImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SoundboardImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SOUNDBOARD_FILE:
          serviceImpl.getSoundboardFile((com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes>) responseObserver);
          break;
        case METHODID_CREATE_SOUNDBOARD:
          serviceImpl.createSoundboard((com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardRes>) responseObserver);
          break;
        case METHODID_LIST_SOUNDBOARDS:
          serviceImpl.listSoundboards((com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.ListSoundboardsRes>) responseObserver);
          break;
        case METHODID_UPDATE_SOUNDBOARD:
          serviceImpl.updateSoundboard((com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes>) responseObserver);
          break;
        case METHODID_DELETE_SOUNDBOARD:
          serviceImpl.deleteSoundboard((com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.soundboard.DeleteSoundboardRes>) responseObserver);
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

  private static abstract class SoundboardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SoundboardBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Soundboard");
    }
  }

  private static final class SoundboardFileDescriptorSupplier
      extends SoundboardBaseDescriptorSupplier {
    SoundboardFileDescriptorSupplier() {}
  }

  private static final class SoundboardMethodDescriptorSupplier
      extends SoundboardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SoundboardMethodDescriptorSupplier(String methodName) {
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
      synchronized (SoundboardGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SoundboardFileDescriptorSupplier())
              .addMethod(getGetSoundboardFileMethod())
              .addMethod(getCreateSoundboardMethod())
              .addMethod(getListSoundboardsMethod())
              .addMethod(getUpdateSoundboardMethod())
              .addMethod(getDeleteSoundboardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
