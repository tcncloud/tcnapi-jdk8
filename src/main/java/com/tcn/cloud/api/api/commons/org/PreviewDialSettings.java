// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * PreviewDialSettings is an entity containing the hunt group settings for the
 * Preview Dial section of the hunt group manager.
 * </pre>
 *
 * Protobuf type {@code api.commons.org.PreviewDialSettings}
 */
public final class PreviewDialSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.PreviewDialSettings)
    PreviewDialSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PreviewDialSettings.newBuilder() to construct.
  private PreviewDialSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PreviewDialSettings() {
    previewQueueConfig_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PreviewDialSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_PreviewDialSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_PreviewDialSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.PreviewDialSettings.class, com.tcn.cloud.api.api.commons.org.PreviewDialSettings.Builder.class);
  }

  public static final int ENABLE_PREVIEW_DIAL_CANCEL_FIELD_NUMBER = 1;
  private boolean enablePreviewDialCancel_ = false;
  /**
   * <pre>
   * Enable cancelling of Preview Dialing.  `AllowPreviewDialCancel`
   * </pre>
   *
   * <code>bool enable_preview_dial_cancel = 1 [json_name = "enablePreviewDialCancel"];</code>
   * @return The enablePreviewDialCancel.
   */
  @java.lang.Override
  public boolean getEnablePreviewDialCancel() {
    return enablePreviewDialCancel_;
  }

  public static final int ENABLE_AUTO_PAUSE_ON_CANCEL_FIELD_NUMBER = 2;
  private boolean enableAutoPauseOnCancel_ = false;
  /**
   * <pre>
   * Enable automatic pausing when cancelling a Preview Dial call.
   * `AutoPauseOnPreviewDial`
   * </pre>
   *
   * <code>bool enable_auto_pause_on_cancel = 2 [json_name = "enableAutoPauseOnCancel"];</code>
   * @return The enableAutoPauseOnCancel.
   */
  @java.lang.Override
  public boolean getEnableAutoPauseOnCancel() {
    return enableAutoPauseOnCancel_;
  }

  public static final int TIMEOUT_MINUTES_FIELD_NUMBER = 3;
  private long timeoutMinutes_ = 0L;
  /**
   * <pre>
   * Indicates when queued preview dial calls should no longer be presented
   * to agents.
   * `Preview Dial Call Time-out`
   * </pre>
   *
   * <code>int64 timeout_minutes = 3 [json_name = "timeoutMinutes"];</code>
   * @return The timeoutMinutes.
   */
  @java.lang.Override
  public long getTimeoutMinutes() {
    return timeoutMinutes_;
  }

  public static final int REQUIRE_NUMBER_CONFIRMATION_FIELD_NUMBER = 4;
  private boolean requireNumberConfirmation_ = false;
  /**
   * <pre>
   * Indicates if agents must confirm numbers before calling.
   * `Preview Dial Confirmation`
   * </pre>
   *
   * <code>bool require_number_confirmation = 4 [json_name = "requireNumberConfirmation"];</code>
   * @return The requireNumberConfirmation.
   */
  @java.lang.Override
  public boolean getRequireNumberConfirmation() {
    return requireNumberConfirmation_;
  }

  public static final int PREVIEW_QUEUE_CONFIG_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object previewQueueConfig_ = "";
  /**
   * <pre>
   * The name of the Call Queue Configuration (folder name).
   * `PreviewQueueConfig`
   * </pre>
   *
   * <code>string preview_queue_config = 5 [json_name = "previewQueueConfig"];</code>
   * @return The previewQueueConfig.
   */
  @java.lang.Override
  public java.lang.String getPreviewQueueConfig() {
    java.lang.Object ref = previewQueueConfig_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      previewQueueConfig_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the Call Queue Configuration (folder name).
   * `PreviewQueueConfig`
   * </pre>
   *
   * <code>string preview_queue_config = 5 [json_name = "previewQueueConfig"];</code>
   * @return The bytes for previewQueueConfig.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPreviewQueueConfigBytes() {
    java.lang.Object ref = previewQueueConfig_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      previewQueueConfig_ = b;
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
    if (enablePreviewDialCancel_ != false) {
      output.writeBool(1, enablePreviewDialCancel_);
    }
    if (enableAutoPauseOnCancel_ != false) {
      output.writeBool(2, enableAutoPauseOnCancel_);
    }
    if (timeoutMinutes_ != 0L) {
      output.writeInt64(3, timeoutMinutes_);
    }
    if (requireNumberConfirmation_ != false) {
      output.writeBool(4, requireNumberConfirmation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(previewQueueConfig_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, previewQueueConfig_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enablePreviewDialCancel_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enablePreviewDialCancel_);
    }
    if (enableAutoPauseOnCancel_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, enableAutoPauseOnCancel_);
    }
    if (timeoutMinutes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timeoutMinutes_);
    }
    if (requireNumberConfirmation_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, requireNumberConfirmation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(previewQueueConfig_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, previewQueueConfig_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.PreviewDialSettings)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.PreviewDialSettings other = (com.tcn.cloud.api.api.commons.org.PreviewDialSettings) obj;

    if (getEnablePreviewDialCancel()
        != other.getEnablePreviewDialCancel()) return false;
    if (getEnableAutoPauseOnCancel()
        != other.getEnableAutoPauseOnCancel()) return false;
    if (getTimeoutMinutes()
        != other.getTimeoutMinutes()) return false;
    if (getRequireNumberConfirmation()
        != other.getRequireNumberConfirmation()) return false;
    if (!getPreviewQueueConfig()
        .equals(other.getPreviewQueueConfig())) return false;
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
    hash = (37 * hash) + ENABLE_PREVIEW_DIAL_CANCEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnablePreviewDialCancel());
    hash = (37 * hash) + ENABLE_AUTO_PAUSE_ON_CANCEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableAutoPauseOnCancel());
    hash = (37 * hash) + TIMEOUT_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeoutMinutes());
    hash = (37 * hash) + REQUIRE_NUMBER_CONFIRMATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRequireNumberConfirmation());
    hash = (37 * hash) + PREVIEW_QUEUE_CONFIG_FIELD_NUMBER;
    hash = (53 * hash) + getPreviewQueueConfig().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.PreviewDialSettings prototype) {
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
   * <pre>
   * PreviewDialSettings is an entity containing the hunt group settings for the
   * Preview Dial section of the hunt group manager.
   * </pre>
   *
   * Protobuf type {@code api.commons.org.PreviewDialSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.PreviewDialSettings)
      com.tcn.cloud.api.api.commons.org.PreviewDialSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_PreviewDialSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_PreviewDialSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.PreviewDialSettings.class, com.tcn.cloud.api.api.commons.org.PreviewDialSettings.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.PreviewDialSettings.newBuilder()
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
      enablePreviewDialCancel_ = false;
      enableAutoPauseOnCancel_ = false;
      timeoutMinutes_ = 0L;
      requireNumberConfirmation_ = false;
      previewQueueConfig_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_PreviewDialSettings_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.PreviewDialSettings getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.PreviewDialSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.PreviewDialSettings build() {
      com.tcn.cloud.api.api.commons.org.PreviewDialSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.PreviewDialSettings buildPartial() {
      com.tcn.cloud.api.api.commons.org.PreviewDialSettings result = new com.tcn.cloud.api.api.commons.org.PreviewDialSettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.PreviewDialSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enablePreviewDialCancel_ = enablePreviewDialCancel_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enableAutoPauseOnCancel_ = enableAutoPauseOnCancel_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timeoutMinutes_ = timeoutMinutes_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.requireNumberConfirmation_ = requireNumberConfirmation_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.previewQueueConfig_ = previewQueueConfig_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.org.PreviewDialSettings) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.PreviewDialSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.PreviewDialSettings other) {
      if (other == com.tcn.cloud.api.api.commons.org.PreviewDialSettings.getDefaultInstance()) return this;
      if (other.getEnablePreviewDialCancel() != false) {
        setEnablePreviewDialCancel(other.getEnablePreviewDialCancel());
      }
      if (other.getEnableAutoPauseOnCancel() != false) {
        setEnableAutoPauseOnCancel(other.getEnableAutoPauseOnCancel());
      }
      if (other.getTimeoutMinutes() != 0L) {
        setTimeoutMinutes(other.getTimeoutMinutes());
      }
      if (other.getRequireNumberConfirmation() != false) {
        setRequireNumberConfirmation(other.getRequireNumberConfirmation());
      }
      if (!other.getPreviewQueueConfig().isEmpty()) {
        previewQueueConfig_ = other.previewQueueConfig_;
        bitField0_ |= 0x00000010;
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
            case 8: {
              enablePreviewDialCancel_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              enableAutoPauseOnCancel_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              timeoutMinutes_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              requireNumberConfirmation_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              previewQueueConfig_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private boolean enablePreviewDialCancel_ ;
    /**
     * <pre>
     * Enable cancelling of Preview Dialing.  `AllowPreviewDialCancel`
     * </pre>
     *
     * <code>bool enable_preview_dial_cancel = 1 [json_name = "enablePreviewDialCancel"];</code>
     * @return The enablePreviewDialCancel.
     */
    @java.lang.Override
    public boolean getEnablePreviewDialCancel() {
      return enablePreviewDialCancel_;
    }
    /**
     * <pre>
     * Enable cancelling of Preview Dialing.  `AllowPreviewDialCancel`
     * </pre>
     *
     * <code>bool enable_preview_dial_cancel = 1 [json_name = "enablePreviewDialCancel"];</code>
     * @param value The enablePreviewDialCancel to set.
     * @return This builder for chaining.
     */
    public Builder setEnablePreviewDialCancel(boolean value) {

      enablePreviewDialCancel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enable cancelling of Preview Dialing.  `AllowPreviewDialCancel`
     * </pre>
     *
     * <code>bool enable_preview_dial_cancel = 1 [json_name = "enablePreviewDialCancel"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnablePreviewDialCancel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enablePreviewDialCancel_ = false;
      onChanged();
      return this;
    }

    private boolean enableAutoPauseOnCancel_ ;
    /**
     * <pre>
     * Enable automatic pausing when cancelling a Preview Dial call.
     * `AutoPauseOnPreviewDial`
     * </pre>
     *
     * <code>bool enable_auto_pause_on_cancel = 2 [json_name = "enableAutoPauseOnCancel"];</code>
     * @return The enableAutoPauseOnCancel.
     */
    @java.lang.Override
    public boolean getEnableAutoPauseOnCancel() {
      return enableAutoPauseOnCancel_;
    }
    /**
     * <pre>
     * Enable automatic pausing when cancelling a Preview Dial call.
     * `AutoPauseOnPreviewDial`
     * </pre>
     *
     * <code>bool enable_auto_pause_on_cancel = 2 [json_name = "enableAutoPauseOnCancel"];</code>
     * @param value The enableAutoPauseOnCancel to set.
     * @return This builder for chaining.
     */
    public Builder setEnableAutoPauseOnCancel(boolean value) {

      enableAutoPauseOnCancel_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enable automatic pausing when cancelling a Preview Dial call.
     * `AutoPauseOnPreviewDial`
     * </pre>
     *
     * <code>bool enable_auto_pause_on_cancel = 2 [json_name = "enableAutoPauseOnCancel"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableAutoPauseOnCancel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enableAutoPauseOnCancel_ = false;
      onChanged();
      return this;
    }

    private long timeoutMinutes_ ;
    /**
     * <pre>
     * Indicates when queued preview dial calls should no longer be presented
     * to agents.
     * `Preview Dial Call Time-out`
     * </pre>
     *
     * <code>int64 timeout_minutes = 3 [json_name = "timeoutMinutes"];</code>
     * @return The timeoutMinutes.
     */
    @java.lang.Override
    public long getTimeoutMinutes() {
      return timeoutMinutes_;
    }
    /**
     * <pre>
     * Indicates when queued preview dial calls should no longer be presented
     * to agents.
     * `Preview Dial Call Time-out`
     * </pre>
     *
     * <code>int64 timeout_minutes = 3 [json_name = "timeoutMinutes"];</code>
     * @param value The timeoutMinutes to set.
     * @return This builder for chaining.
     */
    public Builder setTimeoutMinutes(long value) {

      timeoutMinutes_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates when queued preview dial calls should no longer be presented
     * to agents.
     * `Preview Dial Call Time-out`
     * </pre>
     *
     * <code>int64 timeout_minutes = 3 [json_name = "timeoutMinutes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeoutMinutes() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timeoutMinutes_ = 0L;
      onChanged();
      return this;
    }

    private boolean requireNumberConfirmation_ ;
    /**
     * <pre>
     * Indicates if agents must confirm numbers before calling.
     * `Preview Dial Confirmation`
     * </pre>
     *
     * <code>bool require_number_confirmation = 4 [json_name = "requireNumberConfirmation"];</code>
     * @return The requireNumberConfirmation.
     */
    @java.lang.Override
    public boolean getRequireNumberConfirmation() {
      return requireNumberConfirmation_;
    }
    /**
     * <pre>
     * Indicates if agents must confirm numbers before calling.
     * `Preview Dial Confirmation`
     * </pre>
     *
     * <code>bool require_number_confirmation = 4 [json_name = "requireNumberConfirmation"];</code>
     * @param value The requireNumberConfirmation to set.
     * @return This builder for chaining.
     */
    public Builder setRequireNumberConfirmation(boolean value) {

      requireNumberConfirmation_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if agents must confirm numbers before calling.
     * `Preview Dial Confirmation`
     * </pre>
     *
     * <code>bool require_number_confirmation = 4 [json_name = "requireNumberConfirmation"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequireNumberConfirmation() {
      bitField0_ = (bitField0_ & ~0x00000008);
      requireNumberConfirmation_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object previewQueueConfig_ = "";
    /**
     * <pre>
     * The name of the Call Queue Configuration (folder name).
     * `PreviewQueueConfig`
     * </pre>
     *
     * <code>string preview_queue_config = 5 [json_name = "previewQueueConfig"];</code>
     * @return The previewQueueConfig.
     */
    public java.lang.String getPreviewQueueConfig() {
      java.lang.Object ref = previewQueueConfig_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        previewQueueConfig_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the Call Queue Configuration (folder name).
     * `PreviewQueueConfig`
     * </pre>
     *
     * <code>string preview_queue_config = 5 [json_name = "previewQueueConfig"];</code>
     * @return The bytes for previewQueueConfig.
     */
    public com.google.protobuf.ByteString
        getPreviewQueueConfigBytes() {
      java.lang.Object ref = previewQueueConfig_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        previewQueueConfig_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the Call Queue Configuration (folder name).
     * `PreviewQueueConfig`
     * </pre>
     *
     * <code>string preview_queue_config = 5 [json_name = "previewQueueConfig"];</code>
     * @param value The previewQueueConfig to set.
     * @return This builder for chaining.
     */
    public Builder setPreviewQueueConfig(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      previewQueueConfig_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Call Queue Configuration (folder name).
     * `PreviewQueueConfig`
     * </pre>
     *
     * <code>string preview_queue_config = 5 [json_name = "previewQueueConfig"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPreviewQueueConfig() {
      previewQueueConfig_ = getDefaultInstance().getPreviewQueueConfig();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Call Queue Configuration (folder name).
     * `PreviewQueueConfig`
     * </pre>
     *
     * <code>string preview_queue_config = 5 [json_name = "previewQueueConfig"];</code>
     * @param value The bytes for previewQueueConfig to set.
     * @return This builder for chaining.
     */
    public Builder setPreviewQueueConfigBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      previewQueueConfig_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.PreviewDialSettings)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.PreviewDialSettings)
  private static final com.tcn.cloud.api.api.commons.org.PreviewDialSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.PreviewDialSettings();
  }

  public static com.tcn.cloud.api.api.commons.org.PreviewDialSettings getDefaultInstance() {
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
  public com.tcn.cloud.api.api.commons.org.PreviewDialSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

