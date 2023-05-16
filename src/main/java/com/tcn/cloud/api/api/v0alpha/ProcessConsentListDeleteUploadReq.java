// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ProcessConsentListDeleteUploadReq}
 */
public final class ProcessConsentListDeleteUploadReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ProcessConsentListDeleteUploadReq)
    ProcessConsentListDeleteUploadReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProcessConsentListDeleteUploadReq.newBuilder() to construct.
  private ProcessConsentListDeleteUploadReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProcessConsentListDeleteUploadReq() {
    consentProfileId_ = "";
    filename_ = "";
    notificationMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProcessConsentListDeleteUploadReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ProcessConsentListDeleteUploadReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ProcessConsentListDeleteUploadReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq.class, com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq.Builder.class);
  }

  public static final int CONSENT_PROFILE_ID_FIELD_NUMBER = 10;
  @SuppressWarnings("serial")
  private volatile java.lang.Object consentProfileId_ = "";
  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>string consent_profile_id = 10 [json_name = "consentProfileId"];</code>
   * @return The consentProfileId.
   */
  @java.lang.Override
  public java.lang.String getConsentProfileId() {
    java.lang.Object ref = consentProfileId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      consentProfileId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>string consent_profile_id = 10 [json_name = "consentProfileId"];</code>
   * @return The bytes for consentProfileId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConsentProfileIdBytes() {
    java.lang.Object ref = consentProfileId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      consentProfileId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILENAME_FIELD_NUMBER = 11;
  @SuppressWarnings("serial")
  private volatile java.lang.Object filename_ = "";
  /**
   * <code>string filename = 11 [json_name = "filename"];</code>
   * @return The filename.
   */
  @java.lang.Override
  public java.lang.String getFilename() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filename_ = s;
      return s;
    }
  }
  /**
   * <code>string filename = 11 [json_name = "filename"];</code>
   * @return The bytes for filename.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilenameBytes() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTIFICATION_MESSAGE_FIELD_NUMBER = 12;
  @SuppressWarnings("serial")
  private volatile java.lang.Object notificationMessage_ = "";
  /**
   * <code>string notification_message = 12 [json_name = "notificationMessage"];</code>
   * @return The notificationMessage.
   */
  @java.lang.Override
  public java.lang.String getNotificationMessage() {
    java.lang.Object ref = notificationMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notificationMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string notification_message = 12 [json_name = "notificationMessage"];</code>
   * @return The bytes for notificationMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNotificationMessageBytes() {
    java.lang.Object ref = notificationMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notificationMessage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consentProfileId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, consentProfileId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, filename_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notificationMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 12, notificationMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consentProfileId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, consentProfileId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, filename_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notificationMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, notificationMessage_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq other = (com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq) obj;

    if (!getConsentProfileId()
        .equals(other.getConsentProfileId())) return false;
    if (!getFilename()
        .equals(other.getFilename())) return false;
    if (!getNotificationMessage()
        .equals(other.getNotificationMessage())) return false;
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
    hash = (37 * hash) + CONSENT_PROFILE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConsentProfileId().hashCode();
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFilename().hashCode();
    hash = (37 * hash) + NOTIFICATION_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getNotificationMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq prototype) {
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
   * Protobuf type {@code api.v0alpha.ProcessConsentListDeleteUploadReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ProcessConsentListDeleteUploadReq)
      com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ProcessConsentListDeleteUploadReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ProcessConsentListDeleteUploadReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq.class, com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq.newBuilder()
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
      consentProfileId_ = "";
      filename_ = "";
      notificationMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ProcessConsentListDeleteUploadReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq build() {
      com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq result = new com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.consentProfileId_ = consentProfileId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.filename_ = filename_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.notificationMessage_ = notificationMessage_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq.getDefaultInstance()) return this;
      if (!other.getConsentProfileId().isEmpty()) {
        consentProfileId_ = other.consentProfileId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFilename().isEmpty()) {
        filename_ = other.filename_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNotificationMessage().isEmpty()) {
        notificationMessage_ = other.notificationMessage_;
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
            case 82: {
              consentProfileId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 82
            case 90: {
              filename_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 90
            case 98: {
              notificationMessage_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 98
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

    private java.lang.Object consentProfileId_ = "";
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string consent_profile_id = 10 [json_name = "consentProfileId"];</code>
     * @return The consentProfileId.
     */
    public java.lang.String getConsentProfileId() {
      java.lang.Object ref = consentProfileId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consentProfileId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string consent_profile_id = 10 [json_name = "consentProfileId"];</code>
     * @return The bytes for consentProfileId.
     */
    public com.google.protobuf.ByteString
        getConsentProfileIdBytes() {
      java.lang.Object ref = consentProfileId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        consentProfileId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string consent_profile_id = 10 [json_name = "consentProfileId"];</code>
     * @param value The consentProfileId to set.
     * @return This builder for chaining.
     */
    public Builder setConsentProfileId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      consentProfileId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string consent_profile_id = 10 [json_name = "consentProfileId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConsentProfileId() {
      consentProfileId_ = getDefaultInstance().getConsentProfileId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string consent_profile_id = 10 [json_name = "consentProfileId"];</code>
     * @param value The bytes for consentProfileId to set.
     * @return This builder for chaining.
     */
    public Builder setConsentProfileIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      consentProfileId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object filename_ = "";
    /**
     * <code>string filename = 11 [json_name = "filename"];</code>
     * @return The filename.
     */
    public java.lang.String getFilename() {
      java.lang.Object ref = filename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filename = 11 [json_name = "filename"];</code>
     * @return The bytes for filename.
     */
    public com.google.protobuf.ByteString
        getFilenameBytes() {
      java.lang.Object ref = filename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filename = 11 [json_name = "filename"];</code>
     * @param value The filename to set.
     * @return This builder for chaining.
     */
    public Builder setFilename(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      filename_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string filename = 11 [json_name = "filename"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFilename() {
      filename_ = getDefaultInstance().getFilename();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string filename = 11 [json_name = "filename"];</code>
     * @param value The bytes for filename to set.
     * @return This builder for chaining.
     */
    public Builder setFilenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      filename_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object notificationMessage_ = "";
    /**
     * <code>string notification_message = 12 [json_name = "notificationMessage"];</code>
     * @return The notificationMessage.
     */
    public java.lang.String getNotificationMessage() {
      java.lang.Object ref = notificationMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notificationMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string notification_message = 12 [json_name = "notificationMessage"];</code>
     * @return The bytes for notificationMessage.
     */
    public com.google.protobuf.ByteString
        getNotificationMessageBytes() {
      java.lang.Object ref = notificationMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notificationMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string notification_message = 12 [json_name = "notificationMessage"];</code>
     * @param value The notificationMessage to set.
     * @return This builder for chaining.
     */
    public Builder setNotificationMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      notificationMessage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string notification_message = 12 [json_name = "notificationMessage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotificationMessage() {
      notificationMessage_ = getDefaultInstance().getNotificationMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string notification_message = 12 [json_name = "notificationMessage"];</code>
     * @param value The bytes for notificationMessage to set.
     * @return This builder for chaining.
     */
    public Builder setNotificationMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      notificationMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ProcessConsentListDeleteUploadReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ProcessConsentListDeleteUploadReq)
  private static final com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessConsentListDeleteUploadReq>
      PARSER = new com.google.protobuf.AbstractParser<ProcessConsentListDeleteUploadReq>() {
    @java.lang.Override
    public ProcessConsentListDeleteUploadReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProcessConsentListDeleteUploadReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessConsentListDeleteUploadReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ProcessConsentListDeleteUploadReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

