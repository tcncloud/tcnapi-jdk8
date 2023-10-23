// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetNextQueuedTaskResponse}
 */
public final class GetNextQueuedTaskResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetNextQueuedTaskResponse)
    GetNextQueuedTaskResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNextQueuedTaskResponse.newBuilder() to construct.
  private GetNextQueuedTaskResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNextQueuedTaskResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetNextQueuedTaskResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse.class, com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse.Builder.class);
  }

  public static final int TASK_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.OmniTask task_;
  /**
   * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
   * @return Whether the task field is set.
   */
  @java.lang.Override
  public boolean hasTask() {
    return task_ != null;
  }
  /**
   * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
   * @return The task.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniTask getTask() {
    return task_ == null ? com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance() : task_;
  }
  /**
   * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniTaskOrBuilder getTaskOrBuilder() {
    return task_ == null ? com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance() : task_;
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
    if (task_ != null) {
      output.writeMessage(1, getTask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (task_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse other = (com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse) obj;

    if (hasTask() != other.hasTask()) return false;
    if (hasTask()) {
      if (!getTask()
          .equals(other.getTask())) return false;
    }
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
    if (hasTask()) {
      hash = (37 * hash) + TASK_FIELD_NUMBER;
      hash = (53 * hash) + getTask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse prototype) {
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
   * Protobuf type {@code api.v0alpha.GetNextQueuedTaskResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetNextQueuedTaskResponse)
      com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse.class, com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse.newBuilder()
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
      task_ = null;
      if (taskBuilder_ != null) {
        taskBuilder_.dispose();
        taskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse result = new com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.task_ = taskBuilder_ == null
            ? task_
            : taskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse.getDefaultInstance()) return this;
      if (other.hasTask()) {
        mergeTask(other.getTask());
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
            case 10: {
              input.readMessage(
                  getTaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.tcn.cloud.api.api.commons.OmniTask task_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniTask, com.tcn.cloud.api.api.commons.OmniTask.Builder, com.tcn.cloud.api.api.commons.OmniTaskOrBuilder> taskBuilder_;
    /**
     * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
     * @return Whether the task field is set.
     */
    public boolean hasTask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
     * @return The task.
     */
    public com.tcn.cloud.api.api.commons.OmniTask getTask() {
      if (taskBuilder_ == null) {
        return task_ == null ? com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance() : task_;
      } else {
        return taskBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
     */
    public Builder setTask(com.tcn.cloud.api.api.commons.OmniTask value) {
      if (taskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        task_ = value;
      } else {
        taskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
     */
    public Builder setTask(
        com.tcn.cloud.api.api.commons.OmniTask.Builder builderForValue) {
      if (taskBuilder_ == null) {
        task_ = builderForValue.build();
      } else {
        taskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
     */
    public Builder mergeTask(com.tcn.cloud.api.api.commons.OmniTask value) {
      if (taskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          task_ != null &&
          task_ != com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance()) {
          getTaskBuilder().mergeFrom(value);
        } else {
          task_ = value;
        }
      } else {
        taskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
     */
    public Builder clearTask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      task_ = null;
      if (taskBuilder_ != null) {
        taskBuilder_.dispose();
        taskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniTask.Builder getTaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniTaskOrBuilder getTaskOrBuilder() {
      if (taskBuilder_ != null) {
        return taskBuilder_.getMessageOrBuilder();
      } else {
        return task_ == null ?
            com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance() : task_;
      }
    }
    /**
     * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniTask, com.tcn.cloud.api.api.commons.OmniTask.Builder, com.tcn.cloud.api.api.commons.OmniTaskOrBuilder> 
        getTaskFieldBuilder() {
      if (taskBuilder_ == null) {
        taskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniTask, com.tcn.cloud.api.api.commons.OmniTask.Builder, com.tcn.cloud.api.api.commons.OmniTaskOrBuilder>(
                getTask(),
                getParentForChildren(),
                isClean());
        task_ = null;
      }
      return taskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetNextQueuedTaskResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetNextQueuedTaskResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNextQueuedTaskResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetNextQueuedTaskResponse>() {
    @java.lang.Override
    public GetNextQueuedTaskResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetNextQueuedTaskResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNextQueuedTaskResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

