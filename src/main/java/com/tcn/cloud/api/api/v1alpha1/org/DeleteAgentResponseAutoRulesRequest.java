// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request message for the DeleteAgentResponseAutoRules RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest}
 */
public final class DeleteAgentResponseAutoRulesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest)
    DeleteAgentResponseAutoRulesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteAgentResponseAutoRulesRequest.newBuilder() to construct.
  private DeleteAgentResponseAutoRulesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteAgentResponseAutoRulesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteAgentResponseAutoRulesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteAgentResponseAutoRulesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteAgentResponseAutoRulesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest.Builder.class);
  }

  public static final int RULESETSID_FIELD_NUMBER = 1;
  private long rulesetSid_ = 0L;
  /**
   * <pre>
   * Sid for the Agent Response Rule set to delete
   * </pre>
   *
   * <code>int64 rulesetSid = 1 [json_name = "rulesetSid"];</code>
   * @return The rulesetSid.
   */
  @java.lang.Override
  public long getRulesetSid() {
    return rulesetSid_;
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
    if (rulesetSid_ != 0L) {
      output.writeInt64(1, rulesetSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rulesetSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, rulesetSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest other = (com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest) obj;

    if (getRulesetSid()
        != other.getRulesetSid()) return false;
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
    hash = (37 * hash) + RULESETSID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRulesetSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest prototype) {
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
   * Request message for the DeleteAgentResponseAutoRules RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest)
      com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteAgentResponseAutoRulesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteAgentResponseAutoRulesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest.newBuilder()
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
      rulesetSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteAgentResponseAutoRulesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest result = new com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rulesetSid_ = rulesetSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest.getDefaultInstance()) return this;
      if (other.getRulesetSid() != 0L) {
        setRulesetSid(other.getRulesetSid());
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
            case 8: {
              rulesetSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long rulesetSid_ ;
    /**
     * <pre>
     * Sid for the Agent Response Rule set to delete
     * </pre>
     *
     * <code>int64 rulesetSid = 1 [json_name = "rulesetSid"];</code>
     * @return The rulesetSid.
     */
    @java.lang.Override
    public long getRulesetSid() {
      return rulesetSid_;
    }
    /**
     * <pre>
     * Sid for the Agent Response Rule set to delete
     * </pre>
     *
     * <code>int64 rulesetSid = 1 [json_name = "rulesetSid"];</code>
     * @param value The rulesetSid to set.
     * @return This builder for chaining.
     */
    public Builder setRulesetSid(long value) {

      rulesetSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sid for the Agent Response Rule set to delete
     * </pre>
     *
     * <code>int64 rulesetSid = 1 [json_name = "rulesetSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRulesetSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rulesetSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteAgentResponseAutoRulesRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteAgentResponseAutoRulesRequest>() {
    @java.lang.Override
    public DeleteAgentResponseAutoRulesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteAgentResponseAutoRulesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteAgentResponseAutoRulesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.DeleteAgentResponseAutoRulesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

