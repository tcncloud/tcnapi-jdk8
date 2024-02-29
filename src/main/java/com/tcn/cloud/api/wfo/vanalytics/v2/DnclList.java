// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/dncl_list.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * Protobuf type {@code wfo.vanalytics.v2.DnclList}
 */
public final class DnclList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.DnclList)
    DnclListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DnclList.newBuilder() to construct.
  private DnclList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DnclList() {
    listId_ = "";
    contentType_ = 0;
    expirePeriod_ = 0;
    agentResponseKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DnclList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.DnclListProto.internal_static_wfo_vanalytics_v2_DnclList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.DnclListProto.internal_static_wfo_vanalytics_v2_DnclList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.DnclList.class, com.tcn.cloud.api.wfo.vanalytics.v2.DnclList.Builder.class);
  }

  public static final int LIST_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object listId_ = "";
  /**
   * <pre>
   * Required. Dncl list id to add the item to.
   * </pre>
   *
   * <code>string list_id = 2 [json_name = "listId"];</code>
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
   * <pre>
   * Required. Dncl list id to add the item to.
   * </pre>
   *
   * <code>string list_id = 2 [json_name = "listId"];</code>
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

  public static final int CONTENT_TYPE_FIELD_NUMBER = 3;
  private int contentType_ = 0;
  /**
   * <pre>
   * Required. Specifies the dncl list content type.
   * </pre>
   *
   * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
   * @return The enum numeric value on the wire for contentType.
   */
  @java.lang.Override public int getContentTypeValue() {
    return contentType_;
  }
  /**
   * <pre>
   * Required. Specifies the dncl list content type.
   * </pre>
   *
   * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ContentType getContentType() {
    com.tcn.cloud.api.api.commons.ContentType result = com.tcn.cloud.api.api.commons.ContentType.forNumber(contentType_);
    return result == null ? com.tcn.cloud.api.api.commons.ContentType.UNRECOGNIZED : result;
  }

  public static final int EXPIRE_PERIOD_FIELD_NUMBER = 4;
  private int expirePeriod_ = 0;
  /**
   * <pre>
   * Optional. Expected duration to keep item in DNCL.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.DnclExpirePeriod expire_period = 4 [json_name = "expirePeriod"];</code>
   * @return The enum numeric value on the wire for expirePeriod.
   */
  @java.lang.Override public int getExpirePeriodValue() {
    return expirePeriod_;
  }
  /**
   * <pre>
   * Optional. Expected duration to keep item in DNCL.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.DnclExpirePeriod expire_period = 4 [json_name = "expirePeriod"];</code>
   * @return The expirePeriod.
   */
  @java.lang.Override public com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod getExpirePeriod() {
    com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod result = com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod.forNumber(expirePeriod_);
    return result == null ? com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod.UNRECOGNIZED : result;
  }

  public static final int EXPIRE_OFFSET_FIELD_NUMBER = 5;
  private long expireOffset_ = 0L;
  /**
   * <pre>
   * Optional. Specifies how many expire periods
   * to calculate. i.e. number of weeks.
   * </pre>
   *
   * <code>uint64 expire_offset = 5 [json_name = "expireOffset"];</code>
   * @return The expireOffset.
   */
  @java.lang.Override
  public long getExpireOffset() {
    return expireOffset_;
  }

  public static final int AGENT_RESPONSE_KEY_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object agentResponseKey_ = "";
  /**
   * <pre>
   * Optional. Specifies an agent response to get the scrub value from.
   * </pre>
   *
   * <code>string agent_response_key = 6 [json_name = "agentResponseKey"];</code>
   * @return The agentResponseKey.
   */
  @java.lang.Override
  public java.lang.String getAgentResponseKey() {
    java.lang.Object ref = agentResponseKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentResponseKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Specifies an agent response to get the scrub value from.
   * </pre>
   *
   * <code>string agent_response_key = 6 [json_name = "agentResponseKey"];</code>
   * @return The bytes for agentResponseKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAgentResponseKeyBytes() {
    java.lang.Object ref = agentResponseKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentResponseKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, listId_);
    }
    if (contentType_ != com.tcn.cloud.api.api.commons.ContentType.CT_PHONE_NUMBER.getNumber()) {
      output.writeEnum(3, contentType_);
    }
    if (expirePeriod_ != com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod.DNCL_EXPIRE_PERIOD_HOUR.getNumber()) {
      output.writeEnum(4, expirePeriod_);
    }
    if (expireOffset_ != 0L) {
      output.writeUInt64(5, expireOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentResponseKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, agentResponseKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, listId_);
    }
    if (contentType_ != com.tcn.cloud.api.api.commons.ContentType.CT_PHONE_NUMBER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, contentType_);
    }
    if (expirePeriod_ != com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod.DNCL_EXPIRE_PERIOD_HOUR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, expirePeriod_);
    }
    if (expireOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, expireOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentResponseKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, agentResponseKey_);
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.DnclList)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.DnclList other = (com.tcn.cloud.api.wfo.vanalytics.v2.DnclList) obj;

    if (!getListId()
        .equals(other.getListId())) return false;
    if (contentType_ != other.contentType_) return false;
    if (expirePeriod_ != other.expirePeriod_) return false;
    if (getExpireOffset()
        != other.getExpireOffset()) return false;
    if (!getAgentResponseKey()
        .equals(other.getAgentResponseKey())) return false;
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
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + contentType_;
    hash = (37 * hash) + EXPIRE_PERIOD_FIELD_NUMBER;
    hash = (53 * hash) + expirePeriod_;
    hash = (37 * hash) + EXPIRE_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpireOffset());
    hash = (37 * hash) + AGENT_RESPONSE_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getAgentResponseKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.DnclList prototype) {
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
   * Protobuf type {@code wfo.vanalytics.v2.DnclList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.DnclList)
      com.tcn.cloud.api.wfo.vanalytics.v2.DnclListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.DnclListProto.internal_static_wfo_vanalytics_v2_DnclList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.DnclListProto.internal_static_wfo_vanalytics_v2_DnclList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.DnclList.class, com.tcn.cloud.api.wfo.vanalytics.v2.DnclList.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.DnclList.newBuilder()
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
      contentType_ = 0;
      expirePeriod_ = 0;
      expireOffset_ = 0L;
      agentResponseKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.DnclListProto.internal_static_wfo_vanalytics_v2_DnclList_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.DnclList getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.DnclList.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.DnclList build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.DnclList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.DnclList buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.DnclList result = new com.tcn.cloud.api.wfo.vanalytics.v2.DnclList(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.DnclList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.listId_ = listId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.contentType_ = contentType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.expirePeriod_ = expirePeriod_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.expireOffset_ = expireOffset_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.agentResponseKey_ = agentResponseKey_;
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.DnclList) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.DnclList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.DnclList other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.DnclList.getDefaultInstance()) return this;
      if (!other.getListId().isEmpty()) {
        listId_ = other.listId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.contentType_ != 0) {
        setContentTypeValue(other.getContentTypeValue());
      }
      if (other.expirePeriod_ != 0) {
        setExpirePeriodValue(other.getExpirePeriodValue());
      }
      if (other.getExpireOffset() != 0L) {
        setExpireOffset(other.getExpireOffset());
      }
      if (!other.getAgentResponseKey().isEmpty()) {
        agentResponseKey_ = other.agentResponseKey_;
        bitField0_ |= 0x00000010;
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
            case 18: {
              listId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 24: {
              contentType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 32: {
              expirePeriod_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
            case 40: {
              expireOffset_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 40
            case 50: {
              agentResponseKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
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

    private java.lang.Object listId_ = "";
    /**
     * <pre>
     * Required. Dncl list id to add the item to.
     * </pre>
     *
     * <code>string list_id = 2 [json_name = "listId"];</code>
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
     * <pre>
     * Required. Dncl list id to add the item to.
     * </pre>
     *
     * <code>string list_id = 2 [json_name = "listId"];</code>
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
     * <pre>
     * Required. Dncl list id to add the item to.
     * </pre>
     *
     * <code>string list_id = 2 [json_name = "listId"];</code>
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
     * <pre>
     * Required. Dncl list id to add the item to.
     * </pre>
     *
     * <code>string list_id = 2 [json_name = "listId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearListId() {
      listId_ = getDefaultInstance().getListId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Dncl list id to add the item to.
     * </pre>
     *
     * <code>string list_id = 2 [json_name = "listId"];</code>
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

    private int contentType_ = 0;
    /**
     * <pre>
     * Required. Specifies the dncl list content type.
     * </pre>
     *
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @return The enum numeric value on the wire for contentType.
     */
    @java.lang.Override public int getContentTypeValue() {
      return contentType_;
    }
    /**
     * <pre>
     * Required. Specifies the dncl list content type.
     * </pre>
     *
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @param value The enum numeric value on the wire for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeValue(int value) {
      contentType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specifies the dncl list content type.
     * </pre>
     *
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @return The contentType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ContentType getContentType() {
      com.tcn.cloud.api.api.commons.ContentType result = com.tcn.cloud.api.api.commons.ContentType.forNumber(contentType_);
      return result == null ? com.tcn.cloud.api.api.commons.ContentType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. Specifies the dncl list content type.
     * </pre>
     *
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(com.tcn.cloud.api.api.commons.ContentType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      contentType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specifies the dncl list content type.
     * </pre>
     *
     * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      contentType_ = 0;
      onChanged();
      return this;
    }

    private int expirePeriod_ = 0;
    /**
     * <pre>
     * Optional. Expected duration to keep item in DNCL.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.DnclExpirePeriod expire_period = 4 [json_name = "expirePeriod"];</code>
     * @return The enum numeric value on the wire for expirePeriod.
     */
    @java.lang.Override public int getExpirePeriodValue() {
      return expirePeriod_;
    }
    /**
     * <pre>
     * Optional. Expected duration to keep item in DNCL.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.DnclExpirePeriod expire_period = 4 [json_name = "expirePeriod"];</code>
     * @param value The enum numeric value on the wire for expirePeriod to set.
     * @return This builder for chaining.
     */
    public Builder setExpirePeriodValue(int value) {
      expirePeriod_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Expected duration to keep item in DNCL.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.DnclExpirePeriod expire_period = 4 [json_name = "expirePeriod"];</code>
     * @return The expirePeriod.
     */
    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod getExpirePeriod() {
      com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod result = com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod.forNumber(expirePeriod_);
      return result == null ? com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Optional. Expected duration to keep item in DNCL.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.DnclExpirePeriod expire_period = 4 [json_name = "expirePeriod"];</code>
     * @param value The expirePeriod to set.
     * @return This builder for chaining.
     */
    public Builder setExpirePeriod(com.tcn.cloud.api.wfo.vanalytics.v2.DnclExpirePeriod value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      expirePeriod_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Expected duration to keep item in DNCL.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.DnclExpirePeriod expire_period = 4 [json_name = "expirePeriod"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpirePeriod() {
      bitField0_ = (bitField0_ & ~0x00000004);
      expirePeriod_ = 0;
      onChanged();
      return this;
    }

    private long expireOffset_ ;
    /**
     * <pre>
     * Optional. Specifies how many expire periods
     * to calculate. i.e. number of weeks.
     * </pre>
     *
     * <code>uint64 expire_offset = 5 [json_name = "expireOffset"];</code>
     * @return The expireOffset.
     */
    @java.lang.Override
    public long getExpireOffset() {
      return expireOffset_;
    }
    /**
     * <pre>
     * Optional. Specifies how many expire periods
     * to calculate. i.e. number of weeks.
     * </pre>
     *
     * <code>uint64 expire_offset = 5 [json_name = "expireOffset"];</code>
     * @param value The expireOffset to set.
     * @return This builder for chaining.
     */
    public Builder setExpireOffset(long value) {

      expireOffset_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Specifies how many expire periods
     * to calculate. i.e. number of weeks.
     * </pre>
     *
     * <code>uint64 expire_offset = 5 [json_name = "expireOffset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpireOffset() {
      bitField0_ = (bitField0_ & ~0x00000008);
      expireOffset_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object agentResponseKey_ = "";
    /**
     * <pre>
     * Optional. Specifies an agent response to get the scrub value from.
     * </pre>
     *
     * <code>string agent_response_key = 6 [json_name = "agentResponseKey"];</code>
     * @return The agentResponseKey.
     */
    public java.lang.String getAgentResponseKey() {
      java.lang.Object ref = agentResponseKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentResponseKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Specifies an agent response to get the scrub value from.
     * </pre>
     *
     * <code>string agent_response_key = 6 [json_name = "agentResponseKey"];</code>
     * @return The bytes for agentResponseKey.
     */
    public com.google.protobuf.ByteString
        getAgentResponseKeyBytes() {
      java.lang.Object ref = agentResponseKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentResponseKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Specifies an agent response to get the scrub value from.
     * </pre>
     *
     * <code>string agent_response_key = 6 [json_name = "agentResponseKey"];</code>
     * @param value The agentResponseKey to set.
     * @return This builder for chaining.
     */
    public Builder setAgentResponseKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      agentResponseKey_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Specifies an agent response to get the scrub value from.
     * </pre>
     *
     * <code>string agent_response_key = 6 [json_name = "agentResponseKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentResponseKey() {
      agentResponseKey_ = getDefaultInstance().getAgentResponseKey();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Specifies an agent response to get the scrub value from.
     * </pre>
     *
     * <code>string agent_response_key = 6 [json_name = "agentResponseKey"];</code>
     * @param value The bytes for agentResponseKey to set.
     * @return This builder for chaining.
     */
    public Builder setAgentResponseKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      agentResponseKey_ = value;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.DnclList)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.DnclList)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.DnclList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.DnclList();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.DnclList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DnclList>
      PARSER = new com.google.protobuf.AbstractParser<DnclList>() {
    @java.lang.Override
    public DnclList parsePartialFrom(
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

  public static com.google.protobuf.Parser<DnclList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DnclList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.DnclList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

