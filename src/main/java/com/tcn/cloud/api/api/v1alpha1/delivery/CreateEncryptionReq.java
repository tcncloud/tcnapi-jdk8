// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

/**
 * Protobuf type {@code api.v1alpha1.delivery.CreateEncryptionReq}
 */
public final class CreateEncryptionReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.delivery.CreateEncryptionReq)
    CreateEncryptionReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEncryptionReq.newBuilder() to construct.
  private CreateEncryptionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEncryptionReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEncryptionReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_CreateEncryptionReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_CreateEncryptionReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq.class, com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq.Builder.class);
  }

  private int bitField0_;
  public static final int ENCRYPTION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.delivery.Encryption encryption_;
  /**
   * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
   * @return Whether the encryption field is set.
   */
  @java.lang.Override
  public boolean hasEncryption() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
   * @return The encryption.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.Encryption getEncryption() {
    return encryption_ == null ? com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.getDefaultInstance() : encryption_;
  }
  /**
   * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.EncryptionOrBuilder getEncryptionOrBuilder() {
    return encryption_ == null ? com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.getDefaultInstance() : encryption_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getEncryption());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEncryption());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq other = (com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq) obj;

    if (hasEncryption() != other.hasEncryption()) return false;
    if (hasEncryption()) {
      if (!getEncryption()
          .equals(other.getEncryption())) return false;
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
    if (hasEncryption()) {
      hash = (37 * hash) + ENCRYPTION_FIELD_NUMBER;
      hash = (53 * hash) + getEncryption().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.delivery.CreateEncryptionReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.delivery.CreateEncryptionReq)
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_CreateEncryptionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_CreateEncryptionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq.class, com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getEncryptionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      encryption_ = null;
      if (encryptionBuilder_ != null) {
        encryptionBuilder_.dispose();
        encryptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_CreateEncryptionReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq build() {
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq result = new com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.encryption_ = encryptionBuilder_ == null
            ? encryption_
            : encryptionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq.getDefaultInstance()) return this;
      if (other.hasEncryption()) {
        mergeEncryption(other.getEncryption());
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
                  getEncryptionFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.delivery.Encryption encryption_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.Encryption, com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.EncryptionOrBuilder> encryptionBuilder_;
    /**
     * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
     * @return Whether the encryption field is set.
     */
    public boolean hasEncryption() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
     * @return The encryption.
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Encryption getEncryption() {
      if (encryptionBuilder_ == null) {
        return encryption_ == null ? com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.getDefaultInstance() : encryption_;
      } else {
        return encryptionBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
     */
    public Builder setEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.Encryption value) {
      if (encryptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        encryption_ = value;
      } else {
        encryptionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
     */
    public Builder setEncryption(
        com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.Builder builderForValue) {
      if (encryptionBuilder_ == null) {
        encryption_ = builderForValue.build();
      } else {
        encryptionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
     */
    public Builder mergeEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.Encryption value) {
      if (encryptionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          encryption_ != null &&
          encryption_ != com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.getDefaultInstance()) {
          getEncryptionBuilder().mergeFrom(value);
        } else {
          encryption_ = value;
        }
      } else {
        encryptionBuilder_.mergeFrom(value);
      }
      if (encryption_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
     */
    public Builder clearEncryption() {
      bitField0_ = (bitField0_ & ~0x00000001);
      encryption_ = null;
      if (encryptionBuilder_ != null) {
        encryptionBuilder_.dispose();
        encryptionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.Builder getEncryptionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEncryptionFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.EncryptionOrBuilder getEncryptionOrBuilder() {
      if (encryptionBuilder_ != null) {
        return encryptionBuilder_.getMessageOrBuilder();
      } else {
        return encryption_ == null ?
            com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.getDefaultInstance() : encryption_;
      }
    }
    /**
     * <code>.api.v1alpha1.delivery.Encryption encryption = 1 [json_name = "encryption"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.Encryption, com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.EncryptionOrBuilder> 
        getEncryptionFieldBuilder() {
      if (encryptionBuilder_ == null) {
        encryptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.delivery.Encryption, com.tcn.cloud.api.api.v1alpha1.delivery.Encryption.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.EncryptionOrBuilder>(
                getEncryption(),
                getParentForChildren(),
                isClean());
        encryption_ = null;
      }
      return encryptionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.delivery.CreateEncryptionReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.delivery.CreateEncryptionReq)
  private static final com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEncryptionReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateEncryptionReq>() {
    @java.lang.Override
    public CreateEncryptionReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEncryptionReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEncryptionReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

