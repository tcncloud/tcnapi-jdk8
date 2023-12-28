// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * SchedulingResultMetricKeyValue implements a map with a complex key.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.SchedulingResultMetricKeyValue}
 */
public final class SchedulingResultMetricKeyValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.SchedulingResultMetricKeyValue)
    SchedulingResultMetricKeyValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SchedulingResultMetricKeyValue.newBuilder() to construct.
  private SchedulingResultMetricKeyValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SchedulingResultMetricKeyValue() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SchedulingResultMetricKeyValue();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SchedulingResultMetricKeyValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SchedulingResultMetricKeyValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue.class, com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.SkillProfileCategory key_;
  /**
   * <pre>
   * Key.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   * <pre>
   * Key.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SkillProfileCategory getKey() {
    return key_ == null ? com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance() : key_;
  }
  /**
   * <pre>
   * Key.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getKeyOrBuilder() {
    return key_ == null ? com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance() : key_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric value_;
  /**
   * <pre>
   * Value.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * Value.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric getValue() {
    return value_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * Value.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetricOrBuilder getValueOrBuilder() {
    return value_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.getDefaultInstance() : value_;
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
    if (key_ != null) {
      output.writeMessage(1, getKey());
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue other = (com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue prototype) {
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
   * SchedulingResultMetricKeyValue implements a map with a complex key.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.SchedulingResultMetricKeyValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.SchedulingResultMetricKeyValue)
      com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SchedulingResultMetricKeyValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SchedulingResultMetricKeyValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue.class, com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue.newBuilder()
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
      key_ = null;
      if (keyBuilder_ != null) {
        keyBuilder_.dispose();
        keyBuilder_ = null;
      }
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_SchedulingResultMetricKeyValue_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue result = new com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = keyBuilder_ == null
            ? key_
            : keyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = valueBuilder_ == null
            ? value_
            : valueBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
              input.readMessage(
                  getKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private com.tcn.cloud.api.api.commons.SkillProfileCategory key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SkillProfileCategory, com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder, com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder> keyBuilder_;
    /**
     * <pre>
     * Key.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Key.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
     * @return The key.
     */
    public com.tcn.cloud.api.api.commons.SkillProfileCategory getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Key.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
     */
    public Builder setKey(com.tcn.cloud.api.api.commons.SkillProfileCategory value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
      } else {
        keyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
     */
    public Builder setKey(
        com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
     */
    public Builder mergeKey(com.tcn.cloud.api.api.commons.SkillProfileCategory value) {
      if (keyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          key_ != null &&
          key_ != com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance()) {
          getKeyBuilder().mergeFrom(value);
        } else {
          key_ = value;
        }
      } else {
        keyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      key_ = null;
      if (keyBuilder_ != null) {
        keyBuilder_.dispose();
        keyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
     */
    public com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder getKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Key.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
     */
    public com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance() : key_;
      }
    }
    /**
     * <pre>
     * Key.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory key = 1 [json_name = "key"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SkillProfileCategory, com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder, com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.SkillProfileCategory, com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder, com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric, com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetricOrBuilder> valueBuilder_;
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
     * @return The value.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
     */
    public Builder setValue(com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
     */
    public Builder setValue(
        com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
     */
    public Builder mergeValue(com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          value_ != null &&
          value_ != com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.getDefaultInstance()) {
          getValueBuilder().mergeFrom(value);
        } else {
          value_ = value;
        }
      } else {
        valueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetricOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.BasicSchedulingResultMetric value = 2 [json_name = "value"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric, com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetricOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric, com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetric.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.BasicSchedulingResultMetricOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.SchedulingResultMetricKeyValue)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.SchedulingResultMetricKeyValue)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SchedulingResultMetricKeyValue>
      PARSER = new com.google.protobuf.AbstractParser<SchedulingResultMetricKeyValue>() {
    @java.lang.Override
    public SchedulingResultMetricKeyValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<SchedulingResultMetricKeyValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SchedulingResultMetricKeyValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.SchedulingResultMetricKeyValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

