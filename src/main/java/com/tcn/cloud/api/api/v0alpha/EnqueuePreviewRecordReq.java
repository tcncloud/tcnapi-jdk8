// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/callqueue.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.EnqueuePreviewRecordReq}
 */
public final class EnqueuePreviewRecordReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.EnqueuePreviewRecordReq)
    EnqueuePreviewRecordReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EnqueuePreviewRecordReq.newBuilder() to construct.
  private EnqueuePreviewRecordReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnqueuePreviewRecordReq() {
    queueName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EnqueuePreviewRecordReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.CallqueueProto.internal_static_api_v0alpha_EnqueuePreviewRecordReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.CallqueueProto.internal_static_api_v0alpha_EnqueuePreviewRecordReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq.class, com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq.Builder.class);
  }

  public static final int RECORD_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.SimpleRecordData record_;
  /**
   * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
   * @return Whether the record field is set.
   */
  @java.lang.Override
  public boolean hasRecord() {
    return record_ != null;
  }
  /**
   * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
   * @return The record.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SimpleRecordData getRecord() {
    return record_ == null ? com.tcn.cloud.api.api.commons.SimpleRecordData.getDefaultInstance() : record_;
  }
  /**
   * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SimpleRecordDataOrBuilder getRecordOrBuilder() {
    return record_ == null ? com.tcn.cloud.api.api.commons.SimpleRecordData.getDefaultInstance() : record_;
  }

  public static final int QUEUE_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object queueName_ = "";
  /**
   * <code>string queue_name = 2 [json_name = "queueName"];</code>
   * @return The queueName.
   */
  @java.lang.Override
  public java.lang.String getQueueName() {
    java.lang.Object ref = queueName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queueName_ = s;
      return s;
    }
  }
  /**
   * <code>string queue_name = 2 [json_name = "queueName"];</code>
   * @return The bytes for queueName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueueNameBytes() {
    java.lang.Object ref = queueName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queueName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (record_ != null) {
      output.writeMessage(1, getRecord());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queueName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, queueName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (record_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecord());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queueName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, queueName_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq other = (com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq) obj;

    if (hasRecord() != other.hasRecord()) return false;
    if (hasRecord()) {
      if (!getRecord()
          .equals(other.getRecord())) return false;
    }
    if (!getQueueName()
        .equals(other.getQueueName())) return false;
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
    if (hasRecord()) {
      hash = (37 * hash) + RECORD_FIELD_NUMBER;
      hash = (53 * hash) + getRecord().hashCode();
    }
    hash = (37 * hash) + QUEUE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getQueueName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq prototype) {
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
   * Protobuf type {@code api.v0alpha.EnqueuePreviewRecordReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.EnqueuePreviewRecordReq)
      com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.CallqueueProto.internal_static_api_v0alpha_EnqueuePreviewRecordReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.CallqueueProto.internal_static_api_v0alpha_EnqueuePreviewRecordReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq.class, com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq.newBuilder()
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
      record_ = null;
      if (recordBuilder_ != null) {
        recordBuilder_.dispose();
        recordBuilder_ = null;
      }
      queueName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.CallqueueProto.internal_static_api_v0alpha_EnqueuePreviewRecordReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq build() {
      com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq result = new com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.record_ = recordBuilder_ == null
            ? record_
            : recordBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.queueName_ = queueName_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq.getDefaultInstance()) return this;
      if (other.hasRecord()) {
        mergeRecord(other.getRecord());
      }
      if (!other.getQueueName().isEmpty()) {
        queueName_ = other.queueName_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                  getRecordFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              queueName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.tcn.cloud.api.api.commons.SimpleRecordData record_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SimpleRecordData, com.tcn.cloud.api.api.commons.SimpleRecordData.Builder, com.tcn.cloud.api.api.commons.SimpleRecordDataOrBuilder> recordBuilder_;
    /**
     * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
     * @return Whether the record field is set.
     */
    public boolean hasRecord() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
     * @return The record.
     */
    public com.tcn.cloud.api.api.commons.SimpleRecordData getRecord() {
      if (recordBuilder_ == null) {
        return record_ == null ? com.tcn.cloud.api.api.commons.SimpleRecordData.getDefaultInstance() : record_;
      } else {
        return recordBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
     */
    public Builder setRecord(com.tcn.cloud.api.api.commons.SimpleRecordData value) {
      if (recordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        record_ = value;
      } else {
        recordBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
     */
    public Builder setRecord(
        com.tcn.cloud.api.api.commons.SimpleRecordData.Builder builderForValue) {
      if (recordBuilder_ == null) {
        record_ = builderForValue.build();
      } else {
        recordBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
     */
    public Builder mergeRecord(com.tcn.cloud.api.api.commons.SimpleRecordData value) {
      if (recordBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          record_ != null &&
          record_ != com.tcn.cloud.api.api.commons.SimpleRecordData.getDefaultInstance()) {
          getRecordBuilder().mergeFrom(value);
        } else {
          record_ = value;
        }
      } else {
        recordBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
     */
    public Builder clearRecord() {
      bitField0_ = (bitField0_ & ~0x00000001);
      record_ = null;
      if (recordBuilder_ != null) {
        recordBuilder_.dispose();
        recordBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
     */
    public com.tcn.cloud.api.api.commons.SimpleRecordData.Builder getRecordBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRecordFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
     */
    public com.tcn.cloud.api.api.commons.SimpleRecordDataOrBuilder getRecordOrBuilder() {
      if (recordBuilder_ != null) {
        return recordBuilder_.getMessageOrBuilder();
      } else {
        return record_ == null ?
            com.tcn.cloud.api.api.commons.SimpleRecordData.getDefaultInstance() : record_;
      }
    }
    /**
     * <code>.api.commons.SimpleRecordData record = 1 [json_name = "record"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SimpleRecordData, com.tcn.cloud.api.api.commons.SimpleRecordData.Builder, com.tcn.cloud.api.api.commons.SimpleRecordDataOrBuilder> 
        getRecordFieldBuilder() {
      if (recordBuilder_ == null) {
        recordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.SimpleRecordData, com.tcn.cloud.api.api.commons.SimpleRecordData.Builder, com.tcn.cloud.api.api.commons.SimpleRecordDataOrBuilder>(
                getRecord(),
                getParentForChildren(),
                isClean());
        record_ = null;
      }
      return recordBuilder_;
    }

    private java.lang.Object queueName_ = "";
    /**
     * <code>string queue_name = 2 [json_name = "queueName"];</code>
     * @return The queueName.
     */
    public java.lang.String getQueueName() {
      java.lang.Object ref = queueName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queueName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string queue_name = 2 [json_name = "queueName"];</code>
     * @return The bytes for queueName.
     */
    public com.google.protobuf.ByteString
        getQueueNameBytes() {
      java.lang.Object ref = queueName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queueName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string queue_name = 2 [json_name = "queueName"];</code>
     * @param value The queueName to set.
     * @return This builder for chaining.
     */
    public Builder setQueueName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      queueName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string queue_name = 2 [json_name = "queueName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQueueName() {
      queueName_ = getDefaultInstance().getQueueName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string queue_name = 2 [json_name = "queueName"];</code>
     * @param value The bytes for queueName to set.
     * @return This builder for chaining.
     */
    public Builder setQueueNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      queueName_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.EnqueuePreviewRecordReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.EnqueuePreviewRecordReq)
  private static final com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnqueuePreviewRecordReq>
      PARSER = new com.google.protobuf.AbstractParser<EnqueuePreviewRecordReq>() {
    @java.lang.Override
    public EnqueuePreviewRecordReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<EnqueuePreviewRecordReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnqueuePreviewRecordReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.EnqueuePreviewRecordReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

