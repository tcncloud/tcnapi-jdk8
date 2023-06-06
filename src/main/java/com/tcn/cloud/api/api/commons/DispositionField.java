// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/compliance.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.DispositionField}
 */
public final class DispositionField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.DispositionField)
    DispositionFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DispositionField.newBuilder() to construct.
  private DispositionField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DispositionField() {
    key_ = "";
    value_ = "";
    pairs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DispositionField();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_DispositionField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_DispositionField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.DispositionField.class, com.tcn.cloud.api.api.commons.DispositionField.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAIRS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.DispositionPair> pairs_;
  /**
   * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.DispositionPair> getPairsList() {
    return pairs_;
  }
  /**
   * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.DispositionPairOrBuilder> 
      getPairsOrBuilderList() {
    return pairs_;
  }
  /**
   * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
   */
  @java.lang.Override
  public int getPairsCount() {
    return pairs_.size();
  }
  /**
   * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DispositionPair getPairs(int index) {
    return pairs_.get(index);
  }
  /**
   * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DispositionPairOrBuilder getPairsOrBuilder(
      int index) {
    return pairs_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    for (int i = 0; i < pairs_.size(); i++) {
      output.writeMessage(3, pairs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
    }
    for (int i = 0; i < pairs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, pairs_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.DispositionField)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.DispositionField other = (com.tcn.cloud.api.api.commons.DispositionField) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (!getPairsList()
        .equals(other.getPairsList())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    if (getPairsCount() > 0) {
      hash = (37 * hash) + PAIRS_FIELD_NUMBER;
      hash = (53 * hash) + getPairsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.DispositionField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.DispositionField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DispositionField parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.DispositionField prototype) {
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
   * Protobuf type {@code api.commons.DispositionField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.DispositionField)
      com.tcn.cloud.api.api.commons.DispositionFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_DispositionField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_DispositionField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.DispositionField.class, com.tcn.cloud.api.api.commons.DispositionField.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.DispositionField.newBuilder()
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
      key_ = "";
      value_ = "";
      if (pairsBuilder_ == null) {
        pairs_ = java.util.Collections.emptyList();
      } else {
        pairs_ = null;
        pairsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_DispositionField_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DispositionField getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.DispositionField.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DispositionField build() {
      com.tcn.cloud.api.api.commons.DispositionField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DispositionField buildPartial() {
      com.tcn.cloud.api.api.commons.DispositionField result = new com.tcn.cloud.api.api.commons.DispositionField(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.DispositionField result) {
      if (pairsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          pairs_ = java.util.Collections.unmodifiableList(pairs_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.pairs_ = pairs_;
      } else {
        result.pairs_ = pairsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.DispositionField result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.DispositionField) {
        return mergeFrom((com.tcn.cloud.api.api.commons.DispositionField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.DispositionField other) {
      if (other == com.tcn.cloud.api.api.commons.DispositionField.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (pairsBuilder_ == null) {
        if (!other.pairs_.isEmpty()) {
          if (pairs_.isEmpty()) {
            pairs_ = other.pairs_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensurePairsIsMutable();
            pairs_.addAll(other.pairs_);
          }
          onChanged();
        }
      } else {
        if (!other.pairs_.isEmpty()) {
          if (pairsBuilder_.isEmpty()) {
            pairsBuilder_.dispose();
            pairsBuilder_ = null;
            pairs_ = other.pairs_;
            bitField0_ = (bitField0_ & ~0x00000004);
            pairsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPairsFieldBuilder() : null;
          } else {
            pairsBuilder_.addAllMessages(other.pairs_);
          }
        }
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
              key_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              value_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.tcn.cloud.api.api.commons.DispositionPair m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.DispositionPair.parser(),
                      extensionRegistry);
              if (pairsBuilder_ == null) {
                ensurePairsIsMutable();
                pairs_.add(m);
              } else {
                pairsBuilder_.addMessage(m);
              }
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

    private java.lang.Object key_ = "";
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 2 [json_name = "value"];</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 2 [json_name = "value"];</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 2 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 2 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string value = 2 [json_name = "value"];</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.commons.DispositionPair> pairs_ =
      java.util.Collections.emptyList();
    private void ensurePairsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        pairs_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.DispositionPair>(pairs_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DispositionPair, com.tcn.cloud.api.api.commons.DispositionPair.Builder, com.tcn.cloud.api.api.commons.DispositionPairOrBuilder> pairsBuilder_;

    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.DispositionPair> getPairsList() {
      if (pairsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pairs_);
      } else {
        return pairsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public int getPairsCount() {
      if (pairsBuilder_ == null) {
        return pairs_.size();
      } else {
        return pairsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public com.tcn.cloud.api.api.commons.DispositionPair getPairs(int index) {
      if (pairsBuilder_ == null) {
        return pairs_.get(index);
      } else {
        return pairsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public Builder setPairs(
        int index, com.tcn.cloud.api.api.commons.DispositionPair value) {
      if (pairsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePairsIsMutable();
        pairs_.set(index, value);
        onChanged();
      } else {
        pairsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public Builder setPairs(
        int index, com.tcn.cloud.api.api.commons.DispositionPair.Builder builderForValue) {
      if (pairsBuilder_ == null) {
        ensurePairsIsMutable();
        pairs_.set(index, builderForValue.build());
        onChanged();
      } else {
        pairsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public Builder addPairs(com.tcn.cloud.api.api.commons.DispositionPair value) {
      if (pairsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePairsIsMutable();
        pairs_.add(value);
        onChanged();
      } else {
        pairsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public Builder addPairs(
        int index, com.tcn.cloud.api.api.commons.DispositionPair value) {
      if (pairsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePairsIsMutable();
        pairs_.add(index, value);
        onChanged();
      } else {
        pairsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public Builder addPairs(
        com.tcn.cloud.api.api.commons.DispositionPair.Builder builderForValue) {
      if (pairsBuilder_ == null) {
        ensurePairsIsMutable();
        pairs_.add(builderForValue.build());
        onChanged();
      } else {
        pairsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public Builder addPairs(
        int index, com.tcn.cloud.api.api.commons.DispositionPair.Builder builderForValue) {
      if (pairsBuilder_ == null) {
        ensurePairsIsMutable();
        pairs_.add(index, builderForValue.build());
        onChanged();
      } else {
        pairsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public Builder addAllPairs(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.DispositionPair> values) {
      if (pairsBuilder_ == null) {
        ensurePairsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pairs_);
        onChanged();
      } else {
        pairsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public Builder clearPairs() {
      if (pairsBuilder_ == null) {
        pairs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        pairsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public Builder removePairs(int index) {
      if (pairsBuilder_ == null) {
        ensurePairsIsMutable();
        pairs_.remove(index);
        onChanged();
      } else {
        pairsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public com.tcn.cloud.api.api.commons.DispositionPair.Builder getPairsBuilder(
        int index) {
      return getPairsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public com.tcn.cloud.api.api.commons.DispositionPairOrBuilder getPairsOrBuilder(
        int index) {
      if (pairsBuilder_ == null) {
        return pairs_.get(index);  } else {
        return pairsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.DispositionPairOrBuilder> 
         getPairsOrBuilderList() {
      if (pairsBuilder_ != null) {
        return pairsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pairs_);
      }
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public com.tcn.cloud.api.api.commons.DispositionPair.Builder addPairsBuilder() {
      return getPairsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.DispositionPair.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public com.tcn.cloud.api.api.commons.DispositionPair.Builder addPairsBuilder(
        int index) {
      return getPairsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.DispositionPair.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.DispositionPair pairs = 3 [json_name = "pairs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.DispositionPair.Builder> 
         getPairsBuilderList() {
      return getPairsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.DispositionPair, com.tcn.cloud.api.api.commons.DispositionPair.Builder, com.tcn.cloud.api.api.commons.DispositionPairOrBuilder> 
        getPairsFieldBuilder() {
      if (pairsBuilder_ == null) {
        pairsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.DispositionPair, com.tcn.cloud.api.api.commons.DispositionPair.Builder, com.tcn.cloud.api.api.commons.DispositionPairOrBuilder>(
                pairs_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        pairs_ = null;
      }
      return pairsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.DispositionField)
  }

  // @@protoc_insertion_point(class_scope:api.commons.DispositionField)
  private static final com.tcn.cloud.api.api.commons.DispositionField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.DispositionField();
  }

  public static com.tcn.cloud.api.api.commons.DispositionField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DispositionField>
      PARSER = new com.google.protobuf.AbstractParser<DispositionField>() {
    @java.lang.Override
    public DispositionField parsePartialFrom(
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

  public static com.google.protobuf.Parser<DispositionField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DispositionField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DispositionField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

