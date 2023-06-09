// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateConsentTopicReq}
 */
public final class UpdateConsentTopicReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateConsentTopicReq)
    UpdateConsentTopicReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateConsentTopicReq.newBuilder() to construct.
  private UpdateConsentTopicReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateConsentTopicReq() {
    originalTopic_ = "";
    newTopic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateConsentTopicReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateConsentTopicReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateConsentTopicReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq.class, com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq.Builder.class);
  }

  public static final int ORIGINAL_TOPIC_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object originalTopic_ = "";
  /**
   * <code>string original_topic = 1 [json_name = "originalTopic"];</code>
   * @return The originalTopic.
   */
  @java.lang.Override
  public java.lang.String getOriginalTopic() {
    java.lang.Object ref = originalTopic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      originalTopic_ = s;
      return s;
    }
  }
  /**
   * <code>string original_topic = 1 [json_name = "originalTopic"];</code>
   * @return The bytes for originalTopic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOriginalTopicBytes() {
    java.lang.Object ref = originalTopic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      originalTopic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_TOPIC_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newTopic_ = "";
  /**
   * <code>string new_topic = 3 [json_name = "newTopic"];</code>
   * @return The newTopic.
   */
  @java.lang.Override
  public java.lang.String getNewTopic() {
    java.lang.Object ref = newTopic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newTopic_ = s;
      return s;
    }
  }
  /**
   * <code>string new_topic = 3 [json_name = "newTopic"];</code>
   * @return The bytes for newTopic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewTopicBytes() {
    java.lang.Object ref = newTopic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newTopic_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originalTopic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, originalTopic_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newTopic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, newTopic_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originalTopic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, originalTopic_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newTopic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, newTopic_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq other = (com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq) obj;

    if (!getOriginalTopic()
        .equals(other.getOriginalTopic())) return false;
    if (!getNewTopic()
        .equals(other.getNewTopic())) return false;
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
    hash = (37 * hash) + ORIGINAL_TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getOriginalTopic().hashCode();
    hash = (37 * hash) + NEW_TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getNewTopic().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateConsentTopicReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateConsentTopicReq)
      com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateConsentTopicReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateConsentTopicReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq.class, com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq.newBuilder()
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
      originalTopic_ = "";
      newTopic_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateConsentTopicReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq result = new com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.originalTopic_ = originalTopic_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.newTopic_ = newTopic_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq.getDefaultInstance()) return this;
      if (!other.getOriginalTopic().isEmpty()) {
        originalTopic_ = other.originalTopic_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNewTopic().isEmpty()) {
        newTopic_ = other.newTopic_;
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
              originalTopic_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              newTopic_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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

    private java.lang.Object originalTopic_ = "";
    /**
     * <code>string original_topic = 1 [json_name = "originalTopic"];</code>
     * @return The originalTopic.
     */
    public java.lang.String getOriginalTopic() {
      java.lang.Object ref = originalTopic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        originalTopic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string original_topic = 1 [json_name = "originalTopic"];</code>
     * @return The bytes for originalTopic.
     */
    public com.google.protobuf.ByteString
        getOriginalTopicBytes() {
      java.lang.Object ref = originalTopic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        originalTopic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string original_topic = 1 [json_name = "originalTopic"];</code>
     * @param value The originalTopic to set.
     * @return This builder for chaining.
     */
    public Builder setOriginalTopic(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      originalTopic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string original_topic = 1 [json_name = "originalTopic"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginalTopic() {
      originalTopic_ = getDefaultInstance().getOriginalTopic();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string original_topic = 1 [json_name = "originalTopic"];</code>
     * @param value The bytes for originalTopic to set.
     * @return This builder for chaining.
     */
    public Builder setOriginalTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      originalTopic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object newTopic_ = "";
    /**
     * <code>string new_topic = 3 [json_name = "newTopic"];</code>
     * @return The newTopic.
     */
    public java.lang.String getNewTopic() {
      java.lang.Object ref = newTopic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newTopic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string new_topic = 3 [json_name = "newTopic"];</code>
     * @return The bytes for newTopic.
     */
    public com.google.protobuf.ByteString
        getNewTopicBytes() {
      java.lang.Object ref = newTopic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newTopic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string new_topic = 3 [json_name = "newTopic"];</code>
     * @param value The newTopic to set.
     * @return This builder for chaining.
     */
    public Builder setNewTopic(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newTopic_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string new_topic = 3 [json_name = "newTopic"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewTopic() {
      newTopic_ = getDefaultInstance().getNewTopic();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string new_topic = 3 [json_name = "newTopic"];</code>
     * @param value The bytes for newTopic to set.
     * @return This builder for chaining.
     */
    public Builder setNewTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newTopic_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateConsentTopicReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateConsentTopicReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateConsentTopicReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateConsentTopicReq>() {
    @java.lang.Override
    public UpdateConsentTopicReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateConsentTopicReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateConsentTopicReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateConsentTopicReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

