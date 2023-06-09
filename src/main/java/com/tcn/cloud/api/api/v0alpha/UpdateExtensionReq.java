// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateExtensionReq}
 */
public final class UpdateExtensionReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateExtensionReq)
    UpdateExtensionReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateExtensionReq.newBuilder() to construct.
  private UpdateExtensionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateExtensionReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateExtensionReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateExtensionReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateExtensionReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq.class, com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq.Builder.class);
  }

  public static final int EXTENSION_MESSAGE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.Extension extensionMessage_;
  /**
   * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
   * @return Whether the extensionMessage field is set.
   */
  @java.lang.Override
  public boolean hasExtensionMessage() {
    return extensionMessage_ != null;
  }
  /**
   * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
   * @return The extensionMessage.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Extension getExtensionMessage() {
    return extensionMessage_ == null ? com.tcn.cloud.api.api.v0alpha.Extension.getDefaultInstance() : extensionMessage_;
  }
  /**
   * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ExtensionOrBuilder getExtensionMessageOrBuilder() {
    return extensionMessage_ == null ? com.tcn.cloud.api.api.v0alpha.Extension.getDefaultInstance() : extensionMessage_;
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
    if (extensionMessage_ != null) {
      output.writeMessage(1, getExtensionMessage());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (extensionMessage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExtensionMessage());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq other = (com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq) obj;

    if (hasExtensionMessage() != other.hasExtensionMessage()) return false;
    if (hasExtensionMessage()) {
      if (!getExtensionMessage()
          .equals(other.getExtensionMessage())) return false;
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
    if (hasExtensionMessage()) {
      hash = (37 * hash) + EXTENSION_MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionMessage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateExtensionReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateExtensionReq)
      com.tcn.cloud.api.api.v0alpha.UpdateExtensionReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateExtensionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateExtensionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq.class, com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq.newBuilder()
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
      extensionMessage_ = null;
      if (extensionMessageBuilder_ != null) {
        extensionMessageBuilder_.dispose();
        extensionMessageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateExtensionReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq result = new com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.extensionMessage_ = extensionMessageBuilder_ == null
            ? extensionMessage_
            : extensionMessageBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq.getDefaultInstance()) return this;
      if (other.hasExtensionMessage()) {
        mergeExtensionMessage(other.getExtensionMessage());
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
                  getExtensionMessageFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.Extension extensionMessage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Extension, com.tcn.cloud.api.api.v0alpha.Extension.Builder, com.tcn.cloud.api.api.v0alpha.ExtensionOrBuilder> extensionMessageBuilder_;
    /**
     * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
     * @return Whether the extensionMessage field is set.
     */
    public boolean hasExtensionMessage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
     * @return The extensionMessage.
     */
    public com.tcn.cloud.api.api.v0alpha.Extension getExtensionMessage() {
      if (extensionMessageBuilder_ == null) {
        return extensionMessage_ == null ? com.tcn.cloud.api.api.v0alpha.Extension.getDefaultInstance() : extensionMessage_;
      } else {
        return extensionMessageBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
     */
    public Builder setExtensionMessage(com.tcn.cloud.api.api.v0alpha.Extension value) {
      if (extensionMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        extensionMessage_ = value;
      } else {
        extensionMessageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
     */
    public Builder setExtensionMessage(
        com.tcn.cloud.api.api.v0alpha.Extension.Builder builderForValue) {
      if (extensionMessageBuilder_ == null) {
        extensionMessage_ = builderForValue.build();
      } else {
        extensionMessageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
     */
    public Builder mergeExtensionMessage(com.tcn.cloud.api.api.v0alpha.Extension value) {
      if (extensionMessageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          extensionMessage_ != null &&
          extensionMessage_ != com.tcn.cloud.api.api.v0alpha.Extension.getDefaultInstance()) {
          getExtensionMessageBuilder().mergeFrom(value);
        } else {
          extensionMessage_ = value;
        }
      } else {
        extensionMessageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
     */
    public Builder clearExtensionMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      extensionMessage_ = null;
      if (extensionMessageBuilder_ != null) {
        extensionMessageBuilder_.dispose();
        extensionMessageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Extension.Builder getExtensionMessageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExtensionMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ExtensionOrBuilder getExtensionMessageOrBuilder() {
      if (extensionMessageBuilder_ != null) {
        return extensionMessageBuilder_.getMessageOrBuilder();
      } else {
        return extensionMessage_ == null ?
            com.tcn.cloud.api.api.v0alpha.Extension.getDefaultInstance() : extensionMessage_;
      }
    }
    /**
     * <code>.api.v0alpha.Extension extension_message = 1 [json_name = "extensionMessage"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Extension, com.tcn.cloud.api.api.v0alpha.Extension.Builder, com.tcn.cloud.api.api.v0alpha.ExtensionOrBuilder> 
        getExtensionMessageFieldBuilder() {
      if (extensionMessageBuilder_ == null) {
        extensionMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Extension, com.tcn.cloud.api.api.v0alpha.Extension.Builder, com.tcn.cloud.api.api.v0alpha.ExtensionOrBuilder>(
                getExtensionMessage(),
                getParentForChildren(),
                isClean());
        extensionMessage_ = null;
      }
      return extensionMessageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateExtensionReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateExtensionReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateExtensionReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateExtensionReq>() {
    @java.lang.Override
    public UpdateExtensionReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateExtensionReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateExtensionReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

