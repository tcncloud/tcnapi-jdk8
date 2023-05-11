// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateEmailTemplateAttachmentReq}
 */
public final class UpdateEmailTemplateAttachmentReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateEmailTemplateAttachmentReq)
    UpdateEmailTemplateAttachmentReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEmailTemplateAttachmentReq.newBuilder() to construct.
  private UpdateEmailTemplateAttachmentReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEmailTemplateAttachmentReq() {
    fileName_ = "";
    contentType_ = "";
    hash_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEmailTemplateAttachmentReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateEmailTemplateAttachmentReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateEmailTemplateAttachmentReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq.class, com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq.Builder.class);
  }

  public static final int EMAIL_TEMPLATE_SID_FIELD_NUMBER = 3;
  private long emailTemplateSid_ = 0L;
  /**
   * <code>int64 email_template_sid = 3 [json_name = "emailTemplateSid"];</code>
   * @return The emailTemplateSid.
   */
  @java.lang.Override
  public long getEmailTemplateSid() {
    return emailTemplateSid_;
  }

  public static final int EMAIL_TEMPLATE_ATTACHMENT_SID_FIELD_NUMBER = 4;
  private long emailTemplateAttachmentSid_ = 0L;
  /**
   * <code>int64 email_template_attachment_sid = 4 [json_name = "emailTemplateAttachmentSid"];</code>
   * @return The emailTemplateAttachmentSid.
   */
  @java.lang.Override
  public long getEmailTemplateAttachmentSid() {
    return emailTemplateAttachmentSid_;
  }

  public static final int FILE_NAME_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fileName_ = "";
  /**
   * <code>string file_name = 6 [json_name = "fileName"];</code>
   * @return The fileName.
   */
  @java.lang.Override
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string file_name = 6 [json_name = "fileName"];</code>
   * @return The bytes for fileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_SIZE_FIELD_NUMBER = 7;
  private long fileSize_ = 0L;
  /**
   * <code>int64 file_size = 7 [json_name = "fileSize"];</code>
   * @return The fileSize.
   */
  @java.lang.Override
  public long getFileSize() {
    return fileSize_;
  }

  public static final int CONTENT_TYPE_FIELD_NUMBER = 8;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contentType_ = "";
  /**
   * <code>string content_type = 8 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  @java.lang.Override
  public java.lang.String getContentType() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentType_ = s;
      return s;
    }
  }
  /**
   * <code>string content_type = 8 [json_name = "contentType"];</code>
   * @return The bytes for contentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentTypeBytes() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contentType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASH_FIELD_NUMBER = 9;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hash_ = "";
  /**
   * <code>string hash = 9 [json_name = "hash"];</code>
   * @return The hash.
   */
  @java.lang.Override
  public java.lang.String getHash() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hash_ = s;
      return s;
    }
  }
  /**
   * <code>string hash = 9 [json_name = "hash"];</code>
   * @return The bytes for hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hash_ = b;
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
    if (emailTemplateSid_ != 0L) {
      output.writeInt64(3, emailTemplateSid_);
    }
    if (emailTemplateAttachmentSid_ != 0L) {
      output.writeInt64(4, emailTemplateAttachmentSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, fileName_);
    }
    if (fileSize_ != 0L) {
      output.writeInt64(7, fileSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, contentType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, hash_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (emailTemplateSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, emailTemplateSid_);
    }
    if (emailTemplateAttachmentSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, emailTemplateAttachmentSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, fileName_);
    }
    if (fileSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, fileSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, contentType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, hash_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq other = (com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq) obj;

    if (getEmailTemplateSid()
        != other.getEmailTemplateSid()) return false;
    if (getEmailTemplateAttachmentSid()
        != other.getEmailTemplateAttachmentSid()) return false;
    if (!getFileName()
        .equals(other.getFileName())) return false;
    if (getFileSize()
        != other.getFileSize()) return false;
    if (!getContentType()
        .equals(other.getContentType())) return false;
    if (!getHash()
        .equals(other.getHash())) return false;
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
    hash = (37 * hash) + EMAIL_TEMPLATE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEmailTemplateSid());
    hash = (37 * hash) + EMAIL_TEMPLATE_ATTACHMENT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEmailTemplateAttachmentSid());
    hash = (37 * hash) + FILE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (37 * hash) + FILE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFileSize());
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType().hashCode();
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateEmailTemplateAttachmentReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateEmailTemplateAttachmentReq)
      com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateEmailTemplateAttachmentReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateEmailTemplateAttachmentReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq.class, com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq.newBuilder()
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
      emailTemplateSid_ = 0L;
      emailTemplateAttachmentSid_ = 0L;
      fileName_ = "";
      fileSize_ = 0L;
      contentType_ = "";
      hash_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateEmailTemplateAttachmentReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq result = new com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emailTemplateSid_ = emailTemplateSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.emailTemplateAttachmentSid_ = emailTemplateAttachmentSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fileName_ = fileName_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fileSize_ = fileSize_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.contentType_ = contentType_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.hash_ = hash_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq.getDefaultInstance()) return this;
      if (other.getEmailTemplateSid() != 0L) {
        setEmailTemplateSid(other.getEmailTemplateSid());
      }
      if (other.getEmailTemplateAttachmentSid() != 0L) {
        setEmailTemplateAttachmentSid(other.getEmailTemplateAttachmentSid());
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getFileSize() != 0L) {
        setFileSize(other.getFileSize());
      }
      if (!other.getContentType().isEmpty()) {
        contentType_ = other.contentType_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getHash().isEmpty()) {
        hash_ = other.hash_;
        bitField0_ |= 0x00000020;
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
            case 24: {
              emailTemplateSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 32: {
              emailTemplateAttachmentSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
            case 50: {
              fileName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 50
            case 56: {
              fileSize_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 56
            case 66: {
              contentType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 66
            case 74: {
              hash_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 74
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

    private long emailTemplateSid_ ;
    /**
     * <code>int64 email_template_sid = 3 [json_name = "emailTemplateSid"];</code>
     * @return The emailTemplateSid.
     */
    @java.lang.Override
    public long getEmailTemplateSid() {
      return emailTemplateSid_;
    }
    /**
     * <code>int64 email_template_sid = 3 [json_name = "emailTemplateSid"];</code>
     * @param value The emailTemplateSid to set.
     * @return This builder for chaining.
     */
    public Builder setEmailTemplateSid(long value) {

      emailTemplateSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 email_template_sid = 3 [json_name = "emailTemplateSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailTemplateSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      emailTemplateSid_ = 0L;
      onChanged();
      return this;
    }

    private long emailTemplateAttachmentSid_ ;
    /**
     * <code>int64 email_template_attachment_sid = 4 [json_name = "emailTemplateAttachmentSid"];</code>
     * @return The emailTemplateAttachmentSid.
     */
    @java.lang.Override
    public long getEmailTemplateAttachmentSid() {
      return emailTemplateAttachmentSid_;
    }
    /**
     * <code>int64 email_template_attachment_sid = 4 [json_name = "emailTemplateAttachmentSid"];</code>
     * @param value The emailTemplateAttachmentSid to set.
     * @return This builder for chaining.
     */
    public Builder setEmailTemplateAttachmentSid(long value) {

      emailTemplateAttachmentSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 email_template_attachment_sid = 4 [json_name = "emailTemplateAttachmentSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailTemplateAttachmentSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      emailTemplateAttachmentSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string file_name = 6 [json_name = "fileName"];</code>
     * @return The fileName.
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string file_name = 6 [json_name = "fileName"];</code>
     * @return The bytes for fileName.
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string file_name = 6 [json_name = "fileName"];</code>
     * @param value The fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fileName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string file_name = 6 [json_name = "fileName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFileName() {
      fileName_ = getDefaultInstance().getFileName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string file_name = 6 [json_name = "fileName"];</code>
     * @param value The bytes for fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fileName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long fileSize_ ;
    /**
     * <code>int64 file_size = 7 [json_name = "fileSize"];</code>
     * @return The fileSize.
     */
    @java.lang.Override
    public long getFileSize() {
      return fileSize_;
    }
    /**
     * <code>int64 file_size = 7 [json_name = "fileSize"];</code>
     * @param value The fileSize to set.
     * @return This builder for chaining.
     */
    public Builder setFileSize(long value) {

      fileSize_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 file_size = 7 [json_name = "fileSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFileSize() {
      bitField0_ = (bitField0_ & ~0x00000008);
      fileSize_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object contentType_ = "";
    /**
     * <code>string content_type = 8 [json_name = "contentType"];</code>
     * @return The contentType.
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content_type = 8 [json_name = "contentType"];</code>
     * @return The bytes for contentType.
     */
    public com.google.protobuf.ByteString
        getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content_type = 8 [json_name = "contentType"];</code>
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contentType_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string content_type = 8 [json_name = "contentType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      contentType_ = getDefaultInstance().getContentType();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string content_type = 8 [json_name = "contentType"];</code>
     * @param value The bytes for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contentType_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object hash_ = "";
    /**
     * <code>string hash = 9 [json_name = "hash"];</code>
     * @return The hash.
     */
    public java.lang.String getHash() {
      java.lang.Object ref = hash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hash = 9 [json_name = "hash"];</code>
     * @return The bytes for hash.
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hash = 9 [json_name = "hash"];</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hash_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 9 [json_name = "hash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      hash_ = getDefaultInstance().getHash();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 9 [json_name = "hash"];</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hash_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateEmailTemplateAttachmentReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateEmailTemplateAttachmentReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEmailTemplateAttachmentReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEmailTemplateAttachmentReq>() {
    @java.lang.Override
    public UpdateEmailTemplateAttachmentReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEmailTemplateAttachmentReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEmailTemplateAttachmentReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

