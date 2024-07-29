// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * DeleteCertificateInfoRequest is the request for deleting a certificate info.
 * DEPRECATED: Use api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest instead
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.DeleteCertificateInfoRequest}
 */
@java.lang.Deprecated public final class DeleteCertificateInfoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.DeleteCertificateInfoRequest)
    DeleteCertificateInfoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteCertificateInfoRequest.newBuilder() to construct.
  private DeleteCertificateInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteCertificateInfoRequest() {
    certificateInfoId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteCertificateInfoRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_DeleteCertificateInfoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_DeleteCertificateInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest.class, com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest.Builder.class);
  }

  public static final int CERTIFICATE_INFO_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object certificateInfoId_ = "";
  /**
   * <pre>
   * The id of the certificate info to delete.
   * </pre>
   *
   * <code>string certificate_info_id = 1 [json_name = "certificateInfoId"];</code>
   * @return The certificateInfoId.
   */
  @java.lang.Override
  public java.lang.String getCertificateInfoId() {
    java.lang.Object ref = certificateInfoId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certificateInfoId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The id of the certificate info to delete.
   * </pre>
   *
   * <code>string certificate_info_id = 1 [json_name = "certificateInfoId"];</code>
   * @return The bytes for certificateInfoId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCertificateInfoIdBytes() {
    java.lang.Object ref = certificateInfoId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      certificateInfoId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificateInfoId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, certificateInfoId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificateInfoId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, certificateInfoId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest other = (com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest) obj;

    if (!getCertificateInfoId()
        .equals(other.getCertificateInfoId())) return false;
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
    hash = (37 * hash) + CERTIFICATE_INFO_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCertificateInfoId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest prototype) {
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
   * DeleteCertificateInfoRequest is the request for deleting a certificate info.
   * DEPRECATED: Use api.v1alpha1.org.exile_manager.DeleteCertificateInfoRequest instead
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.DeleteCertificateInfoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.DeleteCertificateInfoRequest)
      com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_DeleteCertificateInfoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_DeleteCertificateInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest.class, com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest.newBuilder()
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
      certificateInfoId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_DeleteCertificateInfoRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest result = new com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.certificateInfoId_ = certificateInfoId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest.getDefaultInstance()) return this;
      if (!other.getCertificateInfoId().isEmpty()) {
        certificateInfoId_ = other.certificateInfoId_;
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
              certificateInfoId_ = input.readStringRequireUtf8();
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

    private java.lang.Object certificateInfoId_ = "";
    /**
     * <pre>
     * The id of the certificate info to delete.
     * </pre>
     *
     * <code>string certificate_info_id = 1 [json_name = "certificateInfoId"];</code>
     * @return The certificateInfoId.
     */
    public java.lang.String getCertificateInfoId() {
      java.lang.Object ref = certificateInfoId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certificateInfoId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The id of the certificate info to delete.
     * </pre>
     *
     * <code>string certificate_info_id = 1 [json_name = "certificateInfoId"];</code>
     * @return The bytes for certificateInfoId.
     */
    public com.google.protobuf.ByteString
        getCertificateInfoIdBytes() {
      java.lang.Object ref = certificateInfoId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        certificateInfoId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The id of the certificate info to delete.
     * </pre>
     *
     * <code>string certificate_info_id = 1 [json_name = "certificateInfoId"];</code>
     * @param value The certificateInfoId to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateInfoId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      certificateInfoId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the certificate info to delete.
     * </pre>
     *
     * <code>string certificate_info_id = 1 [json_name = "certificateInfoId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCertificateInfoId() {
      certificateInfoId_ = getDefaultInstance().getCertificateInfoId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the certificate info to delete.
     * </pre>
     *
     * <code>string certificate_info_id = 1 [json_name = "certificateInfoId"];</code>
     * @param value The bytes for certificateInfoId to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateInfoIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      certificateInfoId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.DeleteCertificateInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.DeleteCertificateInfoRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteCertificateInfoRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteCertificateInfoRequest>() {
    @java.lang.Override
    public DeleteCertificateInfoRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteCertificateInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteCertificateInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.DeleteCertificateInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

