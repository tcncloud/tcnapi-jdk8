// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the CreateConstraintRule RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreateConstraintRuleReq}
 */
public final class CreateConstraintRuleReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreateConstraintRuleReq)
    CreateConstraintRuleReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateConstraintRuleReq.newBuilder() to construct.
  private CreateConstraintRuleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateConstraintRuleReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateConstraintRuleReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateConstraintRuleReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateConstraintRuleReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq.Builder.class);
  }

  public static final int CONSTRAINT_RULE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule constraintRule_;
  /**
   * <pre>
   * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
   * @return Whether the constraintRule field is set.
   */
  @java.lang.Override
  public boolean hasConstraintRule() {
    return constraintRule_ != null;
  }
  /**
   * <pre>
   * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
   * @return The constraintRule.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule getConstraintRule() {
    return constraintRule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.getDefaultInstance() : constraintRule_;
  }
  /**
   * <pre>
   * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder getConstraintRuleOrBuilder() {
    return constraintRule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.getDefaultInstance() : constraintRule_;
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
    if (constraintRule_ != null) {
      output.writeMessage(1, getConstraintRule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (constraintRule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConstraintRule());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq) obj;

    if (hasConstraintRule() != other.hasConstraintRule()) return false;
    if (hasConstraintRule()) {
      if (!getConstraintRule()
          .equals(other.getConstraintRule())) return false;
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
    if (hasConstraintRule()) {
      hash = (37 * hash) + CONSTRAINT_RULE_FIELD_NUMBER;
      hash = (53 * hash) + getConstraintRule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq prototype) {
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
   * Request message for the CreateConstraintRule RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreateConstraintRuleReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreateConstraintRuleReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateConstraintRuleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateConstraintRuleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq.newBuilder()
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
      constraintRule_ = null;
      if (constraintRuleBuilder_ != null) {
        constraintRuleBuilder_.dispose();
        constraintRuleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateConstraintRuleReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.constraintRule_ = constraintRuleBuilder_ == null
            ? constraintRule_
            : constraintRuleBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq.getDefaultInstance()) return this;
      if (other.hasConstraintRule()) {
        mergeConstraintRule(other.getConstraintRule());
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
                  getConstraintRuleFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule constraintRule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule, com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder> constraintRuleBuilder_;
    /**
     * <pre>
     * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
     * @return Whether the constraintRule field is set.
     */
    public boolean hasConstraintRule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
     * @return The constraintRule.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule getConstraintRule() {
      if (constraintRuleBuilder_ == null) {
        return constraintRule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.getDefaultInstance() : constraintRule_;
      } else {
        return constraintRuleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
     */
    public Builder setConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule value) {
      if (constraintRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        constraintRule_ = value;
      } else {
        constraintRuleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
     */
    public Builder setConstraintRule(
        com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.Builder builderForValue) {
      if (constraintRuleBuilder_ == null) {
        constraintRule_ = builderForValue.build();
      } else {
        constraintRuleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
     */
    public Builder mergeConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule value) {
      if (constraintRuleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          constraintRule_ != null &&
          constraintRule_ != com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.getDefaultInstance()) {
          getConstraintRuleBuilder().mergeFrom(value);
        } else {
          constraintRule_ = value;
        }
      } else {
        constraintRuleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
     */
    public Builder clearConstraintRule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      constraintRule_ = null;
      if (constraintRuleBuilder_ != null) {
        constraintRuleBuilder_.dispose();
        constraintRuleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.Builder getConstraintRuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConstraintRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder getConstraintRuleOrBuilder() {
      if (constraintRuleBuilder_ != null) {
        return constraintRuleBuilder_.getMessageOrBuilder();
      } else {
        return constraintRule_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.getDefaultInstance() : constraintRule_;
      }
    }
    /**
     * <pre>
     * Rule to create, the &#64;constraint_rule_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ConstraintRule constraint_rule = 1 [json_name = "constraintRule"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule, com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder> 
        getConstraintRuleFieldBuilder() {
      if (constraintRuleBuilder_ == null) {
        constraintRuleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule, com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder>(
                getConstraintRule(),
                getParentForChildren(),
                isClean());
        constraintRule_ = null;
      }
      return constraintRuleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreateConstraintRuleReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreateConstraintRuleReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConstraintRuleReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateConstraintRuleReq>() {
    @java.lang.Override
    public CreateConstraintRuleReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateConstraintRuleReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConstraintRuleReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

