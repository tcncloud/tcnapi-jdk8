// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * SimpleCompareExpression describes a simple compare expression
 * </pre>
 *
 * Protobuf type {@code api.commons.org.SimpleCompareExpression}
 */
public final class SimpleCompareExpression extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.SimpleCompareExpression)
    SimpleCompareExpressionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SimpleCompareExpression.newBuilder() to construct.
  private SimpleCompareExpression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleCompareExpression() {
    operatorType_ = 0;
    dispositionHeader_ = "";
    compareValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SimpleCompareExpression();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_SimpleCompareExpression_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_SimpleCompareExpression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.SimpleCompareExpression.class, com.tcn.cloud.api.api.commons.org.SimpleCompareExpression.Builder.class);
  }

  public static final int OPERATOR_TYPE_FIELD_NUMBER = 1;
  private int operatorType_ = 0;
  /**
   * <pre>
   * The operator type of SimpleCompareExpression
   * </pre>
   *
   * <code>.api.commons.org.CompareOperatorType operator_type = 1 [json_name = "operatorType"];</code>
   * @return The enum numeric value on the wire for operatorType.
   */
  @java.lang.Override public int getOperatorTypeValue() {
    return operatorType_;
  }
  /**
   * <pre>
   * The operator type of SimpleCompareExpression
   * </pre>
   *
   * <code>.api.commons.org.CompareOperatorType operator_type = 1 [json_name = "operatorType"];</code>
   * @return The operatorType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.org.CompareOperatorType getOperatorType() {
    com.tcn.cloud.api.api.commons.org.CompareOperatorType result = com.tcn.cloud.api.api.commons.org.CompareOperatorType.forNumber(operatorType_);
    return result == null ? com.tcn.cloud.api.api.commons.org.CompareOperatorType.UNRECOGNIZED : result;
  }

  public static final int ACT_INDEX_FIELD_NUMBER = 2;
  private long actIndex_ = 0L;
  /**
   * <pre>
   * The act index of the SimpleCompareExpression
   * </pre>
   *
   * <code>int64 act_index = 2 [json_name = "actIndex"];</code>
   * @return The actIndex.
   */
  @java.lang.Override
  public long getActIndex() {
    return actIndex_;
  }

  public static final int DISPOSITION_HEADER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dispositionHeader_ = "";
  /**
   * <pre>
   * The disposition header of the SimpleCompareExpression
   * </pre>
   *
   * <code>string disposition_header = 3 [json_name = "dispositionHeader"];</code>
   * @return The dispositionHeader.
   */
  @java.lang.Override
  public java.lang.String getDispositionHeader() {
    java.lang.Object ref = dispositionHeader_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dispositionHeader_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The disposition header of the SimpleCompareExpression
   * </pre>
   *
   * <code>string disposition_header = 3 [json_name = "dispositionHeader"];</code>
   * @return The bytes for dispositionHeader.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDispositionHeaderBytes() {
    java.lang.Object ref = dispositionHeader_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dispositionHeader_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPARE_VALUE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object compareValue_ = "";
  /**
   * <pre>
   * The compare value of the SimpleCompareExpression
   * </pre>
   *
   * <code>string compare_value = 4 [json_name = "compareValue"];</code>
   * @return The compareValue.
   */
  @java.lang.Override
  public java.lang.String getCompareValue() {
    java.lang.Object ref = compareValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      compareValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The compare value of the SimpleCompareExpression
   * </pre>
   *
   * <code>string compare_value = 4 [json_name = "compareValue"];</code>
   * @return The bytes for compareValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCompareValueBytes() {
    java.lang.Object ref = compareValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      compareValue_ = b;
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
    if (operatorType_ != com.tcn.cloud.api.api.commons.org.CompareOperatorType.COMPARE_OPERATOR_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operatorType_);
    }
    if (actIndex_ != 0L) {
      output.writeInt64(2, actIndex_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dispositionHeader_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dispositionHeader_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(compareValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, compareValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operatorType_ != com.tcn.cloud.api.api.commons.org.CompareOperatorType.COMPARE_OPERATOR_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operatorType_);
    }
    if (actIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, actIndex_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dispositionHeader_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dispositionHeader_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(compareValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, compareValue_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.SimpleCompareExpression)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.SimpleCompareExpression other = (com.tcn.cloud.api.api.commons.org.SimpleCompareExpression) obj;

    if (operatorType_ != other.operatorType_) return false;
    if (getActIndex()
        != other.getActIndex()) return false;
    if (!getDispositionHeader()
        .equals(other.getDispositionHeader())) return false;
    if (!getCompareValue()
        .equals(other.getCompareValue())) return false;
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
    hash = (37 * hash) + OPERATOR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + operatorType_;
    hash = (37 * hash) + ACT_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getActIndex());
    hash = (37 * hash) + DISPOSITION_HEADER_FIELD_NUMBER;
    hash = (53 * hash) + getDispositionHeader().hashCode();
    hash = (37 * hash) + COMPARE_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getCompareValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.SimpleCompareExpression prototype) {
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
   * SimpleCompareExpression describes a simple compare expression
   * </pre>
   *
   * Protobuf type {@code api.commons.org.SimpleCompareExpression}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.SimpleCompareExpression)
      com.tcn.cloud.api.api.commons.org.SimpleCompareExpressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_SimpleCompareExpression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_SimpleCompareExpression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.SimpleCompareExpression.class, com.tcn.cloud.api.api.commons.org.SimpleCompareExpression.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.SimpleCompareExpression.newBuilder()
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
      operatorType_ = 0;
      actIndex_ = 0L;
      dispositionHeader_ = "";
      compareValue_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_SimpleCompareExpression_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.SimpleCompareExpression getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.SimpleCompareExpression.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.SimpleCompareExpression build() {
      com.tcn.cloud.api.api.commons.org.SimpleCompareExpression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.SimpleCompareExpression buildPartial() {
      com.tcn.cloud.api.api.commons.org.SimpleCompareExpression result = new com.tcn.cloud.api.api.commons.org.SimpleCompareExpression(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.SimpleCompareExpression result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operatorType_ = operatorType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.actIndex_ = actIndex_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dispositionHeader_ = dispositionHeader_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.compareValue_ = compareValue_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.org.SimpleCompareExpression) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.SimpleCompareExpression)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.SimpleCompareExpression other) {
      if (other == com.tcn.cloud.api.api.commons.org.SimpleCompareExpression.getDefaultInstance()) return this;
      if (other.operatorType_ != 0) {
        setOperatorTypeValue(other.getOperatorTypeValue());
      }
      if (other.getActIndex() != 0L) {
        setActIndex(other.getActIndex());
      }
      if (!other.getDispositionHeader().isEmpty()) {
        dispositionHeader_ = other.dispositionHeader_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getCompareValue().isEmpty()) {
        compareValue_ = other.compareValue_;
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
            case 8: {
              operatorType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              actIndex_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              dispositionHeader_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              compareValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int operatorType_ = 0;
    /**
     * <pre>
     * The operator type of SimpleCompareExpression
     * </pre>
     *
     * <code>.api.commons.org.CompareOperatorType operator_type = 1 [json_name = "operatorType"];</code>
     * @return The enum numeric value on the wire for operatorType.
     */
    @java.lang.Override public int getOperatorTypeValue() {
      return operatorType_;
    }
    /**
     * <pre>
     * The operator type of SimpleCompareExpression
     * </pre>
     *
     * <code>.api.commons.org.CompareOperatorType operator_type = 1 [json_name = "operatorType"];</code>
     * @param value The enum numeric value on the wire for operatorType to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorTypeValue(int value) {
      operatorType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operator type of SimpleCompareExpression
     * </pre>
     *
     * <code>.api.commons.org.CompareOperatorType operator_type = 1 [json_name = "operatorType"];</code>
     * @return The operatorType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.CompareOperatorType getOperatorType() {
      com.tcn.cloud.api.api.commons.org.CompareOperatorType result = com.tcn.cloud.api.api.commons.org.CompareOperatorType.forNumber(operatorType_);
      return result == null ? com.tcn.cloud.api.api.commons.org.CompareOperatorType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The operator type of SimpleCompareExpression
     * </pre>
     *
     * <code>.api.commons.org.CompareOperatorType operator_type = 1 [json_name = "operatorType"];</code>
     * @param value The operatorType to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorType(com.tcn.cloud.api.api.commons.org.CompareOperatorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      operatorType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operator type of SimpleCompareExpression
     * </pre>
     *
     * <code>.api.commons.org.CompareOperatorType operator_type = 1 [json_name = "operatorType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOperatorType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operatorType_ = 0;
      onChanged();
      return this;
    }

    private long actIndex_ ;
    /**
     * <pre>
     * The act index of the SimpleCompareExpression
     * </pre>
     *
     * <code>int64 act_index = 2 [json_name = "actIndex"];</code>
     * @return The actIndex.
     */
    @java.lang.Override
    public long getActIndex() {
      return actIndex_;
    }
    /**
     * <pre>
     * The act index of the SimpleCompareExpression
     * </pre>
     *
     * <code>int64 act_index = 2 [json_name = "actIndex"];</code>
     * @param value The actIndex to set.
     * @return This builder for chaining.
     */
    public Builder setActIndex(long value) {

      actIndex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The act index of the SimpleCompareExpression
     * </pre>
     *
     * <code>int64 act_index = 2 [json_name = "actIndex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearActIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      actIndex_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object dispositionHeader_ = "";
    /**
     * <pre>
     * The disposition header of the SimpleCompareExpression
     * </pre>
     *
     * <code>string disposition_header = 3 [json_name = "dispositionHeader"];</code>
     * @return The dispositionHeader.
     */
    public java.lang.String getDispositionHeader() {
      java.lang.Object ref = dispositionHeader_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dispositionHeader_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The disposition header of the SimpleCompareExpression
     * </pre>
     *
     * <code>string disposition_header = 3 [json_name = "dispositionHeader"];</code>
     * @return The bytes for dispositionHeader.
     */
    public com.google.protobuf.ByteString
        getDispositionHeaderBytes() {
      java.lang.Object ref = dispositionHeader_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dispositionHeader_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The disposition header of the SimpleCompareExpression
     * </pre>
     *
     * <code>string disposition_header = 3 [json_name = "dispositionHeader"];</code>
     * @param value The dispositionHeader to set.
     * @return This builder for chaining.
     */
    public Builder setDispositionHeader(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dispositionHeader_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The disposition header of the SimpleCompareExpression
     * </pre>
     *
     * <code>string disposition_header = 3 [json_name = "dispositionHeader"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDispositionHeader() {
      dispositionHeader_ = getDefaultInstance().getDispositionHeader();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The disposition header of the SimpleCompareExpression
     * </pre>
     *
     * <code>string disposition_header = 3 [json_name = "dispositionHeader"];</code>
     * @param value The bytes for dispositionHeader to set.
     * @return This builder for chaining.
     */
    public Builder setDispositionHeaderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dispositionHeader_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object compareValue_ = "";
    /**
     * <pre>
     * The compare value of the SimpleCompareExpression
     * </pre>
     *
     * <code>string compare_value = 4 [json_name = "compareValue"];</code>
     * @return The compareValue.
     */
    public java.lang.String getCompareValue() {
      java.lang.Object ref = compareValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        compareValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The compare value of the SimpleCompareExpression
     * </pre>
     *
     * <code>string compare_value = 4 [json_name = "compareValue"];</code>
     * @return The bytes for compareValue.
     */
    public com.google.protobuf.ByteString
        getCompareValueBytes() {
      java.lang.Object ref = compareValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        compareValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The compare value of the SimpleCompareExpression
     * </pre>
     *
     * <code>string compare_value = 4 [json_name = "compareValue"];</code>
     * @param value The compareValue to set.
     * @return This builder for chaining.
     */
    public Builder setCompareValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      compareValue_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The compare value of the SimpleCompareExpression
     * </pre>
     *
     * <code>string compare_value = 4 [json_name = "compareValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCompareValue() {
      compareValue_ = getDefaultInstance().getCompareValue();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The compare value of the SimpleCompareExpression
     * </pre>
     *
     * <code>string compare_value = 4 [json_name = "compareValue"];</code>
     * @param value The bytes for compareValue to set.
     * @return This builder for chaining.
     */
    public Builder setCompareValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      compareValue_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.SimpleCompareExpression)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.SimpleCompareExpression)
  private static final com.tcn.cloud.api.api.commons.org.SimpleCompareExpression DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.SimpleCompareExpression();
  }

  public static com.tcn.cloud.api.api.commons.org.SimpleCompareExpression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleCompareExpression>
      PARSER = new com.google.protobuf.AbstractParser<SimpleCompareExpression>() {
    @java.lang.Override
    public SimpleCompareExpression parsePartialFrom(
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

  public static com.google.protobuf.Parser<SimpleCompareExpression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimpleCompareExpression> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.SimpleCompareExpression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

