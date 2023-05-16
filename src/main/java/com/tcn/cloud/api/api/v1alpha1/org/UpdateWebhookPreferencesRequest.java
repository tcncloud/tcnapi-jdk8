// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request for the UpdateWebhookPreferences RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.UpdateWebhookPreferencesRequest}
 */
public final class UpdateWebhookPreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.UpdateWebhookPreferencesRequest)
    UpdateWebhookPreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateWebhookPreferencesRequest.newBuilder() to construct.
  private UpdateWebhookPreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateWebhookPreferencesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateWebhookPreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateWebhookPreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateWebhookPreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.Builder.class);
  }

  public static final int WEBHOOK_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.WebhookPreferences webhookPreferences_;
  /**
   * <pre>
   * Webhook preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
   * @return Whether the webhookPreferences field is set.
   */
  @java.lang.Override
  public boolean hasWebhookPreferences() {
    return webhookPreferences_ != null;
  }
  /**
   * <pre>
   * Webhook preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
   * @return The webhookPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.WebhookPreferences getWebhookPreferences() {
    return webhookPreferences_ == null ? com.tcn.cloud.api.api.commons.org.WebhookPreferences.getDefaultInstance() : webhookPreferences_;
  }
  /**
   * <pre>
   * Webhook preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.WebhookPreferencesOrBuilder getWebhookPreferencesOrBuilder() {
    return webhookPreferences_ == null ? com.tcn.cloud.api.api.commons.org.WebhookPreferences.getDefaultInstance() : webhookPreferences_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 10;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  @java.lang.Override
  public boolean hasFieldMask() {
    return fieldMask_ != null;
  }
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFieldMask() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
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
    if (webhookPreferences_ != null) {
      output.writeMessage(1, getWebhookPreferences());
    }
    if (fieldMask_ != null) {
      output.writeMessage(10, getFieldMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (webhookPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWebhookPreferences());
    }
    if (fieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getFieldMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest other = (com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest) obj;

    if (hasWebhookPreferences() != other.hasWebhookPreferences()) return false;
    if (hasWebhookPreferences()) {
      if (!getWebhookPreferences()
          .equals(other.getWebhookPreferences())) return false;
    }
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
    if (hasWebhookPreferences()) {
      hash = (37 * hash) + WEBHOOK_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getWebhookPreferences().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest prototype) {
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
   * Request for the UpdateWebhookPreferences RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.UpdateWebhookPreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.UpdateWebhookPreferencesRequest)
      com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateWebhookPreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateWebhookPreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.newBuilder()
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
      webhookPreferences_ = null;
      if (webhookPreferencesBuilder_ != null) {
        webhookPreferencesBuilder_.dispose();
        webhookPreferencesBuilder_ = null;
      }
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
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateWebhookPreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest result = new com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.webhookPreferences_ = webhookPreferencesBuilder_ == null
            ? webhookPreferences_
            : webhookPreferencesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldMask_ = fieldMaskBuilder_ == null
            ? fieldMask_
            : fieldMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest.getDefaultInstance()) return this;
      if (other.hasWebhookPreferences()) {
        mergeWebhookPreferences(other.getWebhookPreferences());
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
                  getWebhookPreferencesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 82: {
              input.readMessage(
                  getFieldMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 82
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

    private com.tcn.cloud.api.api.commons.org.WebhookPreferences webhookPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.WebhookPreferences, com.tcn.cloud.api.api.commons.org.WebhookPreferences.Builder, com.tcn.cloud.api.api.commons.org.WebhookPreferencesOrBuilder> webhookPreferencesBuilder_;
    /**
     * <pre>
     * Webhook preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
     * @return Whether the webhookPreferences field is set.
     */
    public boolean hasWebhookPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Webhook preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
     * @return The webhookPreferences.
     */
    public com.tcn.cloud.api.api.commons.org.WebhookPreferences getWebhookPreferences() {
      if (webhookPreferencesBuilder_ == null) {
        return webhookPreferences_ == null ? com.tcn.cloud.api.api.commons.org.WebhookPreferences.getDefaultInstance() : webhookPreferences_;
      } else {
        return webhookPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Webhook preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
     */
    public Builder setWebhookPreferences(com.tcn.cloud.api.api.commons.org.WebhookPreferences value) {
      if (webhookPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        webhookPreferences_ = value;
      } else {
        webhookPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Webhook preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
     */
    public Builder setWebhookPreferences(
        com.tcn.cloud.api.api.commons.org.WebhookPreferences.Builder builderForValue) {
      if (webhookPreferencesBuilder_ == null) {
        webhookPreferences_ = builderForValue.build();
      } else {
        webhookPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Webhook preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
     */
    public Builder mergeWebhookPreferences(com.tcn.cloud.api.api.commons.org.WebhookPreferences value) {
      if (webhookPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          webhookPreferences_ != null &&
          webhookPreferences_ != com.tcn.cloud.api.api.commons.org.WebhookPreferences.getDefaultInstance()) {
          getWebhookPreferencesBuilder().mergeFrom(value);
        } else {
          webhookPreferences_ = value;
        }
      } else {
        webhookPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Webhook preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
     */
    public Builder clearWebhookPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      webhookPreferences_ = null;
      if (webhookPreferencesBuilder_ != null) {
        webhookPreferencesBuilder_.dispose();
        webhookPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Webhook preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.WebhookPreferences.Builder getWebhookPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWebhookPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Webhook preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.WebhookPreferencesOrBuilder getWebhookPreferencesOrBuilder() {
      if (webhookPreferencesBuilder_ != null) {
        return webhookPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return webhookPreferences_ == null ?
            com.tcn.cloud.api.api.commons.org.WebhookPreferences.getDefaultInstance() : webhookPreferences_;
      }
    }
    /**
     * <pre>
     * Webhook preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.WebhookPreferences webhook_preferences = 1 [json_name = "webhookPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.WebhookPreferences, com.tcn.cloud.api.api.commons.org.WebhookPreferences.Builder, com.tcn.cloud.api.api.commons.org.WebhookPreferencesOrBuilder> 
        getWebhookPreferencesFieldBuilder() {
      if (webhookPreferencesBuilder_ == null) {
        webhookPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.WebhookPreferences, com.tcn.cloud.api.api.commons.org.WebhookPreferences.Builder, com.tcn.cloud.api.api.commons.org.WebhookPreferencesOrBuilder>(
                getWebhookPreferences(),
                getParentForChildren(),
                isClean());
        webhookPreferences_ = null;
      }
      return webhookPreferencesBuilder_;
    }

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     * @return Whether the fieldMask field is set.
     */
    public boolean hasFieldMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
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
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder mergeFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fieldMask_ != null &&
          fieldMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFieldMaskBuilder().mergeFrom(value);
        } else {
          fieldMask_ = value;
        }
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder clearFieldMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFieldMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
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
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.UpdateWebhookPreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.UpdateWebhookPreferencesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWebhookPreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateWebhookPreferencesRequest>() {
    @java.lang.Override
    public UpdateWebhookPreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateWebhookPreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWebhookPreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.UpdateWebhookPreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

