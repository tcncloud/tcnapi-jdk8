// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * UpdateSignatureReq - request to update a message signature
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.UpdateSignatureReq}
 */
public final class UpdateSignatureReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateSignatureReq)
    UpdateSignatureReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSignatureReq.newBuilder() to construct.
  private UpdateSignatureReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSignatureReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSignatureReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_UpdateSignatureReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_UpdateSignatureReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq.class, com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq.Builder.class);
  }

  private int bitField0_;
  public static final int SIGNATURE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.Signature signature_;
  /**
   * <pre>
   * the signature details to update
   * </pre>
   *
   * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
   * @return Whether the signature field is set.
   */
  @java.lang.Override
  public boolean hasSignature() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * the signature details to update
   * </pre>
   *
   * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Signature getSignature() {
    return signature_ == null ? com.tcn.cloud.api.api.commons.Signature.getDefaultInstance() : signature_;
  }
  /**
   * <pre>
   * the signature details to update
   * </pre>
   *
   * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SignatureOrBuilder getSignatureOrBuilder() {
    return signature_ == null ? com.tcn.cloud.api.api.commons.Signature.getDefaultInstance() : signature_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * the field mask to update with
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  @java.lang.Override
  public boolean hasFieldMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * the field mask to update with
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFieldMask() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <pre>
   * the field mask to update with
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getSignature());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getFieldMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSignature());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFieldMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq other = (com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq) obj;

    if (hasSignature() != other.hasSignature()) return false;
    if (hasSignature()) {
      if (!getSignature()
          .equals(other.getSignature())) return false;
    }
    if (hasFieldMask() != other.hasFieldMask()) return false;
    if (hasFieldMask()) {
      if (!getFieldMask()
          .equals(other.getFieldMask())) return false;
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
    if (hasSignature()) {
      hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
      hash = (53 * hash) + getSignature().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq prototype) {
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
   * UpdateSignatureReq - request to update a message signature
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.UpdateSignatureReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateSignatureReq)
      com.tcn.cloud.api.api.v0alpha.UpdateSignatureReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_UpdateSignatureReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_UpdateSignatureReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq.class, com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSignatureFieldBuilder();
        getFieldMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      signature_ = null;
      if (signatureBuilder_ != null) {
        signatureBuilder_.dispose();
        signatureBuilder_ = null;
      }
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_UpdateSignatureReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq result = new com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.signature_ = signatureBuilder_ == null
            ? signature_
            : signatureBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldMask_ = fieldMaskBuilder_ == null
            ? fieldMask_
            : fieldMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq.getDefaultInstance()) return this;
      if (other.hasSignature()) {
        mergeSignature(other.getSignature());
      }
      if (other.hasFieldMask()) {
        mergeFieldMask(other.getFieldMask());
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
                  getSignatureFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFieldMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.tcn.cloud.api.api.commons.Signature signature_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Signature, com.tcn.cloud.api.api.commons.Signature.Builder, com.tcn.cloud.api.api.commons.SignatureOrBuilder> signatureBuilder_;
    /**
     * <pre>
     * the signature details to update
     * </pre>
     *
     * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
     * @return Whether the signature field is set.
     */
    public boolean hasSignature() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * the signature details to update
     * </pre>
     *
     * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
     * @return The signature.
     */
    public com.tcn.cloud.api.api.commons.Signature getSignature() {
      if (signatureBuilder_ == null) {
        return signature_ == null ? com.tcn.cloud.api.api.commons.Signature.getDefaultInstance() : signature_;
      } else {
        return signatureBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the signature details to update
     * </pre>
     *
     * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
     */
    public Builder setSignature(com.tcn.cloud.api.api.commons.Signature value) {
      if (signatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        signature_ = value;
      } else {
        signatureBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the signature details to update
     * </pre>
     *
     * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
     */
    public Builder setSignature(
        com.tcn.cloud.api.api.commons.Signature.Builder builderForValue) {
      if (signatureBuilder_ == null) {
        signature_ = builderForValue.build();
      } else {
        signatureBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the signature details to update
     * </pre>
     *
     * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
     */
    public Builder mergeSignature(com.tcn.cloud.api.api.commons.Signature value) {
      if (signatureBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          signature_ != null &&
          signature_ != com.tcn.cloud.api.api.commons.Signature.getDefaultInstance()) {
          getSignatureBuilder().mergeFrom(value);
        } else {
          signature_ = value;
        }
      } else {
        signatureBuilder_.mergeFrom(value);
      }
      if (signature_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * the signature details to update
     * </pre>
     *
     * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000001);
      signature_ = null;
      if (signatureBuilder_ != null) {
        signatureBuilder_.dispose();
        signatureBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the signature details to update
     * </pre>
     *
     * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
     */
    public com.tcn.cloud.api.api.commons.Signature.Builder getSignatureBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSignatureFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the signature details to update
     * </pre>
     *
     * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
     */
    public com.tcn.cloud.api.api.commons.SignatureOrBuilder getSignatureOrBuilder() {
      if (signatureBuilder_ != null) {
        return signatureBuilder_.getMessageOrBuilder();
      } else {
        return signature_ == null ?
            com.tcn.cloud.api.api.commons.Signature.getDefaultInstance() : signature_;
      }
    }
    /**
     * <pre>
     * the signature details to update
     * </pre>
     *
     * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Signature, com.tcn.cloud.api.api.commons.Signature.Builder, com.tcn.cloud.api.api.commons.SignatureOrBuilder> 
        getSignatureFieldBuilder() {
      if (signatureBuilder_ == null) {
        signatureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Signature, com.tcn.cloud.api.api.commons.Signature.Builder, com.tcn.cloud.api.api.commons.SignatureOrBuilder>(
                getSignature(),
                getParentForChildren(),
                isClean());
        signature_ = null;
      }
      return signatureBuilder_;
    }

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * the field mask to update with
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     * @return Whether the fieldMask field is set.
     */
    public boolean hasFieldMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * the field mask to update with
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     * @return The fieldMask.
     */
    public com.google.protobuf.FieldMask getFieldMask() {
      if (fieldMaskBuilder_ == null) {
        return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      } else {
        return fieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the field mask to update with
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldMask_ = value;
      } else {
        fieldMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the field mask to update with
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the field mask to update with
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public Builder mergeFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fieldMask_ != null &&
          fieldMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFieldMaskBuilder().mergeFrom(value);
        } else {
          fieldMask_ = value;
        }
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }
      if (fieldMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * the field mask to update with
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public Builder clearFieldMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the field mask to update with
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFieldMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the field mask to update with
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
      if (fieldMaskBuilder_ != null) {
        return fieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return fieldMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      }
    }
    /**
     * <pre>
     * the field mask to update with
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getFieldMaskFieldBuilder() {
      if (fieldMaskBuilder_ == null) {
        fieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getFieldMask(),
                getParentForChildren(),
                isClean());
        fieldMask_ = null;
      }
      return fieldMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateSignatureReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateSignatureReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSignatureReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSignatureReq>() {
    @java.lang.Override
    public UpdateSignatureReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSignatureReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSignatureReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

