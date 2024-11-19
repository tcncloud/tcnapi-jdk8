// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Bundle of agent states.
 * </pre>
 *
 * Protobuf type {@code api.commons.AdherenceAgentStates}
 */
public final class AdherenceAgentStates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.AdherenceAgentStates)
    AdherenceAgentStatesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdherenceAgentStates.newBuilder() to construct.
  private AdherenceAgentStates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdherenceAgentStates() {
    agentStates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdherenceAgentStates();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentStates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentStates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.AdherenceAgentStates.class, com.tcn.cloud.api.api.commons.AdherenceAgentStates.Builder.class);
  }

  public static final int AGENT_STATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.AdherenceAgentState> agentStates_;
  /**
   * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.AdherenceAgentState> getAgentStatesList() {
    return agentStates_;
  }
  /**
   * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.AdherenceAgentStateOrBuilder> 
      getAgentStatesOrBuilderList() {
    return agentStates_;
  }
  /**
   * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
   */
  @java.lang.Override
  public int getAgentStatesCount() {
    return agentStates_.size();
  }
  /**
   * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AdherenceAgentState getAgentStates(int index) {
    return agentStates_.get(index);
  }
  /**
   * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AdherenceAgentStateOrBuilder getAgentStatesOrBuilder(
      int index) {
    return agentStates_.get(index);
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
    for (int i = 0; i < agentStates_.size(); i++) {
      output.writeMessage(1, agentStates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < agentStates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, agentStates_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.AdherenceAgentStates)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.AdherenceAgentStates other = (com.tcn.cloud.api.api.commons.AdherenceAgentStates) obj;

    if (!getAgentStatesList()
        .equals(other.getAgentStatesList())) return false;
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
    if (getAgentStatesCount() > 0) {
      hash = (37 * hash) + AGENT_STATES_FIELD_NUMBER;
      hash = (53 * hash) + getAgentStatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.AdherenceAgentStates prototype) {
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
   * Bundle of agent states.
   * </pre>
   *
   * Protobuf type {@code api.commons.AdherenceAgentStates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.AdherenceAgentStates)
      com.tcn.cloud.api.api.commons.AdherenceAgentStatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentStates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentStates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.AdherenceAgentStates.class, com.tcn.cloud.api.api.commons.AdherenceAgentStates.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.AdherenceAgentStates.newBuilder()
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
      if (agentStatesBuilder_ == null) {
        agentStates_ = java.util.Collections.emptyList();
      } else {
        agentStates_ = null;
        agentStatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentStates_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AdherenceAgentStates getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.AdherenceAgentStates.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AdherenceAgentStates build() {
      com.tcn.cloud.api.api.commons.AdherenceAgentStates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AdherenceAgentStates buildPartial() {
      com.tcn.cloud.api.api.commons.AdherenceAgentStates result = new com.tcn.cloud.api.api.commons.AdherenceAgentStates(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.AdherenceAgentStates result) {
      if (agentStatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          agentStates_ = java.util.Collections.unmodifiableList(agentStates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.agentStates_ = agentStates_;
      } else {
        result.agentStates_ = agentStatesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.AdherenceAgentStates result) {
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
      if (other instanceof com.tcn.cloud.api.api.commons.AdherenceAgentStates) {
        return mergeFrom((com.tcn.cloud.api.api.commons.AdherenceAgentStates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.AdherenceAgentStates other) {
      if (other == com.tcn.cloud.api.api.commons.AdherenceAgentStates.getDefaultInstance()) return this;
      if (agentStatesBuilder_ == null) {
        if (!other.agentStates_.isEmpty()) {
          if (agentStates_.isEmpty()) {
            agentStates_ = other.agentStates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgentStatesIsMutable();
            agentStates_.addAll(other.agentStates_);
          }
          onChanged();
        }
      } else {
        if (!other.agentStates_.isEmpty()) {
          if (agentStatesBuilder_.isEmpty()) {
            agentStatesBuilder_.dispose();
            agentStatesBuilder_ = null;
            agentStates_ = other.agentStates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            agentStatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgentStatesFieldBuilder() : null;
          } else {
            agentStatesBuilder_.addAllMessages(other.agentStates_);
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
              com.tcn.cloud.api.api.commons.AdherenceAgentState m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.AdherenceAgentState.parser(),
                      extensionRegistry);
              if (agentStatesBuilder_ == null) {
                ensureAgentStatesIsMutable();
                agentStates_.add(m);
              } else {
                agentStatesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.commons.AdherenceAgentState> agentStates_ =
      java.util.Collections.emptyList();
    private void ensureAgentStatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        agentStates_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.AdherenceAgentState>(agentStates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AdherenceAgentState, com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder, com.tcn.cloud.api.api.commons.AdherenceAgentStateOrBuilder> agentStatesBuilder_;

    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.AdherenceAgentState> getAgentStatesList() {
      if (agentStatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(agentStates_);
      } else {
        return agentStatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public int getAgentStatesCount() {
      if (agentStatesBuilder_ == null) {
        return agentStates_.size();
      } else {
        return agentStatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public com.tcn.cloud.api.api.commons.AdherenceAgentState getAgentStates(int index) {
      if (agentStatesBuilder_ == null) {
        return agentStates_.get(index);
      } else {
        return agentStatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public Builder setAgentStates(
        int index, com.tcn.cloud.api.api.commons.AdherenceAgentState value) {
      if (agentStatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentStatesIsMutable();
        agentStates_.set(index, value);
        onChanged();
      } else {
        agentStatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public Builder setAgentStates(
        int index, com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder builderForValue) {
      if (agentStatesBuilder_ == null) {
        ensureAgentStatesIsMutable();
        agentStates_.set(index, builderForValue.build());
        onChanged();
      } else {
        agentStatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public Builder addAgentStates(com.tcn.cloud.api.api.commons.AdherenceAgentState value) {
      if (agentStatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentStatesIsMutable();
        agentStates_.add(value);
        onChanged();
      } else {
        agentStatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public Builder addAgentStates(
        int index, com.tcn.cloud.api.api.commons.AdherenceAgentState value) {
      if (agentStatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentStatesIsMutable();
        agentStates_.add(index, value);
        onChanged();
      } else {
        agentStatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public Builder addAgentStates(
        com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder builderForValue) {
      if (agentStatesBuilder_ == null) {
        ensureAgentStatesIsMutable();
        agentStates_.add(builderForValue.build());
        onChanged();
      } else {
        agentStatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public Builder addAgentStates(
        int index, com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder builderForValue) {
      if (agentStatesBuilder_ == null) {
        ensureAgentStatesIsMutable();
        agentStates_.add(index, builderForValue.build());
        onChanged();
      } else {
        agentStatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public Builder addAllAgentStates(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.AdherenceAgentState> values) {
      if (agentStatesBuilder_ == null) {
        ensureAgentStatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, agentStates_);
        onChanged();
      } else {
        agentStatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public Builder clearAgentStates() {
      if (agentStatesBuilder_ == null) {
        agentStates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        agentStatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public Builder removeAgentStates(int index) {
      if (agentStatesBuilder_ == null) {
        ensureAgentStatesIsMutable();
        agentStates_.remove(index);
        onChanged();
      } else {
        agentStatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder getAgentStatesBuilder(
        int index) {
      return getAgentStatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public com.tcn.cloud.api.api.commons.AdherenceAgentStateOrBuilder getAgentStatesOrBuilder(
        int index) {
      if (agentStatesBuilder_ == null) {
        return agentStates_.get(index);  } else {
        return agentStatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.AdherenceAgentStateOrBuilder> 
         getAgentStatesOrBuilderList() {
      if (agentStatesBuilder_ != null) {
        return agentStatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(agentStates_);
      }
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder addAgentStatesBuilder() {
      return getAgentStatesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.AdherenceAgentState.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder addAgentStatesBuilder(
        int index) {
      return getAgentStatesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.AdherenceAgentState.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.AdherenceAgentState agent_states = 1 [json_name = "agentStates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder> 
         getAgentStatesBuilderList() {
      return getAgentStatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AdherenceAgentState, com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder, com.tcn.cloud.api.api.commons.AdherenceAgentStateOrBuilder> 
        getAgentStatesFieldBuilder() {
      if (agentStatesBuilder_ == null) {
        agentStatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.AdherenceAgentState, com.tcn.cloud.api.api.commons.AdherenceAgentState.Builder, com.tcn.cloud.api.api.commons.AdherenceAgentStateOrBuilder>(
                agentStates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        agentStates_ = null;
      }
      return agentStatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.AdherenceAgentStates)
  }

  // @@protoc_insertion_point(class_scope:api.commons.AdherenceAgentStates)
  private static final com.tcn.cloud.api.api.commons.AdherenceAgentStates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.AdherenceAgentStates();
  }

  public static com.tcn.cloud.api.api.commons.AdherenceAgentStates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdherenceAgentStates>
      PARSER = new com.google.protobuf.AbstractParser<AdherenceAgentStates>() {
    @java.lang.Override
    public AdherenceAgentStates parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdherenceAgentStates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdherenceAgentStates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AdherenceAgentStates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

