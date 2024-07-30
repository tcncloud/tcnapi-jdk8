// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha4/plan.proto

package com.tcn.cloud.api.services.billing.v1alpha4;

/**
 * Protobuf type {@code services.billing.v1alpha4.GetBillingPlanResponse}
 */
public final class GetBillingPlanResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha4.GetBillingPlanResponse)
    GetBillingPlanResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBillingPlanResponse.newBuilder() to construct.
  private GetBillingPlanResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBillingPlanResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBillingPlanResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha4.PlanProto.internal_static_services_billing_v1alpha4_GetBillingPlanResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha4.PlanProto.internal_static_services_billing_v1alpha4_GetBillingPlanResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse.class, com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse.Builder.class);
  }

  public static final int BILLING_PLAN_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan billingPlan_;
  /**
   * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
   * @return Whether the billingPlan field is set.
   */
  @java.lang.Override
  public boolean hasBillingPlan() {
    return billingPlan_ != null;
  }
  /**
   * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
   * @return The billingPlan.
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan getBillingPlan() {
    return billingPlan_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.getDefaultInstance() : billingPlan_;
  }
  /**
   * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlanOrBuilder getBillingPlanOrBuilder() {
    return billingPlan_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.getDefaultInstance() : billingPlan_;
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse other = (com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse) obj;

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

  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse prototype) {
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
   * Protobuf type {@code services.billing.v1alpha4.GetBillingPlanResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha4.GetBillingPlanResponse)
      com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha4.PlanProto.internal_static_services_billing_v1alpha4_GetBillingPlanResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha4.PlanProto.internal_static_services_billing_v1alpha4_GetBillingPlanResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse.class, com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse.newBuilder()
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
      return com.tcn.cloud.api.services.billing.v1alpha4.PlanProto.internal_static_services_billing_v1alpha4_GetBillingPlanResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse build() {
      com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse result = new com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.billingPlan_ = billingPlanBuilder_ == null
            ? billingPlan_
            : billingPlanBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse.getDefaultInstance()) return this;
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

    private com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan billingPlan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlanOrBuilder> billingPlanBuilder_;
    /**
     * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
     * @return Whether the billingPlan field is set.
     */
    public boolean hasBillingPlan() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
     * @return The billingPlan.
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan getBillingPlan() {
      if (billingPlanBuilder_ == null) {
        return billingPlan_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.getDefaultInstance() : billingPlan_;
      } else {
        return billingPlanBuilder_.getMessage();
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public Builder setBillingPlan(com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan value) {
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
     * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public Builder setBillingPlan(
        com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.Builder builderForValue) {
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
     * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public Builder mergeBillingPlan(com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan value) {
      if (billingPlanBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          billingPlan_ != null &&
          billingPlan_ != com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.getDefaultInstance()) {
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
     * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
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
     * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.Builder getBillingPlanBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBillingPlanFieldBuilder().getBuilder();
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlanOrBuilder getBillingPlanOrBuilder() {
      if (billingPlanBuilder_ != null) {
        return billingPlanBuilder_.getMessageOrBuilder();
      } else {
        return billingPlan_ == null ?
            com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.getDefaultInstance() : billingPlan_;
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingPlan billing_plan = 1 [json_name = "billingPlan"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlanOrBuilder> 
        getBillingPlanFieldBuilder() {
      if (billingPlanBuilder_ == null) {
        billingPlanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlan.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingPlanOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha4.GetBillingPlanResponse)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha4.GetBillingPlanResponse)
  private static final com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBillingPlanResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBillingPlanResponse>() {
    @java.lang.Override
    public GetBillingPlanResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetBillingPlanResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBillingPlanResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha4.GetBillingPlanResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

