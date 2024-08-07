// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha4/tag.proto

package com.tcn.cloud.api.services.billing.v1alpha4;

/**
 * Protobuf type {@code services.billing.v1alpha4.UpdateBillingTagRequest}
 */
public final class UpdateBillingTagRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha4.UpdateBillingTagRequest)
    UpdateBillingTagRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateBillingTagRequest.newBuilder() to construct.
  private UpdateBillingTagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBillingTagRequest() {
    billingTagId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateBillingTagRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha4.TagProto.internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha4.TagProto.internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest.class, com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest.Builder.class);
  }

  public static final int BILLING_TAG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object billingTagId_ = "";
  /**
   * <code>string billing_tag_id = 1 [json_name = "billingTagId"];</code>
   * @return The billingTagId.
   */
  @java.lang.Override
  public java.lang.String getBillingTagId() {
    java.lang.Object ref = billingTagId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      billingTagId_ = s;
      return s;
    }
  }
  /**
   * <code>string billing_tag_id = 1 [json_name = "billingTagId"];</code>
   * @return The bytes for billingTagId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBillingTagIdBytes() {
    java.lang.Object ref = billingTagId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      billingTagId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BILLING_TAG_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag billingTag_;
  /**
   * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
   * @return Whether the billingTag field is set.
   */
  @java.lang.Override
  public boolean hasBillingTag() {
    return billingTag_ != null;
  }
  /**
   * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
   * @return The billingTag.
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag getBillingTag() {
    return billingTag_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.getDefaultInstance() : billingTag_;
  }
  /**
   * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTagOrBuilder getBillingTagOrBuilder() {
    return billingTag_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.getDefaultInstance() : billingTag_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingTagId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, billingTagId_);
    }
    if (billingTag_ != null) {
      output.writeMessage(2, getBillingTag());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingTagId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, billingTagId_);
    }
    if (billingTag_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBillingTag());
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest other = (com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest) obj;

    if (!getBillingTagId()
        .equals(other.getBillingTagId())) return false;
    if (hasBillingTag() != other.hasBillingTag()) return false;
    if (hasBillingTag()) {
      if (!getBillingTag()
          .equals(other.getBillingTag())) return false;
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
    hash = (37 * hash) + BILLING_TAG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBillingTagId().hashCode();
    if (hasBillingTag()) {
      hash = (37 * hash) + BILLING_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getBillingTag().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest prototype) {
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
   * Protobuf type {@code services.billing.v1alpha4.UpdateBillingTagRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha4.UpdateBillingTagRequest)
      com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha4.TagProto.internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha4.TagProto.internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest.class, com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest.newBuilder()
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
      billingTagId_ = "";
      billingTag_ = null;
      if (billingTagBuilder_ != null) {
        billingTagBuilder_.dispose();
        billingTagBuilder_ = null;
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
      return com.tcn.cloud.api.services.billing.v1alpha4.TagProto.internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest build() {
      com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest result = new com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.billingTagId_ = billingTagId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.billingTag_ = billingTagBuilder_ == null
            ? billingTag_
            : billingTagBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest.getDefaultInstance()) return this;
      if (!other.getBillingTagId().isEmpty()) {
        billingTagId_ = other.billingTagId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBillingTag()) {
        mergeBillingTag(other.getBillingTag());
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
              billingTagId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBillingTagFieldBuilder().getBuilder(),
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

    private java.lang.Object billingTagId_ = "";
    /**
     * <code>string billing_tag_id = 1 [json_name = "billingTagId"];</code>
     * @return The billingTagId.
     */
    public java.lang.String getBillingTagId() {
      java.lang.Object ref = billingTagId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        billingTagId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string billing_tag_id = 1 [json_name = "billingTagId"];</code>
     * @return The bytes for billingTagId.
     */
    public com.google.protobuf.ByteString
        getBillingTagIdBytes() {
      java.lang.Object ref = billingTagId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        billingTagId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string billing_tag_id = 1 [json_name = "billingTagId"];</code>
     * @param value The billingTagId to set.
     * @return This builder for chaining.
     */
    public Builder setBillingTagId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      billingTagId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string billing_tag_id = 1 [json_name = "billingTagId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBillingTagId() {
      billingTagId_ = getDefaultInstance().getBillingTagId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string billing_tag_id = 1 [json_name = "billingTagId"];</code>
     * @param value The bytes for billingTagId to set.
     * @return This builder for chaining.
     */
    public Builder setBillingTagIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      billingTagId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag billingTag_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTagOrBuilder> billingTagBuilder_;
    /**
     * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
     * @return Whether the billingTag field is set.
     */
    public boolean hasBillingTag() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
     * @return The billingTag.
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag getBillingTag() {
      if (billingTagBuilder_ == null) {
        return billingTag_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.getDefaultInstance() : billingTag_;
      } else {
        return billingTagBuilder_.getMessage();
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
     */
    public Builder setBillingTag(com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag value) {
      if (billingTagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        billingTag_ = value;
      } else {
        billingTagBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
     */
    public Builder setBillingTag(
        com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.Builder builderForValue) {
      if (billingTagBuilder_ == null) {
        billingTag_ = builderForValue.build();
      } else {
        billingTagBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
     */
    public Builder mergeBillingTag(com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag value) {
      if (billingTagBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          billingTag_ != null &&
          billingTag_ != com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.getDefaultInstance()) {
          getBillingTagBuilder().mergeFrom(value);
        } else {
          billingTag_ = value;
        }
      } else {
        billingTagBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
     */
    public Builder clearBillingTag() {
      bitField0_ = (bitField0_ & ~0x00000002);
      billingTag_ = null;
      if (billingTagBuilder_ != null) {
        billingTagBuilder_.dispose();
        billingTagBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.Builder getBillingTagBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBillingTagFieldBuilder().getBuilder();
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTagOrBuilder getBillingTagOrBuilder() {
      if (billingTagBuilder_ != null) {
        return billingTagBuilder_.getMessageOrBuilder();
      } else {
        return billingTag_ == null ?
            com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.getDefaultInstance() : billingTag_;
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha4.BillingTag billing_tag = 2 [json_name = "billingTag"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTagOrBuilder> 
        getBillingTagFieldBuilder() {
      if (billingTagBuilder_ == null) {
        billingTagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTag.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha4.BillingTagOrBuilder>(
                getBillingTag(),
                getParentForChildren(),
                isClean());
        billingTag_ = null;
      }
      return billingTagBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha4.UpdateBillingTagRequest)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha4.UpdateBillingTagRequest)
  private static final com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBillingTagRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBillingTagRequest>() {
    @java.lang.Override
    public UpdateBillingTagRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateBillingTagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBillingTagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha4.UpdateBillingTagRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

