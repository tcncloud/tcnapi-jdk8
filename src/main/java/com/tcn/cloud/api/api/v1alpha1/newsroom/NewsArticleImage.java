// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

/**
 * <pre>
 * image for the news article details
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.newsroom.NewsArticleImage}
 */
public final class NewsArticleImage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.newsroom.NewsArticleImage)
    NewsArticleImageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NewsArticleImage.newBuilder() to construct.
  private NewsArticleImage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NewsArticleImage() {
    uuid_ = "";
    content_ = "";
    downloadUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NewsArticleImage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_NewsArticleImage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_NewsArticleImage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage.class, com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage.Builder.class);
  }

  public static final int UUID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uuid_ = "";
  /**
   * <pre>
   * unique name of the image
   * </pre>
   *
   * <code>string uuid = 1 [json_name = "uuid"];</code>
   * @return The uuid.
   */
  @java.lang.Override
  public java.lang.String getUuid() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * unique name of the image
   * </pre>
   *
   * <code>string uuid = 1 [json_name = "uuid"];</code>
   * @return The bytes for uuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUuidBytes() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_ARTICLE_SID_FIELD_NUMBER = 2;
  private long newArticleSid_ = 0L;
  /**
   * <pre>
   * image for the new article
   * </pre>
   *
   * <code>int64 new_article_sid = 2 [json_name = "newArticleSid", jstype = JS_STRING];</code>
   * @return The newArticleSid.
   */
  @java.lang.Override
  public long getNewArticleSid() {
    return newArticleSid_;
  }

  public static final int CONTENT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object content_ = "";
  /**
   * <pre>
   * image content
   * </pre>
   *
   * <code>string content = 3 [json_name = "content"];</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * image content
   * </pre>
   *
   * <code>string content = 3 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOWNLOAD_URL_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object downloadUrl_ = "";
  /**
   * <pre>
   * download image url
   * </pre>
   *
   * <code>string download_url = 4 [json_name = "downloadUrl"];</code>
   * @return The downloadUrl.
   */
  @java.lang.Override
  public java.lang.String getDownloadUrl() {
    java.lang.Object ref = downloadUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      downloadUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * download image url
   * </pre>
   *
   * <code>string download_url = 4 [json_name = "downloadUrl"];</code>
   * @return The bytes for downloadUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDownloadUrlBytes() {
    java.lang.Object ref = downloadUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      downloadUrl_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uuid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uuid_);
    }
    if (newArticleSid_ != 0L) {
      output.writeInt64(2, newArticleSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(downloadUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, downloadUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uuid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uuid_);
    }
    if (newArticleSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, newArticleSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, content_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(downloadUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, downloadUrl_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage other = (com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage) obj;

    if (!getUuid()
        .equals(other.getUuid())) return false;
    if (getNewArticleSid()
        != other.getNewArticleSid()) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
    if (!getDownloadUrl()
        .equals(other.getDownloadUrl())) return false;
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
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUuid().hashCode();
    hash = (37 * hash) + NEW_ARTICLE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNewArticleSid());
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + DOWNLOAD_URL_FIELD_NUMBER;
    hash = (53 * hash) + getDownloadUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage prototype) {
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
   * image for the news article details
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.newsroom.NewsArticleImage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.newsroom.NewsArticleImage)
      com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_NewsArticleImage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_NewsArticleImage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage.class, com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage.newBuilder()
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
      uuid_ = "";
      newArticleSid_ = 0L;
      content_ = "";
      downloadUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_NewsArticleImage_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage build() {
      com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage result = new com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uuid_ = uuid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.newArticleSid_ = newArticleSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.content_ = content_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.downloadUrl_ = downloadUrl_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage.getDefaultInstance()) return this;
      if (!other.getUuid().isEmpty()) {
        uuid_ = other.uuid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getNewArticleSid() != 0L) {
        setNewArticleSid(other.getNewArticleSid());
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDownloadUrl().isEmpty()) {
        downloadUrl_ = other.downloadUrl_;
        bitField0_ |= 0x00000008;
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
              uuid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              newArticleSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              content_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              downloadUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
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

    private java.lang.Object uuid_ = "";
    /**
     * <pre>
     * unique name of the image
     * </pre>
     *
     * <code>string uuid = 1 [json_name = "uuid"];</code>
     * @return The uuid.
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * unique name of the image
     * </pre>
     *
     * <code>string uuid = 1 [json_name = "uuid"];</code>
     * @return The bytes for uuid.
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * unique name of the image
     * </pre>
     *
     * <code>string uuid = 1 [json_name = "uuid"];</code>
     * @param value The uuid to set.
     * @return This builder for chaining.
     */
    public Builder setUuid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uuid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique name of the image
     * </pre>
     *
     * <code>string uuid = 1 [json_name = "uuid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUuid() {
      uuid_ = getDefaultInstance().getUuid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique name of the image
     * </pre>
     *
     * <code>string uuid = 1 [json_name = "uuid"];</code>
     * @param value The bytes for uuid to set.
     * @return This builder for chaining.
     */
    public Builder setUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uuid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long newArticleSid_ ;
    /**
     * <pre>
     * image for the new article
     * </pre>
     *
     * <code>int64 new_article_sid = 2 [json_name = "newArticleSid", jstype = JS_STRING];</code>
     * @return The newArticleSid.
     */
    @java.lang.Override
    public long getNewArticleSid() {
      return newArticleSid_;
    }
    /**
     * <pre>
     * image for the new article
     * </pre>
     *
     * <code>int64 new_article_sid = 2 [json_name = "newArticleSid", jstype = JS_STRING];</code>
     * @param value The newArticleSid to set.
     * @return This builder for chaining.
     */
    public Builder setNewArticleSid(long value) {

      newArticleSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * image for the new article
     * </pre>
     *
     * <code>int64 new_article_sid = 2 [json_name = "newArticleSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewArticleSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      newArticleSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <pre>
     * image content
     * </pre>
     *
     * <code>string content = 3 [json_name = "content"];</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * image content
     * </pre>
     *
     * <code>string content = 3 [json_name = "content"];</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * image content
     * </pre>
     *
     * <code>string content = 3 [json_name = "content"];</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      content_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * image content
     * </pre>
     *
     * <code>string content = 3 [json_name = "content"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      content_ = getDefaultInstance().getContent();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * image content
     * </pre>
     *
     * <code>string content = 3 [json_name = "content"];</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      content_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object downloadUrl_ = "";
    /**
     * <pre>
     * download image url
     * </pre>
     *
     * <code>string download_url = 4 [json_name = "downloadUrl"];</code>
     * @return The downloadUrl.
     */
    public java.lang.String getDownloadUrl() {
      java.lang.Object ref = downloadUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        downloadUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * download image url
     * </pre>
     *
     * <code>string download_url = 4 [json_name = "downloadUrl"];</code>
     * @return The bytes for downloadUrl.
     */
    public com.google.protobuf.ByteString
        getDownloadUrlBytes() {
      java.lang.Object ref = downloadUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        downloadUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * download image url
     * </pre>
     *
     * <code>string download_url = 4 [json_name = "downloadUrl"];</code>
     * @param value The downloadUrl to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      downloadUrl_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * download image url
     * </pre>
     *
     * <code>string download_url = 4 [json_name = "downloadUrl"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDownloadUrl() {
      downloadUrl_ = getDefaultInstance().getDownloadUrl();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * download image url
     * </pre>
     *
     * <code>string download_url = 4 [json_name = "downloadUrl"];</code>
     * @param value The bytes for downloadUrl to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      downloadUrl_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.newsroom.NewsArticleImage)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.newsroom.NewsArticleImage)
  private static final com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage();
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NewsArticleImage>
      PARSER = new com.google.protobuf.AbstractParser<NewsArticleImage>() {
    @java.lang.Override
    public NewsArticleImage parsePartialFrom(
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

  public static com.google.protobuf.Parser<NewsArticleImage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NewsArticleImage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
