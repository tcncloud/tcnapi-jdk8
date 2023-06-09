// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetScriptOrResponsesReq}
 */
public final class GetScriptOrResponsesReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetScriptOrResponsesReq)
    GetScriptOrResponsesReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetScriptOrResponsesReq.newBuilder() to construct.
  private GetScriptOrResponsesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetScriptOrResponsesReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetScriptOrResponsesReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetScriptOrResponsesReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetScriptOrResponsesReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq.class, com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.MailMergeData data_;
  /**
   * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.MailMergeData getData() {
    return data_ == null ? com.tcn.cloud.api.api.v0alpha.MailMergeData.getDefaultInstance() : data_;
  }
  /**
   * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.MailMergeDataOrBuilder getDataOrBuilder() {
    return data_ == null ? com.tcn.cloud.api.api.v0alpha.MailMergeData.getDefaultInstance() : data_;
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
    if (data_ != null) {
      output.writeMessage(1, getData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getData());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq other = (com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq) obj;

    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq prototype) {
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
   * Protobuf type {@code api.v0alpha.GetScriptOrResponsesReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetScriptOrResponsesReq)
      com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetScriptOrResponsesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetScriptOrResponsesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq.class, com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq.newBuilder()
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
      data_ = null;
      if (dataBuilder_ != null) {
        dataBuilder_.dispose();
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetScriptOrResponsesReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq build() {
      com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq result = new com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.data_ = dataBuilder_ == null
            ? data_
            : dataBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq.getDefaultInstance()) return this;
      if (other.hasData()) {
        mergeData(other.getData());
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
                  getDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.api.v0alpha.MailMergeData data_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.MailMergeData, com.tcn.cloud.api.api.v0alpha.MailMergeData.Builder, com.tcn.cloud.api.api.v0alpha.MailMergeDataOrBuilder> dataBuilder_;
    /**
     * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
     * @return Whether the data field is set.
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
     * @return The data.
     */
    public com.tcn.cloud.api.api.v0alpha.MailMergeData getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.tcn.cloud.api.api.v0alpha.MailMergeData.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
     */
    public Builder setData(com.tcn.cloud.api.api.v0alpha.MailMergeData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
      } else {
        dataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
     */
    public Builder setData(
        com.tcn.cloud.api.api.v0alpha.MailMergeData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
     */
    public Builder mergeData(com.tcn.cloud.api.api.v0alpha.MailMergeData value) {
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          data_ != null &&
          data_ != com.tcn.cloud.api.api.v0alpha.MailMergeData.getDefaultInstance()) {
          getDataBuilder().mergeFrom(value);
        } else {
          data_ = value;
        }
      } else {
        dataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      data_ = null;
      if (dataBuilder_ != null) {
        dataBuilder_.dispose();
        dataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.MailMergeData.Builder getDataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.MailMergeDataOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.tcn.cloud.api.api.v0alpha.MailMergeData.getDefaultInstance() : data_;
      }
    }
    /**
     * <code>.api.v0alpha.MailMergeData data = 1 [json_name = "data"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.MailMergeData, com.tcn.cloud.api.api.v0alpha.MailMergeData.Builder, com.tcn.cloud.api.api.v0alpha.MailMergeDataOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.MailMergeData, com.tcn.cloud.api.api.v0alpha.MailMergeData.Builder, com.tcn.cloud.api.api.v0alpha.MailMergeDataOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetScriptOrResponsesReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetScriptOrResponsesReq)
  private static final com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetScriptOrResponsesReq>
      PARSER = new com.google.protobuf.AbstractParser<GetScriptOrResponsesReq>() {
    @java.lang.Override
    public GetScriptOrResponsesReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetScriptOrResponsesReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetScriptOrResponsesReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

