// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/users/v1alpha1/preferences.proto

package com.tcn.cloud.api.services.org.users.v1alpha1;

/**
 * <pre>
 * UpdateMyUserLocalePreferencesOverrideResponse is the response message for the UpdateMyUserLocalePreferencesOverride rpc.
 * </pre>
 *
 * Protobuf type {@code services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse}
 */
public final class UpdateMyUserLocalePreferencesOverrideResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse)
    UpdateMyUserLocalePreferencesOverrideResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateMyUserLocalePreferencesOverrideResponse.newBuilder() to construct.
  private UpdateMyUserLocalePreferencesOverrideResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateMyUserLocalePreferencesOverrideResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateMyUserLocalePreferencesOverrideResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesOverrideResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesOverrideResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse.class, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse.Builder.class);
  }

  public static final int LOCALE_PREFERENCES_OVERRIDE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride localePreferencesOverride_;
  /**
   * <pre>
   * The updated user's locale preferences override.
   * </pre>
   *
   * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
   * @return Whether the localePreferencesOverride field is set.
   */
  @java.lang.Override
  public boolean hasLocalePreferencesOverride() {
    return localePreferencesOverride_ != null;
  }
  /**
   * <pre>
   * The updated user's locale preferences override.
   * </pre>
   *
   * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
   * @return The localePreferencesOverride.
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride getLocalePreferencesOverride() {
    return localePreferencesOverride_ == null ? com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.getDefaultInstance() : localePreferencesOverride_;
  }
  /**
   * <pre>
   * The updated user's locale preferences override.
   * </pre>
   *
   * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverrideOrBuilder getLocalePreferencesOverrideOrBuilder() {
    return localePreferencesOverride_ == null ? com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.getDefaultInstance() : localePreferencesOverride_;
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
    if (localePreferencesOverride_ != null) {
      output.writeMessage(1, getLocalePreferencesOverride());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (localePreferencesOverride_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocalePreferencesOverride());
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
    if (!(obj instanceof com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse other = (com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse) obj;

    if (hasLocalePreferencesOverride() != other.hasLocalePreferencesOverride()) return false;
    if (hasLocalePreferencesOverride()) {
      if (!getLocalePreferencesOverride()
          .equals(other.getLocalePreferencesOverride())) return false;
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
    if (hasLocalePreferencesOverride()) {
      hash = (37 * hash) + LOCALE_PREFERENCES_OVERRIDE_FIELD_NUMBER;
      hash = (53 * hash) + getLocalePreferencesOverride().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse prototype) {
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
   * UpdateMyUserLocalePreferencesOverrideResponse is the response message for the UpdateMyUserLocalePreferencesOverride rpc.
   * </pre>
   *
   * Protobuf type {@code services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse)
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesOverrideResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesOverrideResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse.class, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse.newBuilder()
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
      localePreferencesOverride_ = null;
      if (localePreferencesOverrideBuilder_ != null) {
        localePreferencesOverrideBuilder_.dispose();
        localePreferencesOverrideBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_UpdateMyUserLocalePreferencesOverrideResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse build() {
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse buildPartial() {
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse result = new com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.localePreferencesOverride_ = localePreferencesOverrideBuilder_ == null
            ? localePreferencesOverride_
            : localePreferencesOverrideBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse) {
        return mergeFrom((com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse other) {
      if (other == com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse.getDefaultInstance()) return this;
      if (other.hasLocalePreferencesOverride()) {
        mergeLocalePreferencesOverride(other.getLocalePreferencesOverride());
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
                  getLocalePreferencesOverrideFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride localePreferencesOverride_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride, com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.Builder, com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverrideOrBuilder> localePreferencesOverrideBuilder_;
    /**
     * <pre>
     * The updated user's locale preferences override.
     * </pre>
     *
     * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
     * @return Whether the localePreferencesOverride field is set.
     */
    public boolean hasLocalePreferencesOverride() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The updated user's locale preferences override.
     * </pre>
     *
     * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
     * @return The localePreferencesOverride.
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride getLocalePreferencesOverride() {
      if (localePreferencesOverrideBuilder_ == null) {
        return localePreferencesOverride_ == null ? com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.getDefaultInstance() : localePreferencesOverride_;
      } else {
        return localePreferencesOverrideBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The updated user's locale preferences override.
     * </pre>
     *
     * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
     */
    public Builder setLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride value) {
      if (localePreferencesOverrideBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        localePreferencesOverride_ = value;
      } else {
        localePreferencesOverrideBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated user's locale preferences override.
     * </pre>
     *
     * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
     */
    public Builder setLocalePreferencesOverride(
        com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.Builder builderForValue) {
      if (localePreferencesOverrideBuilder_ == null) {
        localePreferencesOverride_ = builderForValue.build();
      } else {
        localePreferencesOverrideBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated user's locale preferences override.
     * </pre>
     *
     * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
     */
    public Builder mergeLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride value) {
      if (localePreferencesOverrideBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          localePreferencesOverride_ != null &&
          localePreferencesOverride_ != com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.getDefaultInstance()) {
          getLocalePreferencesOverrideBuilder().mergeFrom(value);
        } else {
          localePreferencesOverride_ = value;
        }
      } else {
        localePreferencesOverrideBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated user's locale preferences override.
     * </pre>
     *
     * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
     */
    public Builder clearLocalePreferencesOverride() {
      bitField0_ = (bitField0_ & ~0x00000001);
      localePreferencesOverride_ = null;
      if (localePreferencesOverrideBuilder_ != null) {
        localePreferencesOverrideBuilder_.dispose();
        localePreferencesOverrideBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The updated user's locale preferences override.
     * </pre>
     *
     * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.Builder getLocalePreferencesOverrideBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLocalePreferencesOverrideFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The updated user's locale preferences override.
     * </pre>
     *
     * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverrideOrBuilder getLocalePreferencesOverrideOrBuilder() {
      if (localePreferencesOverrideBuilder_ != null) {
        return localePreferencesOverrideBuilder_.getMessageOrBuilder();
      } else {
        return localePreferencesOverride_ == null ?
            com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.getDefaultInstance() : localePreferencesOverride_;
      }
    }
    /**
     * <pre>
     * The updated user's locale preferences override.
     * </pre>
     *
     * <code>.services.org.users.v1alpha1.UserLocalePreferencesOverride locale_preferences_override = 1 [json_name = "localePreferencesOverride"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride, com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.Builder, com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverrideOrBuilder> 
        getLocalePreferencesOverrideFieldBuilder() {
      if (localePreferencesOverrideBuilder_ == null) {
        localePreferencesOverrideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride, com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverride.Builder, com.tcn.cloud.api.services.org.users.v1alpha1.UserLocalePreferencesOverrideOrBuilder>(
                getLocalePreferencesOverride(),
                getParentForChildren(),
                isClean());
        localePreferencesOverride_ = null;
      }
      return localePreferencesOverrideBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse)
  }

  // @@protoc_insertion_point(class_scope:services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse)
  private static final com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse();
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateMyUserLocalePreferencesOverrideResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateMyUserLocalePreferencesOverrideResponse>() {
    @java.lang.Override
    public UpdateMyUserLocalePreferencesOverrideResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateMyUserLocalePreferencesOverrideResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateMyUserLocalePreferencesOverrideResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

