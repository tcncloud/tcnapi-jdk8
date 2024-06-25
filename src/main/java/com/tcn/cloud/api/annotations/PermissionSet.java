// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: annotations/authz.proto

package com.tcn.cloud.api.annotations;

/**
 * Protobuf type {@code annotations.PermissionSet}
 */
public final class PermissionSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:annotations.PermissionSet)
    PermissionSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PermissionSet.newBuilder() to construct.
  private PermissionSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PermissionSet() {
    permissions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PermissionSet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.annotations.AuthzProto.internal_static_annotations_PermissionSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.annotations.AuthzProto.internal_static_annotations_PermissionSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.annotations.PermissionSet.class, com.tcn.cloud.api.annotations.PermissionSet.Builder.class);
  }

  private int bitField0_;
  public static final int PERMISSIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> permissions_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.auth.Permission> permissions_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.auth.Permission>() {
            public com.tcn.cloud.api.api.commons.auth.Permission convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.auth.Permission result = com.tcn.cloud.api.api.commons.auth.Permission.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.auth.Permission.PERMISSION_UNSPECIFIED : result;
            }
          };
  /**
   * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.auth.Permission> getPermissionsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.auth.Permission>(permissions_, permissions_converter_);
  }
  /**
   * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  @java.lang.Override
  public int getPermissionsCount() {
    return permissions_.size();
  }
  /**
   * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.auth.Permission getPermissions(int index) {
    return permissions_converter_.convert(permissions_.get(index));
  }

  public static final int TAINT_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.annotations.Taint taint_;
  /**
   * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
   * @return Whether the taint field is set.
   */
  @java.lang.Override
  public boolean hasTaint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
   * @return The taint.
   */
  @java.lang.Override
  public com.tcn.cloud.api.annotations.Taint getTaint() {
    return taint_ == null ? com.tcn.cloud.api.annotations.Taint.getDefaultInstance() : taint_;
  }
  /**
   * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.annotations.TaintOrBuilder getTaintOrBuilder() {
    return taint_ == null ? com.tcn.cloud.api.annotations.Taint.getDefaultInstance() : taint_;
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
    for (int i = 0; i < permissions_.size(); i++) {
      output.writeEnum(1, permissions_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getTaint());
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
      for (int i = 0; i < permissions_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(permissions_.get(i));
      }
      size += dataSize;
      size += 1 * permissions_.size();
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTaint());
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
    if (!(obj instanceof com.tcn.cloud.api.annotations.PermissionSet)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.annotations.PermissionSet other = (com.tcn.cloud.api.annotations.PermissionSet) obj;

    if (!permissions_.equals(other.permissions_)) return false;
    if (hasTaint() != other.hasTaint()) return false;
    if (hasTaint()) {
      if (!getTaint()
          .equals(other.getTaint())) return false;
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
    if (getPermissionsCount() > 0) {
      hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
      hash = (53 * hash) + permissions_.hashCode();
    }
    if (hasTaint()) {
      hash = (37 * hash) + TAINT_FIELD_NUMBER;
      hash = (53 * hash) + getTaint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.annotations.PermissionSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.annotations.PermissionSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.annotations.PermissionSet parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.annotations.PermissionSet prototype) {
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
   * Protobuf type {@code annotations.PermissionSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:annotations.PermissionSet)
      com.tcn.cloud.api.annotations.PermissionSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.annotations.AuthzProto.internal_static_annotations_PermissionSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.annotations.AuthzProto.internal_static_annotations_PermissionSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.annotations.PermissionSet.class, com.tcn.cloud.api.annotations.PermissionSet.Builder.class);
    }

    // Construct using com.tcn.cloud.api.annotations.PermissionSet.newBuilder()
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
        getTaintFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      permissions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      taint_ = null;
      if (taintBuilder_ != null) {
        taintBuilder_.dispose();
        taintBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.annotations.AuthzProto.internal_static_annotations_PermissionSet_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.annotations.PermissionSet getDefaultInstanceForType() {
      return com.tcn.cloud.api.annotations.PermissionSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.annotations.PermissionSet build() {
      com.tcn.cloud.api.annotations.PermissionSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.annotations.PermissionSet buildPartial() {
      com.tcn.cloud.api.annotations.PermissionSet result = new com.tcn.cloud.api.annotations.PermissionSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.annotations.PermissionSet result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        permissions_ = java.util.Collections.unmodifiableList(permissions_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.permissions_ = permissions_;
    }

    private void buildPartial0(com.tcn.cloud.api.annotations.PermissionSet result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.taint_ = taintBuilder_ == null
            ? taint_
            : taintBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.tcn.cloud.api.annotations.PermissionSet) {
        return mergeFrom((com.tcn.cloud.api.annotations.PermissionSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.annotations.PermissionSet other) {
      if (other == com.tcn.cloud.api.annotations.PermissionSet.getDefaultInstance()) return this;
      if (!other.permissions_.isEmpty()) {
        if (permissions_.isEmpty()) {
          permissions_ = other.permissions_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePermissionsIsMutable();
          permissions_.addAll(other.permissions_);
        }
        onChanged();
      }
      if (other.hasTaint()) {
        mergeTaint(other.getTaint());
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
              com.tcn.cloud.api.api.commons.auth.Permission tmpValue =
                  com.tcn.cloud.api.api.commons.auth.Permission.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                ensurePermissionsIsMutable();
                permissions_.add(tmpRaw);
              }
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                com.tcn.cloud.api.api.commons.auth.Permission tmpValue =
                    com.tcn.cloud.api.api.commons.auth.Permission.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(1, tmpRaw);
                } else {
                  ensurePermissionsIsMutable();
                  permissions_.add(tmpRaw);
                }
              }
              input.popLimit(oldLimit);
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTaintFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<java.lang.Integer> permissions_ =
      java.util.Collections.emptyList();
    private void ensurePermissionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        permissions_ = new java.util.ArrayList<java.lang.Integer>(permissions_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
     * @return A list containing the permissions.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.auth.Permission> getPermissionsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.auth.Permission>(permissions_, permissions_converter_);
    }
    /**
     * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
     * @return The count of permissions.
     */
    public int getPermissionsCount() {
      return permissions_.size();
    }
    /**
     * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
     * @param index The index of the element to return.
     * @return The permissions at the given index.
     */
    public com.tcn.cloud.api.api.commons.auth.Permission getPermissions(int index) {
      return permissions_converter_.convert(permissions_.get(index));
    }
    /**
     * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
     * @param index The index to set the value at.
     * @param value The permissions to set.
     * @return This builder for chaining.
     */
    public Builder setPermissions(
        int index, com.tcn.cloud.api.api.commons.auth.Permission value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePermissionsIsMutable();
      permissions_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
     * @param value The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addPermissions(com.tcn.cloud.api.api.commons.auth.Permission value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePermissionsIsMutable();
      permissions_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
     * @param values The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addAllPermissions(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.auth.Permission> values) {
      ensurePermissionsIsMutable();
      for (com.tcn.cloud.api.api.commons.auth.Permission value : values) {
        permissions_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api.commons.auth.Permission permissions = 1 [json_name = "permissions"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPermissions() {
      permissions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.annotations.Taint taint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.annotations.Taint, com.tcn.cloud.api.annotations.Taint.Builder, com.tcn.cloud.api.annotations.TaintOrBuilder> taintBuilder_;
    /**
     * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
     * @return Whether the taint field is set.
     */
    public boolean hasTaint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
     * @return The taint.
     */
    public com.tcn.cloud.api.annotations.Taint getTaint() {
      if (taintBuilder_ == null) {
        return taint_ == null ? com.tcn.cloud.api.annotations.Taint.getDefaultInstance() : taint_;
      } else {
        return taintBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
     */
    public Builder setTaint(com.tcn.cloud.api.annotations.Taint value) {
      if (taintBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        taint_ = value;
      } else {
        taintBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
     */
    public Builder setTaint(
        com.tcn.cloud.api.annotations.Taint.Builder builderForValue) {
      if (taintBuilder_ == null) {
        taint_ = builderForValue.build();
      } else {
        taintBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
     */
    public Builder mergeTaint(com.tcn.cloud.api.annotations.Taint value) {
      if (taintBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          taint_ != null &&
          taint_ != com.tcn.cloud.api.annotations.Taint.getDefaultInstance()) {
          getTaintBuilder().mergeFrom(value);
        } else {
          taint_ = value;
        }
      } else {
        taintBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
     */
    public Builder clearTaint() {
      bitField0_ = (bitField0_ & ~0x00000002);
      taint_ = null;
      if (taintBuilder_ != null) {
        taintBuilder_.dispose();
        taintBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
     */
    public com.tcn.cloud.api.annotations.Taint.Builder getTaintBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTaintFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
     */
    public com.tcn.cloud.api.annotations.TaintOrBuilder getTaintOrBuilder() {
      if (taintBuilder_ != null) {
        return taintBuilder_.getMessageOrBuilder();
      } else {
        return taint_ == null ?
            com.tcn.cloud.api.annotations.Taint.getDefaultInstance() : taint_;
      }
    }
    /**
     * <code>optional .annotations.Taint taint = 2 [json_name = "taint"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.annotations.Taint, com.tcn.cloud.api.annotations.Taint.Builder, com.tcn.cloud.api.annotations.TaintOrBuilder> 
        getTaintFieldBuilder() {
      if (taintBuilder_ == null) {
        taintBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.annotations.Taint, com.tcn.cloud.api.annotations.Taint.Builder, com.tcn.cloud.api.annotations.TaintOrBuilder>(
                getTaint(),
                getParentForChildren(),
                isClean());
        taint_ = null;
      }
      return taintBuilder_;
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


    // @@protoc_insertion_point(builder_scope:annotations.PermissionSet)
  }

  // @@protoc_insertion_point(class_scope:annotations.PermissionSet)
  private static final com.tcn.cloud.api.annotations.PermissionSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.annotations.PermissionSet();
  }

  public static com.tcn.cloud.api.annotations.PermissionSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<PermissionSet>
      PARSER = new com.google.protobuf.AbstractParser<PermissionSet>() {
    @java.lang.Override
    public PermissionSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<PermissionSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PermissionSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.annotations.PermissionSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

