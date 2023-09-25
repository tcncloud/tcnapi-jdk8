// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CancelPreviewDialCallReq}
 */
public final class CancelPreviewDialCallReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CancelPreviewDialCallReq)
    CancelPreviewDialCallReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CancelPreviewDialCallReq.newBuilder() to construct.
  private CancelPreviewDialCallReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CancelPreviewDialCallReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CancelPreviewDialCallReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CancelPreviewDialCallReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CancelPreviewDialCallReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq.class, com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq.Builder.class);
  }

  public static final int CALL_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.SimpleCallData call_;
  /**
   * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
   * @return Whether the call field is set.
   */
  @java.lang.Override
  public boolean hasCall() {
    return call_ != null;
  }
  /**
   * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
   * @return The call.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SimpleCallData getCall() {
    return call_ == null ? com.tcn.cloud.api.api.commons.SimpleCallData.getDefaultInstance() : call_;
  }
  /**
   * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SimpleCallDataOrBuilder getCallOrBuilder() {
    return call_ == null ? com.tcn.cloud.api.api.commons.SimpleCallData.getDefaultInstance() : call_;
  }

  public static final int AGENT_SESSION_SID_FIELD_NUMBER = 2;
  private long agentSessionSid_ = 0L;
  /**
   * <code>int64 agent_session_sid = 2 [json_name = "agentSessionSid"];</code>
   * @return The agentSessionSid.
   */
  @java.lang.Override
  public long getAgentSessionSid() {
    return agentSessionSid_;
  }

  public static final int REPORT_SCRUB_OVERRIDE_FIELD_NUMBER = 3;
  private boolean reportScrubOverride_ = false;
  /**
   * <code>bool report_scrub_override = 3 [json_name = "reportScrubOverride"];</code>
   * @return The reportScrubOverride.
   */
  @java.lang.Override
  public boolean getReportScrubOverride() {
    return reportScrubOverride_;
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
    if (call_ != null) {
      output.writeMessage(1, getCall());
    }
    if (agentSessionSid_ != 0L) {
      output.writeInt64(2, agentSessionSid_);
    }
    if (reportScrubOverride_ != false) {
      output.writeBool(3, reportScrubOverride_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (call_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCall());
    }
    if (agentSessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, agentSessionSid_);
    }
    if (reportScrubOverride_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, reportScrubOverride_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq other = (com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq) obj;

    if (hasCall() != other.hasCall()) return false;
    if (hasCall()) {
      if (!getCall()
          .equals(other.getCall())) return false;
    }
    if (getAgentSessionSid()
        != other.getAgentSessionSid()) return false;
    if (getReportScrubOverride()
        != other.getReportScrubOverride()) return false;
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
    if (hasCall()) {
      hash = (37 * hash) + CALL_FIELD_NUMBER;
      hash = (53 * hash) + getCall().hashCode();
    }
    hash = (37 * hash) + AGENT_SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAgentSessionSid());
    hash = (37 * hash) + REPORT_SCRUB_OVERRIDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReportScrubOverride());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CancelPreviewDialCallReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CancelPreviewDialCallReq)
      com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CancelPreviewDialCallReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CancelPreviewDialCallReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq.class, com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq.newBuilder()
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
      call_ = null;
      if (callBuilder_ != null) {
        callBuilder_.dispose();
        callBuilder_ = null;
      }
      agentSessionSid_ = 0L;
      reportScrubOverride_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CancelPreviewDialCallReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq build() {
      com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq result = new com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.call_ = callBuilder_ == null
            ? call_
            : callBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.agentSessionSid_ = agentSessionSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.reportScrubOverride_ = reportScrubOverride_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq.getDefaultInstance()) return this;
      if (other.hasCall()) {
        mergeCall(other.getCall());
      }
      if (other.getAgentSessionSid() != 0L) {
        setAgentSessionSid(other.getAgentSessionSid());
      }
      if (other.getReportScrubOverride() != false) {
        setReportScrubOverride(other.getReportScrubOverride());
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
                  getCallFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              agentSessionSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              reportScrubOverride_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.tcn.cloud.api.api.commons.SimpleCallData call_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SimpleCallData, com.tcn.cloud.api.api.commons.SimpleCallData.Builder, com.tcn.cloud.api.api.commons.SimpleCallDataOrBuilder> callBuilder_;
    /**
     * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
     * @return Whether the call field is set.
     */
    public boolean hasCall() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
     * @return The call.
     */
    public com.tcn.cloud.api.api.commons.SimpleCallData getCall() {
      if (callBuilder_ == null) {
        return call_ == null ? com.tcn.cloud.api.api.commons.SimpleCallData.getDefaultInstance() : call_;
      } else {
        return callBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
     */
    public Builder setCall(com.tcn.cloud.api.api.commons.SimpleCallData value) {
      if (callBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        call_ = value;
      } else {
        callBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
     */
    public Builder setCall(
        com.tcn.cloud.api.api.commons.SimpleCallData.Builder builderForValue) {
      if (callBuilder_ == null) {
        call_ = builderForValue.build();
      } else {
        callBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
     */
    public Builder mergeCall(com.tcn.cloud.api.api.commons.SimpleCallData value) {
      if (callBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          call_ != null &&
          call_ != com.tcn.cloud.api.api.commons.SimpleCallData.getDefaultInstance()) {
          getCallBuilder().mergeFrom(value);
        } else {
          call_ = value;
        }
      } else {
        callBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
     */
    public Builder clearCall() {
      bitField0_ = (bitField0_ & ~0x00000001);
      call_ = null;
      if (callBuilder_ != null) {
        callBuilder_.dispose();
        callBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
     */
    public com.tcn.cloud.api.api.commons.SimpleCallData.Builder getCallBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCallFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
     */
    public com.tcn.cloud.api.api.commons.SimpleCallDataOrBuilder getCallOrBuilder() {
      if (callBuilder_ != null) {
        return callBuilder_.getMessageOrBuilder();
      } else {
        return call_ == null ?
            com.tcn.cloud.api.api.commons.SimpleCallData.getDefaultInstance() : call_;
      }
    }
    /**
     * <code>.api.commons.SimpleCallData call = 1 [json_name = "call"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SimpleCallData, com.tcn.cloud.api.api.commons.SimpleCallData.Builder, com.tcn.cloud.api.api.commons.SimpleCallDataOrBuilder> 
        getCallFieldBuilder() {
      if (callBuilder_ == null) {
        callBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.SimpleCallData, com.tcn.cloud.api.api.commons.SimpleCallData.Builder, com.tcn.cloud.api.api.commons.SimpleCallDataOrBuilder>(
                getCall(),
                getParentForChildren(),
                isClean());
        call_ = null;
      }
      return callBuilder_;
    }

    private long agentSessionSid_ ;
    /**
     * <code>int64 agent_session_sid = 2 [json_name = "agentSessionSid"];</code>
     * @return The agentSessionSid.
     */
    @java.lang.Override
    public long getAgentSessionSid() {
      return agentSessionSid_;
    }
    /**
     * <code>int64 agent_session_sid = 2 [json_name = "agentSessionSid"];</code>
     * @param value The agentSessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setAgentSessionSid(long value) {

      agentSessionSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 agent_session_sid = 2 [json_name = "agentSessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      agentSessionSid_ = 0L;
      onChanged();
      return this;
    }

    private boolean reportScrubOverride_ ;
    /**
     * <code>bool report_scrub_override = 3 [json_name = "reportScrubOverride"];</code>
     * @return The reportScrubOverride.
     */
    @java.lang.Override
    public boolean getReportScrubOverride() {
      return reportScrubOverride_;
    }
    /**
     * <code>bool report_scrub_override = 3 [json_name = "reportScrubOverride"];</code>
     * @param value The reportScrubOverride to set.
     * @return This builder for chaining.
     */
    public Builder setReportScrubOverride(boolean value) {

      reportScrubOverride_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool report_scrub_override = 3 [json_name = "reportScrubOverride"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReportScrubOverride() {
      bitField0_ = (bitField0_ & ~0x00000004);
      reportScrubOverride_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CancelPreviewDialCallReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CancelPreviewDialCallReq)
  private static final com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CancelPreviewDialCallReq>
      PARSER = new com.google.protobuf.AbstractParser<CancelPreviewDialCallReq>() {
    @java.lang.Override
    public CancelPreviewDialCallReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CancelPreviewDialCallReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CancelPreviewDialCallReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

