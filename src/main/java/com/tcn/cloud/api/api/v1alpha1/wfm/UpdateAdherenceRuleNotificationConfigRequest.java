// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for UpdateAdherenceRuleNotificationConfig.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest}
 */
public final class UpdateAdherenceRuleNotificationConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest)
    UpdateAdherenceRuleNotificationConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAdherenceRuleNotificationConfigRequest.newBuilder() to construct.
  private UpdateAdherenceRuleNotificationConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAdherenceRuleNotificationConfigRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAdherenceRuleNotificationConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateAdherenceRuleNotificationConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateAdherenceRuleNotificationConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest.Builder.class);
  }

  public static final int NOTIFICATION_CONFIG_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig notificationConfig_;
  /**
   * <pre>
   * Notification config to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
   * @return Whether the notificationConfig field is set.
   */
  @java.lang.Override
  public boolean hasNotificationConfig() {
    return notificationConfig_ != null;
  }
  /**
   * <pre>
   * Notification config to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
   * @return The notificationConfig.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig getNotificationConfig() {
    return notificationConfig_ == null ? com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.getDefaultInstance() : notificationConfig_;
  }
  /**
   * <pre>
   * Notification config to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfigOrBuilder getNotificationConfigOrBuilder() {
    return notificationConfig_ == null ? com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.getDefaultInstance() : notificationConfig_;
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
    if (notificationConfig_ != null) {
      output.writeMessage(1, getNotificationConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (notificationConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNotificationConfig());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest other = (com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest) obj;

    if (hasNotificationConfig() != other.hasNotificationConfig()) return false;
    if (hasNotificationConfig()) {
      if (!getNotificationConfig()
          .equals(other.getNotificationConfig())) return false;
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
    if (hasNotificationConfig()) {
      hash = (37 * hash) + NOTIFICATION_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getNotificationConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest prototype) {
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
   * Request message for UpdateAdherenceRuleNotificationConfig.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest)
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateAdherenceRuleNotificationConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateAdherenceRuleNotificationConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest.newBuilder()
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
      notificationConfig_ = null;
      if (notificationConfigBuilder_ != null) {
        notificationConfigBuilder_.dispose();
        notificationConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateAdherenceRuleNotificationConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest result = new com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.notificationConfig_ = notificationConfigBuilder_ == null
            ? notificationConfig_
            : notificationConfigBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest.getDefaultInstance()) return this;
      if (other.hasNotificationConfig()) {
        mergeNotificationConfig(other.getNotificationConfig());
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
                  getNotificationConfigFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig notificationConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig, com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.Builder, com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfigOrBuilder> notificationConfigBuilder_;
    /**
     * <pre>
     * Notification config to update.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
     * @return Whether the notificationConfig field is set.
     */
    public boolean hasNotificationConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Notification config to update.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
     * @return The notificationConfig.
     */
    public com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig getNotificationConfig() {
      if (notificationConfigBuilder_ == null) {
        return notificationConfig_ == null ? com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.getDefaultInstance() : notificationConfig_;
      } else {
        return notificationConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Notification config to update.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
     */
    public Builder setNotificationConfig(com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig value) {
      if (notificationConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        notificationConfig_ = value;
      } else {
        notificationConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Notification config to update.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
     */
    public Builder setNotificationConfig(
        com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.Builder builderForValue) {
      if (notificationConfigBuilder_ == null) {
        notificationConfig_ = builderForValue.build();
      } else {
        notificationConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Notification config to update.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
     */
    public Builder mergeNotificationConfig(com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig value) {
      if (notificationConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          notificationConfig_ != null &&
          notificationConfig_ != com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.getDefaultInstance()) {
          getNotificationConfigBuilder().mergeFrom(value);
        } else {
          notificationConfig_ = value;
        }
      } else {
        notificationConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Notification config to update.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
     */
    public Builder clearNotificationConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      notificationConfig_ = null;
      if (notificationConfigBuilder_ != null) {
        notificationConfigBuilder_.dispose();
        notificationConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Notification config to update.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
     */
    public com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.Builder getNotificationConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNotificationConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Notification config to update.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
     */
    public com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfigOrBuilder getNotificationConfigOrBuilder() {
      if (notificationConfigBuilder_ != null) {
        return notificationConfigBuilder_.getMessageOrBuilder();
      } else {
        return notificationConfig_ == null ?
            com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.getDefaultInstance() : notificationConfig_;
      }
    }
    /**
     * <pre>
     * Notification config to update.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleNotificationConfig notification_config = 1 [json_name = "notificationConfig"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig, com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.Builder, com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfigOrBuilder> 
        getNotificationConfigFieldBuilder() {
      if (notificationConfigBuilder_ == null) {
        notificationConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig, com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfig.Builder, com.tcn.cloud.api.api.commons.AdherenceRuleNotificationConfigOrBuilder>(
                getNotificationConfig(),
                getParentForChildren(),
                isClean());
        notificationConfig_ = null;
      }
      return notificationConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAdherenceRuleNotificationConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAdherenceRuleNotificationConfigRequest>() {
    @java.lang.Override
    public UpdateAdherenceRuleNotificationConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAdherenceRuleNotificationConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAdherenceRuleNotificationConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAdherenceRuleNotificationConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

