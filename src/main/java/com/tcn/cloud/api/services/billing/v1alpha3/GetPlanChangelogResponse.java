// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha3/plan.proto

package com.tcn.cloud.api.services.billing.v1alpha3;

/**
 * Protobuf type {@code services.billing.v1alpha3.GetPlanChangelogResponse}
 */
public final class GetPlanChangelogResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha3.GetPlanChangelogResponse)
    GetPlanChangelogResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPlanChangelogResponse.newBuilder() to construct.
  private GetPlanChangelogResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPlanChangelogResponse() {
    plans_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPlanChangelogResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha3.PlanProto.internal_static_services_billing_v1alpha3_GetPlanChangelogResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha3.PlanProto.internal_static_services_billing_v1alpha3_GetPlanChangelogResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse.class, com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse.Builder.class);
  }

  public static final int PLANS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan> plans_;
  /**
   * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan> getPlansList() {
    return plans_;
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha3.PlanOrBuilder> 
      getPlansOrBuilderList() {
    return plans_;
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
   */
  @java.lang.Override
  public int getPlansCount() {
    return plans_.size();
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan getPlans(int index) {
    return plans_.get(index);
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha3.PlanOrBuilder getPlansOrBuilder(
      int index) {
    return plans_.get(index);
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
    for (int i = 0; i < plans_.size(); i++) {
      output.writeMessage(1, plans_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < plans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, plans_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse other = (com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse) obj;

    if (!getPlansList()
        .equals(other.getPlansList())) return false;
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
    if (getPlansCount() > 0) {
      hash = (37 * hash) + PLANS_FIELD_NUMBER;
      hash = (53 * hash) + getPlansList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse prototype) {
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
   * Protobuf type {@code services.billing.v1alpha3.GetPlanChangelogResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha3.GetPlanChangelogResponse)
      com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha3.PlanProto.internal_static_services_billing_v1alpha3_GetPlanChangelogResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha3.PlanProto.internal_static_services_billing_v1alpha3_GetPlanChangelogResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse.class, com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse.newBuilder()
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
      if (plansBuilder_ == null) {
        plans_ = java.util.Collections.emptyList();
      } else {
        plans_ = null;
        plansBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.v1alpha3.PlanProto.internal_static_services_billing_v1alpha3_GetPlanChangelogResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse build() {
      com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse result = new com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse result) {
      if (plansBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          plans_ = java.util.Collections.unmodifiableList(plans_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.plans_ = plans_;
      } else {
        result.plans_ = plansBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse.getDefaultInstance()) return this;
      if (plansBuilder_ == null) {
        if (!other.plans_.isEmpty()) {
          if (plans_.isEmpty()) {
            plans_ = other.plans_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePlansIsMutable();
            plans_.addAll(other.plans_);
          }
          onChanged();
        }
      } else {
        if (!other.plans_.isEmpty()) {
          if (plansBuilder_.isEmpty()) {
            plansBuilder_.dispose();
            plansBuilder_ = null;
            plans_ = other.plans_;
            bitField0_ = (bitField0_ & ~0x00000001);
            plansBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPlansFieldBuilder() : null;
          } else {
            plansBuilder_.addAllMessages(other.plans_);
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
              com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan m =
                  input.readMessage(
                      com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.parser(),
                      extensionRegistry);
              if (plansBuilder_ == null) {
                ensurePlansIsMutable();
                plans_.add(m);
              } else {
                plansBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan> plans_ =
      java.util.Collections.emptyList();
    private void ensurePlansIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        plans_ = new java.util.ArrayList<com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan>(plans_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan, com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha3.PlanOrBuilder> plansBuilder_;

    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan> getPlansList() {
      if (plansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(plans_);
      } else {
        return plansBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public int getPlansCount() {
      if (plansBuilder_ == null) {
        return plans_.size();
      } else {
        return plansBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan getPlans(int index) {
      if (plansBuilder_ == null) {
        return plans_.get(index);
      } else {
        return plansBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public Builder setPlans(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan value) {
      if (plansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlansIsMutable();
        plans_.set(index, value);
        onChanged();
      } else {
        plansBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public Builder setPlans(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder builderForValue) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        plans_.set(index, builderForValue.build());
        onChanged();
      } else {
        plansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public Builder addPlans(com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan value) {
      if (plansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlansIsMutable();
        plans_.add(value);
        onChanged();
      } else {
        plansBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public Builder addPlans(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan value) {
      if (plansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlansIsMutable();
        plans_.add(index, value);
        onChanged();
      } else {
        plansBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public Builder addPlans(
        com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder builderForValue) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        plans_.add(builderForValue.build());
        onChanged();
      } else {
        plansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public Builder addPlans(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder builderForValue) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        plans_.add(index, builderForValue.build());
        onChanged();
      } else {
        plansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public Builder addAllPlans(
        java.lang.Iterable<? extends com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan> values) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, plans_);
        onChanged();
      } else {
        plansBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public Builder clearPlans() {
      if (plansBuilder_ == null) {
        plans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        plansBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public Builder removePlans(int index) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        plans_.remove(index);
        onChanged();
      } else {
        plansBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder getPlansBuilder(
        int index) {
      return getPlansFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.PlanOrBuilder getPlansOrBuilder(
        int index) {
      if (plansBuilder_ == null) {
        return plans_.get(index);  } else {
        return plansBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha3.PlanOrBuilder> 
         getPlansOrBuilderList() {
      if (plansBuilder_ != null) {
        return plansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(plans_);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder addPlansBuilder() {
      return getPlansFieldBuilder().addBuilder(
          com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder addPlansBuilder(
        int index) {
      return getPlansFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha3.Plan plans = 1 [json_name = "plans"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder> 
         getPlansBuilderList() {
      return getPlansFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan, com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha3.PlanOrBuilder> 
        getPlansFieldBuilder() {
      if (plansBuilder_ == null) {
        plansBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan, com.tcn.cloud.api.services.billing.entities.v1alpha3.Plan.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha3.PlanOrBuilder>(
                plans_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        plans_ = null;
      }
      return plansBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha3.GetPlanChangelogResponse)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha3.GetPlanChangelogResponse)
  private static final com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPlanChangelogResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPlanChangelogResponse>() {
    @java.lang.Override
    public GetPlanChangelogResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPlanChangelogResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPlanChangelogResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

