// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/agent_profile_group.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

/**
 * <pre>
 * Response message for the ListAgentProfileGroups rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.users.ListAgentProfileGroupsResponse}
 */
public final class ListAgentProfileGroupsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.users.ListAgentProfileGroupsResponse)
    ListAgentProfileGroupsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAgentProfileGroupsResponse.newBuilder() to construct.
  private ListAgentProfileGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAgentProfileGroupsResponse() {
    agentProfileGroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAgentProfileGroupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.AgentProfileGroupProto.internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.AgentProfileGroupProto.internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse.Builder.class);
  }

  public static final int AGENT_PROFILE_GROUPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.org.AgentProfileGroup> agentProfileGroups_;
  /**
   * <pre>
   * List of agent profile groups belonging to the org ID.
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.org.AgentProfileGroup> getAgentProfileGroupsList() {
    return agentProfileGroups_;
  }
  /**
   * <pre>
   * List of agent profile groups belonging to the org ID.
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder> 
      getAgentProfileGroupsOrBuilderList() {
    return agentProfileGroups_;
  }
  /**
   * <pre>
   * List of agent profile groups belonging to the org ID.
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
   */
  @java.lang.Override
  public int getAgentProfileGroupsCount() {
    return agentProfileGroups_.size();
  }
  /**
   * <pre>
   * List of agent profile groups belonging to the org ID.
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentProfileGroup getAgentProfileGroups(int index) {
    return agentProfileGroups_.get(index);
  }
  /**
   * <pre>
   * List of agent profile groups belonging to the org ID.
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder getAgentProfileGroupsOrBuilder(
      int index) {
    return agentProfileGroups_.get(index);
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
    for (int i = 0; i < agentProfileGroups_.size(); i++) {
      output.writeMessage(1, agentProfileGroups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < agentProfileGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, agentProfileGroups_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse other = (com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse) obj;

    if (!getAgentProfileGroupsList()
        .equals(other.getAgentProfileGroupsList())) return false;
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
    if (getAgentProfileGroupsCount() > 0) {
      hash = (37 * hash) + AGENT_PROFILE_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getAgentProfileGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse prototype) {
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
   * Response message for the ListAgentProfileGroups rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.users.ListAgentProfileGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.users.ListAgentProfileGroupsResponse)
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.AgentProfileGroupProto.internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.AgentProfileGroupProto.internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse.newBuilder()
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
      if (agentProfileGroupsBuilder_ == null) {
        agentProfileGroups_ = java.util.Collections.emptyList();
      } else {
        agentProfileGroups_ = null;
        agentProfileGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.AgentProfileGroupProto.internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse result = new com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse result) {
      if (agentProfileGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          agentProfileGroups_ = java.util.Collections.unmodifiableList(agentProfileGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.agentProfileGroups_ = agentProfileGroups_;
      } else {
        result.agentProfileGroups_ = agentProfileGroupsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse.getDefaultInstance()) return this;
      if (agentProfileGroupsBuilder_ == null) {
        if (!other.agentProfileGroups_.isEmpty()) {
          if (agentProfileGroups_.isEmpty()) {
            agentProfileGroups_ = other.agentProfileGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgentProfileGroupsIsMutable();
            agentProfileGroups_.addAll(other.agentProfileGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.agentProfileGroups_.isEmpty()) {
          if (agentProfileGroupsBuilder_.isEmpty()) {
            agentProfileGroupsBuilder_.dispose();
            agentProfileGroupsBuilder_ = null;
            agentProfileGroups_ = other.agentProfileGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            agentProfileGroupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgentProfileGroupsFieldBuilder() : null;
          } else {
            agentProfileGroupsBuilder_.addAllMessages(other.agentProfileGroups_);
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
              com.tcn.cloud.api.api.commons.org.AgentProfileGroup m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.org.AgentProfileGroup.parser(),
                      extensionRegistry);
              if (agentProfileGroupsBuilder_ == null) {
                ensureAgentProfileGroupsIsMutable();
                agentProfileGroups_.add(m);
              } else {
                agentProfileGroupsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.commons.org.AgentProfileGroup> agentProfileGroups_ =
      java.util.Collections.emptyList();
    private void ensureAgentProfileGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        agentProfileGroups_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.org.AgentProfileGroup>(agentProfileGroups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentProfileGroup, com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder, com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder> agentProfileGroupsBuilder_;

    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.AgentProfileGroup> getAgentProfileGroupsList() {
      if (agentProfileGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(agentProfileGroups_);
      } else {
        return agentProfileGroupsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public int getAgentProfileGroupsCount() {
      if (agentProfileGroupsBuilder_ == null) {
        return agentProfileGroups_.size();
      } else {
        return agentProfileGroupsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentProfileGroup getAgentProfileGroups(int index) {
      if (agentProfileGroupsBuilder_ == null) {
        return agentProfileGroups_.get(index);
      } else {
        return agentProfileGroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public Builder setAgentProfileGroups(
        int index, com.tcn.cloud.api.api.commons.org.AgentProfileGroup value) {
      if (agentProfileGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentProfileGroupsIsMutable();
        agentProfileGroups_.set(index, value);
        onChanged();
      } else {
        agentProfileGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public Builder setAgentProfileGroups(
        int index, com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder builderForValue) {
      if (agentProfileGroupsBuilder_ == null) {
        ensureAgentProfileGroupsIsMutable();
        agentProfileGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        agentProfileGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public Builder addAgentProfileGroups(com.tcn.cloud.api.api.commons.org.AgentProfileGroup value) {
      if (agentProfileGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentProfileGroupsIsMutable();
        agentProfileGroups_.add(value);
        onChanged();
      } else {
        agentProfileGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public Builder addAgentProfileGroups(
        int index, com.tcn.cloud.api.api.commons.org.AgentProfileGroup value) {
      if (agentProfileGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentProfileGroupsIsMutable();
        agentProfileGroups_.add(index, value);
        onChanged();
      } else {
        agentProfileGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public Builder addAgentProfileGroups(
        com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder builderForValue) {
      if (agentProfileGroupsBuilder_ == null) {
        ensureAgentProfileGroupsIsMutable();
        agentProfileGroups_.add(builderForValue.build());
        onChanged();
      } else {
        agentProfileGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public Builder addAgentProfileGroups(
        int index, com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder builderForValue) {
      if (agentProfileGroupsBuilder_ == null) {
        ensureAgentProfileGroupsIsMutable();
        agentProfileGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        agentProfileGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public Builder addAllAgentProfileGroups(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.org.AgentProfileGroup> values) {
      if (agentProfileGroupsBuilder_ == null) {
        ensureAgentProfileGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, agentProfileGroups_);
        onChanged();
      } else {
        agentProfileGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public Builder clearAgentProfileGroups() {
      if (agentProfileGroupsBuilder_ == null) {
        agentProfileGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        agentProfileGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public Builder removeAgentProfileGroups(int index) {
      if (agentProfileGroupsBuilder_ == null) {
        ensureAgentProfileGroupsIsMutable();
        agentProfileGroups_.remove(index);
        onChanged();
      } else {
        agentProfileGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder getAgentProfileGroupsBuilder(
        int index) {
      return getAgentProfileGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder getAgentProfileGroupsOrBuilder(
        int index) {
      if (agentProfileGroupsBuilder_ == null) {
        return agentProfileGroups_.get(index);  } else {
        return agentProfileGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder> 
         getAgentProfileGroupsOrBuilderList() {
      if (agentProfileGroupsBuilder_ != null) {
        return agentProfileGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(agentProfileGroups_);
      }
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder addAgentProfileGroupsBuilder() {
      return getAgentProfileGroupsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.org.AgentProfileGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder addAgentProfileGroupsBuilder(
        int index) {
      return getAgentProfileGroupsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.org.AgentProfileGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * List of agent profile groups belonging to the org ID.
     * </pre>
     *
     * <code>repeated .api.commons.org.AgentProfileGroup agent_profile_groups = 1 [json_name = "agentProfileGroups"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder> 
         getAgentProfileGroupsBuilderList() {
      return getAgentProfileGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentProfileGroup, com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder, com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder> 
        getAgentProfileGroupsFieldBuilder() {
      if (agentProfileGroupsBuilder_ == null) {
        agentProfileGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.AgentProfileGroup, com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder, com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder>(
                agentProfileGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        agentProfileGroups_ = null;
      }
      return agentProfileGroupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.users.ListAgentProfileGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.users.ListAgentProfileGroupsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAgentProfileGroupsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAgentProfileGroupsResponse>() {
    @java.lang.Override
    public ListAgentProfileGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAgentProfileGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAgentProfileGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

