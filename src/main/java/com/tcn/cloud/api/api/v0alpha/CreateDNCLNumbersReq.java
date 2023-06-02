// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateDNCLNumbersReq}
 */
public final class CreateDNCLNumbersReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateDNCLNumbersReq)
    CreateDNCLNumbersReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDNCLNumbersReq.newBuilder() to construct.
  private CreateDNCLNumbersReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDNCLNumbersReq() {
    dncls_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDNCLNumbersReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateDNCLNumbersReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateDNCLNumbersReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq.class, com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq.Builder.class);
  }

  public static final int DNCLS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.DNCL> dncls_;
  /**
   * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.DNCL> getDnclsList() {
    return dncls_;
  }
  /**
   * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.DNCLOrBuilder> 
      getDnclsOrBuilderList() {
    return dncls_;
  }
  /**
   * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
   */
  @java.lang.Override
  public int getDnclsCount() {
    return dncls_.size();
  }
  /**
   * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DNCL getDncls(int index) {
    return dncls_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DNCLOrBuilder getDnclsOrBuilder(
      int index) {
    return dncls_.get(index);
  }

  public static final int AGENT_LOGGING_DATA_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v0alpha.AgentLoggingData agentLoggingData_;
  /**
   * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
   * @return Whether the agentLoggingData field is set.
   */
  @java.lang.Override
  public boolean hasAgentLoggingData() {
    return agentLoggingData_ != null;
  }
  /**
   * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
   * @return The agentLoggingData.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AgentLoggingData getAgentLoggingData() {
    return agentLoggingData_ == null ? com.tcn.cloud.api.api.v0alpha.AgentLoggingData.getDefaultInstance() : agentLoggingData_;
  }
  /**
   * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AgentLoggingDataOrBuilder getAgentLoggingDataOrBuilder() {
    return agentLoggingData_ == null ? com.tcn.cloud.api.api.v0alpha.AgentLoggingData.getDefaultInstance() : agentLoggingData_;
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
    for (int i = 0; i < dncls_.size(); i++) {
      output.writeMessage(1, dncls_.get(i));
    }
    if (agentLoggingData_ != null) {
      output.writeMessage(3, getAgentLoggingData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dncls_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dncls_.get(i));
    }
    if (agentLoggingData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAgentLoggingData());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq other = (com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq) obj;

    if (!getDnclsList()
        .equals(other.getDnclsList())) return false;
    if (hasAgentLoggingData() != other.hasAgentLoggingData()) return false;
    if (hasAgentLoggingData()) {
      if (!getAgentLoggingData()
          .equals(other.getAgentLoggingData())) return false;
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
    if (getDnclsCount() > 0) {
      hash = (37 * hash) + DNCLS_FIELD_NUMBER;
      hash = (53 * hash) + getDnclsList().hashCode();
    }
    if (hasAgentLoggingData()) {
      hash = (37 * hash) + AGENT_LOGGING_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getAgentLoggingData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateDNCLNumbersReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateDNCLNumbersReq)
      com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateDNCLNumbersReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateDNCLNumbersReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq.class, com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq.newBuilder()
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
      if (dnclsBuilder_ == null) {
        dncls_ = java.util.Collections.emptyList();
      } else {
        dncls_ = null;
        dnclsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      agentLoggingData_ = null;
      if (agentLoggingDataBuilder_ != null) {
        agentLoggingDataBuilder_.dispose();
        agentLoggingDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateDNCLNumbersReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq result = new com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq result) {
      if (dnclsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dncls_ = java.util.Collections.unmodifiableList(dncls_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dncls_ = dncls_;
      } else {
        result.dncls_ = dnclsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.agentLoggingData_ = agentLoggingDataBuilder_ == null
            ? agentLoggingData_
            : agentLoggingDataBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq.getDefaultInstance()) return this;
      if (dnclsBuilder_ == null) {
        if (!other.dncls_.isEmpty()) {
          if (dncls_.isEmpty()) {
            dncls_ = other.dncls_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDnclsIsMutable();
            dncls_.addAll(other.dncls_);
          }
          onChanged();
        }
      } else {
        if (!other.dncls_.isEmpty()) {
          if (dnclsBuilder_.isEmpty()) {
            dnclsBuilder_.dispose();
            dnclsBuilder_ = null;
            dncls_ = other.dncls_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dnclsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDnclsFieldBuilder() : null;
          } else {
            dnclsBuilder_.addAllMessages(other.dncls_);
          }
        }
      }
      if (other.hasAgentLoggingData()) {
        mergeAgentLoggingData(other.getAgentLoggingData());
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
              com.tcn.cloud.api.api.v0alpha.DNCL m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.DNCL.parser(),
                      extensionRegistry);
              if (dnclsBuilder_ == null) {
                ensureDnclsIsMutable();
                dncls_.add(m);
              } else {
                dnclsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 26: {
              input.readMessage(
                  getAgentLoggingDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.DNCL> dncls_ =
      java.util.Collections.emptyList();
    private void ensureDnclsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dncls_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.DNCL>(dncls_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.DNCL, com.tcn.cloud.api.api.v0alpha.DNCL.Builder, com.tcn.cloud.api.api.v0alpha.DNCLOrBuilder> dnclsBuilder_;

    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.DNCL> getDnclsList() {
      if (dnclsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dncls_);
      } else {
        return dnclsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public int getDnclsCount() {
      if (dnclsBuilder_ == null) {
        return dncls_.size();
      } else {
        return dnclsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DNCL getDncls(int index) {
      if (dnclsBuilder_ == null) {
        return dncls_.get(index);
      } else {
        return dnclsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public Builder setDncls(
        int index, com.tcn.cloud.api.api.v0alpha.DNCL value) {
      if (dnclsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDnclsIsMutable();
        dncls_.set(index, value);
        onChanged();
      } else {
        dnclsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public Builder setDncls(
        int index, com.tcn.cloud.api.api.v0alpha.DNCL.Builder builderForValue) {
      if (dnclsBuilder_ == null) {
        ensureDnclsIsMutable();
        dncls_.set(index, builderForValue.build());
        onChanged();
      } else {
        dnclsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public Builder addDncls(com.tcn.cloud.api.api.v0alpha.DNCL value) {
      if (dnclsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDnclsIsMutable();
        dncls_.add(value);
        onChanged();
      } else {
        dnclsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public Builder addDncls(
        int index, com.tcn.cloud.api.api.v0alpha.DNCL value) {
      if (dnclsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDnclsIsMutable();
        dncls_.add(index, value);
        onChanged();
      } else {
        dnclsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public Builder addDncls(
        com.tcn.cloud.api.api.v0alpha.DNCL.Builder builderForValue) {
      if (dnclsBuilder_ == null) {
        ensureDnclsIsMutable();
        dncls_.add(builderForValue.build());
        onChanged();
      } else {
        dnclsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public Builder addDncls(
        int index, com.tcn.cloud.api.api.v0alpha.DNCL.Builder builderForValue) {
      if (dnclsBuilder_ == null) {
        ensureDnclsIsMutable();
        dncls_.add(index, builderForValue.build());
        onChanged();
      } else {
        dnclsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public Builder addAllDncls(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.DNCL> values) {
      if (dnclsBuilder_ == null) {
        ensureDnclsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dncls_);
        onChanged();
      } else {
        dnclsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public Builder clearDncls() {
      if (dnclsBuilder_ == null) {
        dncls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dnclsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public Builder removeDncls(int index) {
      if (dnclsBuilder_ == null) {
        ensureDnclsIsMutable();
        dncls_.remove(index);
        onChanged();
      } else {
        dnclsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DNCL.Builder getDnclsBuilder(
        int index) {
      return getDnclsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DNCLOrBuilder getDnclsOrBuilder(
        int index) {
      if (dnclsBuilder_ == null) {
        return dncls_.get(index);  } else {
        return dnclsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.DNCLOrBuilder> 
         getDnclsOrBuilderList() {
      if (dnclsBuilder_ != null) {
        return dnclsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dncls_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DNCL.Builder addDnclsBuilder() {
      return getDnclsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.DNCL.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DNCL.Builder addDnclsBuilder(
        int index) {
      return getDnclsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.DNCL.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.DNCL dncls = 1 [json_name = "dncls"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.DNCL.Builder> 
         getDnclsBuilderList() {
      return getDnclsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.DNCL, com.tcn.cloud.api.api.v0alpha.DNCL.Builder, com.tcn.cloud.api.api.v0alpha.DNCLOrBuilder> 
        getDnclsFieldBuilder() {
      if (dnclsBuilder_ == null) {
        dnclsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.DNCL, com.tcn.cloud.api.api.v0alpha.DNCL.Builder, com.tcn.cloud.api.api.v0alpha.DNCLOrBuilder>(
                dncls_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dncls_ = null;
      }
      return dnclsBuilder_;
    }

    private com.tcn.cloud.api.api.v0alpha.AgentLoggingData agentLoggingData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AgentLoggingData, com.tcn.cloud.api.api.v0alpha.AgentLoggingData.Builder, com.tcn.cloud.api.api.v0alpha.AgentLoggingDataOrBuilder> agentLoggingDataBuilder_;
    /**
     * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
     * @return Whether the agentLoggingData field is set.
     */
    public boolean hasAgentLoggingData() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
     * @return The agentLoggingData.
     */
    public com.tcn.cloud.api.api.v0alpha.AgentLoggingData getAgentLoggingData() {
      if (agentLoggingDataBuilder_ == null) {
        return agentLoggingData_ == null ? com.tcn.cloud.api.api.v0alpha.AgentLoggingData.getDefaultInstance() : agentLoggingData_;
      } else {
        return agentLoggingDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
     */
    public Builder setAgentLoggingData(com.tcn.cloud.api.api.v0alpha.AgentLoggingData value) {
      if (agentLoggingDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentLoggingData_ = value;
      } else {
        agentLoggingDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
     */
    public Builder setAgentLoggingData(
        com.tcn.cloud.api.api.v0alpha.AgentLoggingData.Builder builderForValue) {
      if (agentLoggingDataBuilder_ == null) {
        agentLoggingData_ = builderForValue.build();
      } else {
        agentLoggingDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
     */
    public Builder mergeAgentLoggingData(com.tcn.cloud.api.api.v0alpha.AgentLoggingData value) {
      if (agentLoggingDataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          agentLoggingData_ != null &&
          agentLoggingData_ != com.tcn.cloud.api.api.v0alpha.AgentLoggingData.getDefaultInstance()) {
          getAgentLoggingDataBuilder().mergeFrom(value);
        } else {
          agentLoggingData_ = value;
        }
      } else {
        agentLoggingDataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
     */
    public Builder clearAgentLoggingData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      agentLoggingData_ = null;
      if (agentLoggingDataBuilder_ != null) {
        agentLoggingDataBuilder_.dispose();
        agentLoggingDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentLoggingData.Builder getAgentLoggingDataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAgentLoggingDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentLoggingDataOrBuilder getAgentLoggingDataOrBuilder() {
      if (agentLoggingDataBuilder_ != null) {
        return agentLoggingDataBuilder_.getMessageOrBuilder();
      } else {
        return agentLoggingData_ == null ?
            com.tcn.cloud.api.api.v0alpha.AgentLoggingData.getDefaultInstance() : agentLoggingData_;
      }
    }
    /**
     * <code>.api.v0alpha.AgentLoggingData agent_logging_data = 3 [json_name = "agentLoggingData"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AgentLoggingData, com.tcn.cloud.api.api.v0alpha.AgentLoggingData.Builder, com.tcn.cloud.api.api.v0alpha.AgentLoggingDataOrBuilder> 
        getAgentLoggingDataFieldBuilder() {
      if (agentLoggingDataBuilder_ == null) {
        agentLoggingDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.AgentLoggingData, com.tcn.cloud.api.api.v0alpha.AgentLoggingData.Builder, com.tcn.cloud.api.api.v0alpha.AgentLoggingDataOrBuilder>(
                getAgentLoggingData(),
                getParentForChildren(),
                isClean());
        agentLoggingData_ = null;
      }
      return agentLoggingDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateDNCLNumbersReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateDNCLNumbersReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDNCLNumbersReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateDNCLNumbersReq>() {
    @java.lang.Override
    public CreateDNCLNumbersReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDNCLNumbersReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDNCLNumbersReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

