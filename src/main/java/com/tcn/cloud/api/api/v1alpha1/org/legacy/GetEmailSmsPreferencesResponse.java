// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * Response for GetEmailSmsPreferences
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse}
 */
public final class GetEmailSmsPreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse)
    GetEmailSmsPreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEmailSmsPreferencesResponse.newBuilder() to construct.
  private GetEmailSmsPreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEmailSmsPreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEmailSmsPreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetEmailSmsPreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetEmailSmsPreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse.Builder.class);
  }

  public static final int EMAIL_SMS_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences emailSmsPreferences_;
  /**
   * <pre>
   * The requested preferences.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
   * @return Whether the emailSmsPreferences field is set.
   */
  @java.lang.Override
  public boolean hasEmailSmsPreferences() {
    return emailSmsPreferences_ != null;
  }
  /**
   * <pre>
   * The requested preferences.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
   * @return The emailSmsPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences getEmailSmsPreferences() {
    return emailSmsPreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.getDefaultInstance() : emailSmsPreferences_;
  }
  /**
   * <pre>
   * The requested preferences.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferencesOrBuilder getEmailSmsPreferencesOrBuilder() {
    return emailSmsPreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.getDefaultInstance() : emailSmsPreferences_;
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
    if (emailSmsPreferences_ != null) {
      output.writeMessage(1, getEmailSmsPreferences());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (emailSmsPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEmailSmsPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse) obj;

    if (hasEmailSmsPreferences() != other.hasEmailSmsPreferences()) return false;
    if (hasEmailSmsPreferences()) {
      if (!getEmailSmsPreferences()
          .equals(other.getEmailSmsPreferences())) return false;
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
    if (hasEmailSmsPreferences()) {
      hash = (37 * hash) + EMAIL_SMS_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getEmailSmsPreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse prototype) {
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
   * Response for GetEmailSmsPreferences
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetEmailSmsPreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetEmailSmsPreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse.newBuilder()
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
      emailSmsPreferences_ = null;
      if (emailSmsPreferencesBuilder_ != null) {
        emailSmsPreferencesBuilder_.dispose();
        emailSmsPreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetEmailSmsPreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emailSmsPreferences_ = emailSmsPreferencesBuilder_ == null
            ? emailSmsPreferences_
            : emailSmsPreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse.getDefaultInstance()) return this;
      if (other.hasEmailSmsPreferences()) {
        mergeEmailSmsPreferences(other.getEmailSmsPreferences());
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
                  getEmailSmsPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences emailSmsPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferencesOrBuilder> emailSmsPreferencesBuilder_;
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
     * @return Whether the emailSmsPreferences field is set.
     */
    public boolean hasEmailSmsPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
     * @return The emailSmsPreferences.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences getEmailSmsPreferences() {
      if (emailSmsPreferencesBuilder_ == null) {
        return emailSmsPreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.getDefaultInstance() : emailSmsPreferences_;
      } else {
        return emailSmsPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
     */
    public Builder setEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences value) {
      if (emailSmsPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        emailSmsPreferences_ = value;
      } else {
        emailSmsPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
     */
    public Builder setEmailSmsPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.Builder builderForValue) {
      if (emailSmsPreferencesBuilder_ == null) {
        emailSmsPreferences_ = builderForValue.build();
      } else {
        emailSmsPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
     */
    public Builder mergeEmailSmsPreferences(com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences value) {
      if (emailSmsPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          emailSmsPreferences_ != null &&
          emailSmsPreferences_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.getDefaultInstance()) {
          getEmailSmsPreferencesBuilder().mergeFrom(value);
        } else {
          emailSmsPreferences_ = value;
        }
      } else {
        emailSmsPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
     */
    public Builder clearEmailSmsPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      emailSmsPreferences_ = null;
      if (emailSmsPreferencesBuilder_ != null) {
        emailSmsPreferencesBuilder_.dispose();
        emailSmsPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.Builder getEmailSmsPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEmailSmsPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferencesOrBuilder getEmailSmsPreferencesOrBuilder() {
      if (emailSmsPreferencesBuilder_ != null) {
        return emailSmsPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return emailSmsPreferences_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.getDefaultInstance() : emailSmsPreferences_;
      }
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.EmailSmsPreferences email_sms_preferences = 1 [json_name = "emailSmsPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferencesOrBuilder> 
        getEmailSmsPreferencesFieldBuilder() {
      if (emailSmsPreferencesBuilder_ == null) {
        emailSmsPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.EmailSmsPreferencesOrBuilder>(
                getEmailSmsPreferences(),
                getParentForChildren(),
                isClean());
        emailSmsPreferences_ = null;
      }
      return emailSmsPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEmailSmsPreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEmailSmsPreferencesResponse>() {
    @java.lang.Override
    public GetEmailSmsPreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetEmailSmsPreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEmailSmsPreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetEmailSmsPreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

