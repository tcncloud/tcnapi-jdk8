// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListPermissionGroupsResponse}
 */
public final class ListPermissionGroupsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListPermissionGroupsResponse)
    ListPermissionGroupsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPermissionGroupsResponse.newBuilder() to construct.
  private ListPermissionGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPermissionGroupsResponse() {
    permissionGroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPermissionGroupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListPermissionGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListPermissionGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse.class, com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse.Builder.class);
  }

  public static final int PERMISSION_GROUPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.PermissionGroup> permissionGroups_;
  /**
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.PermissionGroup> getPermissionGroupsList() {
    return permissionGroups_;
  }
  /**
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.PermissionGroupOrBuilder> 
      getPermissionGroupsOrBuilderList() {
    return permissionGroups_;
  }
  /**
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  @java.lang.Override
  public int getPermissionGroupsCount() {
    return permissionGroups_.size();
  }
  /**
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PermissionGroup getPermissionGroups(int index) {
    return permissionGroups_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PermissionGroupOrBuilder getPermissionGroupsOrBuilder(
      int index) {
    return permissionGroups_.get(index);
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
    for (int i = 0; i < permissionGroups_.size(); i++) {
      output.writeMessage(1, permissionGroups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < permissionGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, permissionGroups_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse other = (com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse) obj;

    if (!getPermissionGroupsList()
        .equals(other.getPermissionGroupsList())) return false;
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
    if (getPermissionGroupsCount() > 0) {
      hash = (37 * hash) + PERMISSION_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getPermissionGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse prototype) {
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
   * Protobuf type {@code api.v0alpha.ListPermissionGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListPermissionGroupsResponse)
      com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListPermissionGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListPermissionGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse.class, com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse.newBuilder()
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
      if (permissionGroupsBuilder_ == null) {
        permissionGroups_ = java.util.Collections.emptyList();
      } else {
        permissionGroups_ = null;
        permissionGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListPermissionGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse build() {
      com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse result = new com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse result) {
      if (permissionGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          permissionGroups_ = java.util.Collections.unmodifiableList(permissionGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.permissionGroups_ = permissionGroups_;
      } else {
        result.permissionGroups_ = permissionGroupsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse.getDefaultInstance()) return this;
      if (permissionGroupsBuilder_ == null) {
        if (!other.permissionGroups_.isEmpty()) {
          if (permissionGroups_.isEmpty()) {
            permissionGroups_ = other.permissionGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePermissionGroupsIsMutable();
            permissionGroups_.addAll(other.permissionGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.permissionGroups_.isEmpty()) {
          if (permissionGroupsBuilder_.isEmpty()) {
            permissionGroupsBuilder_.dispose();
            permissionGroupsBuilder_ = null;
            permissionGroups_ = other.permissionGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            permissionGroupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPermissionGroupsFieldBuilder() : null;
          } else {
            permissionGroupsBuilder_.addAllMessages(other.permissionGroups_);
          }
        }
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
              com.tcn.cloud.api.api.v0alpha.PermissionGroup m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.PermissionGroup.parser(),
                      extensionRegistry);
              if (permissionGroupsBuilder_ == null) {
                ensurePermissionGroupsIsMutable();
                permissionGroups_.add(m);
              } else {
                permissionGroupsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.PermissionGroup> permissionGroups_ =
      java.util.Collections.emptyList();
    private void ensurePermissionGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        permissionGroups_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.PermissionGroup>(permissionGroups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PermissionGroup, com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder, com.tcn.cloud.api.api.v0alpha.PermissionGroupOrBuilder> permissionGroupsBuilder_;

    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.PermissionGroup> getPermissionGroupsList() {
      if (permissionGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(permissionGroups_);
      } else {
        return permissionGroupsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public int getPermissionGroupsCount() {
      if (permissionGroupsBuilder_ == null) {
        return permissionGroups_.size();
      } else {
        return permissionGroupsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PermissionGroup getPermissionGroups(int index) {
      if (permissionGroupsBuilder_ == null) {
        return permissionGroups_.get(index);
      } else {
        return permissionGroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public Builder setPermissionGroups(
        int index, com.tcn.cloud.api.api.v0alpha.PermissionGroup value) {
      if (permissionGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePermissionGroupsIsMutable();
        permissionGroups_.set(index, value);
        onChanged();
      } else {
        permissionGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public Builder setPermissionGroups(
        int index, com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder builderForValue) {
      if (permissionGroupsBuilder_ == null) {
        ensurePermissionGroupsIsMutable();
        permissionGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        permissionGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public Builder addPermissionGroups(com.tcn.cloud.api.api.v0alpha.PermissionGroup value) {
      if (permissionGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePermissionGroupsIsMutable();
        permissionGroups_.add(value);
        onChanged();
      } else {
        permissionGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public Builder addPermissionGroups(
        int index, com.tcn.cloud.api.api.v0alpha.PermissionGroup value) {
      if (permissionGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePermissionGroupsIsMutable();
        permissionGroups_.add(index, value);
        onChanged();
      } else {
        permissionGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public Builder addPermissionGroups(
        com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder builderForValue) {
      if (permissionGroupsBuilder_ == null) {
        ensurePermissionGroupsIsMutable();
        permissionGroups_.add(builderForValue.build());
        onChanged();
      } else {
        permissionGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public Builder addPermissionGroups(
        int index, com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder builderForValue) {
      if (permissionGroupsBuilder_ == null) {
        ensurePermissionGroupsIsMutable();
        permissionGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        permissionGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public Builder addAllPermissionGroups(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.PermissionGroup> values) {
      if (permissionGroupsBuilder_ == null) {
        ensurePermissionGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, permissionGroups_);
        onChanged();
      } else {
        permissionGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public Builder clearPermissionGroups() {
      if (permissionGroupsBuilder_ == null) {
        permissionGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        permissionGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public Builder removePermissionGroups(int index) {
      if (permissionGroupsBuilder_ == null) {
        ensurePermissionGroupsIsMutable();
        permissionGroups_.remove(index);
        onChanged();
      } else {
        permissionGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder getPermissionGroupsBuilder(
        int index) {
      return getPermissionGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PermissionGroupOrBuilder getPermissionGroupsOrBuilder(
        int index) {
      if (permissionGroupsBuilder_ == null) {
        return permissionGroups_.get(index);  } else {
        return permissionGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.PermissionGroupOrBuilder> 
         getPermissionGroupsOrBuilderList() {
      if (permissionGroupsBuilder_ != null) {
        return permissionGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(permissionGroups_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder addPermissionGroupsBuilder() {
      return getPermissionGroupsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.PermissionGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder addPermissionGroupsBuilder(
        int index) {
      return getPermissionGroupsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.PermissionGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.PermissionGroup permission_groups = 1 [json_name = "permissionGroups"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder> 
         getPermissionGroupsBuilderList() {
      return getPermissionGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PermissionGroup, com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder, com.tcn.cloud.api.api.v0alpha.PermissionGroupOrBuilder> 
        getPermissionGroupsFieldBuilder() {
      if (permissionGroupsBuilder_ == null) {
        permissionGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.PermissionGroup, com.tcn.cloud.api.api.v0alpha.PermissionGroup.Builder, com.tcn.cloud.api.api.v0alpha.PermissionGroupOrBuilder>(
                permissionGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        permissionGroups_ = null;
      }
      return permissionGroupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListPermissionGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListPermissionGroupsResponse)
  private static final com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPermissionGroupsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPermissionGroupsResponse>() {
    @java.lang.Override
    public ListPermissionGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPermissionGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPermissionGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListPermissionGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

