// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

/**
 * <pre>
 * Request to get published article by id
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.newsroom.GetPublishedArticleByIdRequest}
 */
public final class GetPublishedArticleByIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.newsroom.GetPublishedArticleByIdRequest)
    GetPublishedArticleByIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPublishedArticleByIdRequest.newBuilder() to construct.
  private GetPublishedArticleByIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPublishedArticleByIdRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPublishedArticleByIdRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_GetPublishedArticleByIdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_GetPublishedArticleByIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.class, com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.Builder.class);
  }

  public static final int NEW_ARTICLE_SID_FIELD_NUMBER = 1;
  private long newArticleSid_ = 0L;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>int64 new_article_sid = 1 [json_name = "newArticleSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.new_article_sid is deprecated.
   *     See api/v1alpha1/newsroom/entities.proto;l=144
   * @return The newArticleSid.
   */
  @java.lang.Override
  @java.lang.Deprecated public long getNewArticleSid() {
    return newArticleSid_;
  }

  public static final int PUBLISHED_ARTICLE_SID_FIELD_NUMBER = 2;
  private long publishedArticleSid_ = 0L;
  /**
   * <pre>
   * the unique published article sid
   * </pre>
   *
   * <code>int64 published_article_sid = 2 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
   * @return The publishedArticleSid.
   */
  @java.lang.Override
  public long getPublishedArticleSid() {
    return publishedArticleSid_;
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
    if (newArticleSid_ != 0L) {
      output.writeInt64(1, newArticleSid_);
    }
    if (publishedArticleSid_ != 0L) {
      output.writeInt64(2, publishedArticleSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (newArticleSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, newArticleSid_);
    }
    if (publishedArticleSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, publishedArticleSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest other = (com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest) obj;

    if (getNewArticleSid()
        != other.getNewArticleSid()) return false;
    if (getPublishedArticleSid()
        != other.getPublishedArticleSid()) return false;
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
    hash = (37 * hash) + NEW_ARTICLE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNewArticleSid());
    hash = (37 * hash) + PUBLISHED_ARTICLE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPublishedArticleSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest prototype) {
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
   * Request to get published article by id
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.newsroom.GetPublishedArticleByIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.newsroom.GetPublishedArticleByIdRequest)
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_GetPublishedArticleByIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_GetPublishedArticleByIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.class, com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.newBuilder()
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
      newArticleSid_ = 0L;
      publishedArticleSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.EntitiesProto.internal_static_api_v1alpha1_newsroom_GetPublishedArticleByIdRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest build() {
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest result = new com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.newArticleSid_ = newArticleSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.publishedArticleSid_ = publishedArticleSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.getDefaultInstance()) return this;
      if (other.getNewArticleSid() != 0L) {
        setNewArticleSid(other.getNewArticleSid());
      }
      if (other.getPublishedArticleSid() != 0L) {
        setPublishedArticleSid(other.getPublishedArticleSid());
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
              newArticleSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              publishedArticleSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long newArticleSid_ ;
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>int64 new_article_sid = 1 [json_name = "newArticleSid", deprecated = true];</code>
     * @deprecated api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.new_article_sid is deprecated.
     *     See api/v1alpha1/newsroom/entities.proto;l=144
     * @return The newArticleSid.
     */
    @java.lang.Override
    @java.lang.Deprecated public long getNewArticleSid() {
      return newArticleSid_;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>int64 new_article_sid = 1 [json_name = "newArticleSid", deprecated = true];</code>
     * @deprecated api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.new_article_sid is deprecated.
     *     See api/v1alpha1/newsroom/entities.proto;l=144
     * @param value The newArticleSid to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setNewArticleSid(long value) {

      newArticleSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>int64 new_article_sid = 1 [json_name = "newArticleSid", deprecated = true];</code>
     * @deprecated api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.new_article_sid is deprecated.
     *     See api/v1alpha1/newsroom/entities.proto;l=144
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearNewArticleSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      newArticleSid_ = 0L;
      onChanged();
      return this;
    }

    private long publishedArticleSid_ ;
    /**
     * <pre>
     * the unique published article sid
     * </pre>
     *
     * <code>int64 published_article_sid = 2 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
     * @return The publishedArticleSid.
     */
    @java.lang.Override
    public long getPublishedArticleSid() {
      return publishedArticleSid_;
    }
    /**
     * <pre>
     * the unique published article sid
     * </pre>
     *
     * <code>int64 published_article_sid = 2 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
     * @param value The publishedArticleSid to set.
     * @return This builder for chaining.
     */
    public Builder setPublishedArticleSid(long value) {

      publishedArticleSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the unique published article sid
     * </pre>
     *
     * <code>int64 published_article_sid = 2 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearPublishedArticleSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      publishedArticleSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.newsroom.GetPublishedArticleByIdRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.newsroom.GetPublishedArticleByIdRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPublishedArticleByIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPublishedArticleByIdRequest>() {
    @java.lang.Override
    public GetPublishedArticleByIdRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPublishedArticleByIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPublishedArticleByIdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.newsroom.GetPublishedArticleByIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

