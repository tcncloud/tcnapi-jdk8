// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

/**
 * <pre>
 * published article details
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.newsroom.PublishedArticleDetails}
 */
public final class PublishedArticleDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.newsroom.PublishedArticleDetails)
    PublishedArticleDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublishedArticleDetails.newBuilder() to construct.
  private PublishedArticleDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublishedArticleDetails() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublishedArticleDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_PublishedArticleDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_PublishedArticleDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails.class, com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails.Builder.class);
  }

  public static final int PUBLISHED_ARTICLE_SID_FIELD_NUMBER = 1;
  private long publishedArticleSid_ = 0L;
  /**
   * <pre>
   * the unique published article identifier
   * </pre>
   *
   * <code>int64 published_article_sid = 1 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
   * @return The publishedArticleSid.
   */
  @java.lang.Override
  public long getPublishedArticleSid() {
    return publishedArticleSid_;
  }

  public static final int NEWS_ARTICLE_DETAILS_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails newsArticleDetails_;
  /**
   * <pre>
   * news article details
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
   * @return Whether the newsArticleDetails field is set.
   */
  @java.lang.Override
  public boolean hasNewsArticleDetails() {
    return newsArticleDetails_ != null;
  }
  /**
   * <pre>
   * news article details
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
   * @return The newsArticleDetails.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails getNewsArticleDetails() {
    return newsArticleDetails_ == null ? com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.getDefaultInstance() : newsArticleDetails_;
  }
  /**
   * <pre>
   * news article details
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetailsOrBuilder getNewsArticleDetailsOrBuilder() {
    return newsArticleDetails_ == null ? com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.getDefaultInstance() : newsArticleDetails_;
  }

  public static final int DATE_PUBLISHED_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp datePublished_;
  /**
   * <pre>
   * news article published date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
   * @return Whether the datePublished field is set.
   */
  @java.lang.Override
  public boolean hasDatePublished() {
    return datePublished_ != null;
  }
  /**
   * <pre>
   * news article published date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
   * @return The datePublished.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDatePublished() {
    return datePublished_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : datePublished_;
  }
  /**
   * <pre>
   * news article published date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDatePublishedOrBuilder() {
    return datePublished_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : datePublished_;
  }

  public static final int DISPLAY_TO_USER_FIELD_NUMBER = 4;
  private boolean displayToUser_ = false;
  /**
   * <pre>
   * this flag determines if we show to user or not
   * </pre>
   *
   * <code>bool display_to_user = 4 [json_name = "displayToUser"];</code>
   * @return The displayToUser.
   */
  @java.lang.Override
  public boolean getDisplayToUser() {
    return displayToUser_;
  }

  public static final int ALWAYS_DISPLAY_FIELD_NUMBER = 5;
  private boolean alwaysDisplay_ = false;
  /**
   * <pre>
   * this flag determines if we show to the user every time
   * they log in (for compliance for example)
   * </pre>
   *
   * <code>bool always_display = 5 [json_name = "alwaysDisplay"];</code>
   * @return The alwaysDisplay.
   */
  @java.lang.Override
  public boolean getAlwaysDisplay() {
    return alwaysDisplay_;
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
    if (publishedArticleSid_ != 0L) {
      output.writeInt64(1, publishedArticleSid_);
    }
    if (newsArticleDetails_ != null) {
      output.writeMessage(2, getNewsArticleDetails());
    }
    if (datePublished_ != null) {
      output.writeMessage(3, getDatePublished());
    }
    if (displayToUser_ != false) {
      output.writeBool(4, displayToUser_);
    }
    if (alwaysDisplay_ != false) {
      output.writeBool(5, alwaysDisplay_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (publishedArticleSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, publishedArticleSid_);
    }
    if (newsArticleDetails_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNewsArticleDetails());
    }
    if (datePublished_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDatePublished());
    }
    if (displayToUser_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, displayToUser_);
    }
    if (alwaysDisplay_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, alwaysDisplay_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails other = (com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails) obj;

    if (getPublishedArticleSid()
        != other.getPublishedArticleSid()) return false;
    if (hasNewsArticleDetails() != other.hasNewsArticleDetails()) return false;
    if (hasNewsArticleDetails()) {
      if (!getNewsArticleDetails()
          .equals(other.getNewsArticleDetails())) return false;
    }
    if (hasDatePublished() != other.hasDatePublished()) return false;
    if (hasDatePublished()) {
      if (!getDatePublished()
          .equals(other.getDatePublished())) return false;
    }
    if (getDisplayToUser()
        != other.getDisplayToUser()) return false;
    if (getAlwaysDisplay()
        != other.getAlwaysDisplay()) return false;
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
    hash = (37 * hash) + PUBLISHED_ARTICLE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPublishedArticleSid());
    if (hasNewsArticleDetails()) {
      hash = (37 * hash) + NEWS_ARTICLE_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getNewsArticleDetails().hashCode();
    }
    if (hasDatePublished()) {
      hash = (37 * hash) + DATE_PUBLISHED_FIELD_NUMBER;
      hash = (53 * hash) + getDatePublished().hashCode();
    }
    hash = (37 * hash) + DISPLAY_TO_USER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisplayToUser());
    hash = (37 * hash) + ALWAYS_DISPLAY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAlwaysDisplay());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails prototype) {
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
   * published article details
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.newsroom.PublishedArticleDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.newsroom.PublishedArticleDetails)
      com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_PublishedArticleDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_PublishedArticleDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails.class, com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails.newBuilder()
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
      publishedArticleSid_ = 0L;
      newsArticleDetails_ = null;
      if (newsArticleDetailsBuilder_ != null) {
        newsArticleDetailsBuilder_.dispose();
        newsArticleDetailsBuilder_ = null;
      }
      datePublished_ = null;
      if (datePublishedBuilder_ != null) {
        datePublishedBuilder_.dispose();
        datePublishedBuilder_ = null;
      }
      displayToUser_ = false;
      alwaysDisplay_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_PublishedArticleDetails_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails build() {
      com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails result = new com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.publishedArticleSid_ = publishedArticleSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.newsArticleDetails_ = newsArticleDetailsBuilder_ == null
            ? newsArticleDetails_
            : newsArticleDetailsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.datePublished_ = datePublishedBuilder_ == null
            ? datePublished_
            : datePublishedBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.displayToUser_ = displayToUser_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.alwaysDisplay_ = alwaysDisplay_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails.getDefaultInstance()) return this;
      if (other.getPublishedArticleSid() != 0L) {
        setPublishedArticleSid(other.getPublishedArticleSid());
      }
      if (other.hasNewsArticleDetails()) {
        mergeNewsArticleDetails(other.getNewsArticleDetails());
      }
      if (other.hasDatePublished()) {
        mergeDatePublished(other.getDatePublished());
      }
      if (other.getDisplayToUser() != false) {
        setDisplayToUser(other.getDisplayToUser());
      }
      if (other.getAlwaysDisplay() != false) {
        setAlwaysDisplay(other.getAlwaysDisplay());
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
            case 8: {
              publishedArticleSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getNewsArticleDetailsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDatePublishedFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              displayToUser_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              alwaysDisplay_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private long publishedArticleSid_ ;
    /**
     * <pre>
     * the unique published article identifier
     * </pre>
     *
     * <code>int64 published_article_sid = 1 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
     * @return The publishedArticleSid.
     */
    @java.lang.Override
    public long getPublishedArticleSid() {
      return publishedArticleSid_;
    }
    /**
     * <pre>
     * the unique published article identifier
     * </pre>
     *
     * <code>int64 published_article_sid = 1 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
     * @param value The publishedArticleSid to set.
     * @return This builder for chaining.
     */
    public Builder setPublishedArticleSid(long value) {

      publishedArticleSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the unique published article identifier
     * </pre>
     *
     * <code>int64 published_article_sid = 1 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearPublishedArticleSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      publishedArticleSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails newsArticleDetails_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails, com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.Builder, com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetailsOrBuilder> newsArticleDetailsBuilder_;
    /**
     * <pre>
     * news article details
     * </pre>
     *
     * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
     * @return Whether the newsArticleDetails field is set.
     */
    public boolean hasNewsArticleDetails() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * news article details
     * </pre>
     *
     * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
     * @return The newsArticleDetails.
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails getNewsArticleDetails() {
      if (newsArticleDetailsBuilder_ == null) {
        return newsArticleDetails_ == null ? com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.getDefaultInstance() : newsArticleDetails_;
      } else {
        return newsArticleDetailsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * news article details
     * </pre>
     *
     * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
     */
    public Builder setNewsArticleDetails(com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails value) {
      if (newsArticleDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newsArticleDetails_ = value;
      } else {
        newsArticleDetailsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * news article details
     * </pre>
     *
     * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
     */
    public Builder setNewsArticleDetails(
        com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.Builder builderForValue) {
      if (newsArticleDetailsBuilder_ == null) {
        newsArticleDetails_ = builderForValue.build();
      } else {
        newsArticleDetailsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * news article details
     * </pre>
     *
     * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
     */
    public Builder mergeNewsArticleDetails(com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails value) {
      if (newsArticleDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          newsArticleDetails_ != null &&
          newsArticleDetails_ != com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.getDefaultInstance()) {
          getNewsArticleDetailsBuilder().mergeFrom(value);
        } else {
          newsArticleDetails_ = value;
        }
      } else {
        newsArticleDetailsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * news article details
     * </pre>
     *
     * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
     */
    public Builder clearNewsArticleDetails() {
      bitField0_ = (bitField0_ & ~0x00000002);
      newsArticleDetails_ = null;
      if (newsArticleDetailsBuilder_ != null) {
        newsArticleDetailsBuilder_.dispose();
        newsArticleDetailsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * news article details
     * </pre>
     *
     * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.Builder getNewsArticleDetailsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getNewsArticleDetailsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * news article details
     * </pre>
     *
     * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetailsOrBuilder getNewsArticleDetailsOrBuilder() {
      if (newsArticleDetailsBuilder_ != null) {
        return newsArticleDetailsBuilder_.getMessageOrBuilder();
      } else {
        return newsArticleDetails_ == null ?
            com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.getDefaultInstance() : newsArticleDetails_;
      }
    }
    /**
     * <pre>
     * news article details
     * </pre>
     *
     * <code>.api.v1alpha1.newsroom.NewsArticleDetails news_article_details = 2 [json_name = "newsArticleDetails"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails, com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.Builder, com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetailsOrBuilder> 
        getNewsArticleDetailsFieldBuilder() {
      if (newsArticleDetailsBuilder_ == null) {
        newsArticleDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails, com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails.Builder, com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetailsOrBuilder>(
                getNewsArticleDetails(),
                getParentForChildren(),
                isClean());
        newsArticleDetails_ = null;
      }
      return newsArticleDetailsBuilder_;
    }

    private com.google.protobuf.Timestamp datePublished_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> datePublishedBuilder_;
    /**
     * <pre>
     * news article published date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
     * @return Whether the datePublished field is set.
     */
    public boolean hasDatePublished() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * news article published date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
     * @return The datePublished.
     */
    public com.google.protobuf.Timestamp getDatePublished() {
      if (datePublishedBuilder_ == null) {
        return datePublished_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : datePublished_;
      } else {
        return datePublishedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * news article published date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
     */
    public Builder setDatePublished(com.google.protobuf.Timestamp value) {
      if (datePublishedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        datePublished_ = value;
      } else {
        datePublishedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * news article published date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
     */
    public Builder setDatePublished(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (datePublishedBuilder_ == null) {
        datePublished_ = builderForValue.build();
      } else {
        datePublishedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * news article published date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
     */
    public Builder mergeDatePublished(com.google.protobuf.Timestamp value) {
      if (datePublishedBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          datePublished_ != null &&
          datePublished_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getDatePublishedBuilder().mergeFrom(value);
        } else {
          datePublished_ = value;
        }
      } else {
        datePublishedBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * news article published date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
     */
    public Builder clearDatePublished() {
      bitField0_ = (bitField0_ & ~0x00000004);
      datePublished_ = null;
      if (datePublishedBuilder_ != null) {
        datePublishedBuilder_.dispose();
        datePublishedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * news article published date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getDatePublishedBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDatePublishedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * news article published date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDatePublishedOrBuilder() {
      if (datePublishedBuilder_ != null) {
        return datePublishedBuilder_.getMessageOrBuilder();
      } else {
        return datePublished_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : datePublished_;
      }
    }
    /**
     * <pre>
     * news article published date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_published = 3 [json_name = "datePublished"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDatePublishedFieldBuilder() {
      if (datePublishedBuilder_ == null) {
        datePublishedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDatePublished(),
                getParentForChildren(),
                isClean());
        datePublished_ = null;
      }
      return datePublishedBuilder_;
    }

    private boolean displayToUser_ ;
    /**
     * <pre>
     * this flag determines if we show to user or not
     * </pre>
     *
     * <code>bool display_to_user = 4 [json_name = "displayToUser"];</code>
     * @return The displayToUser.
     */
    @java.lang.Override
    public boolean getDisplayToUser() {
      return displayToUser_;
    }
    /**
     * <pre>
     * this flag determines if we show to user or not
     * </pre>
     *
     * <code>bool display_to_user = 4 [json_name = "displayToUser"];</code>
     * @param value The displayToUser to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayToUser(boolean value) {

      displayToUser_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * this flag determines if we show to user or not
     * </pre>
     *
     * <code>bool display_to_user = 4 [json_name = "displayToUser"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayToUser() {
      bitField0_ = (bitField0_ & ~0x00000008);
      displayToUser_ = false;
      onChanged();
      return this;
    }

    private boolean alwaysDisplay_ ;
    /**
     * <pre>
     * this flag determines if we show to the user every time
     * they log in (for compliance for example)
     * </pre>
     *
     * <code>bool always_display = 5 [json_name = "alwaysDisplay"];</code>
     * @return The alwaysDisplay.
     */
    @java.lang.Override
    public boolean getAlwaysDisplay() {
      return alwaysDisplay_;
    }
    /**
     * <pre>
     * this flag determines if we show to the user every time
     * they log in (for compliance for example)
     * </pre>
     *
     * <code>bool always_display = 5 [json_name = "alwaysDisplay"];</code>
     * @param value The alwaysDisplay to set.
     * @return This builder for chaining.
     */
    public Builder setAlwaysDisplay(boolean value) {

      alwaysDisplay_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * this flag determines if we show to the user every time
     * they log in (for compliance for example)
     * </pre>
     *
     * <code>bool always_display = 5 [json_name = "alwaysDisplay"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAlwaysDisplay() {
      bitField0_ = (bitField0_ & ~0x00000010);
      alwaysDisplay_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.newsroom.PublishedArticleDetails)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.newsroom.PublishedArticleDetails)
  private static final com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails();
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishedArticleDetails>
      PARSER = new com.google.protobuf.AbstractParser<PublishedArticleDetails>() {
    @java.lang.Override
    public PublishedArticleDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublishedArticleDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishedArticleDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

