// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/translations/v1alpha1/entities.proto

package com.tcn.cloud.api.services.translations.v1alpha1;

/**
 * <pre>
 * GetSystemMessageResponse is the response message for the GetSystemMessage method.
 * </pre>
 *
 * Protobuf type {@code services.translations.v1alpha1.GetSystemMessageResponse}
 */
public final class GetSystemMessageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.translations.v1alpha1.GetSystemMessageResponse)
    GetSystemMessageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSystemMessageResponse.newBuilder() to construct.
  private GetSystemMessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSystemMessageResponse() {
    systemMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSystemMessageResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_GetSystemMessageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_GetSystemMessageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse.class, com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse.Builder.class);
  }

  public static final int SYSTEM_MESSAGE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object systemMessage_ = "";
  /**
   * <pre>
   * The system message.
   * </pre>
   *
   * <code>string system_message = 1 [json_name = "systemMessage"];</code>
   * @return The systemMessage.
   */
  @java.lang.Override
  public java.lang.String getSystemMessage() {
    java.lang.Object ref = systemMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      systemMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The system message.
   * </pre>
   *
   * <code>string system_message = 1 [json_name = "systemMessage"];</code>
   * @return The bytes for systemMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSystemMessageBytes() {
    java.lang.Object ref = systemMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      systemMessage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(systemMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, systemMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(systemMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, systemMessage_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse other = (com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse) obj;

    if (!getSystemMessage()
        .equals(other.getSystemMessage())) return false;
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
    hash = (37 * hash) + SYSTEM_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getSystemMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse prototype) {
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
   * GetSystemMessageResponse is the response message for the GetSystemMessage method.
   * </pre>
   *
   * Protobuf type {@code services.translations.v1alpha1.GetSystemMessageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.translations.v1alpha1.GetSystemMessageResponse)
      com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_GetSystemMessageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_GetSystemMessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse.class, com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse.newBuilder()
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
      systemMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_GetSystemMessageResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse build() {
      com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse buildPartial() {
      com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse result = new com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.systemMessage_ = systemMessage_;
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
      if (other instanceof com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse) {
        return mergeFrom((com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse other) {
      if (other == com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse.getDefaultInstance()) return this;
      if (!other.getSystemMessage().isEmpty()) {
        systemMessage_ = other.systemMessage_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              systemMessage_ = input.readStringRequireUtf8();
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

    private java.lang.Object systemMessage_ = "";
    /**
     * <pre>
     * The system message.
     * </pre>
     *
     * <code>string system_message = 1 [json_name = "systemMessage"];</code>
     * @return The systemMessage.
     */
    public java.lang.String getSystemMessage() {
      java.lang.Object ref = systemMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        systemMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The system message.
     * </pre>
     *
     * <code>string system_message = 1 [json_name = "systemMessage"];</code>
     * @return The bytes for systemMessage.
     */
    public com.google.protobuf.ByteString
        getSystemMessageBytes() {
      java.lang.Object ref = systemMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        systemMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The system message.
     * </pre>
     *
     * <code>string system_message = 1 [json_name = "systemMessage"];</code>
     * @param value The systemMessage to set.
     * @return This builder for chaining.
     */
    public Builder setSystemMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      systemMessage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The system message.
     * </pre>
     *
     * <code>string system_message = 1 [json_name = "systemMessage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSystemMessage() {
      systemMessage_ = getDefaultInstance().getSystemMessage();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The system message.
     * </pre>
     *
     * <code>string system_message = 1 [json_name = "systemMessage"];</code>
     * @param value The bytes for systemMessage to set.
     * @return This builder for chaining.
     */
    public Builder setSystemMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      systemMessage_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:services.translations.v1alpha1.GetSystemMessageResponse)
  }

  // @@protoc_insertion_point(class_scope:services.translations.v1alpha1.GetSystemMessageResponse)
  private static final com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse();
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSystemMessageResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSystemMessageResponse>() {
    @java.lang.Override
    public GetSystemMessageResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSystemMessageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSystemMessageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

