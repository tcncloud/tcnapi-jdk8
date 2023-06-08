// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/flag_filter.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * <pre>
 * ListFlagFiltersResponse is a response for listing flag filters.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.vanalytics.ListFlagFiltersResponse}
 */
public final class ListFlagFiltersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.ListFlagFiltersResponse)
    ListFlagFiltersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListFlagFiltersResponse.newBuilder() to construct.
  private ListFlagFiltersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListFlagFiltersResponse() {
    nextPageToken_ = "";
    flagFilters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListFlagFiltersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagFiltersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagFiltersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse.Builder.class);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page. Empty when there are no more pages.
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
   * Token to retrieve the next page. Empty when there are no more pages.
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

  public static final int FLAG_FILTERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> flagFilters_;
  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> getFlagFiltersList() {
    return flagFilters_;
  }
  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterOrBuilder> 
      getFlagFiltersOrBuilderList() {
    return flagFilters_;
  }
  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  @java.lang.Override
  public int getFlagFiltersCount() {
    return flagFilters_.size();
  }
  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter getFlagFilters(int index) {
    return flagFilters_.get(index);
  }
  /**
   * <pre>
   * List of flag filters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterOrBuilder getFlagFiltersOrBuilder(
      int index) {
    return flagFilters_.get(index);
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
    for (int i = 0; i < flagFilters_.size(); i++) {
      output.writeMessage(2, flagFilters_.get(i));
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
    for (int i = 0; i < flagFilters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, flagFilters_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse) obj;

    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!getFlagFiltersList()
        .equals(other.getFlagFiltersList())) return false;
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
    if (getFlagFiltersCount() > 0) {
      hash = (37 * hash) + FLAG_FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getFlagFiltersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse prototype) {
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
   * ListFlagFiltersResponse is a response for listing flag filters.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.vanalytics.ListFlagFiltersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.ListFlagFiltersResponse)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagFiltersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagFiltersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse.newBuilder()
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
      if (flagFiltersBuilder_ == null) {
        flagFilters_ = java.util.Collections.emptyList();
      } else {
        flagFilters_ = null;
        flagFiltersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagFiltersResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse result) {
      if (flagFiltersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          flagFilters_ = java.util.Collections.unmodifiableList(flagFilters_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.flagFilters_ = flagFilters_;
      } else {
        result.flagFilters_ = flagFiltersBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse.getDefaultInstance()) return this;
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (flagFiltersBuilder_ == null) {
        if (!other.flagFilters_.isEmpty()) {
          if (flagFilters_.isEmpty()) {
            flagFilters_ = other.flagFilters_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFlagFiltersIsMutable();
            flagFilters_.addAll(other.flagFilters_);
          }
          onChanged();
        }
      } else {
        if (!other.flagFilters_.isEmpty()) {
          if (flagFiltersBuilder_.isEmpty()) {
            flagFiltersBuilder_.dispose();
            flagFiltersBuilder_ = null;
            flagFilters_ = other.flagFilters_;
            bitField0_ = (bitField0_ & ~0x00000002);
            flagFiltersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFlagFiltersFieldBuilder() : null;
          } else {
            flagFiltersBuilder_.addAllMessages(other.flagFilters_);
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
              com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.parser(),
                      extensionRegistry);
              if (flagFiltersBuilder_ == null) {
                ensureFlagFiltersIsMutable();
                flagFilters_.add(m);
              } else {
                flagFiltersBuilder_.addMessage(m);
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
     * Token to retrieve the next page. Empty when there are no more pages.
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
     * Token to retrieve the next page. Empty when there are no more pages.
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
     * Token to retrieve the next page. Empty when there are no more pages.
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
     * Token to retrieve the next page. Empty when there are no more pages.
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
     * Token to retrieve the next page. Empty when there are no more pages.
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> flagFilters_ =
      java.util.Collections.emptyList();
    private void ensureFlagFiltersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        flagFilters_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter>(flagFilters_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterOrBuilder> flagFiltersBuilder_;

    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> getFlagFiltersList() {
      if (flagFiltersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(flagFilters_);
      } else {
        return flagFiltersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public int getFlagFiltersCount() {
      if (flagFiltersBuilder_ == null) {
        return flagFilters_.size();
      } else {
        return flagFiltersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter getFlagFilters(int index) {
      if (flagFiltersBuilder_ == null) {
        return flagFilters_.get(index);
      } else {
        return flagFiltersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public Builder setFlagFilters(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter value) {
      if (flagFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlagFiltersIsMutable();
        flagFilters_.set(index, value);
        onChanged();
      } else {
        flagFiltersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public Builder setFlagFilters(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder builderForValue) {
      if (flagFiltersBuilder_ == null) {
        ensureFlagFiltersIsMutable();
        flagFilters_.set(index, builderForValue.build());
        onChanged();
      } else {
        flagFiltersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public Builder addFlagFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter value) {
      if (flagFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlagFiltersIsMutable();
        flagFilters_.add(value);
        onChanged();
      } else {
        flagFiltersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public Builder addFlagFilters(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter value) {
      if (flagFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlagFiltersIsMutable();
        flagFilters_.add(index, value);
        onChanged();
      } else {
        flagFiltersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public Builder addFlagFilters(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder builderForValue) {
      if (flagFiltersBuilder_ == null) {
        ensureFlagFiltersIsMutable();
        flagFilters_.add(builderForValue.build());
        onChanged();
      } else {
        flagFiltersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public Builder addFlagFilters(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder builderForValue) {
      if (flagFiltersBuilder_ == null) {
        ensureFlagFiltersIsMutable();
        flagFilters_.add(index, builderForValue.build());
        onChanged();
      } else {
        flagFiltersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public Builder addAllFlagFilters(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> values) {
      if (flagFiltersBuilder_ == null) {
        ensureFlagFiltersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, flagFilters_);
        onChanged();
      } else {
        flagFiltersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public Builder clearFlagFilters() {
      if (flagFiltersBuilder_ == null) {
        flagFilters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        flagFiltersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public Builder removeFlagFilters(int index) {
      if (flagFiltersBuilder_ == null) {
        ensureFlagFiltersIsMutable();
        flagFilters_.remove(index);
        onChanged();
      } else {
        flagFiltersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder getFlagFiltersBuilder(
        int index) {
      return getFlagFiltersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterOrBuilder getFlagFiltersOrBuilder(
        int index) {
      if (flagFiltersBuilder_ == null) {
        return flagFilters_.get(index);  } else {
        return flagFiltersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterOrBuilder> 
         getFlagFiltersOrBuilderList() {
      if (flagFiltersBuilder_ != null) {
        return flagFiltersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(flagFilters_);
      }
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder addFlagFiltersBuilder() {
      return getFlagFiltersFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.getDefaultInstance());
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder addFlagFiltersBuilder(
        int index) {
      return getFlagFiltersFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.getDefaultInstance());
    }
    /**
     * <pre>
     * List of flag filters.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.vanalytics.FlagFilter flag_filters = 2 [json_name = "flagFilters"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder> 
         getFlagFiltersBuilderList() {
      return getFlagFiltersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterOrBuilder> 
        getFlagFiltersFieldBuilder() {
      if (flagFiltersBuilder_ == null) {
        flagFiltersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterOrBuilder>(
                flagFilters_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        flagFilters_ = null;
      }
      return flagFiltersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.ListFlagFiltersResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.ListFlagFiltersResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFlagFiltersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListFlagFiltersResponse>() {
    @java.lang.Override
    public ListFlagFiltersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListFlagFiltersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFlagFiltersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

