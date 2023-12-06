// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/plans.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

/**
 * Protobuf type {@code services.billing.v1alpha1.ListBillingPlansResponse}
 */
public final class ListBillingPlansResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha1.ListBillingPlansResponse)
    ListBillingPlansResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListBillingPlansResponse.newBuilder() to construct.
  private ListBillingPlansResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListBillingPlansResponse() {
    billingPlans_ = java.util.Collections.emptyList();
    token_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListBillingPlansResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_ListBillingPlansResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_ListBillingPlansResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.class, com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.Builder.class);
  }

  public static final int BILLING_PLANS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan> billingPlans_;
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan> getBillingPlansList() {
    return billingPlans_;
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanOrBuilder> 
      getBillingPlansOrBuilderList() {
    return billingPlans_;
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  @java.lang.Override
  public int getBillingPlansCount() {
    return billingPlans_.size();
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan getBillingPlans(int index) {
    return billingPlans_.get(index);
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanOrBuilder getBillingPlansOrBuilder(
      int index) {
    return billingPlans_.get(index);
  }

  public static final int TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object token_ = "";
  /**
   * <pre>
   * Optional: only present if paginating.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  @java.lang.Override
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional: only present if paginating.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
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
    for (int i = 0; i < billingPlans_.size(); i++) {
      output.writeMessage(1, billingPlans_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, token_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < billingPlans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, billingPlans_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, token_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse other = (com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse) obj;

    if (!getBillingPlansList()
        .equals(other.getBillingPlansList())) return false;
    if (!getToken()
        .equals(other.getToken())) return false;
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
    if (getBillingPlansCount() > 0) {
      hash = (37 * hash) + BILLING_PLANS_FIELD_NUMBER;
      hash = (53 * hash) + getBillingPlansList().hashCode();
    }
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse prototype) {
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
   * Protobuf type {@code services.billing.v1alpha1.ListBillingPlansResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha1.ListBillingPlansResponse)
      com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_ListBillingPlansResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_ListBillingPlansResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.class, com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.newBuilder()
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
      if (billingPlansBuilder_ == null) {
        billingPlans_ = java.util.Collections.emptyList();
      } else {
        billingPlans_ = null;
        billingPlansBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      token_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_ListBillingPlansResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse build() {
      com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse result = new com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse result) {
      if (billingPlansBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          billingPlans_ = java.util.Collections.unmodifiableList(billingPlans_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.billingPlans_ = billingPlans_;
      } else {
        result.billingPlans_ = billingPlansBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.token_ = token_;
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.getDefaultInstance()) return this;
      if (billingPlansBuilder_ == null) {
        if (!other.billingPlans_.isEmpty()) {
          if (billingPlans_.isEmpty()) {
            billingPlans_ = other.billingPlans_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBillingPlansIsMutable();
            billingPlans_.addAll(other.billingPlans_);
          }
          onChanged();
        }
      } else {
        if (!other.billingPlans_.isEmpty()) {
          if (billingPlansBuilder_.isEmpty()) {
            billingPlansBuilder_.dispose();
            billingPlansBuilder_ = null;
            billingPlans_ = other.billingPlans_;
            bitField0_ = (bitField0_ & ~0x00000001);
            billingPlansBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBillingPlansFieldBuilder() : null;
          } else {
            billingPlansBuilder_.addAllMessages(other.billingPlans_);
          }
        }
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
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
            case 10: {
              com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan m =
                  input.readMessage(
                      com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.parser(),
                      extensionRegistry);
              if (billingPlansBuilder_ == null) {
                ensureBillingPlansIsMutable();
                billingPlans_.add(m);
              } else {
                billingPlansBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              token_ = input.readStringRequireUtf8();
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

    private java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan> billingPlans_ =
      java.util.Collections.emptyList();
    private void ensureBillingPlansIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        billingPlans_ = new java.util.ArrayList<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan>(billingPlans_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanOrBuilder> billingPlansBuilder_;

    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan> getBillingPlansList() {
      if (billingPlansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(billingPlans_);
      } else {
        return billingPlansBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public int getBillingPlansCount() {
      if (billingPlansBuilder_ == null) {
        return billingPlans_.size();
      } else {
        return billingPlansBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan getBillingPlans(int index) {
      if (billingPlansBuilder_ == null) {
        return billingPlans_.get(index);
      } else {
        return billingPlansBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public Builder setBillingPlans(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan value) {
      if (billingPlansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBillingPlansIsMutable();
        billingPlans_.set(index, value);
        onChanged();
      } else {
        billingPlansBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public Builder setBillingPlans(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder builderForValue) {
      if (billingPlansBuilder_ == null) {
        ensureBillingPlansIsMutable();
        billingPlans_.set(index, builderForValue.build());
        onChanged();
      } else {
        billingPlansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public Builder addBillingPlans(com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan value) {
      if (billingPlansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBillingPlansIsMutable();
        billingPlans_.add(value);
        onChanged();
      } else {
        billingPlansBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public Builder addBillingPlans(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan value) {
      if (billingPlansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBillingPlansIsMutable();
        billingPlans_.add(index, value);
        onChanged();
      } else {
        billingPlansBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public Builder addBillingPlans(
        com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder builderForValue) {
      if (billingPlansBuilder_ == null) {
        ensureBillingPlansIsMutable();
        billingPlans_.add(builderForValue.build());
        onChanged();
      } else {
        billingPlansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public Builder addBillingPlans(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder builderForValue) {
      if (billingPlansBuilder_ == null) {
        ensureBillingPlansIsMutable();
        billingPlans_.add(index, builderForValue.build());
        onChanged();
      } else {
        billingPlansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public Builder addAllBillingPlans(
        java.lang.Iterable<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan> values) {
      if (billingPlansBuilder_ == null) {
        ensureBillingPlansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, billingPlans_);
        onChanged();
      } else {
        billingPlansBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public Builder clearBillingPlans() {
      if (billingPlansBuilder_ == null) {
        billingPlans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        billingPlansBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public Builder removeBillingPlans(int index) {
      if (billingPlansBuilder_ == null) {
        ensureBillingPlansIsMutable();
        billingPlans_.remove(index);
        onChanged();
      } else {
        billingPlansBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder getBillingPlansBuilder(
        int index) {
      return getBillingPlansFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanOrBuilder getBillingPlansOrBuilder(
        int index) {
      if (billingPlansBuilder_ == null) {
        return billingPlans_.get(index);  } else {
        return billingPlansBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanOrBuilder> 
         getBillingPlansOrBuilderList() {
      if (billingPlansBuilder_ != null) {
        return billingPlansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(billingPlans_);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder addBillingPlansBuilder() {
      return getBillingPlansFieldBuilder().addBuilder(
          com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder addBillingPlansBuilder(
        int index) {
      return getBillingPlansFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlan billing_plans = 1 [json_name = "billingPlans"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder> 
         getBillingPlansBuilderList() {
      return getBillingPlansFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanOrBuilder> 
        getBillingPlansFieldBuilder() {
      if (billingPlansBuilder_ == null) {
        billingPlansBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlan.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanOrBuilder>(
                billingPlans_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        billingPlans_ = null;
      }
      return billingPlansBuilder_;
    }

    private java.lang.Object token_ = "";
    /**
     * <pre>
     * Optional: only present if paginating.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return The token.
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional: only present if paginating.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return The bytes for token.
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional: only present if paginating.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      token_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: only present if paginating.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      token_ = getDefaultInstance().getToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: only present if paginating.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @param value The bytes for token to set.
     * @return This builder for chaining.
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      token_ = value;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha1.ListBillingPlansResponse)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha1.ListBillingPlansResponse)
  private static final com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBillingPlansResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListBillingPlansResponse>() {
    @java.lang.Override
    public ListBillingPlansResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListBillingPlansResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBillingPlansResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
