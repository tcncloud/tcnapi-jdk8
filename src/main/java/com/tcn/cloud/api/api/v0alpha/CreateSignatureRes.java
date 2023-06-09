// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * CreateSignatureRes - the result of creating a new signature
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.CreateSignatureRes}
 */
public final class CreateSignatureRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateSignatureRes)
    CreateSignatureResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSignatureRes.newBuilder() to construct.
  private CreateSignatureRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSignatureRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSignatureRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateSignatureRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateSignatureRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateSignatureRes.class, com.tcn.cloud.api.api.v0alpha.CreateSignatureRes.Builder.class);
  }

  public static final int SIGNATURE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.Signature signature_;
  /**
   * <pre>
   * the created signature object
   * </pre>
   *
   * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
   * @return Whether the signature field is set.
   */
  @java.lang.Override
  public boolean hasSignature() {
    return signature_ != null;
  }
  /**
   * <pre>
   * the created signature object
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
   * the created signature object
   * </pre>
   *
   * <code>.api.commons.Signature signature = 1 [json_name = "signature"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SignatureOrBuilder getSignatureOrBuilder() {
    return signature_ == null ? com.tcn.cloud.api.api.commons.Signature.getDefaultInstance() : signature_;
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
    if (signature_ != null) {
      output.writeMessage(1, getSignature());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (signature_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSignature());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateSignatureRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateSignatureRes other = (com.tcn.cloud.api.api.v0alpha.CreateSignatureRes) obj;

    if (hasSignature() != other.hasSignature()) return false;
    if (hasSignature()) {
      if (!getSignature()
          .equals(other.getSignature())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateSignatureRes prototype) {
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
   * CreateSignatureRes - the result of creating a new signature
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.CreateSignatureRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateSignatureRes)
      com.tcn.cloud.api.api.v0alpha.CreateSignatureResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateSignatureRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateSignatureRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateSignatureRes.class, com.tcn.cloud.api.api.v0alpha.CreateSignatureRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateSignatureRes.newBuilder()
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
      signature_ = null;
      if (signatureBuilder_ != null) {
        signatureBuilder_.dispose();
        signatureBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateSignatureRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateSignatureRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateSignatureRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateSignatureRes build() {
      com.tcn.cloud.api.api.v0alpha.CreateSignatureRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateSignatureRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateSignatureRes result = new com.tcn.cloud.api.api.v0alpha.CreateSignatureRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateSignatureRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.signature_ = signatureBuilder_ == null
            ? signature_
            : signatureBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateSignatureRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateSignatureRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateSignatureRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateSignatureRes.getDefaultInstance()) return this;
      if (other.hasSignature()) {
        mergeSignature(other.getSignature());
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
     * the created signature object
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
     * the created signature object
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
     * the created signature object
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
     * the created signature object
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
     * the created signature object
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the created signature object
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
     * the created signature object
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
     * the created signature object
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
     * the created signature object
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateSignatureRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateSignatureRes)
  private static final com.tcn.cloud.api.api.v0alpha.CreateSignatureRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateSignatureRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSignatureRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSignatureRes>
      PARSER = new com.google.protobuf.AbstractParser<CreateSignatureRes>() {
    @java.lang.Override
    public CreateSignatureRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSignatureRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSignatureRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateSignatureRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

