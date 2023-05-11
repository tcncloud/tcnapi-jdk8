// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/p3_permissions.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response message for the UpdateP3PermissionGroup RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.UpdateP3PermissionGroupResponse}
 */
public final class UpdateP3PermissionGroupResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.UpdateP3PermissionGroupResponse)
    UpdateP3PermissionGroupResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateP3PermissionGroupResponse.newBuilder() to construct.
  private UpdateP3PermissionGroupResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateP3PermissionGroupResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateP3PermissionGroupResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse.Builder.class);
  }

  public static final int P3_PERMISSION_GROUP_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.P3PermissionGroup p3PermissionGroup_;
  /**
   * <pre>
   * The updated P3PermissionGroup
   * </pre>
   *
   * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
   * @return Whether the p3PermissionGroup field is set.
   */
  @java.lang.Override
  public boolean hasP3PermissionGroup() {
    return p3PermissionGroup_ != null;
  }
  /**
   * <pre>
   * The updated P3PermissionGroup
   * </pre>
   *
   * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
   * @return The p3PermissionGroup.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.P3PermissionGroup getP3PermissionGroup() {
    return p3PermissionGroup_ == null ? com.tcn.cloud.api.api.commons.org.P3PermissionGroup.getDefaultInstance() : p3PermissionGroup_;
  }
  /**
   * <pre>
   * The updated P3PermissionGroup
   * </pre>
   *
   * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.P3PermissionGroupOrBuilder getP3PermissionGroupOrBuilder() {
    return p3PermissionGroup_ == null ? com.tcn.cloud.api.api.commons.org.P3PermissionGroup.getDefaultInstance() : p3PermissionGroup_;
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
    if (p3PermissionGroup_ != null) {
      output.writeMessage(1, getP3PermissionGroup());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (p3PermissionGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getP3PermissionGroup());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse other = (com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse) obj;

    if (hasP3PermissionGroup() != other.hasP3PermissionGroup()) return false;
    if (hasP3PermissionGroup()) {
      if (!getP3PermissionGroup()
          .equals(other.getP3PermissionGroup())) return false;
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
    if (hasP3PermissionGroup()) {
      hash = (37 * hash) + P3_PERMISSION_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getP3PermissionGroup().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse prototype) {
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
   * Response message for the UpdateP3PermissionGroup RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.UpdateP3PermissionGroupResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.UpdateP3PermissionGroupResponse)
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse.newBuilder()
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
      p3PermissionGroup_ = null;
      if (p3PermissionGroupBuilder_ != null) {
        p3PermissionGroupBuilder_.dispose();
        p3PermissionGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_UpdateP3PermissionGroupResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse result = new com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.p3PermissionGroup_ = p3PermissionGroupBuilder_ == null
            ? p3PermissionGroup_
            : p3PermissionGroupBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse.getDefaultInstance()) return this;
      if (other.hasP3PermissionGroup()) {
        mergeP3PermissionGroup(other.getP3PermissionGroup());
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
                  getP3PermissionGroupFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.P3PermissionGroup p3PermissionGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.P3PermissionGroup, com.tcn.cloud.api.api.commons.org.P3PermissionGroup.Builder, com.tcn.cloud.api.api.commons.org.P3PermissionGroupOrBuilder> p3PermissionGroupBuilder_;
    /**
     * <pre>
     * The updated P3PermissionGroup
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
     * @return Whether the p3PermissionGroup field is set.
     */
    public boolean hasP3PermissionGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The updated P3PermissionGroup
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
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
     * The updated P3PermissionGroup
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated P3PermissionGroup
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
     */
    public Builder setP3PermissionGroup(
        com.tcn.cloud.api.api.commons.org.P3PermissionGroup.Builder builderForValue) {
      if (p3PermissionGroupBuilder_ == null) {
        p3PermissionGroup_ = builderForValue.build();
      } else {
        p3PermissionGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated P3PermissionGroup
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
     */
    public Builder mergeP3PermissionGroup(com.tcn.cloud.api.api.commons.org.P3PermissionGroup value) {
      if (p3PermissionGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          p3PermissionGroup_ != null &&
          p3PermissionGroup_ != com.tcn.cloud.api.api.commons.org.P3PermissionGroup.getDefaultInstance()) {
          getP3PermissionGroupBuilder().mergeFrom(value);
        } else {
          p3PermissionGroup_ = value;
        }
      } else {
        p3PermissionGroupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated P3PermissionGroup
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
     */
    public Builder clearP3PermissionGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * The updated P3PermissionGroup
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.P3PermissionGroup.Builder getP3PermissionGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getP3PermissionGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The updated P3PermissionGroup
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
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
     * The updated P3PermissionGroup
     * </pre>
     *
     * <code>.api.commons.org.P3PermissionGroup p3_permission_group = 1 [json_name = "p3PermissionGroup"];</code>
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.UpdateP3PermissionGroupResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.UpdateP3PermissionGroupResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateP3PermissionGroupResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateP3PermissionGroupResponse>() {
    @java.lang.Override
    public UpdateP3PermissionGroupResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateP3PermissionGroupResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateP3PermissionGroupResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.UpdateP3PermissionGroupResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

