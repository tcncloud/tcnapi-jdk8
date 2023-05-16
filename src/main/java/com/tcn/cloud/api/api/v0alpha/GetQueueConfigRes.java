// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetQueueConfigRes}
 */
public final class GetQueueConfigRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetQueueConfigRes)
    GetQueueConfigResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetQueueConfigRes.newBuilder() to construct.
  private GetQueueConfigRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetQueueConfigRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetQueueConfigRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetQueueConfigRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetQueueConfigRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes.class, com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes.Builder.class);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.QueueConfig config_;
  /**
   * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
   * @return The config.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.QueueConfig getConfig() {
    return config_ == null ? com.tcn.cloud.api.api.v0alpha.QueueConfig.getDefaultInstance() : config_;
  }
  /**
   * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.QueueConfigOrBuilder getConfigOrBuilder() {
    return config_ == null ? com.tcn.cloud.api.api.v0alpha.QueueConfig.getDefaultInstance() : config_;
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
    if (config_ != null) {
      output.writeMessage(1, getConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConfig());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes other = (com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes) obj;

    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
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
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes prototype) {
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
   * Protobuf type {@code api.v0alpha.GetQueueConfigRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetQueueConfigRes)
      com.tcn.cloud.api.api.v0alpha.GetQueueConfigResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetQueueConfigRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetQueueConfigRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes.class, com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes.newBuilder()
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
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetQueueConfigRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes build() {
      com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes result = new com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.config_ = configBuilder_ == null
            ? config_
            : configBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes.getDefaultInstance()) return this;
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
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
                  getConfigFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.QueueConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.QueueConfig, com.tcn.cloud.api.api.v0alpha.QueueConfig.Builder, com.tcn.cloud.api.api.v0alpha.QueueConfigOrBuilder> configBuilder_;
    /**
     * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
     * @return The config.
     */
    public com.tcn.cloud.api.api.v0alpha.QueueConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? com.tcn.cloud.api.api.v0alpha.QueueConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
     */
    public Builder setConfig(com.tcn.cloud.api.api.v0alpha.QueueConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
      } else {
        configBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
     */
    public Builder setConfig(
        com.tcn.cloud.api.api.v0alpha.QueueConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
     */
    public Builder mergeConfig(com.tcn.cloud.api.api.v0alpha.QueueConfig value) {
      if (configBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          config_ != null &&
          config_ != com.tcn.cloud.api.api.v0alpha.QueueConfig.getDefaultInstance()) {
          getConfigBuilder().mergeFrom(value);
        } else {
          config_ = value;
        }
      } else {
        configBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
     */
    public Builder clearConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.QueueConfig.Builder getConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.QueueConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            com.tcn.cloud.api.api.v0alpha.QueueConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <code>.api.v0alpha.QueueConfig config = 1 [json_name = "config"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.QueueConfig, com.tcn.cloud.api.api.v0alpha.QueueConfig.Builder, com.tcn.cloud.api.api.v0alpha.QueueConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.QueueConfig, com.tcn.cloud.api.api.v0alpha.QueueConfig.Builder, com.tcn.cloud.api.api.v0alpha.QueueConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetQueueConfigRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetQueueConfigRes)
  private static final com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetQueueConfigRes>
      PARSER = new com.google.protobuf.AbstractParser<GetQueueConfigRes>() {
    @java.lang.Override
    public GetQueueConfigRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetQueueConfigRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetQueueConfigRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetQueueConfigRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

