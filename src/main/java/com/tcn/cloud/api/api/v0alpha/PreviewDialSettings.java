// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.PreviewDialSettings}
 */
public final class PreviewDialSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.PreviewDialSettings)
    PreviewDialSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PreviewDialSettings.newBuilder() to construct.
  private PreviewDialSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PreviewDialSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PreviewDialSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PreviewDialSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PreviewDialSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.PreviewDialSettings.class, com.tcn.cloud.api.api.v0alpha.PreviewDialSettings.Builder.class);
  }

  public static final int REQUIRE_CONFIRMATION_FIELD_NUMBER = 2;
  private boolean requireConfirmation_ = false;
  /**
   * <code>bool require_confirmation = 2 [json_name = "requireConfirmation"];</code>
   * @return The requireConfirmation.
   */
  @java.lang.Override
  public boolean getRequireConfirmation() {
    return requireConfirmation_;
  }

  public static final int TIMEOUT_MINUTES_FIELD_NUMBER = 3;
  private long timeoutMinutes_ = 0L;
  /**
   * <code>int64 timeout_minutes = 3 [json_name = "timeoutMinutes"];</code>
   * @return The timeoutMinutes.
   */
  @java.lang.Override
  public long getTimeoutMinutes() {
    return timeoutMinutes_;
  }

  public static final int ALLOW_CANCEL_FIELD_NUMBER = 4;
  private boolean allowCancel_ = false;
  /**
   * <code>bool allow_cancel = 4 [json_name = "allowCancel"];</code>
   * @return The allowCancel.
   */
  @java.lang.Override
  public boolean getAllowCancel() {
    return allowCancel_;
  }

  public static final int PAUSE_ON_CANCEL_FIELD_NUMBER = 5;
  private boolean pauseOnCancel_ = false;
  /**
   * <code>bool pause_on_cancel = 5 [json_name = "pauseOnCancel"];</code>
   * @return The pauseOnCancel.
   */
  @java.lang.Override
  public boolean getPauseOnCancel() {
    return pauseOnCancel_;
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
    if (requireConfirmation_ != false) {
      output.writeBool(2, requireConfirmation_);
    }
    if (timeoutMinutes_ != 0L) {
      output.writeInt64(3, timeoutMinutes_);
    }
    if (allowCancel_ != false) {
      output.writeBool(4, allowCancel_);
    }
    if (pauseOnCancel_ != false) {
      output.writeBool(5, pauseOnCancel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requireConfirmation_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, requireConfirmation_);
    }
    if (timeoutMinutes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timeoutMinutes_);
    }
    if (allowCancel_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, allowCancel_);
    }
    if (pauseOnCancel_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, pauseOnCancel_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.PreviewDialSettings)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.PreviewDialSettings other = (com.tcn.cloud.api.api.v0alpha.PreviewDialSettings) obj;

    if (getRequireConfirmation()
        != other.getRequireConfirmation()) return false;
    if (getTimeoutMinutes()
        != other.getTimeoutMinutes()) return false;
    if (getAllowCancel()
        != other.getAllowCancel()) return false;
    if (getPauseOnCancel()
        != other.getPauseOnCancel()) return false;
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
    hash = (37 * hash) + REQUIRE_CONFIRMATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRequireConfirmation());
    hash = (37 * hash) + TIMEOUT_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeoutMinutes());
    hash = (37 * hash) + ALLOW_CANCEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowCancel());
    hash = (37 * hash) + PAUSE_ON_CANCEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPauseOnCancel());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.PreviewDialSettings prototype) {
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
   * Protobuf type {@code api.v0alpha.PreviewDialSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.PreviewDialSettings)
      com.tcn.cloud.api.api.v0alpha.PreviewDialSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PreviewDialSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PreviewDialSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.PreviewDialSettings.class, com.tcn.cloud.api.api.v0alpha.PreviewDialSettings.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.PreviewDialSettings.newBuilder()
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
      requireConfirmation_ = false;
      timeoutMinutes_ = 0L;
      allowCancel_ = false;
      pauseOnCancel_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_PreviewDialSettings_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PreviewDialSettings getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.PreviewDialSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PreviewDialSettings build() {
      com.tcn.cloud.api.api.v0alpha.PreviewDialSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PreviewDialSettings buildPartial() {
      com.tcn.cloud.api.api.v0alpha.PreviewDialSettings result = new com.tcn.cloud.api.api.v0alpha.PreviewDialSettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.PreviewDialSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requireConfirmation_ = requireConfirmation_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeoutMinutes_ = timeoutMinutes_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.allowCancel_ = allowCancel_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pauseOnCancel_ = pauseOnCancel_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.PreviewDialSettings) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.PreviewDialSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.PreviewDialSettings other) {
      if (other == com.tcn.cloud.api.api.v0alpha.PreviewDialSettings.getDefaultInstance()) return this;
      if (other.getRequireConfirmation() != false) {
        setRequireConfirmation(other.getRequireConfirmation());
      }
      if (other.getTimeoutMinutes() != 0L) {
        setTimeoutMinutes(other.getTimeoutMinutes());
      }
      if (other.getAllowCancel() != false) {
        setAllowCancel(other.getAllowCancel());
      }
      if (other.getPauseOnCancel() != false) {
        setPauseOnCancel(other.getPauseOnCancel());
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
              requireConfirmation_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 24: {
              timeoutMinutes_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 32: {
              allowCancel_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
            case 40: {
              pauseOnCancel_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 40
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

    private boolean requireConfirmation_ ;
    /**
     * <code>bool require_confirmation = 2 [json_name = "requireConfirmation"];</code>
     * @return The requireConfirmation.
     */
    @java.lang.Override
    public boolean getRequireConfirmation() {
      return requireConfirmation_;
    }
    /**
     * <code>bool require_confirmation = 2 [json_name = "requireConfirmation"];</code>
     * @param value The requireConfirmation to set.
     * @return This builder for chaining.
     */
    public Builder setRequireConfirmation(boolean value) {

      requireConfirmation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool require_confirmation = 2 [json_name = "requireConfirmation"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequireConfirmation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requireConfirmation_ = false;
      onChanged();
      return this;
    }

    private long timeoutMinutes_ ;
    /**
     * <code>int64 timeout_minutes = 3 [json_name = "timeoutMinutes"];</code>
     * @return The timeoutMinutes.
     */
    @java.lang.Override
    public long getTimeoutMinutes() {
      return timeoutMinutes_;
    }
    /**
     * <code>int64 timeout_minutes = 3 [json_name = "timeoutMinutes"];</code>
     * @param value The timeoutMinutes to set.
     * @return This builder for chaining.
     */
    public Builder setTimeoutMinutes(long value) {

      timeoutMinutes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timeout_minutes = 3 [json_name = "timeoutMinutes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeoutMinutes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeoutMinutes_ = 0L;
      onChanged();
      return this;
    }

    private boolean allowCancel_ ;
    /**
     * <code>bool allow_cancel = 4 [json_name = "allowCancel"];</code>
     * @return The allowCancel.
     */
    @java.lang.Override
    public boolean getAllowCancel() {
      return allowCancel_;
    }
    /**
     * <code>bool allow_cancel = 4 [json_name = "allowCancel"];</code>
     * @param value The allowCancel to set.
     * @return This builder for chaining.
     */
    public Builder setAllowCancel(boolean value) {

      allowCancel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool allow_cancel = 4 [json_name = "allowCancel"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowCancel() {
      bitField0_ = (bitField0_ & ~0x00000004);
      allowCancel_ = false;
      onChanged();
      return this;
    }

    private boolean pauseOnCancel_ ;
    /**
     * <code>bool pause_on_cancel = 5 [json_name = "pauseOnCancel"];</code>
     * @return The pauseOnCancel.
     */
    @java.lang.Override
    public boolean getPauseOnCancel() {
      return pauseOnCancel_;
    }
    /**
     * <code>bool pause_on_cancel = 5 [json_name = "pauseOnCancel"];</code>
     * @param value The pauseOnCancel to set.
     * @return This builder for chaining.
     */
    public Builder setPauseOnCancel(boolean value) {

      pauseOnCancel_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool pause_on_cancel = 5 [json_name = "pauseOnCancel"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPauseOnCancel() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pauseOnCancel_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.PreviewDialSettings)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.PreviewDialSettings)
  private static final com.tcn.cloud.api.api.v0alpha.PreviewDialSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.PreviewDialSettings();
  }

  public static com.tcn.cloud.api.api.v0alpha.PreviewDialSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreviewDialSettings>
      PARSER = new com.google.protobuf.AbstractParser<PreviewDialSettings>() {
    @java.lang.Override
    public PreviewDialSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<PreviewDialSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreviewDialSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PreviewDialSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

