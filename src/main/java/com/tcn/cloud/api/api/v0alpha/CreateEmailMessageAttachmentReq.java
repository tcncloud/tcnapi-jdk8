// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 *request for outbound email message attachment
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.CreateEmailMessageAttachmentReq}
 */
public final class CreateEmailMessageAttachmentReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateEmailMessageAttachmentReq)
    CreateEmailMessageAttachmentReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEmailMessageAttachmentReq.newBuilder() to construct.
  private CreateEmailMessageAttachmentReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEmailMessageAttachmentReq() {
    fileName_ = "";
    contentType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEmailMessageAttachmentReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAttachmentReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAttachmentReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq.class, com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq.Builder.class);
  }

  public static final int FILE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fileName_ = "";
  /**
   * <pre>
   * attachment file name
   * </pre>
   *
   * <code>string file_name = 1 [json_name = "fileName"];</code>
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
   * <pre>
   * attachment file name
   * </pre>
   *
   * <code>string file_name = 1 [json_name = "fileName"];</code>
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

  public static final int FILE_SIZE_FIELD_NUMBER = 2;
  private long fileSize_ = 0L;
  /**
   * <pre>
   * attachment file size
   * </pre>
   *
   * <code>int64 file_size = 2 [json_name = "fileSize"];</code>
   * @return The fileSize.
   */
  @java.lang.Override
  public long getFileSize() {
    return fileSize_;
  }

  public static final int CONTENT_TYPE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contentType_ = "";
  /**
   * <pre>
   * file content type
   * </pre>
   *
   * <code>string content_type = 3 [json_name = "contentType"];</code>
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
   * <pre>
   * file content type
   * </pre>
   *
   * <code>string content_type = 3 [json_name = "contentType"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fileName_);
    }
    if (fileSize_ != 0L) {
      output.writeInt64(2, fileSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, contentType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fileName_);
    }
    if (fileSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, fileSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, contentType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq other = (com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq) obj;

    if (!getFileName()
        .equals(other.getFileName())) return false;
    if (getFileSize()
        != other.getFileSize()) return false;
    if (!getContentType()
        .equals(other.getContentType())) return false;
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
    hash = (37 * hash) + FILE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (37 * hash) + FILE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFileSize());
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq prototype) {
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
   *request for outbound email message attachment
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.CreateEmailMessageAttachmentReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateEmailMessageAttachmentReq)
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAttachmentReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAttachmentReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq.class, com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq.newBuilder()
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
      fileName_ = "";
      fileSize_ = 0L;
      contentType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_CreateEmailMessageAttachmentReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq result = new com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fileName_ = fileName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fileSize_ = fileSize_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.contentType_ = contentType_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq.getDefaultInstance()) return this;
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFileSize() != 0L) {
        setFileSize(other.getFileSize());
      }
      if (!other.getContentType().isEmpty()) {
        contentType_ = other.contentType_;
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
              fileName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              fileSize_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              contentType_ = input.readStringRequireUtf8();
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

    private java.lang.Object fileName_ = "";
    /**
     * <pre>
     * attachment file name
     * </pre>
     *
     * <code>string file_name = 1 [json_name = "fileName"];</code>
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
     * <pre>
     * attachment file name
     * </pre>
     *
     * <code>string file_name = 1 [json_name = "fileName"];</code>
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
     * <pre>
     * attachment file name
     * </pre>
     *
     * <code>string file_name = 1 [json_name = "fileName"];</code>
     * @param value The fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fileName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * attachment file name
     * </pre>
     *
     * <code>string file_name = 1 [json_name = "fileName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFileName() {
      fileName_ = getDefaultInstance().getFileName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * attachment file name
     * </pre>
     *
     * <code>string file_name = 1 [json_name = "fileName"];</code>
     * @param value The bytes for fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fileName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long fileSize_ ;
    /**
     * <pre>
     * attachment file size
     * </pre>
     *
     * <code>int64 file_size = 2 [json_name = "fileSize"];</code>
     * @return The fileSize.
     */
    @java.lang.Override
    public long getFileSize() {
      return fileSize_;
    }
    /**
     * <pre>
     * attachment file size
     * </pre>
     *
     * <code>int64 file_size = 2 [json_name = "fileSize"];</code>
     * @param value The fileSize to set.
     * @return This builder for chaining.
     */
    public Builder setFileSize(long value) {

      fileSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * attachment file size
     * </pre>
     *
     * <code>int64 file_size = 2 [json_name = "fileSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFileSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fileSize_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object contentType_ = "";
    /**
     * <pre>
     * file content type
     * </pre>
     *
     * <code>string content_type = 3 [json_name = "contentType"];</code>
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
     * <pre>
     * file content type
     * </pre>
     *
     * <code>string content_type = 3 [json_name = "contentType"];</code>
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
     * <pre>
     * file content type
     * </pre>
     *
     * <code>string content_type = 3 [json_name = "contentType"];</code>
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contentType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * file content type
     * </pre>
     *
     * <code>string content_type = 3 [json_name = "contentType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      contentType_ = getDefaultInstance().getContentType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * file content type
     * </pre>
     *
     * <code>string content_type = 3 [json_name = "contentType"];</code>
     * @param value The bytes for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contentType_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateEmailMessageAttachmentReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateEmailMessageAttachmentReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEmailMessageAttachmentReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateEmailMessageAttachmentReq>() {
    @java.lang.Override
    public CreateEmailMessageAttachmentReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEmailMessageAttachmentReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEmailMessageAttachmentReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

