// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the UpdateWFMAgent RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.UpdateWFMAgentReq}
 */
public final class UpdateWFMAgentReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.UpdateWFMAgentReq)
    UpdateWFMAgentReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateWFMAgentReq.newBuilder() to construct.
  private UpdateWFMAgentReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateWFMAgentReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateWFMAgentReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateWFMAgentReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateWFMAgentReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq.Builder.class);
  }

  private int bitField0_;
  public static final int WFM_AGENT_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent wfmAgent_;
  /**
   * <pre>
   * Wfm agent to update.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
   * @return Whether the wfmAgent field is set.
   */
  @java.lang.Override
  public boolean hasWfmAgent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Wfm agent to update.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
   * @return The wfmAgent.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent getWfmAgent() {
    return wfmAgent_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.getDefaultInstance() : wfmAgent_;
  }
  /**
   * <pre>
   * Wfm agent to update.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder getWfmAgentOrBuilder() {
    return wfmAgent_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.getDefaultInstance() : wfmAgent_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getWfmAgent());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWfmAgent());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq) obj;

    if (hasWfmAgent() != other.hasWfmAgent()) return false;
    if (hasWfmAgent()) {
      if (!getWfmAgent()
          .equals(other.getWfmAgent())) return false;
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
    if (hasWfmAgent()) {
      hash = (37 * hash) + WFM_AGENT_FIELD_NUMBER;
      hash = (53 * hash) + getWfmAgent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq prototype) {
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
   * Request message for the UpdateWFMAgent RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.UpdateWFMAgentReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.UpdateWFMAgentReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateWFMAgentReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateWFMAgentReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getWfmAgentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      wfmAgent_ = null;
      if (wfmAgentBuilder_ != null) {
        wfmAgentBuilder_.dispose();
        wfmAgentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateWFMAgentReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wfmAgent_ = wfmAgentBuilder_ == null
            ? wfmAgent_
            : wfmAgentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq.getDefaultInstance()) return this;
      if (other.hasWfmAgent()) {
        mergeWfmAgent(other.getWfmAgent());
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
                  getWfmAgentFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent wfmAgent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder> wfmAgentBuilder_;
    /**
     * <pre>
     * Wfm agent to update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
     * @return Whether the wfmAgent field is set.
     */
    public boolean hasWfmAgent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Wfm agent to update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
     * @return The wfmAgent.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent getWfmAgent() {
      if (wfmAgentBuilder_ == null) {
        return wfmAgent_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.getDefaultInstance() : wfmAgent_;
      } else {
        return wfmAgentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Wfm agent to update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
     */
    public Builder setWfmAgent(com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent value) {
      if (wfmAgentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        wfmAgent_ = value;
      } else {
        wfmAgentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Wfm agent to update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
     */
    public Builder setWfmAgent(
        com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder builderForValue) {
      if (wfmAgentBuilder_ == null) {
        wfmAgent_ = builderForValue.build();
      } else {
        wfmAgentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Wfm agent to update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
     */
    public Builder mergeWfmAgent(com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent value) {
      if (wfmAgentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          wfmAgent_ != null &&
          wfmAgent_ != com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.getDefaultInstance()) {
          getWfmAgentBuilder().mergeFrom(value);
        } else {
          wfmAgent_ = value;
        }
      } else {
        wfmAgentBuilder_.mergeFrom(value);
      }
      if (wfmAgent_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Wfm agent to update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
     */
    public Builder clearWfmAgent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      wfmAgent_ = null;
      if (wfmAgentBuilder_ != null) {
        wfmAgentBuilder_.dispose();
        wfmAgentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Wfm agent to update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder getWfmAgentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWfmAgentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Wfm agent to update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder getWfmAgentOrBuilder() {
      if (wfmAgentBuilder_ != null) {
        return wfmAgentBuilder_.getMessageOrBuilder();
      } else {
        return wfmAgent_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.getDefaultInstance() : wfmAgent_;
      }
    }
    /**
     * <pre>
     * Wfm agent to update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.WFMAgent wfm_agent = 1 [json_name = "wfmAgent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder> 
        getWfmAgentFieldBuilder() {
      if (wfmAgentBuilder_ == null) {
        wfmAgentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder>(
                getWfmAgent(),
                getParentForChildren(),
                isClean());
        wfmAgent_ = null;
      }
      return wfmAgentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.UpdateWFMAgentReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.UpdateWFMAgentReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWFMAgentReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateWFMAgentReq>() {
    @java.lang.Override
    public UpdateWFMAgentReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateWFMAgentReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWFMAgentReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

