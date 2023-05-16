// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/billing/entities.proto

package com.tcn.cloud.api.api.v1alpha1.billing;

/**
 * <pre>
 * CreateBillingPlanRes - result of creating a billing plan; contains the
 * created billing plan
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.billing.CreateBillingPlanRes}
 */
public final class CreateBillingPlanRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.billing.CreateBillingPlanRes)
    CreateBillingPlanResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateBillingPlanRes.newBuilder() to construct.
  private CreateBillingPlanRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateBillingPlanRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateBillingPlanRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.billing.EntitiesProto.internal_static_api_v1alpha1_billing_CreateBillingPlanRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.billing.EntitiesProto.internal_static_api_v1alpha1_billing_CreateBillingPlanRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes.class, com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes.Builder.class);
  }

  public static final int BILLING_PLAN_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.billing.Plan billingPlan_;
  /**
   * <pre>
   * the created billing plan
   * </pre>
   *
   * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
   * @return Whether the billingPlan field is set.
   */
  @java.lang.Override
  public boolean hasBillingPlan() {
    return billingPlan_ != null;
  }
  /**
   * <pre>
   * the created billing plan
   * </pre>
   *
   * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
   * @return The billingPlan.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.billing.Plan getBillingPlan() {
    return billingPlan_ == null ? com.tcn.cloud.api.api.commons.billing.Plan.getDefaultInstance() : billingPlan_;
  }
  /**
   * <pre>
   * the created billing plan
   * </pre>
   *
   * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.billing.PlanOrBuilder getBillingPlanOrBuilder() {
    return billingPlan_ == null ? com.tcn.cloud.api.api.commons.billing.Plan.getDefaultInstance() : billingPlan_;
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
    if (billingPlan_ != null) {
      output.writeMessage(1, getBillingPlan());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (billingPlan_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBillingPlan());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes other = (com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes) obj;

    if (hasBillingPlan() != other.hasBillingPlan()) return false;
    if (hasBillingPlan()) {
      if (!getBillingPlan()
          .equals(other.getBillingPlan())) return false;
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
    if (hasBillingPlan()) {
      hash = (37 * hash) + BILLING_PLAN_FIELD_NUMBER;
      hash = (53 * hash) + getBillingPlan().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes prototype) {
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
   * CreateBillingPlanRes - result of creating a billing plan; contains the
   * created billing plan
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.billing.CreateBillingPlanRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.billing.CreateBillingPlanRes)
      com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.billing.EntitiesProto.internal_static_api_v1alpha1_billing_CreateBillingPlanRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.billing.EntitiesProto.internal_static_api_v1alpha1_billing_CreateBillingPlanRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes.class, com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes.newBuilder()
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
      billingPlan_ = null;
      if (billingPlanBuilder_ != null) {
        billingPlanBuilder_.dispose();
        billingPlanBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.billing.EntitiesProto.internal_static_api_v1alpha1_billing_CreateBillingPlanRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes build() {
      com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes result = new com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.billingPlan_ = billingPlanBuilder_ == null
            ? billingPlan_
            : billingPlanBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes.getDefaultInstance()) return this;
      if (other.hasBillingPlan()) {
        mergeBillingPlan(other.getBillingPlan());
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
                  getBillingPlanFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.billing.Plan billingPlan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.billing.Plan, com.tcn.cloud.api.api.commons.billing.Plan.Builder, com.tcn.cloud.api.api.commons.billing.PlanOrBuilder> billingPlanBuilder_;
    /**
     * <pre>
     * the created billing plan
     * </pre>
     *
     * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
     * @return Whether the billingPlan field is set.
     */
    public boolean hasBillingPlan() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * the created billing plan
     * </pre>
     *
     * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
     * @return The billingPlan.
     */
    public com.tcn.cloud.api.api.commons.billing.Plan getBillingPlan() {
      if (billingPlanBuilder_ == null) {
        return billingPlan_ == null ? com.tcn.cloud.api.api.commons.billing.Plan.getDefaultInstance() : billingPlan_;
      } else {
        return billingPlanBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the created billing plan
     * </pre>
     *
     * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public Builder setBillingPlan(com.tcn.cloud.api.api.commons.billing.Plan value) {
      if (billingPlanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        billingPlan_ = value;
      } else {
        billingPlanBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the created billing plan
     * </pre>
     *
     * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public Builder setBillingPlan(
        com.tcn.cloud.api.api.commons.billing.Plan.Builder builderForValue) {
      if (billingPlanBuilder_ == null) {
        billingPlan_ = builderForValue.build();
      } else {
        billingPlanBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the created billing plan
     * </pre>
     *
     * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public Builder mergeBillingPlan(com.tcn.cloud.api.api.commons.billing.Plan value) {
      if (billingPlanBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          billingPlan_ != null &&
          billingPlan_ != com.tcn.cloud.api.api.commons.billing.Plan.getDefaultInstance()) {
          getBillingPlanBuilder().mergeFrom(value);
        } else {
          billingPlan_ = value;
        }
      } else {
        billingPlanBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the created billing plan
     * </pre>
     *
     * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public Builder clearBillingPlan() {
      bitField0_ = (bitField0_ & ~0x00000001);
      billingPlan_ = null;
      if (billingPlanBuilder_ != null) {
        billingPlanBuilder_.dispose();
        billingPlanBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the created billing plan
     * </pre>
     *
     * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public com.tcn.cloud.api.api.commons.billing.Plan.Builder getBillingPlanBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBillingPlanFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the created billing plan
     * </pre>
     *
     * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public com.tcn.cloud.api.api.commons.billing.PlanOrBuilder getBillingPlanOrBuilder() {
      if (billingPlanBuilder_ != null) {
        return billingPlanBuilder_.getMessageOrBuilder();
      } else {
        return billingPlan_ == null ?
            com.tcn.cloud.api.api.commons.billing.Plan.getDefaultInstance() : billingPlan_;
      }
    }
    /**
     * <pre>
     * the created billing plan
     * </pre>
     *
     * <code>.api.commons.billing.Plan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.billing.Plan, com.tcn.cloud.api.api.commons.billing.Plan.Builder, com.tcn.cloud.api.api.commons.billing.PlanOrBuilder> 
        getBillingPlanFieldBuilder() {
      if (billingPlanBuilder_ == null) {
        billingPlanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.billing.Plan, com.tcn.cloud.api.api.commons.billing.Plan.Builder, com.tcn.cloud.api.api.commons.billing.PlanOrBuilder>(
                getBillingPlan(),
                getParentForChildren(),
                isClean());
        billingPlan_ = null;
      }
      return billingPlanBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.billing.CreateBillingPlanRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.billing.CreateBillingPlanRes)
  private static final com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBillingPlanRes>
      PARSER = new com.google.protobuf.AbstractParser<CreateBillingPlanRes>() {
    @java.lang.Override
    public CreateBillingPlanRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateBillingPlanRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBillingPlanRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.billing.CreateBillingPlanRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

