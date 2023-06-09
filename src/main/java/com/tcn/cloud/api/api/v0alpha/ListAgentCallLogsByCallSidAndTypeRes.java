// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes}
 */
public final class ListAgentCallLogsByCallSidAndTypeRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes)
    ListAgentCallLogsByCallSidAndTypeResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAgentCallLogsByCallSidAndTypeRes.newBuilder() to construct.
  private ListAgentCallLogsByCallSidAndTypeRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAgentCallLogsByCallSidAndTypeRes() {
    agentCallLogs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAgentCallLogsByCallSidAndTypeRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListAgentCallLogsByCallSidAndTypeRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListAgentCallLogsByCallSidAndTypeRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes.class, com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes.Builder.class);
  }

  public static final int AGENT_CALL_LOGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.AgentCallLog> agentCallLogs_;
  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.AgentCallLog> getAgentCallLogsList() {
    return agentCallLogs_;
  }
  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.AgentCallLogOrBuilder> 
      getAgentCallLogsOrBuilderList() {
    return agentCallLogs_;
  }
  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  @java.lang.Override
  public int getAgentCallLogsCount() {
    return agentCallLogs_.size();
  }
  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AgentCallLog getAgentCallLogs(int index) {
    return agentCallLogs_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AgentCallLogOrBuilder getAgentCallLogsOrBuilder(
      int index) {
    return agentCallLogs_.get(index);
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
    for (int i = 0; i < agentCallLogs_.size(); i++) {
      output.writeMessage(1, agentCallLogs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < agentCallLogs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, agentCallLogs_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes other = (com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes) obj;

    if (!getAgentCallLogsList()
        .equals(other.getAgentCallLogsList())) return false;
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
    if (getAgentCallLogsCount() > 0) {
      hash = (37 * hash) + AGENT_CALL_LOGS_FIELD_NUMBER;
      hash = (53 * hash) + getAgentCallLogsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes)
      com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListAgentCallLogsByCallSidAndTypeRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListAgentCallLogsByCallSidAndTypeRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes.class, com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes.newBuilder()
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
      if (agentCallLogsBuilder_ == null) {
        agentCallLogs_ = java.util.Collections.emptyList();
      } else {
        agentCallLogs_ = null;
        agentCallLogsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListAgentCallLogsByCallSidAndTypeRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes build() {
      com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes result = new com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes result) {
      if (agentCallLogsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          agentCallLogs_ = java.util.Collections.unmodifiableList(agentCallLogs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.agentCallLogs_ = agentCallLogs_;
      } else {
        result.agentCallLogs_ = agentCallLogsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes.getDefaultInstance()) return this;
      if (agentCallLogsBuilder_ == null) {
        if (!other.agentCallLogs_.isEmpty()) {
          if (agentCallLogs_.isEmpty()) {
            agentCallLogs_ = other.agentCallLogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgentCallLogsIsMutable();
            agentCallLogs_.addAll(other.agentCallLogs_);
          }
          onChanged();
        }
      } else {
        if (!other.agentCallLogs_.isEmpty()) {
          if (agentCallLogsBuilder_.isEmpty()) {
            agentCallLogsBuilder_.dispose();
            agentCallLogsBuilder_ = null;
            agentCallLogs_ = other.agentCallLogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            agentCallLogsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgentCallLogsFieldBuilder() : null;
          } else {
            agentCallLogsBuilder_.addAllMessages(other.agentCallLogs_);
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
              com.tcn.cloud.api.api.v0alpha.AgentCallLog m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.AgentCallLog.parser(),
                      extensionRegistry);
              if (agentCallLogsBuilder_ == null) {
                ensureAgentCallLogsIsMutable();
                agentCallLogs_.add(m);
              } else {
                agentCallLogsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.AgentCallLog> agentCallLogs_ =
      java.util.Collections.emptyList();
    private void ensureAgentCallLogsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        agentCallLogs_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.AgentCallLog>(agentCallLogs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AgentCallLog, com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder, com.tcn.cloud.api.api.v0alpha.AgentCallLogOrBuilder> agentCallLogsBuilder_;

    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.AgentCallLog> getAgentCallLogsList() {
      if (agentCallLogsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(agentCallLogs_);
      } else {
        return agentCallLogsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public int getAgentCallLogsCount() {
      if (agentCallLogsBuilder_ == null) {
        return agentCallLogs_.size();
      } else {
        return agentCallLogsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentCallLog getAgentCallLogs(int index) {
      if (agentCallLogsBuilder_ == null) {
        return agentCallLogs_.get(index);
      } else {
        return agentCallLogsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public Builder setAgentCallLogs(
        int index, com.tcn.cloud.api.api.v0alpha.AgentCallLog value) {
      if (agentCallLogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentCallLogsIsMutable();
        agentCallLogs_.set(index, value);
        onChanged();
      } else {
        agentCallLogsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public Builder setAgentCallLogs(
        int index, com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder builderForValue) {
      if (agentCallLogsBuilder_ == null) {
        ensureAgentCallLogsIsMutable();
        agentCallLogs_.set(index, builderForValue.build());
        onChanged();
      } else {
        agentCallLogsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public Builder addAgentCallLogs(com.tcn.cloud.api.api.v0alpha.AgentCallLog value) {
      if (agentCallLogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentCallLogsIsMutable();
        agentCallLogs_.add(value);
        onChanged();
      } else {
        agentCallLogsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public Builder addAgentCallLogs(
        int index, com.tcn.cloud.api.api.v0alpha.AgentCallLog value) {
      if (agentCallLogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentCallLogsIsMutable();
        agentCallLogs_.add(index, value);
        onChanged();
      } else {
        agentCallLogsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public Builder addAgentCallLogs(
        com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder builderForValue) {
      if (agentCallLogsBuilder_ == null) {
        ensureAgentCallLogsIsMutable();
        agentCallLogs_.add(builderForValue.build());
        onChanged();
      } else {
        agentCallLogsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public Builder addAgentCallLogs(
        int index, com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder builderForValue) {
      if (agentCallLogsBuilder_ == null) {
        ensureAgentCallLogsIsMutable();
        agentCallLogs_.add(index, builderForValue.build());
        onChanged();
      } else {
        agentCallLogsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public Builder addAllAgentCallLogs(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.AgentCallLog> values) {
      if (agentCallLogsBuilder_ == null) {
        ensureAgentCallLogsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, agentCallLogs_);
        onChanged();
      } else {
        agentCallLogsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public Builder clearAgentCallLogs() {
      if (agentCallLogsBuilder_ == null) {
        agentCallLogs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        agentCallLogsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public Builder removeAgentCallLogs(int index) {
      if (agentCallLogsBuilder_ == null) {
        ensureAgentCallLogsIsMutable();
        agentCallLogs_.remove(index);
        onChanged();
      } else {
        agentCallLogsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder getAgentCallLogsBuilder(
        int index) {
      return getAgentCallLogsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentCallLogOrBuilder getAgentCallLogsOrBuilder(
        int index) {
      if (agentCallLogsBuilder_ == null) {
        return agentCallLogs_.get(index);  } else {
        return agentCallLogsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.AgentCallLogOrBuilder> 
         getAgentCallLogsOrBuilderList() {
      if (agentCallLogsBuilder_ != null) {
        return agentCallLogsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(agentCallLogs_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder addAgentCallLogsBuilder() {
      return getAgentCallLogsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.AgentCallLog.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder addAgentCallLogsBuilder(
        int index) {
      return getAgentCallLogsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.AgentCallLog.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder> 
         getAgentCallLogsBuilderList() {
      return getAgentCallLogsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AgentCallLog, com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder, com.tcn.cloud.api.api.v0alpha.AgentCallLogOrBuilder> 
        getAgentCallLogsFieldBuilder() {
      if (agentCallLogsBuilder_ == null) {
        agentCallLogsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.AgentCallLog, com.tcn.cloud.api.api.v0alpha.AgentCallLog.Builder, com.tcn.cloud.api.api.v0alpha.AgentCallLogOrBuilder>(
                agentCallLogs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        agentCallLogs_ = null;
      }
      return agentCallLogsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAgentCallLogsByCallSidAndTypeRes>
      PARSER = new com.google.protobuf.AbstractParser<ListAgentCallLogsByCallSidAndTypeRes>() {
    @java.lang.Override
    public ListAgentCallLogsByCallSidAndTypeRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAgentCallLogsByCallSidAndTypeRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAgentCallLogsByCallSidAndTypeRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

