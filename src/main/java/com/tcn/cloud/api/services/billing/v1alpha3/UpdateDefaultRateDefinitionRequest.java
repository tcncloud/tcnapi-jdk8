// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha3/defaults.proto

package com.tcn.cloud.api.services.billing.v1alpha3;

/**
 * Protobuf type {@code services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest}
 */
public final class UpdateDefaultRateDefinitionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest)
    UpdateDefaultRateDefinitionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDefaultRateDefinitionRequest.newBuilder() to construct.
  private UpdateDefaultRateDefinitionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDefaultRateDefinitionRequest() {
    rateDefinitionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDefaultRateDefinitionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_UpdateDefaultRateDefinitionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_UpdateDefaultRateDefinitionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest.class, com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest.Builder.class);
  }

  public static final int RATE_DEFINITION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rateDefinitionId_ = "";
  /**
   * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
   * @return The rateDefinitionId.
   */
  @java.lang.Override
  public java.lang.String getRateDefinitionId() {
    java.lang.Object ref = rateDefinitionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rateDefinitionId_ = s;
      return s;
    }
  }
  /**
   * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
   * @return The bytes for rateDefinitionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRateDefinitionIdBytes() {
    java.lang.Object ref = rateDefinitionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rateDefinitionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RATE_DEFINITION_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition rateDefinition_;
  /**
   * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
   * @return Whether the rateDefinition field is set.
   */
  @java.lang.Override
  public boolean hasRateDefinition() {
    return rateDefinition_ != null;
  }
  /**
   * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
   * @return The rateDefinition.
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition getRateDefinition() {
    return rateDefinition_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.getDefaultInstance() : rateDefinition_;
  }
  /**
   * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinitionOrBuilder getRateDefinitionOrBuilder() {
    return rateDefinition_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.getDefaultInstance() : rateDefinition_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rateDefinitionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rateDefinitionId_);
    }
    if (rateDefinition_ != null) {
      output.writeMessage(2, getRateDefinition());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rateDefinitionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rateDefinitionId_);
    }
    if (rateDefinition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRateDefinition());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest other = (com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest) obj;

    if (!getRateDefinitionId()
        .equals(other.getRateDefinitionId())) return false;
    if (hasRateDefinition() != other.hasRateDefinition()) return false;
    if (hasRateDefinition()) {
      if (!getRateDefinition()
          .equals(other.getRateDefinition())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    hash = (37 * hash) + RATE_DEFINITION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRateDefinitionId().hashCode();
    if (hasRateDefinition()) {
      hash = (37 * hash) + RATE_DEFINITION_FIELD_NUMBER;
      hash = (53 * hash) + getRateDefinition().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest prototype) {
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
   * Protobuf type {@code services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest)
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_UpdateDefaultRateDefinitionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_UpdateDefaultRateDefinitionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest.class, com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest.newBuilder()
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
      rateDefinitionId_ = "";
      rateDefinition_ = null;
      if (rateDefinitionBuilder_ != null) {
        rateDefinitionBuilder_.dispose();
        rateDefinitionBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_UpdateDefaultRateDefinitionRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest build() {
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest result = new com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rateDefinitionId_ = rateDefinitionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rateDefinition_ = rateDefinitionBuilder_ == null
            ? rateDefinition_
            : rateDefinitionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest.getDefaultInstance()) return this;
      if (!other.getRateDefinitionId().isEmpty()) {
        rateDefinitionId_ = other.rateDefinitionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRateDefinition()) {
        mergeRateDefinition(other.getRateDefinition());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
              rateDefinitionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRateDefinitionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object rateDefinitionId_ = "";
    /**
     * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
     * @return The rateDefinitionId.
     */
    public java.lang.String getRateDefinitionId() {
      java.lang.Object ref = rateDefinitionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rateDefinitionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
     * @return The bytes for rateDefinitionId.
     */
    public com.google.protobuf.ByteString
        getRateDefinitionIdBytes() {
      java.lang.Object ref = rateDefinitionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rateDefinitionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
     * @param value The rateDefinitionId to set.
     * @return This builder for chaining.
     */
    public Builder setRateDefinitionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rateDefinitionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRateDefinitionId() {
      rateDefinitionId_ = getDefaultInstance().getRateDefinitionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
     * @param value The bytes for rateDefinitionId to set.
     * @return This builder for chaining.
     */
    public Builder setRateDefinitionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rateDefinitionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition rateDefinition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition, com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinitionOrBuilder> rateDefinitionBuilder_;
    /**
     * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
     * @return Whether the rateDefinition field is set.
     */
    public boolean hasRateDefinition() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
     * @return The rateDefinition.
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition getRateDefinition() {
      if (rateDefinitionBuilder_ == null) {
        return rateDefinition_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.getDefaultInstance() : rateDefinition_;
      } else {
        return rateDefinitionBuilder_.getMessage();
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
     */
    public Builder setRateDefinition(com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition value) {
      if (rateDefinitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rateDefinition_ = value;
      } else {
        rateDefinitionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
     */
    public Builder setRateDefinition(
        com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.Builder builderForValue) {
      if (rateDefinitionBuilder_ == null) {
        rateDefinition_ = builderForValue.build();
      } else {
        rateDefinitionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
     */
    public Builder mergeRateDefinition(com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition value) {
      if (rateDefinitionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          rateDefinition_ != null &&
          rateDefinition_ != com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.getDefaultInstance()) {
          getRateDefinitionBuilder().mergeFrom(value);
        } else {
          rateDefinition_ = value;
        }
      } else {
        rateDefinitionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
     */
    public Builder clearRateDefinition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rateDefinition_ = null;
      if (rateDefinitionBuilder_ != null) {
        rateDefinitionBuilder_.dispose();
        rateDefinitionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.Builder getRateDefinitionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRateDefinitionFieldBuilder().getBuilder();
    }
    /**
     * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinitionOrBuilder getRateDefinitionOrBuilder() {
      if (rateDefinitionBuilder_ != null) {
        return rateDefinitionBuilder_.getMessageOrBuilder();
      } else {
        return rateDefinition_ == null ?
            com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.getDefaultInstance() : rateDefinition_;
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha3.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition, com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinitionOrBuilder> 
        getRateDefinitionFieldBuilder() {
      if (rateDefinitionBuilder_ == null) {
        rateDefinitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition, com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinition.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha3.RateDefinitionOrBuilder>(
                getRateDefinition(),
                getParentForChildren(),
                isClean());
        rateDefinition_ = null;
      }
      return rateDefinitionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000004);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <code>.google.protobuf.FieldMask update_mask = 3 [json_name = "updateMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest)
  private static final com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDefaultRateDefinitionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDefaultRateDefinitionRequest>() {
    @java.lang.Override
    public UpdateDefaultRateDefinitionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDefaultRateDefinitionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDefaultRateDefinitionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

