// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * Request message for the UpdateAuthConnectionSettings rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest}
 */
public final class UpdateAuthConnectionSettingsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest)
    UpdateAuthConnectionSettingsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAuthConnectionSettingsRequest.newBuilder() to construct.
  private UpdateAuthConnectionSettingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAuthConnectionSettingsRequest() {
    clientSecret_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAuthConnectionSettingsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateAuthConnectionSettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateAuthConnectionSettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SETTINGS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings settings_;
  /**
   * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
   * @return The settings.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings getSettings() {
    return settings_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.getDefaultInstance() : settings_;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettingsOrBuilder getSettingsOrBuilder() {
    return settings_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.getDefaultInstance() : settings_;
  }

  public static final int CLIENT_SECRET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientSecret_ = "";
  /**
   * <pre>
   * the secret for the connection. Only used for Azure identity type.
   * </pre>
   *
   * <code>string client_secret = 2 [json_name = "clientSecret"];</code>
   * @return The clientSecret.
   */
  @java.lang.Override
  public java.lang.String getClientSecret() {
    java.lang.Object ref = clientSecret_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientSecret_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the secret for the connection. Only used for Azure identity type.
   * </pre>
   *
   * <code>string client_secret = 2 [json_name = "clientSecret"];</code>
   * @return The bytes for clientSecret.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientSecretBytes() {
    java.lang.Object ref = clientSecret_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientSecret_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  @java.lang.Override
  public boolean hasFieldMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFieldMask() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getSettings());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientSecret_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientSecret_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getFieldMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSettings());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientSecret_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientSecret_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFieldMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest) obj;

    if (hasSettings() != other.hasSettings()) return false;
    if (hasSettings()) {
      if (!getSettings()
          .equals(other.getSettings())) return false;
    }
    if (!getClientSecret()
        .equals(other.getClientSecret())) return false;
    if (hasFieldMask() != other.hasFieldMask()) return false;
    if (hasFieldMask()) {
      if (!getFieldMask()
          .equals(other.getFieldMask())) return false;
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
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (37 * hash) + CLIENT_SECRET_FIELD_NUMBER;
    hash = (53 * hash) + getClientSecret().hashCode();
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest prototype) {
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
   * Request message for the UpdateAuthConnectionSettings rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateAuthConnectionSettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateAuthConnectionSettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSettingsFieldBuilder();
        getFieldMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      clientSecret_ = "";
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateAuthConnectionSettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.settings_ = settingsBuilder_ == null
            ? settings_
            : settingsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientSecret_ = clientSecret_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fieldMask_ = fieldMaskBuilder_ == null
            ? fieldMask_
            : fieldMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest.getDefaultInstance()) return this;
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      if (!other.getClientSecret().isEmpty()) {
        clientSecret_ = other.clientSecret_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasFieldMask()) {
        mergeFieldMask(other.getFieldMask());
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
                  getSettingsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              clientSecret_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getFieldMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings, com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettingsOrBuilder> settingsBuilder_;
    /**
     * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
     * @return The settings.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
     */
    public Builder setSettings(com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
      } else {
        settingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
     */
    public Builder setSettings(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
     */
    public Builder mergeSettings(com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings value) {
      if (settingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          settings_ != null &&
          settings_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.getDefaultInstance()) {
          getSettingsBuilder().mergeFrom(value);
        } else {
          settings_ = value;
        }
      } else {
        settingsBuilder_.mergeFrom(value);
      }
      if (settings_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
     */
    public Builder clearSettings() {
      bitField0_ = (bitField0_ & ~0x00000001);
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.Builder getSettingsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AuthConnectionSettings settings = 1 [json_name = "settings"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings, com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings, com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettings.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.AuthConnectionSettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }

    private java.lang.Object clientSecret_ = "";
    /**
     * <pre>
     * the secret for the connection. Only used for Azure identity type.
     * </pre>
     *
     * <code>string client_secret = 2 [json_name = "clientSecret"];</code>
     * @return The clientSecret.
     */
    public java.lang.String getClientSecret() {
      java.lang.Object ref = clientSecret_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientSecret_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the secret for the connection. Only used for Azure identity type.
     * </pre>
     *
     * <code>string client_secret = 2 [json_name = "clientSecret"];</code>
     * @return The bytes for clientSecret.
     */
    public com.google.protobuf.ByteString
        getClientSecretBytes() {
      java.lang.Object ref = clientSecret_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientSecret_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the secret for the connection. Only used for Azure identity type.
     * </pre>
     *
     * <code>string client_secret = 2 [json_name = "clientSecret"];</code>
     * @param value The clientSecret to set.
     * @return This builder for chaining.
     */
    public Builder setClientSecret(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientSecret_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the secret for the connection. Only used for Azure identity type.
     * </pre>
     *
     * <code>string client_secret = 2 [json_name = "clientSecret"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientSecret() {
      clientSecret_ = getDefaultInstance().getClientSecret();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the secret for the connection. Only used for Azure identity type.
     * </pre>
     *
     * <code>string client_secret = 2 [json_name = "clientSecret"];</code>
     * @param value The bytes for clientSecret to set.
     * @return This builder for chaining.
     */
    public Builder setClientSecretBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientSecret_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
     * @return Whether the fieldMask field is set.
     */
    public boolean hasFieldMask() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
     * @return The fieldMask.
     */
    public com.google.protobuf.FieldMask getFieldMask() {
      if (fieldMaskBuilder_ == null) {
        return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      } else {
        return fieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldMask_ = value;
      } else {
        fieldMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
     */
    public Builder mergeFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          fieldMask_ != null &&
          fieldMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFieldMaskBuilder().mergeFrom(value);
        } else {
          fieldMask_ = value;
        }
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }
      if (fieldMask_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
     */
    public Builder clearFieldMask() {
      bitField0_ = (bitField0_ & ~0x00000004);
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFieldMaskBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
      if (fieldMaskBuilder_ != null) {
        return fieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return fieldMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      }
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3 [json_name = "fieldMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getFieldMaskFieldBuilder() {
      if (fieldMaskBuilder_ == null) {
        fieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getFieldMask(),
                getParentForChildren(),
                isClean());
        fieldMask_ = null;
      }
      return fieldMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAuthConnectionSettingsRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAuthConnectionSettingsRequest>() {
    @java.lang.Override
    public UpdateAuthConnectionSettingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAuthConnectionSettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAuthConnectionSettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateAuthConnectionSettingsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

