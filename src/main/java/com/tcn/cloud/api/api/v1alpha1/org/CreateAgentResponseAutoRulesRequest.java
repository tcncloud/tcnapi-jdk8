// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request message for the CreateAgentResponseAutoRules RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.CreateAgentResponseAutoRulesRequest}
 */
public final class CreateAgentResponseAutoRulesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.CreateAgentResponseAutoRulesRequest)
    CreateAgentResponseAutoRulesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAgentResponseAutoRulesRequest.newBuilder() to construct.
  private CreateAgentResponseAutoRulesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAgentResponseAutoRulesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAgentResponseAutoRulesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CreateAgentResponseAutoRulesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CreateAgentResponseAutoRulesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest.Builder.class);
  }

  public static final int RULESET_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet ruleset_;
  /**
   * <pre>
   * Agent Response Auto Rule set to add
   * </pre>
   *
   * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
   * @return Whether the ruleset field is set.
   */
  @java.lang.Override
  public boolean hasRuleset() {
    return ruleset_ != null;
  }
  /**
   * <pre>
   * Agent Response Auto Rule set to add
   * </pre>
   *
   * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
   * @return The ruleset.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet getRuleset() {
    return ruleset_ == null ? com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.getDefaultInstance() : ruleset_;
  }
  /**
   * <pre>
   * Agent Response Auto Rule set to add
   * </pre>
   *
   * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSetOrBuilder getRulesetOrBuilder() {
    return ruleset_ == null ? com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.getDefaultInstance() : ruleset_;
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
    if (ruleset_ != null) {
      output.writeMessage(1, getRuleset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ruleset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRuleset());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest other = (com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest) obj;

    if (hasRuleset() != other.hasRuleset()) return false;
    if (hasRuleset()) {
      if (!getRuleset()
          .equals(other.getRuleset())) return false;
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
    if (hasRuleset()) {
      hash = (37 * hash) + RULESET_FIELD_NUMBER;
      hash = (53 * hash) + getRuleset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest prototype) {
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
   * Request message for the CreateAgentResponseAutoRules RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.CreateAgentResponseAutoRulesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.CreateAgentResponseAutoRulesRequest)
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CreateAgentResponseAutoRulesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CreateAgentResponseAutoRulesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest.newBuilder()
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
      ruleset_ = null;
      if (rulesetBuilder_ != null) {
        rulesetBuilder_.dispose();
        rulesetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CreateAgentResponseAutoRulesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest result = new com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ruleset_ = rulesetBuilder_ == null
            ? ruleset_
            : rulesetBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest.getDefaultInstance()) return this;
      if (other.hasRuleset()) {
        mergeRuleset(other.getRuleset());
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
                  getRulesetFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet ruleset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet, com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.Builder, com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSetOrBuilder> rulesetBuilder_;
    /**
     * <pre>
     * Agent Response Auto Rule set to add
     * </pre>
     *
     * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
     * @return Whether the ruleset field is set.
     */
    public boolean hasRuleset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Agent Response Auto Rule set to add
     * </pre>
     *
     * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
     * @return The ruleset.
     */
    public com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet getRuleset() {
      if (rulesetBuilder_ == null) {
        return ruleset_ == null ? com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.getDefaultInstance() : ruleset_;
      } else {
        return rulesetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Agent Response Auto Rule set to add
     * </pre>
     *
     * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
     */
    public Builder setRuleset(com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet value) {
      if (rulesetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ruleset_ = value;
      } else {
        rulesetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent Response Auto Rule set to add
     * </pre>
     *
     * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
     */
    public Builder setRuleset(
        com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.Builder builderForValue) {
      if (rulesetBuilder_ == null) {
        ruleset_ = builderForValue.build();
      } else {
        rulesetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent Response Auto Rule set to add
     * </pre>
     *
     * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
     */
    public Builder mergeRuleset(com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet value) {
      if (rulesetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          ruleset_ != null &&
          ruleset_ != com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.getDefaultInstance()) {
          getRulesetBuilder().mergeFrom(value);
        } else {
          ruleset_ = value;
        }
      } else {
        rulesetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent Response Auto Rule set to add
     * </pre>
     *
     * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
     */
    public Builder clearRuleset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ruleset_ = null;
      if (rulesetBuilder_ != null) {
        rulesetBuilder_.dispose();
        rulesetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent Response Auto Rule set to add
     * </pre>
     *
     * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.Builder getRulesetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRulesetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Agent Response Auto Rule set to add
     * </pre>
     *
     * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSetOrBuilder getRulesetOrBuilder() {
      if (rulesetBuilder_ != null) {
        return rulesetBuilder_.getMessageOrBuilder();
      } else {
        return ruleset_ == null ?
            com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.getDefaultInstance() : ruleset_;
      }
    }
    /**
     * <pre>
     * Agent Response Auto Rule set to add
     * </pre>
     *
     * <code>.api.commons.org.AgentResponseAutoRuleSet ruleset = 1 [json_name = "ruleset"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet, com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.Builder, com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSetOrBuilder> 
        getRulesetFieldBuilder() {
      if (rulesetBuilder_ == null) {
        rulesetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet, com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet.Builder, com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSetOrBuilder>(
                getRuleset(),
                getParentForChildren(),
                isClean());
        ruleset_ = null;
      }
      return rulesetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.CreateAgentResponseAutoRulesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.CreateAgentResponseAutoRulesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAgentResponseAutoRulesRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAgentResponseAutoRulesRequest>() {
    @java.lang.Override
    public CreateAgentResponseAutoRulesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAgentResponseAutoRulesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAgentResponseAutoRulesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentResponseAutoRulesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

