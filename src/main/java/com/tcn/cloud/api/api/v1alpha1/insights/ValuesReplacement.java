// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * <pre>
 * ValuesReplacement
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.insights.ValuesReplacement}
 */
@java.lang.Deprecated public final class ValuesReplacement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.insights.ValuesReplacement)
    ValuesReplacementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValuesReplacement.newBuilder() to construct.
  private ValuesReplacement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValuesReplacement() {
    targetValue_ = "";
    targetDataType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValuesReplacement();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ValuesReplacement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ValuesReplacement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement.class, com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement.Builder.class);
  }

  public static final int TARGET_VALUE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object targetValue_ = "";
  /**
   * <pre>
   * Value in the column to replace
   * </pre>
   *
   * <code>string target_value = 1 [json_name = "targetValue"];</code>
   * @return The targetValue.
   */
  @java.lang.Override
  public java.lang.String getTargetValue() {
    java.lang.Object ref = targetValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Value in the column to replace
   * </pre>
   *
   * <code>string target_value = 1 [json_name = "targetValue"];</code>
   * @return The bytes for targetValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetValueBytes() {
    java.lang.Object ref = targetValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_DATA_TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object targetDataType_ = "";
  /**
   * <pre>
   * Target data type of replacement
   * </pre>
   *
   * <code>string target_data_type = 2 [json_name = "targetDataType"];</code>
   * @return The targetDataType.
   */
  @java.lang.Override
  public java.lang.String getTargetDataType() {
    java.lang.Object ref = targetDataType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetDataType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Target data type of replacement
   * </pre>
   *
   * <code>string target_data_type = 2 [json_name = "targetDataType"];</code>
   * @return The bytes for targetDataType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetDataTypeBytes() {
    java.lang.Object ref = targetDataType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetDataType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPLACEMENT_VALUE_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode replacementValue_;
  /**
   * <pre>
   * Result of the replacement
   * </pre>
   *
   * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
   * @return Whether the replacementValue field is set.
   */
  @java.lang.Override
  public boolean hasReplacementValue() {
    return replacementValue_ != null;
  }
  /**
   * <pre>
   * Result of the replacement
   * </pre>
   *
   * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
   * @return The replacementValue.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode getReplacementValue() {
    return replacementValue_ == null ? com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.getDefaultInstance() : replacementValue_;
  }
  /**
   * <pre>
   * Result of the replacement
   * </pre>
   *
   * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNodeOrBuilder getReplacementValueOrBuilder() {
    return replacementValue_ == null ? com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.getDefaultInstance() : replacementValue_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, targetValue_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetDataType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, targetDataType_);
    }
    if (replacementValue_ != null) {
      output.writeMessage(3, getReplacementValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, targetValue_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetDataType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, targetDataType_);
    }
    if (replacementValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getReplacementValue());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement other = (com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement) obj;

    if (!getTargetValue()
        .equals(other.getTargetValue())) return false;
    if (!getTargetDataType()
        .equals(other.getTargetDataType())) return false;
    if (hasReplacementValue() != other.hasReplacementValue()) return false;
    if (hasReplacementValue()) {
      if (!getReplacementValue()
          .equals(other.getReplacementValue())) return false;
    }
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
    hash = (37 * hash) + TARGET_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getTargetValue().hashCode();
    hash = (37 * hash) + TARGET_DATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getTargetDataType().hashCode();
    if (hasReplacementValue()) {
      hash = (37 * hash) + REPLACEMENT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getReplacementValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement prototype) {
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
   * ValuesReplacement
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.insights.ValuesReplacement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.insights.ValuesReplacement)
      com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ValuesReplacement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ValuesReplacement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement.class, com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement.newBuilder()
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
      targetValue_ = "";
      targetDataType_ = "";
      replacementValue_ = null;
      if (replacementValueBuilder_ != null) {
        replacementValueBuilder_.dispose();
        replacementValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ValuesReplacement_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement build() {
      com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement result = new com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetValue_ = targetValue_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetDataType_ = targetDataType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.replacementValue_ = replacementValueBuilder_ == null
            ? replacementValue_
            : replacementValueBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement.getDefaultInstance()) return this;
      if (!other.getTargetValue().isEmpty()) {
        targetValue_ = other.targetValue_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTargetDataType().isEmpty()) {
        targetDataType_ = other.targetDataType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasReplacementValue()) {
        mergeReplacementValue(other.getReplacementValue());
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
              targetValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              targetDataType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getReplacementValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object targetValue_ = "";
    /**
     * <pre>
     * Value in the column to replace
     * </pre>
     *
     * <code>string target_value = 1 [json_name = "targetValue"];</code>
     * @return The targetValue.
     */
    public java.lang.String getTargetValue() {
      java.lang.Object ref = targetValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Value in the column to replace
     * </pre>
     *
     * <code>string target_value = 1 [json_name = "targetValue"];</code>
     * @return The bytes for targetValue.
     */
    public com.google.protobuf.ByteString
        getTargetValueBytes() {
      java.lang.Object ref = targetValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Value in the column to replace
     * </pre>
     *
     * <code>string target_value = 1 [json_name = "targetValue"];</code>
     * @param value The targetValue to set.
     * @return This builder for chaining.
     */
    public Builder setTargetValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      targetValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value in the column to replace
     * </pre>
     *
     * <code>string target_value = 1 [json_name = "targetValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetValue() {
      targetValue_ = getDefaultInstance().getTargetValue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value in the column to replace
     * </pre>
     *
     * <code>string target_value = 1 [json_name = "targetValue"];</code>
     * @param value The bytes for targetValue to set.
     * @return This builder for chaining.
     */
    public Builder setTargetValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      targetValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object targetDataType_ = "";
    /**
     * <pre>
     * Target data type of replacement
     * </pre>
     *
     * <code>string target_data_type = 2 [json_name = "targetDataType"];</code>
     * @return The targetDataType.
     */
    public java.lang.String getTargetDataType() {
      java.lang.Object ref = targetDataType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetDataType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Target data type of replacement
     * </pre>
     *
     * <code>string target_data_type = 2 [json_name = "targetDataType"];</code>
     * @return The bytes for targetDataType.
     */
    public com.google.protobuf.ByteString
        getTargetDataTypeBytes() {
      java.lang.Object ref = targetDataType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetDataType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Target data type of replacement
     * </pre>
     *
     * <code>string target_data_type = 2 [json_name = "targetDataType"];</code>
     * @param value The targetDataType to set.
     * @return This builder for chaining.
     */
    public Builder setTargetDataType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      targetDataType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target data type of replacement
     * </pre>
     *
     * <code>string target_data_type = 2 [json_name = "targetDataType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetDataType() {
      targetDataType_ = getDefaultInstance().getTargetDataType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target data type of replacement
     * </pre>
     *
     * <code>string target_data_type = 2 [json_name = "targetDataType"];</code>
     * @param value The bytes for targetDataType to set.
     * @return This builder for chaining.
     */
    public Builder setTargetDataTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      targetDataType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode replacementValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode, com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.Builder, com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNodeOrBuilder> replacementValueBuilder_;
    /**
     * <pre>
     * Result of the replacement
     * </pre>
     *
     * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
     * @return Whether the replacementValue field is set.
     */
    public boolean hasReplacementValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Result of the replacement
     * </pre>
     *
     * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
     * @return The replacementValue.
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode getReplacementValue() {
      if (replacementValueBuilder_ == null) {
        return replacementValue_ == null ? com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.getDefaultInstance() : replacementValue_;
      } else {
        return replacementValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Result of the replacement
     * </pre>
     *
     * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
     */
    public Builder setReplacementValue(com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode value) {
      if (replacementValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        replacementValue_ = value;
      } else {
        replacementValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result of the replacement
     * </pre>
     *
     * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
     */
    public Builder setReplacementValue(
        com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.Builder builderForValue) {
      if (replacementValueBuilder_ == null) {
        replacementValue_ = builderForValue.build();
      } else {
        replacementValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result of the replacement
     * </pre>
     *
     * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
     */
    public Builder mergeReplacementValue(com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode value) {
      if (replacementValueBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          replacementValue_ != null &&
          replacementValue_ != com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.getDefaultInstance()) {
          getReplacementValueBuilder().mergeFrom(value);
        } else {
          replacementValue_ = value;
        }
      } else {
        replacementValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result of the replacement
     * </pre>
     *
     * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
     */
    public Builder clearReplacementValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      replacementValue_ = null;
      if (replacementValueBuilder_ != null) {
        replacementValueBuilder_.dispose();
        replacementValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result of the replacement
     * </pre>
     *
     * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.Builder getReplacementValueBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getReplacementValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Result of the replacement
     * </pre>
     *
     * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNodeOrBuilder getReplacementValueOrBuilder() {
      if (replacementValueBuilder_ != null) {
        return replacementValueBuilder_.getMessageOrBuilder();
      } else {
        return replacementValue_ == null ?
            com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.getDefaultInstance() : replacementValue_;
      }
    }
    /**
     * <pre>
     * Result of the replacement
     * </pre>
     *
     * <code>.api.v1alpha1.insights.ExpressionNode replacement_value = 3 [json_name = "replacementValue"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode, com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.Builder, com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNodeOrBuilder> 
        getReplacementValueFieldBuilder() {
      if (replacementValueBuilder_ == null) {
        replacementValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode, com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNode.Builder, com.tcn.cloud.api.api.v1alpha1.insights.ExpressionNodeOrBuilder>(
                getReplacementValue(),
                getParentForChildren(),
                isClean());
        replacementValue_ = null;
      }
      return replacementValueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.insights.ValuesReplacement)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.insights.ValuesReplacement)
  private static final com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement();
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValuesReplacement>
      PARSER = new com.google.protobuf.AbstractParser<ValuesReplacement>() {
    @java.lang.Override
    public ValuesReplacement parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValuesReplacement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValuesReplacement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.ValuesReplacement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

