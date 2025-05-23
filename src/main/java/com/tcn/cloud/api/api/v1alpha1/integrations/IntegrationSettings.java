// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.IntegrationSettings}
 */
public final class IntegrationSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.IntegrationSettings)
    IntegrationSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IntegrationSettings.newBuilder() to construct.
  private IntegrationSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntegrationSettings() {
    allowedIntegrations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IntegrationSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings.class, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings.Builder.class);
  }

  public static final int ALLOWED_INTEGRATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> allowedIntegrations_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.integrations.IntegrationType> allowedIntegrations_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.integrations.IntegrationType>() {
            public com.tcn.cloud.api.api.commons.integrations.IntegrationType convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.integrations.IntegrationType result = com.tcn.cloud.api.api.commons.integrations.IntegrationType.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.integrations.IntegrationType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * there is probably potential for more org specific settings within integrations that we can store in the future.
   * </pre>
   *
   * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
   * @return A list containing the allowedIntegrations.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.integrations.IntegrationType> getAllowedIntegrationsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.integrations.IntegrationType>(allowedIntegrations_, allowedIntegrations_converter_);
  }
  /**
   * <pre>
   * there is probably potential for more org specific settings within integrations that we can store in the future.
   * </pre>
   *
   * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
   * @return The count of allowedIntegrations.
   */
  @java.lang.Override
  public int getAllowedIntegrationsCount() {
    return allowedIntegrations_.size();
  }
  /**
   * <pre>
   * there is probably potential for more org specific settings within integrations that we can store in the future.
   * </pre>
   *
   * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
   * @param index The index of the element to return.
   * @return The allowedIntegrations at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.integrations.IntegrationType getAllowedIntegrations(int index) {
    return allowedIntegrations_converter_.convert(allowedIntegrations_.get(index));
  }
  /**
   * <pre>
   * there is probably potential for more org specific settings within integrations that we can store in the future.
   * </pre>
   *
   * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
   * @return A list containing the enum numeric values on the wire for allowedIntegrations.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getAllowedIntegrationsValueList() {
    return allowedIntegrations_;
  }
  /**
   * <pre>
   * there is probably potential for more org specific settings within integrations that we can store in the future.
   * </pre>
   *
   * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of allowedIntegrations at the given index.
   */
  @java.lang.Override
  public int getAllowedIntegrationsValue(int index) {
    return allowedIntegrations_.get(index);
  }
  private int allowedIntegrationsMemoizedSerializedSize;

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
    getSerializedSize();
    if (getAllowedIntegrationsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(allowedIntegrationsMemoizedSerializedSize);
    }
    for (int i = 0; i < allowedIntegrations_.size(); i++) {
      output.writeEnumNoTag(allowedIntegrations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowedIntegrations_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(allowedIntegrations_.get(i));
      }
      size += dataSize;
      if (!getAllowedIntegrationsList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }allowedIntegrationsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings other = (com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings) obj;

    if (!allowedIntegrations_.equals(other.allowedIntegrations_)) return false;
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
    if (getAllowedIntegrationsCount() > 0) {
      hash = (37 * hash) + ALLOWED_INTEGRATIONS_FIELD_NUMBER;
      hash = (53 * hash) + allowedIntegrations_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.IntegrationSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.IntegrationSettings)
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings.class, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings.newBuilder()
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
      allowedIntegrations_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationSettings_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings result = new com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        allowedIntegrations_ = java.util.Collections.unmodifiableList(allowedIntegrations_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.allowedIntegrations_ = allowedIntegrations_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings.getDefaultInstance()) return this;
      if (!other.allowedIntegrations_.isEmpty()) {
        if (allowedIntegrations_.isEmpty()) {
          allowedIntegrations_ = other.allowedIntegrations_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAllowedIntegrationsIsMutable();
          allowedIntegrations_.addAll(other.allowedIntegrations_);
        }
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
              int tmpRaw = input.readEnum();
              ensureAllowedIntegrationsIsMutable();
              allowedIntegrations_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureAllowedIntegrationsIsMutable();
                allowedIntegrations_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
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

    private java.util.List<java.lang.Integer> allowedIntegrations_ =
      java.util.Collections.emptyList();
    private void ensureAllowedIntegrationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allowedIntegrations_ = new java.util.ArrayList<java.lang.Integer>(allowedIntegrations_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @return A list containing the allowedIntegrations.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.integrations.IntegrationType> getAllowedIntegrationsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.integrations.IntegrationType>(allowedIntegrations_, allowedIntegrations_converter_);
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @return The count of allowedIntegrations.
     */
    public int getAllowedIntegrationsCount() {
      return allowedIntegrations_.size();
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @param index The index of the element to return.
     * @return The allowedIntegrations at the given index.
     */
    public com.tcn.cloud.api.api.commons.integrations.IntegrationType getAllowedIntegrations(int index) {
      return allowedIntegrations_converter_.convert(allowedIntegrations_.get(index));
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @param index The index to set the value at.
     * @param value The allowedIntegrations to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedIntegrations(
        int index, com.tcn.cloud.api.api.commons.integrations.IntegrationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedIntegrationsIsMutable();
      allowedIntegrations_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @param value The allowedIntegrations to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedIntegrations(com.tcn.cloud.api.api.commons.integrations.IntegrationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedIntegrationsIsMutable();
      allowedIntegrations_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @param values The allowedIntegrations to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedIntegrations(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.integrations.IntegrationType> values) {
      ensureAllowedIntegrationsIsMutable();
      for (com.tcn.cloud.api.api.commons.integrations.IntegrationType value : values) {
        allowedIntegrations_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowedIntegrations() {
      allowedIntegrations_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @return A list containing the enum numeric values on the wire for allowedIntegrations.
     */
    public java.util.List<java.lang.Integer>
    getAllowedIntegrationsValueList() {
      return java.util.Collections.unmodifiableList(allowedIntegrations_);
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of allowedIntegrations at the given index.
     */
    public int getAllowedIntegrationsValue(int index) {
      return allowedIntegrations_.get(index);
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for allowedIntegrations to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedIntegrationsValue(
        int index, int value) {
      ensureAllowedIntegrationsIsMutable();
      allowedIntegrations_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @param value The enum numeric value on the wire for allowedIntegrations to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedIntegrationsValue(int value) {
      ensureAllowedIntegrationsIsMutable();
      allowedIntegrations_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * there is probably potential for more org specific settings within integrations that we can store in the future.
     * </pre>
     *
     * <code>repeated .api.commons.integrations.IntegrationType allowed_integrations = 1 [json_name = "allowedIntegrations"];</code>
     * @param values The enum numeric values on the wire for allowedIntegrations to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedIntegrationsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureAllowedIntegrationsIsMutable();
      for (int value : values) {
        allowedIntegrations_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.IntegrationSettings)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.IntegrationSettings)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntegrationSettings>
      PARSER = new com.google.protobuf.AbstractParser<IntegrationSettings>() {
    @java.lang.Override
    public IntegrationSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<IntegrationSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntegrationSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

