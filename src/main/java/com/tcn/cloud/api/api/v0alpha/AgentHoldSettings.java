// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.AgentHoldSettings}
 */
public final class AgentHoldSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.AgentHoldSettings)
    AgentHoldSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentHoldSettings.newBuilder() to construct.
  private AgentHoldSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentHoldSettings() {
    allowed_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentHoldSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_AgentHoldSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_AgentHoldSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.AgentHoldSettings.class, com.tcn.cloud.api.api.v0alpha.AgentHoldSettings.Builder.class);
  }

  public static final int ALLOWED_FIELD_NUMBER = 1;
  private int allowed_ = 0;
  /**
   * <code>.api.v0alpha.AllowedHoldType.Enum allowed = 1 [json_name = "allowed"];</code>
   * @return The enum numeric value on the wire for allowed.
   */
  @java.lang.Override public int getAllowedValue() {
    return allowed_;
  }
  /**
   * <code>.api.v0alpha.AllowedHoldType.Enum allowed = 1 [json_name = "allowed"];</code>
   * @return The allowed.
   */
  @java.lang.Override public com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum getAllowed() {
    com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum result = com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum.forNumber(allowed_);
    return result == null ? com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum.UNRECOGNIZED : result;
  }

  public static final int AUTO_PAUSE_ON_MULTI_HOLD_FIELD_NUMBER = 2;
  private boolean autoPauseOnMultiHold_ = false;
  /**
   * <code>bool auto_pause_on_multi_hold = 2 [json_name = "autoPauseOnMultiHold"];</code>
   * @return The autoPauseOnMultiHold.
   */
  @java.lang.Override
  public boolean getAutoPauseOnMultiHold() {
    return autoPauseOnMultiHold_;
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
    if (allowed_ != com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum.NONE.getNumber()) {
      output.writeEnum(1, allowed_);
    }
    if (autoPauseOnMultiHold_ != false) {
      output.writeBool(2, autoPauseOnMultiHold_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (allowed_ != com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, allowed_);
    }
    if (autoPauseOnMultiHold_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, autoPauseOnMultiHold_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.AgentHoldSettings)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.AgentHoldSettings other = (com.tcn.cloud.api.api.v0alpha.AgentHoldSettings) obj;

    if (allowed_ != other.allowed_) return false;
    if (getAutoPauseOnMultiHold()
        != other.getAutoPauseOnMultiHold()) return false;
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
    hash = (37 * hash) + ALLOWED_FIELD_NUMBER;
    hash = (53 * hash) + allowed_;
    hash = (37 * hash) + AUTO_PAUSE_ON_MULTI_HOLD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutoPauseOnMultiHold());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.AgentHoldSettings prototype) {
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
   * Protobuf type {@code api.v0alpha.AgentHoldSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.AgentHoldSettings)
      com.tcn.cloud.api.api.v0alpha.AgentHoldSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_AgentHoldSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_AgentHoldSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.AgentHoldSettings.class, com.tcn.cloud.api.api.v0alpha.AgentHoldSettings.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.AgentHoldSettings.newBuilder()
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
      allowed_ = 0;
      autoPauseOnMultiHold_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_AgentHoldSettings_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AgentHoldSettings getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.AgentHoldSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AgentHoldSettings build() {
      com.tcn.cloud.api.api.v0alpha.AgentHoldSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AgentHoldSettings buildPartial() {
      com.tcn.cloud.api.api.v0alpha.AgentHoldSettings result = new com.tcn.cloud.api.api.v0alpha.AgentHoldSettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.AgentHoldSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.allowed_ = allowed_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.autoPauseOnMultiHold_ = autoPauseOnMultiHold_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.AgentHoldSettings) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.AgentHoldSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.AgentHoldSettings other) {
      if (other == com.tcn.cloud.api.api.v0alpha.AgentHoldSettings.getDefaultInstance()) return this;
      if (other.allowed_ != 0) {
        setAllowedValue(other.getAllowedValue());
      }
      if (other.getAutoPauseOnMultiHold() != false) {
        setAutoPauseOnMultiHold(other.getAutoPauseOnMultiHold());
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
              allowed_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              autoPauseOnMultiHold_ = input.readBool();
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

    private int allowed_ = 0;
    /**
     * <code>.api.v0alpha.AllowedHoldType.Enum allowed = 1 [json_name = "allowed"];</code>
     * @return The enum numeric value on the wire for allowed.
     */
    @java.lang.Override public int getAllowedValue() {
      return allowed_;
    }
    /**
     * <code>.api.v0alpha.AllowedHoldType.Enum allowed = 1 [json_name = "allowed"];</code>
     * @param value The enum numeric value on the wire for allowed to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedValue(int value) {
      allowed_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.AllowedHoldType.Enum allowed = 1 [json_name = "allowed"];</code>
     * @return The allowed.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum getAllowed() {
      com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum result = com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum.forNumber(allowed_);
      return result == null ? com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.v0alpha.AllowedHoldType.Enum allowed = 1 [json_name = "allowed"];</code>
     * @param value The allowed to set.
     * @return This builder for chaining.
     */
    public Builder setAllowed(com.tcn.cloud.api.api.v0alpha.AllowedHoldType.Enum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      allowed_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.AllowedHoldType.Enum allowed = 1 [json_name = "allowed"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      allowed_ = 0;
      onChanged();
      return this;
    }

    private boolean autoPauseOnMultiHold_ ;
    /**
     * <code>bool auto_pause_on_multi_hold = 2 [json_name = "autoPauseOnMultiHold"];</code>
     * @return The autoPauseOnMultiHold.
     */
    @java.lang.Override
    public boolean getAutoPauseOnMultiHold() {
      return autoPauseOnMultiHold_;
    }
    /**
     * <code>bool auto_pause_on_multi_hold = 2 [json_name = "autoPauseOnMultiHold"];</code>
     * @param value The autoPauseOnMultiHold to set.
     * @return This builder for chaining.
     */
    public Builder setAutoPauseOnMultiHold(boolean value) {

      autoPauseOnMultiHold_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool auto_pause_on_multi_hold = 2 [json_name = "autoPauseOnMultiHold"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoPauseOnMultiHold() {
      bitField0_ = (bitField0_ & ~0x00000002);
      autoPauseOnMultiHold_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.AgentHoldSettings)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.AgentHoldSettings)
  private static final com.tcn.cloud.api.api.v0alpha.AgentHoldSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.AgentHoldSettings();
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentHoldSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentHoldSettings>
      PARSER = new com.google.protobuf.AbstractParser<AgentHoldSettings>() {
    @java.lang.Override
    public AgentHoldSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgentHoldSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentHoldSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AgentHoldSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

