// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * response to search in learning pages
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.SearchRes}
 */
public final class SearchRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SearchRes)
    SearchResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchRes.newBuilder() to construct.
  private SearchRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchRes() {
    searchDetails_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_SearchRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_SearchRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SearchRes.class, com.tcn.cloud.api.api.v0alpha.SearchRes.Builder.class);
  }

  public static final int SEARCH_DETAILS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.LearnSearchDetails> searchDetails_;
  /**
   * <pre>
   * matched urls
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.LearnSearchDetails> getSearchDetailsList() {
    return searchDetails_;
  }
  /**
   * <pre>
   * matched urls
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.LearnSearchDetailsOrBuilder> 
      getSearchDetailsOrBuilderList() {
    return searchDetails_;
  }
  /**
   * <pre>
   * matched urls
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
   */
  @java.lang.Override
  public int getSearchDetailsCount() {
    return searchDetails_.size();
  }
  /**
   * <pre>
   * matched urls
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.LearnSearchDetails getSearchDetails(int index) {
    return searchDetails_.get(index);
  }
  /**
   * <pre>
   * matched urls
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.LearnSearchDetailsOrBuilder getSearchDetailsOrBuilder(
      int index) {
    return searchDetails_.get(index);
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
    for (int i = 0; i < searchDetails_.size(); i++) {
      output.writeMessage(1, searchDetails_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < searchDetails_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, searchDetails_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SearchRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SearchRes other = (com.tcn.cloud.api.api.v0alpha.SearchRes) obj;

    if (!getSearchDetailsList()
        .equals(other.getSearchDetailsList())) return false;
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
    if (getSearchDetailsCount() > 0) {
      hash = (37 * hash) + SEARCH_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getSearchDetailsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SearchRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SearchRes prototype) {
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
   * response to search in learning pages
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.SearchRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SearchRes)
      com.tcn.cloud.api.api.v0alpha.SearchResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_SearchRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_SearchRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SearchRes.class, com.tcn.cloud.api.api.v0alpha.SearchRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SearchRes.newBuilder()
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
      if (searchDetailsBuilder_ == null) {
        searchDetails_ = java.util.Collections.emptyList();
      } else {
        searchDetails_ = null;
        searchDetailsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_SearchRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SearchRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SearchRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SearchRes build() {
      com.tcn.cloud.api.api.v0alpha.SearchRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SearchRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SearchRes result = new com.tcn.cloud.api.api.v0alpha.SearchRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.SearchRes result) {
      if (searchDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          searchDetails_ = java.util.Collections.unmodifiableList(searchDetails_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.searchDetails_ = searchDetails_;
      } else {
        result.searchDetails_ = searchDetailsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SearchRes result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SearchRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SearchRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SearchRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SearchRes.getDefaultInstance()) return this;
      if (searchDetailsBuilder_ == null) {
        if (!other.searchDetails_.isEmpty()) {
          if (searchDetails_.isEmpty()) {
            searchDetails_ = other.searchDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSearchDetailsIsMutable();
            searchDetails_.addAll(other.searchDetails_);
          }
          onChanged();
        }
      } else {
        if (!other.searchDetails_.isEmpty()) {
          if (searchDetailsBuilder_.isEmpty()) {
            searchDetailsBuilder_.dispose();
            searchDetailsBuilder_ = null;
            searchDetails_ = other.searchDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
            searchDetailsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSearchDetailsFieldBuilder() : null;
          } else {
            searchDetailsBuilder_.addAllMessages(other.searchDetails_);
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
              com.tcn.cloud.api.api.v0alpha.LearnSearchDetails m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.parser(),
                      extensionRegistry);
              if (searchDetailsBuilder_ == null) {
                ensureSearchDetailsIsMutable();
                searchDetails_.add(m);
              } else {
                searchDetailsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.LearnSearchDetails> searchDetails_ =
      java.util.Collections.emptyList();
    private void ensureSearchDetailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        searchDetails_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.LearnSearchDetails>(searchDetails_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.LearnSearchDetails, com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder, com.tcn.cloud.api.api.v0alpha.LearnSearchDetailsOrBuilder> searchDetailsBuilder_;

    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.LearnSearchDetails> getSearchDetailsList() {
      if (searchDetailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(searchDetails_);
      } else {
        return searchDetailsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public int getSearchDetailsCount() {
      if (searchDetailsBuilder_ == null) {
        return searchDetails_.size();
      } else {
        return searchDetailsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnSearchDetails getSearchDetails(int index) {
      if (searchDetailsBuilder_ == null) {
        return searchDetails_.get(index);
      } else {
        return searchDetailsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public Builder setSearchDetails(
        int index, com.tcn.cloud.api.api.v0alpha.LearnSearchDetails value) {
      if (searchDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchDetailsIsMutable();
        searchDetails_.set(index, value);
        onChanged();
      } else {
        searchDetailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public Builder setSearchDetails(
        int index, com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder builderForValue) {
      if (searchDetailsBuilder_ == null) {
        ensureSearchDetailsIsMutable();
        searchDetails_.set(index, builderForValue.build());
        onChanged();
      } else {
        searchDetailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public Builder addSearchDetails(com.tcn.cloud.api.api.v0alpha.LearnSearchDetails value) {
      if (searchDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchDetailsIsMutable();
        searchDetails_.add(value);
        onChanged();
      } else {
        searchDetailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public Builder addSearchDetails(
        int index, com.tcn.cloud.api.api.v0alpha.LearnSearchDetails value) {
      if (searchDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchDetailsIsMutable();
        searchDetails_.add(index, value);
        onChanged();
      } else {
        searchDetailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public Builder addSearchDetails(
        com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder builderForValue) {
      if (searchDetailsBuilder_ == null) {
        ensureSearchDetailsIsMutable();
        searchDetails_.add(builderForValue.build());
        onChanged();
      } else {
        searchDetailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public Builder addSearchDetails(
        int index, com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder builderForValue) {
      if (searchDetailsBuilder_ == null) {
        ensureSearchDetailsIsMutable();
        searchDetails_.add(index, builderForValue.build());
        onChanged();
      } else {
        searchDetailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public Builder addAllSearchDetails(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.LearnSearchDetails> values) {
      if (searchDetailsBuilder_ == null) {
        ensureSearchDetailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, searchDetails_);
        onChanged();
      } else {
        searchDetailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public Builder clearSearchDetails() {
      if (searchDetailsBuilder_ == null) {
        searchDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        searchDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public Builder removeSearchDetails(int index) {
      if (searchDetailsBuilder_ == null) {
        ensureSearchDetailsIsMutable();
        searchDetails_.remove(index);
        onChanged();
      } else {
        searchDetailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder getSearchDetailsBuilder(
        int index) {
      return getSearchDetailsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnSearchDetailsOrBuilder getSearchDetailsOrBuilder(
        int index) {
      if (searchDetailsBuilder_ == null) {
        return searchDetails_.get(index);  } else {
        return searchDetailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.LearnSearchDetailsOrBuilder> 
         getSearchDetailsOrBuilderList() {
      if (searchDetailsBuilder_ != null) {
        return searchDetailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(searchDetails_);
      }
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder addSearchDetailsBuilder() {
      return getSearchDetailsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.getDefaultInstance());
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder addSearchDetailsBuilder(
        int index) {
      return getSearchDetailsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.getDefaultInstance());
    }
    /**
     * <pre>
     * matched urls
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnSearchDetails search_details = 1 [json_name = "searchDetails"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder> 
         getSearchDetailsBuilderList() {
      return getSearchDetailsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.LearnSearchDetails, com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder, com.tcn.cloud.api.api.v0alpha.LearnSearchDetailsOrBuilder> 
        getSearchDetailsFieldBuilder() {
      if (searchDetailsBuilder_ == null) {
        searchDetailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.LearnSearchDetails, com.tcn.cloud.api.api.v0alpha.LearnSearchDetails.Builder, com.tcn.cloud.api.api.v0alpha.LearnSearchDetailsOrBuilder>(
                searchDetails_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        searchDetails_ = null;
      }
      return searchDetailsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SearchRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SearchRes)
  private static final com.tcn.cloud.api.api.v0alpha.SearchRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SearchRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.SearchRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchRes>
      PARSER = new com.google.protobuf.AbstractParser<SearchRes>() {
    @java.lang.Override
    public SearchRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SearchRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

