// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

/**
 * Protobuf type {@code api.v1alpha1.delivery.ListByIDReq}
 */
public final class ListByIDReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.delivery.ListByIDReq)
    ListByIDReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListByIDReq.newBuilder() to construct.
  private ListByIDReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListByIDReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListByIDReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListByIDReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListByIDReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq.class, com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq.Builder.class);
  }

  public static final int BEFORE_SID_FIELD_NUMBER = 2;
  private long beforeSid_ = 0L;
  /**
   * <pre>
   * start listing records less than this sid
   * </pre>
   *
   * <code>int64 before_sid = 2 [json_name = "beforeSid"];</code>
   * @return The beforeSid.
   */
  @java.lang.Override
  public long getBeforeSid() {
    return beforeSid_;
  }

  public static final int LIMIT_FIELD_NUMBER = 3;
  private long limit_ = 0L;
  /**
   * <pre>
   * max records to retrieve
   * </pre>
   *
   * <code>int64 limit = 3 [json_name = "limit"];</code>
   * @return The limit.
   */
  @java.lang.Override
  public long getLimit() {
    return limit_;
  }

  public static final int OTHER_SID_FIELD_NUMBER = 4;
  private long otherSid_ = 0L;
  /**
   * <pre>
   * the sid that is in the where clause
   * </pre>
   *
   * <code>int64 other_sid = 4 [json_name = "otherSid"];</code>
   * @return The otherSid.
   */
  @java.lang.Override
  public long getOtherSid() {
    return otherSid_;
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
    if (beforeSid_ != 0L) {
      output.writeInt64(2, beforeSid_);
    }
    if (limit_ != 0L) {
      output.writeInt64(3, limit_);
    }
    if (otherSid_ != 0L) {
      output.writeInt64(4, otherSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (beforeSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, beforeSid_);
    }
    if (limit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, limit_);
    }
    if (otherSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, otherSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq other = (com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq) obj;

    if (getBeforeSid()
        != other.getBeforeSid()) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (getOtherSid()
        != other.getOtherSid()) return false;
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
    hash = (37 * hash) + BEFORE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBeforeSid());
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLimit());
    hash = (37 * hash) + OTHER_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOtherSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.delivery.ListByIDReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.delivery.ListByIDReq)
      com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListByIDReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListByIDReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq.class, com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq.newBuilder()
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
      beforeSid_ = 0L;
      limit_ = 0L;
      otherSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListByIDReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq build() {
      com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq result = new com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.beforeSid_ = beforeSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.limit_ = limit_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.otherSid_ = otherSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq.getDefaultInstance()) return this;
      if (other.getBeforeSid() != 0L) {
        setBeforeSid(other.getBeforeSid());
      }
      if (other.getLimit() != 0L) {
        setLimit(other.getLimit());
      }
      if (other.getOtherSid() != 0L) {
        setOtherSid(other.getOtherSid());
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
              beforeSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 24: {
              limit_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 32: {
              otherSid_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
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

    private long beforeSid_ ;
    /**
     * <pre>
     * start listing records less than this sid
     * </pre>
     *
     * <code>int64 before_sid = 2 [json_name = "beforeSid"];</code>
     * @return The beforeSid.
     */
    @java.lang.Override
    public long getBeforeSid() {
      return beforeSid_;
    }
    /**
     * <pre>
     * start listing records less than this sid
     * </pre>
     *
     * <code>int64 before_sid = 2 [json_name = "beforeSid"];</code>
     * @param value The beforeSid to set.
     * @return This builder for chaining.
     */
    public Builder setBeforeSid(long value) {

      beforeSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * start listing records less than this sid
     * </pre>
     *
     * <code>int64 before_sid = 2 [json_name = "beforeSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBeforeSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      beforeSid_ = 0L;
      onChanged();
      return this;
    }

    private long limit_ ;
    /**
     * <pre>
     * max records to retrieve
     * </pre>
     *
     * <code>int64 limit = 3 [json_name = "limit"];</code>
     * @return The limit.
     */
    @java.lang.Override
    public long getLimit() {
      return limit_;
    }
    /**
     * <pre>
     * max records to retrieve
     * </pre>
     *
     * <code>int64 limit = 3 [json_name = "limit"];</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(long value) {

      limit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * max records to retrieve
     * </pre>
     *
     * <code>int64 limit = 3 [json_name = "limit"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      limit_ = 0L;
      onChanged();
      return this;
    }

    private long otherSid_ ;
    /**
     * <pre>
     * the sid that is in the where clause
     * </pre>
     *
     * <code>int64 other_sid = 4 [json_name = "otherSid"];</code>
     * @return The otherSid.
     */
    @java.lang.Override
    public long getOtherSid() {
      return otherSid_;
    }
    /**
     * <pre>
     * the sid that is in the where clause
     * </pre>
     *
     * <code>int64 other_sid = 4 [json_name = "otherSid"];</code>
     * @param value The otherSid to set.
     * @return This builder for chaining.
     */
    public Builder setOtherSid(long value) {

      otherSid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the sid that is in the where clause
     * </pre>
     *
     * <code>int64 other_sid = 4 [json_name = "otherSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOtherSid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      otherSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.delivery.ListByIDReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.delivery.ListByIDReq)
  private static final com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListByIDReq>
      PARSER = new com.google.protobuf.AbstractParser<ListByIDReq>() {
    @java.lang.Override
    public ListByIDReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListByIDReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListByIDReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.ListByIDReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

