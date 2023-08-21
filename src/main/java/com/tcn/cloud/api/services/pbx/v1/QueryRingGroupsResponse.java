// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v1/service.proto

package com.tcn.cloud.api.services.pbx.v1;

/**
 * Protobuf type {@code services.pbx.v1.QueryRingGroupsResponse}
 */
public final class QueryRingGroupsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.pbx.v1.QueryRingGroupsResponse)
    QueryRingGroupsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRingGroupsResponse.newBuilder() to construct.
  private QueryRingGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRingGroupsResponse() {
    groups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRingGroupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_QueryRingGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_QueryRingGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse.class, com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse.Builder.class);
  }

  public static final int GROUPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.services.pbx.v1.RingGroup> groups_;
  /**
   * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.services.pbx.v1.RingGroup> getGroupsList() {
    return groups_;
  }
  /**
   * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder> 
      getGroupsOrBuilderList() {
    return groups_;
  }
  /**
   * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  @java.lang.Override
  public int getGroupsCount() {
    return groups_.size();
  }
  /**
   * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v1.RingGroup getGroups(int index) {
    return groups_.get(index);
  }
  /**
   * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder getGroupsOrBuilder(
      int index) {
    return groups_.get(index);
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
    for (int i = 0; i < groups_.size(); i++) {
      output.writeMessage(1, groups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < groups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, groups_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse other = (com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse) obj;

    if (!getGroupsList()
        .equals(other.getGroupsList())) return false;
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
    if (getGroupsCount() > 0) {
      hash = (37 * hash) + GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse prototype) {
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
   * Protobuf type {@code services.pbx.v1.QueryRingGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.pbx.v1.QueryRingGroupsResponse)
      com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_QueryRingGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_QueryRingGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse.class, com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse.newBuilder()
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
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
      } else {
        groups_ = null;
        groupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_QueryRingGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse build() {
      com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse buildPartial() {
      com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse result = new com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse result) {
      if (groupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          groups_ = java.util.Collections.unmodifiableList(groups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.groups_ = groups_;
      } else {
        result.groups_ = groupsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse) {
        return mergeFrom((com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse other) {
      if (other == com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse.getDefaultInstance()) return this;
      if (groupsBuilder_ == null) {
        if (!other.groups_.isEmpty()) {
          if (groups_.isEmpty()) {
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupsIsMutable();
            groups_.addAll(other.groups_);
          }
          onChanged();
        }
      } else {
        if (!other.groups_.isEmpty()) {
          if (groupsBuilder_.isEmpty()) {
            groupsBuilder_.dispose();
            groupsBuilder_ = null;
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            groupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGroupsFieldBuilder() : null;
          } else {
            groupsBuilder_.addAllMessages(other.groups_);
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
              com.tcn.cloud.api.services.pbx.v1.RingGroup m =
                  input.readMessage(
                      com.tcn.cloud.api.services.pbx.v1.RingGroup.parser(),
                      extensionRegistry);
              if (groupsBuilder_ == null) {
                ensureGroupsIsMutable();
                groups_.add(m);
              } else {
                groupsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.services.pbx.v1.RingGroup> groups_ =
      java.util.Collections.emptyList();
    private void ensureGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        groups_ = new java.util.ArrayList<com.tcn.cloud.api.services.pbx.v1.RingGroup>(groups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.pbx.v1.RingGroup, com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder, com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder> groupsBuilder_;

    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.pbx.v1.RingGroup> getGroupsList() {
      if (groupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(groups_);
      } else {
        return groupsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public int getGroupsCount() {
      if (groupsBuilder_ == null) {
        return groups_.size();
      } else {
        return groupsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v1.RingGroup getGroups(int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);
      } else {
        return groupsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public Builder setGroups(
        int index, com.tcn.cloud.api.services.pbx.v1.RingGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.set(index, value);
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public Builder setGroups(
        int index, com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public Builder addGroups(com.tcn.cloud.api.services.pbx.v1.RingGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public Builder addGroups(
        int index, com.tcn.cloud.api.services.pbx.v1.RingGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(index, value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public Builder addGroups(
        com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public Builder addGroups(
        int index, com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public Builder addAllGroups(
        java.lang.Iterable<? extends com.tcn.cloud.api.services.pbx.v1.RingGroup> values) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, groups_);
        onChanged();
      } else {
        groupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public Builder clearGroups() {
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        groupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public Builder removeGroups(int index) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.remove(index);
        onChanged();
      } else {
        groupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder getGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder getGroupsOrBuilder(
        int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);  } else {
        return groupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder> 
         getGroupsOrBuilderList() {
      if (groupsBuilder_ != null) {
        return groupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(groups_);
      }
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder addGroupsBuilder() {
      return getGroupsFieldBuilder().addBuilder(
          com.tcn.cloud.api.services.pbx.v1.RingGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder addGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.services.pbx.v1.RingGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .services.pbx.v1.RingGroup groups = 1 [json_name = "groups"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder> 
         getGroupsBuilderList() {
      return getGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.pbx.v1.RingGroup, com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder, com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder> 
        getGroupsFieldBuilder() {
      if (groupsBuilder_ == null) {
        groupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.services.pbx.v1.RingGroup, com.tcn.cloud.api.services.pbx.v1.RingGroup.Builder, com.tcn.cloud.api.services.pbx.v1.RingGroupOrBuilder>(
                groups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        groups_ = null;
      }
      return groupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.pbx.v1.QueryRingGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:services.pbx.v1.QueryRingGroupsResponse)
  private static final com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse();
  }

  public static com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRingGroupsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryRingGroupsResponse>() {
    @java.lang.Override
    public QueryRingGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryRingGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRingGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

