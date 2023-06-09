// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * The request for api.v0alpha.UpdatePermissionGroup.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.UpdatePermissionGroupRequest}
 */
public final class UpdatePermissionGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.UpdatePermissionGroupRequest)
    UpdatePermissionGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePermissionGroupRequest.newBuilder() to construct.
  private UpdatePermissionGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePermissionGroupRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatePermissionGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePermissionGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePermissionGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest.Builder.class);
  }

  public static final int PERMISSION_GROUP_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup permissionGroup_;
  /**
   * <pre>
   * Desired resulting PermissionGroup after update.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
   * @return Whether the permissionGroup field is set.
   */
  @java.lang.Override
  public boolean hasPermissionGroup() {
    return permissionGroup_ != null;
  }
  /**
   * <pre>
   * Desired resulting PermissionGroup after update.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
   * @return The permissionGroup.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup getPermissionGroup() {
    return permissionGroup_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance() : permissionGroup_;
  }
  /**
   * <pre>
   * Desired resulting PermissionGroup after update.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder getPermissionGroupOrBuilder() {
    return permissionGroup_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance() : permissionGroup_;
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
    if (permissionGroup_ != null) {
      output.writeMessage(1, getPermissionGroup());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (permissionGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPermissionGroup());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest) obj;

    if (hasPermissionGroup() != other.hasPermissionGroup()) return false;
    if (hasPermissionGroup()) {
      if (!getPermissionGroup()
          .equals(other.getPermissionGroup())) return false;
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
    if (hasPermissionGroup()) {
      hash = (37 * hash) + PERMISSION_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getPermissionGroup().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest prototype) {
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
   * The request for api.v0alpha.UpdatePermissionGroup.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.UpdatePermissionGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.UpdatePermissionGroupRequest)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePermissionGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest.newBuilder()
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
      permissionGroup_ = null;
      if (permissionGroupBuilder_ != null) {
        permissionGroupBuilder_.dispose();
        permissionGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.permissionGroup_ = permissionGroupBuilder_ == null
            ? permissionGroup_
            : permissionGroupBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest.getDefaultInstance()) return this;
      if (other.hasPermissionGroup()) {
        mergePermissionGroup(other.getPermissionGroup());
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
                  getPermissionGroupFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup permissionGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder> permissionGroupBuilder_;
    /**
     * <pre>
     * Desired resulting PermissionGroup after update.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
     * @return Whether the permissionGroup field is set.
     */
    public boolean hasPermissionGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Desired resulting PermissionGroup after update.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
     * @return The permissionGroup.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup getPermissionGroup() {
      if (permissionGroupBuilder_ == null) {
        return permissionGroup_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance() : permissionGroup_;
      } else {
        return permissionGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Desired resulting PermissionGroup after update.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
     */
    public Builder setPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup value) {
      if (permissionGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        permissionGroup_ = value;
      } else {
        permissionGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Desired resulting PermissionGroup after update.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
     */
    public Builder setPermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder builderForValue) {
      if (permissionGroupBuilder_ == null) {
        permissionGroup_ = builderForValue.build();
      } else {
        permissionGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Desired resulting PermissionGroup after update.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
     */
    public Builder mergePermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup value) {
      if (permissionGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          permissionGroup_ != null &&
          permissionGroup_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance()) {
          getPermissionGroupBuilder().mergeFrom(value);
        } else {
          permissionGroup_ = value;
        }
      } else {
        permissionGroupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Desired resulting PermissionGroup after update.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
     */
    public Builder clearPermissionGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      permissionGroup_ = null;
      if (permissionGroupBuilder_ != null) {
        permissionGroupBuilder_.dispose();
        permissionGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Desired resulting PermissionGroup after update.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder getPermissionGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPermissionGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Desired resulting PermissionGroup after update.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder getPermissionGroupOrBuilder() {
      if (permissionGroupBuilder_ != null) {
        return permissionGroupBuilder_.getMessageOrBuilder();
      } else {
        return permissionGroup_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance() : permissionGroup_;
      }
    }
    /**
     * <pre>
     * Desired resulting PermissionGroup after update.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup permission_group = 1 [json_name = "permissionGroup"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder> 
        getPermissionGroupFieldBuilder() {
      if (permissionGroupBuilder_ == null) {
        permissionGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder>(
                getPermissionGroup(),
                getParentForChildren(),
                isClean());
        permissionGroup_ = null;
      }
      return permissionGroupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.UpdatePermissionGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.UpdatePermissionGroupRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePermissionGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePermissionGroupRequest>() {
    @java.lang.Override
    public UpdatePermissionGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdatePermissionGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePermissionGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePermissionGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

