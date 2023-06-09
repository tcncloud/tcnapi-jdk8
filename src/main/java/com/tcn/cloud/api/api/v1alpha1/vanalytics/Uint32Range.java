// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/expr.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * Protobuf type {@code api.v1alpha1.vanalytics.Uint32Range}
 */
public final class Uint32Range extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.Uint32Range)
    Uint32RangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Uint32Range.newBuilder() to construct.
  private Uint32Range(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Uint32Range() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Uint32Range();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_Uint32Range_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_Uint32Range_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range.Builder.class);
  }

  public static final int FROM_FIELD_NUMBER = 1;
  private int from_ = 0;
  /**
   * <code>uint32 from = 1 [json_name = "from"];</code>
   * @return The from.
   */
  @java.lang.Override
  public int getFrom() {
    return from_;
  }

  public static final int TO_FIELD_NUMBER = 2;
  private int to_ = 0;
  /**
   * <code>uint32 to = 2 [json_name = "to"];</code>
   * @return The to.
   */
  @java.lang.Override
  public int getTo() {
    return to_;
  }

  public static final int INCLUDE_FROM_FIELD_NUMBER = 3;
  private boolean includeFrom_ = false;
  /**
   * <code>bool include_from = 3 [json_name = "includeFrom"];</code>
   * @return The includeFrom.
   */
  @java.lang.Override
  public boolean getIncludeFrom() {
    return includeFrom_;
  }

  public static final int INCLUDE_TO_FIELD_NUMBER = 4;
  private boolean includeTo_ = false;
  /**
   * <code>bool include_to = 4 [json_name = "includeTo"];</code>
   * @return The includeTo.
   */
  @java.lang.Override
  public boolean getIncludeTo() {
    return includeTo_;
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
    if (from_ != 0) {
      output.writeUInt32(1, from_);
    }
    if (to_ != 0) {
      output.writeUInt32(2, to_);
    }
    if (includeFrom_ != false) {
      output.writeBool(3, includeFrom_);
    }
    if (includeTo_ != false) {
      output.writeBool(4, includeTo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (from_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, from_);
    }
    if (to_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, to_);
    }
    if (includeFrom_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, includeFrom_);
    }
    if (includeTo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, includeTo_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range) obj;

    if (getFrom()
        != other.getFrom()) return false;
    if (getTo()
        != other.getTo()) return false;
    if (getIncludeFrom()
        != other.getIncludeFrom()) return false;
    if (getIncludeTo()
        != other.getIncludeTo()) return false;
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
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom();
    hash = (37 * hash) + TO_FIELD_NUMBER;
    hash = (53 * hash) + getTo();
    hash = (37 * hash) + INCLUDE_FROM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeFrom());
    hash = (37 * hash) + INCLUDE_TO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeTo());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range prototype) {
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
   * Protobuf type {@code api.v1alpha1.vanalytics.Uint32Range}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.Uint32Range)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32RangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_Uint32Range_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_Uint32Range_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range.newBuilder()
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
      from_ = 0;
      to_ = 0;
      includeFrom_ = false;
      includeTo_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_Uint32Range_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.from_ = from_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.to_ = to_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.includeFrom_ = includeFrom_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.includeTo_ = includeTo_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range.getDefaultInstance()) return this;
      if (other.getFrom() != 0) {
        setFrom(other.getFrom());
      }
      if (other.getTo() != 0) {
        setTo(other.getTo());
      }
      if (other.getIncludeFrom() != false) {
        setIncludeFrom(other.getIncludeFrom());
      }
      if (other.getIncludeTo() != false) {
        setIncludeTo(other.getIncludeTo());
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
              from_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              to_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              includeFrom_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              includeTo_ = input.readBool();
              bitField0_ |= 0x00000008;
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

    private int from_ ;
    /**
     * <code>uint32 from = 1 [json_name = "from"];</code>
     * @return The from.
     */
    @java.lang.Override
    public int getFrom() {
      return from_;
    }
    /**
     * <code>uint32 from = 1 [json_name = "from"];</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(int value) {

      from_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 from = 1 [json_name = "from"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      bitField0_ = (bitField0_ & ~0x00000001);
      from_ = 0;
      onChanged();
      return this;
    }

    private int to_ ;
    /**
     * <code>uint32 to = 2 [json_name = "to"];</code>
     * @return The to.
     */
    @java.lang.Override
    public int getTo() {
      return to_;
    }
    /**
     * <code>uint32 to = 2 [json_name = "to"];</code>
     * @param value The to to set.
     * @return This builder for chaining.
     */
    public Builder setTo(int value) {

      to_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 to = 2 [json_name = "to"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      to_ = 0;
      onChanged();
      return this;
    }

    private boolean includeFrom_ ;
    /**
     * <code>bool include_from = 3 [json_name = "includeFrom"];</code>
     * @return The includeFrom.
     */
    @java.lang.Override
    public boolean getIncludeFrom() {
      return includeFrom_;
    }
    /**
     * <code>bool include_from = 3 [json_name = "includeFrom"];</code>
     * @param value The includeFrom to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeFrom(boolean value) {

      includeFrom_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool include_from = 3 [json_name = "includeFrom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeFrom() {
      bitField0_ = (bitField0_ & ~0x00000004);
      includeFrom_ = false;
      onChanged();
      return this;
    }

    private boolean includeTo_ ;
    /**
     * <code>bool include_to = 4 [json_name = "includeTo"];</code>
     * @return The includeTo.
     */
    @java.lang.Override
    public boolean getIncludeTo() {
      return includeTo_;
    }
    /**
     * <code>bool include_to = 4 [json_name = "includeTo"];</code>
     * @param value The includeTo to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeTo(boolean value) {

      includeTo_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool include_to = 4 [json_name = "includeTo"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeTo() {
      bitField0_ = (bitField0_ & ~0x00000008);
      includeTo_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.Uint32Range)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.Uint32Range)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Uint32Range>
      PARSER = new com.google.protobuf.AbstractParser<Uint32Range>() {
    @java.lang.Override
    public Uint32Range parsePartialFrom(
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

  public static com.google.protobuf.Parser<Uint32Range> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Uint32Range> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.Uint32Range getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

