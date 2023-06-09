// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response for GetPhonePreferences
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.GetPhonePreferencesResponse}
 */
public final class GetPhonePreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetPhonePreferencesResponse)
    GetPhonePreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPhonePreferencesResponse.newBuilder() to construct.
  private GetPhonePreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPhonePreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPhonePreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetPhonePreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetPhonePreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse.Builder.class);
  }

  public static final int PHONE_PREFERENCES_FIELD_NUMBER = 11;
  private com.tcn.cloud.api.api.v0alpha.PhonePreferences phonePreferences_;
  /**
   * <pre>
   * Phone Preferences
   * </pre>
   *
   * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
   * @return Whether the phonePreferences field is set.
   */
  @java.lang.Override
  public boolean hasPhonePreferences() {
    return phonePreferences_ != null;
  }
  /**
   * <pre>
   * Phone Preferences
   * </pre>
   *
   * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
   * @return The phonePreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PhonePreferences getPhonePreferences() {
    return phonePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.PhonePreferences.getDefaultInstance() : phonePreferences_;
  }
  /**
   * <pre>
   * Phone Preferences
   * </pre>
   *
   * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PhonePreferencesOrBuilder getPhonePreferencesOrBuilder() {
    return phonePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.PhonePreferences.getDefaultInstance() : phonePreferences_;
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
    if (phonePreferences_ != null) {
      output.writeMessage(11, getPhonePreferences());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (phonePreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, getPhonePreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse other = (com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse) obj;

    if (hasPhonePreferences() != other.hasPhonePreferences()) return false;
    if (hasPhonePreferences()) {
      if (!getPhonePreferences()
          .equals(other.getPhonePreferences())) return false;
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
    if (hasPhonePreferences()) {
      hash = (37 * hash) + PHONE_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getPhonePreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse prototype) {
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
   * Response for GetPhonePreferences
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.GetPhonePreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetPhonePreferencesResponse)
      com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetPhonePreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetPhonePreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse.newBuilder()
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
      phonePreferences_ = null;
      if (phonePreferencesBuilder_ != null) {
        phonePreferencesBuilder_.dispose();
        phonePreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetPhonePreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse result = new com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.phonePreferences_ = phonePreferencesBuilder_ == null
            ? phonePreferences_
            : phonePreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse.getDefaultInstance()) return this;
      if (other.hasPhonePreferences()) {
        mergePhonePreferences(other.getPhonePreferences());
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
            case 90: {
              input.readMessage(
                  getPhonePreferencesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 90
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

    private com.tcn.cloud.api.api.v0alpha.PhonePreferences phonePreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PhonePreferences, com.tcn.cloud.api.api.v0alpha.PhonePreferences.Builder, com.tcn.cloud.api.api.v0alpha.PhonePreferencesOrBuilder> phonePreferencesBuilder_;
    /**
     * <pre>
     * Phone Preferences
     * </pre>
     *
     * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
     * @return Whether the phonePreferences field is set.
     */
    public boolean hasPhonePreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Phone Preferences
     * </pre>
     *
     * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
     * @return The phonePreferences.
     */
    public com.tcn.cloud.api.api.v0alpha.PhonePreferences getPhonePreferences() {
      if (phonePreferencesBuilder_ == null) {
        return phonePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.PhonePreferences.getDefaultInstance() : phonePreferences_;
      } else {
        return phonePreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Phone Preferences
     * </pre>
     *
     * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
     */
    public Builder setPhonePreferences(com.tcn.cloud.api.api.v0alpha.PhonePreferences value) {
      if (phonePreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        phonePreferences_ = value;
      } else {
        phonePreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Phone Preferences
     * </pre>
     *
     * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
     */
    public Builder setPhonePreferences(
        com.tcn.cloud.api.api.v0alpha.PhonePreferences.Builder builderForValue) {
      if (phonePreferencesBuilder_ == null) {
        phonePreferences_ = builderForValue.build();
      } else {
        phonePreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Phone Preferences
     * </pre>
     *
     * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
     */
    public Builder mergePhonePreferences(com.tcn.cloud.api.api.v0alpha.PhonePreferences value) {
      if (phonePreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          phonePreferences_ != null &&
          phonePreferences_ != com.tcn.cloud.api.api.v0alpha.PhonePreferences.getDefaultInstance()) {
          getPhonePreferencesBuilder().mergeFrom(value);
        } else {
          phonePreferences_ = value;
        }
      } else {
        phonePreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Phone Preferences
     * </pre>
     *
     * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
     */
    public Builder clearPhonePreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      phonePreferences_ = null;
      if (phonePreferencesBuilder_ != null) {
        phonePreferencesBuilder_.dispose();
        phonePreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Phone Preferences
     * </pre>
     *
     * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhonePreferences.Builder getPhonePreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPhonePreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Phone Preferences
     * </pre>
     *
     * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhonePreferencesOrBuilder getPhonePreferencesOrBuilder() {
      if (phonePreferencesBuilder_ != null) {
        return phonePreferencesBuilder_.getMessageOrBuilder();
      } else {
        return phonePreferences_ == null ?
            com.tcn.cloud.api.api.v0alpha.PhonePreferences.getDefaultInstance() : phonePreferences_;
      }
    }
    /**
     * <pre>
     * Phone Preferences
     * </pre>
     *
     * <code>.api.v0alpha.PhonePreferences phone_preferences = 11 [json_name = "phonePreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PhonePreferences, com.tcn.cloud.api.api.v0alpha.PhonePreferences.Builder, com.tcn.cloud.api.api.v0alpha.PhonePreferencesOrBuilder> 
        getPhonePreferencesFieldBuilder() {
      if (phonePreferencesBuilder_ == null) {
        phonePreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.PhonePreferences, com.tcn.cloud.api.api.v0alpha.PhonePreferences.Builder, com.tcn.cloud.api.api.v0alpha.PhonePreferencesOrBuilder>(
                getPhonePreferences(),
                getParentForChildren(),
                isClean());
        phonePreferences_ = null;
      }
      return phonePreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetPhonePreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetPhonePreferencesResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPhonePreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPhonePreferencesResponse>() {
    @java.lang.Override
    public GetPhonePreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPhonePreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPhonePreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetPhonePreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

