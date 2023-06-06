// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetCollectionEntriesReq}
 */
public final class GetCollectionEntriesReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetCollectionEntriesReq)
    GetCollectionEntriesReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCollectionEntriesReq.newBuilder() to construct.
  private GetCollectionEntriesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCollectionEntriesReq() {
    collectionId_ = "";
    searchAfterId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCollectionEntriesReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_GetCollectionEntriesReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_GetCollectionEntriesReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq.class, com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq.Builder.class);
  }

  public static final int COLLECTION_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object collectionId_ = "";
  /**
   * <code>string collection_id = 3 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  @java.lang.Override
  public java.lang.String getCollectionId() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collectionId_ = s;
      return s;
    }
  }
  /**
   * <code>string collection_id = 3 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCollectionIdBytes() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      collectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROM_FIELD_NUMBER = 4;
  private long from_ = 0L;
  /**
   * <code>int64 from = 4 [json_name = "from"];</code>
   * @return The from.
   */
  @java.lang.Override
  public long getFrom() {
    return from_;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 5;
  private long pageSize_ = 0L;
  /**
   * <code>int64 page_size = 5 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public long getPageSize() {
    return pageSize_;
  }

  public static final int SEARCH_AFTER_ID_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object searchAfterId_ = "";
  /**
   * <code>string search_after_id = 6 [json_name = "searchAfterId"];</code>
   * @return The searchAfterId.
   */
  @java.lang.Override
  public java.lang.String getSearchAfterId() {
    java.lang.Object ref = searchAfterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      searchAfterId_ = s;
      return s;
    }
  }
  /**
   * <code>string search_after_id = 6 [json_name = "searchAfterId"];</code>
   * @return The bytes for searchAfterId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSearchAfterIdBytes() {
    java.lang.Object ref = searchAfterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      searchAfterId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, collectionId_);
    }
    if (from_ != 0L) {
      output.writeInt64(4, from_);
    }
    if (pageSize_ != 0L) {
      output.writeInt64(5, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(searchAfterId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, searchAfterId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, collectionId_);
    }
    if (from_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, from_);
    }
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(searchAfterId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, searchAfterId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq other = (com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq) obj;

    if (!getCollectionId()
        .equals(other.getCollectionId())) return false;
    if (getFrom()
        != other.getFrom()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getSearchAfterId()
        .equals(other.getSearchAfterId())) return false;
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
    hash = (37 * hash) + COLLECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCollectionId().hashCode();
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFrom());
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    hash = (37 * hash) + SEARCH_AFTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSearchAfterId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq prototype) {
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
   * Protobuf type {@code api.v0alpha.GetCollectionEntriesReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetCollectionEntriesReq)
      com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_GetCollectionEntriesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_GetCollectionEntriesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq.class, com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq.newBuilder()
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
      collectionId_ = "";
      from_ = 0L;
      pageSize_ = 0L;
      searchAfterId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_GetCollectionEntriesReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq build() {
      com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq result = new com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.collectionId_ = collectionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.from_ = from_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.searchAfterId_ = searchAfterId_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq.getDefaultInstance()) return this;
      if (!other.getCollectionId().isEmpty()) {
        collectionId_ = other.collectionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFrom() != 0L) {
        setFrom(other.getFrom());
      }
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
      }
      if (!other.getSearchAfterId().isEmpty()) {
        searchAfterId_ = other.searchAfterId_;
        bitField0_ |= 0x00000008;
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
            case 26: {
              collectionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 32: {
              from_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
            case 40: {
              pageSize_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 40
            case 50: {
              searchAfterId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 50
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

    private java.lang.Object collectionId_ = "";
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @return The collectionId.
     */
    public java.lang.String getCollectionId() {
      java.lang.Object ref = collectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @return The bytes for collectionId.
     */
    public com.google.protobuf.ByteString
        getCollectionIdBytes() {
      java.lang.Object ref = collectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @param value The collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      collectionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollectionId() {
      collectionId_ = getDefaultInstance().getCollectionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @param value The bytes for collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      collectionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long from_ ;
    /**
     * <code>int64 from = 4 [json_name = "from"];</code>
     * @return The from.
     */
    @java.lang.Override
    public long getFrom() {
      return from_;
    }
    /**
     * <code>int64 from = 4 [json_name = "from"];</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(long value) {

      from_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 from = 4 [json_name = "from"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      bitField0_ = (bitField0_ & ~0x00000002);
      from_ = 0L;
      onChanged();
      return this;
    }

    private long pageSize_ ;
    /**
     * <code>int64 page_size = 5 [json_name = "pageSize"];</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int64 page_size = 5 [json_name = "pageSize"];</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(long value) {

      pageSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 page_size = 5 [json_name = "pageSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pageSize_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object searchAfterId_ = "";
    /**
     * <code>string search_after_id = 6 [json_name = "searchAfterId"];</code>
     * @return The searchAfterId.
     */
    public java.lang.String getSearchAfterId() {
      java.lang.Object ref = searchAfterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        searchAfterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string search_after_id = 6 [json_name = "searchAfterId"];</code>
     * @return The bytes for searchAfterId.
     */
    public com.google.protobuf.ByteString
        getSearchAfterIdBytes() {
      java.lang.Object ref = searchAfterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        searchAfterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string search_after_id = 6 [json_name = "searchAfterId"];</code>
     * @param value The searchAfterId to set.
     * @return This builder for chaining.
     */
    public Builder setSearchAfterId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      searchAfterId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string search_after_id = 6 [json_name = "searchAfterId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSearchAfterId() {
      searchAfterId_ = getDefaultInstance().getSearchAfterId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string search_after_id = 6 [json_name = "searchAfterId"];</code>
     * @param value The bytes for searchAfterId to set.
     * @return This builder for chaining.
     */
    public Builder setSearchAfterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      searchAfterId_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetCollectionEntriesReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetCollectionEntriesReq)
  private static final com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCollectionEntriesReq>
      PARSER = new com.google.protobuf.AbstractParser<GetCollectionEntriesReq>() {
    @java.lang.Override
    public GetCollectionEntriesReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCollectionEntriesReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCollectionEntriesReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

