// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the ListUnassignedWFMAgents RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse}
 */
public final class ListUnassignedWFMAgentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse)
    ListUnassignedWFMAgentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUnassignedWFMAgentsResponse.newBuilder() to construct.
  private ListUnassignedWFMAgentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUnassignedWFMAgentsResponse() {
    wfmAgents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUnassignedWFMAgentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUnassignedWFMAgentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUnassignedWFMAgentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse.Builder.class);
  }

  public static final int WFM_AGENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent> wfmAgents_;
  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent> getWfmAgentsList() {
    return wfmAgents_;
  }
  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder> 
      getWfmAgentsOrBuilderList() {
    return wfmAgents_;
  }
  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  @java.lang.Override
  public int getWfmAgentsCount() {
    return wfmAgents_.size();
  }
  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent getWfmAgents(int index) {
    return wfmAgents_.get(index);
  }
  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder getWfmAgentsOrBuilder(
      int index) {
    return wfmAgents_.get(index);
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
    for (int i = 0; i < wfmAgents_.size(); i++) {
      output.writeMessage(1, wfmAgents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < wfmAgents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, wfmAgents_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse) obj;

    if (!getWfmAgentsList()
        .equals(other.getWfmAgentsList())) return false;
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
    if (getWfmAgentsCount() > 0) {
      hash = (37 * hash) + WFM_AGENTS_FIELD_NUMBER;
      hash = (53 * hash) + getWfmAgentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse prototype) {
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
   * Response message for the ListUnassignedWFMAgents RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUnassignedWFMAgentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUnassignedWFMAgentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse.newBuilder()
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
      if (wfmAgentsBuilder_ == null) {
        wfmAgents_ = java.util.Collections.emptyList();
      } else {
        wfmAgents_ = null;
        wfmAgentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListUnassignedWFMAgentsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse result) {
      if (wfmAgentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          wfmAgents_ = java.util.Collections.unmodifiableList(wfmAgents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.wfmAgents_ = wfmAgents_;
      } else {
        result.wfmAgents_ = wfmAgentsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse.getDefaultInstance()) return this;
      if (wfmAgentsBuilder_ == null) {
        if (!other.wfmAgents_.isEmpty()) {
          if (wfmAgents_.isEmpty()) {
            wfmAgents_ = other.wfmAgents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWfmAgentsIsMutable();
            wfmAgents_.addAll(other.wfmAgents_);
          }
          onChanged();
        }
      } else {
        if (!other.wfmAgents_.isEmpty()) {
          if (wfmAgentsBuilder_.isEmpty()) {
            wfmAgentsBuilder_.dispose();
            wfmAgentsBuilder_ = null;
            wfmAgents_ = other.wfmAgents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            wfmAgentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWfmAgentsFieldBuilder() : null;
          } else {
            wfmAgentsBuilder_.addAllMessages(other.wfmAgents_);
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
              com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.parser(),
                      extensionRegistry);
              if (wfmAgentsBuilder_ == null) {
                ensureWfmAgentsIsMutable();
                wfmAgents_.add(m);
              } else {
                wfmAgentsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent> wfmAgents_ =
      java.util.Collections.emptyList();
    private void ensureWfmAgentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        wfmAgents_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent>(wfmAgents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder> wfmAgentsBuilder_;

    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent> getWfmAgentsList() {
      if (wfmAgentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(wfmAgents_);
      } else {
        return wfmAgentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public int getWfmAgentsCount() {
      if (wfmAgentsBuilder_ == null) {
        return wfmAgents_.size();
      } else {
        return wfmAgentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent getWfmAgents(int index) {
      if (wfmAgentsBuilder_ == null) {
        return wfmAgents_.get(index);
      } else {
        return wfmAgentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public Builder setWfmAgents(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent value) {
      if (wfmAgentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWfmAgentsIsMutable();
        wfmAgents_.set(index, value);
        onChanged();
      } else {
        wfmAgentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public Builder setWfmAgents(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder builderForValue) {
      if (wfmAgentsBuilder_ == null) {
        ensureWfmAgentsIsMutable();
        wfmAgents_.set(index, builderForValue.build());
        onChanged();
      } else {
        wfmAgentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public Builder addWfmAgents(com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent value) {
      if (wfmAgentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWfmAgentsIsMutable();
        wfmAgents_.add(value);
        onChanged();
      } else {
        wfmAgentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public Builder addWfmAgents(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent value) {
      if (wfmAgentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWfmAgentsIsMutable();
        wfmAgents_.add(index, value);
        onChanged();
      } else {
        wfmAgentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public Builder addWfmAgents(
        com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder builderForValue) {
      if (wfmAgentsBuilder_ == null) {
        ensureWfmAgentsIsMutable();
        wfmAgents_.add(builderForValue.build());
        onChanged();
      } else {
        wfmAgentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public Builder addWfmAgents(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder builderForValue) {
      if (wfmAgentsBuilder_ == null) {
        ensureWfmAgentsIsMutable();
        wfmAgents_.add(index, builderForValue.build());
        onChanged();
      } else {
        wfmAgentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public Builder addAllWfmAgents(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent> values) {
      if (wfmAgentsBuilder_ == null) {
        ensureWfmAgentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, wfmAgents_);
        onChanged();
      } else {
        wfmAgentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public Builder clearWfmAgents() {
      if (wfmAgentsBuilder_ == null) {
        wfmAgents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        wfmAgentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public Builder removeWfmAgents(int index) {
      if (wfmAgentsBuilder_ == null) {
        ensureWfmAgentsIsMutable();
        wfmAgents_.remove(index);
        onChanged();
      } else {
        wfmAgentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder getWfmAgentsBuilder(
        int index) {
      return getWfmAgentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder getWfmAgentsOrBuilder(
        int index) {
      if (wfmAgentsBuilder_ == null) {
        return wfmAgents_.get(index);  } else {
        return wfmAgentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder> 
         getWfmAgentsOrBuilderList() {
      if (wfmAgentsBuilder_ != null) {
        return wfmAgentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(wfmAgents_);
      }
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder addWfmAgentsBuilder() {
      return getWfmAgentsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.getDefaultInstance());
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder addWfmAgentsBuilder(
        int index) {
      return getWfmAgentsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.getDefaultInstance());
    }
    /**
     * <pre>
     * List of found wfm agents.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder> 
         getWfmAgentsBuilderList() {
      return getWfmAgentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder> 
        getWfmAgentsFieldBuilder() {
      if (wfmAgentsBuilder_ == null) {
        wfmAgentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder>(
                wfmAgents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        wfmAgents_ = null;
      }
      return wfmAgentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUnassignedWFMAgentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListUnassignedWFMAgentsResponse>() {
    @java.lang.Override
    public ListUnassignedWFMAgentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListUnassignedWFMAgentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUnassignedWFMAgentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

