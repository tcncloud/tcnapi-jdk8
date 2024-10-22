// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for AgentListLeavePetitions.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.AgentListLeavePetitionsResponse}
 */
public final class AgentListLeavePetitionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.AgentListLeavePetitionsResponse)
    AgentListLeavePetitionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentListLeavePetitionsResponse.newBuilder() to construct.
  private AgentListLeavePetitionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentListLeavePetitionsResponse() {
    agentLeavePetitions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentListLeavePetitionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_AgentListLeavePetitionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_AgentListLeavePetitionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse.Builder.class);
  }

  public static final int AGENT_LEAVE_PETITIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.AgentLeavePetition> agentLeavePetitions_;
  /**
   * <pre>
   * All agent leave petitions requests matching the parameters in the request.
   * </pre>
   *
   * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.AgentLeavePetition> getAgentLeavePetitionsList() {
    return agentLeavePetitions_;
  }
  /**
   * <pre>
   * All agent leave petitions requests matching the parameters in the request.
   * </pre>
   *
   * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.AgentLeavePetitionOrBuilder> 
      getAgentLeavePetitionsOrBuilderList() {
    return agentLeavePetitions_;
  }
  /**
   * <pre>
   * All agent leave petitions requests matching the parameters in the request.
   * </pre>
   *
   * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
   */
  @java.lang.Override
  public int getAgentLeavePetitionsCount() {
    return agentLeavePetitions_.size();
  }
  /**
   * <pre>
   * All agent leave petitions requests matching the parameters in the request.
   * </pre>
   *
   * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AgentLeavePetition getAgentLeavePetitions(int index) {
    return agentLeavePetitions_.get(index);
  }
  /**
   * <pre>
   * All agent leave petitions requests matching the parameters in the request.
   * </pre>
   *
   * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AgentLeavePetitionOrBuilder getAgentLeavePetitionsOrBuilder(
      int index) {
    return agentLeavePetitions_.get(index);
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
    for (int i = 0; i < agentLeavePetitions_.size(); i++) {
      output.writeMessage(1, agentLeavePetitions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < agentLeavePetitions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, agentLeavePetitions_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse other = (com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse) obj;

    if (!getAgentLeavePetitionsList()
        .equals(other.getAgentLeavePetitionsList())) return false;
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
    if (getAgentLeavePetitionsCount() > 0) {
      hash = (37 * hash) + AGENT_LEAVE_PETITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAgentLeavePetitionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse prototype) {
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
   * Response message for AgentListLeavePetitions.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.AgentListLeavePetitionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.AgentListLeavePetitionsResponse)
      com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_AgentListLeavePetitionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_AgentListLeavePetitionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse.newBuilder()
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
      if (agentLeavePetitionsBuilder_ == null) {
        agentLeavePetitions_ = java.util.Collections.emptyList();
      } else {
        agentLeavePetitions_ = null;
        agentLeavePetitionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_AgentListLeavePetitionsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse result = new com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse result) {
      if (agentLeavePetitionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          agentLeavePetitions_ = java.util.Collections.unmodifiableList(agentLeavePetitions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.agentLeavePetitions_ = agentLeavePetitions_;
      } else {
        result.agentLeavePetitions_ = agentLeavePetitionsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse.getDefaultInstance()) return this;
      if (agentLeavePetitionsBuilder_ == null) {
        if (!other.agentLeavePetitions_.isEmpty()) {
          if (agentLeavePetitions_.isEmpty()) {
            agentLeavePetitions_ = other.agentLeavePetitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgentLeavePetitionsIsMutable();
            agentLeavePetitions_.addAll(other.agentLeavePetitions_);
          }
          onChanged();
        }
      } else {
        if (!other.agentLeavePetitions_.isEmpty()) {
          if (agentLeavePetitionsBuilder_.isEmpty()) {
            agentLeavePetitionsBuilder_.dispose();
            agentLeavePetitionsBuilder_ = null;
            agentLeavePetitions_ = other.agentLeavePetitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            agentLeavePetitionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgentLeavePetitionsFieldBuilder() : null;
          } else {
            agentLeavePetitionsBuilder_.addAllMessages(other.agentLeavePetitions_);
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
              com.tcn.cloud.api.api.commons.AgentLeavePetition m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.AgentLeavePetition.parser(),
                      extensionRegistry);
              if (agentLeavePetitionsBuilder_ == null) {
                ensureAgentLeavePetitionsIsMutable();
                agentLeavePetitions_.add(m);
              } else {
                agentLeavePetitionsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.commons.AgentLeavePetition> agentLeavePetitions_ =
      java.util.Collections.emptyList();
    private void ensureAgentLeavePetitionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        agentLeavePetitions_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.AgentLeavePetition>(agentLeavePetitions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AgentLeavePetition, com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder, com.tcn.cloud.api.api.commons.AgentLeavePetitionOrBuilder> agentLeavePetitionsBuilder_;

    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.AgentLeavePetition> getAgentLeavePetitionsList() {
      if (agentLeavePetitionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(agentLeavePetitions_);
      } else {
        return agentLeavePetitionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public int getAgentLeavePetitionsCount() {
      if (agentLeavePetitionsBuilder_ == null) {
        return agentLeavePetitions_.size();
      } else {
        return agentLeavePetitionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public com.tcn.cloud.api.api.commons.AgentLeavePetition getAgentLeavePetitions(int index) {
      if (agentLeavePetitionsBuilder_ == null) {
        return agentLeavePetitions_.get(index);
      } else {
        return agentLeavePetitionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public Builder setAgentLeavePetitions(
        int index, com.tcn.cloud.api.api.commons.AgentLeavePetition value) {
      if (agentLeavePetitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentLeavePetitionsIsMutable();
        agentLeavePetitions_.set(index, value);
        onChanged();
      } else {
        agentLeavePetitionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public Builder setAgentLeavePetitions(
        int index, com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder builderForValue) {
      if (agentLeavePetitionsBuilder_ == null) {
        ensureAgentLeavePetitionsIsMutable();
        agentLeavePetitions_.set(index, builderForValue.build());
        onChanged();
      } else {
        agentLeavePetitionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public Builder addAgentLeavePetitions(com.tcn.cloud.api.api.commons.AgentLeavePetition value) {
      if (agentLeavePetitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentLeavePetitionsIsMutable();
        agentLeavePetitions_.add(value);
        onChanged();
      } else {
        agentLeavePetitionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public Builder addAgentLeavePetitions(
        int index, com.tcn.cloud.api.api.commons.AgentLeavePetition value) {
      if (agentLeavePetitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentLeavePetitionsIsMutable();
        agentLeavePetitions_.add(index, value);
        onChanged();
      } else {
        agentLeavePetitionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public Builder addAgentLeavePetitions(
        com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder builderForValue) {
      if (agentLeavePetitionsBuilder_ == null) {
        ensureAgentLeavePetitionsIsMutable();
        agentLeavePetitions_.add(builderForValue.build());
        onChanged();
      } else {
        agentLeavePetitionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public Builder addAgentLeavePetitions(
        int index, com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder builderForValue) {
      if (agentLeavePetitionsBuilder_ == null) {
        ensureAgentLeavePetitionsIsMutable();
        agentLeavePetitions_.add(index, builderForValue.build());
        onChanged();
      } else {
        agentLeavePetitionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public Builder addAllAgentLeavePetitions(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.AgentLeavePetition> values) {
      if (agentLeavePetitionsBuilder_ == null) {
        ensureAgentLeavePetitionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, agentLeavePetitions_);
        onChanged();
      } else {
        agentLeavePetitionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public Builder clearAgentLeavePetitions() {
      if (agentLeavePetitionsBuilder_ == null) {
        agentLeavePetitions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        agentLeavePetitionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public Builder removeAgentLeavePetitions(int index) {
      if (agentLeavePetitionsBuilder_ == null) {
        ensureAgentLeavePetitionsIsMutable();
        agentLeavePetitions_.remove(index);
        onChanged();
      } else {
        agentLeavePetitionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder getAgentLeavePetitionsBuilder(
        int index) {
      return getAgentLeavePetitionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public com.tcn.cloud.api.api.commons.AgentLeavePetitionOrBuilder getAgentLeavePetitionsOrBuilder(
        int index) {
      if (agentLeavePetitionsBuilder_ == null) {
        return agentLeavePetitions_.get(index);  } else {
        return agentLeavePetitionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.AgentLeavePetitionOrBuilder> 
         getAgentLeavePetitionsOrBuilderList() {
      if (agentLeavePetitionsBuilder_ != null) {
        return agentLeavePetitionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(agentLeavePetitions_);
      }
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder addAgentLeavePetitionsBuilder() {
      return getAgentLeavePetitionsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.AgentLeavePetition.getDefaultInstance());
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder addAgentLeavePetitionsBuilder(
        int index) {
      return getAgentLeavePetitionsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.AgentLeavePetition.getDefaultInstance());
    }
    /**
     * <pre>
     * All agent leave petitions requests matching the parameters in the request.
     * </pre>
     *
     * <code>repeated .api.commons.AgentLeavePetition agent_leave_petitions = 1 [json_name = "agentLeavePetitions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder> 
         getAgentLeavePetitionsBuilderList() {
      return getAgentLeavePetitionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AgentLeavePetition, com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder, com.tcn.cloud.api.api.commons.AgentLeavePetitionOrBuilder> 
        getAgentLeavePetitionsFieldBuilder() {
      if (agentLeavePetitionsBuilder_ == null) {
        agentLeavePetitionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.AgentLeavePetition, com.tcn.cloud.api.api.commons.AgentLeavePetition.Builder, com.tcn.cloud.api.api.commons.AgentLeavePetitionOrBuilder>(
                agentLeavePetitions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        agentLeavePetitions_ = null;
      }
      return agentLeavePetitionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.AgentListLeavePetitionsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.AgentListLeavePetitionsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentListLeavePetitionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<AgentListLeavePetitionsResponse>() {
    @java.lang.Override
    public AgentListLeavePetitionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgentListLeavePetitionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentListLeavePetitionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.AgentListLeavePetitionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

