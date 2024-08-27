// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/users/v1alpha1/preferences.proto

package com.tcn.cloud.api.services.org.users.v1alpha1;

/**
 * <pre>
 * UpdateMyUserLocalePreferencesResponse is the response message for the UpdateMyUserLocalePreferences rpc.
 * </pre>
 *
 * Protobuf type {@code services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse}
 */
public final class UpdateMyUserLocalePreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse)
    UpdateMyUserLocalePreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateMyUserLocalePreferencesResponse.newBuilder() to construct.
  private UpdateMyUserLocalePreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateMyUserLocalePreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateMyUserLocalePreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse.class, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse.Builder.class);
  }

  public static final int LOCALE_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.LocalePreferences localePreferences_;
  /**
   * <pre>
   * The updated user's locale preferences.
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
   * @return Whether the localePreferences field is set.
   */
  @java.lang.Override
  public boolean hasLocalePreferences() {
    return localePreferences_ != null;
  }
  /**
   * <pre>
   * The updated user's locale preferences.
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
   * @return The localePreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.LocalePreferences getLocalePreferences() {
    return localePreferences_ == null ? com.tcn.cloud.api.api.commons.LocalePreferences.getDefaultInstance() : localePreferences_;
  }
  /**
   * <pre>
   * The updated user's locale preferences.
   * </pre>
   *
   * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder getLocalePreferencesOrBuilder() {
    return localePreferences_ == null ? com.tcn.cloud.api.api.commons.LocalePreferences.getDefaultInstance() : localePreferences_;
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
    if (localePreferences_ != null) {
      output.writeMessage(1, getLocalePreferences());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (localePreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocalePreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse other = (com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse) obj;

    if (hasLocalePreferences() != other.hasLocalePreferences()) return false;
    if (hasLocalePreferences()) {
      if (!getLocalePreferences()
          .equals(other.getLocalePreferences())) return false;
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
    if (hasLocalePreferences()) {
      hash = (37 * hash) + LOCALE_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getLocalePreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse prototype) {
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
   * UpdateMyUserLocalePreferencesResponse is the response message for the UpdateMyUserLocalePreferences rpc.
   * </pre>
   *
   * Protobuf type {@code services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse)
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse.class, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse.newBuilder()
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
      localePreferences_ = null;
      if (localePreferencesBuilder_ != null) {
        localePreferencesBuilder_.dispose();
        localePreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse build() {
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse buildPartial() {
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse result = new com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.localePreferences_ = localePreferencesBuilder_ == null
            ? localePreferences_
            : localePreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse other) {
      if (other == com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse.getDefaultInstance()) return this;
      if (other.hasLocalePreferences()) {
        mergeLocalePreferences(other.getLocalePreferences());
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
                  getLocalePreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.LocalePreferences localePreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.LocalePreferences, com.tcn.cloud.api.api.commons.LocalePreferences.Builder, com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder> localePreferencesBuilder_;
    /**
     * <pre>
     * The updated user's locale preferences.
     * </pre>
     *
     * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
     * @return Whether the localePreferences field is set.
     */
    public boolean hasLocalePreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The updated user's locale preferences.
     * </pre>
     *
     * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
     * @return The localePreferences.
     */
    public com.tcn.cloud.api.api.commons.LocalePreferences getLocalePreferences() {
      if (localePreferencesBuilder_ == null) {
        return localePreferences_ == null ? com.tcn.cloud.api.api.commons.LocalePreferences.getDefaultInstance() : localePreferences_;
      } else {
        return localePreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The updated user's locale preferences.
     * </pre>
     *
     * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
     */
    public Builder setLocalePreferences(com.tcn.cloud.api.api.commons.LocalePreferences value) {
      if (localePreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        localePreferences_ = value;
      } else {
        localePreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated user's locale preferences.
     * </pre>
     *
     * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
     */
    public Builder setLocalePreferences(
        com.tcn.cloud.api.api.commons.LocalePreferences.Builder builderForValue) {
      if (localePreferencesBuilder_ == null) {
        localePreferences_ = builderForValue.build();
      } else {
        localePreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated user's locale preferences.
     * </pre>
     *
     * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
     */
    public Builder mergeLocalePreferences(com.tcn.cloud.api.api.commons.LocalePreferences value) {
      if (localePreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          localePreferences_ != null &&
          localePreferences_ != com.tcn.cloud.api.api.commons.LocalePreferences.getDefaultInstance()) {
          getLocalePreferencesBuilder().mergeFrom(value);
        } else {
          localePreferences_ = value;
        }
      } else {
        localePreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated user's locale preferences.
     * </pre>
     *
     * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
     */
    public Builder clearLocalePreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      localePreferences_ = null;
      if (localePreferencesBuilder_ != null) {
        localePreferencesBuilder_.dispose();
        localePreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated user's locale preferences.
     * </pre>
     *
     * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.LocalePreferences.Builder getLocalePreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLocalePreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The updated user's locale preferences.
     * </pre>
     *
     * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder getLocalePreferencesOrBuilder() {
      if (localePreferencesBuilder_ != null) {
        return localePreferencesBuilder_.getMessageOrBuilder();
      } else {
        return localePreferences_ == null ?
            com.tcn.cloud.api.api.commons.LocalePreferences.getDefaultInstance() : localePreferences_;
      }
    }
    /**
     * <pre>
     * The updated user's locale preferences.
     * </pre>
     *
     * <code>.api.commons.LocalePreferences locale_preferences = 1 [json_name = "localePreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.LocalePreferences, com.tcn.cloud.api.api.commons.LocalePreferences.Builder, com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder> 
        getLocalePreferencesFieldBuilder() {
      if (localePreferencesBuilder_ == null) {
        localePreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.LocalePreferences, com.tcn.cloud.api.api.commons.LocalePreferences.Builder, com.tcn.cloud.api.api.commons.LocalePreferencesOrBuilder>(
                getLocalePreferences(),
                getParentForChildren(),
                isClean());
        localePreferences_ = null;
      }
      return localePreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse)
  private static final com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse();
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateMyUserLocalePreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateMyUserLocalePreferencesResponse>() {
    @java.lang.Override
    public UpdateMyUserLocalePreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateMyUserLocalePreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateMyUserLocalePreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

