// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * Use Natural Language Compliance and rule set ID.
 * </pre>
 *
 * Protobuf type {@code api.commons.org.NaturalLanguageComplianceScrub}
 */
public final class NaturalLanguageComplianceScrub extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.NaturalLanguageComplianceScrub)
    NaturalLanguageComplianceScrubOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NaturalLanguageComplianceScrub.newBuilder() to construct.
  private NaturalLanguageComplianceScrub(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NaturalLanguageComplianceScrub() {
    complianceScrub_ = 0;
    ruleSetId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NaturalLanguageComplianceScrub();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_NaturalLanguageComplianceScrub_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_NaturalLanguageComplianceScrub_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub.class, com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub.Builder.class);
  }

  public static final int COMPLIANCE_SCRUB_FIELD_NUMBER = 1;
  private int complianceScrub_ = 0;
  /**
   * <pre>
   * Org default or enabled or disabled.
   * </pre>
   *
   * <code>.api.commons.HuntGroupOrgDefaultCustom compliance_scrub = 1 [json_name = "complianceScrub"];</code>
   * @return The enum numeric value on the wire for complianceScrub.
   */
  @java.lang.Override public int getComplianceScrubValue() {
    return complianceScrub_;
  }
  /**
   * <pre>
   * Org default or enabled or disabled.
   * </pre>
   *
   * <code>.api.commons.HuntGroupOrgDefaultCustom compliance_scrub = 1 [json_name = "complianceScrub"];</code>
   * @return The complianceScrub.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom getComplianceScrub() {
    com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom result = com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom.forNumber(complianceScrub_);
    return result == null ? com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom.UNRECOGNIZED : result;
  }

  public static final int RULE_SET_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ruleSetId_ = "";
  /**
   * <pre>
   * The ID of the Natural Language Compliance rule set.
   * </pre>
   *
   * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
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
   * <pre>
   * The ID of the Natural Language Compliance rule set.
   * </pre>
   *
   * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
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
    if (complianceScrub_ != com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom.HUNT_GROUP_USE_ORG_DEFAULT.getNumber()) {
      output.writeEnum(1, complianceScrub_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleSetId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ruleSetId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (complianceScrub_ != com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom.HUNT_GROUP_USE_ORG_DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, complianceScrub_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleSetId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ruleSetId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub other = (com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub) obj;

    if (complianceScrub_ != other.complianceScrub_) return false;
    if (!getRuleSetId()
        .equals(other.getRuleSetId())) return false;
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
    hash = (37 * hash) + COMPLIANCE_SCRUB_FIELD_NUMBER;
    hash = (53 * hash) + complianceScrub_;
    hash = (37 * hash) + RULE_SET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuleSetId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub prototype) {
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
   * Use Natural Language Compliance and rule set ID.
   * </pre>
   *
   * Protobuf type {@code api.commons.org.NaturalLanguageComplianceScrub}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.NaturalLanguageComplianceScrub)
      com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrubOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_NaturalLanguageComplianceScrub_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_NaturalLanguageComplianceScrub_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub.class, com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub.newBuilder()
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
      complianceScrub_ = 0;
      ruleSetId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_NaturalLanguageComplianceScrub_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub build() {
      com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub buildPartial() {
      com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub result = new com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.complianceScrub_ = complianceScrub_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ruleSetId_ = ruleSetId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub other) {
      if (other == com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub.getDefaultInstance()) return this;
      if (other.complianceScrub_ != 0) {
        setComplianceScrubValue(other.getComplianceScrubValue());
      }
      if (!other.getRuleSetId().isEmpty()) {
        ruleSetId_ = other.ruleSetId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              complianceScrub_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              ruleSetId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private int complianceScrub_ = 0;
    /**
     * <pre>
     * Org default or enabled or disabled.
     * </pre>
     *
     * <code>.api.commons.HuntGroupOrgDefaultCustom compliance_scrub = 1 [json_name = "complianceScrub"];</code>
     * @return The enum numeric value on the wire for complianceScrub.
     */
    @java.lang.Override public int getComplianceScrubValue() {
      return complianceScrub_;
    }
    /**
     * <pre>
     * Org default or enabled or disabled.
     * </pre>
     *
     * <code>.api.commons.HuntGroupOrgDefaultCustom compliance_scrub = 1 [json_name = "complianceScrub"];</code>
     * @param value The enum numeric value on the wire for complianceScrub to set.
     * @return This builder for chaining.
     */
    public Builder setComplianceScrubValue(int value) {
      complianceScrub_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Org default or enabled or disabled.
     * </pre>
     *
     * <code>.api.commons.HuntGroupOrgDefaultCustom compliance_scrub = 1 [json_name = "complianceScrub"];</code>
     * @return The complianceScrub.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom getComplianceScrub() {
      com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom result = com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom.forNumber(complianceScrub_);
      return result == null ? com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Org default or enabled or disabled.
     * </pre>
     *
     * <code>.api.commons.HuntGroupOrgDefaultCustom compliance_scrub = 1 [json_name = "complianceScrub"];</code>
     * @param value The complianceScrub to set.
     * @return This builder for chaining.
     */
    public Builder setComplianceScrub(com.tcn.cloud.api.api.commons.HuntGroupOrgDefaultCustom value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      complianceScrub_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Org default or enabled or disabled.
     * </pre>
     *
     * <code>.api.commons.HuntGroupOrgDefaultCustom compliance_scrub = 1 [json_name = "complianceScrub"];</code>
     * @return This builder for chaining.
     */
    public Builder clearComplianceScrub() {
      bitField0_ = (bitField0_ & ~0x00000001);
      complianceScrub_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object ruleSetId_ = "";
    /**
     * <pre>
     * The ID of the Natural Language Compliance rule set.
     * </pre>
     *
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
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
     * <pre>
     * The ID of the Natural Language Compliance rule set.
     * </pre>
     *
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
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
     * <pre>
     * The ID of the Natural Language Compliance rule set.
     * </pre>
     *
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
     * @param value The ruleSetId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleSetId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ruleSetId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the Natural Language Compliance rule set.
     * </pre>
     *
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRuleSetId() {
      ruleSetId_ = getDefaultInstance().getRuleSetId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the Natural Language Compliance rule set.
     * </pre>
     *
     * <code>string rule_set_id = 2 [json_name = "ruleSetId"];</code>
     * @param value The bytes for ruleSetId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ruleSetId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.NaturalLanguageComplianceScrub)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.NaturalLanguageComplianceScrub)
  private static final com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub();
  }

  public static com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NaturalLanguageComplianceScrub>
      PARSER = new com.google.protobuf.AbstractParser<NaturalLanguageComplianceScrub>() {
    @java.lang.Override
    public NaturalLanguageComplianceScrub parsePartialFrom(
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

  public static com.google.protobuf.Parser<NaturalLanguageComplianceScrub> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NaturalLanguageComplianceScrub> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.NaturalLanguageComplianceScrub getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

