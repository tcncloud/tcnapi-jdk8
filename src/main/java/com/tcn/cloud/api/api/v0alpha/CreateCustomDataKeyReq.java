// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request message for the CreateCustomDataKey RPC
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.CreateCustomDataKeyReq}
 */
public final class CreateCustomDataKeyReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateCustomDataKeyReq)
    CreateCustomDataKeyReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCustomDataKeyReq.newBuilder() to construct.
  private CreateCustomDataKeyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCustomDataKeyReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCustomDataKeyReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateCustomDataKeyReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateCustomDataKeyReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq.class, com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq.Builder.class);
  }

  public static final int DATA_KEY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.CustomDataKey dataKey_;
  /**
   * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
   * @return Whether the dataKey field is set.
   */
  @java.lang.Override
  public boolean hasDataKey() {
    return dataKey_ != null;
  }
  /**
   * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
   * @return The dataKey.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CustomDataKey getDataKey() {
    return dataKey_ == null ? com.tcn.cloud.api.api.v0alpha.CustomDataKey.getDefaultInstance() : dataKey_;
  }
  /**
   * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CustomDataKeyOrBuilder getDataKeyOrBuilder() {
    return dataKey_ == null ? com.tcn.cloud.api.api.v0alpha.CustomDataKey.getDefaultInstance() : dataKey_;
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
    if (dataKey_ != null) {
      output.writeMessage(1, getDataKey());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDataKey());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq other = (com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq) obj;

    if (hasDataKey() != other.hasDataKey()) return false;
    if (hasDataKey()) {
      if (!getDataKey()
          .equals(other.getDataKey())) return false;
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
    if (hasDataKey()) {
      hash = (37 * hash) + DATA_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getDataKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq prototype) {
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
   * Request message for the CreateCustomDataKey RPC
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.CreateCustomDataKeyReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateCustomDataKeyReq)
      com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateCustomDataKeyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateCustomDataKeyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq.class, com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq.newBuilder()
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
      dataKey_ = null;
      if (dataKeyBuilder_ != null) {
        dataKeyBuilder_.dispose();
        dataKeyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_CreateCustomDataKeyReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq result = new com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataKey_ = dataKeyBuilder_ == null
            ? dataKey_
            : dataKeyBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq.getDefaultInstance()) return this;
      if (other.hasDataKey()) {
        mergeDataKey(other.getDataKey());
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
                  getDataKeyFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.CustomDataKey dataKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CustomDataKey, com.tcn.cloud.api.api.v0alpha.CustomDataKey.Builder, com.tcn.cloud.api.api.v0alpha.CustomDataKeyOrBuilder> dataKeyBuilder_;
    /**
     * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
     * @return Whether the dataKey field is set.
     */
    public boolean hasDataKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
     * @return The dataKey.
     */
    public com.tcn.cloud.api.api.v0alpha.CustomDataKey getDataKey() {
      if (dataKeyBuilder_ == null) {
        return dataKey_ == null ? com.tcn.cloud.api.api.v0alpha.CustomDataKey.getDefaultInstance() : dataKey_;
      } else {
        return dataKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
     */
    public Builder setDataKey(com.tcn.cloud.api.api.v0alpha.CustomDataKey value) {
      if (dataKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataKey_ = value;
      } else {
        dataKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
     */
    public Builder setDataKey(
        com.tcn.cloud.api.api.v0alpha.CustomDataKey.Builder builderForValue) {
      if (dataKeyBuilder_ == null) {
        dataKey_ = builderForValue.build();
      } else {
        dataKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
     */
    public Builder mergeDataKey(com.tcn.cloud.api.api.v0alpha.CustomDataKey value) {
      if (dataKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dataKey_ != null &&
          dataKey_ != com.tcn.cloud.api.api.v0alpha.CustomDataKey.getDefaultInstance()) {
          getDataKeyBuilder().mergeFrom(value);
        } else {
          dataKey_ = value;
        }
      } else {
        dataKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
     */
    public Builder clearDataKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataKey_ = null;
      if (dataKeyBuilder_ != null) {
        dataKeyBuilder_.dispose();
        dataKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CustomDataKey.Builder getDataKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CustomDataKeyOrBuilder getDataKeyOrBuilder() {
      if (dataKeyBuilder_ != null) {
        return dataKeyBuilder_.getMessageOrBuilder();
      } else {
        return dataKey_ == null ?
            com.tcn.cloud.api.api.v0alpha.CustomDataKey.getDefaultInstance() : dataKey_;
      }
    }
    /**
     * <code>.api.v0alpha.CustomDataKey data_key = 1 [json_name = "dataKey"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CustomDataKey, com.tcn.cloud.api.api.v0alpha.CustomDataKey.Builder, com.tcn.cloud.api.api.v0alpha.CustomDataKeyOrBuilder> 
        getDataKeyFieldBuilder() {
      if (dataKeyBuilder_ == null) {
        dataKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.CustomDataKey, com.tcn.cloud.api.api.v0alpha.CustomDataKey.Builder, com.tcn.cloud.api.api.v0alpha.CustomDataKeyOrBuilder>(
                getDataKey(),
                getParentForChildren(),
                isClean());
        dataKey_ = null;
      }
      return dataKeyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateCustomDataKeyReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateCustomDataKeyReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomDataKeyReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateCustomDataKeyReq>() {
    @java.lang.Override
    public CreateCustomDataKeyReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCustomDataKeyReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomDataKeyReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

