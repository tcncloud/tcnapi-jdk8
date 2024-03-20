// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/rates.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

/**
 * Protobuf type {@code services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse}
 */
public final class ListHistoricalRateDefinitionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse)
    ListHistoricalRateDefinitionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListHistoricalRateDefinitionsResponse.newBuilder() to construct.
  private ListHistoricalRateDefinitionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListHistoricalRateDefinitionsResponse() {
    rateDefinitions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListHistoricalRateDefinitionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha1.RatesProto.internal_static_services_billing_v1alpha1_ListHistoricalRateDefinitionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha1.RatesProto.internal_static_services_billing_v1alpha1_ListHistoricalRateDefinitionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse.class, com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse.Builder.class);
  }

  public static final int RATE_DEFINITIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition> rateDefinitions_;
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition> getRateDefinitionsList() {
    return rateDefinitions_;
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionOrBuilder> 
      getRateDefinitionsOrBuilderList() {
    return rateDefinitions_;
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
   */
  @java.lang.Override
  public int getRateDefinitionsCount() {
    return rateDefinitions_.size();
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition getRateDefinitions(int index) {
    return rateDefinitions_.get(index);
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionOrBuilder getRateDefinitionsOrBuilder(
      int index) {
    return rateDefinitions_.get(index);
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
    for (int i = 0; i < rateDefinitions_.size(); i++) {
      output.writeMessage(1, rateDefinitions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rateDefinitions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rateDefinitions_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse other = (com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse) obj;

    if (!getRateDefinitionsList()
        .equals(other.getRateDefinitionsList())) return false;
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
    if (getRateDefinitionsCount() > 0) {
      hash = (37 * hash) + RATE_DEFINITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRateDefinitionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse prototype) {
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
   * Protobuf type {@code services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse)
      com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha1.RatesProto.internal_static_services_billing_v1alpha1_ListHistoricalRateDefinitionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha1.RatesProto.internal_static_services_billing_v1alpha1_ListHistoricalRateDefinitionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse.class, com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse.newBuilder()
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
      if (rateDefinitionsBuilder_ == null) {
        rateDefinitions_ = java.util.Collections.emptyList();
      } else {
        rateDefinitions_ = null;
        rateDefinitionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.v1alpha1.RatesProto.internal_static_services_billing_v1alpha1_ListHistoricalRateDefinitionsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse build() {
      com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse result = new com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse result) {
      if (rateDefinitionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rateDefinitions_ = java.util.Collections.unmodifiableList(rateDefinitions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rateDefinitions_ = rateDefinitions_;
      } else {
        result.rateDefinitions_ = rateDefinitionsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse.getDefaultInstance()) return this;
      if (rateDefinitionsBuilder_ == null) {
        if (!other.rateDefinitions_.isEmpty()) {
          if (rateDefinitions_.isEmpty()) {
            rateDefinitions_ = other.rateDefinitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRateDefinitionsIsMutable();
            rateDefinitions_.addAll(other.rateDefinitions_);
          }
          onChanged();
        }
      } else {
        if (!other.rateDefinitions_.isEmpty()) {
          if (rateDefinitionsBuilder_.isEmpty()) {
            rateDefinitionsBuilder_.dispose();
            rateDefinitionsBuilder_ = null;
            rateDefinitions_ = other.rateDefinitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rateDefinitionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRateDefinitionsFieldBuilder() : null;
          } else {
            rateDefinitionsBuilder_.addAllMessages(other.rateDefinitions_);
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
              com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition m =
                  input.readMessage(
                      com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.parser(),
                      extensionRegistry);
              if (rateDefinitionsBuilder_ == null) {
                ensureRateDefinitionsIsMutable();
                rateDefinitions_.add(m);
              } else {
                rateDefinitionsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition> rateDefinitions_ =
      java.util.Collections.emptyList();
    private void ensureRateDefinitionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rateDefinitions_ = new java.util.ArrayList<com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition>(rateDefinitions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionOrBuilder> rateDefinitionsBuilder_;

    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition> getRateDefinitionsList() {
      if (rateDefinitionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rateDefinitions_);
      } else {
        return rateDefinitionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public int getRateDefinitionsCount() {
      if (rateDefinitionsBuilder_ == null) {
        return rateDefinitions_.size();
      } else {
        return rateDefinitionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition getRateDefinitions(int index) {
      if (rateDefinitionsBuilder_ == null) {
        return rateDefinitions_.get(index);
      } else {
        return rateDefinitionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public Builder setRateDefinitions(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition value) {
      if (rateDefinitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRateDefinitionsIsMutable();
        rateDefinitions_.set(index, value);
        onChanged();
      } else {
        rateDefinitionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public Builder setRateDefinitions(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder builderForValue) {
      if (rateDefinitionsBuilder_ == null) {
        ensureRateDefinitionsIsMutable();
        rateDefinitions_.set(index, builderForValue.build());
        onChanged();
      } else {
        rateDefinitionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public Builder addRateDefinitions(com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition value) {
      if (rateDefinitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRateDefinitionsIsMutable();
        rateDefinitions_.add(value);
        onChanged();
      } else {
        rateDefinitionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public Builder addRateDefinitions(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition value) {
      if (rateDefinitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRateDefinitionsIsMutable();
        rateDefinitions_.add(index, value);
        onChanged();
      } else {
        rateDefinitionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public Builder addRateDefinitions(
        com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder builderForValue) {
      if (rateDefinitionsBuilder_ == null) {
        ensureRateDefinitionsIsMutable();
        rateDefinitions_.add(builderForValue.build());
        onChanged();
      } else {
        rateDefinitionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public Builder addRateDefinitions(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder builderForValue) {
      if (rateDefinitionsBuilder_ == null) {
        ensureRateDefinitionsIsMutable();
        rateDefinitions_.add(index, builderForValue.build());
        onChanged();
      } else {
        rateDefinitionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public Builder addAllRateDefinitions(
        java.lang.Iterable<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition> values) {
      if (rateDefinitionsBuilder_ == null) {
        ensureRateDefinitionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rateDefinitions_);
        onChanged();
      } else {
        rateDefinitionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public Builder clearRateDefinitions() {
      if (rateDefinitionsBuilder_ == null) {
        rateDefinitions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rateDefinitionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public Builder removeRateDefinitions(int index) {
      if (rateDefinitionsBuilder_ == null) {
        ensureRateDefinitionsIsMutable();
        rateDefinitions_.remove(index);
        onChanged();
      } else {
        rateDefinitionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder getRateDefinitionsBuilder(
        int index) {
      return getRateDefinitionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionOrBuilder getRateDefinitionsOrBuilder(
        int index) {
      if (rateDefinitionsBuilder_ == null) {
        return rateDefinitions_.get(index);  } else {
        return rateDefinitionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionOrBuilder> 
         getRateDefinitionsOrBuilderList() {
      if (rateDefinitionsBuilder_ != null) {
        return rateDefinitionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rateDefinitions_);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder addRateDefinitionsBuilder() {
      return getRateDefinitionsFieldBuilder().addBuilder(
          com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder addRateDefinitionsBuilder(
        int index) {
      return getRateDefinitionsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.RateDefinition rate_definitions = 1 [json_name = "rateDefinitions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder> 
         getRateDefinitionsBuilderList() {
      return getRateDefinitionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionOrBuilder> 
        getRateDefinitionsFieldBuilder() {
      if (rateDefinitionsBuilder_ == null) {
        rateDefinitionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinition.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionOrBuilder>(
                rateDefinitions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rateDefinitions_ = null;
      }
      return rateDefinitionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse)
  private static final com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListHistoricalRateDefinitionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListHistoricalRateDefinitionsResponse>() {
    @java.lang.Override
    public ListHistoricalRateDefinitionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListHistoricalRateDefinitionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListHistoricalRateDefinitionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha1.ListHistoricalRateDefinitionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

