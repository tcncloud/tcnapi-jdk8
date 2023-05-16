// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request for the UpdateOrganizationPreferences RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.UpdateOrganizationPreferencesRequest}
 */
public final class UpdateOrganizationPreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.UpdateOrganizationPreferencesRequest)
    UpdateOrganizationPreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateOrganizationPreferencesRequest.newBuilder() to construct.
  private UpdateOrganizationPreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateOrganizationPreferencesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateOrganizationPreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateOrganizationPreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateOrganizationPreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.Builder.class);
  }

  public static final int ORGANIZATION_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.OrganizationPreferences organizationPreferences_;
  /**
   * <pre>
   * Organization preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
   * @return Whether the organizationPreferences field is set.
   */
  @java.lang.Override
  public boolean hasOrganizationPreferences() {
    return organizationPreferences_ != null;
  }
  /**
   * <pre>
   * Organization preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
   * @return The organizationPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.OrganizationPreferences getOrganizationPreferences() {
    return organizationPreferences_ == null ? com.tcn.cloud.api.api.commons.org.OrganizationPreferences.getDefaultInstance() : organizationPreferences_;
  }
  /**
   * <pre>
   * Organization preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.OrganizationPreferencesOrBuilder getOrganizationPreferencesOrBuilder() {
    return organizationPreferences_ == null ? com.tcn.cloud.api.api.commons.org.OrganizationPreferences.getDefaultInstance() : organizationPreferences_;
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
    if (organizationPreferences_ != null) {
      output.writeMessage(1, getOrganizationPreferences());
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
    if (organizationPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOrganizationPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest other = (com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest) obj;

    if (hasOrganizationPreferences() != other.hasOrganizationPreferences()) return false;
    if (hasOrganizationPreferences()) {
      if (!getOrganizationPreferences()
          .equals(other.getOrganizationPreferences())) return false;
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
    if (hasOrganizationPreferences()) {
      hash = (37 * hash) + ORGANIZATION_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getOrganizationPreferences().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest prototype) {
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
   * Request for the UpdateOrganizationPreferences RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.UpdateOrganizationPreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.UpdateOrganizationPreferencesRequest)
      com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateOrganizationPreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateOrganizationPreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.newBuilder()
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
      organizationPreferences_ = null;
      if (organizationPreferencesBuilder_ != null) {
        organizationPreferencesBuilder_.dispose();
        organizationPreferencesBuilder_ = null;
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
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateOrganizationPreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest result = new com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.organizationPreferences_ = organizationPreferencesBuilder_ == null
            ? organizationPreferences_
            : organizationPreferencesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldMask_ = fieldMaskBuilder_ == null
            ? fieldMask_
            : fieldMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest.getDefaultInstance()) return this;
      if (other.hasOrganizationPreferences()) {
        mergeOrganizationPreferences(other.getOrganizationPreferences());
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
                  getOrganizationPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.OrganizationPreferences organizationPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.OrganizationPreferences, com.tcn.cloud.api.api.commons.org.OrganizationPreferences.Builder, com.tcn.cloud.api.api.commons.org.OrganizationPreferencesOrBuilder> organizationPreferencesBuilder_;
    /**
     * <pre>
     * Organization preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
     * @return Whether the organizationPreferences field is set.
     */
    public boolean hasOrganizationPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Organization preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
     * @return The organizationPreferences.
     */
    public com.tcn.cloud.api.api.commons.org.OrganizationPreferences getOrganizationPreferences() {
      if (organizationPreferencesBuilder_ == null) {
        return organizationPreferences_ == null ? com.tcn.cloud.api.api.commons.org.OrganizationPreferences.getDefaultInstance() : organizationPreferences_;
      } else {
        return organizationPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Organization preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
     */
    public Builder setOrganizationPreferences(com.tcn.cloud.api.api.commons.org.OrganizationPreferences value) {
      if (organizationPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        organizationPreferences_ = value;
      } else {
        organizationPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
     */
    public Builder setOrganizationPreferences(
        com.tcn.cloud.api.api.commons.org.OrganizationPreferences.Builder builderForValue) {
      if (organizationPreferencesBuilder_ == null) {
        organizationPreferences_ = builderForValue.build();
      } else {
        organizationPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
     */
    public Builder mergeOrganizationPreferences(com.tcn.cloud.api.api.commons.org.OrganizationPreferences value) {
      if (organizationPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          organizationPreferences_ != null &&
          organizationPreferences_ != com.tcn.cloud.api.api.commons.org.OrganizationPreferences.getDefaultInstance()) {
          getOrganizationPreferencesBuilder().mergeFrom(value);
        } else {
          organizationPreferences_ = value;
        }
      } else {
        organizationPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
     */
    public Builder clearOrganizationPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      organizationPreferences_ = null;
      if (organizationPreferencesBuilder_ != null) {
        organizationPreferencesBuilder_.dispose();
        organizationPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.OrganizationPreferences.Builder getOrganizationPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOrganizationPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Organization preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.OrganizationPreferencesOrBuilder getOrganizationPreferencesOrBuilder() {
      if (organizationPreferencesBuilder_ != null) {
        return organizationPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return organizationPreferences_ == null ?
            com.tcn.cloud.api.api.commons.org.OrganizationPreferences.getDefaultInstance() : organizationPreferences_;
      }
    }
    /**
     * <pre>
     * Organization preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.OrganizationPreferences organization_preferences = 1 [json_name = "organizationPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.OrganizationPreferences, com.tcn.cloud.api.api.commons.org.OrganizationPreferences.Builder, com.tcn.cloud.api.api.commons.org.OrganizationPreferencesOrBuilder> 
        getOrganizationPreferencesFieldBuilder() {
      if (organizationPreferencesBuilder_ == null) {
        organizationPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.OrganizationPreferences, com.tcn.cloud.api.api.commons.org.OrganizationPreferences.Builder, com.tcn.cloud.api.api.commons.org.OrganizationPreferencesOrBuilder>(
                getOrganizationPreferences(),
                getParentForChildren(),
                isClean());
        organizationPreferences_ = null;
      }
      return organizationPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.UpdateOrganizationPreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.UpdateOrganizationPreferencesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateOrganizationPreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateOrganizationPreferencesRequest>() {
    @java.lang.Override
    public UpdateOrganizationPreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateOrganizationPreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateOrganizationPreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.UpdateOrganizationPreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

