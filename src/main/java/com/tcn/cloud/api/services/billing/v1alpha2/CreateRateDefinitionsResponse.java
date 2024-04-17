// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha2/rates.proto

package com.tcn.cloud.api.services.billing.v1alpha2;

/**
 * Protobuf type {@code services.billing.v1alpha2.CreateRateDefinitionsResponse}
 */
public final class CreateRateDefinitionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha2.CreateRateDefinitionsResponse)
    CreateRateDefinitionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRateDefinitionsResponse.newBuilder() to construct.
  private CreateRateDefinitionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRateDefinitionsResponse() {
    rates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRateDefinitionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha2.RatesProto.internal_static_services_billing_v1alpha2_CreateRateDefinitionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha2.RatesProto.internal_static_services_billing_v1alpha2_CreateRateDefinitionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse.class, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse.Builder.class);
  }

  public static final int RATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> rates_;
  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> getRatesList() {
    return rates_;
  }
  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponseOrBuilder> 
      getRatesOrBuilderList() {
    return rates_;
  }
  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public int getRatesCount() {
    return rates_.size();
  }
  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse getRates(int index) {
    return rates_.get(index);
  }
  /**
   * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponseOrBuilder getRatesOrBuilder(
      int index) {
    return rates_.get(index);
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
    for (int i = 0; i < rates_.size(); i++) {
      output.writeMessage(1, rates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rates_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse other = (com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse) obj;

    if (!getRatesList()
        .equals(other.getRatesList())) return false;
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
    if (getRatesCount() > 0) {
      hash = (37 * hash) + RATES_FIELD_NUMBER;
      hash = (53 * hash) + getRatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse prototype) {
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
   * Protobuf type {@code services.billing.v1alpha2.CreateRateDefinitionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha2.CreateRateDefinitionsResponse)
      com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha2.RatesProto.internal_static_services_billing_v1alpha2_CreateRateDefinitionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha2.RatesProto.internal_static_services_billing_v1alpha2_CreateRateDefinitionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse.class, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse.newBuilder()
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
      if (ratesBuilder_ == null) {
        rates_ = java.util.Collections.emptyList();
      } else {
        rates_ = null;
        ratesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.v1alpha2.RatesProto.internal_static_services_billing_v1alpha2_CreateRateDefinitionsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse build() {
      com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse result = new com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse result) {
      if (ratesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rates_ = java.util.Collections.unmodifiableList(rates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rates_ = rates_;
      } else {
        result.rates_ = ratesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse.getDefaultInstance()) return this;
      if (ratesBuilder_ == null) {
        if (!other.rates_.isEmpty()) {
          if (rates_.isEmpty()) {
            rates_ = other.rates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRatesIsMutable();
            rates_.addAll(other.rates_);
          }
          onChanged();
        }
      } else {
        if (!other.rates_.isEmpty()) {
          if (ratesBuilder_.isEmpty()) {
            ratesBuilder_.dispose();
            ratesBuilder_ = null;
            rates_ = other.rates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ratesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRatesFieldBuilder() : null;
          } else {
            ratesBuilder_.addAllMessages(other.rates_);
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
              com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse m =
                  input.readMessage(
                      com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.parser(),
                      extensionRegistry);
              if (ratesBuilder_ == null) {
                ensureRatesIsMutable();
                rates_.add(m);
              } else {
                ratesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> rates_ =
      java.util.Collections.emptyList();
    private void ensureRatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rates_ = new java.util.ArrayList<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse>(rates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponseOrBuilder> ratesBuilder_;

    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> getRatesList() {
      if (ratesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rates_);
      } else {
        return ratesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public int getRatesCount() {
      if (ratesBuilder_ == null) {
        return rates_.size();
      } else {
        return ratesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse getRates(int index) {
      if (ratesBuilder_ == null) {
        return rates_.get(index);
      } else {
        return ratesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public Builder setRates(
        int index, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse value) {
      if (ratesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatesIsMutable();
        rates_.set(index, value);
        onChanged();
      } else {
        ratesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public Builder setRates(
        int index, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder builderForValue) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        rates_.set(index, builderForValue.build());
        onChanged();
      } else {
        ratesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public Builder addRates(com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse value) {
      if (ratesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatesIsMutable();
        rates_.add(value);
        onChanged();
      } else {
        ratesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public Builder addRates(
        int index, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse value) {
      if (ratesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatesIsMutable();
        rates_.add(index, value);
        onChanged();
      } else {
        ratesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public Builder addRates(
        com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder builderForValue) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        rates_.add(builderForValue.build());
        onChanged();
      } else {
        ratesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public Builder addRates(
        int index, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder builderForValue) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        rates_.add(index, builderForValue.build());
        onChanged();
      } else {
        ratesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public Builder addAllRates(
        java.lang.Iterable<? extends com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> values) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rates_);
        onChanged();
      } else {
        ratesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public Builder clearRates() {
      if (ratesBuilder_ == null) {
        rates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ratesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public Builder removeRates(int index) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        rates_.remove(index);
        onChanged();
      } else {
        ratesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder getRatesBuilder(
        int index) {
      return getRatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponseOrBuilder getRatesOrBuilder(
        int index) {
      if (ratesBuilder_ == null) {
        return rates_.get(index);  } else {
        return ratesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponseOrBuilder> 
         getRatesOrBuilderList() {
      if (ratesBuilder_ != null) {
        return ratesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rates_);
      }
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder addRatesBuilder() {
      return getRatesFieldBuilder().addBuilder(
          com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder addRatesBuilder(
        int index) {
      return getRatesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.v1alpha2.CreateRateDefinitionResponse rates = 1 [json_name = "rates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder> 
         getRatesBuilderList() {
      return getRatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponseOrBuilder> 
        getRatesFieldBuilder() {
      if (ratesBuilder_ == null) {
        ratesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.Builder, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponseOrBuilder>(
                rates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rates_ = null;
      }
      return ratesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha2.CreateRateDefinitionsResponse)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha2.CreateRateDefinitionsResponse)
  private static final com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRateDefinitionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateRateDefinitionsResponse>() {
    @java.lang.Override
    public CreateRateDefinitionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRateDefinitionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRateDefinitionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

