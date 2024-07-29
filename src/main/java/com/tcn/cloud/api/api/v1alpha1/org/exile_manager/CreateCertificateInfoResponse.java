// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/exile_manager/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.exile_manager;

/**
 * <pre>
 * CreateCertificateInfoResponse is the response for creating a certificate info.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse}
 */
public final class CreateCertificateInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse)
    CreateCertificateInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCertificateInfoResponse.newBuilder() to construct.
  private CreateCertificateInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCertificateInfoResponse() {
    encodedCertificate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCertificateInfoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.exile_manager.EntitiesProto.internal_static_api_v1alpha1_org_exile_manager_CreateCertificateInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.exile_manager.EntitiesProto.internal_static_api_v1alpha1_org_exile_manager_CreateCertificateInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse.class, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse.Builder.class);
  }

  public static final int ENCODED_CERTIFICATE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object encodedCertificate_ = "";
  /**
   * <pre>
   * The base-64 encoded certificate that was created.
   * </pre>
   *
   * <code>string encoded_certificate = 1 [json_name = "encodedCertificate"];</code>
   * @return The encodedCertificate.
   */
  @java.lang.Override
  public java.lang.String getEncodedCertificate() {
    java.lang.Object ref = encodedCertificate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encodedCertificate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The base-64 encoded certificate that was created.
   * </pre>
   *
   * <code>string encoded_certificate = 1 [json_name = "encodedCertificate"];</code>
   * @return The bytes for encodedCertificate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncodedCertificateBytes() {
    java.lang.Object ref = encodedCertificate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encodedCertificate_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encodedCertificate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, encodedCertificate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encodedCertificate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, encodedCertificate_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse other = (com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse) obj;

    if (!getEncodedCertificate()
        .equals(other.getEncodedCertificate())) return false;
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
    hash = (37 * hash) + ENCODED_CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getEncodedCertificate().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse prototype) {
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
   * CreateCertificateInfoResponse is the response for creating a certificate info.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse)
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.exile_manager.EntitiesProto.internal_static_api_v1alpha1_org_exile_manager_CreateCertificateInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.exile_manager.EntitiesProto.internal_static_api_v1alpha1_org_exile_manager_CreateCertificateInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse.class, com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse.newBuilder()
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
      encodedCertificate_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.exile_manager.EntitiesProto.internal_static_api_v1alpha1_org_exile_manager_CreateCertificateInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse result = new com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.encodedCertificate_ = encodedCertificate_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse.getDefaultInstance()) return this;
      if (!other.getEncodedCertificate().isEmpty()) {
        encodedCertificate_ = other.encodedCertificate_;
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
              encodedCertificate_ = input.readStringRequireUtf8();
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

    private java.lang.Object encodedCertificate_ = "";
    /**
     * <pre>
     * The base-64 encoded certificate that was created.
     * </pre>
     *
     * <code>string encoded_certificate = 1 [json_name = "encodedCertificate"];</code>
     * @return The encodedCertificate.
     */
    public java.lang.String getEncodedCertificate() {
      java.lang.Object ref = encodedCertificate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encodedCertificate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The base-64 encoded certificate that was created.
     * </pre>
     *
     * <code>string encoded_certificate = 1 [json_name = "encodedCertificate"];</code>
     * @return The bytes for encodedCertificate.
     */
    public com.google.protobuf.ByteString
        getEncodedCertificateBytes() {
      java.lang.Object ref = encodedCertificate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encodedCertificate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The base-64 encoded certificate that was created.
     * </pre>
     *
     * <code>string encoded_certificate = 1 [json_name = "encodedCertificate"];</code>
     * @param value The encodedCertificate to set.
     * @return This builder for chaining.
     */
    public Builder setEncodedCertificate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      encodedCertificate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The base-64 encoded certificate that was created.
     * </pre>
     *
     * <code>string encoded_certificate = 1 [json_name = "encodedCertificate"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEncodedCertificate() {
      encodedCertificate_ = getDefaultInstance().getEncodedCertificate();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The base-64 encoded certificate that was created.
     * </pre>
     *
     * <code>string encoded_certificate = 1 [json_name = "encodedCertificate"];</code>
     * @param value The bytes for encodedCertificate to set.
     * @return This builder for chaining.
     */
    public Builder setEncodedCertificateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      encodedCertificate_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCertificateInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateCertificateInfoResponse>() {
    @java.lang.Override
    public CreateCertificateInfoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCertificateInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCertificateInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.exile_manager.CreateCertificateInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

