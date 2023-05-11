// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * The response for org.Org.AddPermissionToAccountOwnerPermissionGroup
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse}
 */
public final class AddPermissionToAccountOwnerPermissionGroupResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse)
    AddPermissionToAccountOwnerPermissionGroupResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddPermissionToAccountOwnerPermissionGroupResponse.newBuilder() to construct.
  private AddPermissionToAccountOwnerPermissionGroupResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddPermissionToAccountOwnerPermissionGroupResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddPermissionToAccountOwnerPermissionGroupResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AddPermissionToAccountOwnerPermissionGroupResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AddPermissionToAccountOwnerPermissionGroupResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse.Builder.class);
  }

  public static final int DEFAULT_PERMISSION_GROUP_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup defaultPermissionGroup_;
  /**
   * <pre>
   * The newly updated default permission group.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
   * @return Whether the defaultPermissionGroup field is set.
   */
  @java.lang.Override
  public boolean hasDefaultPermissionGroup() {
    return defaultPermissionGroup_ != null;
  }
  /**
   * <pre>
   * The newly updated default permission group.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
   * @return The defaultPermissionGroup.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup getDefaultPermissionGroup() {
    return defaultPermissionGroup_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance() : defaultPermissionGroup_;
  }
  /**
   * <pre>
   * The newly updated default permission group.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder getDefaultPermissionGroupOrBuilder() {
    return defaultPermissionGroup_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance() : defaultPermissionGroup_;
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
    if (defaultPermissionGroup_ != null) {
      output.writeMessage(1, getDefaultPermissionGroup());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (defaultPermissionGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDefaultPermissionGroup());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse) obj;

    if (hasDefaultPermissionGroup() != other.hasDefaultPermissionGroup()) return false;
    if (hasDefaultPermissionGroup()) {
      if (!getDefaultPermissionGroup()
          .equals(other.getDefaultPermissionGroup())) return false;
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
    if (hasDefaultPermissionGroup()) {
      hash = (37 * hash) + DEFAULT_PERMISSION_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultPermissionGroup().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse prototype) {
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
   * The response for org.Org.AddPermissionToAccountOwnerPermissionGroup
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AddPermissionToAccountOwnerPermissionGroupResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AddPermissionToAccountOwnerPermissionGroupResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse.newBuilder()
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
      defaultPermissionGroup_ = null;
      if (defaultPermissionGroupBuilder_ != null) {
        defaultPermissionGroupBuilder_.dispose();
        defaultPermissionGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AddPermissionToAccountOwnerPermissionGroupResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.defaultPermissionGroup_ = defaultPermissionGroupBuilder_ == null
            ? defaultPermissionGroup_
            : defaultPermissionGroupBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse.getDefaultInstance()) return this;
      if (other.hasDefaultPermissionGroup()) {
        mergeDefaultPermissionGroup(other.getDefaultPermissionGroup());
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
                  getDefaultPermissionGroupFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup defaultPermissionGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder> defaultPermissionGroupBuilder_;
    /**
     * <pre>
     * The newly updated default permission group.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
     * @return Whether the defaultPermissionGroup field is set.
     */
    public boolean hasDefaultPermissionGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The newly updated default permission group.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
     * @return The defaultPermissionGroup.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup getDefaultPermissionGroup() {
      if (defaultPermissionGroupBuilder_ == null) {
        return defaultPermissionGroup_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance() : defaultPermissionGroup_;
      } else {
        return defaultPermissionGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The newly updated default permission group.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
     */
    public Builder setDefaultPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup value) {
      if (defaultPermissionGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultPermissionGroup_ = value;
      } else {
        defaultPermissionGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The newly updated default permission group.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
     */
    public Builder setDefaultPermissionGroup(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder builderForValue) {
      if (defaultPermissionGroupBuilder_ == null) {
        defaultPermissionGroup_ = builderForValue.build();
      } else {
        defaultPermissionGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The newly updated default permission group.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
     */
    public Builder mergeDefaultPermissionGroup(com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup value) {
      if (defaultPermissionGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          defaultPermissionGroup_ != null &&
          defaultPermissionGroup_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance()) {
          getDefaultPermissionGroupBuilder().mergeFrom(value);
        } else {
          defaultPermissionGroup_ = value;
        }
      } else {
        defaultPermissionGroupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The newly updated default permission group.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
     */
    public Builder clearDefaultPermissionGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      defaultPermissionGroup_ = null;
      if (defaultPermissionGroupBuilder_ != null) {
        defaultPermissionGroupBuilder_.dispose();
        defaultPermissionGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The newly updated default permission group.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder getDefaultPermissionGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDefaultPermissionGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The newly updated default permission group.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder getDefaultPermissionGroupOrBuilder() {
      if (defaultPermissionGroupBuilder_ != null) {
        return defaultPermissionGroupBuilder_.getMessageOrBuilder();
      } else {
        return defaultPermissionGroup_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.getDefaultInstance() : defaultPermissionGroup_;
      }
    }
    /**
     * <pre>
     * The newly updated default permission group.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PermissionGroup default_permission_group = 1 [json_name = "defaultPermissionGroup"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder> 
        getDefaultPermissionGroupFieldBuilder() {
      if (defaultPermissionGroupBuilder_ == null) {
        defaultPermissionGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroup.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.PermissionGroupOrBuilder>(
                getDefaultPermissionGroup(),
                getParentForChildren(),
                isClean());
        defaultPermissionGroup_ = null;
      }
      return defaultPermissionGroupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddPermissionToAccountOwnerPermissionGroupResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddPermissionToAccountOwnerPermissionGroupResponse>() {
    @java.lang.Override
    public AddPermissionToAccountOwnerPermissionGroupResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddPermissionToAccountOwnerPermissionGroupResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddPermissionToAccountOwnerPermissionGroupResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.AddPermissionToAccountOwnerPermissionGroupResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

