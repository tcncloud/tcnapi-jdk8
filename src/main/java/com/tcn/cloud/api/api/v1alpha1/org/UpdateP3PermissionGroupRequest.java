// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/p3_permissions.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request message for the UpdateP3PermissionGroup RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.UpdateP3PermissionGroupRequest}
 */
public final class UpdateP3PermissionGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.UpdateP3PermissionGroupRequest)
    UpdateP3PermissionGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateP3PermissionGroupRequest.newBuilder() to construct.
  private UpdateP3PermissionGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateP3PermissionGroupRequest() {
    p3PermissionGroupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateP3PermissionGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest.Builder.class);
  }

  public static final int P3_PERMISSION_GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object p3PermissionGroupId_ = "";
  /**
   * <pre>
   * The Id of the P3PermissionGroup to be updated
   * </pre>
   *
   * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
   * @return The p3PermissionGroupId.
   */
  @java.lang.Override
  public java.lang.String getP3PermissionGroupId() {
    java.lang.Object ref = p3PermissionGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      p3PermissionGroupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Id of the P3PermissionGroup to be updated
   * </pre>
   *
   * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
   * @return The bytes for p3PermissionGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getP3PermissionGroupIdBytes() {
    java.lang.Object ref = p3PermissionGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      p3PermissionGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int P3_PERMISSION_GROUP_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.commons.org.P3PermissionGroup p3PermissionGroup_;
  /**
   * <pre>
   * P3 permission group values to update.
   * The mutable fields are: name, description, permissions.
   * </pre>
   *
   * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
   * @return Whether the p3PermissionGroup field is set.
   */
  @java.lang.Override
  public boolean hasP3PermissionGroup() {
    return p3PermissionGroup_ != null;
  }
  /**
   * <pre>
   * P3 permission group values to update.
   * The mutable fields are: name, description, permissions.
   * </pre>
   *
   * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
   * @return The p3PermissionGroup.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.P3PermissionGroup getP3PermissionGroup() {
    return p3PermissionGroup_ == null ? com.tcn.cloud.api.api.commons.org.P3PermissionGroup.getDefaultInstance() : p3PermissionGroup_;
  }
  /**
   * <pre>
   * P3 permission group values to update.
   * The mutable fields are: name, description, permissions.
   * </pre>
   *
   * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.P3PermissionGroupOrBuilder getP3PermissionGroupOrBuilder() {
    return p3PermissionGroup_ == null ? com.tcn.cloud.api.api.commons.org.P3PermissionGroup.getDefaultInstance() : p3PermissionGroup_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 10;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * Field mask for selecting which fields to update.
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
   * Field mask for selecting which fields to update.
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
   * Field mask for selecting which fields to update.
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(p3PermissionGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, p3PermissionGroupId_);
    }
    if (p3PermissionGroup_ != null) {
      output.writeMessage(3, getP3PermissionGroup());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(p3PermissionGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, p3PermissionGroupId_);
    }
    if (p3PermissionGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getP3PermissionGroup());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest other = (com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest) obj;

    if (!getP3PermissionGroupId()
        .equals(other.getP3PermissionGroupId())) return false;
    if (hasP3PermissionGroup() != other.hasP3PermissionGroup()) return false;
    if (hasP3PermissionGroup()) {
      if (!getP3PermissionGroup()
          .equals(other.getP3PermissionGroup())) return false;
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
    hash = (37 * hash) + P3_PERMISSION_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getP3PermissionGroupId().hashCode();
    if (hasP3PermissionGroup()) {
      hash = (37 * hash) + P3_PERMISSION_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getP3PermissionGroup().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest prototype) {
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
   * Request message for the UpdateP3PermissionGroup RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.UpdateP3PermissionGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.UpdateP3PermissionGroupRequest)
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest.newBuilder()
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
      p3PermissionGroupId_ = "";
      p3PermissionGroup_ = null;
      if (p3PermissionGroupBuilder_ != null) {
        p3PermissionGroupBuilder_.dispose();
        p3PermissionGroupBuilder_ = null;
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
      return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest result = new com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.p3PermissionGroupId_ = p3PermissionGroupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.p3PermissionGroup_ = p3PermissionGroupBuilder_ == null
            ? p3PermissionGroup_
            : p3PermissionGroupBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest.getDefaultInstance()) return this;
      if (!other.getP3PermissionGroupId().isEmpty()) {
        p3PermissionGroupId_ = other.p3PermissionGroupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasP3PermissionGroup()) {
        mergeP3PermissionGroup(other.getP3PermissionGroup());
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
              p3PermissionGroupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              input.readMessage(
                  getP3PermissionGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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

    private java.lang.Object p3PermissionGroupId_ = "";
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be updated
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @return The p3PermissionGroupId.
     */
    public java.lang.String getP3PermissionGroupId() {
      java.lang.Object ref = p3PermissionGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        p3PermissionGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be updated
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @return The bytes for p3PermissionGroupId.
     */
    public com.google.protobuf.ByteString
        getP3PermissionGroupIdBytes() {
      java.lang.Object ref = p3PermissionGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        p3PermissionGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be updated
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @param value The p3PermissionGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setP3PermissionGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      p3PermissionGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be updated
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearP3PermissionGroupId() {
      p3PermissionGroupId_ = getDefaultInstance().getP3PermissionGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be updated
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @param value The bytes for p3PermissionGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setP3PermissionGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      p3PermissionGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.org.P3PermissionGroup p3PermissionGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.P3PermissionGroup, com.tcn.cloud.api.api.commons.org.P3PermissionGroup.Builder, com.tcn.cloud.api.api.commons.org.P3PermissionGroupOrBuilder> p3PermissionGroupBuilder_;
    /**
     * <pre>
     * P3 permission group values to update.
     * The mutable fields are: name, description, permissions.
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
     * @return Whether the p3PermissionGroup field is set.
     */
    public boolean hasP3PermissionGroup() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * P3 permission group values to update.
     * The mutable fields are: name, description, permissions.
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
     * @return The p3PermissionGroup.
     */
    public com.tcn.cloud.api.api.commons.org.P3PermissionGroup getP3PermissionGroup() {
      if (p3PermissionGroupBuilder_ == null) {
        return p3PermissionGroup_ == null ? com.tcn.cloud.api.api.commons.org.P3PermissionGroup.getDefaultInstance() : p3PermissionGroup_;
      } else {
        return p3PermissionGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * P3 permission group values to update.
     * The mutable fields are: name, description, permissions.
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
     */
    public Builder setP3PermissionGroup(com.tcn.cloud.api.api.commons.org.P3PermissionGroup value) {
      if (p3PermissionGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        p3PermissionGroup_ = value;
      } else {
        p3PermissionGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * P3 permission group values to update.
     * The mutable fields are: name, description, permissions.
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
     */
    public Builder setP3PermissionGroup(
        com.tcn.cloud.api.api.commons.org.P3PermissionGroup.Builder builderForValue) {
      if (p3PermissionGroupBuilder_ == null) {
        p3PermissionGroup_ = builderForValue.build();
      } else {
        p3PermissionGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * P3 permission group values to update.
     * The mutable fields are: name, description, permissions.
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
     */
    public Builder mergeP3PermissionGroup(com.tcn.cloud.api.api.commons.org.P3PermissionGroup value) {
      if (p3PermissionGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          p3PermissionGroup_ != null &&
          p3PermissionGroup_ != com.tcn.cloud.api.api.commons.org.P3PermissionGroup.getDefaultInstance()) {
          getP3PermissionGroupBuilder().mergeFrom(value);
        } else {
          p3PermissionGroup_ = value;
        }
      } else {
        p3PermissionGroupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * P3 permission group values to update.
     * The mutable fields are: name, description, permissions.
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
     */
    public Builder clearP3PermissionGroup() {
      bitField0_ = (bitField0_ & ~0x00000002);
      p3PermissionGroup_ = null;
      if (p3PermissionGroupBuilder_ != null) {
        p3PermissionGroupBuilder_.dispose();
        p3PermissionGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * P3 permission group values to update.
     * The mutable fields are: name, description, permissions.
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.P3PermissionGroup.Builder getP3PermissionGroupBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getP3PermissionGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * P3 permission group values to update.
     * The mutable fields are: name, description, permissions.
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.P3PermissionGroupOrBuilder getP3PermissionGroupOrBuilder() {
      if (p3PermissionGroupBuilder_ != null) {
        return p3PermissionGroupBuilder_.getMessageOrBuilder();
      } else {
        return p3PermissionGroup_ == null ?
            com.tcn.cloud.api.api.commons.org.P3PermissionGroup.getDefaultInstance() : p3PermissionGroup_;
      }
    }
    /**
     * <pre>
     * P3 permission group values to update.
     * The mutable fields are: name, description, permissions.
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 3 [json_name = "p3PermissionGroup"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.P3PermissionGroup, com.tcn.cloud.api.api.commons.org.P3PermissionGroup.Builder, com.tcn.cloud.api.api.commons.org.P3PermissionGroupOrBuilder> 
        getP3PermissionGroupFieldBuilder() {
      if (p3PermissionGroupBuilder_ == null) {
        p3PermissionGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.P3PermissionGroup, com.tcn.cloud.api.api.commons.org.P3PermissionGroup.Builder, com.tcn.cloud.api.api.commons.org.P3PermissionGroupOrBuilder>(
                getP3PermissionGroup(),
                getParentForChildren(),
                isClean());
        p3PermissionGroup_ = null;
      }
      return p3PermissionGroupBuilder_;
    }

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * Field mask for selecting which fields to update.
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
     * Field mask for selecting which fields to update.
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
     * Field mask for selecting which fields to update.
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
     * Field mask for selecting which fields to update.
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
     * Field mask for selecting which fields to update.
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
     * Field mask for selecting which fields to update.
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
     * Field mask for selecting which fields to update.
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
     * Field mask for selecting which fields to update.
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
     * Field mask for selecting which fields to update.
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.UpdateP3PermissionGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.UpdateP3PermissionGroupRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateP3PermissionGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateP3PermissionGroupRequest>() {
    @java.lang.Override
    public UpdateP3PermissionGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateP3PermissionGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateP3PermissionGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

