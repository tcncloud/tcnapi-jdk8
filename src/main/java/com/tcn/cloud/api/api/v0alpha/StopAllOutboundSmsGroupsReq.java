// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.StopAllOutboundSmsGroupsReq}
 */
public final class StopAllOutboundSmsGroupsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.StopAllOutboundSmsGroupsReq)
    StopAllOutboundSmsGroupsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StopAllOutboundSmsGroupsReq.newBuilder() to construct.
  private StopAllOutboundSmsGroupsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StopAllOutboundSmsGroupsReq() {
    smsGroupSidsArr_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StopAllOutboundSmsGroupsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_StopAllOutboundSmsGroupsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_StopAllOutboundSmsGroupsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq.class, com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq.Builder.class);
  }

  public static final int SMS_GROUP_SIDS_ARR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList smsGroupSidsArr_;
  /**
   * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
   * @return A list containing the smsGroupSidsArr.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getSmsGroupSidsArrList() {
    return smsGroupSidsArr_;
  }
  /**
   * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
   * @return The count of smsGroupSidsArr.
   */
  public int getSmsGroupSidsArrCount() {
    return smsGroupSidsArr_.size();
  }
  /**
   * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
   * @param index The index of the element to return.
   * @return The smsGroupSidsArr at the given index.
   */
  public long getSmsGroupSidsArr(int index) {
    return smsGroupSidsArr_.getLong(index);
  }
  private int smsGroupSidsArrMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getSmsGroupSidsArrList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(smsGroupSidsArrMemoizedSerializedSize);
    }
    for (int i = 0; i < smsGroupSidsArr_.size(); i++) {
      output.writeInt64NoTag(smsGroupSidsArr_.getLong(i));
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
      for (int i = 0; i < smsGroupSidsArr_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(smsGroupSidsArr_.getLong(i));
      }
      size += dataSize;
      if (!getSmsGroupSidsArrList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      smsGroupSidsArrMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq other = (com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq) obj;

    if (!getSmsGroupSidsArrList()
        .equals(other.getSmsGroupSidsArrList())) return false;
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
    if (getSmsGroupSidsArrCount() > 0) {
      hash = (37 * hash) + SMS_GROUP_SIDS_ARR_FIELD_NUMBER;
      hash = (53 * hash) + getSmsGroupSidsArrList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq prototype) {
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
   * Protobuf type {@code api.v0alpha.StopAllOutboundSmsGroupsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.StopAllOutboundSmsGroupsReq)
      com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_StopAllOutboundSmsGroupsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_StopAllOutboundSmsGroupsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq.class, com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq.newBuilder()
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
      smsGroupSidsArr_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_StopAllOutboundSmsGroupsReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq build() {
      com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq result = new com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        smsGroupSidsArr_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.smsGroupSidsArr_ = smsGroupSidsArr_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq.getDefaultInstance()) return this;
      if (!other.smsGroupSidsArr_.isEmpty()) {
        if (smsGroupSidsArr_.isEmpty()) {
          smsGroupSidsArr_ = other.smsGroupSidsArr_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSmsGroupSidsArrIsMutable();
          smsGroupSidsArr_.addAll(other.smsGroupSidsArr_);
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
            case 16: {
              long v = input.readInt64();
              ensureSmsGroupSidsArrIsMutable();
              smsGroupSidsArr_.addLong(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureSmsGroupSidsArrIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                smsGroupSidsArr_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.LongList smsGroupSidsArr_ = emptyLongList();
    private void ensureSmsGroupSidsArrIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        smsGroupSidsArr_ = mutableCopy(smsGroupSidsArr_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
     * @return A list containing the smsGroupSidsArr.
     */
    public java.util.List<java.lang.Long>
        getSmsGroupSidsArrList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(smsGroupSidsArr_) : smsGroupSidsArr_;
    }
    /**
     * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
     * @return The count of smsGroupSidsArr.
     */
    public int getSmsGroupSidsArrCount() {
      return smsGroupSidsArr_.size();
    }
    /**
     * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
     * @param index The index of the element to return.
     * @return The smsGroupSidsArr at the given index.
     */
    public long getSmsGroupSidsArr(int index) {
      return smsGroupSidsArr_.getLong(index);
    }
    /**
     * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
     * @param index The index to set the value at.
     * @param value The smsGroupSidsArr to set.
     * @return This builder for chaining.
     */
    public Builder setSmsGroupSidsArr(
        int index, long value) {

      ensureSmsGroupSidsArrIsMutable();
      smsGroupSidsArr_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
     * @param value The smsGroupSidsArr to add.
     * @return This builder for chaining.
     */
    public Builder addSmsGroupSidsArr(long value) {

      ensureSmsGroupSidsArrIsMutable();
      smsGroupSidsArr_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
     * @param values The smsGroupSidsArr to add.
     * @return This builder for chaining.
     */
    public Builder addAllSmsGroupSidsArr(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureSmsGroupSidsArrIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, smsGroupSidsArr_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_group_sids_arr = 2 [json_name = "smsGroupSidsArr"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSmsGroupSidsArr() {
      smsGroupSidsArr_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.StopAllOutboundSmsGroupsReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.StopAllOutboundSmsGroupsReq)
  private static final com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StopAllOutboundSmsGroupsReq>
      PARSER = new com.google.protobuf.AbstractParser<StopAllOutboundSmsGroupsReq>() {
    @java.lang.Override
    public StopAllOutboundSmsGroupsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<StopAllOutboundSmsGroupsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StopAllOutboundSmsGroupsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

