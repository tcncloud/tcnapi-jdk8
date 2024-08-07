// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/translations/v1alpha1/entities.proto

package com.tcn.cloud.api.services.translations.v1alpha1;

/**
 * Protobuf type {@code services.translations.v1alpha1.ListLanguagesResponse}
 */
public final class ListLanguagesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.translations.v1alpha1.ListLanguagesResponse)
    ListLanguagesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListLanguagesResponse.newBuilder() to construct.
  private ListLanguagesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListLanguagesResponse() {
    languages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListLanguagesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_ListLanguagesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_ListLanguagesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse.class, com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse.Builder.class);
  }

  public static final int LANGUAGES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage> languages_;
  /**
   * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage> getLanguagesList() {
    return languages_;
  }
  /**
   * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguageOrBuilder> 
      getLanguagesOrBuilderList() {
    return languages_;
  }
  /**
   * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
   */
  @java.lang.Override
  public int getLanguagesCount() {
    return languages_.size();
  }
  /**
   * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage getLanguages(int index) {
    return languages_.get(index);
  }
  /**
   * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguageOrBuilder getLanguagesOrBuilder(
      int index) {
    return languages_.get(index);
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
    for (int i = 0; i < languages_.size(); i++) {
      output.writeMessage(1, languages_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < languages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, languages_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse other = (com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse) obj;

    if (!getLanguagesList()
        .equals(other.getLanguagesList())) return false;
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
    if (getLanguagesCount() > 0) {
      hash = (37 * hash) + LANGUAGES_FIELD_NUMBER;
      hash = (53 * hash) + getLanguagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse prototype) {
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
   * Protobuf type {@code services.translations.v1alpha1.ListLanguagesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.translations.v1alpha1.ListLanguagesResponse)
      com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_ListLanguagesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_ListLanguagesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse.class, com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse.newBuilder()
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
      if (languagesBuilder_ == null) {
        languages_ = java.util.Collections.emptyList();
      } else {
        languages_ = null;
        languagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.internal_static_services_translations_v1alpha1_ListLanguagesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse build() {
      com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse buildPartial() {
      com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse result = new com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse result) {
      if (languagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          languages_ = java.util.Collections.unmodifiableList(languages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.languages_ = languages_;
      } else {
        result.languages_ = languagesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse result) {
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
      if (other instanceof com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse) {
        return mergeFrom((com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse other) {
      if (other == com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse.getDefaultInstance()) return this;
      if (languagesBuilder_ == null) {
        if (!other.languages_.isEmpty()) {
          if (languages_.isEmpty()) {
            languages_ = other.languages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLanguagesIsMutable();
            languages_.addAll(other.languages_);
          }
          onChanged();
        }
      } else {
        if (!other.languages_.isEmpty()) {
          if (languagesBuilder_.isEmpty()) {
            languagesBuilder_.dispose();
            languagesBuilder_ = null;
            languages_ = other.languages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            languagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLanguagesFieldBuilder() : null;
          } else {
            languagesBuilder_.addAllMessages(other.languages_);
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
              com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage m =
                  input.readMessage(
                      com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.parser(),
                      extensionRegistry);
              if (languagesBuilder_ == null) {
                ensureLanguagesIsMutable();
                languages_.add(m);
              } else {
                languagesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage> languages_ =
      java.util.Collections.emptyList();
    private void ensureLanguagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        languages_ = new java.util.ArrayList<com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage>(languages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguageOrBuilder> languagesBuilder_;

    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage> getLanguagesList() {
      if (languagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(languages_);
      } else {
        return languagesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public int getLanguagesCount() {
      if (languagesBuilder_ == null) {
        return languages_.size();
      } else {
        return languagesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage getLanguages(int index) {
      if (languagesBuilder_ == null) {
        return languages_.get(index);
      } else {
        return languagesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public Builder setLanguages(
        int index, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage value) {
      if (languagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesIsMutable();
        languages_.set(index, value);
        onChanged();
      } else {
        languagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public Builder setLanguages(
        int index, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder builderForValue) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        languages_.set(index, builderForValue.build());
        onChanged();
      } else {
        languagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public Builder addLanguages(com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage value) {
      if (languagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesIsMutable();
        languages_.add(value);
        onChanged();
      } else {
        languagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public Builder addLanguages(
        int index, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage value) {
      if (languagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguagesIsMutable();
        languages_.add(index, value);
        onChanged();
      } else {
        languagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public Builder addLanguages(
        com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder builderForValue) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        languages_.add(builderForValue.build());
        onChanged();
      } else {
        languagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public Builder addLanguages(
        int index, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder builderForValue) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        languages_.add(index, builderForValue.build());
        onChanged();
      } else {
        languagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public Builder addAllLanguages(
        java.lang.Iterable<? extends com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage> values) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, languages_);
        onChanged();
      } else {
        languagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public Builder clearLanguages() {
      if (languagesBuilder_ == null) {
        languages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        languagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public Builder removeLanguages(int index) {
      if (languagesBuilder_ == null) {
        ensureLanguagesIsMutable();
        languages_.remove(index);
        onChanged();
      } else {
        languagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder getLanguagesBuilder(
        int index) {
      return getLanguagesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguageOrBuilder getLanguagesOrBuilder(
        int index) {
      if (languagesBuilder_ == null) {
        return languages_.get(index);  } else {
        return languagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguageOrBuilder> 
         getLanguagesOrBuilderList() {
      if (languagesBuilder_ != null) {
        return languagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(languages_);
      }
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder addLanguagesBuilder() {
      return getLanguagesFieldBuilder().addBuilder(
          com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.getDefaultInstance());
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder addLanguagesBuilder(
        int index) {
      return getLanguagesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.getDefaultInstance());
    }
    /**
     * <code>repeated .services.translations.v1alpha1.LocalizationLanguage languages = 1 [json_name = "languages"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder> 
         getLanguagesBuilderList() {
      return getLanguagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguageOrBuilder> 
        getLanguagesFieldBuilder() {
      if (languagesBuilder_ == null) {
        languagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguage.Builder, com.tcn.cloud.api.services.translations.v1alpha1.LocalizationLanguageOrBuilder>(
                languages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        languages_ = null;
      }
      return languagesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.translations.v1alpha1.ListLanguagesResponse)
  }

  // @@protoc_insertion_point(class_scope:services.translations.v1alpha1.ListLanguagesResponse)
  private static final com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse();
  }

  public static com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLanguagesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLanguagesResponse>() {
    @java.lang.Override
    public ListLanguagesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListLanguagesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLanguagesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

