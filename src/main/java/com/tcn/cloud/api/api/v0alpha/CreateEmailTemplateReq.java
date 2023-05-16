// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateEmailTemplateReq}
 */
public final class CreateEmailTemplateReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateEmailTemplateReq)
    CreateEmailTemplateReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEmailTemplateReq.newBuilder() to construct.
  private CreateEmailTemplateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEmailTemplateReq() {
    emailSubject_ = "";
    emailBody_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEmailTemplateReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailTemplateReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailTemplateReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq.class, com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq.Builder.class);
  }

  public static final int EMAIL_SUBJECT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object emailSubject_ = "";
  /**
   * <code>string email_subject = 3 [json_name = "emailSubject"];</code>
   * @return The emailSubject.
   */
  @java.lang.Override
  public java.lang.String getEmailSubject() {
    java.lang.Object ref = emailSubject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailSubject_ = s;
      return s;
    }
  }
  /**
   * <code>string email_subject = 3 [json_name = "emailSubject"];</code>
   * @return The bytes for emailSubject.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailSubjectBytes() {
    java.lang.Object ref = emailSubject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emailSubject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_BODY_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object emailBody_ = "";
  /**
   * <code>string email_body = 4 [json_name = "emailBody"];</code>
   * @return The emailBody.
   */
  @java.lang.Override
  public java.lang.String getEmailBody() {
    java.lang.Object ref = emailBody_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailBody_ = s;
      return s;
    }
  }
  /**
   * <code>string email_body = 4 [json_name = "emailBody"];</code>
   * @return The bytes for emailBody.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBodyBytes() {
    java.lang.Object ref = emailBody_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emailBody_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailSubject_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, emailSubject_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailBody_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, emailBody_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailSubject_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, emailSubject_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailBody_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, emailBody_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq other = (com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq) obj;

    if (!getEmailSubject()
        .equals(other.getEmailSubject())) return false;
    if (!getEmailBody()
        .equals(other.getEmailBody())) return false;
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
    hash = (37 * hash) + EMAIL_SUBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getEmailSubject().hashCode();
    hash = (37 * hash) + EMAIL_BODY_FIELD_NUMBER;
    hash = (53 * hash) + getEmailBody().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateEmailTemplateReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateEmailTemplateReq)
      com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailTemplateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailTemplateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq.class, com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq.newBuilder()
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
      emailSubject_ = "";
      emailBody_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailTemplateReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq result = new com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emailSubject_ = emailSubject_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.emailBody_ = emailBody_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq.getDefaultInstance()) return this;
      if (!other.getEmailSubject().isEmpty()) {
        emailSubject_ = other.emailSubject_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEmailBody().isEmpty()) {
        emailBody_ = other.emailBody_;
        bitField0_ |= 0x00000002;
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
            case 26: {
              emailSubject_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 34: {
              emailBody_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 34
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

    private java.lang.Object emailSubject_ = "";
    /**
     * <code>string email_subject = 3 [json_name = "emailSubject"];</code>
     * @return The emailSubject.
     */
    public java.lang.String getEmailSubject() {
      java.lang.Object ref = emailSubject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailSubject_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email_subject = 3 [json_name = "emailSubject"];</code>
     * @return The bytes for emailSubject.
     */
    public com.google.protobuf.ByteString
        getEmailSubjectBytes() {
      java.lang.Object ref = emailSubject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailSubject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email_subject = 3 [json_name = "emailSubject"];</code>
     * @param value The emailSubject to set.
     * @return This builder for chaining.
     */
    public Builder setEmailSubject(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      emailSubject_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string email_subject = 3 [json_name = "emailSubject"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailSubject() {
      emailSubject_ = getDefaultInstance().getEmailSubject();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string email_subject = 3 [json_name = "emailSubject"];</code>
     * @param value The bytes for emailSubject to set.
     * @return This builder for chaining.
     */
    public Builder setEmailSubjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      emailSubject_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object emailBody_ = "";
    /**
     * <code>string email_body = 4 [json_name = "emailBody"];</code>
     * @return The emailBody.
     */
    public java.lang.String getEmailBody() {
      java.lang.Object ref = emailBody_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailBody_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email_body = 4 [json_name = "emailBody"];</code>
     * @return The bytes for emailBody.
     */
    public com.google.protobuf.ByteString
        getEmailBodyBytes() {
      java.lang.Object ref = emailBody_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailBody_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email_body = 4 [json_name = "emailBody"];</code>
     * @param value The emailBody to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBody(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      emailBody_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string email_body = 4 [json_name = "emailBody"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailBody() {
      emailBody_ = getDefaultInstance().getEmailBody();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string email_body = 4 [json_name = "emailBody"];</code>
     * @param value The bytes for emailBody to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBodyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      emailBody_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateEmailTemplateReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateEmailTemplateReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEmailTemplateReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateEmailTemplateReq>() {
    @java.lang.Override
    public CreateEmailTemplateReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEmailTemplateReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEmailTemplateReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

