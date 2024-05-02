// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * BulkDeleteTranscriptsRequest defines the bulk delete transcripts request.
 * </pre>
 *
 * Protobuf type {@code wfo.vanalytics.v2.BulkDeleteTranscriptsRequest}
 */
public final class BulkDeleteTranscriptsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.BulkDeleteTranscriptsRequest)
    BulkDeleteTranscriptsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BulkDeleteTranscriptsRequest.newBuilder() to construct.
  private BulkDeleteTranscriptsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BulkDeleteTranscriptsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BulkDeleteTranscriptsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_BulkDeleteTranscriptsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_BulkDeleteTranscriptsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest.Builder.class);
  }

  public static final int QUERY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery query_;
  /**
   * <pre>
   * Required. A query which determines which transcripts to delete.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
   * @return Whether the query field is set.
   */
  @java.lang.Override
  public boolean hasQuery() {
    return query_ != null;
  }
  /**
   * <pre>
   * Required. A query which determines which transcripts to delete.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
   * @return The query.
   */
  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery getQuery() {
    return query_ == null ? com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.getDefaultInstance() : query_;
  }
  /**
   * <pre>
   * Required. A query which determines which transcripts to delete.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQueryOrBuilder getQueryOrBuilder() {
    return query_ == null ? com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.getDefaultInstance() : query_;
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
    if (query_ != null) {
      output.writeMessage(1, getQuery());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (query_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQuery());
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest other = (com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest) obj;

    if (hasQuery() != other.hasQuery()) return false;
    if (hasQuery()) {
      if (!getQuery()
          .equals(other.getQuery())) return false;
    }
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
    if (hasQuery()) {
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest prototype) {
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
   * BulkDeleteTranscriptsRequest defines the bulk delete transcripts request.
   * </pre>
   *
   * Protobuf type {@code wfo.vanalytics.v2.BulkDeleteTranscriptsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.BulkDeleteTranscriptsRequest)
      com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_BulkDeleteTranscriptsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_BulkDeleteTranscriptsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest.newBuilder()
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
      query_ = null;
      if (queryBuilder_ != null) {
        queryBuilder_.dispose();
        queryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_BulkDeleteTranscriptsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest result = new com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.query_ = queryBuilder_ == null
            ? query_
            : queryBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest.getDefaultInstance()) return this;
      if (other.hasQuery()) {
        mergeQuery(other.getQuery());
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
              input.readMessage(
                  getQueryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery query_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery, com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQueryOrBuilder> queryBuilder_;
    /**
     * <pre>
     * Required. A query which determines which transcripts to delete.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
     * @return Whether the query field is set.
     */
    public boolean hasQuery() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. A query which determines which transcripts to delete.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
     * @return The query.
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery getQuery() {
      if (queryBuilder_ == null) {
        return query_ == null ? com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.getDefaultInstance() : query_;
      } else {
        return queryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A query which determines which transcripts to delete.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
     */
    public Builder setQuery(com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery value) {
      if (queryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        query_ = value;
      } else {
        queryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A query which determines which transcripts to delete.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
     */
    public Builder setQuery(
        com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Builder builderForValue) {
      if (queryBuilder_ == null) {
        query_ = builderForValue.build();
      } else {
        queryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A query which determines which transcripts to delete.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
     */
    public Builder mergeQuery(com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery value) {
      if (queryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          query_ != null &&
          query_ != com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.getDefaultInstance()) {
          getQueryBuilder().mergeFrom(value);
        } else {
          query_ = value;
        }
      } else {
        queryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A query which determines which transcripts to delete.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
     */
    public Builder clearQuery() {
      bitField0_ = (bitField0_ & ~0x00000001);
      query_ = null;
      if (queryBuilder_ != null) {
        queryBuilder_.dispose();
        queryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A query which determines which transcripts to delete.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Builder getQueryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getQueryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A query which determines which transcripts to delete.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQueryOrBuilder getQueryOrBuilder() {
      if (queryBuilder_ != null) {
        return queryBuilder_.getMessageOrBuilder();
      } else {
        return query_ == null ?
            com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.getDefaultInstance() : query_;
      }
    }
    /**
     * <pre>
     * Required. A query which determines which transcripts to delete.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.TranscriptQuery query = 1 [json_name = "query"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery, com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQueryOrBuilder> 
        getQueryFieldBuilder() {
      if (queryBuilder_ == null) {
        queryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery, com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQuery.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptQueryOrBuilder>(
                getQuery(),
                getParentForChildren(),
                isClean());
        query_ = null;
      }
      return queryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.BulkDeleteTranscriptsRequest)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.BulkDeleteTranscriptsRequest)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BulkDeleteTranscriptsRequest>
      PARSER = new com.google.protobuf.AbstractParser<BulkDeleteTranscriptsRequest>() {
    @java.lang.Override
    public BulkDeleteTranscriptsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BulkDeleteTranscriptsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BulkDeleteTranscriptsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.BulkDeleteTranscriptsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
