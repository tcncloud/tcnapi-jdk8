// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request for UpdateAdminClientPreferences
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.UpdateAdminClientPreferencesRequest}
 */
public final class UpdateAdminClientPreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateAdminClientPreferencesRequest)
    UpdateAdminClientPreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAdminClientPreferencesRequest.newBuilder() to construct.
  private UpdateAdminClientPreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAdminClientPreferencesRequest() {
    orgId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAdminClientPreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAdminClientPreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAdminClientPreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest.Builder.class);
  }

  public static final int ORG_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * OrgId
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  @java.lang.Override
  public java.lang.String getOrgId() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * OrgId
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrgIdBytes() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADMIN_CLIENT_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.AdminClientPreferences adminClientPreferences_;
  /**
   * <pre>
   * Filter preferences object, required to update
   * </pre>
   *
   * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
   * @return Whether the adminClientPreferences field is set.
   */
  @java.lang.Override
  public boolean hasAdminClientPreferences() {
    return adminClientPreferences_ != null;
  }
  /**
   * <pre>
   * Filter preferences object, required to update
   * </pre>
   *
   * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
   * @return The adminClientPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AdminClientPreferences getAdminClientPreferences() {
    return adminClientPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.getDefaultInstance() : adminClientPreferences_;
  }
  /**
   * <pre>
   * Filter preferences object, required to update
   * </pre>
   *
   * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AdminClientPreferencesOrBuilder getAdminClientPreferencesOrBuilder() {
    return adminClientPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.getDefaultInstance() : adminClientPreferences_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 10;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * Field mask for update request
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
   * Field mask for update request
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
   * Field mask for update request
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
    if (adminClientPreferences_ != null) {
      output.writeMessage(1, getAdminClientPreferences());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orgId_);
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
    if (adminClientPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAdminClientPreferences());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orgId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest other = (com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest) obj;

    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (hasAdminClientPreferences() != other.hasAdminClientPreferences()) return false;
    if (hasAdminClientPreferences()) {
      if (!getAdminClientPreferences()
          .equals(other.getAdminClientPreferences())) return false;
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
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    if (hasAdminClientPreferences()) {
      hash = (37 * hash) + ADMIN_CLIENT_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getAdminClientPreferences().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest prototype) {
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
   * Request for UpdateAdminClientPreferences
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.UpdateAdminClientPreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateAdminClientPreferencesRequest)
      com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAdminClientPreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAdminClientPreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest.newBuilder()
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
      orgId_ = "";
      adminClientPreferences_ = null;
      if (adminClientPreferencesBuilder_ != null) {
        adminClientPreferencesBuilder_.dispose();
        adminClientPreferencesBuilder_ = null;
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
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAdminClientPreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest build() {
      com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest result = new com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adminClientPreferences_ = adminClientPreferencesBuilder_ == null
            ? adminClientPreferences_
            : adminClientPreferencesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fieldMask_ = fieldMaskBuilder_ == null
            ? fieldMask_
            : fieldMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest.getDefaultInstance()) return this;
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAdminClientPreferences()) {
        mergeAdminClientPreferences(other.getAdminClientPreferences());
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
                  getAdminClientPreferencesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 10
            case 18: {
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 82: {
              input.readMessage(
                  getFieldMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private java.lang.Object orgId_ = "";
    /**
     * <pre>
     * OrgId
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return The orgId.
     */
    public java.lang.String getOrgId() {
      java.lang.Object ref = orgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * OrgId
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return The bytes for orgId.
     */
    public com.google.protobuf.ByteString
        getOrgIdBytes() {
      java.lang.Object ref = orgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * OrgId
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * OrgId
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * OrgId
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.AdminClientPreferences adminClientPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AdminClientPreferences, com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.Builder, com.tcn.cloud.api.api.v0alpha.AdminClientPreferencesOrBuilder> adminClientPreferencesBuilder_;
    /**
     * <pre>
     * Filter preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     * @return Whether the adminClientPreferences field is set.
     */
    public boolean hasAdminClientPreferences() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Filter preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     * @return The adminClientPreferences.
     */
    public com.tcn.cloud.api.api.v0alpha.AdminClientPreferences getAdminClientPreferences() {
      if (adminClientPreferencesBuilder_ == null) {
        return adminClientPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.getDefaultInstance() : adminClientPreferences_;
      } else {
        return adminClientPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Filter preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public Builder setAdminClientPreferences(com.tcn.cloud.api.api.v0alpha.AdminClientPreferences value) {
      if (adminClientPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adminClientPreferences_ = value;
      } else {
        adminClientPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public Builder setAdminClientPreferences(
        com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.Builder builderForValue) {
      if (adminClientPreferencesBuilder_ == null) {
        adminClientPreferences_ = builderForValue.build();
      } else {
        adminClientPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public Builder mergeAdminClientPreferences(com.tcn.cloud.api.api.v0alpha.AdminClientPreferences value) {
      if (adminClientPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          adminClientPreferences_ != null &&
          adminClientPreferences_ != com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.getDefaultInstance()) {
          getAdminClientPreferencesBuilder().mergeFrom(value);
        } else {
          adminClientPreferences_ = value;
        }
      } else {
        adminClientPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public Builder clearAdminClientPreferences() {
      bitField0_ = (bitField0_ & ~0x00000002);
      adminClientPreferences_ = null;
      if (adminClientPreferencesBuilder_ != null) {
        adminClientPreferencesBuilder_.dispose();
        adminClientPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.Builder getAdminClientPreferencesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAdminClientPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Filter preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AdminClientPreferencesOrBuilder getAdminClientPreferencesOrBuilder() {
      if (adminClientPreferencesBuilder_ != null) {
        return adminClientPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return adminClientPreferences_ == null ?
            com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.getDefaultInstance() : adminClientPreferences_;
      }
    }
    /**
     * <pre>
     * Filter preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AdminClientPreferences, com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.Builder, com.tcn.cloud.api.api.v0alpha.AdminClientPreferencesOrBuilder> 
        getAdminClientPreferencesFieldBuilder() {
      if (adminClientPreferencesBuilder_ == null) {
        adminClientPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.AdminClientPreferences, com.tcn.cloud.api.api.v0alpha.AdminClientPreferences.Builder, com.tcn.cloud.api.api.v0alpha.AdminClientPreferencesOrBuilder>(
                getAdminClientPreferences(),
                getParentForChildren(),
                isClean());
        adminClientPreferences_ = null;
      }
      return adminClientPreferencesBuilder_;
    }

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * Field mask for update request
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     * @return Whether the fieldMask field is set.
     */
    public boolean hasFieldMask() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Field mask for update request
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
     * Field mask for update request
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for update request
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for update request
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for update request
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
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
     * <pre>
     * Field mask for update request
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFieldMaskBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Field mask for update request
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
     * Field mask for update request
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateAdminClientPreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateAdminClientPreferencesRequest)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAdminClientPreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAdminClientPreferencesRequest>() {
    @java.lang.Override
    public UpdateAdminClientPreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAdminClientPreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAdminClientPreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateAdminClientPreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

