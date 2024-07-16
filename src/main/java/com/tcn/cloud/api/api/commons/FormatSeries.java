// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/insights.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * FormatSeries contains the series of operations for a column operation
 * </pre>
 *
 * Protobuf type {@code api.commons.FormatSeries}
 */
public final class FormatSeries extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.FormatSeries)
    FormatSeriesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FormatSeries.newBuilder() to construct.
  private FormatSeries(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FormatSeries() {
    formatParts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FormatSeries();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.InsightsProto.internal_static_api_commons_FormatSeries_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.InsightsProto.internal_static_api_commons_FormatSeries_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.FormatSeries.class, com.tcn.cloud.api.api.commons.FormatSeries.Builder.class);
  }

  public static final int FORMAT_PARTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList formatParts_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The series of format parts
   * </pre>
   *
   * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
   * @return A list containing the formatParts.
   */
  public com.google.protobuf.ProtocolStringList
      getFormatPartsList() {
    return formatParts_;
  }
  /**
   * <pre>
   * The series of format parts
   * </pre>
   *
   * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
   * @return The count of formatParts.
   */
  public int getFormatPartsCount() {
    return formatParts_.size();
  }
  /**
   * <pre>
   * The series of format parts
   * </pre>
   *
   * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
   * @param index The index of the element to return.
   * @return The formatParts at the given index.
   */
  public java.lang.String getFormatParts(int index) {
    return formatParts_.get(index);
  }
  /**
   * <pre>
   * The series of format parts
   * </pre>
   *
   * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the formatParts at the given index.
   */
  public com.google.protobuf.ByteString
      getFormatPartsBytes(int index) {
    return formatParts_.getByteString(index);
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
    for (int i = 0; i < formatParts_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, formatParts_.getRaw(i));
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
      for (int i = 0; i < formatParts_.size(); i++) {
        dataSize += computeStringSizeNoTag(formatParts_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFormatPartsList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.FormatSeries)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.FormatSeries other = (com.tcn.cloud.api.api.commons.FormatSeries) obj;

    if (!getFormatPartsList()
        .equals(other.getFormatPartsList())) return false;
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
    if (getFormatPartsCount() > 0) {
      hash = (37 * hash) + FORMAT_PARTS_FIELD_NUMBER;
      hash = (53 * hash) + getFormatPartsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.FormatSeries parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.FormatSeries parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.FormatSeries parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.FormatSeries prototype) {
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
   * FormatSeries contains the series of operations for a column operation
   * </pre>
   *
   * Protobuf type {@code api.commons.FormatSeries}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.FormatSeries)
      com.tcn.cloud.api.api.commons.FormatSeriesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.InsightsProto.internal_static_api_commons_FormatSeries_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.InsightsProto.internal_static_api_commons_FormatSeries_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.FormatSeries.class, com.tcn.cloud.api.api.commons.FormatSeries.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.FormatSeries.newBuilder()
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
      formatParts_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.InsightsProto.internal_static_api_commons_FormatSeries_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.FormatSeries getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.FormatSeries.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.FormatSeries build() {
      com.tcn.cloud.api.api.commons.FormatSeries result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.FormatSeries buildPartial() {
      com.tcn.cloud.api.api.commons.FormatSeries result = new com.tcn.cloud.api.api.commons.FormatSeries(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.FormatSeries result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        formatParts_.makeImmutable();
        result.formatParts_ = formatParts_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.FormatSeries) {
        return mergeFrom((com.tcn.cloud.api.api.commons.FormatSeries)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.FormatSeries other) {
      if (other == com.tcn.cloud.api.api.commons.FormatSeries.getDefaultInstance()) return this;
      if (!other.formatParts_.isEmpty()) {
        if (formatParts_.isEmpty()) {
          formatParts_ = other.formatParts_;
          bitField0_ |= 0x00000001;
        } else {
          ensureFormatPartsIsMutable();
          formatParts_.addAll(other.formatParts_);
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
              ensureFormatPartsIsMutable();
              formatParts_.add(s);
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

    private com.google.protobuf.LazyStringArrayList formatParts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureFormatPartsIsMutable() {
      if (!formatParts_.isModifiable()) {
        formatParts_ = new com.google.protobuf.LazyStringArrayList(formatParts_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The series of format parts
     * </pre>
     *
     * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
     * @return A list containing the formatParts.
     */
    public com.google.protobuf.ProtocolStringList
        getFormatPartsList() {
      formatParts_.makeImmutable();
      return formatParts_;
    }
    /**
     * <pre>
     * The series of format parts
     * </pre>
     *
     * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
     * @return The count of formatParts.
     */
    public int getFormatPartsCount() {
      return formatParts_.size();
    }
    /**
     * <pre>
     * The series of format parts
     * </pre>
     *
     * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
     * @param index The index of the element to return.
     * @return The formatParts at the given index.
     */
    public java.lang.String getFormatParts(int index) {
      return formatParts_.get(index);
    }
    /**
     * <pre>
     * The series of format parts
     * </pre>
     *
     * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the formatParts at the given index.
     */
    public com.google.protobuf.ByteString
        getFormatPartsBytes(int index) {
      return formatParts_.getByteString(index);
    }
    /**
     * <pre>
     * The series of format parts
     * </pre>
     *
     * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
     * @param index The index to set the value at.
     * @param value The formatParts to set.
     * @return This builder for chaining.
     */
    public Builder setFormatParts(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFormatPartsIsMutable();
      formatParts_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The series of format parts
     * </pre>
     *
     * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
     * @param value The formatParts to add.
     * @return This builder for chaining.
     */
    public Builder addFormatParts(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFormatPartsIsMutable();
      formatParts_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The series of format parts
     * </pre>
     *
     * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
     * @param values The formatParts to add.
     * @return This builder for chaining.
     */
    public Builder addAllFormatParts(
        java.lang.Iterable<java.lang.String> values) {
      ensureFormatPartsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, formatParts_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The series of format parts
     * </pre>
     *
     * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFormatParts() {
      formatParts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The series of format parts
     * </pre>
     *
     * <code>repeated string format_parts = 1 [json_name = "formatParts"];</code>
     * @param value The bytes of the formatParts to add.
     * @return This builder for chaining.
     */
    public Builder addFormatPartsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureFormatPartsIsMutable();
      formatParts_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api.commons.FormatSeries)
  }

  // @@protoc_insertion_point(class_scope:api.commons.FormatSeries)
  private static final com.tcn.cloud.api.api.commons.FormatSeries DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.FormatSeries();
  }

  public static com.tcn.cloud.api.api.commons.FormatSeries getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FormatSeries>
      PARSER = new com.google.protobuf.AbstractParser<FormatSeries>() {
    @java.lang.Override
    public FormatSeries parsePartialFrom(
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

  public static com.google.protobuf.Parser<FormatSeries> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FormatSeries> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.FormatSeries getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
