// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/srec/service.proto

package com.tcn.cloud.api.api.v1alpha1.srec;

/**
 * <pre>
 * DeleteScreenRecordingRequest is a request for deleting a screen recording.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.srec.DeleteScreenRecordingRequest}
 */
public final class DeleteScreenRecordingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.srec.DeleteScreenRecordingRequest)
    DeleteScreenRecordingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteScreenRecordingRequest.newBuilder() to construct.
  private DeleteScreenRecordingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteScreenRecordingRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteScreenRecordingRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.srec.ServiceProto.internal_static_api_v1alpha1_srec_DeleteScreenRecordingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.srec.ServiceProto.internal_static_api_v1alpha1_srec_DeleteScreenRecordingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest.class, com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest.Builder.class);
  }

  public static final int SESSION_ID_FIELD_NUMBER = 1;
  private long sessionId_ = 0L;
  /**
   * <pre>
   * Required. The unique id of the screen recording to be deleted.
   * </pre>
   *
   * <code>int64 session_id = 1 [json_name = "sessionId"];</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public long getSessionId() {
    return sessionId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (sessionId_ != 0L) {
      output.writeInt64(1, sessionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, sessionId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest other = (com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest) obj;

    if (getSessionId()
        != other.getSessionId()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * DeleteScreenRecordingRequest is a request for deleting a screen recording.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.srec.DeleteScreenRecordingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.srec.DeleteScreenRecordingRequest)
      com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.srec.ServiceProto.internal_static_api_v1alpha1_srec_DeleteScreenRecordingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.srec.ServiceProto.internal_static_api_v1alpha1_srec_DeleteScreenRecordingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest.class, com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sessionId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.srec.ServiceProto.internal_static_api_v1alpha1_srec_DeleteScreenRecordingRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest build() {
      com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest result = new com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionId_ = sessionId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest.getDefaultInstance()) return this;
      if (other.getSessionId() != 0L) {
        setSessionId(other.getSessionId());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              sessionId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long sessionId_ ;
    /**
     * <pre>
     * Required. The unique id of the screen recording to be deleted.
     * </pre>
     *
     * <code>int64 session_id = 1 [json_name = "sessionId"];</code>
     * @return The sessionId.
     */
    @java.lang.Override
    public long getSessionId() {
      return sessionId_;
    }
    /**
     * <pre>
     * Required. The unique id of the screen recording to be deleted.
     * </pre>
     *
     * <code>int64 session_id = 1 [json_name = "sessionId"];</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(long value) {

      sessionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique id of the screen recording to be deleted.
     * </pre>
     *
     * <code>int64 session_id = 1 [json_name = "sessionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sessionId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.srec.DeleteScreenRecordingRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.srec.DeleteScreenRecordingRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteScreenRecordingRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteScreenRecordingRequest>() {
    @java.lang.Override
    public DeleteScreenRecordingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DeleteScreenRecordingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteScreenRecordingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

