// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateRuleSetReq}
 */
public final class CreateRuleSetReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateRuleSetReq)
    CreateRuleSetReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRuleSetReq.newBuilder() to construct.
  private CreateRuleSetReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRuleSetReq() {
    ruleSetId_ = "";
    name_ = "";
    rulesText_ = "";
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRuleSetReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateRuleSetReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateRuleSetReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq.class, com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq.Builder.class);
  }

  public static final int RULE_SET_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ruleSetId_ = "";
  /**
   * <code>string rule_set_id = 1 [json_name = "ruleSetId"];</code>
   * @return The ruleSetId.
   */
  @java.lang.Override
  public java.lang.String getRuleSetId() {
    java.lang.Object ref = ruleSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleSetId_ = s;
      return s;
    }
  }
  /**
   * <code>string rule_set_id = 1 [json_name = "ruleSetId"];</code>
   * @return The bytes for ruleSetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRuleSetIdBytes() {
    java.lang.Object ref = ruleSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ruleSetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULES_TEXT_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rulesText_ = "";
  /**
   * <code>string rules_text = 6 [json_name = "rulesText"];</code>
   * @return The rulesText.
   */
  @java.lang.Override
  public java.lang.String getRulesText() {
    java.lang.Object ref = rulesText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rulesText_ = s;
      return s;
    }
  }
  /**
   * <code>string rules_text = 6 [json_name = "rulesText"];</code>
   * @return The bytes for rulesText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRulesTextBytes() {
    java.lang.Object ref = rulesText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rulesText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULES_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.Rule> rules_;
  /**
   * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.Rule> getRulesList() {
    return rules_;
  }
  /**
   * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.RuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Rule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.RuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleSetId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ruleSetId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rulesText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, rulesText_);
    }
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(7, rules_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleSetId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ruleSetId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rulesText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, rulesText_);
    }
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, rules_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq other = (com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq) obj;

    if (!getRuleSetId()
        .equals(other.getRuleSetId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getRulesText()
        .equals(other.getRulesText())) return false;
    if (!getRulesList()
        .equals(other.getRulesList())) return false;
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
    hash = (37 * hash) + RULE_SET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuleSetId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + RULES_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getRulesText().hashCode();
    if (getRulesCount() > 0) {
      hash = (37 * hash) + RULES_FIELD_NUMBER;
      hash = (53 * hash) + getRulesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateRuleSetReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateRuleSetReq)
      com.tcn.cloud.api.api.v0alpha.CreateRuleSetReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateRuleSetReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateRuleSetReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq.class, com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq.newBuilder()
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
      ruleSetId_ = "";
      name_ = "";
      rulesText_ = "";
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
      } else {
        rules_ = null;
        rulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateRuleSetReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq result = new com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq result) {
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ruleSetId_ = ruleSetId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rulesText_ = rulesText_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq.getDefaultInstance()) return this;
      if (!other.getRuleSetId().isEmpty()) {
        ruleSetId_ = other.ruleSetId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getRulesText().isEmpty()) {
        rulesText_ = other.rulesText_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000008);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
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
              ruleSetId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 34: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 50: {
              rulesText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 50
            case 58: {
              com.tcn.cloud.api.api.commons.Rule m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.Rule.parser(),
                      extensionRegistry);
              if (rulesBuilder_ == null) {
                ensureRulesIsMutable();
                rules_.add(m);
              } else {
                rulesBuilder_.addMessage(m);
              }
              break;
            } // case 58
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

    private java.lang.Object ruleSetId_ = "";
    /**
     * <code>string rule_set_id = 1 [json_name = "ruleSetId"];</code>
     * @return The ruleSetId.
     */
    public java.lang.String getRuleSetId() {
      java.lang.Object ref = ruleSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleSetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rule_set_id = 1 [json_name = "ruleSetId"];</code>
     * @return The bytes for ruleSetId.
     */
    public com.google.protobuf.ByteString
        getRuleSetIdBytes() {
      java.lang.Object ref = ruleSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ruleSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rule_set_id = 1 [json_name = "ruleSetId"];</code>
     * @param value The ruleSetId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleSetId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ruleSetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string rule_set_id = 1 [json_name = "ruleSetId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRuleSetId() {
      ruleSetId_ = getDefaultInstance().getRuleSetId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string rule_set_id = 1 [json_name = "ruleSetId"];</code>
     * @param value The bytes for ruleSetId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ruleSetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object rulesText_ = "";
    /**
     * <code>string rules_text = 6 [json_name = "rulesText"];</code>
     * @return The rulesText.
     */
    public java.lang.String getRulesText() {
      java.lang.Object ref = rulesText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rulesText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rules_text = 6 [json_name = "rulesText"];</code>
     * @return The bytes for rulesText.
     */
    public com.google.protobuf.ByteString
        getRulesTextBytes() {
      java.lang.Object ref = rulesText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rulesText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rules_text = 6 [json_name = "rulesText"];</code>
     * @param value The rulesText to set.
     * @return This builder for chaining.
     */
    public Builder setRulesText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rulesText_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string rules_text = 6 [json_name = "rulesText"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRulesText() {
      rulesText_ = getDefaultInstance().getRulesText();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string rules_text = 6 [json_name = "rulesText"];</code>
     * @param value The bytes for rulesText to set.
     * @return This builder for chaining.
     */
    public Builder setRulesTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rulesText_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.commons.Rule> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        rules_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.Rule>(rules_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Rule, com.tcn.cloud.api.api.commons.Rule.Builder, com.tcn.cloud.api.api.commons.RuleOrBuilder> rulesBuilder_;

    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.Rule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public com.tcn.cloud.api.api.commons.Rule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public Builder setRules(
        int index, com.tcn.cloud.api.api.commons.Rule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public Builder setRules(
        int index, com.tcn.cloud.api.api.commons.Rule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public Builder addRules(com.tcn.cloud.api.api.commons.Rule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public Builder addRules(
        int index, com.tcn.cloud.api.api.commons.Rule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public Builder addRules(
        com.tcn.cloud.api.api.commons.Rule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public Builder addRules(
        int index, com.tcn.cloud.api.api.commons.Rule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.Rule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public com.tcn.cloud.api.api.commons.Rule.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public com.tcn.cloud.api.api.commons.RuleOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.RuleOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public com.tcn.cloud.api.api.commons.Rule.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.Rule.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public com.tcn.cloud.api.api.commons.Rule.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.Rule.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.Rule rules = 7 [json_name = "rules"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.Rule.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Rule, com.tcn.cloud.api.api.commons.Rule.Builder, com.tcn.cloud.api.api.commons.RuleOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Rule, com.tcn.cloud.api.api.commons.Rule.Builder, com.tcn.cloud.api.api.commons.RuleOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateRuleSetReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateRuleSetReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRuleSetReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateRuleSetReq>() {
    @java.lang.Override
    public CreateRuleSetReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRuleSetReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRuleSetReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateRuleSetReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

