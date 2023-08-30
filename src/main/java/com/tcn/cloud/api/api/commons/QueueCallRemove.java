// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/asm.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.QueueCallRemove}
 */
public final class QueueCallRemove extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.QueueCallRemove)
    QueueCallRemoveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueueCallRemove.newBuilder() to construct.
  private QueueCallRemove(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueueCallRemove() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueueCallRemove();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.AsmProto.internal_static_api_commons_QueueCallRemove_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.AsmProto.internal_static_api_commons_QueueCallRemove_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.QueueCallRemove.class, com.tcn.cloud.api.api.commons.QueueCallRemove.Builder.class);
  }

  public static final int CALLER_SID_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.CallerSid callerSid_;
  /**
   * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
   * @return Whether the callerSid field is set.
   */
  @java.lang.Override
  public boolean hasCallerSid() {
    return callerSid_ != null;
  }
  /**
   * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
   * @return The callerSid.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.CallerSid getCallerSid() {
    return callerSid_ == null ? com.tcn.cloud.api.api.commons.CallerSid.getDefaultInstance() : callerSid_;
  }
  /**
   * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.CallerSidOrBuilder getCallerSidOrBuilder() {
    return callerSid_ == null ? com.tcn.cloud.api.api.commons.CallerSid.getDefaultInstance() : callerSid_;
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
    if (callerSid_ != null) {
      output.writeMessage(1, getCallerSid());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (callerSid_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCallerSid());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.QueueCallRemove)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.QueueCallRemove other = (com.tcn.cloud.api.api.commons.QueueCallRemove) obj;

    if (hasCallerSid() != other.hasCallerSid()) return false;
    if (hasCallerSid()) {
      if (!getCallerSid()
          .equals(other.getCallerSid())) return false;
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
    if (hasCallerSid()) {
      hash = (37 * hash) + CALLER_SID_FIELD_NUMBER;
      hash = (53 * hash) + getCallerSid().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.QueueCallRemove parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.QueueCallRemove prototype) {
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
   * Protobuf type {@code api.commons.QueueCallRemove}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.QueueCallRemove)
      com.tcn.cloud.api.api.commons.QueueCallRemoveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.AsmProto.internal_static_api_commons_QueueCallRemove_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.AsmProto.internal_static_api_commons_QueueCallRemove_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.QueueCallRemove.class, com.tcn.cloud.api.api.commons.QueueCallRemove.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.QueueCallRemove.newBuilder()
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
      callerSid_ = null;
      if (callerSidBuilder_ != null) {
        callerSidBuilder_.dispose();
        callerSidBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.AsmProto.internal_static_api_commons_QueueCallRemove_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.QueueCallRemove getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.QueueCallRemove.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.QueueCallRemove build() {
      com.tcn.cloud.api.api.commons.QueueCallRemove result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.QueueCallRemove buildPartial() {
      com.tcn.cloud.api.api.commons.QueueCallRemove result = new com.tcn.cloud.api.api.commons.QueueCallRemove(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.QueueCallRemove result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callerSid_ = callerSidBuilder_ == null
            ? callerSid_
            : callerSidBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.QueueCallRemove) {
        return mergeFrom((com.tcn.cloud.api.api.commons.QueueCallRemove)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.QueueCallRemove other) {
      if (other == com.tcn.cloud.api.api.commons.QueueCallRemove.getDefaultInstance()) return this;
      if (other.hasCallerSid()) {
        mergeCallerSid(other.getCallerSid());
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
                  getCallerSidFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.CallerSid callerSid_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.CallerSid, com.tcn.cloud.api.api.commons.CallerSid.Builder, com.tcn.cloud.api.api.commons.CallerSidOrBuilder> callerSidBuilder_;
    /**
     * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
     * @return Whether the callerSid field is set.
     */
    public boolean hasCallerSid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
     * @return The callerSid.
     */
    public com.tcn.cloud.api.api.commons.CallerSid getCallerSid() {
      if (callerSidBuilder_ == null) {
        return callerSid_ == null ? com.tcn.cloud.api.api.commons.CallerSid.getDefaultInstance() : callerSid_;
      } else {
        return callerSidBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
     */
    public Builder setCallerSid(com.tcn.cloud.api.api.commons.CallerSid value) {
      if (callerSidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        callerSid_ = value;
      } else {
        callerSidBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
     */
    public Builder setCallerSid(
        com.tcn.cloud.api.api.commons.CallerSid.Builder builderForValue) {
      if (callerSidBuilder_ == null) {
        callerSid_ = builderForValue.build();
      } else {
        callerSidBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
     */
    public Builder mergeCallerSid(com.tcn.cloud.api.api.commons.CallerSid value) {
      if (callerSidBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          callerSid_ != null &&
          callerSid_ != com.tcn.cloud.api.api.commons.CallerSid.getDefaultInstance()) {
          getCallerSidBuilder().mergeFrom(value);
        } else {
          callerSid_ = value;
        }
      } else {
        callerSidBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
     */
    public Builder clearCallerSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callerSid_ = null;
      if (callerSidBuilder_ != null) {
        callerSidBuilder_.dispose();
        callerSidBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
     */
    public com.tcn.cloud.api.api.commons.CallerSid.Builder getCallerSidBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCallerSidFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
     */
    public com.tcn.cloud.api.api.commons.CallerSidOrBuilder getCallerSidOrBuilder() {
      if (callerSidBuilder_ != null) {
        return callerSidBuilder_.getMessageOrBuilder();
      } else {
        return callerSid_ == null ?
            com.tcn.cloud.api.api.commons.CallerSid.getDefaultInstance() : callerSid_;
      }
    }
    /**
     * <code>.api.commons.CallerSid caller_sid = 1 [json_name = "callerSid"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.CallerSid, com.tcn.cloud.api.api.commons.CallerSid.Builder, com.tcn.cloud.api.api.commons.CallerSidOrBuilder> 
        getCallerSidFieldBuilder() {
      if (callerSidBuilder_ == null) {
        callerSidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.CallerSid, com.tcn.cloud.api.api.commons.CallerSid.Builder, com.tcn.cloud.api.api.commons.CallerSidOrBuilder>(
                getCallerSid(),
                getParentForChildren(),
                isClean());
        callerSid_ = null;
      }
      return callerSidBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.QueueCallRemove)
  }

  // @@protoc_insertion_point(class_scope:api.commons.QueueCallRemove)
  private static final com.tcn.cloud.api.api.commons.QueueCallRemove DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.QueueCallRemove();
  }

  public static com.tcn.cloud.api.api.commons.QueueCallRemove getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueueCallRemove>
      PARSER = new com.google.protobuf.AbstractParser<QueueCallRemove>() {
    @java.lang.Override
    public QueueCallRemove parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueueCallRemove> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueueCallRemove> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.QueueCallRemove getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

