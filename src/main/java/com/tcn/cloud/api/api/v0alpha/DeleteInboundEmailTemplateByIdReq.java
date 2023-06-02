// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.DeleteInboundEmailTemplateByIdReq}
 */
public final class DeleteInboundEmailTemplateByIdReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DeleteInboundEmailTemplateByIdReq)
    DeleteInboundEmailTemplateByIdReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteInboundEmailTemplateByIdReq.newBuilder() to construct.
  private DeleteInboundEmailTemplateByIdReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteInboundEmailTemplateByIdReq() {
    inboundEmailTemplateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteInboundEmailTemplateByIdReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_DeleteInboundEmailTemplateByIdReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_DeleteInboundEmailTemplateByIdReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq.class, com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq.Builder.class);
  }

  public static final int INBOUND_EMAIL_TEMPLATE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inboundEmailTemplateId_ = "";
  /**
   * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
   * @return The inboundEmailTemplateId.
   */
  @java.lang.Override
  public java.lang.String getInboundEmailTemplateId() {
    java.lang.Object ref = inboundEmailTemplateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inboundEmailTemplateId_ = s;
      return s;
    }
  }
  /**
   * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
   * @return The bytes for inboundEmailTemplateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInboundEmailTemplateIdBytes() {
    java.lang.Object ref = inboundEmailTemplateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inboundEmailTemplateId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboundEmailTemplateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inboundEmailTemplateId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboundEmailTemplateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inboundEmailTemplateId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq other = (com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq) obj;

    if (!getInboundEmailTemplateId()
        .equals(other.getInboundEmailTemplateId())) return false;
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
    hash = (37 * hash) + INBOUND_EMAIL_TEMPLATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInboundEmailTemplateId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq prototype) {
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
   * Protobuf type {@code api.v0alpha.DeleteInboundEmailTemplateByIdReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DeleteInboundEmailTemplateByIdReq)
      com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_DeleteInboundEmailTemplateByIdReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_DeleteInboundEmailTemplateByIdReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq.class, com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq.newBuilder()
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
      inboundEmailTemplateId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_DeleteInboundEmailTemplateByIdReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq build() {
      com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq result = new com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inboundEmailTemplateId_ = inboundEmailTemplateId_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq.getDefaultInstance()) return this;
      if (!other.getInboundEmailTemplateId().isEmpty()) {
        inboundEmailTemplateId_ = other.inboundEmailTemplateId_;
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
              inboundEmailTemplateId_ = input.readStringRequireUtf8();
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

    private java.lang.Object inboundEmailTemplateId_ = "";
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @return The inboundEmailTemplateId.
     */
    public java.lang.String getInboundEmailTemplateId() {
      java.lang.Object ref = inboundEmailTemplateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inboundEmailTemplateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @return The bytes for inboundEmailTemplateId.
     */
    public com.google.protobuf.ByteString
        getInboundEmailTemplateIdBytes() {
      java.lang.Object ref = inboundEmailTemplateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inboundEmailTemplateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @param value The inboundEmailTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setInboundEmailTemplateId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inboundEmailTemplateId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInboundEmailTemplateId() {
      inboundEmailTemplateId_ = getDefaultInstance().getInboundEmailTemplateId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @param value The bytes for inboundEmailTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setInboundEmailTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inboundEmailTemplateId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DeleteInboundEmailTemplateByIdReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DeleteInboundEmailTemplateByIdReq)
  private static final com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteInboundEmailTemplateByIdReq>
      PARSER = new com.google.protobuf.AbstractParser<DeleteInboundEmailTemplateByIdReq>() {
    @java.lang.Override
    public DeleteInboundEmailTemplateByIdReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteInboundEmailTemplateByIdReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteInboundEmailTemplateByIdReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

