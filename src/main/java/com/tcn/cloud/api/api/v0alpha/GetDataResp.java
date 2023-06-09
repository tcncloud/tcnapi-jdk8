// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetDataResp}
 */
public final class GetDataResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetDataResp)
    GetDataRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDataResp.newBuilder() to construct.
  private GetDataResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDataResp() {
    data_ = java.util.Collections.emptyList();
    warnings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDataResp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetDataResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetDataResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetDataResp.class, com.tcn.cloud.api.api.v0alpha.GetDataResp.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData> data_;
  /**
   * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueDataOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
   */
  @java.lang.Override
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueDataOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
  }

  public static final int WARNINGS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.Warning> warnings_;
  /**
   * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.Warning> getWarningsList() {
    return warnings_;
  }
  /**
   * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.WarningOrBuilder> 
      getWarningsOrBuilderList() {
    return warnings_;
  }
  /**
   * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
   */
  @java.lang.Override
  public int getWarningsCount() {
    return warnings_.size();
  }
  /**
   * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Warning getWarnings(int index) {
    return warnings_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.WarningOrBuilder getWarningsOrBuilder(
      int index) {
    return warnings_.get(index);
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
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(1, data_.get(i));
    }
    for (int i = 0; i < warnings_.size(); i++) {
      output.writeMessage(2, warnings_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, data_.get(i));
    }
    for (int i = 0; i < warnings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, warnings_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetDataResp)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetDataResp other = (com.tcn.cloud.api.api.v0alpha.GetDataResp) obj;

    if (!getDataList()
        .equals(other.getDataList())) return false;
    if (!getWarningsList()
        .equals(other.getWarningsList())) return false;
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
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    if (getWarningsCount() > 0) {
      hash = (37 * hash) + WARNINGS_FIELD_NUMBER;
      hash = (53 * hash) + getWarningsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDataResp parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetDataResp prototype) {
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
   * Protobuf type {@code api.v0alpha.GetDataResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetDataResp)
      com.tcn.cloud.api.api.v0alpha.GetDataRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetDataResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetDataResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetDataResp.class, com.tcn.cloud.api.api.v0alpha.GetDataResp.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetDataResp.newBuilder()
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
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
      } else {
        data_ = null;
        dataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (warningsBuilder_ == null) {
        warnings_ = java.util.Collections.emptyList();
      } else {
        warnings_ = null;
        warningsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetDataResp_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetDataResp getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetDataResp.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetDataResp build() {
      com.tcn.cloud.api.api.v0alpha.GetDataResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetDataResp buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetDataResp result = new com.tcn.cloud.api.api.v0alpha.GetDataResp(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.GetDataResp result) {
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      if (warningsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          warnings_ = java.util.Collections.unmodifiableList(warnings_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.warnings_ = warnings_;
      } else {
        result.warnings_ = warningsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetDataResp result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetDataResp) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetDataResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetDataResp other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetDataResp.getDefaultInstance()) return this;
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
      }
      if (warningsBuilder_ == null) {
        if (!other.warnings_.isEmpty()) {
          if (warnings_.isEmpty()) {
            warnings_ = other.warnings_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureWarningsIsMutable();
            warnings_.addAll(other.warnings_);
          }
          onChanged();
        }
      } else {
        if (!other.warnings_.isEmpty()) {
          if (warningsBuilder_.isEmpty()) {
            warningsBuilder_.dispose();
            warningsBuilder_ = null;
            warnings_ = other.warnings_;
            bitField0_ = (bitField0_ & ~0x00000002);
            warningsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWarningsFieldBuilder() : null;
          } else {
            warningsBuilder_.addAllMessages(other.warnings_);
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
              com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.parser(),
                      extensionRegistry);
              if (dataBuilder_ == null) {
                ensureDataIsMutable();
                data_.add(m);
              } else {
                dataBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              com.tcn.cloud.api.api.v0alpha.Warning m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.Warning.parser(),
                      extensionRegistry);
              if (warningsBuilder_ == null) {
                ensureWarningsIsMutable();
                warnings_.add(m);
              } else {
                warningsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueDataOrBuilder> dataBuilder_;

    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public Builder setData(
        int index, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public Builder setData(
        int index, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public Builder addData(com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public Builder addData(
        int index, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public Builder addData(
        com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public Builder addData(
        int index, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueDataOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueDataOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.MultiCategoryMultiValueData data = 1 [json_name = "data"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueDataOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueData.Builder, com.tcn.cloud.api.api.v0alpha.MultiCategoryMultiValueDataOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    private java.util.List<com.tcn.cloud.api.api.v0alpha.Warning> warnings_ =
      java.util.Collections.emptyList();
    private void ensureWarningsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        warnings_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.Warning>(warnings_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Warning, com.tcn.cloud.api.api.v0alpha.Warning.Builder, com.tcn.cloud.api.api.v0alpha.WarningOrBuilder> warningsBuilder_;

    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Warning> getWarningsList() {
      if (warningsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(warnings_);
      } else {
        return warningsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public int getWarningsCount() {
      if (warningsBuilder_ == null) {
        return warnings_.size();
      } else {
        return warningsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Warning getWarnings(int index) {
      if (warningsBuilder_ == null) {
        return warnings_.get(index);
      } else {
        return warningsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public Builder setWarnings(
        int index, com.tcn.cloud.api.api.v0alpha.Warning value) {
      if (warningsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarningsIsMutable();
        warnings_.set(index, value);
        onChanged();
      } else {
        warningsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public Builder setWarnings(
        int index, com.tcn.cloud.api.api.v0alpha.Warning.Builder builderForValue) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        warnings_.set(index, builderForValue.build());
        onChanged();
      } else {
        warningsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public Builder addWarnings(com.tcn.cloud.api.api.v0alpha.Warning value) {
      if (warningsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarningsIsMutable();
        warnings_.add(value);
        onChanged();
      } else {
        warningsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public Builder addWarnings(
        int index, com.tcn.cloud.api.api.v0alpha.Warning value) {
      if (warningsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarningsIsMutable();
        warnings_.add(index, value);
        onChanged();
      } else {
        warningsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public Builder addWarnings(
        com.tcn.cloud.api.api.v0alpha.Warning.Builder builderForValue) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        warnings_.add(builderForValue.build());
        onChanged();
      } else {
        warningsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public Builder addWarnings(
        int index, com.tcn.cloud.api.api.v0alpha.Warning.Builder builderForValue) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        warnings_.add(index, builderForValue.build());
        onChanged();
      } else {
        warningsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public Builder addAllWarnings(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.Warning> values) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, warnings_);
        onChanged();
      } else {
        warningsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public Builder clearWarnings() {
      if (warningsBuilder_ == null) {
        warnings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        warningsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public Builder removeWarnings(int index) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        warnings_.remove(index);
        onChanged();
      } else {
        warningsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Warning.Builder getWarningsBuilder(
        int index) {
      return getWarningsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.WarningOrBuilder getWarningsOrBuilder(
        int index) {
      if (warningsBuilder_ == null) {
        return warnings_.get(index);  } else {
        return warningsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.WarningOrBuilder> 
         getWarningsOrBuilderList() {
      if (warningsBuilder_ != null) {
        return warningsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(warnings_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Warning.Builder addWarningsBuilder() {
      return getWarningsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.Warning.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Warning.Builder addWarningsBuilder(
        int index) {
      return getWarningsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.Warning.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Warning warnings = 2 [json_name = "warnings"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Warning.Builder> 
         getWarningsBuilderList() {
      return getWarningsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Warning, com.tcn.cloud.api.api.v0alpha.Warning.Builder, com.tcn.cloud.api.api.v0alpha.WarningOrBuilder> 
        getWarningsFieldBuilder() {
      if (warningsBuilder_ == null) {
        warningsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Warning, com.tcn.cloud.api.api.v0alpha.Warning.Builder, com.tcn.cloud.api.api.v0alpha.WarningOrBuilder>(
                warnings_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        warnings_ = null;
      }
      return warningsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetDataResp)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetDataResp)
  private static final com.tcn.cloud.api.api.v0alpha.GetDataResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetDataResp();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetDataResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDataResp>
      PARSER = new com.google.protobuf.AbstractParser<GetDataResp>() {
    @java.lang.Override
    public GetDataResp parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDataResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDataResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetDataResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

