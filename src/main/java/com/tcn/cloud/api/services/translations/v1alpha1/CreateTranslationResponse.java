// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/translations/v1alpha1/entities.proto

package com.tcn.cloud.api.services.translations.v1alpha1;

/**
 * <pre>
 * CreateTranslationResponse is the response message for the CreateTranslation method.
 * </pre>
 *
 * Protobuf type {@code services.translations.v1alpha1.CreateTranslationResponse}
 */
public final class CreateTranslationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.translations.v1alpha1.CreateTranslationResponse)
    CreateTranslationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTranslationResponse.newBuilder() to construct.
  private CreateTranslationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTranslationResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTranslationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_CreateTranslationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_CreateTranslationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse.class, com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse.Builder.class);
  }

  public static final int TRANSLATION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.services.translations.v1alpha1.Translation translation_;
  /**
   * <pre>
   * The created translation.
   * </pre>
   *
   * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
   * @return Whether the translation field is set.
   */
  @java.lang.Override
  public boolean hasTranslation() {
    return translation_ != null;
  }
  /**
   * <pre>
   * The created translation.
   * </pre>
   *
   * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
   * @return The translation.
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.translations.v1alpha1.Translation getTranslation() {
    return translation_ == null ? com.tcn.cloud.api.services.translations.v1alpha1.Translation.getDefaultInstance() : translation_;
  }
  /**
   * <pre>
   * The created translation.
   * </pre>
   *
   * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.translations.v1alpha1.TranslationOrBuilder getTranslationOrBuilder() {
    return translation_ == null ? com.tcn.cloud.api.services.translations.v1alpha1.Translation.getDefaultInstance() : translation_;
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
    if (translation_ != null) {
      output.writeMessage(1, getTranslation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (translation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTranslation());
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
    if (!(obj instanceof com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse other = (com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse) obj;

    if (hasTranslation() != other.hasTranslation()) return false;
    if (hasTranslation()) {
      if (!getTranslation()
          .equals(other.getTranslation())) return false;
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
    if (hasTranslation()) {
      hash = (37 * hash) + TRANSLATION_FIELD_NUMBER;
      hash = (53 * hash) + getTranslation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse prototype) {
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
   * CreateTranslationResponse is the response message for the CreateTranslation method.
   * </pre>
   *
   * Protobuf type {@code services.translations.v1alpha1.CreateTranslationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.translations.v1alpha1.CreateTranslationResponse)
      com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_CreateTranslationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_CreateTranslationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse.class, com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse.newBuilder()
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
      translation_ = null;
      if (translationBuilder_ != null) {
        translationBuilder_.dispose();
        translationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_CreateTranslationResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse build() {
      com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse buildPartial() {
      com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse result = new com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.translation_ = translationBuilder_ == null
            ? translation_
            : translationBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse) {
        return mergeFrom((com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse other) {
      if (other == com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse.getDefaultInstance()) return this;
      if (other.hasTranslation()) {
        mergeTranslation(other.getTranslation());
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
                  getTranslationFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.services.translations.v1alpha1.Translation translation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.translations.v1alpha1.Translation, com.tcn.cloud.api.services.translations.v1alpha1.Translation.Builder, com.tcn.cloud.api.services.translations.v1alpha1.TranslationOrBuilder> translationBuilder_;
    /**
     * <pre>
     * The created translation.
     * </pre>
     *
     * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
     * @return Whether the translation field is set.
     */
    public boolean hasTranslation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The created translation.
     * </pre>
     *
     * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
     * @return The translation.
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.Translation getTranslation() {
      if (translationBuilder_ == null) {
        return translation_ == null ? com.tcn.cloud.api.services.translations.v1alpha1.Translation.getDefaultInstance() : translation_;
      } else {
        return translationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The created translation.
     * </pre>
     *
     * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
     */
    public Builder setTranslation(com.tcn.cloud.api.services.translations.v1alpha1.Translation value) {
      if (translationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        translation_ = value;
      } else {
        translationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The created translation.
     * </pre>
     *
     * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
     */
    public Builder setTranslation(
        com.tcn.cloud.api.services.translations.v1alpha1.Translation.Builder builderForValue) {
      if (translationBuilder_ == null) {
        translation_ = builderForValue.build();
      } else {
        translationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The created translation.
     * </pre>
     *
     * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
     */
    public Builder mergeTranslation(com.tcn.cloud.api.services.translations.v1alpha1.Translation value) {
      if (translationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          translation_ != null &&
          translation_ != com.tcn.cloud.api.services.translations.v1alpha1.Translation.getDefaultInstance()) {
          getTranslationBuilder().mergeFrom(value);
        } else {
          translation_ = value;
        }
      } else {
        translationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The created translation.
     * </pre>
     *
     * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
     */
    public Builder clearTranslation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      translation_ = null;
      if (translationBuilder_ != null) {
        translationBuilder_.dispose();
        translationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The created translation.
     * </pre>
     *
     * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.Translation.Builder getTranslationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTranslationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The created translation.
     * </pre>
     *
     * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.TranslationOrBuilder getTranslationOrBuilder() {
      if (translationBuilder_ != null) {
        return translationBuilder_.getMessageOrBuilder();
      } else {
        return translation_ == null ?
            com.tcn.cloud.api.services.translations.v1alpha1.Translation.getDefaultInstance() : translation_;
      }
    }
    /**
     * <pre>
     * The created translation.
     * </pre>
     *
     * <code>.services.translations.v1alpha1.Translation translation = 1 [json_name = "translation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.translations.v1alpha1.Translation, com.tcn.cloud.api.services.translations.v1alpha1.Translation.Builder, com.tcn.cloud.api.services.translations.v1alpha1.TranslationOrBuilder> 
        getTranslationFieldBuilder() {
      if (translationBuilder_ == null) {
        translationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.services.translations.v1alpha1.Translation, com.tcn.cloud.api.services.translations.v1alpha1.Translation.Builder, com.tcn.cloud.api.services.translations.v1alpha1.TranslationOrBuilder>(
                getTranslation(),
                getParentForChildren(),
                isClean());
        translation_ = null;
      }
      return translationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.translations.v1alpha1.CreateTranslationResponse)
  }

  // @@protoc_insertion_point(class_scope:services.translations.v1alpha1.CreateTranslationResponse)
  private static final com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse();
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTranslationResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateTranslationResponse>() {
    @java.lang.Override
    public CreateTranslationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTranslationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTranslationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

