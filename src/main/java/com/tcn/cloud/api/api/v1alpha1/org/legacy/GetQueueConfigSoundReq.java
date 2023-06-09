// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * Protobuf type {@code api.v1alpha1.org.legacy.GetQueueConfigSoundReq}
 */
public final class GetQueueConfigSoundReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.GetQueueConfigSoundReq)
    GetQueueConfigSoundReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetQueueConfigSoundReq.newBuilder() to construct.
  private GetQueueConfigSoundReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetQueueConfigSoundReq() {
    config_ = "";
    sound_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetQueueConfigSoundReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetQueueConfigSoundReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetQueueConfigSoundReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq.Builder.class);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object config_ = "";
  /**
   * <code>string config = 1 [json_name = "config"];</code>
   * @return The config.
   */
  @java.lang.Override
  public java.lang.String getConfig() {
    java.lang.Object ref = config_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      config_ = s;
      return s;
    }
  }
  /**
   * <code>string config = 1 [json_name = "config"];</code>
   * @return The bytes for config.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConfigBytes() {
    java.lang.Object ref = config_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      config_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOUND_FIELD_NUMBER = 2;
  private int sound_ = 0;
  /**
   * <code>.api.commons.ConfigSound sound = 2 [json_name = "sound"];</code>
   * @return The enum numeric value on the wire for sound.
   */
  @java.lang.Override public int getSoundValue() {
    return sound_;
  }
  /**
   * <code>.api.commons.ConfigSound sound = 2 [json_name = "sound"];</code>
   * @return The sound.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ConfigSound getSound() {
    com.tcn.cloud.api.api.commons.ConfigSound result = com.tcn.cloud.api.api.commons.ConfigSound.forNumber(sound_);
    return result == null ? com.tcn.cloud.api.api.commons.ConfigSound.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(config_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, config_);
    }
    if (sound_ != com.tcn.cloud.api.api.commons.ConfigSound.CONFIG_SOUND_ONE.getNumber()) {
      output.writeEnum(2, sound_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(config_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, config_);
    }
    if (sound_ != com.tcn.cloud.api.api.commons.ConfigSound.CONFIG_SOUND_ONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, sound_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq) obj;

    if (!getConfig()
        .equals(other.getConfig())) return false;
    if (sound_ != other.sound_) return false;
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
    hash = (37 * hash) + CONFIG_FIELD_NUMBER;
    hash = (53 * hash) + getConfig().hashCode();
    hash = (37 * hash) + SOUND_FIELD_NUMBER;
    hash = (53 * hash) + sound_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.legacy.GetQueueConfigSoundReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.GetQueueConfigSoundReq)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetQueueConfigSoundReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetQueueConfigSoundReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq.newBuilder()
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
      config_ = "";
      sound_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetQueueConfigSoundReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.config_ = config_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sound_ = sound_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq.getDefaultInstance()) return this;
      if (!other.getConfig().isEmpty()) {
        config_ = other.config_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.sound_ != 0) {
        setSoundValue(other.getSoundValue());
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
              config_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              sound_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object config_ = "";
    /**
     * <code>string config = 1 [json_name = "config"];</code>
     * @return The config.
     */
    public java.lang.String getConfig() {
      java.lang.Object ref = config_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        config_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string config = 1 [json_name = "config"];</code>
     * @return The bytes for config.
     */
    public com.google.protobuf.ByteString
        getConfigBytes() {
      java.lang.Object ref = config_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        config_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string config = 1 [json_name = "config"];</code>
     * @param value The config to set.
     * @return This builder for chaining.
     */
    public Builder setConfig(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      config_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string config = 1 [json_name = "config"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConfig() {
      config_ = getDefaultInstance().getConfig();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string config = 1 [json_name = "config"];</code>
     * @param value The bytes for config to set.
     * @return This builder for chaining.
     */
    public Builder setConfigBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      config_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int sound_ = 0;
    /**
     * <code>.api.commons.ConfigSound sound = 2 [json_name = "sound"];</code>
     * @return The enum numeric value on the wire for sound.
     */
    @java.lang.Override public int getSoundValue() {
      return sound_;
    }
    /**
     * <code>.api.commons.ConfigSound sound = 2 [json_name = "sound"];</code>
     * @param value The enum numeric value on the wire for sound to set.
     * @return This builder for chaining.
     */
    public Builder setSoundValue(int value) {
      sound_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigSound sound = 2 [json_name = "sound"];</code>
     * @return The sound.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConfigSound getSound() {
      com.tcn.cloud.api.api.commons.ConfigSound result = com.tcn.cloud.api.api.commons.ConfigSound.forNumber(sound_);
      return result == null ? com.tcn.cloud.api.api.commons.ConfigSound.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ConfigSound sound = 2 [json_name = "sound"];</code>
     * @param value The sound to set.
     * @return This builder for chaining.
     */
    public Builder setSound(com.tcn.cloud.api.api.commons.ConfigSound value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      sound_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigSound sound = 2 [json_name = "sound"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSound() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sound_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.GetQueueConfigSoundReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.GetQueueConfigSoundReq)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetQueueConfigSoundReq>
      PARSER = new com.google.protobuf.AbstractParser<GetQueueConfigSoundReq>() {
    @java.lang.Override
    public GetQueueConfigSoundReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetQueueConfigSoundReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetQueueConfigSoundReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetQueueConfigSoundReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

