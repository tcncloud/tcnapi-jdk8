// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v1/service.proto

package com.tcn.cloud.api.services.pbx.v1;

/**
 * Protobuf type {@code services.pbx.v1.UpdateRingGroupRequest}
 */
public final class UpdateRingGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.pbx.v1.UpdateRingGroupRequest)
    UpdateRingGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateRingGroupRequest.newBuilder() to construct.
  private UpdateRingGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateRingGroupRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateRingGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_UpdateRingGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_UpdateRingGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest.class, com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest.Builder.class);
  }

  public static final int GROUP_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.services.pbx.v1.RingGroup group_;
  /**
   * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
   * @return Whether the group field is set.
   */
  @java.lang.Override
  public boolean hasGroup() {
    return group_ != null;
  }
  /**
   * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
   * @return The group.
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v1.RingGroup getGroup() {
    return group_ == null ? com.tcn.cloud.api.services.pbx.v1.RingGroup.getDefaultInstance() : group_;
  }
  /**
   * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder getGroupOrBuilder() {
    return group_ == null ? com.tcn.cloud.api.services.pbx.v1.RingGroup.getDefaultInstance() : group_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Fields to be modified.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Fields to be modified.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Fields to be modified.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (group_ != null) {
      output.writeMessage(1, getGroup());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (group_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGroup());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest other = (com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest) obj;

    if (hasGroup() != other.hasGroup()) return false;
    if (hasGroup()) {
      if (!getGroup()
          .equals(other.getGroup())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasGroup()) {
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroup().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest prototype) {
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
   * Protobuf type {@code services.pbx.v1.UpdateRingGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.pbx.v1.UpdateRingGroupRequest)
      com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_UpdateRingGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_UpdateRingGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest.class, com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest.newBuilder()
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
      group_ = null;
      if (groupBuilder_ != null) {
        groupBuilder_.dispose();
        groupBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_UpdateRingGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest build() {
      com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest buildPartial() {
      com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest result = new com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.group_ = groupBuilder_ == null
            ? group_
            : groupBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest other) {
      if (other == com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest.getDefaultInstance()) return this;
      if (other.hasGroup()) {
        mergeGroup(other.getGroup());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.services.pbx.v1.RingGroup group_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.pbx.v1.RingGroup, com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder, com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder> groupBuilder_;
    /**
     * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
     * @return Whether the group field is set.
     */
    public boolean hasGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
     * @return The group.
     */
    public com.tcn.cloud.api.services.pbx.v1.RingGroup getGroup() {
      if (groupBuilder_ == null) {
        return group_ == null ? com.tcn.cloud.api.services.pbx.v1.RingGroup.getDefaultInstance() : group_;
      } else {
        return groupBuilder_.getMessage();
      }
    }
    /**
     * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
     */
    public Builder setGroup(com.tcn.cloud.api.services.pbx.v1.RingGroup value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        group_ = value;
      } else {
        groupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
     */
    public Builder setGroup(
        com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder builderForValue) {
      if (groupBuilder_ == null) {
        group_ = builderForValue.build();
      } else {
        groupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
     */
    public Builder mergeGroup(com.tcn.cloud.api.services.pbx.v1.RingGroup value) {
      if (groupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          group_ != null &&
          group_ != com.tcn.cloud.api.services.pbx.v1.RingGroup.getDefaultInstance()) {
          getGroupBuilder().mergeFrom(value);
        } else {
          group_ = value;
        }
      } else {
        groupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
     */
    public Builder clearGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      group_ = null;
      if (groupBuilder_ != null) {
        groupBuilder_.dispose();
        groupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder getGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder getGroupOrBuilder() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilder();
      } else {
        return group_ == null ?
            com.tcn.cloud.api.services.pbx.v1.RingGroup.getDefaultInstance() : group_;
      }
    }
    /**
     * <code>.services.pbx.v1.RingGroup group = 1 [json_name = "group"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.pbx.v1.RingGroup, com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder, com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.services.pbx.v1.RingGroup, com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder, com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder>(
                getGroup(),
                getParentForChildren(),
                isClean());
        group_ = null;
      }
      return groupBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Fields to be modified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Fields to be modified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Fields to be modified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fields to be modified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fields to be modified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fields to be modified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fields to be modified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Fields to be modified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Fields to be modified.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.pbx.v1.UpdateRingGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:services.pbx.v1.UpdateRingGroupRequest)
  private static final com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest();
  }

  public static com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRingGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateRingGroupRequest>() {
    @java.lang.Override
    public UpdateRingGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateRingGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRingGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

