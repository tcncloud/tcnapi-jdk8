// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateTaskStatusReq}
 */
public final class UpdateTaskStatusReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateTaskStatusReq)
    UpdateTaskStatusReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateTaskStatusReq.newBuilder() to construct.
  private UpdateTaskStatusReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTaskStatusReq() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateTaskStatusReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateTaskStatusReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateTaskStatusReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq.class, com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq.Builder.class);
  }

  public static final int TASK_SID_FIELD_NUMBER = 2;
  private long taskSid_ = 0L;
  /**
   * <code>int64 task_sid = 2 [json_name = "taskSid"];</code>
   * @return The taskSid.
   */
  @java.lang.Override
  public long getTaskSid() {
    return taskSid_;
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_ = 0;
  /**
   * <code>.api.commons.TaskStatus status = 3 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.api.commons.TaskStatus status = 3 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.TaskStatus getStatus() {
    com.tcn.cloud.api.api.commons.TaskStatus result = com.tcn.cloud.api.api.commons.TaskStatus.forNumber(status_);
    return result == null ? com.tcn.cloud.api.api.commons.TaskStatus.UNRECOGNIZED : result;
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
    if (taskSid_ != 0L) {
      output.writeInt64(2, taskSid_);
    }
    if (status_ != com.tcn.cloud.api.api.commons.TaskStatus.TASK_UNKNOWN.getNumber()) {
      output.writeEnum(3, status_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (taskSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, taskSid_);
    }
    if (status_ != com.tcn.cloud.api.api.commons.TaskStatus.TASK_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq other = (com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq) obj;

    if (getTaskSid()
        != other.getTaskSid()) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + TASK_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTaskSid());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateTaskStatusReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateTaskStatusReq)
      com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateTaskStatusReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateTaskStatusReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq.class, com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq.newBuilder()
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
      taskSid_ = 0L;
      status_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateTaskStatusReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq result = new com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.taskSid_ = taskSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = status_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq.getDefaultInstance()) return this;
      if (other.getTaskSid() != 0L) {
        setTaskSid(other.getTaskSid());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
            case 16: {
              taskSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 24: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
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

    private long taskSid_ ;
    /**
     * <code>int64 task_sid = 2 [json_name = "taskSid"];</code>
     * @return The taskSid.
     */
    @java.lang.Override
    public long getTaskSid() {
      return taskSid_;
    }
    /**
     * <code>int64 task_sid = 2 [json_name = "taskSid"];</code>
     * @param value The taskSid to set.
     * @return This builder for chaining.
     */
    public Builder setTaskSid(long value) {

      taskSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 task_sid = 2 [json_name = "taskSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      taskSid_ = 0L;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.api.commons.TaskStatus status = 3 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.api.commons.TaskStatus status = 3 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TaskStatus status = 3 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TaskStatus getStatus() {
      com.tcn.cloud.api.api.commons.TaskStatus result = com.tcn.cloud.api.api.commons.TaskStatus.forNumber(status_);
      return result == null ? com.tcn.cloud.api.api.commons.TaskStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.TaskStatus status = 3 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.tcn.cloud.api.api.commons.TaskStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TaskStatus status = 3 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateTaskStatusReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateTaskStatusReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTaskStatusReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTaskStatusReq>() {
    @java.lang.Override
    public UpdateTaskStatusReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTaskStatusReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTaskStatusReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

