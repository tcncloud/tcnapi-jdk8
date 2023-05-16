// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ScrubListRes}
 */
public final class ScrubListRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ScrubListRes)
    ScrubListResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScrubListRes.newBuilder() to construct.
  private ScrubListRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScrubListRes() {
    listId_ = "";
    contentType_ = 0;
    invalidEntries_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScrubListRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ScrubListRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ScrubListRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ScrubListRes.class, com.tcn.cloud.api.api.v0alpha.ScrubListRes.Builder.class);
  }

  public static final int LIST_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object listId_ = "";
  /**
   * <code>string list_id = 1 [json_name = "listId"];</code>
   * @return The listId.
   */
  @java.lang.Override
  public java.lang.String getListId() {
    java.lang.Object ref = listId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      listId_ = s;
      return s;
    }
  }
  /**
   * <code>string list_id = 1 [json_name = "listId"];</code>
   * @return The bytes for listId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getListIdBytes() {
    java.lang.Object ref = listId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      listId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_ONLY_FIELD_NUMBER = 2;
  private boolean readOnly_ = false;
  /**
   * <code>bool read_only = 2 [json_name = "readOnly"];</code>
   * @return The readOnly.
   */
  @java.lang.Override
  public boolean getReadOnly() {
    return readOnly_;
  }

  public static final int CONTENT_TYPE_FIELD_NUMBER = 3;
  private int contentType_ = 0;
  /**
   * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
   * @return The enum numeric value on the wire for contentType.
   */
  @java.lang.Override public int getContentTypeValue() {
    return contentType_;
  }
  /**
   * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ContentType getContentType() {
    com.tcn.cloud.api.api.commons.ContentType result = com.tcn.cloud.api.api.commons.ContentType.forNumber(contentType_);
    return result == null ? com.tcn.cloud.api.api.commons.ContentType.UNRECOGNIZED : result;
  }

  public static final int ENTRIES_ADDED_FIELD_NUMBER = 4;
  private long entriesAdded_ = 0L;
  /**
   * <code>int64 entries_added = 4 [json_name = "entriesAdded"];</code>
   * @return The entriesAdded.
   */
  @java.lang.Override
  public long getEntriesAdded() {
    return entriesAdded_;
  }

  public static final int INVALID_ENTRIES_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList invalidEntries_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
   * @return A list containing the invalidEntries.
   */
  public com.google.protobuf.ProtocolStringList
      getInvalidEntriesList() {
    return invalidEntries_;
  }
  /**
   * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
   * @return The count of invalidEntries.
   */
  public int getInvalidEntriesCount() {
    return invalidEntries_.size();
  }
  /**
   * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
   * @param index The index of the element to return.
   * @return The invalidEntries at the given index.
   */
  public java.lang.String getInvalidEntries(int index) {
    return invalidEntries_.get(index);
  }
  /**
   * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the invalidEntries at the given index.
   */
  public com.google.protobuf.ByteString
      getInvalidEntriesBytes(int index) {
    return invalidEntries_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, listId_);
    }
    if (readOnly_ != false) {
      output.writeBool(2, readOnly_);
    }
    if (contentType_ != com.tcn.cloud.api.api.commons.ContentType.CT_PHONE_NUMBER.getNumber()) {
      output.writeEnum(3, contentType_);
    }
    if (entriesAdded_ != 0L) {
      output.writeInt64(4, entriesAdded_);
    }
    for (int i = 0; i < invalidEntries_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, invalidEntries_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, listId_);
    }
    if (readOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, readOnly_);
    }
    if (contentType_ != com.tcn.cloud.api.api.commons.ContentType.CT_PHONE_NUMBER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, contentType_);
    }
    if (entriesAdded_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, entriesAdded_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < invalidEntries_.size(); i++) {
        dataSize += computeStringSizeNoTag(invalidEntries_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getInvalidEntriesList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ScrubListRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ScrubListRes other = (com.tcn.cloud.api.api.v0alpha.ScrubListRes) obj;

    if (!getListId()
        .equals(other.getListId())) return false;
    if (getReadOnly()
        != other.getReadOnly()) return false;
    if (contentType_ != other.contentType_) return false;
    if (getEntriesAdded()
        != other.getEntriesAdded()) return false;
    if (!getInvalidEntriesList()
        .equals(other.getInvalidEntriesList())) return false;
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
    hash = (37 * hash) + LIST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getListId().hashCode();
    hash = (37 * hash) + READ_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReadOnly());
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + contentType_;
    hash = (37 * hash) + ENTRIES_ADDED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEntriesAdded());
    if (getInvalidEntriesCount() > 0) {
      hash = (37 * hash) + INVALID_ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getInvalidEntriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ScrubListRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ScrubListRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ScrubListRes)
      com.tcn.cloud.api.api.v0alpha.ScrubListResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ScrubListRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ScrubListRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ScrubListRes.class, com.tcn.cloud.api.api.v0alpha.ScrubListRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ScrubListRes.newBuilder()
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
      listId_ = "";
      readOnly_ = false;
      contentType_ = 0;
      entriesAdded_ = 0L;
      invalidEntries_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ScrubListRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScrubListRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ScrubListRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScrubListRes build() {
      com.tcn.cloud.api.api.v0alpha.ScrubListRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScrubListRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ScrubListRes result = new com.tcn.cloud.api.api.v0alpha.ScrubListRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ScrubListRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.listId_ = listId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.readOnly_ = readOnly_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.contentType_ = contentType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.entriesAdded_ = entriesAdded_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        invalidEntries_.makeImmutable();
        result.invalidEntries_ = invalidEntries_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ScrubListRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ScrubListRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ScrubListRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ScrubListRes.getDefaultInstance()) return this;
      if (!other.getListId().isEmpty()) {
        listId_ = other.listId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getReadOnly() != false) {
        setReadOnly(other.getReadOnly());
      }
      if (other.contentType_ != 0) {
        setContentTypeValue(other.getContentTypeValue());
      }
      if (other.getEntriesAdded() != 0L) {
        setEntriesAdded(other.getEntriesAdded());
      }
      if (!other.invalidEntries_.isEmpty()) {
        if (invalidEntries_.isEmpty()) {
          invalidEntries_ = other.invalidEntries_;
          bitField0_ |= 0x00000010;
        } else {
          ensureInvalidEntriesIsMutable();
          invalidEntries_.addAll(other.invalidEntries_);
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
              listId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              readOnly_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              contentType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              entriesAdded_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureInvalidEntriesIsMutable();
              invalidEntries_.add(s);
              break;
            } // case 42
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

    private java.lang.Object listId_ = "";
    /**
     * <code>string list_id = 1 [json_name = "listId"];</code>
     * @return The listId.
     */
    public java.lang.String getListId() {
      java.lang.Object ref = listId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        listId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string list_id = 1 [json_name = "listId"];</code>
     * @return The bytes for listId.
     */
    public com.google.protobuf.ByteString
        getListIdBytes() {
      java.lang.Object ref = listId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        listId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string list_id = 1 [json_name = "listId"];</code>
     * @param value The listId to set.
     * @return This builder for chaining.
     */
    public Builder setListId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      listId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string list_id = 1 [json_name = "listId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearListId() {
      listId_ = getDefaultInstance().getListId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string list_id = 1 [json_name = "listId"];</code>
     * @param value The bytes for listId to set.
     * @return This builder for chaining.
     */
    public Builder setListIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      listId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean readOnly_ ;
    /**
     * <code>bool read_only = 2 [json_name = "readOnly"];</code>
     * @return The readOnly.
     */
    @java.lang.Override
    public boolean getReadOnly() {
      return readOnly_;
    }
    /**
     * <code>bool read_only = 2 [json_name = "readOnly"];</code>
     * @param value The readOnly to set.
     * @return This builder for chaining.
     */
    public Builder setReadOnly(boolean value) {

      readOnly_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool read_only = 2 [json_name = "readOnly"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReadOnly() {
      bitField0_ = (bitField0_ & ~0x00000002);
      readOnly_ = false;
      onChanged();
      return this;
    }

    private int contentType_ = 0;
    /**
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @return The enum numeric value on the wire for contentType.
     */
    @java.lang.Override public int getContentTypeValue() {
      return contentType_;
    }
    /**
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @param value The enum numeric value on the wire for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeValue(int value) {
      contentType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @return The contentType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ContentType getContentType() {
      com.tcn.cloud.api.api.commons.ContentType result = com.tcn.cloud.api.api.commons.ContentType.forNumber(contentType_);
      return result == null ? com.tcn.cloud.api.api.commons.ContentType.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(com.tcn.cloud.api.api.commons.ContentType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      contentType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      contentType_ = 0;
      onChanged();
      return this;
    }

    private long entriesAdded_ ;
    /**
     * <code>int64 entries_added = 4 [json_name = "entriesAdded"];</code>
     * @return The entriesAdded.
     */
    @java.lang.Override
    public long getEntriesAdded() {
      return entriesAdded_;
    }
    /**
     * <code>int64 entries_added = 4 [json_name = "entriesAdded"];</code>
     * @param value The entriesAdded to set.
     * @return This builder for chaining.
     */
    public Builder setEntriesAdded(long value) {

      entriesAdded_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 entries_added = 4 [json_name = "entriesAdded"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntriesAdded() {
      bitField0_ = (bitField0_ & ~0x00000008);
      entriesAdded_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList invalidEntries_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureInvalidEntriesIsMutable() {
      if (!invalidEntries_.isModifiable()) {
        invalidEntries_ = new com.google.protobuf.LazyStringArrayList(invalidEntries_);
      }
      bitField0_ |= 0x00000010;
    }
    /**
     * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
     * @return A list containing the invalidEntries.
     */
    public com.google.protobuf.ProtocolStringList
        getInvalidEntriesList() {
      invalidEntries_.makeImmutable();
      return invalidEntries_;
    }
    /**
     * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
     * @return The count of invalidEntries.
     */
    public int getInvalidEntriesCount() {
      return invalidEntries_.size();
    }
    /**
     * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
     * @param index The index of the element to return.
     * @return The invalidEntries at the given index.
     */
    public java.lang.String getInvalidEntries(int index) {
      return invalidEntries_.get(index);
    }
    /**
     * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the invalidEntries at the given index.
     */
    public com.google.protobuf.ByteString
        getInvalidEntriesBytes(int index) {
      return invalidEntries_.getByteString(index);
    }
    /**
     * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
     * @param index The index to set the value at.
     * @param value The invalidEntries to set.
     * @return This builder for chaining.
     */
    public Builder setInvalidEntries(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInvalidEntriesIsMutable();
      invalidEntries_.set(index, value);
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
     * @param value The invalidEntries to add.
     * @return This builder for chaining.
     */
    public Builder addInvalidEntries(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInvalidEntriesIsMutable();
      invalidEntries_.add(value);
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
     * @param values The invalidEntries to add.
     * @return This builder for chaining.
     */
    public Builder addAllInvalidEntries(
        java.lang.Iterable<java.lang.String> values) {
      ensureInvalidEntriesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, invalidEntries_);
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInvalidEntries() {
      invalidEntries_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000010);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries"];</code>
     * @param value The bytes of the invalidEntries to add.
     * @return This builder for chaining.
     */
    public Builder addInvalidEntriesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureInvalidEntriesIsMutable();
      invalidEntries_.add(value);
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ScrubListRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ScrubListRes)
  private static final com.tcn.cloud.api.api.v0alpha.ScrubListRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ScrubListRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubListRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScrubListRes>
      PARSER = new com.google.protobuf.AbstractParser<ScrubListRes>() {
    @java.lang.Override
    public ScrubListRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScrubListRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScrubListRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ScrubListRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

