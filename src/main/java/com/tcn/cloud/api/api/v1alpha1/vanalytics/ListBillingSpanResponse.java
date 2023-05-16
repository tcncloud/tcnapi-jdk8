// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/service.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * Protobuf type {@code api.v1alpha1.vanalytics.ListBillingSpanResponse}
 */
public final class ListBillingSpanResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.ListBillingSpanResponse)
    ListBillingSpanResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListBillingSpanResponse.newBuilder() to construct.
  private ListBillingSpanResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListBillingSpanResponse() {
    nextPageToken_ = "";
    spans_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListBillingSpanResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.ServiceProto.internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.ServiceProto.internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse.Builder.class);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of billing spans, or empty if there are no
   * more billing spans in the list.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of billing spans, or empty if there are no
   * more billing spans in the list.
   * </pre>
   *
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPANS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan> spans_;
  /**
   * <pre>
   * List of billing spans which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan> getSpansList() {
    return spans_;
  }
  /**
   * <pre>
   * List of billing spans which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpanOrBuilder> 
      getSpansOrBuilderList() {
    return spans_;
  }
  /**
   * <pre>
   * List of billing spans which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
   */
  @java.lang.Override
  public int getSpansCount() {
    return spans_.size();
  }
  /**
   * <pre>
   * List of billing spans which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan getSpans(int index) {
    return spans_.get(index);
  }
  /**
   * <pre>
   * List of billing spans which contains at most one request page_size.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpanOrBuilder getSpansOrBuilder(
      int index) {
    return spans_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nextPageToken_);
    }
    for (int i = 0; i < spans_.size(); i++) {
      output.writeMessage(2, spans_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nextPageToken_);
    }
    for (int i = 0; i < spans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, spans_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse) obj;

    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!getSpansList()
        .equals(other.getSpansList())) return false;
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
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    if (getSpansCount() > 0) {
      hash = (37 * hash) + SPANS_FIELD_NUMBER;
      hash = (53 * hash) + getSpansList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse prototype) {
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
   * Protobuf type {@code api.v1alpha1.vanalytics.ListBillingSpanResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.ListBillingSpanResponse)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ServiceProto.internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ServiceProto.internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse.newBuilder()
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
      nextPageToken_ = "";
      if (spansBuilder_ == null) {
        spans_ = java.util.Collections.emptyList();
      } else {
        spans_ = null;
        spansBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ServiceProto.internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse result) {
      if (spansBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          spans_ = java.util.Collections.unmodifiableList(spans_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.spans_ = spans_;
      } else {
        result.spans_ = spansBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse.getDefaultInstance()) return this;
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (spansBuilder_ == null) {
        if (!other.spans_.isEmpty()) {
          if (spans_.isEmpty()) {
            spans_ = other.spans_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSpansIsMutable();
            spans_.addAll(other.spans_);
          }
          onChanged();
        }
      } else {
        if (!other.spans_.isEmpty()) {
          if (spansBuilder_.isEmpty()) {
            spansBuilder_.dispose();
            spansBuilder_ = null;
            spans_ = other.spans_;
            bitField0_ = (bitField0_ & ~0x00000002);
            spansBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSpansFieldBuilder() : null;
          } else {
            spansBuilder_.addAllMessages(other.spans_);
          }
        }
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
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.parser(),
                      extensionRegistry);
              if (spansBuilder_ == null) {
                ensureSpansIsMutable();
                spans_.add(m);
              } else {
                spansBuilder_.addMessage(m);
              }
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

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of billing spans, or empty if there are no
     * more billing spans in the list.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of billing spans, or empty if there are no
     * more billing spans in the list.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of billing spans, or empty if there are no
     * more billing spans in the list.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of billing spans, or empty if there are no
     * more billing spans in the list.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of billing spans, or empty if there are no
     * more billing spans in the list.
     * </pre>
     *
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan> spans_ =
      java.util.Collections.emptyList();
    private void ensureSpansIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        spans_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan>(spans_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpanOrBuilder> spansBuilder_;

    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan> getSpansList() {
      if (spansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(spans_);
      } else {
        return spansBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public int getSpansCount() {
      if (spansBuilder_ == null) {
        return spans_.size();
      } else {
        return spansBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan getSpans(int index) {
      if (spansBuilder_ == null) {
        return spans_.get(index);
      } else {
        return spansBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public Builder setSpans(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.set(index, value);
        onChanged();
      } else {
        spansBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public Builder setSpans(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.set(index, builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public Builder addSpans(com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.add(value);
        onChanged();
      } else {
        spansBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public Builder addSpans(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.add(index, value);
        onChanged();
      } else {
        spansBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public Builder addSpans(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.add(builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public Builder addSpans(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.add(index, builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public Builder addAllSpans(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan> values) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, spans_);
        onChanged();
      } else {
        spansBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public Builder clearSpans() {
      if (spansBuilder_ == null) {
        spans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        spansBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public Builder removeSpans(int index) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.remove(index);
        onChanged();
      } else {
        spansBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder getSpansBuilder(
        int index) {
      return getSpansFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpanOrBuilder getSpansOrBuilder(
        int index) {
      if (spansBuilder_ == null) {
        return spans_.get(index);  } else {
        return spansBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpanOrBuilder> 
         getSpansOrBuilderList() {
      if (spansBuilder_ != null) {
        return spansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(spans_);
      }
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder addSpansBuilder() {
      return getSpansFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.getDefaultInstance());
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder addSpansBuilder(
        int index) {
      return getSpansFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.getDefaultInstance());
    }
    /**
     * <pre>
     * List of billing spans which contains at most one request page_size.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.BillingSpan spans = 2 [json_name = "spans"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder> 
         getSpansBuilderList() {
      return getSpansFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpanOrBuilder> 
        getSpansFieldBuilder() {
      if (spansBuilder_ == null) {
        spansBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpan.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.BillingSpanOrBuilder>(
                spans_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        spans_ = null;
      }
      return spansBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.ListBillingSpanResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.ListBillingSpanResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBillingSpanResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListBillingSpanResponse>() {
    @java.lang.Override
    public ListBillingSpanResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListBillingSpanResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBillingSpanResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

