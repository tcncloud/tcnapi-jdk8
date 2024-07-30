// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/exile_certificate_manager/v1alpha1/exile_certificate.proto

package com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1;

/**
 * <pre>
 * RevokeExileCertificateRequest is the request for revoking a exile certificate.
 * </pre>
 *
 * Protobuf type {@code services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest}
 */
public final class RevokeExileCertificateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest)
    RevokeExileCertificateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RevokeExileCertificateRequest.newBuilder() to construct.
  private RevokeExileCertificateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RevokeExileCertificateRequest() {
    exileCertificateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RevokeExileCertificateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileCertificateProto.internal_static_services_org_exile_certificate_manager_v1alpha1_RevokeExileCertificateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileCertificateProto.internal_static_services_org_exile_certificate_manager_v1alpha1_RevokeExileCertificateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest.class, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest.Builder.class);
  }

  public static final int EXILE_CERTIFICATE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object exileCertificateId_ = "";
  /**
   * <pre>
   * The id of the exile certificate to delete.
   * </pre>
   *
   * <code>string exile_certificate_id = 1 [json_name = "exileCertificateId"];</code>
   * @return The exileCertificateId.
   */
  @java.lang.Override
  public java.lang.String getExileCertificateId() {
    java.lang.Object ref = exileCertificateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exileCertificateId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The id of the exile certificate to delete.
   * </pre>
   *
   * <code>string exile_certificate_id = 1 [json_name = "exileCertificateId"];</code>
   * @return The bytes for exileCertificateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExileCertificateIdBytes() {
    java.lang.Object ref = exileCertificateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exileCertificateId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exileCertificateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, exileCertificateId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exileCertificateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, exileCertificateId_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest other = (com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest) obj;

    if (!getExileCertificateId()
        .equals(other.getExileCertificateId())) return false;
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
    hash = (37 * hash) + EXILE_CERTIFICATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExileCertificateId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest prototype) {
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
   * RevokeExileCertificateRequest is the request for revoking a exile certificate.
   * </pre>
   *
   * Protobuf type {@code services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest)
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileCertificateProto.internal_static_services_org_exile_certificate_manager_v1alpha1_RevokeExileCertificateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileCertificateProto.internal_static_services_org_exile_certificate_manager_v1alpha1_RevokeExileCertificateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest.class, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest.newBuilder()
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
      exileCertificateId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileCertificateProto.internal_static_services_org_exile_certificate_manager_v1alpha1_RevokeExileCertificateRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest build() {
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest buildPartial() {
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest result = new com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.exileCertificateId_ = exileCertificateId_;
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
      if (other instanceof com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest) {
        return mergeFrom((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest other) {
      if (other == com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest.getDefaultInstance()) return this;
      if (!other.getExileCertificateId().isEmpty()) {
        exileCertificateId_ = other.exileCertificateId_;
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
              exileCertificateId_ = input.readStringRequireUtf8();
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

    private java.lang.Object exileCertificateId_ = "";
    /**
     * <pre>
     * The id of the exile certificate to delete.
     * </pre>
     *
     * <code>string exile_certificate_id = 1 [json_name = "exileCertificateId"];</code>
     * @return The exileCertificateId.
     */
    public java.lang.String getExileCertificateId() {
      java.lang.Object ref = exileCertificateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exileCertificateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The id of the exile certificate to delete.
     * </pre>
     *
     * <code>string exile_certificate_id = 1 [json_name = "exileCertificateId"];</code>
     * @return The bytes for exileCertificateId.
     */
    public com.google.protobuf.ByteString
        getExileCertificateIdBytes() {
      java.lang.Object ref = exileCertificateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exileCertificateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The id of the exile certificate to delete.
     * </pre>
     *
     * <code>string exile_certificate_id = 1 [json_name = "exileCertificateId"];</code>
     * @param value The exileCertificateId to set.
     * @return This builder for chaining.
     */
    public Builder setExileCertificateId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      exileCertificateId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the exile certificate to delete.
     * </pre>
     *
     * <code>string exile_certificate_id = 1 [json_name = "exileCertificateId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExileCertificateId() {
      exileCertificateId_ = getDefaultInstance().getExileCertificateId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the exile certificate to delete.
     * </pre>
     *
     * <code>string exile_certificate_id = 1 [json_name = "exileCertificateId"];</code>
     * @param value The bytes for exileCertificateId to set.
     * @return This builder for chaining.
     */
    public Builder setExileCertificateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      exileCertificateId_ = value;
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


    // @@protoc_insertion_point(builder_scope:services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest)
  }

  // @@protoc_insertion_point(class_scope:services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest)
  private static final com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest();
  }

  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RevokeExileCertificateRequest>
      PARSER = new com.google.protobuf.AbstractParser<RevokeExileCertificateRequest>() {
    @java.lang.Override
    public RevokeExileCertificateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RevokeExileCertificateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RevokeExileCertificateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.RevokeExileCertificateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

