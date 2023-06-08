// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * request to export multiple pages of the learning center markdown to PDF
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ExportManyReq}
 */
public final class ExportManyReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ExportManyReq)
    ExportManyReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportManyReq.newBuilder() to construct.
  private ExportManyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportManyReq() {
    url_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    locale_ = "";
    content_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportManyReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ExportManyReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ExportManyReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ExportManyReq.class, com.tcn.cloud.api.api.v0alpha.ExportManyReq.Builder.class);
  }

  public static final int URL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList url_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * url identifiers for the whole book containing all the pages
   * </pre>
   *
   * <code>repeated string url = 1 [json_name = "url"];</code>
   * @return A list containing the url.
   */
  public com.google.protobuf.ProtocolStringList
      getUrlList() {
    return url_;
  }
  /**
   * <pre>
   * url identifiers for the whole book containing all the pages
   * </pre>
   *
   * <code>repeated string url = 1 [json_name = "url"];</code>
   * @return The count of url.
   */
  public int getUrlCount() {
    return url_.size();
  }
  /**
   * <pre>
   * url identifiers for the whole book containing all the pages
   * </pre>
   *
   * <code>repeated string url = 1 [json_name = "url"];</code>
   * @param index The index of the element to return.
   * @return The url at the given index.
   */
  public java.lang.String getUrl(int index) {
    return url_.get(index);
  }
  /**
   * <pre>
   * url identifiers for the whole book containing all the pages
   * </pre>
   *
   * <code>repeated string url = 1 [json_name = "url"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the url at the given index.
   */
  public com.google.protobuf.ByteString
      getUrlBytes(int index) {
    return url_.getByteString(index);
  }

  public static final int LOCALE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object locale_ = "";
  /**
   * <pre>
   * locale used for the markdown contents
   * </pre>
   *
   * <code>string locale = 2 [json_name = "locale"];</code>
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
   * <code>string locale = 2 [json_name = "locale"];</code>
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

  public static final int CONTENT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object content_ = "";
  /**
   * <pre>
   * header image content
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
   * header image content
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
    for (int i = 0; i < url_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locale_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, locale_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < url_.size(); i++) {
        dataSize += computeStringSizeNoTag(url_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUrlList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locale_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, locale_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, content_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ExportManyReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ExportManyReq other = (com.tcn.cloud.api.api.v0alpha.ExportManyReq) obj;

    if (!getUrlList()
        .equals(other.getUrlList())) return false;
    if (!getLocale()
        .equals(other.getLocale())) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
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
    if (getUrlCount() > 0) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrlList().hashCode();
    }
    hash = (37 * hash) + LOCALE_FIELD_NUMBER;
    hash = (53 * hash) + getLocale().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ExportManyReq prototype) {
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
   * request to export multiple pages of the learning center markdown to PDF
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ExportManyReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ExportManyReq)
      com.tcn.cloud.api.api.v0alpha.ExportManyReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ExportManyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ExportManyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ExportManyReq.class, com.tcn.cloud.api.api.v0alpha.ExportManyReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ExportManyReq.newBuilder()
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
      url_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      locale_ = "";
      content_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ExportManyReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ExportManyReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ExportManyReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ExportManyReq build() {
      com.tcn.cloud.api.api.v0alpha.ExportManyReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ExportManyReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ExportManyReq result = new com.tcn.cloud.api.api.v0alpha.ExportManyReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ExportManyReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        url_.makeImmutable();
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.locale_ = locale_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.content_ = content_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ExportManyReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ExportManyReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ExportManyReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ExportManyReq.getDefaultInstance()) return this;
      if (!other.url_.isEmpty()) {
        if (url_.isEmpty()) {
          url_ = other.url_;
          bitField0_ |= 0x00000001;
        } else {
          ensureUrlIsMutable();
          url_.addAll(other.url_);
        }
        onChanged();
      }
      if (!other.getLocale().isEmpty()) {
        locale_ = other.locale_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureUrlIsMutable();
              url_.add(s);
              break;
            } // case 10
            case 18: {
              locale_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              content_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.LazyStringArrayList url_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUrlIsMutable() {
      if (!url_.isModifiable()) {
        url_ = new com.google.protobuf.LazyStringArrayList(url_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * url identifiers for the whole book containing all the pages
     * </pre>
     *
     * <code>repeated string url = 1 [json_name = "url"];</code>
     * @return A list containing the url.
     */
    public com.google.protobuf.ProtocolStringList
        getUrlList() {
      url_.makeImmutable();
      return url_;
    }
    /**
     * <pre>
     * url identifiers for the whole book containing all the pages
     * </pre>
     *
     * <code>repeated string url = 1 [json_name = "url"];</code>
     * @return The count of url.
     */
    public int getUrlCount() {
      return url_.size();
    }
    /**
     * <pre>
     * url identifiers for the whole book containing all the pages
     * </pre>
     *
     * <code>repeated string url = 1 [json_name = "url"];</code>
     * @param index The index of the element to return.
     * @return The url at the given index.
     */
    public java.lang.String getUrl(int index) {
      return url_.get(index);
    }
    /**
     * <pre>
     * url identifiers for the whole book containing all the pages
     * </pre>
     *
     * <code>repeated string url = 1 [json_name = "url"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the url at the given index.
     */
    public com.google.protobuf.ByteString
        getUrlBytes(int index) {
      return url_.getByteString(index);
    }
    /**
     * <pre>
     * url identifiers for the whole book containing all the pages
     * </pre>
     *
     * <code>repeated string url = 1 [json_name = "url"];</code>
     * @param index The index to set the value at.
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUrlIsMutable();
      url_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * url identifiers for the whole book containing all the pages
     * </pre>
     *
     * <code>repeated string url = 1 [json_name = "url"];</code>
     * @param value The url to add.
     * @return This builder for chaining.
     */
    public Builder addUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUrlIsMutable();
      url_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * url identifiers for the whole book containing all the pages
     * </pre>
     *
     * <code>repeated string url = 1 [json_name = "url"];</code>
     * @param values The url to add.
     * @return This builder for chaining.
     */
    public Builder addAllUrl(
        java.lang.Iterable<java.lang.String> values) {
      ensureUrlIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, url_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * url identifiers for the whole book containing all the pages
     * </pre>
     *
     * <code>repeated string url = 1 [json_name = "url"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * url identifiers for the whole book containing all the pages
     * </pre>
     *
     * <code>repeated string url = 1 [json_name = "url"];</code>
     * @param value The bytes of the url to add.
     * @return This builder for chaining.
     */
    public Builder addUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUrlIsMutable();
      url_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object locale_ = "";
    /**
     * <pre>
     * locale used for the markdown contents
     * </pre>
     *
     * <code>string locale = 2 [json_name = "locale"];</code>
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
     * <code>string locale = 2 [json_name = "locale"];</code>
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
     * <code>string locale = 2 [json_name = "locale"];</code>
     * @param value The locale to set.
     * @return This builder for chaining.
     */
    public Builder setLocale(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      locale_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * locale used for the markdown contents
     * </pre>
     *
     * <code>string locale = 2 [json_name = "locale"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocale() {
      locale_ = getDefaultInstance().getLocale();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * locale used for the markdown contents
     * </pre>
     *
     * <code>string locale = 2 [json_name = "locale"];</code>
     * @param value The bytes for locale to set.
     * @return This builder for chaining.
     */
    public Builder setLocaleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      locale_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <pre>
     * header image content
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
     * header image content
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
     * header image content
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
     * header image content
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
     * header image content
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ExportManyReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ExportManyReq)
  private static final com.tcn.cloud.api.api.v0alpha.ExportManyReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ExportManyReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.ExportManyReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportManyReq>
      PARSER = new com.google.protobuf.AbstractParser<ExportManyReq>() {
    @java.lang.Override
    public ExportManyReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportManyReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportManyReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ExportManyReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

