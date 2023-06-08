// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes}
 */
public final class CreateEmailMessageAgentReplyAttachmentRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes)
    CreateEmailMessageAgentReplyAttachmentResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEmailMessageAgentReplyAttachmentRes.newBuilder() to construct.
  private CreateEmailMessageAgentReplyAttachmentRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEmailMessageAgentReplyAttachmentRes() {
    emailMessageReplyAttachmentId_ = "";
    urlPath_ = "";
    gsPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEmailMessageAgentReplyAttachmentRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAgentReplyAttachmentRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAgentReplyAttachmentRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes.class, com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes.Builder.class);
  }

  public static final int EMAIL_MESSAGE_REPLY_ATTACHMENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object emailMessageReplyAttachmentId_ = "";
  /**
   * <code>string email_message_reply_attachment_id = 1 [json_name = "emailMessageReplyAttachmentId"];</code>
   * @return The emailMessageReplyAttachmentId.
   */
  @java.lang.Override
  public java.lang.String getEmailMessageReplyAttachmentId() {
    java.lang.Object ref = emailMessageReplyAttachmentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailMessageReplyAttachmentId_ = s;
      return s;
    }
  }
  /**
   * <code>string email_message_reply_attachment_id = 1 [json_name = "emailMessageReplyAttachmentId"];</code>
   * @return The bytes for emailMessageReplyAttachmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailMessageReplyAttachmentIdBytes() {
    java.lang.Object ref = emailMessageReplyAttachmentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emailMessageReplyAttachmentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_PATH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object urlPath_ = "";
  /**
   * <code>string url_path = 2 [json_name = "urlPath"];</code>
   * @return The urlPath.
   */
  @java.lang.Override
  public java.lang.String getUrlPath() {
    java.lang.Object ref = urlPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      urlPath_ = s;
      return s;
    }
  }
  /**
   * <code>string url_path = 2 [json_name = "urlPath"];</code>
   * @return The bytes for urlPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlPathBytes() {
    java.lang.Object ref = urlPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      urlPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GS_PATH_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object gsPath_ = "";
  /**
   * <code>string gs_path = 3 [json_name = "gsPath"];</code>
   * @return The gsPath.
   */
  @java.lang.Override
  public java.lang.String getGsPath() {
    java.lang.Object ref = gsPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gsPath_ = s;
      return s;
    }
  }
  /**
   * <code>string gs_path = 3 [json_name = "gsPath"];</code>
   * @return The bytes for gsPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGsPathBytes() {
    java.lang.Object ref = gsPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gsPath_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailMessageReplyAttachmentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, emailMessageReplyAttachmentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(urlPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, urlPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gsPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gsPath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailMessageReplyAttachmentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, emailMessageReplyAttachmentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(urlPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, urlPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gsPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gsPath_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes other = (com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes) obj;

    if (!getEmailMessageReplyAttachmentId()
        .equals(other.getEmailMessageReplyAttachmentId())) return false;
    if (!getUrlPath()
        .equals(other.getUrlPath())) return false;
    if (!getGsPath()
        .equals(other.getGsPath())) return false;
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
    hash = (37 * hash) + EMAIL_MESSAGE_REPLY_ATTACHMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEmailMessageReplyAttachmentId().hashCode();
    hash = (37 * hash) + URL_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getUrlPath().hashCode();
    hash = (37 * hash) + GS_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getGsPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes)
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAgentReplyAttachmentRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAgentReplyAttachmentRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes.class, com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes.newBuilder()
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
      emailMessageReplyAttachmentId_ = "";
      urlPath_ = "";
      gsPath_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAgentReplyAttachmentRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes build() {
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes result = new com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emailMessageReplyAttachmentId_ = emailMessageReplyAttachmentId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.urlPath_ = urlPath_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.gsPath_ = gsPath_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes.getDefaultInstance()) return this;
      if (!other.getEmailMessageReplyAttachmentId().isEmpty()) {
        emailMessageReplyAttachmentId_ = other.emailMessageReplyAttachmentId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUrlPath().isEmpty()) {
        urlPath_ = other.urlPath_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getGsPath().isEmpty()) {
        gsPath_ = other.gsPath_;
        bitField0_ |= 0x00000004;
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
              emailMessageReplyAttachmentId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              urlPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              gsPath_ = input.readStringRequireUtf8();
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

    private java.lang.Object emailMessageReplyAttachmentId_ = "";
    /**
     * <code>string email_message_reply_attachment_id = 1 [json_name = "emailMessageReplyAttachmentId"];</code>
     * @return The emailMessageReplyAttachmentId.
     */
    public java.lang.String getEmailMessageReplyAttachmentId() {
      java.lang.Object ref = emailMessageReplyAttachmentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailMessageReplyAttachmentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email_message_reply_attachment_id = 1 [json_name = "emailMessageReplyAttachmentId"];</code>
     * @return The bytes for emailMessageReplyAttachmentId.
     */
    public com.google.protobuf.ByteString
        getEmailMessageReplyAttachmentIdBytes() {
      java.lang.Object ref = emailMessageReplyAttachmentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailMessageReplyAttachmentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email_message_reply_attachment_id = 1 [json_name = "emailMessageReplyAttachmentId"];</code>
     * @param value The emailMessageReplyAttachmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEmailMessageReplyAttachmentId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      emailMessageReplyAttachmentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string email_message_reply_attachment_id = 1 [json_name = "emailMessageReplyAttachmentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailMessageReplyAttachmentId() {
      emailMessageReplyAttachmentId_ = getDefaultInstance().getEmailMessageReplyAttachmentId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string email_message_reply_attachment_id = 1 [json_name = "emailMessageReplyAttachmentId"];</code>
     * @param value The bytes for emailMessageReplyAttachmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEmailMessageReplyAttachmentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      emailMessageReplyAttachmentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object urlPath_ = "";
    /**
     * <code>string url_path = 2 [json_name = "urlPath"];</code>
     * @return The urlPath.
     */
    public java.lang.String getUrlPath() {
      java.lang.Object ref = urlPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        urlPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string url_path = 2 [json_name = "urlPath"];</code>
     * @return The bytes for urlPath.
     */
    public com.google.protobuf.ByteString
        getUrlPathBytes() {
      java.lang.Object ref = urlPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        urlPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string url_path = 2 [json_name = "urlPath"];</code>
     * @param value The urlPath to set.
     * @return This builder for chaining.
     */
    public Builder setUrlPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      urlPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string url_path = 2 [json_name = "urlPath"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUrlPath() {
      urlPath_ = getDefaultInstance().getUrlPath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string url_path = 2 [json_name = "urlPath"];</code>
     * @param value The bytes for urlPath to set.
     * @return This builder for chaining.
     */
    public Builder setUrlPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      urlPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object gsPath_ = "";
    /**
     * <code>string gs_path = 3 [json_name = "gsPath"];</code>
     * @return The gsPath.
     */
    public java.lang.String getGsPath() {
      java.lang.Object ref = gsPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gsPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gs_path = 3 [json_name = "gsPath"];</code>
     * @return The bytes for gsPath.
     */
    public com.google.protobuf.ByteString
        getGsPathBytes() {
      java.lang.Object ref = gsPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gsPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gs_path = 3 [json_name = "gsPath"];</code>
     * @param value The gsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGsPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      gsPath_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string gs_path = 3 [json_name = "gsPath"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGsPath() {
      gsPath_ = getDefaultInstance().getGsPath();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string gs_path = 3 [json_name = "gsPath"];</code>
     * @param value The bytes for gsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGsPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      gsPath_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes)
  private static final com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEmailMessageAgentReplyAttachmentRes>
      PARSER = new com.google.protobuf.AbstractParser<CreateEmailMessageAgentReplyAttachmentRes>() {
    @java.lang.Override
    public CreateEmailMessageAgentReplyAttachmentRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEmailMessageAgentReplyAttachmentRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEmailMessageAgentReplyAttachmentRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

