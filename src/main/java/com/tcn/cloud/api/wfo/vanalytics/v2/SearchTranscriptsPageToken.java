// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * Protobuf type {@code wfo.vanalytics.v2.SearchTranscriptsPageToken}
 */
public final class SearchTranscriptsPageToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.SearchTranscriptsPageToken)
    SearchTranscriptsPageTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchTranscriptsPageToken.newBuilder() to construct.
  private SearchTranscriptsPageToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchTranscriptsPageToken() {
    searchAfter_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchTranscriptsPageToken();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SearchTranscriptsPageToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SearchTranscriptsPageToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken.class, com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken.Builder.class);
  }

  public static final int SEARCH_AFTER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList searchAfter_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
   * @return A list containing the searchAfter.
   */
  public com.google.protobuf.ProtocolStringList
      getSearchAfterList() {
    return searchAfter_;
  }
  /**
   * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
   * @return The count of searchAfter.
   */
  public int getSearchAfterCount() {
    return searchAfter_.size();
  }
  /**
   * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
   * @param index The index of the element to return.
   * @return The searchAfter at the given index.
   */
  public java.lang.String getSearchAfter(int index) {
    return searchAfter_.get(index);
  }
  /**
   * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the searchAfter at the given index.
   */
  public com.google.protobuf.ByteString
      getSearchAfterBytes(int index) {
    return searchAfter_.getByteString(index);
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
    for (int i = 0; i < searchAfter_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, searchAfter_.getRaw(i));
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
      for (int i = 0; i < searchAfter_.size(); i++) {
        dataSize += computeStringSizeNoTag(searchAfter_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSearchAfterList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken other = (com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken) obj;

    if (!getSearchAfterList()
        .equals(other.getSearchAfterList())) return false;
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
    if (getSearchAfterCount() > 0) {
      hash = (37 * hash) + SEARCH_AFTER_FIELD_NUMBER;
      hash = (53 * hash) + getSearchAfterList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken prototype) {
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
   * Protobuf type {@code wfo.vanalytics.v2.SearchTranscriptsPageToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.SearchTranscriptsPageToken)
      com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SearchTranscriptsPageToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SearchTranscriptsPageToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken.class, com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken.newBuilder()
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
      searchAfter_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SearchTranscriptsPageToken_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken result = new com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        searchAfter_.makeImmutable();
        result.searchAfter_ = searchAfter_;
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken.getDefaultInstance()) return this;
      if (!other.searchAfter_.isEmpty()) {
        if (searchAfter_.isEmpty()) {
          searchAfter_ = other.searchAfter_;
          bitField0_ |= 0x00000001;
        } else {
          ensureSearchAfterIsMutable();
          searchAfter_.addAll(other.searchAfter_);
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureSearchAfterIsMutable();
              searchAfter_.add(s);
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

    private com.google.protobuf.LazyStringArrayList searchAfter_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureSearchAfterIsMutable() {
      if (!searchAfter_.isModifiable()) {
        searchAfter_ = new com.google.protobuf.LazyStringArrayList(searchAfter_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
     * @return A list containing the searchAfter.
     */
    public com.google.protobuf.ProtocolStringList
        getSearchAfterList() {
      searchAfter_.makeImmutable();
      return searchAfter_;
    }
    /**
     * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
     * @return The count of searchAfter.
     */
    public int getSearchAfterCount() {
      return searchAfter_.size();
    }
    /**
     * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
     * @param index The index of the element to return.
     * @return The searchAfter at the given index.
     */
    public java.lang.String getSearchAfter(int index) {
      return searchAfter_.get(index);
    }
    /**
     * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the searchAfter at the given index.
     */
    public com.google.protobuf.ByteString
        getSearchAfterBytes(int index) {
      return searchAfter_.getByteString(index);
    }
    /**
     * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
     * @param index The index to set the value at.
     * @param value The searchAfter to set.
     * @return This builder for chaining.
     */
    public Builder setSearchAfter(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSearchAfterIsMutable();
      searchAfter_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
     * @param value The searchAfter to add.
     * @return This builder for chaining.
     */
    public Builder addSearchAfter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSearchAfterIsMutable();
      searchAfter_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
     * @param values The searchAfter to add.
     * @return This builder for chaining.
     */
    public Builder addAllSearchAfter(
        java.lang.Iterable<java.lang.String> values) {
      ensureSearchAfterIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, searchAfter_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSearchAfter() {
      searchAfter_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string search_after = 1 [json_name = "searchAfter"];</code>
     * @param value The bytes of the searchAfter to add.
     * @return This builder for chaining.
     */
    public Builder addSearchAfterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureSearchAfterIsMutable();
      searchAfter_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.SearchTranscriptsPageToken)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.SearchTranscriptsPageToken)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchTranscriptsPageToken>
      PARSER = new com.google.protobuf.AbstractParser<SearchTranscriptsPageToken>() {
    @java.lang.Override
    public SearchTranscriptsPageToken parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchTranscriptsPageToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchTranscriptsPageToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsPageToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

