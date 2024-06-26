// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_review.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * ListFlagReviewsRequest is a request for listing reviews on a transcript.
 * </pre>
 *
 * Protobuf type {@code wfo.vanalytics.v2.ListFlagReviewsRequest}
 */
public final class ListFlagReviewsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.ListFlagReviewsRequest)
    ListFlagReviewsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListFlagReviewsRequest.newBuilder() to construct.
  private ListFlagReviewsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListFlagReviewsRequest() {
    orderBy_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListFlagReviewsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_ListFlagReviewsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_ListFlagReviewsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest.Builder.class);
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_ = 0;
  /**
   * <pre>
   * Optional. The number of reviews to include in a single response. When not
   * provided this defaults to 100.
   * </pre>
   *
   * <code>uint32 page_size = 2 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int ORDER_BY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orderBy_ = "";
  /**
   * <pre>
   * Optional. The order by which reviews will be listed. Follows sql order by
   * syntax. When not provided the order defaults to "flag_review_sid desc".
   * Supported order by includes:
   *   + (flag_review_sid desc)
   *   + (flag_review_sid)
   * </pre>
   *
   * <code>string order_by = 3 [json_name = "orderBy"];</code>
   * @return The orderBy.
   */
  @java.lang.Override
  public java.lang.String getOrderBy() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderBy_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The order by which reviews will be listed. Follows sql order by
   * syntax. When not provided the order defaults to "flag_review_sid desc".
   * Supported order by includes:
   *   + (flag_review_sid desc)
   *   + (flag_review_sid)
   * </pre>
   *
   * <code>string order_by = 3 [json_name = "orderBy"];</code>
   * @return The bytes for orderBy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderByBytes() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderBy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * When provided all other request fields are ignored.
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * When provided all other request fields are ignored.
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSCRIPT_SID_FIELD_NUMBER = 5;
  private long transcriptSid_ = 0L;
  /**
   * <pre>
   * Optional. The transcript sid to look for reviews on.
   * </pre>
   *
   * <code>int64 transcript_sid = 5 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  @java.lang.Override
  public long getTranscriptSid() {
    return transcriptSid_;
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
    if (pageSize_ != 0) {
      output.writeUInt32(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderBy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, orderBy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pageToken_);
    }
    if (transcriptSid_ != 0L) {
      output.writeInt64(5, transcriptSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderBy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, orderBy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pageToken_);
    }
    if (transcriptSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, transcriptSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest other = (com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest) obj;

    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getOrderBy()
        .equals(other.getOrderBy())) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
    if (getTranscriptSid()
        != other.getTranscriptSid()) return false;
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
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + ORDER_BY_FIELD_NUMBER;
    hash = (53 * hash) + getOrderBy().hashCode();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + TRANSCRIPT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTranscriptSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest prototype) {
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
   * ListFlagReviewsRequest is a request for listing reviews on a transcript.
   * </pre>
   *
   * Protobuf type {@code wfo.vanalytics.v2.ListFlagReviewsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.ListFlagReviewsRequest)
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_ListFlagReviewsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_ListFlagReviewsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest.newBuilder()
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
      pageSize_ = 0;
      orderBy_ = "";
      pageToken_ = "";
      transcriptSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_ListFlagReviewsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest result = new com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orderBy_ = orderBy_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageToken_ = pageToken_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.transcriptSid_ = transcriptSid_;
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest.getDefaultInstance()) return this;
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getOrderBy().isEmpty()) {
        orderBy_ = other.orderBy_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getTranscriptSid() != 0L) {
        setTranscriptSid(other.getTranscriptSid());
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
            case 16: {
              pageSize_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 26: {
              orderBy_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 26
            case 34: {
              pageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
            case 40: {
              transcriptSid_ = input.readInt64();
              bitField0_ |= 0x00000008;
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

    private int pageSize_ ;
    /**
     * <pre>
     * Optional. The number of reviews to include in a single response. When not
     * provided this defaults to 100.
     * </pre>
     *
     * <code>uint32 page_size = 2 [json_name = "pageSize"];</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * Optional. The number of reviews to include in a single response. When not
     * provided this defaults to 100.
     * </pre>
     *
     * <code>uint32 page_size = 2 [json_name = "pageSize"];</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The number of reviews to include in a single response. When not
     * provided this defaults to 100.
     * </pre>
     *
     * <code>uint32 page_size = 2 [json_name = "pageSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object orderBy_ = "";
    /**
     * <pre>
     * Optional. The order by which reviews will be listed. Follows sql order by
     * syntax. When not provided the order defaults to "flag_review_sid desc".
     * Supported order by includes:
     *   + (flag_review_sid desc)
     *   + (flag_review_sid)
     * </pre>
     *
     * <code>string order_by = 3 [json_name = "orderBy"];</code>
     * @return The orderBy.
     */
    public java.lang.String getOrderBy() {
      java.lang.Object ref = orderBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The order by which reviews will be listed. Follows sql order by
     * syntax. When not provided the order defaults to "flag_review_sid desc".
     * Supported order by includes:
     *   + (flag_review_sid desc)
     *   + (flag_review_sid)
     * </pre>
     *
     * <code>string order_by = 3 [json_name = "orderBy"];</code>
     * @return The bytes for orderBy.
     */
    public com.google.protobuf.ByteString
        getOrderByBytes() {
      java.lang.Object ref = orderBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The order by which reviews will be listed. Follows sql order by
     * syntax. When not provided the order defaults to "flag_review_sid desc".
     * Supported order by includes:
     *   + (flag_review_sid desc)
     *   + (flag_review_sid)
     * </pre>
     *
     * <code>string order_by = 3 [json_name = "orderBy"];</code>
     * @param value The orderBy to set.
     * @return This builder for chaining.
     */
    public Builder setOrderBy(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orderBy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The order by which reviews will be listed. Follows sql order by
     * syntax. When not provided the order defaults to "flag_review_sid desc".
     * Supported order by includes:
     *   + (flag_review_sid desc)
     *   + (flag_review_sid)
     * </pre>
     *
     * <code>string order_by = 3 [json_name = "orderBy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderBy() {
      orderBy_ = getDefaultInstance().getOrderBy();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The order by which reviews will be listed. Follows sql order by
     * syntax. When not provided the order defaults to "flag_review_sid desc".
     * Supported order by includes:
     *   + (flag_review_sid desc)
     *   + (flag_review_sid)
     * </pre>
     *
     * <code>string order_by = 3 [json_name = "orderBy"];</code>
     * @param value The bytes for orderBy to set.
     * @return This builder for chaining.
     */
    public Builder setOrderByBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orderBy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * Optional. The next_page_token returned from a previous List request, if any.
     * When provided all other request fields are ignored.
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken"];</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The next_page_token returned from a previous List request, if any.
     * When provided all other request fields are ignored.
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken"];</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The next_page_token returned from a previous List request, if any.
     * When provided all other request fields are ignored.
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken"];</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pageToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The next_page_token returned from a previous List request, if any.
     * When provided all other request fields are ignored.
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The next_page_token returned from a previous List request, if any.
     * When provided all other request fields are ignored.
     * </pre>
     *
     * <code>string page_token = 4 [json_name = "pageToken"];</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long transcriptSid_ ;
    /**
     * <pre>
     * Optional. The transcript sid to look for reviews on.
     * </pre>
     *
     * <code>int64 transcript_sid = 5 [json_name = "transcriptSid"];</code>
     * @return The transcriptSid.
     */
    @java.lang.Override
    public long getTranscriptSid() {
      return transcriptSid_;
    }
    /**
     * <pre>
     * Optional. The transcript sid to look for reviews on.
     * </pre>
     *
     * <code>int64 transcript_sid = 5 [json_name = "transcriptSid"];</code>
     * @param value The transcriptSid to set.
     * @return This builder for chaining.
     */
    public Builder setTranscriptSid(long value) {

      transcriptSid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The transcript sid to look for reviews on.
     * </pre>
     *
     * <code>int64 transcript_sid = 5 [json_name = "transcriptSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTranscriptSid() {
      bitField0_ = (bitField0_ & ~0x00000008);
      transcriptSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.ListFlagReviewsRequest)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.ListFlagReviewsRequest)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFlagReviewsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListFlagReviewsRequest>() {
    @java.lang.Override
    public ListFlagReviewsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListFlagReviewsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFlagReviewsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

