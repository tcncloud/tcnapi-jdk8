// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * request to delete standalone articles
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.DeleteStandaloneReq}
 */
public final class DeleteStandaloneReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DeleteStandaloneReq)
    DeleteStandaloneReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteStandaloneReq.newBuilder() to construct.
  private DeleteStandaloneReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteStandaloneReq() {
    locale_ = "";
    articleNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteStandaloneReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_DeleteStandaloneReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_DeleteStandaloneReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq.class, com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq.Builder.class);
  }

  public static final int LOCALE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object locale_ = "";
  /**
   * <pre>
   * locale used for the markdown contents
   * </pre>
   *
   * <code>string locale = 1 [json_name = "locale"];</code>
   * @return The locale.
   */
  @java.lang.Override
  public java.lang.String getLocale() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locale_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * locale used for the markdown contents
   * </pre>
   *
   * <code>string locale = 1 [json_name = "locale"];</code>
   * @return The bytes for locale.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocaleBytes() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      locale_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARTICLE_NAMES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList articleNames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * list of article names
   * </pre>
   *
   * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
   * @return A list containing the articleNames.
   */
  public com.google.protobuf.ProtocolStringList
      getArticleNamesList() {
    return articleNames_;
  }
  /**
   * <pre>
   * list of article names
   * </pre>
   *
   * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
   * @return The count of articleNames.
   */
  public int getArticleNamesCount() {
    return articleNames_.size();
  }
  /**
   * <pre>
   * list of article names
   * </pre>
   *
   * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
   * @param index The index of the element to return.
   * @return The articleNames at the given index.
   */
  public java.lang.String getArticleNames(int index) {
    return articleNames_.get(index);
  }
  /**
   * <pre>
   * list of article names
   * </pre>
   *
   * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the articleNames at the given index.
   */
  public com.google.protobuf.ByteString
      getArticleNamesBytes(int index) {
    return articleNames_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locale_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, locale_);
    }
    for (int i = 0; i < articleNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, articleNames_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locale_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, locale_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < articleNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(articleNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getArticleNamesList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq other = (com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq) obj;

    if (!getLocale()
        .equals(other.getLocale())) return false;
    if (!getArticleNamesList()
        .equals(other.getArticleNamesList())) return false;
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
    hash = (37 * hash) + LOCALE_FIELD_NUMBER;
    hash = (53 * hash) + getLocale().hashCode();
    if (getArticleNamesCount() > 0) {
      hash = (37 * hash) + ARTICLE_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getArticleNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq prototype) {
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
   * request to delete standalone articles
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.DeleteStandaloneReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DeleteStandaloneReq)
      com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_DeleteStandaloneReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_DeleteStandaloneReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq.class, com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq.newBuilder()
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
      locale_ = "";
      articleNames_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_DeleteStandaloneReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq build() {
      com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq result = new com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.locale_ = locale_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        articleNames_.makeImmutable();
        result.articleNames_ = articleNames_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq.getDefaultInstance()) return this;
      if (!other.getLocale().isEmpty()) {
        locale_ = other.locale_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.articleNames_.isEmpty()) {
        if (articleNames_.isEmpty()) {
          articleNames_ = other.articleNames_;
          bitField0_ |= 0x00000002;
        } else {
          ensureArticleNamesIsMutable();
          articleNames_.addAll(other.articleNames_);
        }
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
              locale_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureArticleNamesIsMutable();
              articleNames_.add(s);
              break;
            } // case 18
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

    private java.lang.Object locale_ = "";
    /**
     * <pre>
     * locale used for the markdown contents
     * </pre>
     *
     * <code>string locale = 1 [json_name = "locale"];</code>
     * @return The locale.
     */
    public java.lang.String getLocale() {
      java.lang.Object ref = locale_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locale_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * locale used for the markdown contents
     * </pre>
     *
     * <code>string locale = 1 [json_name = "locale"];</code>
     * @return The bytes for locale.
     */
    public com.google.protobuf.ByteString
        getLocaleBytes() {
      java.lang.Object ref = locale_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        locale_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * locale used for the markdown contents
     * </pre>
     *
     * <code>string locale = 1 [json_name = "locale"];</code>
     * @param value The locale to set.
     * @return This builder for chaining.
     */
    public Builder setLocale(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      locale_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * locale used for the markdown contents
     * </pre>
     *
     * <code>string locale = 1 [json_name = "locale"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocale() {
      locale_ = getDefaultInstance().getLocale();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * locale used for the markdown contents
     * </pre>
     *
     * <code>string locale = 1 [json_name = "locale"];</code>
     * @param value The bytes for locale to set.
     * @return This builder for chaining.
     */
    public Builder setLocaleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      locale_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList articleNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureArticleNamesIsMutable() {
      if (!articleNames_.isModifiable()) {
        articleNames_ = new com.google.protobuf.LazyStringArrayList(articleNames_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * list of article names
     * </pre>
     *
     * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
     * @return A list containing the articleNames.
     */
    public com.google.protobuf.ProtocolStringList
        getArticleNamesList() {
      articleNames_.makeImmutable();
      return articleNames_;
    }
    /**
     * <pre>
     * list of article names
     * </pre>
     *
     * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
     * @return The count of articleNames.
     */
    public int getArticleNamesCount() {
      return articleNames_.size();
    }
    /**
     * <pre>
     * list of article names
     * </pre>
     *
     * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
     * @param index The index of the element to return.
     * @return The articleNames at the given index.
     */
    public java.lang.String getArticleNames(int index) {
      return articleNames_.get(index);
    }
    /**
     * <pre>
     * list of article names
     * </pre>
     *
     * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the articleNames at the given index.
     */
    public com.google.protobuf.ByteString
        getArticleNamesBytes(int index) {
      return articleNames_.getByteString(index);
    }
    /**
     * <pre>
     * list of article names
     * </pre>
     *
     * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
     * @param index The index to set the value at.
     * @param value The articleNames to set.
     * @return This builder for chaining.
     */
    public Builder setArticleNames(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureArticleNamesIsMutable();
      articleNames_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of article names
     * </pre>
     *
     * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
     * @param value The articleNames to add.
     * @return This builder for chaining.
     */
    public Builder addArticleNames(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureArticleNamesIsMutable();
      articleNames_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of article names
     * </pre>
     *
     * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
     * @param values The articleNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllArticleNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureArticleNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, articleNames_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of article names
     * </pre>
     *
     * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
     * @return This builder for chaining.
     */
    public Builder clearArticleNames() {
      articleNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of article names
     * </pre>
     *
     * <code>repeated string article_names = 2 [json_name = "articleNames"];</code>
     * @param value The bytes of the articleNames to add.
     * @return This builder for chaining.
     */
    public Builder addArticleNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureArticleNamesIsMutable();
      articleNames_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DeleteStandaloneReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DeleteStandaloneReq)
  private static final com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteStandaloneReq>
      PARSER = new com.google.protobuf.AbstractParser<DeleteStandaloneReq>() {
    @java.lang.Override
    public DeleteStandaloneReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteStandaloneReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteStandaloneReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

