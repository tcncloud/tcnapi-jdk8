// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/cbs.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetNextScheduledCallbackWithDetailsRes}
 */
public final class GetNextScheduledCallbackWithDetailsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetNextScheduledCallbackWithDetailsRes)
    GetNextScheduledCallbackWithDetailsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNextScheduledCallbackWithDetailsRes.newBuilder() to construct.
  private GetNextScheduledCallbackWithDetailsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNextScheduledCallbackWithDetailsRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetNextScheduledCallbackWithDetailsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_GetNextScheduledCallbackWithDetailsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_GetNextScheduledCallbackWithDetailsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes.class, com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes.Builder.class);
  }

  public static final int SCHEDULED_CALLBACK_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails scheduledCallback_;
  /**
   * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
   * @return Whether the scheduledCallback field is set.
   */
  @java.lang.Override
  public boolean hasScheduledCallback() {
    return scheduledCallback_ != null;
  }
  /**
   * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
   * @return The scheduledCallback.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails getScheduledCallback() {
    return scheduledCallback_ == null ? com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.getDefaultInstance() : scheduledCallback_;
  }
  /**
   * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetailsOrBuilder getScheduledCallbackOrBuilder() {
    return scheduledCallback_ == null ? com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.getDefaultInstance() : scheduledCallback_;
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
    if (scheduledCallback_ != null) {
      output.writeMessage(1, getScheduledCallback());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scheduledCallback_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getScheduledCallback());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes other = (com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes) obj;

    if (hasScheduledCallback() != other.hasScheduledCallback()) return false;
    if (hasScheduledCallback()) {
      if (!getScheduledCallback()
          .equals(other.getScheduledCallback())) return false;
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
    if (hasScheduledCallback()) {
      hash = (37 * hash) + SCHEDULED_CALLBACK_FIELD_NUMBER;
      hash = (53 * hash) + getScheduledCallback().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes prototype) {
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
   * Protobuf type {@code api.v0alpha.GetNextScheduledCallbackWithDetailsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetNextScheduledCallbackWithDetailsRes)
      com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_GetNextScheduledCallbackWithDetailsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_GetNextScheduledCallbackWithDetailsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes.class, com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes.newBuilder()
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
      scheduledCallback_ = null;
      if (scheduledCallbackBuilder_ != null) {
        scheduledCallbackBuilder_.dispose();
        scheduledCallbackBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_GetNextScheduledCallbackWithDetailsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes build() {
      com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes result = new com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scheduledCallback_ = scheduledCallbackBuilder_ == null
            ? scheduledCallback_
            : scheduledCallbackBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes.getDefaultInstance()) return this;
      if (other.hasScheduledCallback()) {
        mergeScheduledCallback(other.getScheduledCallback());
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
                  getScheduledCallbackFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails scheduledCallback_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails, com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.Builder, com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetailsOrBuilder> scheduledCallbackBuilder_;
    /**
     * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
     * @return Whether the scheduledCallback field is set.
     */
    public boolean hasScheduledCallback() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
     * @return The scheduledCallback.
     */
    public com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails getScheduledCallback() {
      if (scheduledCallbackBuilder_ == null) {
        return scheduledCallback_ == null ? com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.getDefaultInstance() : scheduledCallback_;
      } else {
        return scheduledCallbackBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
     */
    public Builder setScheduledCallback(com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails value) {
      if (scheduledCallbackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scheduledCallback_ = value;
      } else {
        scheduledCallbackBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
     */
    public Builder setScheduledCallback(
        com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.Builder builderForValue) {
      if (scheduledCallbackBuilder_ == null) {
        scheduledCallback_ = builderForValue.build();
      } else {
        scheduledCallbackBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
     */
    public Builder mergeScheduledCallback(com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails value) {
      if (scheduledCallbackBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          scheduledCallback_ != null &&
          scheduledCallback_ != com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.getDefaultInstance()) {
          getScheduledCallbackBuilder().mergeFrom(value);
        } else {
          scheduledCallback_ = value;
        }
      } else {
        scheduledCallbackBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
     */
    public Builder clearScheduledCallback() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scheduledCallback_ = null;
      if (scheduledCallbackBuilder_ != null) {
        scheduledCallbackBuilder_.dispose();
        scheduledCallbackBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.Builder getScheduledCallbackBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScheduledCallbackFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetailsOrBuilder getScheduledCallbackOrBuilder() {
      if (scheduledCallbackBuilder_ != null) {
        return scheduledCallbackBuilder_.getMessageOrBuilder();
      } else {
        return scheduledCallback_ == null ?
            com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.getDefaultInstance() : scheduledCallback_;
      }
    }
    /**
     * <code>.api.v0alpha.ScheduledCallbackWithDetails scheduled_callback = 1 [json_name = "scheduledCallback"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails, com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.Builder, com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetailsOrBuilder> 
        getScheduledCallbackFieldBuilder() {
      if (scheduledCallbackBuilder_ == null) {
        scheduledCallbackBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails, com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetails.Builder, com.tcn.cloud.api.api.v0alpha.ScheduledCallbackWithDetailsOrBuilder>(
                getScheduledCallback(),
                getParentForChildren(),
                isClean());
        scheduledCallback_ = null;
      }
      return scheduledCallbackBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetNextScheduledCallbackWithDetailsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetNextScheduledCallbackWithDetailsRes)
  private static final com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNextScheduledCallbackWithDetailsRes>
      PARSER = new com.google.protobuf.AbstractParser<GetNextScheduledCallbackWithDetailsRes>() {
    @java.lang.Override
    public GetNextScheduledCallbackWithDetailsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetNextScheduledCallbackWithDetailsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNextScheduledCallbackWithDetailsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetNextScheduledCallbackWithDetailsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

