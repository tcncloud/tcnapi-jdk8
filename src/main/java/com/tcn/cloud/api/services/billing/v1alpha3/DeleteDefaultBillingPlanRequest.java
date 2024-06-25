// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha3/defaults.proto

package com.tcn.cloud.api.services.billing.v1alpha3;

/**
 * Protobuf type {@code services.billing.v1alpha3.DeleteDefaultBillingPlanRequest}
 */
public final class DeleteDefaultBillingPlanRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha3.DeleteDefaultBillingPlanRequest)
    DeleteDefaultBillingPlanRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteDefaultBillingPlanRequest.newBuilder() to construct.
  private DeleteDefaultBillingPlanRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteDefaultBillingPlanRequest() {
    billingPlanId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteDefaultBillingPlanRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_DeleteDefaultBillingPlanRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_DeleteDefaultBillingPlanRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest.class, com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest.Builder.class);
  }

  public static final int BILLING_PLAN_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object billingPlanId_ = "";
  /**
   * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
   * @return The billingPlanId.
   */
  @java.lang.Override
  public java.lang.String getBillingPlanId() {
    java.lang.Object ref = billingPlanId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      billingPlanId_ = s;
      return s;
    }
  }
  /**
   * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
   * @return The bytes for billingPlanId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBillingPlanIdBytes() {
    java.lang.Object ref = billingPlanId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      billingPlanId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingPlanId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, billingPlanId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingPlanId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, billingPlanId_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest other = (com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest) obj;

    if (!getBillingPlanId()
        .equals(other.getBillingPlanId())) return false;
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
    hash = (37 * hash) + BILLING_PLAN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBillingPlanId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest prototype) {
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
   * Protobuf type {@code services.billing.v1alpha3.DeleteDefaultBillingPlanRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha3.DeleteDefaultBillingPlanRequest)
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_DeleteDefaultBillingPlanRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_DeleteDefaultBillingPlanRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest.class, com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest.newBuilder()
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
      billingPlanId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.internal_static_services_billing_v1alpha3_DeleteDefaultBillingPlanRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest build() {
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest result = new com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.billingPlanId_ = billingPlanId_;
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest.getDefaultInstance()) return this;
      if (!other.getBillingPlanId().isEmpty()) {
        billingPlanId_ = other.billingPlanId_;
        bitField0_ |= 0x00000001;
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
              billingPlanId_ = input.readStringRequireUtf8();
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

    private java.lang.Object billingPlanId_ = "";
    /**
     * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
     * @return The billingPlanId.
     */
    public java.lang.String getBillingPlanId() {
      java.lang.Object ref = billingPlanId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        billingPlanId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
     * @return The bytes for billingPlanId.
     */
    public com.google.protobuf.ByteString
        getBillingPlanIdBytes() {
      java.lang.Object ref = billingPlanId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        billingPlanId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
     * @param value The billingPlanId to set.
     * @return This builder for chaining.
     */
    public Builder setBillingPlanId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      billingPlanId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBillingPlanId() {
      billingPlanId_ = getDefaultInstance().getBillingPlanId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
     * @param value The bytes for billingPlanId to set.
     * @return This builder for chaining.
     */
    public Builder setBillingPlanIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      billingPlanId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha3.DeleteDefaultBillingPlanRequest)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha3.DeleteDefaultBillingPlanRequest)
  private static final com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteDefaultBillingPlanRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteDefaultBillingPlanRequest>() {
    @java.lang.Override
    public DeleteDefaultBillingPlanRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteDefaultBillingPlanRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteDefaultBillingPlanRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
