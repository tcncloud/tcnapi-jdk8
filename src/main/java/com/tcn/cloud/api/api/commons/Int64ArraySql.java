// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/types.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * if you want to use repeated fields in query parameters use these
 * these messages have type mappings in go/conversion/arrays.go
 * </pre>
 *
 * Protobuf type {@code api.commons.Int64ArraySql}
 */
public final class Int64ArraySql extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.Int64ArraySql)
    Int64ArraySqlOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Int64ArraySql.newBuilder() to construct.
  private Int64ArraySql(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int64ArraySql() {
    values_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Int64ArraySql();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int64ArraySql_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int64ArraySql_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.Int64ArraySql.class, com.tcn.cloud.api.api.commons.Int64ArraySql.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList values_;
  /**
   * <code>repeated int64 values = 1 [json_name = "values"];</code>
   * @return A list containing the values.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getValuesList() {
    return values_;
  }
  /**
   * <code>repeated int64 values = 1 [json_name = "values"];</code>
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated int64 values = 1 [json_name = "values"];</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public long getValues(int index) {
    return values_.getLong(index);
  }
  private int valuesMemoizedSerializedSize = -1;

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
    if (getValuesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(valuesMemoizedSerializedSize);
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeInt64NoTag(values_.getLong(i));
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
      for (int i = 0; i < values_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(values_.getLong(i));
      }
      size += dataSize;
      if (!getValuesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      valuesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.Int64ArraySql)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.Int64ArraySql other = (com.tcn.cloud.api.api.commons.Int64ArraySql) obj;

    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.Int64ArraySql parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.Int64ArraySql prototype) {
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
   * if you want to use repeated fields in query parameters use these
   * these messages have type mappings in go/conversion/arrays.go
   * </pre>
   *
   * Protobuf type {@code api.commons.Int64ArraySql}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.Int64ArraySql)
      com.tcn.cloud.api.api.commons.Int64ArraySqlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int64ArraySql_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int64ArraySql_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.Int64ArraySql.class, com.tcn.cloud.api.api.commons.Int64ArraySql.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.Int64ArraySql.newBuilder()
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
      values_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int64ArraySql_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Int64ArraySql getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.Int64ArraySql.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Int64ArraySql build() {
      com.tcn.cloud.api.api.commons.Int64ArraySql result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Int64ArraySql buildPartial() {
      com.tcn.cloud.api.api.commons.Int64ArraySql result = new com.tcn.cloud.api.api.commons.Int64ArraySql(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.Int64ArraySql result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        values_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.values_ = values_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.Int64ArraySql result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.Int64ArraySql) {
        return mergeFrom((com.tcn.cloud.api.api.commons.Int64ArraySql)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.Int64ArraySql other) {
      if (other == com.tcn.cloud.api.api.commons.Int64ArraySql.getDefaultInstance()) return this;
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
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
            case 8: {
              long v = input.readInt64();
              ensureValuesIsMutable();
              values_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureValuesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                values_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.LongList values_ = emptyLongList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = mutableCopy(values_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated int64 values = 1 [json_name = "values"];</code>
     * @return A list containing the values.
     */
    public java.util.List<java.lang.Long>
        getValuesList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(values_) : values_;
    }
    /**
     * <code>repeated int64 values = 1 [json_name = "values"];</code>
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <code>repeated int64 values = 1 [json_name = "values"];</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public long getValues(int index) {
      return values_.getLong(index);
    }
    /**
     * <code>repeated int64 values = 1 [json_name = "values"];</code>
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(
        int index, long value) {

      ensureValuesIsMutable();
      values_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 values = 1 [json_name = "values"];</code>
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(long value) {

      ensureValuesIsMutable();
      values_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 values = 1 [json_name = "values"];</code>
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, values_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 values = 1 [json_name = "values"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:api.commons.Int64ArraySql)
  }

  // @@protoc_insertion_point(class_scope:api.commons.Int64ArraySql)
  private static final com.tcn.cloud.api.api.commons.Int64ArraySql DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.Int64ArraySql();
  }

  public static com.tcn.cloud.api.api.commons.Int64ArraySql getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int64ArraySql>
      PARSER = new com.google.protobuf.AbstractParser<Int64ArraySql>() {
    @java.lang.Override
    public Int64ArraySql parsePartialFrom(
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

  public static com.google.protobuf.Parser<Int64ArraySql> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int64ArraySql> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Int64ArraySql getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

